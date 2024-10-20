package deob;

import java.util.Comparator;

@ObfuscatedName("od")
public final class class388 implements Comparator {

    @ObfuscatedName("od.aq(Loj;Loj;B)I")
    public int method6615(class386 arg0, class386 arg1) {
        return arg0.field4454.field4463 < arg1.field4454.field4463 ? -1 : (arg0.field4454.field4463 == arg1.field4454.field4463 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6615((class386) arg0, (class386) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
