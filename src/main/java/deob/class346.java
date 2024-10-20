package deob;

import java.util.Comparator;

@ObfuscatedName("np")
public class class346 implements Comparator {

    @ObfuscatedName("np.ac(Lnt;Lnt;I)I")
    public int method6052(class339 arg0, class339 arg1) {
        return arg0.field3681 - arg1.field3681;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6052((class339) arg0, (class339) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
