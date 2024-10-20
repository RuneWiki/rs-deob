package deob;

import java.util.Comparator;

@ObfuscatedName("mu")
public class class328 implements Comparator {

    @ObfuscatedName("mu.at(Lmm;Lmm;I)I")
    public int method5597(class321 arg0, class321 arg1) {
        return arg0.field3476 - arg1.field3476;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5597((class321) arg0, (class321) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
