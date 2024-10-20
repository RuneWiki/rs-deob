package deob;

import java.util.Comparator;

@ObfuscatedName("ld")
public final class class337 implements Comparator {

    @ObfuscatedName("ld.a(Llp;Llp;I)I")
    public int method5917(class338 arg0, class338 arg1) {
        return arg0.field4206 < arg1.field4206 ? -1 : (arg0.field4206 == arg1.field4206 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5917((class338) arg0, (class338) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
