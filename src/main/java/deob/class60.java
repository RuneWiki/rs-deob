package deob;

import java.util.Comparator;

@ObfuscatedName("bm")
public class class60 implements Comparator {

    @ObfuscatedName("bm.c")
    public boolean field490;

    @ObfuscatedName("bm.c(Lld;Lld;I)I")
    public int method1041(class315 arg0, class315 arg1) {
        if (arg0.field3956 == arg1.field3956) {
            return 0;
        }
        if (this.field490) {
            if (client.field496 == arg0.field3956) {
                return -1;
            }
            if (client.field496 == arg1.field3956) {
                return 1;
            }
        }
        return arg0.field3956 < arg1.field3956 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1041((class315) arg0, (class315) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
