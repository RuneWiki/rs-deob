package deob;

@ObfuscatedName("gf")
public class class174 extends class152 {

	// $FF: synthetic field
	public final class155 this$0;

	@ObfuscatedName("gf.af")
	public long field1935;

	@ObfuscatedName("gf.aw")
	public String field1934;

	public class174(class155 arg0) {
		this.this$0 = arg0;
		this.field1935 = -1L;
		this.field1934 = null;
	}

	@ObfuscatedName("gf.af(Lwb;I)V")
	public void method3645(class591 arg0) {
		if (arg0.method10339() != 255) {
			arg0.field5920--;
			this.field1935 = arg0.method10346();
		}
		this.field1934 = arg0.method10349();
	}

	@ObfuscatedName("gf.aw(Lgs;I)V")
	public void method3646(class163 arg0) {
		arg0.method3762(this.field1935, this.field1934);
	}
}
