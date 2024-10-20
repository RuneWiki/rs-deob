package deob;

@ObfuscatedName("fu")
public class class173 {

    @ObfuscatedName("fu.d")
    public class178 field2805 = new class178();

    @ObfuscatedName("fu.g")
    public class178 field2804;

    public class173() {
        this.field2805.field2816 = this.field2805;
        this.field2805.field2817 = this.field2805;
    }

    @ObfuscatedName("fu.d(Lfv;)V")
    public void method3237(class178 arg0) {
        if (arg0.field2817 != null) {
            arg0.method3302();
        }
        arg0.field2817 = this.field2805.field2817;
        arg0.field2816 = this.field2805;
        arg0.field2817.field2816 = arg0;
        arg0.field2816.field2817 = arg0;
    }

    @ObfuscatedName("fu.g()Lfv;")
    public class178 method3245() {
        class178 var1 = this.field2805.field2816;
        if (this.field2805 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2816;
            return var1;
        }
    }

    @ObfuscatedName("fu.a()Lfv;")
    public class178 method3239() {
        class178 var1 = this.field2804;
        if (this.field2805 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2816;
            return var1;
        }
    }
}
