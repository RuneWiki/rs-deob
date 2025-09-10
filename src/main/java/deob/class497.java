package deob;

@ObfuscatedName("td")
public class class497 extends class504 {

	@ObfuscatedName("td.af")
	public boolean field5386;

	@ObfuscatedName("td.aw")
	public boolean field5387;

	@ObfuscatedName("td.af(Ltd;B)I")
	public int method9214(class497 arg0) {
		if (client.field326 == this.field5412 && client.field326 != arg0.field5412) {
			return -1;
		} else if (client.field326 == arg0.field5412 && client.field326 != this.field5412) {
			return 1;
		} else if (this.field5412 != 0 && arg0.field5412 == 0) {
			return -1;
		} else if (arg0.field5412 != 0 && this.field5412 == 0) {
			return 1;
		} else if (this.field5386 && !arg0.field5386) {
			return -1;
		} else if (!this.field5386 && arg0.field5386) {
			return 1;
		} else if (this.field5387 && !arg0.field5387) {
			return -1;
		} else if (!this.field5387 && arg0.field5387) {
			return 1;
		} else if (this.field5412 == 0) {
			return arg0.field5411 - this.field5411;
		} else {
			return this.field5411 - arg0.field5411;
		}
	}

	@ObfuscatedName("td.aw(Ltl;I)I")
	public int method9213(class500 arg0) {
		return this.method9214((class497) arg0);
	}

	public int compareTo(Object arg0) {
		return this.method9214((class497) arg0);
	}
}
