
import java.util.*;
//comentario para hacer el merge en master
public class EjercicioGimnasio {

    // Colecciones ya preparadas
    Set<String> socios = new HashSet<>();
    List<String> accesosHoy = new ArrayList<>();
    Map<String, String> clasesDirigidas = new HashMap<>();

    // 1. Método para dar de alta
    public void apuntarSocio(String dni) {
        socios.add(dni);

    }

    // 2. Método para pasar el torno
    public void entrarAlGimnasio(String dni) {
        if (socios.contains(dni)) {
            accesosHoy.add(dni);
        } else {
            System.out.println("Error: No estás apuntado al gimnasio.");
        }
        // - Si está, añádelo a la List de accesosHoy e imprime "Bienvenido".
        // - Si no está, imprime "Error: No estás apuntado al gimnasio."

    }

    // 3. Método para organizar los horarios
    public void asignarMonitor(String clase, String monitor) {

        clasesDirigidas.put(clase, monitor);
        // TODO: Añade la clase y el monitor al Map

    }

    public static void main(String[] args) {
        EjercicioGimnasio gym = new EjercicioGimnasio();

        // --- PRUEBAS ---
        // 1. Apunta a un par de socios (ej. "111A", "222B") usando apuntarSocio()
        gym.apuntarSocio("111A");
        gym.apuntarSocio("222B");

        // 2. Intenta que entre alguien que NO es socio ("333C") usando entrarAlGimnasio()
        gym.entrarAlGimnasio("333c");

        // 3. Haz que entre un socio válido ("111A") un par de veces
        gym.entrarAlGimnasio("111A");

        // 4. Asigna un par de clases ("Musculación" -> "Víctor", "Spinning" -> "Enrique")
        gym.asignarMonitor("Musculacion", "Victor");
        gym.asignarMonitor("Spinning", "Enrique");

        // 5. Imprime las tres colecciones (con un System.out.println de cada variable vale por ahora)
        System.out.println("--Todos accesos--");
        for (String elemento : gym.socios) {
            System.out.println(elemento);
        }
        Iterator<String> it = gym.socios.iterator();
        while(it.hasNext()){
            if (it.next().equals("111A")){
                
            it.remove(); 
            }
        }
         Iterator<String> its = gym.clasesDirigidas.keySet().iterator();
        while(its.hasNext()){
            if (its.next().equals("111A")){
                
            its.remove(); 
            }
        }
        
        
                 Iterator<Map.Entry<String, String>> itpareja = gym.clasesDirigidas.entrySet().iterator();
        while(itpareja.hasNext()){
            if (itpareja.next().equals("Victor")){
                
            itpareja.remove(); 
            }
        }
        
        
        System.out.println("--Hoy--");
            for (String elemento : gym.accesosHoy) {
            System.out.println(elemento);
        }
            for (String elemento : gym.clasesDirigidas.keySet()) {
            String nombreMonitor = gym.clasesDirigidas.get(elemento);
                System.out.println("La clase " + elemento + " La dirige " + nombreMonitor);
        }
    }
}
