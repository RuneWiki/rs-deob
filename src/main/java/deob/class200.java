package deob;

@ObfuscatedName("gl")
public class class200 {

    @ObfuscatedName("gl.a")
    public class209 field3109 = new class209();

    @ObfuscatedName("gl.w")
    public class209 field3108;

    public class200() {
        this.field3109.field3125 = this.field3109;
        this.field3109.field3124 = this.field3109;
    }

    @ObfuscatedName("gl.a()V")
    public void method3637() {
        while (true) {
            class209 var1 = this.field3109.field3125;
            if (this.field3109 == var1) {
                this.field3108 = null;
                return;
            }
            var1.method3737();
        }
    }

    @ObfuscatedName("gl.w(Lha;)V")
    public void method3639(class209 arg0) {
        if (arg0.field3124 != null) {
            arg0.method3737();
        }
        arg0.field3124 = this.field3109.field3124;
        arg0.field3125 = this.field3109;
        arg0.field3124.field3125 = arg0;
        arg0.field3125.field3124 = arg0;
    }

    @ObfuscatedName("gl.d(Lha;)V")
    public void method3640(class209 arg0) {
        if (arg0.field3124 != null) {
            arg0.method3737();
        }
        arg0.field3124 = this.field3109;
        arg0.field3125 = this.field3109.field3125;
        arg0.field3124.field3125 = arg0;
        arg0.field3125.field3124 = arg0;
    }

    @ObfuscatedName("gl.c(Lha;Lha;)V")
    public static void method3672(class209 arg0, class209 arg1) {
        if (arg0.field3124 != null) {
            arg0.method3737();
        }
        arg0.field3124 = arg1.field3124;
        arg0.field3125 = arg1;
        arg0.field3124.field3125 = arg0;
        arg0.field3125.field3124 = arg0;
    }

    @ObfuscatedName("gl.y()Lha;")
    public class209 method3642() {
        class209 var1 = this.field3109.field3125;
        if (this.field3109 == var1) {
            return null;
        } else {
            var1.method3737();
            return var1;
        }
    }

    @ObfuscatedName("gl.k()Lha;")
    public class209 method3647() {
        class209 var1 = this.field3109.field3124;
        if (this.field3109 == var1) {
            return null;
        } else {
            var1.method3737();
            return var1;
        }
    }

    @ObfuscatedName("gl.r()Lha;")
    public class209 method3665() {
        class209 var1 = this.field3109.field3125;
        if (this.field3109 == var1) {
            this.field3108 = null;
            return null;
        } else {
            this.field3108 = var1.field3125;
            return var1;
        }
    }

    @ObfuscatedName("gl.p()Lha;")
    public class209 method3645() {
        class209 var1 = this.field3109.field3124;
        if (this.field3109 == var1) {
            this.field3108 = null;
            return null;
        } else {
            this.field3108 = var1.field3124;
            return var1;
        }
    }

    @ObfuscatedName("gl.q()Lha;")
    public class209 method3641() {
        class209 var1 = this.field3108;
        if (this.field3109 == var1) {
            this.field3108 = null;
            return null;
        } else {
            this.field3108 = var1.field3125;
            return var1;
        }
    }

    @ObfuscatedName("gl.m()Lha;")
    public class209 method3658() {
        class209 var1 = this.field3108;
        if (this.field3109 == var1) {
            this.field3108 = null;
            return null;
        } else {
            this.field3108 = var1.field3124;
            return var1;
        }
    }
}
