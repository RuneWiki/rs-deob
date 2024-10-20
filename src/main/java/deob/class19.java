package deob;

@ObfuscatedName("k")
public class class19 extends class35 {

    @ObfuscatedName("k.a")
    public final int field135;

    @ObfuscatedName("k.s")
    public final class29 field130;

    @ObfuscatedName("k.g")
    public final int field132;

    @ObfuscatedName("k.x")
    public final int field133;

    public class19(class235 arg0, class235 arg1, int arg2, class29 arg3) {
        super(arg0, arg1);
        this.field135 = arg2;
        this.field130 = arg3;
        class263 var5 = class263.method379(this.method201());
        class328 var6 = var5.method4611(false);
        if (var6 == null) {
            this.field132 = 0;
            this.field133 = 0;
        } else {
            this.field132 = var6.field3899;
            this.field133 = var6.field3890;
        }
    }

    @ObfuscatedName("k.a(B)I")
    public int method201() {
        return this.field135;
    }

    @ObfuscatedName("k.s(I)Lay;")
    public class29 method202() {
        return this.field130;
    }

    @ObfuscatedName("k.g(I)I")
    public int method200() {
        return this.field132;
    }

    @ObfuscatedName("k.x(B)I")
    public int method215() {
        return this.field133;
    }
}
