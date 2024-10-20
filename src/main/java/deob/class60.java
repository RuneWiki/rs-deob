package deob;

import java.util.Comparator;

@ObfuscatedName("bz")
public class class60 implements Comparator {

    @ObfuscatedName("bz.c")
    public boolean field486;

    @ObfuscatedName("bz.c(Lla;Lla;S)I")
    public int method1112(class325 arg0, class325 arg1) {
        if (arg0.field4100 == arg1.field4100) {
            return 0;
        }
        if (this.field486) {
            if (client.field493 == arg0.field4100) {
                return -1;
            }
            if (client.field493 == arg1.field4100) {
                return 1;
            }
        }
        return arg0.field4100 < arg1.field4100 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1112((class325) arg0, (class325) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
