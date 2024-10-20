package deob;

import java.util.Comparator;

@ObfuscatedName("pw")
public final class class395 implements Comparator {

    @ObfuscatedName("pw.ap(Lpv;Lpv;B)I")
    public int method7111(class400 arg0, class400 arg1) {
        return arg0.field4662.field4670 < arg1.field4662.field4670 ? -1 : (arg0.field4662.field4670 == arg1.field4662.field4670 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7111((class400) arg0, (class400) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
