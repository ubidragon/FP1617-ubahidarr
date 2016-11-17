package fp.boletines.boletin3.mediosAudiovisuales;

import fp.musica.ArtistaImpl;

public class ArtistaPerfilImpl extends ArtistaImpl implements ArtistaPerfil {

/***************ATRIBUTOS***************/
	private String nickname;
	private RedSocial redSocial;

/*************CONSTRUCTOR*****************/
	public ArtistaPerfilImpl(String id, String nombre, String gener, Integer popularidad,
	 String urlImagen, String nickname, RedSocial redSocial) {
		super(id, nombre, gener, popularidad, urlImagen);
		this.nickname = nickname;
		this.redSocial = redSocial;
	}

/**************GETTERS & SETTERS**************/
	public String getNickName() {

		return nickname;
	}

	public RedSocial getRedSocial() {

		return redSocial;
	}
	
	public String toString(){
		String res = super.toString();
		
		res+= "- perfil en "+ getRedSocial()+":";
		
		return res;
	}

}
