package deob;

@ObfuscatedName("fp")
public class class150 extends class152 {

	// $FF: synthetic field
	public final class155 this$0;

	@ObfuscatedName("fp.af")
	public long field1763;

	@ObfuscatedName("fp.aw")
	public String field1760;

	public class150(class155 arg0) {
		this.this$0 = arg0;
		this.field1763 = -1L;
		this.field1760 = null;
	}

	@ObfuscatedName("fp.af(Lwb;I)V")
	public void method3645(class591 arg0) {
		if (arg0.method10339() != 255) {
			arg0.field5920--;
			this.field1763 = arg0.method10346();
		}
		this.field1760 = arg0.method10349();
	}

	@ObfuscatedName("fp.aw(Lgs;I)V")
	public void method3646(class163 arg0) {
		arg0.method3737(this.field1763, this.field1760, 0);
	}
}
