package deob;

import java.util.Comparator;

@ObfuscatedName("nr")
public final class class360 implements Comparator {

    @ObfuscatedName("nr.at(Lod;Lod;B)I")
    public int method6180(class365 arg0, class365 arg1) {
        return arg0.field4310.field4317 < arg1.field4310.field4317 ? -1 : (arg0.field4310.field4317 == arg1.field4310.field4317 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6180((class365) arg0, (class365) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
