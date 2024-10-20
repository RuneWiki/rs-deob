package deob;

@ObfuscatedName("gf")
public class class208 {

    @ObfuscatedName("gf.v")
    public class207 field2466 = new class207();

    @ObfuscatedName("gf.s")
    public class207 field2467;

    public class208() {
        this.field2466.field2463 = this.field2466;
        this.field2466.field2465 = this.field2466;
    }

    @ObfuscatedName("gf.v()V")
    public void method3807() {
        while (true) {
            class207 var1 = this.field2466.field2463;
            if (this.field2466 == var1) {
                this.field2467 = null;
                return;
            }
            var1.method3787();
        }
    }

    @ObfuscatedName("gf.s(Lgl;)V")
    public void method3793(class207 arg0) {
        if (arg0.field2465 != null) {
            arg0.method3787();
        }
        arg0.field2465 = this.field2466.field2465;
        arg0.field2463 = this.field2466;
        arg0.field2465.field2463 = arg0;
        arg0.field2463.field2465 = arg0;
    }

    @ObfuscatedName("gf.o(Lgl;)V")
    public void method3824(class207 arg0) {
        if (arg0.field2465 != null) {
            arg0.method3787();
        }
        arg0.field2465 = this.field2466;
        arg0.field2463 = this.field2466.field2463;
        arg0.field2465.field2463 = arg0;
        arg0.field2463.field2465 = arg0;
    }

    @ObfuscatedName("gf.k(Lgl;Lgl;)V")
    public static void method3795(class207 arg0, class207 arg1) {
        if (arg0.field2465 != null) {
            arg0.method3787();
        }
        arg0.field2465 = arg1.field2465;
        arg0.field2463 = arg1;
        arg0.field2465.field2463 = arg0;
        arg0.field2463.field2465 = arg0;
    }

    @ObfuscatedName("gf.u()Lgl;")
    public class207 method3796() {
        class207 var1 = this.field2466.field2463;
        if (this.field2466 == var1) {
            return null;
        } else {
            var1.method3787();
            return var1;
        }
    }

    @ObfuscatedName("gf.i()Lgl;")
    public class207 method3805() {
        class207 var1 = this.field2466.field2465;
        if (this.field2466 == var1) {
            return null;
        } else {
            var1.method3787();
            return var1;
        }
    }

    @ObfuscatedName("gf.t()Lgl;")
    public class207 method3792() {
        class207 var1 = this.field2466.field2463;
        if (this.field2466 == var1) {
            this.field2467 = null;
            return null;
        } else {
            this.field2467 = var1.field2463;
            return var1;
        }
    }

    @ObfuscatedName("gf.c()Lgl;")
    public class207 method3799() {
        class207 var1 = this.field2466.field2465;
        if (this.field2466 == var1) {
            this.field2467 = null;
            return null;
        } else {
            this.field2467 = var1.field2465;
            return var1;
        }
    }

    @ObfuscatedName("gf.w()Lgl;")
    public class207 method3800() {
        class207 var1 = this.field2467;
        if (this.field2466 == var1) {
            this.field2467 = null;
            return null;
        } else {
            this.field2467 = var1.field2463;
            return var1;
        }
    }

    @ObfuscatedName("gf.a()Lgl;")
    public class207 method3801() {
        class207 var1 = this.field2467;
        if (this.field2466 == var1) {
            this.field2467 = null;
            return null;
        } else {
            this.field2467 = var1.field2465;
            return var1;
        }
    }
}
