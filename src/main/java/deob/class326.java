package deob;

import java.util.Comparator;

@ObfuscatedName("la")
public class class326 implements Comparator {

    @ObfuscatedName("la.f")
    public final boolean field3861;

    public class326(boolean arg0) {
        this.field3861 = arg0;
    }

    @ObfuscatedName("la.f(Ljh;Ljh;I)I")
    public int method5550(class285 arg0, class285 arg1) {
        return this.field3861 ? arg0.method4780().method4904(arg1.method4780()) : arg1.method4780().method4904(arg0.method4780());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5550((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
