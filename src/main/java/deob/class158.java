package deob;

@ObfuscatedName("gk")
public class class158 extends class168 {

	// $FF: synthetic field
	public final class169 this$0;

	@ObfuscatedName("gk.af")
	public int field1818;

	@ObfuscatedName("gk.aw")
	public byte field1814;

	@ObfuscatedName("gk.at")
	public int field1816;

	@ObfuscatedName("gk.ac")
	public String field1817;

	public class158(class169 arg0) {
		this.this$0 = arg0;
		this.field1818 = -1;
	}

	@ObfuscatedName("gk.af(Lwb;I)V")
	public void method3670(class591 arg0) {
		this.field1818 = arg0.method10341();
		this.field1814 = arg0.method10340();
		this.field1816 = arg0.method10341();
		arg0.method10346();
		this.field1817 = arg0.method10350();
	}

	@ObfuscatedName("gk.aw(Lgm;I)V")
	public void method3671(class172 arg0) {
		class154 var2 = (class154) arg0.field1919.get(this.field1818);
		var2.field1783 = this.field1814;
		var2.field1782 = this.field1816;
		var2.field1780 = new class614(this.field1817);
	}
}
