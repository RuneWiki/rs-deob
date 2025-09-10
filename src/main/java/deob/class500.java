package deob;

@ObfuscatedName("tl")
public class class500 implements Comparable {

	@ObfuscatedName("tl.at")
	public class614 field5398;

	@ObfuscatedName("tl.ac")
	public class614 field5397;

	@ObfuscatedName("tl.az(I)Lxa;")
	public class614 method9244() {
		return this.field5398;
	}

	@ObfuscatedName("tl.bt(I)Ljava/lang/String;")
	public String method9241() {
		return this.field5398 == null ? "" : this.field5398.method11022();
	}

	@ObfuscatedName("tl.bs(I)Ljava/lang/String;")
	public String method9243() {
		return this.field5397 == null ? "" : this.field5397.method11022();
	}

	@ObfuscatedName("tl.bu(Lxa;Lxa;I)V")
	public void method9249(class614 arg0, class614 arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.field5398 = arg0;
		this.field5397 = arg1;
	}

	@ObfuscatedName("tl.aw(Ltl;I)I")
	public int method9213(class500 arg0) {
		return this.field5398.method11025(arg0.field5398);
	}

	public int compareTo(Object arg0) {
		return this.method9213((class500) arg0);
	}
}
