package deob;

@ObfuscatedName("gr")
public class class200 {

    @ObfuscatedName("gr.t")
    public class209 field3109 = new class209();

    @ObfuscatedName("gr.i")
    public class209 field3110;

    public class200() {
        this.field3109.field3127 = this.field3109;
        this.field3109.field3125 = this.field3109;
    }

    @ObfuscatedName("gr.t()V")
    public void method3509() {
        while (true) {
            class209 var1 = this.field3109.field3127;
            if (this.field3109 == var1) {
                this.field3110 = null;
                return;
            }
            var1.method3607();
        }
    }

    @ObfuscatedName("gr.i(Lhe;)V")
    public void method3508(class209 arg0) {
        if (arg0.field3125 != null) {
            arg0.method3607();
        }
        arg0.field3125 = this.field3109.field3125;
        arg0.field3127 = this.field3109;
        arg0.field3125.field3127 = arg0;
        arg0.field3127.field3125 = arg0;
    }

    @ObfuscatedName("gr.g(Lhe;)V")
    public void method3525(class209 arg0) {
        if (arg0.field3125 != null) {
            arg0.method3607();
        }
        arg0.field3125 = this.field3109;
        arg0.field3127 = this.field3109.field3127;
        arg0.field3125.field3127 = arg0;
        arg0.field3127.field3125 = arg0;
    }

    @ObfuscatedName("gr.h(Lhe;Lhe;)V")
    public static void method3522(class209 arg0, class209 arg1) {
        if (arg0.field3125 != null) {
            arg0.method3607();
        }
        arg0.field3125 = arg1.field3125;
        arg0.field3127 = arg1;
        arg0.field3125.field3127 = arg0;
        arg0.field3127.field3125 = arg0;
    }

    @ObfuscatedName("gr.z()Lhe;")
    public class209 method3526() {
        class209 var1 = this.field3109.field3127;
        if (this.field3109 == var1) {
            return null;
        } else {
            var1.method3607();
            return var1;
        }
    }

    @ObfuscatedName("gr.r()Lhe;")
    public class209 method3513() {
        class209 var1 = this.field3109.field3125;
        if (this.field3109 == var1) {
            return null;
        } else {
            var1.method3607();
            return var1;
        }
    }

    @ObfuscatedName("gr.f()Lhe;")
    public class209 method3534() {
        class209 var1 = this.field3109.field3127;
        if (this.field3109 == var1) {
            this.field3110 = null;
            return null;
        } else {
            this.field3110 = var1.field3127;
            return var1;
        }
    }

    @ObfuscatedName("gr.s()Lhe;")
    public class209 method3514() {
        class209 var1 = this.field3109.field3125;
        if (this.field3109 == var1) {
            this.field3110 = null;
            return null;
        } else {
            this.field3110 = var1.field3125;
            return var1;
        }
    }

    @ObfuscatedName("gr.d()Lhe;")
    public class209 method3516() {
        class209 var1 = this.field3110;
        if (this.field3109 == var1) {
            this.field3110 = null;
            return null;
        } else {
            this.field3110 = var1.field3127;
            return var1;
        }
    }

    @ObfuscatedName("gr.l()Lhe;")
    public class209 method3517() {
        class209 var1 = this.field3110;
        if (this.field3109 == var1) {
            this.field3110 = null;
            return null;
        } else {
            this.field3110 = var1.field3125;
            return var1;
        }
    }
}
