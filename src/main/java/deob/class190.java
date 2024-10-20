package deob;

@ObfuscatedName("gb")
public class class190 {

    @ObfuscatedName("gb.o")
    public class199 field2997 = new class199();

    @ObfuscatedName("gb.l")
    public class199 field2998;

    public class190() {
        this.field2997.field3013 = this.field2997;
        this.field2997.field3014 = this.field2997;
    }

    @ObfuscatedName("gb.o()V")
    public void method3483() {
        while (true) {
            class199 var1 = this.field2997.field3013;
            if (this.field2997 == var1) {
                this.field2998 = null;
                return;
            }
            var1.method3564();
        }
    }

    @ObfuscatedName("gb.l(Lgj;)V")
    public void method3470(class199 arg0) {
        if (arg0.field3014 != null) {
            arg0.method3564();
        }
        arg0.field3014 = this.field2997.field3014;
        arg0.field3013 = this.field2997;
        arg0.field3014.field3013 = arg0;
        arg0.field3013.field3014 = arg0;
    }

    @ObfuscatedName("gb.g(Lgj;)V")
    public void method3471(class199 arg0) {
        if (arg0.field3014 != null) {
            arg0.method3564();
        }
        arg0.field3014 = this.field2997;
        arg0.field3013 = this.field2997.field3013;
        arg0.field3014.field3013 = arg0;
        arg0.field3013.field3014 = arg0;
    }

    @ObfuscatedName("gb.u(Lgj;Lgj;)V")
    public static void method3472(class199 arg0, class199 arg1) {
        if (arg0.field3014 != null) {
            arg0.method3564();
        }
        arg0.field3014 = arg1.field3014;
        arg0.field3013 = arg1;
        arg0.field3014.field3013 = arg0;
        arg0.field3013.field3014 = arg0;
    }

    @ObfuscatedName("gb.q()Lgj;")
    public class199 method3473() {
        class199 var1 = this.field2997.field3013;
        if (this.field2997 == var1) {
            return null;
        } else {
            var1.method3564();
            return var1;
        }
    }

    @ObfuscatedName("gb.r()Lgj;")
    public class199 method3474() {
        class199 var1 = this.field2997.field3014;
        if (this.field2997 == var1) {
            return null;
        } else {
            var1.method3564();
            return var1;
        }
    }

    @ObfuscatedName("gb.v()Lgj;")
    public class199 method3499() {
        class199 var1 = this.field2997.field3013;
        if (this.field2997 == var1) {
            this.field2998 = null;
            return null;
        } else {
            this.field2998 = var1.field3013;
            return var1;
        }
    }

    @ObfuscatedName("gb.y()Lgj;")
    public class199 method3469() {
        class199 var1 = this.field2997.field3014;
        if (this.field2997 == var1) {
            this.field2998 = null;
            return null;
        } else {
            this.field2998 = var1.field3014;
            return var1;
        }
    }

    @ObfuscatedName("gb.k()Lgj;")
    public class199 method3482() {
        class199 var1 = this.field2998;
        if (this.field2997 == var1) {
            this.field2998 = null;
            return null;
        } else {
            this.field2998 = var1.field3013;
            return var1;
        }
    }

    @ObfuscatedName("gb.c()Lgj;")
    public class199 method3494() {
        class199 var1 = this.field2998;
        if (this.field2997 == var1) {
            this.field2998 = null;
            return null;
        } else {
            this.field2998 = var1.field3014;
            return var1;
        }
    }
}
