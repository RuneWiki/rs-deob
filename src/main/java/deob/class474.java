package deob;

@ObfuscatedName("ss")
public class class474 extends class478 {

	@ObfuscatedName("ss.af")
	public long field5290;

	@ObfuscatedName("ss.aw")
	public int field5289;

	public class474(class478 arg0, int arg1) {
		super(arg0);
		this.field5289 = arg1;
		this.field5304 = "DelayFadeTask";
	}

	@ObfuscatedName("ss.af(B)Z")
	public boolean method8969() {
		if (this.field5290 < (long) this.field5289) {
			this.field5290++;
			return false;
		} else {
			return true;
		}
	}
}
