
/* 2. The preceding problem wasn’t very object-oriented. Provide a general super-
class UnitConversion and define objects InchesToCentimeters , GallonsToLiters , and
MilesToKilometers that extend it.*/

package Exercise_02

class UnitConversion (val conversionFactor: Double){
  private def convert(value: Double) = value * conversionFactor
  def apply (value: Double) = convert(value)

}

object InchesToCentimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.78)
object MilesToKilometers extends UnitConversion(1.60)