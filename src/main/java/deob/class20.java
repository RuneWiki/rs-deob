package deob;

import java.util.Comparator;

@ObfuscatedName("j")
public final class class20 implements Comparator {

    @ObfuscatedName("j.o(Ll;Ll;I)I")
    public int method144(class15 arg0, class15 arg1) {
        return arg0.field293 < arg1.field293 ? -1 : (arg0.field293 == arg1.field293 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method144((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
