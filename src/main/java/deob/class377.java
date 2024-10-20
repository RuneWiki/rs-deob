package deob;

import java.util.Comparator;

@ObfuscatedName("oc")
public final class class377 implements Comparator {

    @ObfuscatedName("oc.ac(Lod;Lod;I)I")
    public int method6393(class382 arg0, class382 arg1) {
        return arg0.field4392.field4398 < arg1.field4392.field4398 ? -1 : (arg0.field4392.field4398 == arg1.field4392.field4398 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6393((class382) arg0, (class382) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
