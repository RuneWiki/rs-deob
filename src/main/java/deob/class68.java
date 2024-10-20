package deob;

import java.util.Comparator;

@ObfuscatedName("bh")
public class class68 implements Comparator {

    @ObfuscatedName("bh.c")
    public boolean field621;

    @ObfuscatedName("bh.c(Lv;Lv;S)I")
    public int method1108(class8 arg0, class8 arg1) {
        if (arg0.field46 == arg1.field46) {
            return 0;
        }
        if (this.field621) {
            if (client.field624 == arg0.field46) {
                return -1;
            }
            if (client.field624 == arg1.field46) {
                return 1;
            }
        }
        return arg0.field46 < arg1.field46 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1108((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
