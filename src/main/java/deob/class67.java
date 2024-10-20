package deob;

import java.util.Comparator;

@ObfuscatedName("cx")
public class class67 implements Comparator {

    @ObfuscatedName("cx.ap")
    public boolean field468;

    @ObfuscatedName("cx.ap(Lpv;Lpv;I)I")
    public int method1212(class400 arg0, class400 arg1) {
        if (arg0.field4664 == arg1.field4664) {
            return 0;
        }
        if (this.field468) {
            if (client.field502 == arg0.field4664) {
                return -1;
            }
            if (client.field502 == arg1.field4664) {
                return 1;
            }
        }
        return arg0.field4664 < arg1.field4664 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1212((class400) arg0, (class400) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
