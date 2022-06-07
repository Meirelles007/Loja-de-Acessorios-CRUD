package dao;

public interface DAO_Interface<Classe> {
	void inserir(Classe c);

	public Classe consultar(String c);
}
