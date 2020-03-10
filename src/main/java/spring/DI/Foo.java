package spring.DI;

public class Foo {
	
	String str;
	int i;
	private Bar bar;
	private Baz baz;

	
	
	public void setStr(String str) {
		this.str = str;
	}


	public void setI(int i) {
		this.i = i;
	}


	public void setBar(Bar bar) {
		this.bar = bar;
	}


	public void setBaz(Baz baz) {
		this.baz = baz;
	}


	public Foo() {}
	
	
	
	
	
	public Foo(String str, int i, Bar bar) {
		this.str = str;
		this.i = i;
		this.bar = bar;
	}

	
	public Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz = baz;
	}
	
	public void doFoo() {
		System.out.println("doFoo() 실행");
		bar.doBar();
	}

}
