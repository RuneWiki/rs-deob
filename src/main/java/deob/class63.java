package deob;

import java.util.Comparator;

@ObfuscatedName("bb")
public class class63 implements Comparator {

    @ObfuscatedName("bb.g")
    public boolean field637;

    @ObfuscatedName("bb.g(Le;Le;B)I")
    public int method1144(class3 arg0, class3 arg1) {
        if (arg0.field18 == arg1.field18) {
            return 0;
        }
        if (this.field637) {
            if (client.field692 == arg0.field18) {
                return -1;
            }
            if (client.field692 == arg1.field18) {
                return 1;
            }
        }
        return arg0.field18 < arg1.field18 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1144((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
