package deob;

import java.util.Comparator;

@ObfuscatedName("bh")
public class class43 implements Comparator {

	@ObfuscatedName("bh.af")
	public boolean field286;

	@ObfuscatedName("bh.af(Lqi;Lqi;I)I")
	public int method778(class421 arg0, class421 arg1) {
		if (arg0.field5034 == arg1.field5034) {
			return 0;
		}
		if (this.field286) {
			if (client.field326 == arg0.field5034) {
				return -1;
			}
			if (client.field326 == arg1.field5034) {
				return 1;
			}
		}
		return arg0.field5034 < arg1.field5034 ? -1 : 1;
	}

	public int compare(Object arg0, Object arg1) {
		return this.method778((class421) arg0, (class421) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
