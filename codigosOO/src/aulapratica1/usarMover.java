package aulapratica1;

public class usarMover implements MoverEmtodasAsdirecoes{

	int direct;
	@Override
	public int direita() {
		direct =+ direct;
		return 0;
	}

	@Override
	public int esqueda() {
		direct =- direct;
		return 0;
	}

	@Override
	public int praCima() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int praBaixo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
