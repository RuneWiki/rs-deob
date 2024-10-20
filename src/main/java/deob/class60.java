package deob;

import java.util.Comparator;

@ObfuscatedName("bf")
public class class60 implements Comparator {

    @ObfuscatedName("bf.v")
    public boolean field488;

    @ObfuscatedName("bf.v(Llc;Llc;B)I")
    public int method1064(class324 arg0, class324 arg1) {
        if (arg0.field4022 == arg1.field4022) {
            return 0;
        }
        if (this.field488) {
            if (client.field723 == arg0.field4022) {
                return -1;
            }
            if (client.field723 == arg1.field4022) {
                return 1;
            }
        }
        return arg0.field4022 < arg1.field4022 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1064((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
