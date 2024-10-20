package deob;

@ObfuscatedName("kw")
public class class265 implements class268 {

    @ObfuscatedName("kw.aq")
    public int field2724;

    @ObfuscatedName("kw.ad")
    public int field2727;

    @ObfuscatedName("kw.ag")
    public int field2725;

    @ObfuscatedName("kw.ak")
    public int field2726;

    @ObfuscatedName("kw.ap")
    public int field2723;

    @ObfuscatedName("kw.an")
    public int field2728;

    @ObfuscatedName("kw.aq(Ljm;I)V")
    public void method4238(class248 arg0) {
        if (arg0.field2580 > this.field2723) {
            arg0.field2580 = this.field2723;
        }
        if (arg0.field2576 < this.field2723) {
            arg0.field2576 = this.field2723;
        }
        if (arg0.field2581 > this.field2728) {
            arg0.field2581 = this.field2728;
        }
        if (arg0.field2582 < this.field2728) {
            arg0.field2582 = this.field2728;
        }
    }

    @ObfuscatedName("kw.ad(IIIB)Z")
    public boolean method4239(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2724 && arg0 < this.field2727 + this.field2724) {
            return arg1 >> 6 == this.field2725 && arg2 >> 6 == this.field2726;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kw.ag(III)Z")
    public boolean method4240(int arg0, int arg1) {
        return arg0 >> 6 == this.field2723 && arg1 >> 6 == this.field2728;
    }

    @ObfuscatedName("kw.ak(IIIB)[I")
    public int[] method4241(int arg0, int arg1, int arg2) {
        return this.method4239(arg0, arg1, arg2) ? new int[] { this.field2723 * 64 - this.field2725 * 64 + arg1, this.field2728 * 64 - this.field2726 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kw.ap(III)Lnl;")
    public class348 method4243(int arg0, int arg1) {
        if (this.method4240(arg0, arg1)) {
            int var3 = this.field2725 * 64 - this.field2723 * 64 + arg0;
            int var4 = this.field2726 * 64 - this.field2728 * 64 + arg1;
            return new class348(this.field2724, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kw.an(Lvp;I)V")
    public void method4259(class547 arg0) {
        this.field2724 = arg0.method8804();
        this.field2727 = arg0.method8804();
        this.field2725 = arg0.method8899();
        this.field2726 = arg0.method8899();
        this.field2723 = arg0.method8899();
        this.field2728 = arg0.method8899();
        this.method4587();
    }

    @ObfuscatedName("kw.aj(S)V")
    public void method4587() {
    }
}
