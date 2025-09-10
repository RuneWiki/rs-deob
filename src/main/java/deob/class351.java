package deob;

import java.util.Comparator;

@ObfuscatedName("nm")
public class class351 implements Comparator {

	@ObfuscatedName("nm.af(Lnb;Lnb;I)I")
	public int method6767(class344 arg0, class344 arg1) {
		return arg0.field3950 - arg1.field3950;
	}

	public int compare(Object arg0, Object arg1) {
		return this.method6767((class344) arg0, (class344) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
