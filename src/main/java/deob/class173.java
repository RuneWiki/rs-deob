package deob;

@ObfuscatedName("fa")
public class class173 {

    @ObfuscatedName("fa.y")
    public class178 field2803 = new class178();

    @ObfuscatedName("fa.m")
    public class178 field2804;

    public class173() {
        this.field2803.field2815 = this.field2803;
        this.field2803.field2816 = this.field2803;
    }

    @ObfuscatedName("fa.y(Lfo;)V")
    public void method3317(class178 arg0) {
        if (arg0.field2816 != null) {
            arg0.method3388();
        }
        arg0.field2816 = this.field2803.field2816;
        arg0.field2815 = this.field2803;
        arg0.field2816.field2815 = arg0;
        arg0.field2815.field2816 = arg0;
    }

    @ObfuscatedName("fa.m()Lfo;")
    public class178 method3321() {
        class178 var1 = this.field2803.field2815;
        if (this.field2803 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2815;
            return var1;
        }
    }

    @ObfuscatedName("fa.d()Lfo;")
    public class178 method3316() {
        class178 var1 = this.field2804;
        if (this.field2803 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2815;
            return var1;
        }
    }
}
