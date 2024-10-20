package deob;

@ObfuscatedName("as")
public class class31 implements class43 {

    @ObfuscatedName("as.a")
    public int field399;

    @ObfuscatedName("as.w")
    public int field407;

    @ObfuscatedName("as.e")
    public int field410;

    @ObfuscatedName("as.k")
    public int field401;

    @ObfuscatedName("as.u")
    public int field402;

    @ObfuscatedName("as.z")
    public int field403;

    @ObfuscatedName("as.t")
    public int field404;

    @ObfuscatedName("as.f")
    public int field405;

    @ObfuscatedName("as.g")
    public int field412;

    @ObfuscatedName("as.j")
    public int field406;

    @ObfuscatedName("as.a(Lax;I)V")
    public void method174(class33 arg0) {
        if (arg0.field425 > this.field404) {
            arg0.field425 = this.field404;
        }
        if (arg0.field418 < this.field412) {
            arg0.field418 = this.field412;
        }
        if (arg0.field426 > this.field405) {
            arg0.field426 = this.field405;
        }
        if (arg0.field432 < this.field406) {
            arg0.field432 = this.field406;
        }
    }

    @ObfuscatedName("as.w(IIII)Z")
    public boolean method175(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field399 && arg0 < this.field407 + this.field399) {
            return arg1 >> 6 >= this.field410 && arg1 >> 6 <= this.field402 && arg2 >> 6 >= this.field401 && arg2 >> 6 <= this.field403;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.e(III)Z")
    public boolean method176(int arg0, int arg1) {
        return arg0 >> 6 >= this.field404 && arg0 >> 6 <= this.field412 && arg1 >> 6 >= this.field405 && arg1 >> 6 <= this.field406;
    }

    @ObfuscatedName("as.k(IIII)[I")
    public int[] method177(int arg0, int arg1, int arg2) {
        return this.method175(arg0, arg1, arg2) ? new int[] { this.field404 * 64 - this.field410 * 64 + arg1, this.field405 * 64 - this.field401 * 64 + arg2 } : null;
    }

    @ObfuscatedName("as.u(III)Lhc;")
    public class224 method178(int arg0, int arg1) {
        if (this.method176(arg0, arg1)) {
            int var3 = this.field410 * 64 - this.field404 * 64 + arg0;
            int var4 = this.field401 * 64 - this.field405 * 64 + arg1;
            return new class224(this.field399, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("as.z(Lgh;I)V")
    public void method194(class185 arg0) {
        this.field399 = arg0.method2962();
        this.field407 = arg0.method2962();
        this.field410 = arg0.method3194();
        this.field401 = arg0.method3194();
        this.field402 = arg0.method3194();
        this.field403 = arg0.method3194();
        this.field404 = arg0.method3194();
        this.field405 = arg0.method3194();
        this.field412 = arg0.method3194();
        this.field406 = arg0.method3194();
        this.method229();
    }

    @ObfuscatedName("as.t(I)V")
    public void method229() {
    }
}
