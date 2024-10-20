package deob;

@ObfuscatedName("w")
public class class24 extends class35 {

    @ObfuscatedName("w.a")
    public final int field175;

    @ObfuscatedName("w.t")
    public final class30 field179;

    @ObfuscatedName("w.n")
    public int field174;

    @ObfuscatedName("w.q")
    public class29 field177;

    @ObfuscatedName("w.v")
    public int field176;

    @ObfuscatedName("w.l")
    public int field178;

    public class24(class214 arg0, class214 arg1, int arg2, class30 arg3) {
        super(arg0, arg1);
        this.field175 = arg2;
        this.field179 = arg3;
        this.method293();
    }

    @ObfuscatedName("w.k(B)V")
    public void method293() {
        this.field174 = class254.method3848(this.field175).method4333().field3366;
        this.field177 = this.field179.method432(class242.method1149(this.field174));
        class242 var1 = class242.method1149(this.method210());
        class325 var2 = var1.method4099(false);
        if (var2 == null) {
            this.field176 = 0;
            this.field178 = 0;
        } else {
            this.field176 = var2.field3863;
            this.field178 = var2.field3870;
        }
    }

    @ObfuscatedName("w.a(I)I")
    public int method210() {
        return this.field174;
    }

    @ObfuscatedName("w.t(I)Lar;")
    public class29 method207() {
        return this.field177;
    }

    @ObfuscatedName("w.n(I)I")
    public int method208() {
        return this.field176;
    }

    @ObfuscatedName("w.q(B)I")
    public int method206() {
        return this.field178;
    }
}
