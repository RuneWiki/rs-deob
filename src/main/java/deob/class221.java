package deob;

import java.util.Comparator;

@ObfuscatedName("hf")
public final class class221 implements Comparator {

    @ObfuscatedName("hf.f(Lhn;Lhn;I)I")
    public int method3796(class218 arg0, class218 arg1) {
        return arg0.field3195.field3217 < arg1.field3195.field3217 ? -1 : (arg0.field3195.field3217 == arg1.field3195.field3217 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3796((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
