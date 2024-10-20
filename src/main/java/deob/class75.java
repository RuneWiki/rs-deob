package deob;

import java.util.Comparator;

@ObfuscatedName("bz")
public class class75 implements Comparator {

    @ObfuscatedName("bz.f")
    public boolean field598;

    @ObfuscatedName("bz.f(Ljt;Ljt;I)I")
    public int method973(class261 arg0, class261 arg1) {
        if (arg0.field3322 == arg1.field3322) {
            return 0;
        }
        if (this.field598) {
            if (client.field600 == arg0.field3322) {
                return -1;
            }
            if (client.field600 == arg1.field3322) {
                return 1;
            }
        }
        return arg0.field3322 < arg1.field3322 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method973((class261) arg0, (class261) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
