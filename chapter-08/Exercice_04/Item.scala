/**
Define an abstract class Item with methods price and description . A SimpleItem is
an item whose price and description are specified in the constructor. Take
advantage of the fact that a val can override a def . A Bundle is an item that
contains other items. Its price is the sum of the prices in the bundle. Also
provide a mechanism for adding items to the bundle and a suitable description
method.
  */

package Exercice_04

import scala.collection.mutable.ListBuffer

abstract class Item {
  def price : Int

  def description: String
}

class SimpleItem(override val price: Int, override val description: String) extends Item{}

class Bundle  extends Item{

  private val items = new ListBuffer[Item]

  def addItem(item: Item): Bundle = {
    items += item
    this
  }

  override def price = items.foldLeft(0)((sum,item)=> sum + item.price )

  override def description = items.map(_.description).mkString("\n\n")
}


