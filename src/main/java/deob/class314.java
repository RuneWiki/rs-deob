package deob;

import java.util.Comparator;

@ObfuscatedName("lf")
public final class class314 implements Comparator {

    @ObfuscatedName("lf.c(Lld;Lld;I)I")
    public int method5156(class315 arg0, class315 arg1) {
        return arg0.field3956 < arg1.field3956 ? -1 : (arg0.field3956 == arg1.field3956 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5156((class315) arg0, (class315) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
