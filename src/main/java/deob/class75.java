package deob;

import java.util.Comparator;

@ObfuscatedName("ba")
public class class75 implements Comparator {

    @ObfuscatedName("ba.a")
    public boolean field838;

    @ObfuscatedName("ba.a(Ly;Ly;I)I")
    public int method1004(class15 arg0, class15 arg1) {
        if (arg0.field282 == arg1.field282) {
            return 0;
        }
        if (this.field838) {
            if (client.field847 == arg0.field282) {
                return -1;
            }
            if (client.field847 == arg1.field282) {
                return 1;
            }
        }
        return arg0.field282 < arg1.field282 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1004((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
