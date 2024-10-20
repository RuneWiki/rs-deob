package deob;

import java.util.Comparator;

@ObfuscatedName("bo")
public class class74 implements Comparator {

    @ObfuscatedName("bo.c")
    public boolean field855;

    @ObfuscatedName("bo.c(Ll;Ll;I)I")
    public int method1078(class15 arg0, class15 arg1) {
        if (arg0.field274 == arg1.field274) {
            return 0;
        }
        if (this.field855) {
            if (client.field858 == arg0.field274) {
                return -1;
            }
            if (client.field858 == arg1.field274) {
                return 1;
            }
        }
        return arg0.field274 < arg1.field274 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1078((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
