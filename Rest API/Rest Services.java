package pkg;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import pkg.Product;
@Path("/json/service")
public class RestServices {
	@GET
	@Path("/get")
	@Produces("/Application/json")
	public Product getApplication() {
		Product Pr = new Product();
		Pr.setName("Ipod");
		Pr.setId(1);
		return Pr;
	}
}
