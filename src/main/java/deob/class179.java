package deob;

@ObfuscatedName("fj")
public class class179 {

    @ObfuscatedName("fj.e")
    public class181 field2835 = new class181();

    @ObfuscatedName("fj.i")
    public class181 field2836;

    public class179() {
        this.field2835.field2840 = this.field2835;
        this.field2835.field2841 = this.field2835;
    }

    @ObfuscatedName("fj.e()V")
    public void method3325() {
        while (true) {
            class181 var1 = this.field2835.field2840;
            if (this.field2835 == var1) {
                this.field2836 = null;
                return;
            }
            var1.method3366();
        }
    }

    @ObfuscatedName("fj.i(Lfz;)V")
    public void method3328(class181 arg0) {
        if (arg0.field2841 != null) {
            arg0.method3366();
        }
        arg0.field2841 = this.field2835.field2841;
        arg0.field2840 = this.field2835;
        arg0.field2841.field2840 = arg0;
        arg0.field2840.field2841 = arg0;
    }

    @ObfuscatedName("fj.k(Lfz;)V")
    public void method3352(class181 arg0) {
        if (arg0.field2841 != null) {
            arg0.method3366();
        }
        arg0.field2841 = this.field2835;
        arg0.field2840 = this.field2835.field2840;
        arg0.field2841.field2840 = arg0;
        arg0.field2840.field2841 = arg0;
    }

    @ObfuscatedName("fj.q(Lfz;Lfz;)V")
    public static void method3344(class181 arg0, class181 arg1) {
        if (arg0.field2841 != null) {
            arg0.method3366();
        }
        arg0.field2841 = arg1.field2841;
        arg0.field2840 = arg1;
        arg0.field2841.field2840 = arg0;
        arg0.field2840.field2841 = arg0;
    }

    @ObfuscatedName("fj.j()Lfz;")
    public class181 method3329() {
        class181 var1 = this.field2835.field2840;
        if (this.field2835 == var1) {
            return null;
        } else {
            var1.method3366();
            return var1;
        }
    }

    @ObfuscatedName("fj.z()Lfz;")
    public class181 method3340() {
        class181 var1 = this.field2835.field2841;
        if (this.field2835 == var1) {
            return null;
        } else {
            var1.method3366();
            return var1;
        }
    }

    @ObfuscatedName("fj.m()Lfz;")
    public class181 method3331() {
        class181 var1 = this.field2835.field2840;
        if (this.field2835 == var1) {
            this.field2836 = null;
            return null;
        } else {
            this.field2836 = var1.field2840;
            return var1;
        }
    }

    @ObfuscatedName("fj.w()Lfz;")
    public class181 method3332() {
        class181 var1 = this.field2835.field2841;
        if (this.field2835 == var1) {
            this.field2836 = null;
            return null;
        } else {
            this.field2836 = var1.field2841;
            return var1;
        }
    }

    @ObfuscatedName("fj.a()Lfz;")
    public class181 method3333() {
        class181 var1 = this.field2836;
        if (this.field2835 == var1) {
            this.field2836 = null;
            return null;
        } else {
            this.field2836 = var1.field2840;
            return var1;
        }
    }

    @ObfuscatedName("fj.d()Lfz;")
    public class181 method3356() {
        class181 var1 = this.field2836;
        if (this.field2835 == var1) {
            this.field2836 = null;
            return null;
        } else {
            this.field2836 = var1.field2841;
            return var1;
        }
    }
}
