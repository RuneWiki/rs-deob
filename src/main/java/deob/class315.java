package deob;

import java.util.Comparator;

@ObfuscatedName("ly")
public class class315 implements Comparator {

    @ObfuscatedName("ly.m")
    public final boolean field3837;

    public class315(boolean arg0) {
        this.field3837 = arg0;
    }

    @ObfuscatedName("ly.m(Ljs;Ljs;B)I")
    public int method5366(class286 arg0, class286 arg1) {
        return this.field3837 ? arg0.method4991(arg1) : arg1.method4991(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5366((class286) arg0, (class286) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
