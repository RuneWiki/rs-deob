package deob;

import java.util.Comparator;

@ObfuscatedName("hh")
public final class class221 implements Comparator {

    @ObfuscatedName("hh.e(Lht;Lht;B)I")
    public int method3809(class218 arg0, class218 arg1) {
        return arg0.field3195.field3216 < arg1.field3195.field3216 ? -1 : (arg0.field3195.field3216 == arg1.field3195.field3216 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3809((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
