package deob;

import java.util.Comparator;

@ObfuscatedName("ja")
public final class class263 implements Comparator {

    @ObfuscatedName("ja.f(Ljt;Ljt;S)I")
    public int method4097(class261 arg0, class261 arg1) {
        return arg0.field3324.field3329 < arg1.field3324.field3329 ? -1 : (arg0.field3324.field3329 == arg1.field3324.field3329 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4097((class261) arg0, (class261) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
