package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class4 implements Comparator {

    @ObfuscatedName("q.d(Ln;Ln;I)I")
    public int method30(class3 arg0, class3 arg1) {
        return arg0.field22.field42 < arg1.field22.field42 ? -1 : (arg0.field22.field42 == arg1.field22.field42 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method30((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
