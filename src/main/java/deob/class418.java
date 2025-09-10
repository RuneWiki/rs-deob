package deob;

import java.util.Comparator;

@ObfuscatedName("qb")
public class class418 implements Comparator {

	@ObfuscatedName("qb.af(Lqi;Lqi;I)I")
	public int method7834(class421 arg0, class421 arg1) {
		return arg0.field5038 < arg1.field5038 ? -1 : arg0.field5038 == arg1.field5038 ? 0 : 1;
	}

	public int compare(Object arg0, Object arg1) {
		return this.method7834((class421) arg0, (class421) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
