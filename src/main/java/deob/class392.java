package deob;

import java.util.Comparator;

@ObfuscatedName("pv")
public final class class392 implements Comparator {

    @ObfuscatedName("pv.aq(Lpm;Lpm;I)I")
    public int method6677(class396 arg0, class396 arg1) {
        return arg0.method6698().compareTo(arg1.method6698());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6677((class396) arg0, (class396) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
