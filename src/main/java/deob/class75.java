package deob;

import java.util.Comparator;

@ObfuscatedName("bh")
public class class75 implements Comparator {

    @ObfuscatedName("bh.m")
    public boolean field860;

    @ObfuscatedName("bh.m(Lk;Lk;B)I")
    public int method1091(class15 arg0, class15 arg1) {
        if (arg0.field292 == arg1.field292) {
            return 0;
        }
        if (this.field860) {
            if (client.field871 == arg0.field292) {
                return -1;
            }
            if (client.field871 == arg1.field292) {
                return 1;
            }
        }
        return arg0.field292 < arg1.field292 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1091((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
