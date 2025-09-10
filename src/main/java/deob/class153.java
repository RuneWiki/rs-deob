package deob;

@ObfuscatedName("fl")
public class class153 extends class152 {

	// $FF: synthetic field
	public final class155 this$0;

	@ObfuscatedName("fl.af")
	public int field1775;

	@ObfuscatedName("fl.aw")
	public boolean field1777;

	public class153(class155 arg0) {
		this.this$0 = arg0;
		this.field1775 = -1;
	}

	@ObfuscatedName("fl.af(Lwb;I)V")
	public void method3645(class591 arg0) {
		this.field1775 = arg0.method10341();
		this.field1777 = arg0.method10339() == 1;
	}

	@ObfuscatedName("fl.aw(Lgs;I)V")
	public void method3646(class163 arg0) {
		arg0.method3703(this.field1775, this.field1777);
	}
}
