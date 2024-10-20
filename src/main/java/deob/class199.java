package deob;

import java.util.Comparator;

@ObfuscatedName("gi")
public final class class199 implements Comparator {

    @ObfuscatedName("gi.x(Lgr;Lgr;B)I")
    public int method3431(class195 arg0, class195 arg1) {
        return arg0.field2909 < arg1.field2909 ? -1 : (arg0.field2909 == arg1.field2909 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3431((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
