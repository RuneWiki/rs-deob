package deob;

import java.util.Comparator;

@ObfuscatedName("pu")
public class class426 implements Comparator {

    @ObfuscatedName("pu.c")
    public final boolean field4571;

    public class426(boolean arg0) {
        this.field4571 = arg0;
    }

    @ObfuscatedName("pu.c(Lmy;Lmy;B)I")
    public int method6927(class355 arg0, class355 arg1) {
        return this.field4571 ? arg0.method5701(arg1) : arg1.method5701(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6927((class355) arg0, (class355) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
