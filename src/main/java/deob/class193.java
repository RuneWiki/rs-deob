package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class193 implements Iterable {

    @ObfuscatedName("gf.e")
    public class194 field2450 = new class194();

    @ObfuscatedName("gf.n")
    public class194 field2449;

    public class193() {
        this.field2450.field2452 = this.field2450;
        this.field2450.field2453 = this.field2450;
    }

    @ObfuscatedName("gf.e(Lgx;)V")
    public void method3326(class194 arg0) {
        if (arg0.field2453 != null) {
            arg0.method3333();
        }
        arg0.field2453 = this.field2450.field2453;
        arg0.field2452 = this.field2450;
        arg0.field2453.field2452 = arg0;
        arg0.field2452.field2453 = arg0;
    }

    @ObfuscatedName("gf.n(Lgx;)V")
    public void method3310(class194 arg0) {
        if (arg0.field2453 != null) {
            arg0.method3333();
        }
        arg0.field2453 = this.field2450;
        arg0.field2452 = this.field2450.field2452;
        arg0.field2453.field2452 = arg0;
        arg0.field2452.field2453 = arg0;
    }

    @ObfuscatedName("gf.g(Lgx;Lgx;)V")
    public static void method3322(class194 arg0, class194 arg1) {
        if (arg0.field2453 != null) {
            arg0.method3333();
        }
        arg0.field2453 = arg1;
        arg0.field2452 = arg1.field2452;
        arg0.field2453.field2452 = arg0;
        arg0.field2452.field2453 = arg0;
    }

    @ObfuscatedName("gf.y()Lgx;")
    public class194 method3330() {
        class194 var1 = this.field2450.field2452;
        if (this.field2450 == var1) {
            return null;
        } else {
            var1.method3333();
            return var1;
        }
    }

    @ObfuscatedName("gf.w()Lgx;")
    public class194 method3313() {
        return this.method3314((class194) null);
    }

    @ObfuscatedName("gf.k(Lgx;)Lgx;")
    public class194 method3314(class194 arg0) {
        class194 var2;
        if (arg0 == null) {
            var2 = this.field2450.field2452;
        } else {
            var2 = arg0;
        }
        if (this.field2450 == var2) {
            this.field2449 = null;
            return null;
        } else {
            this.field2449 = var2.field2452;
            return var2;
        }
    }

    @ObfuscatedName("gf.v()Lgx;")
    public class194 method3315() {
        class194 var1 = this.field2449;
        if (this.field2450 == var1) {
            this.field2449 = null;
            return null;
        } else {
            this.field2449 = var1.field2452;
            return var1;
        }
    }

    @ObfuscatedName("gf.z()Z")
    public boolean method3316() {
        return this.field2450.field2452 == this.field2450;
    }

    public Iterator iterator() {
        return new class190(this);
    }
}
