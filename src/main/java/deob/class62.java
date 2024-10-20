package deob;

import java.util.Comparator;

@ObfuscatedName("by")
public class class62 implements Comparator {

    @ObfuscatedName("by.w")
    public boolean field592;

    @ObfuscatedName("by.w(Lq;Lq;B)I")
    public int method1088(class3 arg0, class3 arg1) {
        if (arg0.field18 == arg1.field18) {
            return 0;
        }
        if (this.field592) {
            if (client.field677 == arg0.field18) {
                return -1;
            }
            if (client.field677 == arg1.field18) {
                return 1;
            }
        }
        return arg0.field18 < arg1.field18 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1088((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
