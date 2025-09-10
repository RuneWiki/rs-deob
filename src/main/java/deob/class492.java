package deob;

@ObfuscatedName("sr")
public class class492 implements Comparable {

	@ObfuscatedName("sr.af")
	public Object field5367;

	@ObfuscatedName("sr.aw")
	public Object field5365;

	@ObfuscatedName("sr.at")
	public long field5366;

	@ObfuscatedName("sr.ac")
	public long field5368;

	public class492(Object arg0, Object arg1) {
		this.field5367 = arg0;
		this.field5365 = arg1;
	}

	@ObfuscatedName("sr.af(Lsr;I)I")
	public int method9155(class492 arg0) {
		if (this.field5368 < arg0.field5368) {
			return -1;
		} else if (this.field5368 > arg0.field5368) {
			return 1;
		} else {
			return 0;
		}
	}

	public boolean equals(Object arg0) {
		if (!(arg0 instanceof class492)) {
			throw new IllegalArgumentException();
		}
		return this.field5365.equals(((class492) arg0).field5365);
	}

	public int hashCode() {
		return this.field5365.hashCode();
	}

	public int compareTo(Object arg0) {
		return this.method9155((class492) arg0);
	}
}
