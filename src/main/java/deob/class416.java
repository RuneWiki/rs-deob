package deob;

import java.util.Comparator;

@ObfuscatedName("pv")
public class class416 implements Comparator {

	@ObfuscatedName("pv.af(Lqi;Lqi;B)I")
	public int method7821(class421 arg0, class421 arg1) {
		return arg0.field5033.field5042 < arg1.field5033.field5042 ? -1 : arg0.field5033.field5042 == arg1.field5033.field5042 ? 0 : 1;
	}

	public int compare(Object arg0, Object arg1) {
		return this.method7821((class421) arg0, (class421) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
