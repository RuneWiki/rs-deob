package deob;

@ObfuscatedName("fp")
public class class177 {

    @ObfuscatedName("fp.t")
    public class179 field2815 = new class179();

    @ObfuscatedName("fp.l")
    public class179 field2816;

    public class177() {
        this.field2815.field2819 = this.field2815;
        this.field2815.field2820 = this.field2815;
    }

    @ObfuscatedName("fp.t()V")
    public void method3316() {
        while (true) {
            class179 var1 = this.field2815.field2819;
            if (this.field2815 == var1) {
                this.field2816 = null;
                return;
            }
            var1.method3361();
        }
    }

    @ObfuscatedName("fp.l(Lfu;)V")
    public void method3317(class179 arg0) {
        if (arg0.field2820 != null) {
            arg0.method3361();
        }
        arg0.field2820 = this.field2815.field2820;
        arg0.field2819 = this.field2815;
        arg0.field2820.field2819 = arg0;
        arg0.field2819.field2820 = arg0;
    }

    @ObfuscatedName("fp.c(Lfu;)V")
    public void method3318(class179 arg0) {
        if (arg0.field2820 != null) {
            arg0.method3361();
        }
        arg0.field2820 = this.field2815;
        arg0.field2819 = this.field2815.field2819;
        arg0.field2820.field2819 = arg0;
        arg0.field2819.field2820 = arg0;
    }

    @ObfuscatedName("fp.d(Lfu;Lfu;)V")
    public static void method3319(class179 arg0, class179 arg1) {
        if (arg0.field2820 != null) {
            arg0.method3361();
        }
        arg0.field2820 = arg1.field2820;
        arg0.field2819 = arg1;
        arg0.field2820.field2819 = arg0;
        arg0.field2819.field2820 = arg0;
    }

    @ObfuscatedName("fp.b()Lfu;")
    public class179 method3320() {
        class179 var1 = this.field2815.field2819;
        if (this.field2815 == var1) {
            return null;
        } else {
            var1.method3361();
            return var1;
        }
    }

    @ObfuscatedName("fp.i()Lfu;")
    public class179 method3321() {
        class179 var1 = this.field2815.field2820;
        if (this.field2815 == var1) {
            return null;
        } else {
            var1.method3361();
            return var1;
        }
    }

    @ObfuscatedName("fp.p()Lfu;")
    public class179 method3345() {
        class179 var1 = this.field2815.field2819;
        if (this.field2815 == var1) {
            this.field2816 = null;
            return null;
        } else {
            this.field2816 = var1.field2819;
            return var1;
        }
    }

    @ObfuscatedName("fp.y()Lfu;")
    public class179 method3323() {
        class179 var1 = this.field2815.field2820;
        if (this.field2815 == var1) {
            this.field2816 = null;
            return null;
        } else {
            this.field2816 = var1.field2820;
            return var1;
        }
    }

    @ObfuscatedName("fp.u()Lfu;")
    public class179 method3324() {
        class179 var1 = this.field2816;
        if (this.field2815 == var1) {
            this.field2816 = null;
            return null;
        } else {
            this.field2816 = var1.field2819;
            return var1;
        }
    }

    @ObfuscatedName("fp.z()Lfu;")
    public class179 method3325() {
        class179 var1 = this.field2816;
        if (this.field2815 == var1) {
            this.field2816 = null;
            return null;
        } else {
            this.field2816 = var1.field2820;
            return var1;
        }
    }
}
