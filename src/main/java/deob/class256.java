package deob;

@ObfuscatedName("jg")
public class class256 extends class276 {

    @ObfuscatedName("jg.aw")
    public final int field2872;

    @ObfuscatedName("jg.ay")
    public final class259 field2870;

    @ObfuscatedName("jg.ar")
    public int field2867;

    @ObfuscatedName("jg.am")
    public class271 field2868;

    @ObfuscatedName("jg.as")
    public int field2869;

    @ObfuscatedName("jg.aj")
    public int field2865;

    public class256(class324 arg0, class324 arg1, int arg2, class259 arg3) {
        super(arg0, arg1);
        this.field2872 = arg2;
        this.field2870 = arg3;
        this.method4674();
    }

    @ObfuscatedName("jg.aw(I)V")
    public void method4674() {
        this.field2867 = Statics.method2211(this.field2872).method3592().field2163;
        this.field2868 = this.field2870.method4866(class188.method3780(this.field2867));
        class188 var1 = class188.method3780(this.method4675());
        class528 var2 = var1.method3280(false);
        if (var2 == null) {
            this.field2869 = 0;
            this.field2865 = 0;
        } else {
            this.field2869 = var2.field5169;
            this.field2865 = var2.field5174;
        }
    }

    @ObfuscatedName("jg.ay(I)I")
    public int method4675() {
        return this.field2867;
    }

    @ObfuscatedName("jg.ar(S)Lka;")
    public class271 method4680() {
        return this.field2868;
    }

    @ObfuscatedName("jg.am(B)I")
    public int method4677() {
        return this.field2869;
    }

    @ObfuscatedName("jg.as(I)I")
    public int method4678() {
        return this.field2865;
    }
}
