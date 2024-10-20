package deob;

import java.util.Comparator;

@ObfuscatedName("hl")
public final class class217 implements Comparator {

    @ObfuscatedName("hl.z(Lhh;Lhh;B)I")
    public int method3621(class214 arg0, class214 arg1) {
        return arg0.field3135.field3154 < arg1.field3135.field3154 ? -1 : (arg0.field3135.field3154 == arg1.field3135.field3154 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3621((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
