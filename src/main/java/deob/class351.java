package deob;

import java.util.Comparator;

@ObfuscatedName("ny")
public final class class351 implements Comparator {

    @ObfuscatedName("ny.af(Lnu;Lnu;I)I")
    public int method6210(class352 arg0, class352 arg1) {
        return arg0.field4284 < arg1.field4284 ? -1 : (arg0.field4284 == arg1.field4284 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6210((class352) arg0, (class352) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
