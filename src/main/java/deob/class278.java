package deob;

import java.util.Comparator;

@ObfuscatedName("jr")
public final class class278 implements Comparator {

    @ObfuscatedName("jr.v(Ljs;Ljs;I)I")
    public int method4587(class283 arg0, class283 arg1) {
        return arg0.field3649.field3657 < arg1.field3649.field3657 ? -1 : (arg0.field3649.field3657 == arg1.field3649.field3657 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4587((class283) arg0, (class283) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
