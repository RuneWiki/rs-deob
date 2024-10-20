package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public class class192 implements Iterable {

    @ObfuscatedName("gr.e")
    public class193 field2450 = new class193();

    @ObfuscatedName("gr.o")
    public class193 field2451;

    public class192() {
        this.field2450.field2453 = this.field2450;
        this.field2450.field2452 = this.field2450;
    }

    @ObfuscatedName("gr.e(Lgc;)V")
    public void method3276(class193 arg0) {
        if (arg0.field2452 != null) {
            arg0.method3304();
        }
        arg0.field2452 = this.field2450.field2452;
        arg0.field2453 = this.field2450;
        arg0.field2452.field2453 = arg0;
        arg0.field2453.field2452 = arg0;
    }

    @ObfuscatedName("gr.o(Lgc;)V")
    public void method3283(class193 arg0) {
        if (arg0.field2452 != null) {
            arg0.method3304();
        }
        arg0.field2452 = this.field2450;
        arg0.field2453 = this.field2450.field2453;
        arg0.field2452.field2453 = arg0;
        arg0.field2453.field2452 = arg0;
    }

    @ObfuscatedName("gr.m(Lgc;Lgc;)V")
    public static void method3302(class193 arg0, class193 arg1) {
        if (arg0.field2452 != null) {
            arg0.method3304();
        }
        arg0.field2452 = arg1;
        arg0.field2453 = arg1.field2453;
        arg0.field2452.field2453 = arg0;
        arg0.field2453.field2452 = arg0;
    }

    @ObfuscatedName("gr.g()Lgc;")
    public class193 method3287() {
        class193 var1 = this.field2450.field2453;
        if (this.field2450 == var1) {
            return null;
        } else {
            var1.method3304();
            return var1;
        }
    }

    @ObfuscatedName("gr.d()Lgc;")
    public class193 method3280() {
        return this.method3281((class193) null);
    }

    @ObfuscatedName("gr.b(Lgc;)Lgc;")
    public class193 method3281(class193 arg0) {
        class193 var2;
        if (arg0 == null) {
            var2 = this.field2450.field2453;
        } else {
            var2 = arg0;
        }
        if (this.field2450 == var2) {
            this.field2451 = null;
            return null;
        } else {
            this.field2451 = var2.field2453;
            return var2;
        }
    }

    @ObfuscatedName("gr.k()Lgc;")
    public class193 method3278() {
        class193 var1 = this.field2451;
        if (this.field2450 == var1) {
            this.field2451 = null;
            return null;
        } else {
            this.field2451 = var1.field2453;
            return var1;
        }
    }

    @ObfuscatedName("gr.q()Z")
    public boolean method3282() {
        return this.field2450.field2453 == this.field2450;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
