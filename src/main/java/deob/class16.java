package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class16 implements Comparator {

    @ObfuscatedName("q.d(Lu;Lu;B)I")
    public int method86(class15 arg0, class15 arg1) {
        return arg0.field291.field314 < arg1.field291.field314 ? -1 : (arg0.field291.field314 == arg1.field291.field314 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method86((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
