package deob;

import java.util.Comparator;

@ObfuscatedName("ck")
public class class64 implements Comparator {

    @ObfuscatedName("ck.aj")
    public boolean field477;

    @ObfuscatedName("ck.aj(Lnv;Lnv;B)I")
    public int method1133(class348 arg0, class348 arg1) {
        if (arg0.field4258 == arg1.field4258) {
            return 0;
        }
        if (this.field477) {
            if (client.field482 == arg0.field4258) {
                return -1;
            }
            if (client.field482 == arg1.field4258) {
                return 1;
            }
        }
        return arg0.field4258 < arg1.field4258 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1133((class348) arg0, (class348) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
