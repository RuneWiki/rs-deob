package deob;

@ObfuscatedName("ls")
public class class326 {

    @ObfuscatedName("ls.c")
    public class392 field4011 = new class392();

    @ObfuscatedName("ls.l")
    public class392 field4010;

    public class326() {
        this.field4011.field4300 = this.field4011;
        this.field4011.field4302 = this.field4011;
    }

    @ObfuscatedName("ls.c()V")
    public void method5262() {
        while (true) {
            class392 var1 = this.field4011.field4300;
            if (this.field4011 == var1) {
                this.field4010 = null;
                return;
            }
            var1.method6167();
        }
    }

    @ObfuscatedName("ls.l(Loe;)V")
    public void method5264(class392 arg0) {
        if (arg0.field4302 != null) {
            arg0.method6167();
        }
        arg0.field4302 = this.field4011.field4302;
        arg0.field4300 = this.field4011;
        arg0.field4302.field4300 = arg0;
        arg0.field4300.field4302 = arg0;
    }

    @ObfuscatedName("ls.s(Loe;)V")
    public void method5263(class392 arg0) {
        if (arg0.field4302 != null) {
            arg0.method6167();
        }
        arg0.field4302 = this.field4011;
        arg0.field4300 = this.field4011.field4300;
        arg0.field4302.field4300 = arg0;
        arg0.field4300.field4302 = arg0;
    }

    @ObfuscatedName("ls.e(Loe;Loe;)V")
    public static void method5289(class392 arg0, class392 arg1) {
        if (arg0.field4302 != null) {
            arg0.method6167();
        }
        arg0.field4302 = arg1.field4302;
        arg0.field4300 = arg1;
        arg0.field4302.field4300 = arg0;
        arg0.field4300.field4302 = arg0;
    }

    @ObfuscatedName("ls.r()Loe;")
    public class392 method5267() {
        class392 var1 = this.field4011.field4300;
        if (this.field4011 == var1) {
            return null;
        } else {
            var1.method6167();
            return var1;
        }
    }

    @ObfuscatedName("ls.o()Loe;")
    public class392 method5268() {
        class392 var1 = this.field4011.field4302;
        if (this.field4011 == var1) {
            return null;
        } else {
            var1.method6167();
            return var1;
        }
    }

    @ObfuscatedName("ls.i()Loe;")
    public class392 method5269() {
        class392 var1 = this.field4011.field4300;
        if (this.field4011 == var1) {
            this.field4010 = null;
            return null;
        } else {
            this.field4010 = var1.field4300;
            return var1;
        }
    }

    @ObfuscatedName("ls.w()Loe;")
    public class392 method5284() {
        class392 var1 = this.field4011.field4302;
        if (this.field4011 == var1) {
            this.field4010 = null;
            return null;
        } else {
            this.field4010 = var1.field4302;
            return var1;
        }
    }

    @ObfuscatedName("ls.v()Loe;")
    public class392 method5270() {
        class392 var1 = this.field4010;
        if (this.field4011 == var1) {
            this.field4010 = null;
            return null;
        } else {
            this.field4010 = var1.field4300;
            return var1;
        }
    }

    @ObfuscatedName("ls.a()Loe;")
    public class392 method5272() {
        class392 var1 = this.field4010;
        if (this.field4011 == var1) {
            this.field4010 = null;
            return null;
        } else {
            this.field4010 = var1.field4302;
            return var1;
        }
    }
}
