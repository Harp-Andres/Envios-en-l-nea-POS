package Interrapidisimo.Pos.EnviosEnLinea.Definitions;

import Interrapidisimo.Pos.EnviosEnLinea.Steps.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class LoginDefinitions {


	
	
	@Given("^Ingrear a la aplicacion Pos WPF$")
	public void ingrear_a_la_aplicacion_Pos_WPF() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.AbrirAplicacion();
	}

	@Given("^Ingresar al modulo de Envios En Linea WPF$")
	public void ingresar_al_modulo_de_Envios_En_Linea_WPF() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.IngresoModulo();
	}

	@When("^al Ingresar al  modulo de Envios En Linea WPF Buscar Usuario$")
	public void al_Ingresar_al_modulo_de_Envios_En_Linea_WPF_Buscar_Usuario() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new PendingException();
		LoginSteps.ValidarUsuario();
	}

	@When("^Validar Envios en linea del usuario$")
	public void validar_Envios_en_linea_del_usuario() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.ValidarEnviosenLinea();
	}

	@When("^Seleccionar envio En linea$")
	public void seleccionar_envio_En_linea() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.SeleccionarEnvio();
	}

	@When("^Admitir Envio en Linea en Ruta Feliz$")
	public void admitir_Envio_en_Linea_en_Ruta_Feliz() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.AdmitirEnvio();
	}

	@Then("^Generar admision y afectacion a caja$")
	public void generar_admision_y_afectacion_a_caja() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.ValidarAdmision();
	}

	@Then("^Ultimo Escenario de validacion OK$")
	public void ultimo_Escenario_de_validacion_OK() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginSteps.ValidacionAdicionalOK();
	}
	
	
	
	
	
}
