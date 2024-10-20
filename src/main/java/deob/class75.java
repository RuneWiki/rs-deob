package deob;

import java.util.Comparator;

@ObfuscatedName("bp")
public class class75 implements Comparator {

    @ObfuscatedName("bp.d")
    public boolean field864;

    @ObfuscatedName("bp.d(Ly;Ly;B)I")
    public int method1084(class15 arg0, class15 arg1) {
        if (arg0.field281 == arg1.field281) {
            return 0;
        }
        if (this.field864) {
            if (client.field1040 == arg0.field281) {
                return -1;
            }
            if (client.field1040 == arg1.field281) {
                return 1;
            }
        }
        return arg0.field281 < arg1.field281 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1084((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
