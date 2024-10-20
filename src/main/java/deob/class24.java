package deob;

@ObfuscatedName("c")
public class class24 extends class35 {

    @ObfuscatedName("c.a")
    public final int field196;

    @ObfuscatedName("c.s")
    public final class30 field195;

    @ObfuscatedName("c.g")
    public int field202;

    @ObfuscatedName("c.x")
    public class29 field198;

    @ObfuscatedName("c.h")
    public int field199;

    @ObfuscatedName("c.f")
    public int field200;

    public class24(class235 arg0, class235 arg1, int arg2, class30 arg3) {
        super(arg0, arg1);
        this.field196 = arg2;
        this.field195 = arg3;
        this.method282();
    }

    @ObfuscatedName("c.r(I)V")
    public void method282() {
        this.field202 = class275.method117(this.field196).method4852().field3481;
        this.field198 = this.field195.method413(class263.method379(this.field202));
        class263 var1 = class263.method379(this.method201());
        class328 var2 = var1.method4611(false);
        if (var2 == null) {
            this.field199 = 0;
            this.field200 = 0;
        } else {
            this.field199 = var2.field3899;
            this.field200 = var2.field3890;
        }
    }

    @ObfuscatedName("c.a(B)I")
    public int method201() {
        return this.field202;
    }

    @ObfuscatedName("c.s(I)Lay;")
    public class29 method202() {
        return this.field198;
    }

    @ObfuscatedName("c.g(I)I")
    public int method200() {
        return this.field199;
    }

    @ObfuscatedName("c.x(B)I")
    public int method215() {
        return this.field200;
    }
}
