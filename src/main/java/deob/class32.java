package deob;

@ObfuscatedName("ae")
public final class class32 extends class89 {

    @ObfuscatedName("ae.f")
    public int field697;

    @ObfuscatedName("ae.e")
    public int field703;

    @ObfuscatedName("ae.n")
    public int field707;

    @ObfuscatedName("ae.t")
    public int field696;

    @ObfuscatedName("ae.v")
    public int field699;

    @ObfuscatedName("ae.b")
    public int field700;

    @ObfuscatedName("ae.m")
    public class45 field701;

    @ObfuscatedName("ae.k")
    public int field702 = 0;

    @ObfuscatedName("ae.c")
    public int field695 = 0;

    @ObfuscatedName("ae.w")
    public boolean field704 = false;

    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field697 = arg0;
        this.field707 = arg1;
        this.field696 = arg2;
        this.field699 = arg3;
        this.field700 = arg4;
        this.field703 = arg5 + arg6;
        int var8 = class46.method2917(this.field697).field1024;
        if (var8 == -1) {
            this.field704 = true;
        } else {
            this.field704 = false;
            this.field701 = class45.method1289(var8);
        }
    }

    @ObfuscatedName("ae.f(II)V")
    public final void method671(int arg0) {
        if (this.field704) {
            return;
        }
        this.field695 += arg0;
        while (this.field695 > this.field701.field995[this.field702]) {
            this.field695 -= this.field701.field995[this.field702];
            this.field702++;
            if (this.field702 >= this.field701.field993.length) {
                this.field704 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ae.n(B)Ldg;")
    public final class109 method36() {
        class46 var1 = class46.method2917(this.field697);
        class109 var2;
        if (this.field704) {
            var2 = var1.method901(-1);
        } else {
            var2 = var1.method901(this.field702);
        }
        return var2 == null ? null : var2;
    }
}
