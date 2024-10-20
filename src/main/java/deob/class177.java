package deob;

@ObfuscatedName("fi")
public class class177 {

    @ObfuscatedName("fi.d")
    public class179 field2815 = new class179();

    @ObfuscatedName("fi.g")
    public class179 field2814;

    public class177() {
        this.field2815.field2819 = this.field2815;
        this.field2815.field2820 = this.field2815;
    }

    @ObfuscatedName("fi.d()V")
    public void method3279() {
        while (true) {
            class179 var1 = this.field2815.field2819;
            if (this.field2815 == var1) {
                this.field2814 = null;
                return;
            }
            var1.method3306();
        }
    }

    @ObfuscatedName("fi.g(Lfy;)V")
    public void method3273(class179 arg0) {
        if (arg0.field2820 != null) {
            arg0.method3306();
        }
        arg0.field2820 = this.field2815.field2820;
        arg0.field2819 = this.field2815;
        arg0.field2820.field2819 = arg0;
        arg0.field2819.field2820 = arg0;
    }

    @ObfuscatedName("fi.a(Lfy;)V")
    public void method3289(class179 arg0) {
        if (arg0.field2820 != null) {
            arg0.method3306();
        }
        arg0.field2820 = this.field2815;
        arg0.field2819 = this.field2815.field2819;
        arg0.field2820.field2819 = arg0;
        arg0.field2819.field2820 = arg0;
    }

    @ObfuscatedName("fi.t(Lfy;Lfy;)V")
    public static void method3275(class179 arg0, class179 arg1) {
        if (arg0.field2820 != null) {
            arg0.method3306();
        }
        arg0.field2820 = arg1.field2820;
        arg0.field2819 = arg1;
        arg0.field2820.field2819 = arg0;
        arg0.field2819.field2820 = arg0;
    }

    @ObfuscatedName("fi.f()Lfy;")
    public class179 method3274() {
        class179 var1 = this.field2815.field2819;
        if (this.field2815 == var1) {
            return null;
        } else {
            var1.method3306();
            return var1;
        }
    }

    @ObfuscatedName("fi.c()Lfy;")
    public class179 method3277() {
        class179 var1 = this.field2815.field2820;
        if (this.field2815 == var1) {
            return null;
        } else {
            var1.method3306();
            return var1;
        }
    }

    @ObfuscatedName("fi.p()Lfy;")
    public class179 method3278() {
        class179 var1 = this.field2815.field2819;
        if (this.field2815 == var1) {
            this.field2814 = null;
            return null;
        } else {
            this.field2814 = var1.field2819;
            return var1;
        }
    }

    @ObfuscatedName("fi.s()Lfy;")
    public class179 method3282() {
        class179 var1 = this.field2815.field2820;
        if (this.field2815 == var1) {
            this.field2814 = null;
            return null;
        } else {
            this.field2814 = var1.field2820;
            return var1;
        }
    }

    @ObfuscatedName("fi.k()Lfy;")
    public class179 method3280() {
        class179 var1 = this.field2814;
        if (this.field2815 == var1) {
            this.field2814 = null;
            return null;
        } else {
            this.field2814 = var1.field2819;
            return var1;
        }
    }

    @ObfuscatedName("fi.m()Lfy;")
    public class179 method3281() {
        class179 var1 = this.field2814;
        if (this.field2815 == var1) {
            this.field2814 = null;
            return null;
        } else {
            this.field2814 = var1.field2820;
            return var1;
        }
    }
}
