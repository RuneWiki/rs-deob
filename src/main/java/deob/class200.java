package deob;

import java.util.Comparator;

@ObfuscatedName("gi")
public final class class200 implements Comparator {

    @ObfuscatedName("gi.c(Lgb;Lgb;B)I")
    public int method3401(class195 arg0, class195 arg1) {
        return arg0.field2921 < arg1.field2921 ? -1 : (arg0.field2921 == arg1.field2921 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3401((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
