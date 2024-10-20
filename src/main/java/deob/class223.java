package deob;

import java.util.Comparator;

@ObfuscatedName("hl")
public final class class223 implements Comparator {

    @ObfuscatedName("hl.x(Lhu;Lhu;I)I")
    public int method3755(class218 arg0, class218 arg1) {
        return arg0.field3205 < arg1.field3205 ? -1 : (arg0.field3205 == arg1.field3205 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3755((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
