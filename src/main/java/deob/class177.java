package deob;

@ObfuscatedName("fk")
public class class177 {

    @ObfuscatedName("fk.c")
    public class179 field2820 = new class179();

    @ObfuscatedName("fk.q")
    public class179 field2821;

    public class177() {
        this.field2820.field2825 = this.field2820;
        this.field2820.field2826 = this.field2820;
    }

    @ObfuscatedName("fk.c()V")
    public void method3175() {
        while (true) {
            class179 var1 = this.field2820.field2825;
            if (this.field2820 == var1) {
                this.field2821 = null;
                return;
            }
            var1.method3196();
        }
    }

    @ObfuscatedName("fk.q(Lfr;)V")
    public void method3158(class179 arg0) {
        if (arg0.field2826 != null) {
            arg0.method3196();
        }
        arg0.field2826 = this.field2820.field2826;
        arg0.field2825 = this.field2820;
        arg0.field2826.field2825 = arg0;
        arg0.field2825.field2826 = arg0;
    }

    @ObfuscatedName("fk.y(Lfr;)V")
    public void method3159(class179 arg0) {
        if (arg0.field2826 != null) {
            arg0.method3196();
        }
        arg0.field2826 = this.field2820;
        arg0.field2825 = this.field2820.field2825;
        arg0.field2826.field2825 = arg0;
        arg0.field2825.field2826 = arg0;
    }

    @ObfuscatedName("fk.v(Lfr;Lfr;)V")
    public static void method3160(class179 arg0, class179 arg1) {
        if (arg0.field2826 != null) {
            arg0.method3196();
        }
        arg0.field2826 = arg1.field2826;
        arg0.field2825 = arg1;
        arg0.field2826.field2825 = arg0;
        arg0.field2825.field2826 = arg0;
    }

    @ObfuscatedName("fk.g()Lfr;")
    public class179 method3161() {
        class179 var1 = this.field2820.field2825;
        if (this.field2820 == var1) {
            return null;
        } else {
            var1.method3196();
            return var1;
        }
    }

    @ObfuscatedName("fk.x()Lfr;")
    public class179 method3162() {
        class179 var1 = this.field2820.field2826;
        if (this.field2820 == var1) {
            return null;
        } else {
            var1.method3196();
            return var1;
        }
    }

    @ObfuscatedName("fk.u()Lfr;")
    public class179 method3163() {
        class179 var1 = this.field2820.field2825;
        if (this.field2820 == var1) {
            this.field2821 = null;
            return null;
        } else {
            this.field2821 = var1.field2825;
            return var1;
        }
    }

    @ObfuscatedName("fk.l()Lfr;")
    public class179 method3178() {
        class179 var1 = this.field2820.field2826;
        if (this.field2820 == var1) {
            this.field2821 = null;
            return null;
        } else {
            this.field2821 = var1.field2826;
            return var1;
        }
    }

    @ObfuscatedName("fk.a()Lfr;")
    public class179 method3165() {
        class179 var1 = this.field2821;
        if (this.field2820 == var1) {
            this.field2821 = null;
            return null;
        } else {
            this.field2821 = var1.field2825;
            return var1;
        }
    }

    @ObfuscatedName("fk.h()Lfr;")
    public class179 method3166() {
        class179 var1 = this.field2821;
        if (this.field2820 == var1) {
            this.field2821 = null;
            return null;
        } else {
            this.field2821 = var1.field2826;
            return var1;
        }
    }
}
