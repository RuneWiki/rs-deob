package deob;

import java.util.Comparator;

@ObfuscatedName("qr")
public class class423 implements Comparator {

	@ObfuscatedName("qr.af(Lqi;Lqi;I)I")
	public int method7884(class421 arg0, class421 arg1) {
		return arg0.field5033.field5041 < arg1.field5033.field5041 ? -1 : arg0.field5033.field5041 == arg1.field5033.field5041 ? 0 : 1;
	}

	public int compare(Object arg0, Object arg1) {
		return this.method7884((class421) arg0, (class421) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
