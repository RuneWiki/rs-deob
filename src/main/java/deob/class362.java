package deob;

import java.util.Comparator;

@ObfuscatedName("nh")
public final class class362 implements Comparator {

    @ObfuscatedName("nh.at(Lod;Lod;I)I")
    public int method6203(class365 arg0, class365 arg1) {
        return arg0.field4311 < arg1.field4311 ? -1 : (arg0.field4311 == arg1.field4311 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6203((class365) arg0, (class365) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
