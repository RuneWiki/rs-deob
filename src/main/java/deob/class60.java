package deob;

import java.util.Comparator;

@ObfuscatedName("bw")
public class class60 implements Comparator {

    @ObfuscatedName("bw.n")
    public boolean field477;

    @ObfuscatedName("bw.n(Lko;Lko;I)I")
    public int method1052(class298 arg0, class298 arg1) {
        if (arg0.field3759 == arg1.field3759) {
            return 0;
        }
        if (this.field477) {
            if (client.field654 == arg0.field3759) {
                return -1;
            }
            if (client.field654 == arg1.field3759) {
                return 1;
            }
        }
        return arg0.field3759 < arg1.field3759 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1052((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
