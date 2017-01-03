package ph.maxramos.metro.soap.calculator;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class TransportCalculator {

	public int add(@WebParam(name="addend1") int addend1, @WebParam(name="addend2") int addend2) {
		return addend1 + addend2;
	}

}
