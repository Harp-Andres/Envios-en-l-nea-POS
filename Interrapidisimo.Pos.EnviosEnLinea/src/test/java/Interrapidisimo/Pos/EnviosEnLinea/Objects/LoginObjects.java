package Interrapidisimo.Pos.EnviosEnLinea.Objects;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.WiniumDriver;

import Interrapidisimo.Pos.EnviosEnLinea.Base;





public class LoginObjects extends Base {
	
	
static Properties loadProperty = new Properties();
	
	//Parametrizacion de localizadores, se declara las variables

	static By aplicacion = By.id("txtAplicacion");
	static By usuario = By.id("txtNombreUsuario");
	static By contraseña = By.id("txtPassword") ;
	static By btentrar = By.id("btnLogin");
	static By ventana = By.id("btningreso");
	static By sucursal= By.name("1295");
	static By btingresar = By.id("btnSalir");
	static By btnIngreso = By.id("btnIngreso");

	//comentario prueba
	
	
	//Constructor de la clase Base

	public LoginObjects(WiniumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public static void AbrirAplicacion() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		LoginObjects winDriver = new LoginObjects(driver);
		driver = winDriver.winiumDriverConnection();
		System.out.println("Abrio la app");
		
		Thread.sleep(2000);
		
		loadProperty.load(new FileReader("./params.properties"));

		if (isDisplayed(aplicacion)) {
			System.out.println("Encontre la pantalla principal de ");
			type(loadProperty.getProperty("user"), usuario);
			type(loadProperty.getProperty("password"), contraseña);
			click(btentrar);
			Thread.sleep(1000);			
			click(sucursal);
			Thread.sleep(1000);			
			click(btingresar);
			System.out.println("Dio Click en entrar");
		} else {
			System.out.println("Error en la aplicación");
			closeDriver();
		}
		System.out.println("Debe entrar en Validar pantalla");
		
		if (isDisplayed(btnIngreso)) {
			System.out.println("Ingreso éxitoso");
			click(btnIngreso);
	
			
		} else {System.out.println("Ingreso NO éxitoso");
		closeDriver();
		}

		
	}

		
		
	

	public static void IngresoModulo() {
		// TODO Auto-generated method stub
		
	}

	public static void ValidarUsuario() {
		// TODO Auto-generated method stub
		
	}

	public static void ValidarEnviosenLinea() {
		// TODO Auto-generated method stub
		
	}

	public static void SeleccionarEnvio() {
		// TODO Auto-generated method stub
		
	}

	public static void AdmitirEnvio() {
		// TODO Auto-generated method stub
		
	}

	public static void ValidarAdmision() {
		// TODO Auto-generated method stub
		
	}

	public static void ValidacionAdicionalOK() {
		// TODO Auto-generated method stub
		
	}

}
