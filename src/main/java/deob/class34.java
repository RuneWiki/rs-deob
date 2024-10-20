package deob;

@ObfuscatedName("ax")
public final class class34 extends class90 {

    @ObfuscatedName("ax.f")
    public int field764;

    @ObfuscatedName("ax.i")
    public int field773;

    @ObfuscatedName("ax.u")
    public int field760;

    @ObfuscatedName("ax.h")
    public int field758;

    @ObfuscatedName("ax.r")
    public int field769;

    @ObfuscatedName("ax.o")
    public int field763;

    @ObfuscatedName("ax.l")
    public class202 field761;

    @ObfuscatedName("ax.n")
    public int field765 = 0;

    @ObfuscatedName("ax.m")
    public int field766 = 0;

    @ObfuscatedName("ax.w")
    public boolean field767 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field764 = arg0;
        this.field760 = arg1;
        this.field758 = arg2;
        this.field769 = arg3;
        this.field763 = arg4;
        this.field773 = arg5 + arg6;
        int var8 = class191.method2599(this.field764).field2809;
        if (var8 == -1) {
            this.field767 = true;
        } else {
            this.field767 = false;
            this.field761 = class202.method164(var8);
        }
    }

    @ObfuscatedName("ax.f(IB)V")
    public final void method707(int arg0) {
        if (this.field767) {
            return;
        }
        this.field766 += arg0;
        while (this.field766 > this.field761.field3066[this.field765]) {
            this.field766 -= this.field761.field3066[this.field765];
            this.field765++;
            if (this.field765 >= this.field761.field3061.length) {
                this.field767 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ax.u(B)Lce;")
    public final class83 method209() {
        class191 var1 = class191.method2599(this.field764);
        class83 var2;
        if (this.field767) {
            var2 = var1.method3293(-1);
        } else {
            var2 = var1.method3293(this.field765);
        }
        return var2 == null ? null : var2;
    }
}
