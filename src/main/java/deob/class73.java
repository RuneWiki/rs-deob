package deob;

import java.util.Comparator;

@ObfuscatedName("bw")
public class class73 implements Comparator {

    @ObfuscatedName("bw.s")
    public boolean field836;

    @ObfuscatedName("bw.s(Lq;Lq;I)I")
    public int method1076(class15 arg0, class15 arg1) {
        if (arg0.field282 == arg1.field282) {
            return 0;
        }
        if (this.field836) {
            if (client.field841 == arg0.field282) {
                return -1;
            }
            if (client.field841 == arg1.field282) {
                return 1;
            }
        }
        return arg0.field282 < arg1.field282 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1076((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
