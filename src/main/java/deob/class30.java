package deob;

@ObfuscatedName("ag")
public final class class30 extends class85 {

    @ObfuscatedName("ag.g")
    public int field712;

    @ObfuscatedName("ag.b")
    public int field702;

    @ObfuscatedName("ag.w")
    public int field715;

    @ObfuscatedName("ag.d")
    public int field704;

    @ObfuscatedName("ag.z")
    public int field706;

    @ObfuscatedName("ag.l")
    public int field701;

    @ObfuscatedName("ag.m")
    public class43 field707;

    @ObfuscatedName("ag.p")
    public int field708 = 0;

    @ObfuscatedName("ag.u")
    public int field709 = 0;

    @ObfuscatedName("ag.c")
    public boolean field710 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field712 = arg0;
        this.field715 = arg1;
        this.field704 = arg2;
        this.field701 = arg3;
        this.field706 = arg4;
        this.field702 = arg5 + arg6;
        int var8 = class44.method2656(this.field712).field1017;
        if (var8 == -1) {
            this.field710 = true;
        } else {
            this.field710 = false;
            this.field707 = class43.method2054(var8);
        }
    }

    @ObfuscatedName("ag.g(II)V")
    public final void method665(int arg0) {
        if (this.field710) {
            return;
        }
        this.field709 += arg0;
        while (this.field709 > this.field707.field996[this.field708]) {
            this.field709 -= this.field707.field996[this.field708];
            this.field708++;
            if (this.field708 >= this.field707.field994.length) {
                this.field710 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ag.w(I)Ldd;")
    public final class105 method19() {
        class44 var1 = class44.method2656(this.field712);
        class105 var2;
        if (this.field710) {
            var2 = var1.method917(-1);
        } else {
            var2 = var1.method917(this.field708);
        }
        return var2 == null ? null : var2;
    }
}
