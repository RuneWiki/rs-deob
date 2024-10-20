package deob;

import java.util.Comparator;

@ObfuscatedName("od")
public final class class385 implements Comparator {

    @ObfuscatedName("od.am(Loo;Loo;B)I")
    public int method6595(class383 arg0, class383 arg1) {
        return arg0.field4422.field4427 < arg1.field4422.field4427 ? -1 : (arg0.field4422.field4427 == arg1.field4422.field4427 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6595((class383) arg0, (class383) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
