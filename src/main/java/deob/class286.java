package deob;

import java.util.Comparator;

@ObfuscatedName("jx")
public final class class286 implements Comparator {

    @ObfuscatedName("jx.f(Ljt;Ljt;I)I")
    public int method4662(class284 arg0, class284 arg1) {
        return arg0.field3651.field3656 < arg1.field3651.field3656 ? -1 : (arg0.field3651.field3656 == arg1.field3651.field3656 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4662((class284) arg0, (class284) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
