package deob;

import java.util.Comparator;

@ObfuscatedName("bv")
public class class73 implements Comparator {

    @ObfuscatedName("bv.p")
    public boolean field821;

    @ObfuscatedName("bv.p(Ln;Ln;I)I")
    public int method1082(class15 arg0, class15 arg1) {
        if (arg0.field274 == arg1.field274) {
            return 0;
        }
        if (this.field821) {
            if (client.field996 == arg0.field274) {
                return -1;
            }
            if (client.field996 == arg1.field274) {
                return 1;
            }
        }
        return arg0.field274 < arg1.field274 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1082((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
