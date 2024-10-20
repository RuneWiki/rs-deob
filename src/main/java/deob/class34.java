package deob;

@ObfuscatedName("ah")
public final class class34 extends class90 {

    @ObfuscatedName("ah.o")
    public int field750;

    @ObfuscatedName("ah.m")
    public int field759;

    @ObfuscatedName("ah.b")
    public int field748;

    @ObfuscatedName("ah.g")
    public int field751;

    @ObfuscatedName("ah.h")
    public int field746;

    @ObfuscatedName("ah.v")
    public int field756;

    @ObfuscatedName("ah.l")
    public class202 field752;

    @ObfuscatedName("ah.c")
    public int field753 = 0;

    @ObfuscatedName("ah.u")
    public int field754 = 0;

    @ObfuscatedName("ah.k")
    public boolean field755 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field750 = arg0;
        this.field748 = arg1;
        this.field751 = arg2;
        this.field746 = arg3;
        this.field756 = arg4;
        this.field759 = arg5 + arg6;
        int var8 = class191.method3446(this.field750).field2804;
        if (var8 == -1) {
            this.field755 = true;
        } else {
            this.field755 = false;
            this.field752 = class202.method658(var8);
        }
    }

    @ObfuscatedName("ah.o(IB)V")
    public final void method669(int arg0) {
        if (this.field755) {
            return;
        }
        this.field754 += arg0;
        while (this.field754 > this.field752.field3048[this.field753]) {
            this.field754 -= this.field752.field3048[this.field753];
            this.field753++;
            if (this.field753 >= this.field752.field3051.length) {
                this.field755 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ah.b(B)Lcy;")
    public final class83 method212() {
        class191 var1 = class191.method3446(this.field750);
        class83 var2;
        if (this.field755) {
            var2 = var1.method3188(-1);
        } else {
            var2 = var1.method3188(this.field753);
        }
        return var2 == null ? null : var2;
    }
}
