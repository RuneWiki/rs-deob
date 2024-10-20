package deob;

@ObfuscatedName("fw")
public class class173 {

    @ObfuscatedName("fw.i")
    public class178 field2804 = new class178();

    @ObfuscatedName("fw.p")
    public class178 field2803;

    public class173() {
        this.field2804.field2816 = this.field2804;
        this.field2804.field2815 = this.field2804;
    }

    @ObfuscatedName("fw.i(Lfv;)V")
    public void method3253(class178 arg0) {
        if (arg0.field2815 != null) {
            arg0.method3317();
        }
        arg0.field2815 = this.field2804.field2815;
        arg0.field2816 = this.field2804;
        arg0.field2815.field2816 = arg0;
        arg0.field2816.field2815 = arg0;
    }

    @ObfuscatedName("fw.p()Lfv;")
    public class178 method3262() {
        class178 var1 = this.field2804.field2816;
        if (this.field2804 == var1) {
            this.field2803 = null;
            return null;
        } else {
            this.field2803 = var1.field2816;
            return var1;
        }
    }

    @ObfuscatedName("fw.a()Lfv;")
    public class178 method3255() {
        class178 var1 = this.field2803;
        if (this.field2804 == var1) {
            this.field2803 = null;
            return null;
        } else {
            this.field2803 = var1.field2816;
            return var1;
        }
    }
}
