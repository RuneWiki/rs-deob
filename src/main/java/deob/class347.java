package deob;

import java.util.Comparator;

@ObfuscatedName("nn")
public final class class347 implements Comparator {

    @ObfuscatedName("nn.af(Lnu;Lnu;B)I")
    public int method6170(class352 arg0, class352 arg1) {
        return arg0.field4285.field4293 < arg1.field4285.field4293 ? -1 : (arg0.field4285.field4293 == arg1.field4285.field4293 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6170((class352) arg0, (class352) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
