package deob;

import java.util.Comparator;

@ObfuscatedName("hu")
public final class class210 implements Comparator {

    @ObfuscatedName("hu.y(Lgv;Lgv;B)I")
    public int method3564(class205 arg0, class205 arg1) {
        return arg0.field3056 < arg1.field3056 ? -1 : (arg0.field3056 == arg1.field3056 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3564((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
