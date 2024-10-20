package deob;

@ObfuscatedName("as")
public class class50 implements class44 {

    @ObfuscatedName("as.o")
    public int field600;

    @ObfuscatedName("as.k")
    public int field598;

    @ObfuscatedName("as.t")
    public int field599;

    @ObfuscatedName("as.d")
    public int field609;

    @ObfuscatedName("as.h")
    public int field601;

    @ObfuscatedName("as.m")
    public int field597;

    @ObfuscatedName("as.z")
    public int field603;

    @ObfuscatedName("as.i")
    public int field604;

    @ObfuscatedName("as.u")
    public int field605;

    @ObfuscatedName("as.x")
    public int field606;

    @ObfuscatedName("as.o(Lah;I)V")
    public void method192(class33 arg0) {
        if (arg0.field451 > this.field601) {
            arg0.field451 = this.field601;
        }
        if (arg0.field456 < this.field601) {
            arg0.field456 = this.field601;
        }
        if (arg0.field457 > this.field597) {
            arg0.field457 = this.field597;
        }
        if (arg0.field458 < this.field597) {
            arg0.field458 = this.field597;
        }
    }

    @ObfuscatedName("as.k(IIIB)Z")
    public boolean method194(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field600 && arg0 < this.field600 + this.field598) {
            return arg1 >= (this.field603 << 3) + (this.field599 << 6) && arg1 <= (this.field603 << 3) + (this.field599 << 6) + 7 && arg2 >= (this.field609 << 6) + (this.field604 << 3) && arg2 <= (this.field609 << 6) + (this.field604 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.t(III)Z")
    public boolean method195(int arg0, int arg1) {
        return arg0 >= (this.field605 << 3) + (this.field601 << 6) && arg0 <= (this.field605 << 3) + (this.field601 << 6) + 7 && arg1 >= (this.field606 << 3) + (this.field597 << 6) && arg1 <= (this.field606 << 3) + (this.field597 << 6) + 7;
    }

    @ObfuscatedName("as.d(IIIB)[I")
    public int[] method196(int arg0, int arg1, int arg2) {
        return this.method194(arg0, arg1, arg2) ? new int[] { this.field605 * 8 - this.field603 * 8 + this.field601 * 64 - this.field599 * 64 + arg1, this.field606 * 8 - this.field604 * 8 + this.field597 * 64 - this.field609 * 64 + arg2 } : null;
    }

    @ObfuscatedName("as.h(IIB)Lix;")
    public class239 method217(int arg0, int arg1) {
        if (this.method195(arg0, arg1)) {
            int var3 = this.field603 * 8 - this.field605 * 8 + this.field599 * 64 - this.field601 * 64 + arg0;
            int var4 = this.field604 * 8 - this.field606 * 8 + this.field609 * 64 - this.field597 * 64 + arg1;
            return new class239(this.field600, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("as.m(Lgc;I)V")
    public void method198(class195 arg0) {
        this.field600 = arg0.method3205();
        this.field598 = arg0.method3205();
        this.field599 = arg0.method3207();
        this.field603 = arg0.method3205();
        this.field609 = arg0.method3207();
        this.field604 = arg0.method3205();
        this.field601 = arg0.method3207();
        this.field605 = arg0.method3205();
        this.field597 = arg0.method3207();
        this.field606 = arg0.method3205();
        this.method662();
    }

    @ObfuscatedName("as.z(I)V")
    public void method662() {
    }
}
