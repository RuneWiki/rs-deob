package deob;

@ObfuscatedName("fp")
public class class175 {

    @ObfuscatedName("fp.g")
    public class177 field2757 = new class177();

    @ObfuscatedName("fp.e")
    public class177 field2756;

    public class175() {
        this.field2757.field2761 = this.field2757;
        this.field2757.field2762 = this.field2757;
    }

    @ObfuscatedName("fp.g()V")
    public void method3376() {
        while (true) {
            class177 var1 = this.field2757.field2761;
            if (this.field2757 == var1) {
                this.field2756 = null;
                return;
            }
            var1.method3415();
        }
    }

    @ObfuscatedName("fp.e(Lff;)V")
    public void method3379(class177 arg0) {
        if (arg0.field2762 != null) {
            arg0.method3415();
        }
        arg0.field2762 = this.field2757.field2762;
        arg0.field2761 = this.field2757;
        arg0.field2762.field2761 = arg0;
        arg0.field2761.field2762 = arg0;
    }

    @ObfuscatedName("fp.n(Lff;)V")
    public void method3384(class177 arg0) {
        if (arg0.field2762 != null) {
            arg0.method3415();
        }
        arg0.field2762 = this.field2757;
        arg0.field2761 = this.field2757.field2761;
        arg0.field2762.field2761 = arg0;
        arg0.field2761.field2762 = arg0;
    }

    @ObfuscatedName("fp.j(Lff;Lff;)V")
    public static void method3398(class177 arg0, class177 arg1) {
        if (arg0.field2762 != null) {
            arg0.method3415();
        }
        arg0.field2762 = arg1.field2762;
        arg0.field2761 = arg1;
        arg0.field2762.field2761 = arg0;
        arg0.field2761.field2762 = arg0;
    }

    @ObfuscatedName("fp.i()Lff;")
    public class177 method3380() {
        class177 var1 = this.field2757.field2761;
        if (this.field2757 == var1) {
            return null;
        } else {
            var1.method3415();
            return var1;
        }
    }

    @ObfuscatedName("fp.o()Lff;")
    public class177 method3381() {
        class177 var1 = this.field2757.field2762;
        if (this.field2757 == var1) {
            return null;
        } else {
            var1.method3415();
            return var1;
        }
    }

    @ObfuscatedName("fp.l()Lff;")
    public class177 method3382() {
        class177 var1 = this.field2757.field2761;
        if (this.field2757 == var1) {
            this.field2756 = null;
            return null;
        } else {
            this.field2756 = var1.field2761;
            return var1;
        }
    }

    @ObfuscatedName("fp.p()Lff;")
    public class177 method3407() {
        class177 var1 = this.field2757.field2762;
        if (this.field2757 == var1) {
            this.field2756 = null;
            return null;
        } else {
            this.field2756 = var1.field2762;
            return var1;
        }
    }

    @ObfuscatedName("fp.t()Lff;")
    public class177 method3388() {
        class177 var1 = this.field2756;
        if (this.field2757 == var1) {
            this.field2756 = null;
            return null;
        } else {
            this.field2756 = var1.field2761;
            return var1;
        }
    }

    @ObfuscatedName("fp.w()Lff;")
    public class177 method3385() {
        class177 var1 = this.field2756;
        if (this.field2757 == var1) {
            this.field2756 = null;
            return null;
        } else {
            this.field2756 = var1.field2762;
            return var1;
        }
    }
}
