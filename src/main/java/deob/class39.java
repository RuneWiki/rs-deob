package deob;

@ObfuscatedName("ak")
public class class39 implements class43 {

    @ObfuscatedName("ak.e")
    public int field525;

    @ObfuscatedName("ak.n")
    public int field518;

    @ObfuscatedName("ak.g")
    public int field519;

    @ObfuscatedName("ak.y")
    public int field517;

    @ObfuscatedName("ak.w")
    public int field521;

    @ObfuscatedName("ak.k")
    public int field522;

    @ObfuscatedName("ak.e(Lae;B)V")
    public void method181(class33 arg0) {
        if (arg0.field458 > this.field521) {
            arg0.field458 = this.field521;
        }
        if (arg0.field461 < this.field521) {
            arg0.field461 = this.field521;
        }
        if (arg0.field454 > this.field522) {
            arg0.field454 = this.field522;
        }
        if (arg0.field463 < this.field522) {
            arg0.field463 = this.field522;
        }
    }

    @ObfuscatedName("ak.n(IIII)Z")
    public boolean method209(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field525 && arg0 < this.field525 + this.field518) {
            return arg1 >> 6 == this.field519 && arg2 >> 6 == this.field517;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ak.g(III)Z")
    public boolean method183(int arg0, int arg1) {
        return arg0 >> 6 == this.field521 && arg1 >> 6 == this.field522;
    }

    @ObfuscatedName("ak.y(IIII)[I")
    public int[] method184(int arg0, int arg1, int arg2) {
        return this.method209(arg0, arg1, arg2) ? new int[] { this.field521 * 64 - this.field519 * 64 + arg1, this.field522 * 64 - this.field517 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ak.w(III)Lhq;")
    public class214 method198(int arg0, int arg1) {
        if (this.method183(arg0, arg1)) {
            int var3 = this.field519 * 64 - this.field521 * 64 + arg0;
            int var4 = this.field517 * 64 - this.field522 * 64 + arg1;
            return new class214(this.field525, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ak.k(Lfh;B)V")
    public void method186(class175 arg0) {
        this.field525 = arg0.method2928();
        this.field518 = arg0.method2928();
        this.field519 = arg0.method3091();
        this.field517 = arg0.method3091();
        this.field521 = arg0.method3091();
        this.field522 = arg0.method3091();
        this.method473();
    }

    @ObfuscatedName("ak.v(B)V")
    public void method473() {
    }
}
