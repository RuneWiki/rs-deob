package deob;

import java.util.Comparator;

@ObfuscatedName("mp")
public final class class341 implements Comparator {

    @ObfuscatedName("mp.f(Lmv;Lmv;I)I")
    public int method6104(class345 arg0, class345 arg1) {
        return arg0.method6138().compareTo(arg1.method6138());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6104((class345) arg0, (class345) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
