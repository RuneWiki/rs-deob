package deob;

@ObfuscatedName("aj")
public class class28 extends class44 {

    @ObfuscatedName("aj.h")
    public final int field150;

    @ObfuscatedName("aj.v")
    public final class38 field145;

    @ObfuscatedName("aj.x")
    public final int field146;

    @ObfuscatedName("aj.w")
    public final int field144;

    public class28(class223 arg0, class223 arg1, int arg2, class38 arg3) {
        super(arg0, arg1);
        this.field150 = arg2;
        this.field145 = arg3;
        class253 var5 = class253.method3211(this.method244());
        class336 var6 = var5.method4038(false);
        if (var6 == null) {
            this.field146 = 0;
            this.field144 = 0;
        } else {
            this.field146 = var6.field3914;
            this.field144 = var6.field3912;
        }
    }

    @ObfuscatedName("aj.h(I)I")
    public int method244() {
        return this.field150;
    }

    @ObfuscatedName("aj.v(I)Lah;")
    public class38 method236() {
        return this.field145;
    }

    @ObfuscatedName("aj.x(B)I")
    public int method247() {
        return this.field146;
    }

    @ObfuscatedName("aj.w(I)I")
    public int method238() {
        return this.field144;
    }
}
