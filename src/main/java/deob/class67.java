package deob;

import java.util.Comparator;

@ObfuscatedName("ce")
public class class67 implements Comparator {

    @ObfuscatedName("ce.ak")
    public boolean field498;

    @ObfuscatedName("ce.ak(Lpm;Lpm;B)I")
    public int method1133(class395 arg0, class395 arg1) {
        if (arg0.field4568 == arg1.field4568) {
            return 0;
        }
        if (this.field498) {
            if (client.field600 == arg0.field4568) {
                return -1;
            }
            if (client.field600 == arg1.field4568) {
                return 1;
            }
        }
        return arg0.field4568 < arg1.field4568 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1133((class395) arg0, (class395) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
