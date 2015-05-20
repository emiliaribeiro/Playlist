package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "TABELA_UTILIZADORES")
public class Utilizador implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5588162351023800289L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String mail;
	private String password;
	@OneToMany
	private List<Playlist> playlists;

	@Temporal(javax.persistence.TemporalType.DATE)
	private Calendar data_nascimento;

	public Utilizador() {

	}

	public Utilizador(String nome, String pass, String mail) {
		this.nome = nome;
		this.password = pass;
		this.mail = mail;
		playlists = new ArrayList<Playlist>();
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Calendar getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Calendar data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

}
