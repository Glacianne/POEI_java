package cours.spring;

public class Bowser {
	
	private Gun obj;

	public Bowser()
	{
		System.out.println("Bowser :Constructeur par defaut");
	}
	
	public Bowser(Gun gun)
	{
		System.out.println("Bowser :Constructeur par injection");
		this.obj = gun;
	}
	
	public String utilisationObject()
	{
		return obj.use();
	}
	
	public String attaque() {
		return "Bowser crache des flammes";
	}

}
