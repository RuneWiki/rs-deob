package deob;

@ObfuscatedName("fx")
public class class173 {

    @ObfuscatedName("fx.p")
    public class178 field2806 = new class178();

    @ObfuscatedName("fx.i")
    public class178 field2805;

    public class173() {
        this.field2806.field2818 = this.field2806;
        this.field2806.field2817 = this.field2806;
    }

    @ObfuscatedName("fx.p(Lfh;)V")
    public void method3301(class178 arg0) {
        if (arg0.field2817 != null) {
            arg0.method3356();
        }
        arg0.field2817 = this.field2806.field2817;
        arg0.field2818 = this.field2806;
        arg0.field2817.field2818 = arg0;
        arg0.field2818.field2817 = arg0;
    }

    @ObfuscatedName("fx.i()Lfh;")
    public class178 method3302() {
        class178 var1 = this.field2806.field2818;
        if (this.field2806 == var1) {
            this.field2805 = null;
            return null;
        } else {
            this.field2805 = var1.field2818;
            return var1;
        }
    }

    @ObfuscatedName("fx.o()Lfh;")
    public class178 method3303() {
        class178 var1 = this.field2805;
        if (this.field2806 == var1) {
            this.field2805 = null;
            return null;
        } else {
            this.field2805 = var1.field2818;
            return var1;
        }
    }
}
