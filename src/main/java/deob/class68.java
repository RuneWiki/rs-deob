package deob;

import java.util.Comparator;

@ObfuscatedName("ba")
public class class68 implements Comparator {

    @ObfuscatedName("ba.n")
    public boolean field626;

    @ObfuscatedName("ba.n(Lz;Lz;B)I")
    public int method1146(class8 arg0, class8 arg1) {
        if (arg0.field48 == arg1.field48) {
            return 0;
        }
        if (this.field626) {
            if (client.field630 == arg0.field48) {
                return -1;
            }
            if (client.field630 == arg1.field48) {
                return 1;
            }
        }
        return arg0.field48 < arg1.field48 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1146((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
