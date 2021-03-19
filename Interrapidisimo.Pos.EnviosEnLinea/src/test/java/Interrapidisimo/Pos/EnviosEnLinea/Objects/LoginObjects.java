package Interrapidisimo.Pos.EnviosEnLinea.Objects;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.WiniumDriver;



import Interrapidisimo.Pos.EnviosEnLinea.Base;


public class LoginObjects extends Base {
	
	
static Properties loadProperty = new Properties();
	
	//Parametrizacion de localizadores, se declara las variables

	static By aplicacion = By.name("POS INTERRAPIDISIMO");
	static By usuario = By.id("txtNombreUsuario");
	static By contraseña = By.id("txtPassword") ;
	static By btentrar = By.id("btnLogin");
	static By menuprincipal = By.id("MenuView");
	//static By ventana = By.id("btningreso");
	//static By sucursal= By.name("1295");
	//static By btingresar = By.id("btnSalir"); 	
	static By btnmoduloadmision = By.id("btnAdmisionMensajeria");
	static By btnadmisionautomatica = By.id("btnAdmisionAutomatica");
	static By btnenviosenlinea = By.id("btnEnviosEnLinea");
	static By pantallaenvios = By.name("ENVIOS EN LINEA");
	static By datosremitente = By.name("Datos del remitente");

	
	
	//Constructor de la clase Base

	public LoginObjects(WiniumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public static void AbrirAplicacion() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		loadProperty.load(new FileReader("./params.properties"));
		
		
			LoginObjects winDriver = new LoginObjects(driver);
			driver = winDriver.winiumDriverConnection();
			Thread.sleep(2000);
			System.out.println("Se corrio el Driver");
			
			if (isDisplayed(aplicacion)) {
			System.out.println("Encontre la pantalla de inicio del POS ");
		
			
			type(loadProperty.getProperty("user"), usuario);
			type(loadProperty.getProperty("password"), contraseña);
			click(btentrar);
//			Thread.sleep(1000);			
//			click(sucursal);
//			Thread.sleep(1000);			
//			click(btingresar);
			Thread.sleep(30000);
			
			if (isDisplayed(menuprincipal)) {
				
				System.out.println("Encontre la pantalla principal de menu del POS ");
				Thread.sleep(2000);
				}
			else {
				System.out.println("Error en la aplicación");
				closeDriver();
				
			} 
			
		}else {
			System.out.println("Ocurio un error con el driver o al abrir la app");
			closeDriver();
		} 
					
		
			}


	public static void IngresoModulo() throws IOException, InterruptedException, AWTException{
		// TODO Auto-generated method stub
		
		
		if (isDisplayed(btnmoduloadmision)) {
			System.out.println("Encontre boton del modulo de admision de envios ");
			click(btnmoduloadmision);
			Thread.sleep(1000);
			
			if (isDisplayed(btnenviosenlinea)) {
				System.out.println("Encontre el boton de ingreso a admision automatica");
				click(btnenviosenlinea);
//				Robot robot=new Robot();
//				robot.mouseMove(300, 600);
//				robot.keyPress(KeyEvent.VK_ALT);
//				robot.keyPress(KeyEvent.VK_ESCAPE);
//				Thread.sleep(10000);
//				robot.keyRelease(KeyEvent.VK_ENTER);
//				robot.keyRelease(KeyEvent.VK_ESCAPE);
			
			}else {
				
				System.out.println("NO encontre el boton de admision automatica en envios en linea");
				closeDriver();
				}
			
			
		}else {
			System.out.println("NO encontre boton del modulo de admision de envios");
		}
		
		
//			if (isDisplayed(btnenviosenlinea)) {
//				System.out.println("Encontre boton del modulo de admision de envios ");
//				click(btnenviosenlinea);
//				Thread.sleep(30000);
//			}
			
				
					
					if (isDisplayed(datosremitente)) {
					
					System.out.println("Encontre Pantalla para buscar cliente Envios En Linea ");
					Robot robot=new Robot();
					robot.keyPress(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_TAB);
					robot.keyPress(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_TAB);
					robot.keyPress(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_TAB);
					robot.keyPress(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_TAB);
					Thread.sleep(20000);
	
					Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
					StringSelection CCcliente = new StringSelection(loadProperty.getProperty("CCcliente"));
					clipboard.setContents(CCcliente, null);
					
					  robot.keyPress(KeyEvent.VK_CONTROL);
					  robot.keyPress(KeyEvent.VK_V);
					  robot.keyRelease(KeyEvent.VK_V);
					  robot.keyRelease(KeyEvent.VK_CONTROL);
					  Thread.sleep(1000);
					  
					  robot.keyPress(KeyEvent.VK_TAB);				 
					  robot.keyRelease(KeyEvent.VK_TAB);
					  StringSelection CelularCliente = new StringSelection(loadProperty.getProperty("CelularCliente"));
					  clipboard.setContents(CelularCliente, null);
					  robot.keyPress(KeyEvent.VK_CONTROL);
					  robot.keyPress(KeyEvent.VK_V);
					  robot.keyRelease(KeyEvent.VK_V);
					  robot.keyRelease(KeyEvent.VK_CONTROL);
					  Thread.sleep(1000);
					  robot.keyPress(KeyEvent.VK_TAB);
					  robot.keyRelease(KeyEvent.VK_TAB);
					  robot.keyPress(KeyEvent.VK_ENTER);
					  robot.keyRelease(KeyEvent.VK_ENTER);
					  

				
					}else {
						System.out.println("NO encontre la primera pantalla de envios en linea");
						closeDriver();
						}
				
						
						
						
			
	
			
		
	
	
		
	}

	public static void ValidarUsuario()  {
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
