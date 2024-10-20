package deob;

@ObfuscatedName("gt")
public class class195 {

    @ObfuscatedName("gt.i")
    public class194 field2476 = new class194();

    @ObfuscatedName("gt.j")
    public class194 field2477;

    public class195() {
        this.field2476.field2474 = this.field2476;
        this.field2476.field2473 = this.field2476;
    }

    @ObfuscatedName("gt.i()V")
    public void method3404() {
        while (true) {
            class194 var1 = this.field2476.field2474;
            if (this.field2476 == var1) {
                this.field2477 = null;
                return;
            }
            var1.method3397();
        }
    }

    @ObfuscatedName("gt.j(Lgs;)V")
    public void method3405(class194 arg0) {
        if (arg0.field2473 != null) {
            arg0.method3397();
        }
        arg0.field2473 = this.field2476.field2473;
        arg0.field2474 = this.field2476;
        arg0.field2473.field2474 = arg0;
        arg0.field2474.field2473 = arg0;
    }

    @ObfuscatedName("gt.a(Lgs;)V")
    public void method3406(class194 arg0) {
        if (arg0.field2473 != null) {
            arg0.method3397();
        }
        arg0.field2473 = this.field2476;
        arg0.field2474 = this.field2476.field2474;
        arg0.field2473.field2474 = arg0;
        arg0.field2474.field2473 = arg0;
    }

    @ObfuscatedName("gt.r(Lgs;Lgs;)V")
    public static void method3428(class194 arg0, class194 arg1) {
        if (arg0.field2473 != null) {
            arg0.method3397();
        }
        arg0.field2473 = arg1.field2473;
        arg0.field2474 = arg1;
        arg0.field2473.field2474 = arg0;
        arg0.field2474.field2473 = arg0;
    }

    @ObfuscatedName("gt.o()Lgs;")
    public class194 method3408() {
        class194 var1 = this.field2476.field2474;
        if (this.field2476 == var1) {
            return null;
        } else {
            var1.method3397();
            return var1;
        }
    }

    @ObfuscatedName("gt.n()Lgs;")
    public class194 method3409() {
        class194 var1 = this.field2476.field2473;
        if (this.field2476 == var1) {
            return null;
        } else {
            var1.method3397();
            return var1;
        }
    }

    @ObfuscatedName("gt.q()Lgs;")
    public class194 method3410() {
        class194 var1 = this.field2476.field2474;
        if (this.field2476 == var1) {
            this.field2477 = null;
            return null;
        } else {
            this.field2477 = var1.field2474;
            return var1;
        }
    }

    @ObfuscatedName("gt.b()Lgs;")
    public class194 method3430() {
        class194 var1 = this.field2476.field2473;
        if (this.field2476 == var1) {
            this.field2477 = null;
            return null;
        } else {
            this.field2477 = var1.field2473;
            return var1;
        }
    }

    @ObfuscatedName("gt.k()Lgs;")
    public class194 method3412() {
        class194 var1 = this.field2477;
        if (this.field2476 == var1) {
            this.field2477 = null;
            return null;
        } else {
            this.field2477 = var1.field2474;
            return var1;
        }
    }

    @ObfuscatedName("gt.s()Lgs;")
    public class194 method3433() {
        class194 var1 = this.field2477;
        if (this.field2476 == var1) {
            this.field2477 = null;
            return null;
        } else {
            this.field2477 = var1.field2473;
            return var1;
        }
    }
}
