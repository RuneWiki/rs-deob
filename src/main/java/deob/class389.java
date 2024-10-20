package deob;

import java.util.Comparator;

@ObfuscatedName("ng")
public class class389 implements Comparator {

    @ObfuscatedName("ng.f")
    public final boolean field4220;

    public class389(boolean arg0) {
        this.field4220 = arg0;
    }

    @ObfuscatedName("ng.f(Llf;Llf;I)I")
    public int method6159(class323 arg0, class323 arg1) {
        return this.field4220 ? arg0.method5145(arg1) : arg1.method5145(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6159((class323) arg0, (class323) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
