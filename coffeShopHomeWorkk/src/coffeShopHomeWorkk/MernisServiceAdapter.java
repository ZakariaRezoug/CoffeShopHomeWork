package coffeShopHomeWorkk;
import java.rmi.RemoteException;


import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy clientKpsPublicSoapProxy = new KPSPublicSoapProxy();

		try {
			return clientKpsPublicSoapProxy.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),
					customer.getDateOfBirth());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return true;
	}

}
