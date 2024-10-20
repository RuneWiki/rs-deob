package deob;

import java.util.Comparator;

@ObfuscatedName("ki")
public final class class293 implements Comparator {

    @ObfuscatedName("ki.i(Lkt;Lkt;I)I")
    public int method4843(class298 arg0, class298 arg1) {
        return arg0.field3747.field3753 < arg1.field3747.field3753 ? -1 : (arg0.field3747.field3753 == arg1.field3747.field3753 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4843((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
