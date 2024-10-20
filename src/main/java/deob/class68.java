package deob;

import java.util.Comparator;

@ObfuscatedName("cm")
public class class68 implements Comparator {

    @ObfuscatedName("cm.ac")
    public boolean field515;

    @ObfuscatedName("cm.ac(Lod;Lod;S)I")
    public int method1158(class382 arg0, class382 arg1) {
        if (arg0.field4395 == arg1.field4395) {
            return 0;
        }
        if (this.field515) {
            if (client.field519 == arg0.field4395) {
                return -1;
            }
            if (client.field519 == arg1.field4395) {
                return 1;
            }
        }
        return arg0.field4395 < arg1.field4395 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1158((class382) arg0, (class382) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
