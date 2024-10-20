package deob;

import java.util.Comparator;

@ObfuscatedName("bv")
public class class64 implements Comparator {

    @ObfuscatedName("bv.a")
    public boolean field487;

    @ObfuscatedName("bv.a(Llp;Llp;I)I")
    public int method1114(class338 arg0, class338 arg1) {
        if (arg0.field4206 == arg1.field4206) {
            return 0;
        }
        if (this.field487) {
            if (client.field726 == arg0.field4206) {
                return -1;
            }
            if (client.field726 == arg1.field4206) {
                return 1;
            }
        }
        return arg0.field4206 < arg1.field4206 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1114((class338) arg0, (class338) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
