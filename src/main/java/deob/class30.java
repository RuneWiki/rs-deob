package deob;

@ObfuscatedName("ab")
public final class class30 extends class85 {

    @ObfuscatedName("ab.h")
    public int field702;

    @ObfuscatedName("ab.m")
    public int field698;

    @ObfuscatedName("ab.i")
    public int field692;

    @ObfuscatedName("ab.q")
    public int field693;

    @ObfuscatedName("ab.p")
    public int field694;

    @ObfuscatedName("ab.c")
    public int field695;

    @ObfuscatedName("ab.f")
    public class43 field696;

    @ObfuscatedName("ab.y")
    public int field704 = 0;

    @ObfuscatedName("ab.w")
    public int field697 = 0;

    @ObfuscatedName("ab.l")
    public boolean field699 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field702 = arg0;
        this.field692 = arg1;
        this.field693 = arg2;
        this.field694 = arg3;
        this.field695 = arg4;
        this.field698 = arg5 + arg6;
        int var8 = class44.method2239(this.field702).field1017;
        if (var8 == -1) {
            this.field699 = true;
        } else {
            this.field699 = false;
            this.field696 = class43.method2257(var8);
        }
    }

    @ObfuscatedName("ab.h(II)V")
    public final void method619(int arg0) {
        if (this.field699) {
            return;
        }
        this.field697 += arg0;
        while (this.field697 > this.field696.field995[this.field704]) {
            this.field697 -= this.field696.field995[this.field704];
            this.field704++;
            if (this.field704 >= this.field696.field988.length) {
                this.field699 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ab.i(B)Ldb;")
    public final class105 method34() {
        class44 var1 = class44.method2239(this.field702);
        class105 var2;
        if (this.field699) {
            var2 = var1.method870(-1);
        } else {
            var2 = var1.method870(this.field704);
        }
        return var2 == null ? null : var2;
    }
}
