package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class195 implements Iterable {

    @ObfuscatedName("gq.s")
    public class196 field2485 = new class196();

    @ObfuscatedName("gq.c")
    public class196 field2484;

    public class195() {
        this.field2485.field2486 = this.field2485;
        this.field2485.field2488 = this.field2485;
    }

    @ObfuscatedName("gq.s(Lgr;)V")
    public void method3348(class196 arg0) {
        if (arg0.field2488 != null) {
            arg0.method3372();
        }
        arg0.field2488 = this.field2485.field2488;
        arg0.field2486 = this.field2485;
        arg0.field2488.field2486 = arg0;
        arg0.field2486.field2488 = arg0;
    }

    @ObfuscatedName("gq.c(Lgr;)V")
    public void method3361(class196 arg0) {
        if (arg0.field2488 != null) {
            arg0.method3372();
        }
        arg0.field2488 = this.field2485;
        arg0.field2486 = this.field2485.field2486;
        arg0.field2488.field2486 = arg0;
        arg0.field2486.field2488 = arg0;
    }

    @ObfuscatedName("gq.f(Lgr;Lgr;)V")
    public static void method3350(class196 arg0, class196 arg1) {
        if (arg0.field2488 != null) {
            arg0.method3372();
        }
        arg0.field2488 = arg1;
        arg0.field2486 = arg1.field2486;
        arg0.field2488.field2486 = arg0;
        arg0.field2486.field2488 = arg0;
    }

    @ObfuscatedName("gq.m()Lgr;")
    public class196 method3347() {
        class196 var1 = this.field2485.field2486;
        if (this.field2485 == var1) {
            return null;
        } else {
            var1.method3372();
            return var1;
        }
    }

    @ObfuscatedName("gq.h()Lgr;")
    public class196 method3352() {
        return this.method3353((class196) null);
    }

    @ObfuscatedName("gq.t(Lgr;)Lgr;")
    public class196 method3353(class196 arg0) {
        class196 var2;
        if (arg0 == null) {
            var2 = this.field2485.field2486;
        } else {
            var2 = arg0;
        }
        if (this.field2485 == var2) {
            this.field2484 = null;
            return null;
        } else {
            this.field2484 = var2.field2486;
            return var2;
        }
    }

    @ObfuscatedName("gq.p()Lgr;")
    public class196 method3367() {
        class196 var1 = this.field2484;
        if (this.field2485 == var1) {
            this.field2484 = null;
            return null;
        } else {
            this.field2484 = var1.field2486;
            return var1;
        }
    }

    @ObfuscatedName("gq.d()Z")
    public boolean method3351() {
        return this.field2485.field2486 == this.field2485;
    }

    public Iterator iterator() {
        return new class192(this);
    }
}
