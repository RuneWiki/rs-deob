package deob;

import java.util.Comparator;

@ObfuscatedName("bq")
public class class63 implements Comparator {

    @ObfuscatedName("bq.f")
    public boolean field626;

    @ObfuscatedName("bq.f(Lw;Lw;S)I")
    public int method1085(class3 arg0, class3 arg1) {
        if (arg0.field16 == arg1.field16) {
            return 0;
        }
        if (this.field626) {
            if (client.field683 == arg0.field16) {
                return -1;
            }
            if (client.field683 == arg1.field16) {
                return 1;
            }
        }
        return arg0.field16 < arg1.field16 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1085((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
