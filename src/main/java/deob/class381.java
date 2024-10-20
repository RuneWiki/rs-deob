package deob;

import java.util.Comparator;

@ObfuscatedName("ov")
public final class class381 implements Comparator {

    @ObfuscatedName("ov.ac(Lod;Lod;I)I")
    public int method6424(class382 arg0, class382 arg1) {
        return arg0.field4395 < arg1.field4395 ? -1 : (arg0.field4395 == arg1.field4395 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6424((class382) arg0, (class382) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
