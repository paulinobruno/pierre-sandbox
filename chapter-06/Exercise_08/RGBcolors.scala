/*8. Write an enumeration describing the eight corners of the RGB color cube. As
IDs, use the color values (for example, 0xff0000 for Red ).*/

package Exercise_08

object RGBcolors extends Enumeration {

  type RGBcolors = Value
  val Black = Value(0x000000,"Black")
  val Magenta = Value(0xff00ff, "Magenta")
  val White = Value(0xffffff,"White")
  val Red = Value(0xff0000,"Red")
  val Green = Value(0x00ff00,"Green")
  val Yellow = Value(0xffff00, "Yellow")
  val Cyan = Value(0x00ffff, "Cyan")
  val Blue = Value(0x0000ff, "Blue")


}
