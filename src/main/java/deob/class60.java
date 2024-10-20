package deob;

import java.util.Comparator;

@ObfuscatedName("bm")
public class class60 implements Comparator {

    @ObfuscatedName("bm.c")
    public boolean field464;

    @ObfuscatedName("bm.c(Lkj;Lkj;I)I")
    public int method1076(class310 arg0, class310 arg1) {
        if (arg0.field3898 == arg1.field3898) {
            return 0;
        }
        if (this.field464) {
            if (client.field469 == arg0.field3898) {
                return -1;
            }
            if (client.field469 == arg1.field3898) {
                return 1;
            }
        }
        return arg0.field3898 < arg1.field3898 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1076((class310) arg0, (class310) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
