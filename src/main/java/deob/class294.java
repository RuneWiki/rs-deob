package deob;

@ObfuscatedName("kx")
public class class294 {

    @ObfuscatedName("kx.v")
    public class352 field3706 = new class352();

    @ObfuscatedName("kx.n")
    public class352 field3705;

    public class294() {
        this.field3706.field3939 = this.field3706;
        this.field3706.field3940 = this.field3706;
    }

    @ObfuscatedName("kx.v()V")
    public void method4735() {
        while (true) {
            class352 var1 = this.field3706.field3939;
            if (this.field3706 == var1) {
                this.field3705 = null;
                return;
            }
            var1.method5496();
        }
    }

    @ObfuscatedName("kx.n(Lmw;)V")
    public void method4709(class352 arg0) {
        if (arg0.field3940 != null) {
            arg0.method5496();
        }
        arg0.field3940 = this.field3706.field3940;
        arg0.field3939 = this.field3706;
        arg0.field3940.field3939 = arg0;
        arg0.field3939.field3940 = arg0;
    }

    @ObfuscatedName("kx.f(Lmw;)V")
    public void method4739(class352 arg0) {
        if (arg0.field3940 != null) {
            arg0.method5496();
        }
        arg0.field3940 = this.field3706;
        arg0.field3939 = this.field3706.field3939;
        arg0.field3940.field3939 = arg0;
        arg0.field3939.field3940 = arg0;
    }

    @ObfuscatedName("kx.y(Lmw;Lmw;)V")
    public static void method4711(class352 arg0, class352 arg1) {
        if (arg0.field3940 != null) {
            arg0.method5496();
        }
        arg0.field3940 = arg1.field3940;
        arg0.field3939 = arg1;
        arg0.field3940.field3939 = arg0;
        arg0.field3939.field3940 = arg0;
    }

    @ObfuscatedName("kx.p()Lmw;")
    public class352 method4743() {
        class352 var1 = this.field3706.field3939;
        if (this.field3706 == var1) {
            return null;
        } else {
            var1.method5496();
            return var1;
        }
    }

    @ObfuscatedName("kx.j()Lmw;")
    public class352 method4713() {
        class352 var1 = this.field3706.field3940;
        if (this.field3706 == var1) {
            return null;
        } else {
            var1.method5496();
            return var1;
        }
    }

    @ObfuscatedName("kx.r()Lmw;")
    public class352 method4714() {
        class352 var1 = this.field3706.field3939;
        if (this.field3706 == var1) {
            this.field3705 = null;
            return null;
        } else {
            this.field3705 = var1.field3939;
            return var1;
        }
    }

    @ObfuscatedName("kx.b()Lmw;")
    public class352 method4715() {
        class352 var1 = this.field3706.field3940;
        if (this.field3706 == var1) {
            this.field3705 = null;
            return null;
        } else {
            this.field3705 = var1.field3940;
            return var1;
        }
    }

    @ObfuscatedName("kx.d()Lmw;")
    public class352 method4741() {
        class352 var1 = this.field3705;
        if (this.field3706 == var1) {
            this.field3705 = null;
            return null;
        } else {
            this.field3705 = var1.field3939;
            return var1;
        }
    }

    @ObfuscatedName("kx.s()Lmw;")
    public class352 method4717() {
        class352 var1 = this.field3705;
        if (this.field3706 == var1) {
            this.field3705 = null;
            return null;
        } else {
            this.field3705 = var1.field3940;
            return var1;
        }
    }
}
