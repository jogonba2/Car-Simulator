package wheelSimulator;

public class conf {
	public static String mySongs[] = new String[100]; // BO
	public static String pathRecords = "C:\\Users\\Administrador\\Desktop\\Tareas PASCUA\\Tarea IPC\\Simulador Volante\\wheelSimulator\\src\\records\\records.txt";
	public static String pathPoliceCar = "classpath:icons/policecar.png";
	public static String pathMoney = "classpath:icons/money.png";
	public static String pathMyCar = "classpath:icons/mycar.png";
	public static int carSelected = 0;
	public static boolean checkedRadio = false;
	public static boolean checkedSilence = false;
	public static int numSongs = 0;
	// Se utilizarán en el seteo de los shortcuts para personalización //
	public static String keyRun = "F"; // hecho
	public static String keyBrake = "D"; // hecho
	public static String keyIzq = "Left"; // hecho
	public static String keyDer = "Right"; // hecho
	public static String actRadio = "None"; // hecho
	public static String deactRadio = "None"; // hecho
	public static String showRadio = "None"; // hecho
	public static String hideRadio = "None"; // hecho
	public static int maxColisiones = 5; // hecho
	public static int longTrazado = 5000; // hecho
	public static int maxSpeed = 60; // heho
}
