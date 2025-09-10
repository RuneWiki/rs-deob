package deob;

@ObfuscatedName("ge")
public class class165 extends class168 {

	// $FF: synthetic field
	public final class169 this$0;

	@ObfuscatedName("ge.af")
	public int field1881;

	@ObfuscatedName("ge.aw")
	public byte field1880;

	@ObfuscatedName("ge.at")
	public int field1882;

	@ObfuscatedName("ge.ac")
	public String field1883;

	public class165(class169 arg0) {
		this.this$0 = arg0;
		this.field1881 = -1;
	}

	@ObfuscatedName("ge.af(Lwb;I)V")
	public void method3670(class591 arg0) {
		arg0.method10339();
		this.field1881 = arg0.method10341();
		this.field1880 = arg0.method10340();
		this.field1882 = arg0.method10341();
		arg0.method10346();
		this.field1883 = arg0.method10350();
		arg0.method10339();
	}

	@ObfuscatedName("ge.aw(Lgm;I)V")
	public void method3671(class172 arg0) {
		class154 var2 = (class154) arg0.field1919.get(this.field1881);
		var2.field1783 = this.field1880;
		var2.field1782 = this.field1882;
		var2.field1780 = new class614(this.field1883);
	}
}
