package Interrapidisimo.Pos.EnviosEnLinea.Steps;


import Interrapidisimo.Pos.EnviosEnLinea.Objects.LoginObjects;
import java.awt.AWTException;
import java.io.IOException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import java.lang.InterruptedException;

public class LoginSteps {
		
	
	
	public static void AbrirAplicacion() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		LoginObjects.AbrirAplicacion();
	}
	

	public static void IngresoModulo() {
		// TODO Auto-generated method stub
		LoginObjects.IngresoModulo();
	}
	

	public static void ValidarUsuario() {
		// TODO Auto-generated method stub
		LoginObjects.ValidarUsuario();
	}
	
	
	public static void ValidarEnviosenLinea() {
		// TODO Auto-generated method stub
		LoginObjects.ValidarEnviosenLinea();
	}

	public static void SeleccionarEnvio() {
		// TODO Auto-generated method stub
		LoginObjects.SeleccionarEnvio();
	}
	
	
	public static void AdmitirEnvio() {
		// TODO Auto-generated method stub
		LoginObjects.AdmitirEnvio();
	}

	public static void ValidarAdmision() {
		// TODO Auto-generated method stub
		LoginObjects.ValidarAdmision();
	}
	
	public static void ValidacionAdicionalOK() {
		// TODO Auto-generated method stub
		LoginObjects.ValidacionAdicionalOK();
	}
	
	
	

}
