package deob;

import java.util.Comparator;

@ObfuscatedName("ld")
public final class class319 implements Comparator {

    @ObfuscatedName("ld.o(Lln;Lln;B)I")
    public int method5291(class324 arg0, class324 arg1) {
        return arg0.field4083.field4095 < arg1.field4083.field4095 ? -1 : (arg0.field4083.field4095 == arg1.field4083.field4095 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5291((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
