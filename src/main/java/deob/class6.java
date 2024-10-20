package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class6 implements Comparator {

    @ObfuscatedName("u.m(Ll;Ll;I)I")
    public int method45(class8 arg0, class8 arg1) {
        return arg0.field40 < arg1.field40 ? -1 : (arg0.field40 == arg1.field40 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method45((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
