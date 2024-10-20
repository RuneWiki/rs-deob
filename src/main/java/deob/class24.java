package deob;

@ObfuscatedName("s")
public class class24 extends class35 {

    @ObfuscatedName("s.c")
    public final int field200;

    @ObfuscatedName("s.t")
    public final class30 field201;

    @ObfuscatedName("s.o")
    public int field202;

    @ObfuscatedName("s.e")
    public class29 field203;

    @ObfuscatedName("s.i")
    public int field204;

    @ObfuscatedName("s.g")
    public int field205;

    public class24(class214 arg0, class214 arg1, int arg2, class30 arg3) {
        super(arg0, arg1);
        this.field200 = arg2;
        this.field201 = arg3;
        this.method266();
    }

    @ObfuscatedName("s.n(I)V")
    public void method266() {
        this.field202 = class255.method3070(this.field200).method4304().field3373;
        this.field203 = this.field201.method500(class243.method3377(this.field202));
        class243 var1 = class243.method3377(this.method180());
        class326 var2 = var1.method4052(false);
        if (var2 == null) {
            this.field204 = 0;
            this.field205 = 0;
        } else {
            this.field204 = var2.field3870;
            this.field205 = var2.field3872;
        }
    }

    @ObfuscatedName("s.c(I)I")
    public int method180() {
        return this.field202;
    }

    @ObfuscatedName("s.t(B)Laz;")
    public class29 method181() {
        return this.field203;
    }

    @ObfuscatedName("s.o(S)I")
    public int method182() {
        return this.field204;
    }

    @ObfuscatedName("s.e(B)I")
    public int method183() {
        return this.field205;
    }
}
