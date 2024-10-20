package deob;

import java.util.Comparator;

@ObfuscatedName("ne")
public final class class363 implements Comparator {

    @ObfuscatedName("ne.aw(Lol;Lol;I)I")
    public int method6243(class368 arg0, class368 arg1) {
        return arg0.field4346.field4354 < arg1.field4346.field4354 ? -1 : (arg0.field4346.field4354 == arg1.field4346.field4354 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6243((class368) arg0, (class368) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
