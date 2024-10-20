package deob;

@ObfuscatedName("ai")
public final class class34 extends class90 {

    @ObfuscatedName("ai.u")
    public int field742;

    @ObfuscatedName("ai.x")
    public int field738;

    @ObfuscatedName("ai.i")
    public int field734;

    @ObfuscatedName("ai.a")
    public int field736;

    @ObfuscatedName("ai.f")
    public int field737;

    @ObfuscatedName("ai.c")
    public int field739;

    @ObfuscatedName("ai.d")
    public class202 field740;

    @ObfuscatedName("ai.l")
    public int field745 = 0;

    @ObfuscatedName("ai.g")
    public int field741 = 0;

    @ObfuscatedName("ai.z")
    public boolean field743 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field742 = arg0;
        this.field736 = arg1;
        this.field737 = arg2;
        this.field738 = arg3;
        this.field739 = arg4;
        this.field734 = arg5 + arg6;
        int var8 = class191.method3182(this.field742).field2773;
        if (var8 == -1) {
            this.field743 = true;
        } else {
            this.field743 = false;
            this.field740 = class202.method3327(var8);
        }
    }

    @ObfuscatedName("ai.u(IB)V")
    public final void method691(int arg0) {
        if (this.field743) {
            return;
        }
        this.field741 += arg0;
        while (this.field741 > this.field740.field3049[this.field745]) {
            this.field741 -= this.field740.field3049[this.field745];
            this.field745++;
            if (this.field745 >= this.field740.field3042.length) {
                this.field743 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ai.i(B)Lcs;")
    public final class83 method217() {
        class191 var1 = class191.method3182(this.field742);
        class83 var2;
        if (this.field743) {
            var2 = var1.method3239(-1);
        } else {
            var2 = var1.method3239(this.field745);
        }
        return var2 == null ? null : var2;
    }
}
