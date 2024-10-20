package deob;

import java.util.Comparator;

@ObfuscatedName("by")
public class class68 implements Comparator {

    @ObfuscatedName("by.q")
    public boolean field649;

    @ObfuscatedName("by.q(Li;Li;I)I")
    public int method1090(class8 arg0, class8 arg1) {
        if (arg0.field52 == arg1.field52) {
            return 0;
        }
        if (this.field649) {
            if (client.field808 == arg0.field52) {
                return -1;
            }
            if (client.field808 == arg1.field52) {
                return 1;
            }
        }
        return arg0.field52 < arg1.field52 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1090((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
