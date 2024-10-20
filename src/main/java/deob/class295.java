package deob;

@ObfuscatedName("kq")
public class class295 {

    @ObfuscatedName("kq.f")
    public class353 field3709 = new class353();

    @ObfuscatedName("kq.e")
    public class353 field3708;

    public class295() {
        this.field3709.field3935 = this.field3709;
        this.field3709.field3936 = this.field3709;
    }

    @ObfuscatedName("kq.f()V")
    public void method4715() {
        while (true) {
            class353 var1 = this.field3709.field3935;
            if (this.field3709 == var1) {
                this.field3708 = null;
                return;
            }
            var1.method5407();
        }
    }

    @ObfuscatedName("kq.e(Lmf;)V")
    public void method4716(class353 arg0) {
        if (arg0.field3936 != null) {
            arg0.method5407();
        }
        arg0.field3936 = this.field3709.field3936;
        arg0.field3935 = this.field3709;
        arg0.field3936.field3935 = arg0;
        arg0.field3935.field3936 = arg0;
    }

    @ObfuscatedName("kq.v(Lmf;)V")
    public void method4748(class353 arg0) {
        if (arg0.field3936 != null) {
            arg0.method5407();
        }
        arg0.field3936 = this.field3709;
        arg0.field3935 = this.field3709.field3935;
        arg0.field3936.field3935 = arg0;
        arg0.field3935.field3936 = arg0;
    }

    @ObfuscatedName("kq.y(Lmf;Lmf;)V")
    public static void method4718(class353 arg0, class353 arg1) {
        if (arg0.field3936 != null) {
            arg0.method5407();
        }
        arg0.field3936 = arg1.field3936;
        arg0.field3935 = arg1;
        arg0.field3936.field3935 = arg0;
        arg0.field3935.field3936 = arg0;
    }

    @ObfuscatedName("kq.j()Lmf;")
    public class353 method4719() {
        class353 var1 = this.field3709.field3935;
        if (this.field3709 == var1) {
            return null;
        } else {
            var1.method5407();
            return var1;
        }
    }

    @ObfuscatedName("kq.o()Lmf;")
    public class353 method4720() {
        class353 var1 = this.field3709.field3936;
        if (this.field3709 == var1) {
            return null;
        } else {
            var1.method5407();
            return var1;
        }
    }

    @ObfuscatedName("kq.m()Lmf;")
    public class353 method4721() {
        class353 var1 = this.field3709.field3935;
        if (this.field3709 == var1) {
            this.field3708 = null;
            return null;
        } else {
            this.field3708 = var1.field3935;
            return var1;
        }
    }

    @ObfuscatedName("kq.r()Lmf;")
    public class353 method4725() {
        class353 var1 = this.field3709.field3936;
        if (this.field3709 == var1) {
            this.field3708 = null;
            return null;
        } else {
            this.field3708 = var1.field3936;
            return var1;
        }
    }

    @ObfuscatedName("kq.h()Lmf;")
    public class353 method4723() {
        class353 var1 = this.field3708;
        if (this.field3709 == var1) {
            this.field3708 = null;
            return null;
        } else {
            this.field3708 = var1.field3935;
            return var1;
        }
    }

    @ObfuscatedName("kq.d()Lmf;")
    public class353 method4717() {
        class353 var1 = this.field3708;
        if (this.field3709 == var1) {
            this.field3708 = null;
            return null;
        } else {
            this.field3708 = var1.field3936;
            return var1;
        }
    }
}
