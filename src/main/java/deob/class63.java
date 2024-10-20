package deob;

import java.util.Comparator;

@ObfuscatedName("bt")
public class class63 implements Comparator {

    @ObfuscatedName("bt.f")
    public boolean field607;

    @ObfuscatedName("bt.f(Le;Le;B)I")
    public int method1068(class3 arg0, class3 arg1) {
        if (arg0.field20 == arg1.field20) {
            return 0;
        }
        if (this.field607) {
            if (client.field610 == arg0.field20) {
                return -1;
            }
            if (client.field610 == arg1.field20) {
                return 1;
            }
        }
        return arg0.field20 < arg1.field20 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1068((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
