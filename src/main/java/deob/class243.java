package deob;

@ObfuscatedName("jk")
public class class243 extends class263 {

    @ObfuscatedName("jk.aj")
    public final int field2826;

    @ObfuscatedName("jk.al")
    public final class246 field2822;

    @ObfuscatedName("jk.ac")
    public int field2823;

    @ObfuscatedName("jk.ab")
    public class258 field2824;

    @ObfuscatedName("jk.an")
    public int field2821;

    @ObfuscatedName("jk.ao")
    public int field2827;

    public class243(class304 arg0, class304 arg1, int arg2, class246 arg3) {
        super(arg0, arg1);
        this.field2826 = arg2;
        this.field2822 = arg3;
        this.method4435();
    }

    @ObfuscatedName("jk.aj(I)V")
    public void method4435() {
        this.field2823 = Statics.method4396(this.field2826).method3545().field2153;
        this.field2824 = this.field2822.method4574(class185.method2778(this.field2823));
        class185 var1 = class185.method2778(this.method4426());
        class492 var2 = var1.method3251(false);
        if (var2 == null) {
            this.field2821 = 0;
            this.field2827 = 0;
        } else {
            this.field2821 = var2.field5006;
            this.field2827 = var2.field4996;
        }
    }

    @ObfuscatedName("jk.al(B)I")
    public int method4426() {
        return this.field2823;
    }

    @ObfuscatedName("jk.ac(I)Ljb;")
    public class258 method4427() {
        return this.field2824;
    }

    @ObfuscatedName("jk.ab(I)I")
    public int method4428() {
        return this.field2821;
    }

    @ObfuscatedName("jk.an(B)I")
    public int method4429() {
        return this.field2827;
    }
}
