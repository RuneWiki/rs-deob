package deob;

import java.util.Comparator;

@ObfuscatedName("bp")
public class class74 implements Comparator {

    @ObfuscatedName("bp.d")
    public boolean field854;

    @ObfuscatedName("bp.d(Lu;Lu;I)I")
    public int method1080(class15 arg0, class15 arg1) {
        if (arg0.field292 == arg1.field292) {
            return 0;
        }
        if (this.field854) {
            if (client.field1084 == arg0.field292) {
                return -1;
            }
            if (client.field1084 == arg1.field292) {
                return 1;
            }
        }
        return arg0.field292 < arg1.field292 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1080((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
