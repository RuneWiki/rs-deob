package deob;

import java.util.Comparator;

@ObfuscatedName("bk")
public class class75 implements Comparator {

    @ObfuscatedName("bk.v")
    public boolean field634;

    @ObfuscatedName("bk.v(Ljs;Ljs;I)I")
    public int method1004(class283 arg0, class283 arg1) {
        if (arg0.field3650 == arg1.field3650) {
            return 0;
        }
        if (this.field634) {
            if (client.field638 == arg0.field3650) {
                return -1;
            }
            if (client.field638 == arg1.field3650) {
                return 1;
            }
        }
        return arg0.field3650 < arg1.field3650 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1004((class283) arg0, (class283) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
