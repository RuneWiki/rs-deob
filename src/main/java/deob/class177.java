package deob;

@ObfuscatedName("fk")
public class class177 {

    @ObfuscatedName("fk.p")
    public class179 field2816 = new class179();

    @ObfuscatedName("fk.i")
    public class179 field2815;

    public class177() {
        this.field2816.field2821 = this.field2816;
        this.field2816.field2819 = this.field2816;
    }

    @ObfuscatedName("fk.p()V")
    public void method3352() {
        while (true) {
            class179 var1 = this.field2816.field2821;
            if (this.field2816 == var1) {
                this.field2815 = null;
                return;
            }
            var1.method3360();
        }
    }

    @ObfuscatedName("fk.i(Lfi;)V")
    public void method3328(class179 arg0) {
        if (arg0.field2819 != null) {
            arg0.method3360();
        }
        arg0.field2819 = this.field2816.field2819;
        arg0.field2821 = this.field2816;
        arg0.field2819.field2821 = arg0;
        arg0.field2821.field2819 = arg0;
    }

    @ObfuscatedName("fk.o(Lfi;)V")
    public void method3332(class179 arg0) {
        if (arg0.field2819 != null) {
            arg0.method3360();
        }
        arg0.field2819 = this.field2816;
        arg0.field2821 = this.field2816.field2821;
        arg0.field2819.field2821 = arg0;
        arg0.field2821.field2819 = arg0;
    }

    @ObfuscatedName("fk.n(Lfi;Lfi;)V")
    public static void method3330(class179 arg0, class179 arg1) {
        if (arg0.field2819 != null) {
            arg0.method3360();
        }
        arg0.field2819 = arg1.field2819;
        arg0.field2821 = arg1;
        arg0.field2819.field2821 = arg0;
        arg0.field2821.field2819 = arg0;
    }

    @ObfuscatedName("fk.l()Lfi;")
    public class179 method3353() {
        class179 var1 = this.field2816.field2821;
        if (this.field2816 == var1) {
            return null;
        } else {
            var1.method3360();
            return var1;
        }
    }

    @ObfuscatedName("fk.v()Lfi;")
    public class179 method3333() {
        class179 var1 = this.field2816.field2819;
        if (this.field2816 == var1) {
            return null;
        } else {
            var1.method3360();
            return var1;
        }
    }

    @ObfuscatedName("fk.g()Lfi;")
    public class179 method3334() {
        class179 var1 = this.field2816.field2821;
        if (this.field2816 == var1) {
            this.field2815 = null;
            return null;
        } else {
            this.field2815 = var1.field2821;
            return var1;
        }
    }

    @ObfuscatedName("fk.x()Lfi;")
    public class179 method3335() {
        class179 var1 = this.field2816.field2819;
        if (this.field2816 == var1) {
            this.field2815 = null;
            return null;
        } else {
            this.field2815 = var1.field2819;
            return var1;
        }
    }

    @ObfuscatedName("fk.c()Lfi;")
    public class179 method3355() {
        class179 var1 = this.field2815;
        if (this.field2816 == var1) {
            this.field2815 = null;
            return null;
        } else {
            this.field2815 = var1.field2821;
            return var1;
        }
    }

    @ObfuscatedName("fk.f()Lfi;")
    public class179 method3336() {
        class179 var1 = this.field2815;
        if (this.field2816 == var1) {
            this.field2815 = null;
            return null;
        } else {
            this.field2815 = var1.field2819;
            return var1;
        }
    }
}
