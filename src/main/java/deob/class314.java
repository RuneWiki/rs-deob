package deob;

import java.util.Comparator;

@ObfuscatedName("lb")
public class class314 implements Comparator {

    @ObfuscatedName("lb.g")
    public final boolean field3833;

    public class314(boolean arg0) {
        this.field3833 = arg0;
    }

    @ObfuscatedName("lb.g(Ljr;Ljr;B)I")
    public int method5501(class285 arg0, class285 arg1) {
        return this.field3833 ? arg0.method5132(arg1) : arg1.method5132(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5501((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
