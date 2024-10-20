package deob;

import java.util.Comparator;

@ObfuscatedName("jr")
public final class class279 implements Comparator {

    @ObfuscatedName("jr.f(Ljt;Ljt;I)I")
    public int method4610(class284 arg0, class284 arg1) {
        return arg0.field3651.field3657 < arg1.field3651.field3657 ? -1 : (arg0.field3651.field3657 == arg1.field3651.field3657 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4610((class284) arg0, (class284) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
