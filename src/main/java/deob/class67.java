package deob;

import java.util.Comparator;

@ObfuscatedName("cn")
public class class67 implements Comparator {

    @ObfuscatedName("cn.at")
    public boolean field481;

    @ObfuscatedName("cn.at(Log;Log;I)I")
    public int method1171(class379 arg0, class379 arg1) {
        if (arg0.field4367 == arg1.field4367) {
            return 0;
        }
        if (this.field481) {
            if (client.field591 == arg0.field4367) {
                return -1;
            }
            if (client.field591 == arg1.field4367) {
                return 1;
            }
        }
        return arg0.field4367 < arg1.field4367 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1171((class379) arg0, (class379) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
