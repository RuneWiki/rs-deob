package deob;

import java.util.Comparator;

@ObfuscatedName("cn")
public class class67 implements Comparator {

    @ObfuscatedName("cn.am")
    public boolean field492;

    @ObfuscatedName("cn.am(Loo;Loo;B)I")
    public int method1176(class383 arg0, class383 arg1) {
        if (arg0.field4420 == arg1.field4420) {
            return 0;
        }
        if (this.field492) {
            if (client.field499 == arg0.field4420) {
                return -1;
            }
            if (client.field499 == arg1.field4420) {
                return 1;
            }
        }
        return arg0.field4420 < arg1.field4420 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1176((class383) arg0, (class383) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
