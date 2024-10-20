package deob;

import java.util.Comparator;

@ObfuscatedName("hs")
public final class class222 implements Comparator {

    @ObfuscatedName("hs.x(Lhu;Lhu;B)I")
    public int method3747(class218 arg0, class218 arg1) {
        return arg0.field3207 < arg1.field3207 ? -1 : (arg0.field3207 == arg1.field3207 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3747((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
