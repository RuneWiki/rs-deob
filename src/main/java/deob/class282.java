package deob;

@ObfuscatedName("kj")
public class class282 extends class302 {

    @ObfuscatedName("kj.ab")
    public final int field3044;

    @ObfuscatedName("kj.ay")
    public final class285 field3038;

    @ObfuscatedName("kj.an")
    public int field3037;

    @ObfuscatedName("kj.au")
    public class297 field3040;

    @ObfuscatedName("kj.ax")
    public int field3039;

    @ObfuscatedName("kj.ao")
    public int field3042;

    public class282(class350 arg0, class350 arg1, int arg2, class285 arg3) {
        super(arg0, arg1);
        this.field3044 = arg2;
        this.field3038 = arg3;
        this.method5114();
    }

    @ObfuscatedName("kj.ab(I)V")
    public void method5114() {
        this.field3037 = class261.method4328(this.field3044).method4719().field2730;
        this.field3040 = this.field3038.method5314(class235.method2700(this.field3037));
        class235 var1 = class235.method2700(this.method5108());
        class563 var2 = var1.method4398(false);
        if (var2 == null) {
            this.field3039 = 0;
            this.field3042 = 0;
        } else {
            this.field3039 = var2.field5478;
            this.field3042 = var2.field5479;
        }
    }

    @ObfuscatedName("kj.ay(B)I")
    public int method5108() {
        return this.field3037;
    }

    @ObfuscatedName("kj.an(I)Llk;")
    public class297 method5101() {
        return this.field3040;
    }

    @ObfuscatedName("kj.au(B)I")
    public int method5102() {
        return this.field3039;
    }

    @ObfuscatedName("kj.ax(S)I")
    public int method5103() {
        return this.field3042;
    }
}
