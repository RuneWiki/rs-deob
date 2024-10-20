package deob;

import java.util.Comparator;

@ObfuscatedName("bu")
public class class74 implements Comparator {

    @ObfuscatedName("bu.t")
    public boolean field847;

    @ObfuscatedName("bu.t(Lu;Lu;I)I")
    public int method1135(class15 arg0, class15 arg1) {
        if (arg0.field276 == arg1.field276) {
            return 0;
        }
        if (this.field847) {
            if (client.field850 == arg0.field276) {
                return -1;
            }
            if (client.field850 == arg1.field276) {
                return 1;
            }
        }
        return arg0.field276 < arg1.field276 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1135((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
