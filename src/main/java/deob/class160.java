package deob;

@ObfuscatedName("gn")
public class class160 extends class168 {

	// $FF: synthetic field
	public final class169 this$0;

	@ObfuscatedName("gn.af")
	public int field1828;

	public class160(class169 arg0) {
		this.this$0 = arg0;
		this.field1828 = -1;
	}

	@ObfuscatedName("gn.af(Lwb;I)V")
	public void method3670(class591 arg0) {
		this.field1828 = arg0.method10341();
		arg0.method10339();
		if (arg0.method10339() != 255) {
			arg0.field5920--;
			arg0.method10346();
		}
	}

	@ObfuscatedName("gn.aw(Lgm;I)V")
	public void method3671(class172 arg0) {
		arg0.method3794(this.field1828);
	}
}
