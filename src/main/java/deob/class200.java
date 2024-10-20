package deob;

import java.util.Comparator;

@ObfuscatedName("gl")
public final class class200 implements Comparator {

    @ObfuscatedName("gl.f(Lgg;Lgg;B)I")
    public int method3431(class195 arg0, class195 arg1) {
        return arg0.field2910 < arg1.field2910 ? -1 : (arg0.field2910 == arg1.field2910 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3431((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
