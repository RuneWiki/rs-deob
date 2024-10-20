package deob;

import java.util.Comparator;

@ObfuscatedName("bu")
public class class60 implements Comparator {

    @ObfuscatedName("bu.l")
    public boolean field479;

    @ObfuscatedName("bu.l(Lkd;Lkd;B)I")
    public int method1036(class298 arg0, class298 arg1) {
        if (arg0.field3757 == arg1.field3757) {
            return 0;
        }
        if (this.field479) {
            if (client.field483 == arg0.field3757) {
                return -1;
            }
            if (client.field483 == arg1.field3757) {
                return 1;
            }
        }
        return arg0.field3757 < arg1.field3757 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1036((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
