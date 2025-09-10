package deob;

@ObfuscatedName("gv")
public class class164 extends class168 {

	// $FF: synthetic field
	public final class169 this$0;

	@ObfuscatedName("gv.af")
	public String field1879;

	@ObfuscatedName("gv.aw")
	public int field1878;

	@ObfuscatedName("gv.at")
	public byte field1875;

	public class164(class169 arg0) {
		this.this$0 = arg0;
		this.field1879 = null;
	}

	@ObfuscatedName("gv.af(Lwb;I)V")
	public void method3670(class591 arg0) {
		if (arg0.method10339() != 255) {
			arg0.field5920--;
			arg0.method10346();
		}
		this.field1879 = arg0.method10349();
		this.field1878 = arg0.method10341();
		this.field1875 = arg0.method10340();
		arg0.method10346();
	}

	@ObfuscatedName("gv.aw(Lgm;I)V")
	public void method3671(class172 arg0) {
		class154 var2 = new class154();
		var2.field1780 = new class614(this.field1879);
		var2.field1782 = this.field1878;
		var2.field1783 = this.field1875;
		arg0.method3793(var2);
	}
}
