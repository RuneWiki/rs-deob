package deob;

import java.util.Comparator;

@ObfuscatedName("nc")
public final class class364 implements Comparator {

    @ObfuscatedName("nc.au(Loz;Loz;I)I")
    public int method6268(class367 arg0, class367 arg1) {
        return arg0.field4347 < arg1.field4347 ? -1 : (arg0.field4347 == arg1.field4347 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6268((class367) arg0, (class367) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
