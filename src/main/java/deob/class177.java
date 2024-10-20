package deob;

@ObfuscatedName("fp")
public class class177 {

    @ObfuscatedName("fp.g")
    public class179 field2818 = new class179();

    @ObfuscatedName("fp.h")
    public class179 field2819;

    public class177() {
        this.field2818.field2822 = this.field2818;
        this.field2818.field2824 = this.field2818;
    }

    @ObfuscatedName("fp.g()V")
    public void method3382() {
        while (true) {
            class179 var1 = this.field2818.field2822;
            if (this.field2818 == var1) {
                this.field2819 = null;
                return;
            }
            var1.method3404();
        }
    }

    @ObfuscatedName("fp.h(Lfz;)V")
    public void method3381(class179 arg0) {
        if (arg0.field2824 != null) {
            arg0.method3404();
        }
        arg0.field2824 = this.field2818.field2824;
        arg0.field2822 = this.field2818;
        arg0.field2824.field2822 = arg0;
        arg0.field2822.field2824 = arg0;
    }

    @ObfuscatedName("fp.s(Lfz;)V")
    public void method3369(class179 arg0) {
        if (arg0.field2824 != null) {
            arg0.method3404();
        }
        arg0.field2824 = this.field2818;
        arg0.field2822 = this.field2818.field2822;
        arg0.field2824.field2822 = arg0;
        arg0.field2822.field2824 = arg0;
    }

    @ObfuscatedName("fp.o(Lfz;Lfz;)V")
    public static void method3370(class179 arg0, class179 arg1) {
        if (arg0.field2824 != null) {
            arg0.method3404();
        }
        arg0.field2824 = arg1.field2824;
        arg0.field2822 = arg1;
        arg0.field2824.field2822 = arg0;
        arg0.field2822.field2824 = arg0;
    }

    @ObfuscatedName("fp.p()Lfz;")
    public class179 method3371() {
        class179 var1 = this.field2818.field2822;
        if (this.field2818 == var1) {
            return null;
        } else {
            var1.method3404();
            return var1;
        }
    }

    @ObfuscatedName("fp.x()Lfz;")
    public class179 method3398() {
        class179 var1 = this.field2818.field2824;
        if (this.field2818 == var1) {
            return null;
        } else {
            var1.method3404();
            return var1;
        }
    }

    @ObfuscatedName("fp.k()Lfz;")
    public class179 method3373() {
        class179 var1 = this.field2818.field2822;
        if (this.field2818 == var1) {
            this.field2819 = null;
            return null;
        } else {
            this.field2819 = var1.field2822;
            return var1;
        }
    }

    @ObfuscatedName("fp.r()Lfz;")
    public class179 method3374() {
        class179 var1 = this.field2818.field2824;
        if (this.field2818 == var1) {
            this.field2819 = null;
            return null;
        } else {
            this.field2819 = var1.field2824;
            return var1;
        }
    }

    @ObfuscatedName("fp.z()Lfz;")
    public class179 method3375() {
        class179 var1 = this.field2819;
        if (this.field2818 == var1) {
            this.field2819 = null;
            return null;
        } else {
            this.field2819 = var1.field2822;
            return var1;
        }
    }

    @ObfuscatedName("fp.n()Lfz;")
    public class179 method3376() {
        class179 var1 = this.field2819;
        if (this.field2818 == var1) {
            this.field2819 = null;
            return null;
        } else {
            this.field2819 = var1.field2824;
            return var1;
        }
    }
}
