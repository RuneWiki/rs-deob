package deob;

@ObfuscatedName("ah")
public final class class30 extends class85 {

    @ObfuscatedName("ah.o")
    public int field702;

    @ObfuscatedName("ah.f")
    public int field692;

    @ObfuscatedName("ah.i")
    public int field693;

    @ObfuscatedName("ah.h")
    public int field694;

    @ObfuscatedName("ah.q")
    public int field705;

    @ObfuscatedName("ah.u")
    public int field696;

    @ObfuscatedName("ah.m")
    public class43 field697;

    @ObfuscatedName("ah.y")
    public int field698 = 0;

    @ObfuscatedName("ah.p")
    public int field701 = 0;

    @ObfuscatedName("ah.t")
    public boolean field691 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field702 = arg0;
        this.field693 = arg1;
        this.field694 = arg2;
        this.field705 = arg3;
        this.field696 = arg4;
        this.field692 = arg5 + arg6;
        int var8 = class44.method1455(this.field702).field998;
        if (var8 == -1) {
            this.field691 = true;
        } else {
            this.field691 = false;
            this.field697 = class43.method3081(var8);
        }
    }

    @ObfuscatedName("ah.o(II)V")
    public final void method632(int arg0) {
        if (this.field691) {
            return;
        }
        this.field701 += arg0;
        while (this.field701 > this.field697.field980[this.field698]) {
            this.field701 -= this.field697.field980[this.field698];
            this.field698++;
            if (this.field698 >= this.field697.field978.length) {
                this.field691 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ah.i(B)Ldm;")
    public final class105 method21() {
        class44 var1 = class44.method1455(this.field702);
        class105 var2;
        if (this.field691) {
            var2 = var1.method847(-1);
        } else {
            var2 = var1.method847(this.field698);
        }
        return var2 == null ? null : var2;
    }
}
