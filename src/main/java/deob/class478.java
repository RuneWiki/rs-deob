package deob;

@ObfuscatedName("si")
public abstract class class478 {

	@ObfuscatedName("si.at")
	public boolean field5302;

	@ObfuscatedName("si.ac")
	public class478 field5305;

	@ObfuscatedName("si.ap")
	public String field5303;

	@ObfuscatedName("si.aq")
	public String field5304;

	@ObfuscatedName("si.ao")
	public boolean field5301;

	public class478(class478 arg0) {
		this.field5305 = arg0;
	}

	@ObfuscatedName("si.al(B)Z")
	public boolean method8981() {
		return this.field5301;
	}

	@ObfuscatedName("si.au(I)Z")
	public boolean method8983() {
		return this.field5302;
	}

	@ObfuscatedName("si.ai(I)Ljava/lang/String;")
	public String method8984() {
		return "Error in task: " + this.field5304 + ", Error message: " + this.field5303;
	}

	@ObfuscatedName("si.aa(I)Lsi;")
	public class478 method8986() {
		return this.field5305;
	}

	@ObfuscatedName("si.am(Ljava/lang/String;I)V")
	public void method8982(String arg0) {
		this.field5301 = true;
		this.field5303 = arg0;
	}

	@ObfuscatedName("si.af(B)Z")
	public abstract boolean method8969();
}
