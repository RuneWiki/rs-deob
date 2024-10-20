package deob;

import java.util.Comparator;

@ObfuscatedName("jy")
public final class class281 implements Comparator {

    @ObfuscatedName("jy.f(Ljt;Ljt;B)I")
    public int method4622(class284 arg0, class284 arg1) {
        return arg0.field3648 < arg1.field3648 ? -1 : (arg0.field3648 == arg1.field3648 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4622((class284) arg0, (class284) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
