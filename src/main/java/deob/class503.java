package deob;

@ObfuscatedName("tc")
public class class503 extends class500 {

	@ObfuscatedName("tc.af")
	public int field5408;

	@ObfuscatedName("tc.af(Ltc;I)I")
	public int method9325(class503 arg0) {
		return this.field5408 - arg0.field5408;
	}

	@ObfuscatedName("tc.aw(Ltl;I)I")
	public int method9213(class500 arg0) {
		return this.method9325((class503) arg0);
	}

	public int compareTo(Object arg0) {
		return this.method9325((class503) arg0);
	}
}
