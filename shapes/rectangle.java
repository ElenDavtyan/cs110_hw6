public class rectangle{

    private int length;
    private int height;

	public rectangle(int a, int b){
		this.height = a;
		this.length = b;
	}

	public int getArea(){
		return height*length;
	}
}