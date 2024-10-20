package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class4 implements Comparator {

    @ObfuscatedName("q.g(Le;Le;B)I")
    public int method31(class3 arg0, class3 arg1) {
        return arg0.field20.field34 < arg1.field20.field34 ? -1 : (arg0.field20.field34 == arg1.field20.field34 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method31((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
