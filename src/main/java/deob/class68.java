package deob;

import java.util.Comparator;

@ObfuscatedName("bb")
public class class68 implements Comparator {

    @ObfuscatedName("bb.z")
    public boolean field625;

    @ObfuscatedName("bb.z(Lm;Lm;I)I")
    public int method1137(class8 arg0, class8 arg1) {
        if (arg0.field48 == arg1.field48) {
            return 0;
        }
        if (this.field625) {
            if (client.field856 == arg0.field48) {
                return -1;
            }
            if (client.field856 == arg1.field48) {
                return 1;
            }
        }
        return arg0.field48 < arg1.field48 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1137((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
