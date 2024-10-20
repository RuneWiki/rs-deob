package deob;

import java.util.Comparator;

@ObfuscatedName("lc")
public class class314 implements Comparator {

    @ObfuscatedName("lc.y")
    public final boolean field3800;

    public class314(boolean arg0) {
        this.field3800 = arg0;
    }

    @ObfuscatedName("lc.y(Ljd;Ljd;B)I")
    public int method5307(class285 arg0, class285 arg1) {
        return this.field3800 ? arg0.method4963(arg1) : arg1.method4963(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5307((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
