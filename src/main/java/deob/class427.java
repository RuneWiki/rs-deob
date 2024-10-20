package deob;

import java.util.Comparator;

@ObfuscatedName("pk")
public class class427 implements Comparator {

    @ObfuscatedName("pk.c")
    public final boolean field4575;

    public class427(boolean arg0) {
        this.field4575 = arg0;
    }

    @ObfuscatedName("pk.c(Lmy;Lmy;I)I")
    public int method6936(class355 arg0, class355 arg1) {
        return this.field4575 ? arg0.method5770().method7234(arg1.method5770()) : arg1.method5770().method7234(arg0.method5770());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6936((class355) arg0, (class355) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
