package ups.edu.ec.modelo;
import java.io.Serializable;

public class Error implements Serializable{
	private String error, causa;
	
	

	public Error(String error, String causa) {
		super();
		this.error = error;
		this.causa = causa;
	}

	public Error(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}

	@Override
	public String toString() {
		return "Error [error=" + error + ", causa=" + causa + "]";
	}
	
	
}
