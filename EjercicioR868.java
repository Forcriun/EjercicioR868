import java.util.ArrayList;

public class EjercicioR868
{
    public ArrayList<Alumno> obtenerAlumnosOrdenadorPorNotaMedia(ArrayList<Alumno> alumnosGrupo1, ArrayList<Alumno> alumnosGrupo2) 
    {             
        ArrayList<Alumno> totalAlumnos = new ArrayList<>();
        totalAlumnos.addAll(alumnosGrupo1);
        totalAlumnos.addAll(alumnosGrupo2);
        ArrayList<Alumno> aDevolver = new ArrayList<>();

        if(totalAlumnos.size() > 0){
            while(totalAlumnos.size() > 0){
                Alumno alumnoConMayorNotaMedia = null;
                int posicionAlumnoConMayorNota = -1;
                double notaReferencia = 0;                

                int posicion = 0;
                for (Alumno alumno : totalAlumnos){
                    if (alumno.getNotaMedia() >= notaReferencia && alumno.getNotaMedia() >= 5){
                        notaReferencia = alumno.getNotaMedia();
                        alumnoConMayorNotaMedia = alumno;
                        posicionAlumnoConMayorNota = posicion;
                    }
                    posicion++;
                }

                if(notaReferencia != 0.0){
                    System.out.println(alumnoConMayorNotaMedia);
                    totalAlumnos.remove(posicionAlumnoConMayorNota);
                    aDevolver.add(alumnoConMayorNotaMedia);
                }
                else{
                    totalAlumnos.remove(0);                    
                }
            }
        }

        return aDevolver;
    }
}