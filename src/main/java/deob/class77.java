package deob;

import java.util.Comparator;

@ObfuscatedName("bu")
public class class77 implements Comparator {

    @ObfuscatedName("bu.n")
    public boolean field660;

    @ObfuscatedName("bu.n(Lx;Lx;I)I")
    public int method1236(class17 arg0, class17 arg1) {
        if (arg0.field87 == arg1.field87) {
            return 0;
        }
        if (this.field660) {
            if (client.field844 == arg0.field87) {
                return -1;
            }
            if (client.field844 == arg1.field87) {
                return 1;
            }
        }
        return arg0.field87 < arg1.field87 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1236((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
