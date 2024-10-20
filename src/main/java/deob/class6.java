package deob;

import java.util.Comparator;

@ObfuscatedName("n")
public final class class6 implements Comparator {

    @ObfuscatedName("n.w(Lq;Lq;B)I")
    public int method68(class3 arg0, class3 arg1) {
        return arg0.field14.field28 < arg1.field14.field28 ? -1 : (arg0.field14.field28 == arg1.field14.field28 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method68((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
