package Proiect.MVC;
import java.math.BigInteger;

class CalcModel {

    private static final String INITIAL_VALUE = "1";
    private BigInteger m_total;

    public CalcModel() {
        reset();
    }

    public void reset() {
        m_total = new BigInteger(INITIAL_VALUE);
    }

    public void multiplyBy(String operand) {
        m_total = m_total.multiply(new BigInteger(operand));
    }

    public void setValue(String value) {
        m_total = new BigInteger(value);
    }

    public String getValue() {
        return m_total.toString();
    }
}
