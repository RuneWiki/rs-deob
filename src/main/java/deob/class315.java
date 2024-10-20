package deob;

import java.util.Comparator;

@ObfuscatedName("ln")
public class class315 implements Comparator {

    @ObfuscatedName("ln.c")
    public final boolean field3802;

    public class315(boolean arg0) {
        this.field3802 = arg0;
    }

    @ObfuscatedName("ln.c(Ljx;Ljx;I)I")
    public int method5316(class285 arg0, class285 arg1) {
        return this.field3802 ? arg0.method4943().method5077(arg1.method4943()) : arg1.method4943().method5077(arg0.method4943());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5316((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
