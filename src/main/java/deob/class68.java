package deob;

import java.util.Comparator;

@ObfuscatedName("bm")
public class class68 implements Comparator {

    @ObfuscatedName("bm.a")
    public boolean field631;

    @ObfuscatedName("bm.a(Lo;Lo;B)I")
    public int method1207(class8 arg0, class8 arg1) {
        if (arg0.field43 == arg1.field43) {
            return 0;
        }
        if (this.field631) {
            if (client.field701 == arg0.field43) {
                return -1;
            }
            if (client.field701 == arg1.field43) {
                return 1;
            }
        }
        return arg0.field43 < arg1.field43 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1207((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
