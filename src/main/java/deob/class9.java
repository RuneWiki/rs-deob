package deob;

import java.util.Comparator;

@ObfuscatedName("i")
public final class class9 implements Comparator {

    @ObfuscatedName("i.a(Lo;Lo;I)I")
    public int method92(class8 arg0, class8 arg1) {
        return arg0.field45.field60 < arg1.field45.field60 ? -1 : (arg0.field45.field60 == arg1.field45.field60 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method92((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
