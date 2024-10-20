package deob;

import java.util.Comparator;

@ObfuscatedName("oi")
public final class class384 implements Comparator {

    @ObfuscatedName("oi.az(Log;Log;I)I")
    public int method6470(class387 arg0, class387 arg1) {
        return arg0.field4483 < arg1.field4483 ? -1 : (arg0.field4483 == arg1.field4483 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6470((class387) arg0, (class387) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
