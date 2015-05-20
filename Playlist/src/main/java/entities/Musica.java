package entities;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity(name="TABELA_MUSICA")
public class Musica {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String titulo;
	private String artista;
	private String album;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Calendar anoLancamento;
	private String filePath;

	public Musica() {
		// TODO Auto-generated constructor stub
	}
	public Musica(String titulo, String artista, String album,Calendar anoLancamento) {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Calendar getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Calendar anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


}
