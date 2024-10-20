package deob;

import java.util.Comparator;

@ObfuscatedName("nk")
public final class class364 implements Comparator {

    @ObfuscatedName("nk.at(Lod;Lod;B)I")
    public int method6209(class365 arg0, class365 arg1) {
        return arg0.field4309 < arg1.field4309 ? -1 : (arg0.field4309 == arg1.field4309 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6209((class365) arg0, (class365) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
