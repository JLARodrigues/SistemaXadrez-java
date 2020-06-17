package corpojogo;

public class CorpoExcecao extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public CorpoExcecao(String msg){
		super(msg);
	}
}
