package deob;

import java.util.Comparator;

@ObfuscatedName("jz")
public final class class283 implements Comparator {

    @ObfuscatedName("jz.f(Ljt;Ljt;I)I")
    public int method4632(class284 arg0, class284 arg1) {
        return arg0.field3649 < arg1.field3649 ? -1 : (arg0.field3649 == arg1.field3649 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4632((class284) arg0, (class284) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
