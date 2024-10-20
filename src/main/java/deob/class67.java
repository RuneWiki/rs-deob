package deob;

import java.util.Comparator;

@ObfuscatedName("cb")
public class class67 implements Comparator {

    @ObfuscatedName("cb.at")
    public boolean field501;

    @ObfuscatedName("cb.at(Lod;Lod;B)I")
    public int method1119(class365 arg0, class365 arg1) {
        if (arg0.field4309 == arg1.field4309) {
            return 0;
        }
        if (this.field501) {
            if (client.field504 == arg0.field4309) {
                return -1;
            }
            if (client.field504 == arg1.field4309) {
                return 1;
            }
        }
        return arg0.field4309 < arg1.field4309 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1119((class365) arg0, (class365) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
