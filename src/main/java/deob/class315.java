package deob;

import java.util.Comparator;

@ObfuscatedName("lw")
public class class315 implements Comparator {

    @ObfuscatedName("lw.g")
    public final boolean field3835;

    public class315(boolean arg0) {
        this.field3835 = arg0;
    }

    @ObfuscatedName("lw.g(Ljr;Ljr;B)I")
    public int method5524(class285 arg0, class285 arg1) {
        return this.field3835 ? arg0.method5128().method5273(arg1.method5128()) : arg1.method5128().method5273(arg0.method5128());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5524((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
