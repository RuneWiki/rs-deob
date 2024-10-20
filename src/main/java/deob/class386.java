package deob;

import java.util.Comparator;

@ObfuscatedName("oy")
public final class class386 implements Comparator {

    @ObfuscatedName("oy.az(Log;Log;I)I")
    public int method6482(class387 arg0, class387 arg1) {
        return arg0.field4482 < arg1.field4482 ? -1 : (arg0.field4482 == arg1.field4482 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6482((class387) arg0, (class387) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
