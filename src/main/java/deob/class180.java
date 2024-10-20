package deob;

@ObfuscatedName("fr")
public class class180 {

    @ObfuscatedName("fr.x")
    public class189 field2864 = new class189();

    @ObfuscatedName("fr.v")
    public class189 field2865;

    public class180() {
        this.field2864.field2881 = this.field2864;
        this.field2864.field2880 = this.field2864;
    }

    @ObfuscatedName("fr.x()V")
    public void method3250() {
        while (true) {
            class189 var1 = this.field2864.field2881;
            if (this.field2864 == var1) {
                this.field2865 = null;
                return;
            }
            var1.method3352();
        }
    }

    @ObfuscatedName("fr.v(Lgs;)V")
    public void method3246(class189 arg0) {
        if (arg0.field2880 != null) {
            arg0.method3352();
        }
        arg0.field2880 = this.field2864.field2880;
        arg0.field2881 = this.field2864;
        arg0.field2880.field2881 = arg0;
        arg0.field2881.field2880 = arg0;
    }

    @ObfuscatedName("fr.m(Lgs;)V")
    public void method3247(class189 arg0) {
        if (arg0.field2880 != null) {
            arg0.method3352();
        }
        arg0.field2880 = this.field2864;
        arg0.field2881 = this.field2864.field2881;
        arg0.field2880.field2881 = arg0;
        arg0.field2881.field2880 = arg0;
    }

    @ObfuscatedName("fr.e(Lgs;Lgs;)V")
    public static void method3248(class189 arg0, class189 arg1) {
        if (arg0.field2880 != null) {
            arg0.method3352();
        }
        arg0.field2880 = arg1.field2880;
        arg0.field2881 = arg1;
        arg0.field2880.field2881 = arg0;
        arg0.field2881.field2880 = arg0;
    }

    @ObfuscatedName("fr.h()Lgs;")
    public class189 method3249() {
        class189 var1 = this.field2864.field2881;
        if (this.field2864 == var1) {
            return null;
        } else {
            var1.method3352();
            return var1;
        }
    }

    @ObfuscatedName("fr.p()Lgs;")
    public class189 method3258() {
        class189 var1 = this.field2864.field2880;
        if (this.field2864 == var1) {
            return null;
        } else {
            var1.method3352();
            return var1;
        }
    }

    @ObfuscatedName("fr.j()Lgs;")
    public class189 method3251() {
        class189 var1 = this.field2864.field2881;
        if (this.field2864 == var1) {
            this.field2865 = null;
            return null;
        } else {
            this.field2865 = var1.field2881;
            return var1;
        }
    }

    @ObfuscatedName("fr.i()Lgs;")
    public class189 method3253() {
        class189 var1 = this.field2864.field2880;
        if (this.field2864 == var1) {
            this.field2865 = null;
            return null;
        } else {
            this.field2865 = var1.field2880;
            return var1;
        }
    }

    @ObfuscatedName("fr.u()Lgs;")
    public class189 method3272() {
        class189 var1 = this.field2865;
        if (this.field2864 == var1) {
            this.field2865 = null;
            return null;
        } else {
            this.field2865 = var1.field2881;
            return var1;
        }
    }

    @ObfuscatedName("fr.l()Lgs;")
    public class189 method3255() {
        class189 var1 = this.field2865;
        if (this.field2864 == var1) {
            this.field2865 = null;
            return null;
        } else {
            this.field2865 = var1.field2880;
            return var1;
        }
    }
}
