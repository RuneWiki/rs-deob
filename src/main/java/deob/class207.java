package deob;

import java.util.Comparator;

@ObfuscatedName("go")
public final class class207 implements Comparator {

    @ObfuscatedName("go.t(Lgn;Lgn;I)I")
    public int method3550(class205 arg0, class205 arg1) {
        return arg0.field3051.field3071 < arg1.field3051.field3071 ? -1 : (arg0.field3051.field3071 == arg1.field3051.field3071 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3550((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
