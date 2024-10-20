package deob;

import java.util.Comparator;

@ObfuscatedName("nt")
public final class class354 implements Comparator {

    @ObfuscatedName("nt.af(Lnu;Lnu;I)I")
    public int method6251(class352 arg0, class352 arg1) {
        return arg0.field4285.field4291 < arg1.field4285.field4291 ? -1 : (arg0.field4285.field4291 == arg1.field4285.field4291 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6251((class352) arg0, (class352) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
