package deob;

import java.util.Comparator;

@ObfuscatedName("nd")
public class class390 implements Comparator {

    @ObfuscatedName("nd.f")
    public final boolean field4226;

    public class390(boolean arg0) {
        this.field4226 = arg0;
    }

    @ObfuscatedName("nd.f(Llf;Llf;I)I")
    public int method6164(class323 arg0, class323 arg1) {
        return this.field4226 ? arg0.method5177().method5266(arg1.method5177()) : arg1.method5177().method5266(arg0.method5177());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6164((class323) arg0, (class323) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
