package deob;

import java.util.Comparator;

@ObfuscatedName("by")
public class class74 implements Comparator {

    @ObfuscatedName("by.g")
    public boolean field849;

    @ObfuscatedName("by.g(Lp;Lp;B)I")
    public int method1162(class15 arg0, class15 arg1) {
        if (arg0.field295 == arg1.field295) {
            return 0;
        }
        if (this.field849) {
            if (client.field994 == arg0.field295) {
                return -1;
            }
            if (client.field994 == arg1.field295) {
                return 1;
            }
        }
        return arg0.field295 < arg1.field295 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1162((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
