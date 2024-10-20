package deob;

import java.util.Comparator;

@ObfuscatedName("bh")
public class class68 implements Comparator {

    @ObfuscatedName("bh.a")
    public boolean field642;

    @ObfuscatedName("bh.a(Lm;Lm;I)I")
    public int method1161(class8 arg0, class8 arg1) {
        if (arg0.field56 == arg1.field56) {
            return 0;
        }
        if (this.field642) {
            if (client.field650 == arg0.field56) {
                return -1;
            }
            if (client.field650 == arg1.field56) {
                return 1;
            }
        }
        return arg0.field56 < arg1.field56 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1161((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
