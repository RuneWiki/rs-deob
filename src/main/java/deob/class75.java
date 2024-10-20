package deob;

import java.util.Comparator;

@ObfuscatedName("bo")
public class class75 implements Comparator {

    @ObfuscatedName("bo.b")
    public boolean field848;

    @ObfuscatedName("bo.b(Lj;Lj;I)I")
    public int method1010(class15 arg0, class15 arg1) {
        if (arg0.field278 == arg1.field278) {
            return 0;
        }
        if (this.field848) {
            if (client.field940 == arg0.field278) {
                return -1;
            }
            if (client.field940 == arg1.field278) {
                return 1;
            }
        }
        return arg0.field278 < arg1.field278 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1010((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
