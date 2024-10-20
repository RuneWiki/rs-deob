package deob;

import java.util.Comparator;

@ObfuscatedName("lr")
public class class326 implements Comparator {

    @ObfuscatedName("lr.n")
    public final boolean field3862;

    public class326(boolean arg0) {
        this.field3862 = arg0;
    }

    @ObfuscatedName("lr.n(Ljn;Ljn;I)I")
    public int method5640(class285 arg0, class285 arg1) {
        return this.field3862 ? arg0.method4851().method4967(arg1.method4851()) : arg1.method4851().method4967(arg0.method4851());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5640((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
