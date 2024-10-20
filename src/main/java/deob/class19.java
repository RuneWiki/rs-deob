package deob;

@ObfuscatedName("s")
public class class19 extends class35 {

    @ObfuscatedName("s.a")
    public final int field116;

    @ObfuscatedName("s.t")
    public final class29 field115;

    @ObfuscatedName("s.n")
    public final int field119;

    @ObfuscatedName("s.q")
    public final int field118;

    public class19(class214 arg0, class214 arg1, int arg2, class29 arg3) {
        super(arg0, arg1);
        this.field116 = arg2;
        this.field115 = arg3;
        class242 var5 = class242.method1149(this.method210());
        class325 var6 = var5.method4099(false);
        if (var6 == null) {
            this.field119 = 0;
            this.field118 = 0;
        } else {
            this.field119 = var6.field3863;
            this.field118 = var6.field3870;
        }
    }

    @ObfuscatedName("s.a(I)I")
    public int method210() {
        return this.field116;
    }

    @ObfuscatedName("s.t(I)Lar;")
    public class29 method207() {
        return this.field115;
    }

    @ObfuscatedName("s.n(I)I")
    public int method208() {
        return this.field119;
    }

    @ObfuscatedName("s.q(B)I")
    public int method206() {
        return this.field118;
    }
}
