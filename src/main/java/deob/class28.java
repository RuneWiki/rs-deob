package deob;

@ObfuscatedName("ai")
public class class28 extends class44 {

    @ObfuscatedName("ai.m")
    public final int field141;

    @ObfuscatedName("ai.o")
    public final class38 field145;

    @ObfuscatedName("ai.q")
    public final int field143;

    @ObfuscatedName("ai.j")
    public final int field140;

    public class28(class223 arg0, class223 arg1, int arg2, class38 arg3) {
        super(arg0, arg1);
        this.field141 = arg2;
        this.field145 = arg3;
        class252 var5 = class252.method1412(this.method224());
        class335 var6 = var5.method4132(false);
        if (var6 == null) {
            this.field143 = 0;
            this.field140 = 0;
        } else {
            this.field143 = var6.field3897;
            this.field140 = var6.field3895;
        }
    }

    @ObfuscatedName("ai.m(B)I")
    public int method224() {
        return this.field141;
    }

    @ObfuscatedName("ai.o(B)Lar;")
    public class38 method225() {
        return this.field145;
    }

    @ObfuscatedName("ai.q(I)I")
    public int method235() {
        return this.field143;
    }

    @ObfuscatedName("ai.j(I)I")
    public int method223() {
        return this.field140;
    }
}
