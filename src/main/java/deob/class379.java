package deob;

import java.util.Comparator;

@ObfuscatedName("oy")
public final class class379 implements Comparator {

    @ObfuscatedName("oy.ac(Lod;Lod;I)I")
    public int method6420(class382 arg0, class382 arg1) {
        return arg0.field4391 < arg1.field4391 ? -1 : (arg0.field4391 == arg1.field4391 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6420((class382) arg0, (class382) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
