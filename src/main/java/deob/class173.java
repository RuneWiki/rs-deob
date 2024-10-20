package deob;

@ObfuscatedName("fb")
public class class173 {

    @ObfuscatedName("fb.p")
    public class178 field2799 = new class178();

    @ObfuscatedName("fb.e")
    public class178 field2798;

    public class173() {
        this.field2799.field2810 = this.field2799;
        this.field2799.field2811 = this.field2799;
    }

    @ObfuscatedName("fb.p(Lfe;)V")
    public void method3295(class178 arg0) {
        if (arg0.field2811 != null) {
            arg0.method3354();
        }
        arg0.field2811 = this.field2799.field2811;
        arg0.field2810 = this.field2799;
        arg0.field2811.field2810 = arg0;
        arg0.field2810.field2811 = arg0;
    }

    @ObfuscatedName("fb.e()Lfe;")
    public class178 method3297() {
        class178 var1 = this.field2799.field2810;
        if (this.field2799 == var1) {
            this.field2798 = null;
            return null;
        } else {
            this.field2798 = var1.field2810;
            return var1;
        }
    }

    @ObfuscatedName("fb.a()Lfe;")
    public class178 method3299() {
        class178 var1 = this.field2798;
        if (this.field2799 == var1) {
            this.field2798 = null;
            return null;
        } else {
            this.field2798 = var1.field2810;
            return var1;
        }
    }
}
