package deob;

@ObfuscatedName("gi")
public class class199 {

    @ObfuscatedName("gi.z")
    public class208 field3086 = new class208();

    @ObfuscatedName("gi.q")
    public class208 field3085;

    public class199() {
        this.field3086.field3101 = this.field3086;
        this.field3086.field3103 = this.field3086;
    }

    @ObfuscatedName("gi.z()V")
    public void method3490() {
        while (true) {
            class208 var1 = this.field3086.field3101;
            if (this.field3086 == var1) {
                this.field3085 = null;
                return;
            }
            var1.method3583();
        }
    }

    @ObfuscatedName("gi.q(Lgk;)V")
    public void method3491(class208 arg0) {
        if (arg0.field3103 != null) {
            arg0.method3583();
        }
        arg0.field3103 = this.field3086.field3103;
        arg0.field3101 = this.field3086;
        arg0.field3103.field3101 = arg0;
        arg0.field3101.field3103 = arg0;
    }

    @ObfuscatedName("gi.k(Lgk;)V")
    public void method3498(class208 arg0) {
        if (arg0.field3103 != null) {
            arg0.method3583();
        }
        arg0.field3103 = this.field3086;
        arg0.field3101 = this.field3086.field3101;
        arg0.field3103.field3101 = arg0;
        arg0.field3101.field3103 = arg0;
    }

    @ObfuscatedName("gi.f(Lgk;Lgk;)V")
    public static void method3493(class208 arg0, class208 arg1) {
        if (arg0.field3103 != null) {
            arg0.method3583();
        }
        arg0.field3103 = arg1.field3103;
        arg0.field3101 = arg1;
        arg0.field3103.field3101 = arg0;
        arg0.field3101.field3103 = arg0;
    }

    @ObfuscatedName("gi.d()Lgk;")
    public class208 method3494() {
        class208 var1 = this.field3086.field3101;
        if (this.field3086 == var1) {
            return null;
        } else {
            var1.method3583();
            return var1;
        }
    }

    @ObfuscatedName("gi.l()Lgk;")
    public class208 method3495() {
        class208 var1 = this.field3086.field3103;
        if (this.field3086 == var1) {
            return null;
        } else {
            var1.method3583();
            return var1;
        }
    }

    @ObfuscatedName("gi.r()Lgk;")
    public class208 method3502() {
        class208 var1 = this.field3086.field3101;
        if (this.field3086 == var1) {
            this.field3085 = null;
            return null;
        } else {
            this.field3085 = var1.field3101;
            return var1;
        }
    }

    @ObfuscatedName("gi.g()Lgk;")
    public class208 method3522() {
        class208 var1 = this.field3086.field3103;
        if (this.field3086 == var1) {
            this.field3085 = null;
            return null;
        } else {
            this.field3085 = var1.field3103;
            return var1;
        }
    }

    @ObfuscatedName("gi.h()Lgk;")
    public class208 method3489() {
        class208 var1 = this.field3085;
        if (this.field3086 == var1) {
            this.field3085 = null;
            return null;
        } else {
            this.field3085 = var1.field3101;
            return var1;
        }
    }

    @ObfuscatedName("gi.n()Lgk;")
    public class208 method3499() {
        class208 var1 = this.field3085;
        if (this.field3086 == var1) {
            this.field3085 = null;
            return null;
        } else {
            this.field3085 = var1.field3103;
            return var1;
        }
    }
}
