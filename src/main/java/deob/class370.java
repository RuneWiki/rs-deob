package deob;

import java.util.Comparator;

@ObfuscatedName("ov")
public final class class370 implements Comparator {

    @ObfuscatedName("ov.aw(Lol;Lol;I)I")
    public int method6309(class368 arg0, class368 arg1) {
        return arg0.field4346.field4355 < arg1.field4346.field4355 ? -1 : (arg0.field4346.field4355 == arg1.field4346.field4355 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6309((class368) arg0, (class368) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
