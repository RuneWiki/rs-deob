package deob;

import java.util.Comparator;

@ObfuscatedName("kn")
public final class class287 implements Comparator {

    @ObfuscatedName("kn.s(Ljj;Ljj;B)I")
    public int method4629(class285 arg0, class285 arg1) {
        return arg0.field3647.field3656 < arg1.field3647.field3656 ? -1 : (arg0.field3647.field3656 == arg1.field3647.field3656 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4629((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
