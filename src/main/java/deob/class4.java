package deob;

import java.util.Comparator;

@ObfuscatedName("t")
public final class class4 implements Comparator {

    @ObfuscatedName("t.b(Li;Li;I)I")
    public int method42(class3 arg0, class3 arg1) {
        return arg0.field18.field39 < arg1.field18.field39 ? -1 : (arg0.field18.field39 == arg1.field18.field39 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method42((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
