package deob;

import java.util.Comparator;

@ObfuscatedName("bh")
public class class60 implements Comparator {

    @ObfuscatedName("bh.i")
    public boolean field461;

    @ObfuscatedName("bh.i(Lkt;Lkt;I)I")
    public int method1078(class298 arg0, class298 arg1) {
        if (arg0.field3748 == arg1.field3748) {
            return 0;
        }
        if (this.field461) {
            if (client.field463 == arg0.field3748) {
                return -1;
            }
            if (client.field463 == arg1.field3748) {
                return 1;
            }
        }
        return arg0.field3748 < arg1.field3748 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1078((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
