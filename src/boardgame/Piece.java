package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // a posição de uma peça recem criada seria nula
	}

	protected Board getBoard() { // o tabuleiro associado a uma peça so deve ser acessado dentro do pacote board e piece
		return board;
	}

	public abstract boolean[][] possibleMoves(); // método abstrato que chama uma matriz de booleanos

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()]; // método concreto se utilizando de um método abstrato
	}

	public boolean isThereAnyPossibleMove() { //implementação concreta que depende de um método abstrato
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true; //se a matriz na linha i e coluna j for verdadeira um movimento é possível
				}
			}
		}
		return false;
	}
}
