package deob;

import java.util.Comparator;

@ObfuscatedName("ce")
public class class67 implements Comparator {

    @ObfuscatedName("ce.aq")
    public boolean field492;

    @ObfuscatedName("ce.aq(Loj;Loj;B)I")
    public int method1123(class386 arg0, class386 arg1) {
        if (arg0.field4453 == arg1.field4453) {
            return 0;
        }
        if (this.field492) {
            if (client.field522 == arg0.field4453) {
                return -1;
            }
            if (client.field522 == arg1.field4453) {
                return 1;
            }
        }
        return arg0.field4453 < arg1.field4453 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1123((class386) arg0, (class386) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
