package deob;

import java.util.Comparator;

@ObfuscatedName("jx")
public final class class284 implements Comparator {

    @ObfuscatedName("jx.s(Ljj;Ljj;I)I")
    public int method4588(class285 arg0, class285 arg1) {
        return arg0.field3648 < arg1.field3648 ? -1 : (arg0.field3648 == arg1.field3648 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4588((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
