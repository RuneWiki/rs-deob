package deob;

@ObfuscatedName("fr")
public class class171 {

    @ObfuscatedName("fr.z")
    public class176 field2809 = new class176();

    @ObfuscatedName("fr.n")
    public class176 field2810;

    public class171() {
        this.field2809.field2818 = this.field2809;
        this.field2809.field2819 = this.field2809;
    }

    @ObfuscatedName("fr.z()V")
    public void method3220() {
        while (true) {
            class176 var1 = this.field2809.field2818;
            if (this.field2809 == var1) {
                this.field2810 = null;
                return;
            }
            var1.method3288();
        }
    }

    @ObfuscatedName("fr.n(Lfs;)V")
    public void method3221(class176 arg0) {
        if (arg0.field2819 != null) {
            arg0.method3288();
        }
        arg0.field2819 = this.field2809.field2819;
        arg0.field2818 = this.field2809;
        arg0.field2819.field2818 = arg0;
        arg0.field2818.field2819 = arg0;
    }

    @ObfuscatedName("fr.u(Lfs;)V")
    public void method3237(class176 arg0) {
        if (arg0.field2819 != null) {
            arg0.method3288();
        }
        arg0.field2819 = this.field2809;
        arg0.field2818 = this.field2809.field2818;
        arg0.field2819.field2818 = arg0;
        arg0.field2818.field2819 = arg0;
    }

    @ObfuscatedName("fr.t(Lfs;Lfs;)V")
    public static void method3223(class176 arg0, class176 arg1) {
        if (arg0.field2819 != null) {
            arg0.method3288();
        }
        arg0.field2819 = arg1.field2819;
        arg0.field2818 = arg1;
        arg0.field2819.field2818 = arg0;
        arg0.field2818.field2819 = arg0;
    }

    @ObfuscatedName("fr.e()Lfs;")
    public class176 method3260() {
        class176 var1 = this.field2809.field2818;
        if (this.field2809 == var1) {
            return null;
        } else {
            var1.method3288();
            return var1;
        }
    }

    @ObfuscatedName("fr.a()Lfs;")
    public class176 method3225() {
        class176 var1 = this.field2809.field2819;
        if (this.field2809 == var1) {
            return null;
        } else {
            var1.method3288();
            return var1;
        }
    }

    @ObfuscatedName("fr.l()Lfs;")
    public class176 method3236() {
        class176 var1 = this.field2809.field2818;
        if (this.field2809 == var1) {
            this.field2810 = null;
            return null;
        } else {
            this.field2810 = var1.field2818;
            return var1;
        }
    }

    @ObfuscatedName("fr.v()Lfs;")
    public class176 method3227() {
        class176 var1 = this.field2809.field2819;
        if (this.field2809 == var1) {
            this.field2810 = null;
            return null;
        } else {
            this.field2810 = var1.field2819;
            return var1;
        }
    }

    @ObfuscatedName("fr.j()Lfs;")
    public class176 method3228() {
        class176 var1 = this.field2810;
        if (this.field2809 == var1) {
            this.field2810 = null;
            return null;
        } else {
            this.field2810 = var1.field2818;
            return var1;
        }
    }

    @ObfuscatedName("fr.k()Lfs;")
    public class176 method3229() {
        class176 var1 = this.field2810;
        if (this.field2809 == var1) {
            this.field2810 = null;
            return null;
        } else {
            this.field2810 = var1.field2819;
            return var1;
        }
    }
}
