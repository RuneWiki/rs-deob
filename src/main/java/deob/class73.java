package deob;

import java.util.Comparator;

@ObfuscatedName("bm")
public class class73 implements Comparator {

    @ObfuscatedName("bm.b")
    public boolean field819;

    @ObfuscatedName("bm.b(Ls;Ls;I)I")
    public int method1123(class15 arg0, class15 arg1) {
        if (arg0.field276 == arg1.field276) {
            return 0;
        }
        if (this.field819) {
            if (client.field1043 == arg0.field276) {
                return -1;
            }
            if (client.field1043 == arg1.field276) {
                return 1;
            }
        }
        return arg0.field276 < arg1.field276 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1123((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
