package deob;

import java.util.Comparator;

@ObfuscatedName("os")
public final class class390 implements Comparator {

    @ObfuscatedName("os.ak(Lpm;Lpm;I)I")
    public int method6699(class395 arg0, class395 arg1) {
        return arg0.field4566.field4573 < arg1.field4566.field4573 ? -1 : (arg0.field4566.field4573 == arg1.field4566.field4573 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6699((class395) arg0, (class395) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
