package deob;

import java.util.Comparator;

@ObfuscatedName("le")
public class class313 implements Comparator {

    @ObfuscatedName("le.v")
    public final boolean field3780;

    public class313(boolean arg0) {
        this.field3780 = arg0;
    }

    @ObfuscatedName("le.v(Ljx;Ljx;B)I")
    public int method5315(class285 arg0, class285 arg1) {
        return this.field3780 ? arg0.method4951().method5086(arg1.method4951()) : arg1.method4951().method5086(arg0.method4951());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5315((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
