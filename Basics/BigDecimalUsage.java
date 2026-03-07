import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalUsage
{
public static void main(String []args)
{
MathContext mathContext = new MathContext(5);
BigDecimal x = new BigDecimal("3.1451578924525", mathContext);
int newscale = 3;
x = x.setScale(newscale, mathContext.getRoundingMode());
System.out.println(x);
}
}
