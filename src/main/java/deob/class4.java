package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class4 implements Comparator {

    @ObfuscatedName("u.y(Ln;Ln;I)I")
    public int method23(class3 arg0, class3 arg1) {
        return arg0.field16.field38 < arg1.field16.field38 ? -1 : (arg0.field16.field38 == arg1.field16.field38 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method23((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
