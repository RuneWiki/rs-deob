package deob;

import java.util.Comparator;

@ObfuscatedName("qe")
public class class420 implements Comparator {

	@ObfuscatedName("qe.af(Lqi;Lqi;I)I")
	public int method7844(class421 arg0, class421 arg1) {
		return arg0.field5034 < arg1.field5034 ? -1 : arg0.field5034 == arg1.field5034 ? 0 : 1;
	}

	public int compare(Object arg0, Object arg1) {
		return this.method7844((class421) arg0, (class421) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
