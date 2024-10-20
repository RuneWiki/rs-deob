package deob;

import java.util.Comparator;

@ObfuscatedName("la")
public class class325 implements Comparator {

    @ObfuscatedName("la.n")
    public final boolean field3859;

    public class325(boolean arg0) {
        this.field3859 = arg0;
    }

    @ObfuscatedName("la.n(Ljn;Ljn;I)I")
    public int method5631(class285 arg0, class285 arg1) {
        return this.field3859 ? arg0.method4844(arg1) : arg1.method4844(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5631((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
