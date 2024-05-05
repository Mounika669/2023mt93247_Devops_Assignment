class Box
{
	int length;
	int width;
	int height;
	Box(int l,int w)
	{
		this.length=l;
		this.width=w;
	}
	Box(int l,int w,int h)
	{
		this(l,w);
		this.height=h;
	}
	public void display() 
	{
		System.out.println("length of the box "+this.length);
		System.out.println("width of the box "+this.width);
		if(this.height!=0)
		{
			System.out.println("Height of the box "+this.height);
		}
	}
}
