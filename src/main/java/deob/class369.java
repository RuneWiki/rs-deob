package deob;

import java.util.Comparator;

@ObfuscatedName("oy")
public final class class369 implements Comparator {

    @ObfuscatedName("oy.au(Loz;Loz;I)I")
    public int method6311(class367 arg0, class367 arg1) {
        return arg0.field4345.field4356 < arg1.field4345.field4356 ? -1 : (arg0.field4345.field4356 == arg1.field4345.field4356 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6311((class367) arg0, (class367) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
