package deob;

@ObfuscatedName("fz")
public class class177 {

    @ObfuscatedName("fz.j")
    public class179 field2805 = new class179();

    @ObfuscatedName("fz.r")
    public class179 field2804;

    public class177() {
        this.field2805.field2808 = this.field2805;
        this.field2805.field2810 = this.field2805;
    }

    @ObfuscatedName("fz.j()V")
    public void method3320() {
        while (true) {
            class179 var1 = this.field2805.field2808;
            if (this.field2805 == var1) {
                this.field2804 = null;
                return;
            }
            var1.method3359();
        }
    }

    @ObfuscatedName("fz.r(Lfi;)V")
    public void method3328(class179 arg0) {
        if (arg0.field2810 != null) {
            arg0.method3359();
        }
        arg0.field2810 = this.field2805.field2810;
        arg0.field2808 = this.field2805;
        arg0.field2810.field2808 = arg0;
        arg0.field2808.field2810 = arg0;
    }

    @ObfuscatedName("fz.v(Lfi;)V")
    public void method3333(class179 arg0) {
        if (arg0.field2810 != null) {
            arg0.method3359();
        }
        arg0.field2810 = this.field2805;
        arg0.field2808 = this.field2805.field2808;
        arg0.field2810.field2808 = arg0;
        arg0.field2808.field2810 = arg0;
    }

    @ObfuscatedName("fz.p(Lfi;Lfi;)V")
    public static void method3353(class179 arg0, class179 arg1) {
        if (arg0.field2810 != null) {
            arg0.method3359();
        }
        arg0.field2810 = arg1.field2810;
        arg0.field2808 = arg1;
        arg0.field2810.field2808 = arg0;
        arg0.field2808.field2810 = arg0;
    }

    @ObfuscatedName("fz.e()Lfi;")
    public class179 method3324() {
        class179 var1 = this.field2805.field2808;
        if (this.field2805 == var1) {
            return null;
        } else {
            var1.method3359();
            return var1;
        }
    }

    @ObfuscatedName("fz.d()Lfi;")
    public class179 method3325() {
        class179 var1 = this.field2805.field2810;
        if (this.field2805 == var1) {
            return null;
        } else {
            var1.method3359();
            return var1;
        }
    }

    @ObfuscatedName("fz.y()Lfi;")
    public class179 method3326() {
        class179 var1 = this.field2805.field2808;
        if (this.field2805 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2808;
            return var1;
        }
    }

    @ObfuscatedName("fz.x()Lfi;")
    public class179 method3335() {
        class179 var1 = this.field2805.field2810;
        if (this.field2805 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2810;
            return var1;
        }
    }

    @ObfuscatedName("fz.t()Lfi;")
    public class179 method3347() {
        class179 var1 = this.field2804;
        if (this.field2805 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2808;
            return var1;
        }
    }

    @ObfuscatedName("fz.i()Lfi;")
    public class179 method3334() {
        class179 var1 = this.field2804;
        if (this.field2805 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2810;
            return var1;
        }
    }
}
