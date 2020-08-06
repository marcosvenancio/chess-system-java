package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //a posição de uma peça recem criada seria nula
	}

	protected Board getBoard() { //o tabuleiro associado a uma peça so deve ser acessado dentro do pacote board e piece
		return board;
	}
	
	
}
