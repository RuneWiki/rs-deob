package deob;

@ObfuscatedName("am")
public class class40 implements class44 {

    @ObfuscatedName("am.o")
    public int field520;

    @ObfuscatedName("am.k")
    public int field514;

    @ObfuscatedName("am.t")
    public int field517;

    @ObfuscatedName("am.d")
    public int field522;

    @ObfuscatedName("am.h")
    public int field515;

    @ObfuscatedName("am.m")
    public int field518;

    @ObfuscatedName("am.o(Lah;I)V")
    public void method192(class33 arg0) {
        if (arg0.field451 > this.field515) {
            arg0.field451 = this.field515;
        }
        if (arg0.field456 < this.field515) {
            arg0.field456 = this.field515;
        }
        if (arg0.field457 > this.field518) {
            arg0.field457 = this.field518;
        }
        if (arg0.field458 < this.field518) {
            arg0.field458 = this.field518;
        }
    }

    @ObfuscatedName("am.k(IIIB)Z")
    public boolean method194(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field520 && arg0 < this.field520 + this.field514) {
            return arg1 >> 6 == this.field517 && arg2 >> 6 == this.field522;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.t(III)Z")
    public boolean method195(int arg0, int arg1) {
        return arg0 >> 6 == this.field515 && arg1 >> 6 == this.field518;
    }

    @ObfuscatedName("am.d(IIIB)[I")
    public int[] method196(int arg0, int arg1, int arg2) {
        return this.method194(arg0, arg1, arg2) ? new int[] { this.field515 * 64 - this.field517 * 64 + arg1, this.field518 * 64 - this.field522 * 64 + arg2 } : null;
    }

    @ObfuscatedName("am.h(IIB)Lix;")
    public class239 method217(int arg0, int arg1) {
        if (this.method195(arg0, arg1)) {
            int var3 = this.field517 * 64 - this.field515 * 64 + arg0;
            int var4 = this.field522 * 64 - this.field518 * 64 + arg1;
            return new class239(this.field520, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("am.m(Lgc;I)V")
    public void method198(class195 arg0) {
        this.field520 = arg0.method3205();
        this.field514 = arg0.method3205();
        this.field517 = arg0.method3207();
        this.field522 = arg0.method3207();
        this.field515 = arg0.method3207();
        this.field518 = arg0.method3207();
        this.method512();
    }

    @ObfuscatedName("am.z(B)V")
    public void method512() {
    }
}
