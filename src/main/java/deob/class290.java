package deob;

@ObfuscatedName("lr")
public class class290 extends class302 {

    @ObfuscatedName("lr.ab")
    public final int field3121;

    @ObfuscatedName("lr.ay")
    public final class297 field3122;

    @ObfuscatedName("lr.an")
    public final int field3123;

    @ObfuscatedName("lr.au")
    public final int field3124;

    public class290(class350 arg0, class350 arg1, int arg2, class297 arg3) {
        super(arg0, arg1);
        this.field3121 = arg2;
        this.field3122 = arg3;
        class235 var5 = class235.method2700(this.method5108());
        class563 var6 = var5.method4398(false);
        if (var6 == null) {
            this.field3123 = 0;
            this.field3124 = 0;
        } else {
            this.field3123 = var6.field5478;
            this.field3124 = var6.field5479;
        }
    }

    @ObfuscatedName("lr.ay(B)I")
    public int method5108() {
        return this.field3121;
    }

    @ObfuscatedName("lr.an(I)Llk;")
    public class297 method5101() {
        return this.field3122;
    }

    @ObfuscatedName("lr.au(B)I")
    public int method5102() {
        return this.field3123;
    }

    @ObfuscatedName("lr.ax(S)I")
    public int method5103() {
        return this.field3124;
    }
}
