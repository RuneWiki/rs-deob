package deob;

import java.util.Comparator;

@ObfuscatedName("bb")
public class class75 implements Comparator {

    @ObfuscatedName("bb.n")
    public boolean field863;

    @ObfuscatedName("bb.n(Lt;Lt;I)I")
    public int method1065(class15 arg0, class15 arg1) {
        if (arg0.field276 == arg1.field276) {
            return 0;
        }
        if (this.field863) {
            if (client.field874 == arg0.field276) {
                return -1;
            }
            if (client.field874 == arg1.field276) {
                return 1;
            }
        }
        return arg0.field276 < arg1.field276 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1065((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
