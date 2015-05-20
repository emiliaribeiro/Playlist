package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;

@Entity(name="TABELA_PLAYLISTS")
public class Playlist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Calendar data_criacao;
	private int tamanho;

	@ManyToMany
	private List<Musica> musicas;

	public Playlist() {

	}

	public Playlist(String nome) {
		tamanho = 0;
		data_criacao = Calendar.getInstance();
		musicas = new ArrayList<Musica>();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Calendar data_criacao) {
		this.data_criacao = data_criacao;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
