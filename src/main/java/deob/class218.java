package deob;

import java.util.Comparator;

@ObfuscatedName("hi")
public final class class218 implements Comparator {

    @ObfuscatedName("hi.d(Lhh;Lhh;B)I")
    public int method3774(class214 arg0, class214 arg1) {
        return arg0.field3133 < arg1.field3133 ? -1 : (arg0.field3133 == arg1.field3133 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3774((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
