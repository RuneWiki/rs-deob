package deob;

import java.util.Comparator;

@ObfuscatedName("cn")
public class class67 implements Comparator {

    @ObfuscatedName("cn.ab")
    public boolean field471;

    @ObfuscatedName("cn.ab(Lpx;Lpx;S)I")
    public int method1141(class397 arg0, class397 arg1) {
        if (arg0.field4564 == arg1.field4564) {
            return 0;
        }
        if (this.field471) {
            if (client.field798 == arg0.field4564) {
                return -1;
            }
            if (client.field798 == arg1.field4564) {
                return 1;
            }
        }
        return arg0.field4564 < arg1.field4564 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1141((class397) arg0, (class397) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
