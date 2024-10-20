package deob;

import java.util.Comparator;

@ObfuscatedName("hn")
public final class class209 implements Comparator {

    @ObfuscatedName("hn.q(Lgd;Lgd;S)I")
    public int method3453(class204 arg0, class204 arg1) {
        return arg0.field2993 < arg1.field2993 ? -1 : (arg0.field2993 == arg1.field2993 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3453((class204) arg0, (class204) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
