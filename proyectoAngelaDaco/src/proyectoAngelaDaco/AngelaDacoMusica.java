package proyectoAngelaDaco;

public class AngelaDacoMusica {
public String nombreHobby;
public String cantante;
public String cancion;

public AngelaDacoMusica(String nombreHobby, String cantante, String cancion) {
	this.nombreHobby=nombreHobby;
	this.cantante=cantante;
	this.cancion=cancion;
}
public String getNombreHobby() {
	return nombreHobby;
}
public String getCantante() {
	return cantante;
}
public String getCancion() {
	return cancion;
}
public void setNombreHobby(String nombreHobby) {
	this.nombreHobby=nombreHobby;
}
public void setCantante(String cantante) {
	this.cantante=cantante;
}
public void setCancion(String cancion) {
	this.cancion=cancion;
}
}

