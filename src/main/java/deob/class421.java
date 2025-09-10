package deob;

@ObfuscatedName("qi")
public class class421 {

	@ObfuscatedName("qi.af")
	public final int field5034;

	@ObfuscatedName("qi.aw")
	public final long field5038;

	@ObfuscatedName("qi.at")
	public final class422 field5033;

	@ObfuscatedName("qi.ac")
	public String field5035;

	@ObfuscatedName("qi.ap")
	public String field5036;

	public class421(class591 arg0, byte arg1, int arg2) {
		this.field5035 = arg0.method10350();
		this.field5036 = arg0.method10350();
		this.field5034 = arg0.method10341();
		this.field5038 = arg0.method10346();
		int var4 = arg0.method10345();
		int var5 = arg0.method10345();
		this.field5033 = new class422();
		this.field5033.method7863(2);
		this.field5033.method7875(arg1);
		this.field5033.field5041 = var4;
		this.field5033.field5042 = var5;
		this.field5033.field5043 = 0;
		this.field5033.field5039 = 0;
		this.field5033.field5040 = arg2;
	}

	@ObfuscatedName("qi.af(I)Ljava/lang/String;")
	public String method7852() {
		return this.field5035;
	}

	@ObfuscatedName("qi.aw(I)Ljava/lang/String;")
	public String method7851() {
		return this.field5036;
	}
}
