package deob;

import java.util.Comparator;

@ObfuscatedName("cc")
public class class67 implements Comparator {

    @ObfuscatedName("cc.ac")
    public boolean field486;

    @ObfuscatedName("cc.ac(Lpv;Lpv;I)I")
    public int method1185(class399 arg0, class399 arg1) {
        if (arg0.field4614 == arg1.field4614) {
            return 0;
        }
        if (this.field486) {
            if (client.field516 == arg0.field4614) {
                return -1;
            }
            if (client.field516 == arg1.field4614) {
                return 1;
            }
        }
        return arg0.field4614 < arg1.field4614 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1185((class399) arg0, (class399) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
