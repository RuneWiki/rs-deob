package deob;

@ObfuscatedName("gy")
public class class167 extends class152 {

	// $FF: synthetic field
	public final class155 this$0;

	@ObfuscatedName("gy.af")
	public long field1890;

	@ObfuscatedName("gy.aw")
	public String field1888;

	@ObfuscatedName("gy.at")
	public int field1889;

	public class167(class155 arg0) {
		this.this$0 = arg0;
		this.field1890 = -1L;
		this.field1888 = null;
		this.field1889 = 0;
	}

	@ObfuscatedName("gy.af(Lwb;I)V")
	public void method3645(class591 arg0) {
		if (arg0.method10339() != 255) {
			arg0.field5920--;
			this.field1890 = arg0.method10346();
		}
		this.field1888 = arg0.method10349();
		this.field1889 = arg0.method10341();
	}

	@ObfuscatedName("gy.aw(Lgs;I)V")
	public void method3646(class163 arg0) {
		arg0.method3737(this.field1890, this.field1888, this.field1889);
	}
}
