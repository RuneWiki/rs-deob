package deob;

@ObfuscatedName("ad")
public class class49 implements class43 {

    @ObfuscatedName("ad.m")
    public int field587;

    @ObfuscatedName("ad.p")
    public int field586;

    @ObfuscatedName("ad.i")
    public int field597;

    @ObfuscatedName("ad.j")
    public int field589;

    @ObfuscatedName("ad.v")
    public int field590;

    @ObfuscatedName("ad.x")
    public int field591;

    @ObfuscatedName("ad.e")
    public int field602;

    @ObfuscatedName("ad.l")
    public int field593;

    @ObfuscatedName("ad.b")
    public int field594;

    @ObfuscatedName("ad.n")
    public int field595;

    @ObfuscatedName("ad.m(Lap;I)V")
    public void method194(class33 arg0) {
        if (arg0.field431 > this.field590) {
            arg0.field431 = this.field590;
        }
        if (arg0.field433 < this.field590) {
            arg0.field433 = this.field590;
        }
        if (arg0.field439 > this.field591) {
            arg0.field439 = this.field591;
        }
        if (arg0.field440 < this.field591) {
            arg0.field440 = this.field591;
        }
    }

    @ObfuscatedName("ad.p(IIII)Z")
    public boolean method193(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field587 && arg0 < this.field587 + this.field586) {
            return arg1 >= (this.field602 << 3) + (this.field597 << 6) && arg1 <= (this.field602 << 3) + (this.field597 << 6) + 7 && arg2 >= (this.field593 << 3) + (this.field589 << 6) && arg2 <= (this.field593 << 3) + (this.field589 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.i(IIB)Z")
    public boolean method196(int arg0, int arg1) {
        return arg0 >= (this.field594 << 3) + (this.field590 << 6) && arg0 <= (this.field594 << 3) + (this.field590 << 6) + 7 && arg1 >= (this.field595 << 3) + (this.field591 << 6) && arg1 <= (this.field595 << 3) + (this.field591 << 6) + 7;
    }

    @ObfuscatedName("ad.j(IIII)[I")
    public int[] method197(int arg0, int arg1, int arg2) {
        return this.method193(arg0, arg1, arg2) ? new int[] { this.field594 * 8 - this.field602 * 8 + this.field590 * 64 - this.field597 * 64 + arg1, this.field595 * 8 - this.field593 * 8 + this.field591 * 64 - this.field589 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ad.v(IIB)Lhq;")
    public class220 method198(int arg0, int arg1) {
        if (this.method196(arg0, arg1)) {
            int var3 = this.field602 * 8 - this.field594 * 8 + this.field597 * 64 - this.field590 * 64 + arg0;
            int var4 = this.field593 * 8 - this.field595 * 8 + this.field589 * 64 - this.field591 * 64 + arg1;
            return new class220(this.field587, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.x(Lfv;S)V")
    public void method199(class181 arg0) {
        this.field587 = arg0.method3012();
        this.field586 = arg0.method3012();
        this.field597 = arg0.method3009();
        this.field602 = arg0.method3012();
        this.field589 = arg0.method3009();
        this.field593 = arg0.method3012();
        this.field590 = arg0.method3009();
        this.field594 = arg0.method3012();
        this.field591 = arg0.method3009();
        this.field595 = arg0.method3012();
        this.method684();
    }

    @ObfuscatedName("ad.e(I)V")
    public void method684() {
    }
}
