package deob;

import java.util.Comparator;

@ObfuscatedName("sq")
public class class490 implements Comparator {

	// $FF: synthetic field
	public final class491 this$0;

	public class490(class491 arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("sq.af(Lsr;Lsr;I)I")
	public int method9124(class492 arg0, class492 arg1) {
		if (arg0.field5366 > arg1.field5366) {
			return 1;
		} else if (arg0.field5366 < arg1.field5366) {
			return -1;
		} else {
			return 0;
		}
	}

	public int compare(Object arg0, Object arg1) {
		return this.method9124((class492) arg0, (class492) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
