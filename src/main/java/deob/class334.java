package deob;

import java.util.Comparator;

@ObfuscatedName("lb")
public final class class334 implements Comparator {

    @ObfuscatedName("lb.a(Llp;Llp;I)I")
    public int method5899(class338 arg0, class338 arg1) {
        return arg0.method5924().compareTo(arg1.method5924());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5899((class338) arg0, (class338) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
