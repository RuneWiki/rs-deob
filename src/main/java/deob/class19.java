package deob;

import java.util.Comparator;

@ObfuscatedName("e")
public final class class19 implements Comparator {

    @ObfuscatedName("e.i(Lv;Lv;I)I")
    public int method133(class15 arg0, class15 arg1) {
        return arg0.method75().compareTo(arg1.method75());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method133((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
