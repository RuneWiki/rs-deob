package deob;

import java.util.Comparator;

@ObfuscatedName("pp")
public final class class402 implements Comparator {

    @ObfuscatedName("pp.ap(Lpv;Lpv;B)I")
    public int method7178(class400 arg0, class400 arg1) {
        return arg0.field4662.field4667 < arg1.field4662.field4667 ? -1 : (arg0.field4662.field4667 == arg1.field4662.field4667 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7178((class400) arg0, (class400) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
