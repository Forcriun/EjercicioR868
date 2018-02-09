class Alumno
{
    private String nombreCompleto;
    private int notaLengua;
    private int notaMatematicas;
    private int notaIngles;
    private double notaMedia;

    public Alumno(String nombreCompleto, int notaLengua, int notaMatematicas, int notaIngles) 
    {
        this.nombreCompleto = nombreCompleto;
        this.notaLengua = notaLengua;
        this.notaMatematicas = notaMatematicas;
        this.notaIngles = notaIngles;
        if(notaLengua >=5 && notaMatematicas >= 5 && notaIngles >= 5){
            notaMedia = (notaLengua + notaMatematicas + notaIngles)/3;
        }
    }

    public double getNotaMedia(){
        return notaMedia;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }
}