package deob;

import java.util.Comparator;

@ObfuscatedName("np")
public final class class349 implements Comparator {

    @ObfuscatedName("np.af(Lnu;Lnu;B)I")
    public int method6199(class352 arg0, class352 arg1) {
        return arg0.field4283 < arg1.field4283 ? -1 : (arg0.field4283 == arg1.field4283 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6199((class352) arg0, (class352) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
