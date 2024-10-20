package deob;

import java.util.Comparator;

@ObfuscatedName("pr")
public final class class399 implements Comparator {

    @ObfuscatedName("pr.ap(Lpv;Lpv;I)I")
    public int method7145(class400 arg0, class400 arg1) {
        return arg0.field4664 < arg1.field4664 ? -1 : (arg0.field4664 == arg1.field4664 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7145((class400) arg0, (class400) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
