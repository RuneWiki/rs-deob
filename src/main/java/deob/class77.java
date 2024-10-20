package deob;

import java.util.Comparator;

@ObfuscatedName("be")
public class class77 implements Comparator {

    @ObfuscatedName("be.h")
    public boolean field640;

    @ObfuscatedName("be.h(La;La;B)I")
    public int method1232(class17 arg0, class17 arg1) {
        if (arg0.field69 == arg1.field69) {
            return 0;
        }
        if (this.field640) {
            if (client.field646 == arg0.field69) {
                return -1;
            }
            if (client.field646 == arg1.field69) {
                return 1;
            }
        }
        return arg0.field69 < arg1.field69 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1232((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
