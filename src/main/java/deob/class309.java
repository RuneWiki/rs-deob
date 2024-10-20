package deob;

import java.util.Comparator;

@ObfuscatedName("kv")
public final class class309 implements Comparator {

    @ObfuscatedName("kv.c(Lkj;Lkj;B)I")
    public int method5198(class310 arg0, class310 arg1) {
        return arg0.field3898 < arg1.field3898 ? -1 : (arg0.field3898 == arg1.field3898 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5198((class310) arg0, (class310) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
