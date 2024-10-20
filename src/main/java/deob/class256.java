package deob;

import java.util.Comparator;

@ObfuscatedName("ix")
public final class class256 implements Comparator {

    @ObfuscatedName("ix.f(Ljt;Ljt;I)I")
    public int method4034(class261 arg0, class261 arg1) {
        return arg0.field3324.field3330 < arg1.field3324.field3330 ? -1 : (arg0.field3324.field3330 == arg1.field3324.field3330 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4034((class261) arg0, (class261) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
