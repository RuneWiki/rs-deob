package deob;

@ObfuscatedName("aj")
public final class class32 extends class89 {

    @ObfuscatedName("aj.k")
    public int field706;

    @ObfuscatedName("aj.q")
    public int field707;

    @ObfuscatedName("aj.f")
    public int field708;

    @ObfuscatedName("aj.c")
    public int field719;

    @ObfuscatedName("aj.v")
    public int field713;

    @ObfuscatedName("aj.j")
    public int field711;

    @ObfuscatedName("aj.m")
    public class45 field712;

    @ObfuscatedName("aj.y")
    public int field709 = 0;

    @ObfuscatedName("aj.u")
    public int field718 = 0;

    @ObfuscatedName("aj.h")
    public boolean field715 = false;

    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field706 = arg0;
        this.field708 = arg1;
        this.field719 = arg2;
        this.field713 = arg3;
        this.field711 = arg4;
        this.field707 = arg5 + arg6;
        int var8 = class46.method2984(this.field706).field1036;
        if (var8 == -1) {
            this.field715 = true;
        } else {
            this.field715 = false;
            this.field712 = class45.method726(var8);
        }
    }

    @ObfuscatedName("aj.k(IB)V")
    public final void method664(int arg0) {
        if (this.field715) {
            return;
        }
        this.field718 += arg0;
        while (this.field718 > this.field712.field1009[this.field709]) {
            this.field718 -= this.field712.field1009[this.field709];
            this.field709++;
            if (this.field709 >= this.field712.field1007.length) {
                this.field715 = true;
                break;
            }
        }
    }

    @ObfuscatedName("aj.f(I)Ldj;")
    public final class109 method14() {
        class46 var1 = class46.method2984(this.field706);
        class109 var2;
        if (this.field715) {
            var2 = var1.method904(-1);
        } else {
            var2 = var1.method904(this.field709);
        }
        return var2 == null ? null : var2;
    }
}
