package deob;

import java.util.Comparator;

@ObfuscatedName("lr")
public class class325 implements Comparator {

    @ObfuscatedName("lr.f")
    public final boolean field3857;

    public class325(boolean arg0) {
        this.field3857 = arg0;
    }

    @ObfuscatedName("lr.f(Ljh;Ljh;B)I")
    public int method5542(class285 arg0, class285 arg1) {
        return this.field3857 ? arg0.method4771(arg1) : arg1.method4771(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5542((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
