
package ph.maxramos.metro.soap.calculator.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "add", namespace = "http://calculator.soap.metro.maxramos.ph/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", namespace = "http://calculator.soap.metro.maxramos.ph/", propOrder = {
    "addend1",
    "addend2"
})
public class Add {

    @XmlElement(name = "addend1", namespace = "")
    private int addend1;
    @XmlElement(name = "addend2", namespace = "")
    private int addend2;

    /**
     * 
     * @return
     *     returns int
     */
    public int getAddend1() {
        return this.addend1;
    }

    /**
     * 
     * @param addend1
     *     the value for the addend1 property
     */
    public void setAddend1(int addend1) {
        this.addend1 = addend1;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getAddend2() {
        return this.addend2;
    }

    /**
     * 
     * @param addend2
     *     the value for the addend2 property
     */
    public void setAddend2(int addend2) {
        this.addend2 = addend2;
    }

}
