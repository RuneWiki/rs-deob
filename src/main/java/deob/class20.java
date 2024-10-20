package deob;

@ObfuscatedName("n")
public final class class20 extends class94 {

    @ObfuscatedName("n.i")
    public int field304;

    @ObfuscatedName("n.w")
    public int field297;

    @ObfuscatedName("n.f")
    public int field298;

    @ObfuscatedName("n.e")
    public int field299;

    @ObfuscatedName("n.t")
    public int field300;

    @ObfuscatedName("n.d")
    public int field305;

    @ObfuscatedName("n.p")
    public class34 field310;

    @ObfuscatedName("n.k")
    public int field303 = 0;

    @ObfuscatedName("n.r")
    public int field296 = 0;

    @ObfuscatedName("n.l")
    public boolean field302 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field304 = arg0;
        this.field298 = arg1;
        this.field299 = arg2;
        this.field300 = arg3;
        this.field305 = arg4;
        this.field297 = arg5 + arg6;
        int var8 = class35.method633(this.field304).field912;
        if (var8 == -1) {
            this.field302 = true;
        } else {
            this.field302 = false;
            this.field310 = class34.method235(var8);
        }
    }

    @ObfuscatedName("n.i(IB)V")
    public final void method195(int arg0) {
        if (this.field302) {
            return;
        }
        this.field296 += arg0;
        while (this.field296 > this.field310.field891[this.field303]) {
            this.field296 -= this.field310.field891[this.field303];
            this.field303++;
            if (this.field303 >= this.field310.field889.length) {
                this.field302 = true;
                break;
            }
        }
    }

    @ObfuscatedName("n.w(I)Ldb;")
    public final class112 method17() {
        class35 var1 = class35.method633(this.field304);
        class112 var2;
        if (this.field302) {
            var2 = var1.method743(-1);
        } else {
            var2 = var1.method743(this.field303);
        }
        return var2 == null ? null : var2;
    }
}
