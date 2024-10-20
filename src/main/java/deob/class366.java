package deob;

import java.util.Comparator;

@ObfuscatedName("om")
public final class class366 implements Comparator {

    @ObfuscatedName("om.au(Loz;Loz;I)I")
    public int method6275(class367 arg0, class367 arg1) {
        return arg0.field4349 < arg1.field4349 ? -1 : (arg0.field4349 == arg1.field4349 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6275((class367) arg0, (class367) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
