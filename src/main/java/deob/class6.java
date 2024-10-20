package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class6 implements Comparator {

    @ObfuscatedName("u.c(Lv;Lv;I)I")
    public int method36(class8 arg0, class8 arg1) {
        return arg0.field46 < arg1.field46 ? -1 : (arg0.field46 == arg1.field46 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method36((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
