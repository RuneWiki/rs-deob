package deob;

import java.util.Comparator;

@ObfuscatedName("iv")
public final class class258 implements Comparator {

    @ObfuscatedName("iv.f(Ljt;Ljt;I)I")
    public int method4049(class261 arg0, class261 arg1) {
        return arg0.field3326 < arg1.field3326 ? -1 : (arg0.field3326 == arg1.field3326 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4049((class261) arg0, (class261) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
