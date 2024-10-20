package deob;

import java.util.Comparator;

@ObfuscatedName("bf")
public class class63 implements Comparator {

    @ObfuscatedName("bf.c")
    public boolean field637;

    @ObfuscatedName("bf.c(Lm;Lm;I)I")
    public int method1070(class3 arg0, class3 arg1) {
        if (arg0.field20 == arg1.field20) {
            return 0;
        }
        if (this.field637) {
            if (client.field738 == arg0.field20) {
                return -1;
            }
            if (client.field738 == arg1.field20) {
                return 1;
            }
        }
        return arg0.field20 < arg1.field20 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1070((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
