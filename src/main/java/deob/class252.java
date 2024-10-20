package deob;

@ObfuscatedName("ja")
public class class252 implements class268 {

    @ObfuscatedName("ja.aq")
    public int field2626;

    @ObfuscatedName("ja.ad")
    public int field2623;

    @ObfuscatedName("ja.ag")
    public int field2624;

    @ObfuscatedName("ja.ak")
    public int field2628;

    @ObfuscatedName("ja.ap")
    public int field2630;

    @ObfuscatedName("ja.an")
    public int field2627;

    @ObfuscatedName("ja.aj")
    public int field2622;

    @ObfuscatedName("ja.av")
    public int field2629;

    @ObfuscatedName("ja.ab")
    public int field2625;

    @ObfuscatedName("ja.ai")
    public int field2631;

    @ObfuscatedName("ja.aq(Ljm;I)V")
    public void method4238(class248 arg0) {
        if (arg0.field2580 > this.field2630) {
            arg0.field2580 = this.field2630;
        }
        if (arg0.field2576 < this.field2630) {
            arg0.field2576 = this.field2630;
        }
        if (arg0.field2581 > this.field2627) {
            arg0.field2581 = this.field2627;
        }
        if (arg0.field2582 < this.field2627) {
            arg0.field2582 = this.field2627;
        }
    }

    @ObfuscatedName("ja.ad(IIIB)Z")
    public boolean method4239(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2626 && arg0 < this.field2626 + this.field2623) {
            return arg1 >= (this.field2624 << 6) + (this.field2622 << 3) && arg1 <= (this.field2624 << 6) + (this.field2622 << 3) + 7 && arg2 >= (this.field2629 << 3) + (this.field2628 << 6) && arg2 <= (this.field2629 << 3) + (this.field2628 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ja.ag(III)Z")
    public boolean method4240(int arg0, int arg1) {
        return arg0 >= (this.field2630 << 6) + (this.field2625 << 3) && arg0 <= (this.field2630 << 6) + (this.field2625 << 3) + 7 && arg1 >= (this.field2631 << 3) + (this.field2627 << 6) && arg1 <= (this.field2631 << 3) + (this.field2627 << 6) + 7;
    }

    @ObfuscatedName("ja.ak(IIIB)[I")
    public int[] method4241(int arg0, int arg1, int arg2) {
        return this.method4239(arg0, arg1, arg2) ? new int[] { this.field2625 * 8 - this.field2622 * 8 + this.field2630 * 64 - this.field2624 * 64 + arg1, this.field2631 * 8 - this.field2629 * 8 + this.field2627 * 64 - this.field2628 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ja.ap(III)Lnl;")
    public class348 method4243(int arg0, int arg1) {
        if (this.method4240(arg0, arg1)) {
            int var3 = this.field2622 * 8 - this.field2625 * 8 + this.field2624 * 64 - this.field2630 * 64 + arg0;
            int var4 = this.field2629 * 8 - this.field2631 * 8 + this.field2628 * 64 - this.field2627 * 64 + arg1;
            return new class348(this.field2626, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ja.an(Lvp;I)V")
    public void method4259(class547 arg0) {
        this.field2626 = arg0.method8804();
        this.field2623 = arg0.method8804();
        this.field2624 = arg0.method8899();
        this.field2622 = arg0.method8804();
        this.field2628 = arg0.method8899();
        this.field2629 = arg0.method8804();
        this.field2630 = arg0.method8899();
        this.field2625 = arg0.method8804();
        this.field2627 = arg0.method8899();
        this.field2631 = arg0.method8804();
        this.method4525();
    }

    @ObfuscatedName("ja.aj(I)V")
    public void method4525() {
    }
}
