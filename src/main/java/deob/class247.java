package deob;

@ObfuscatedName("jo")
public class class247 implements class268 {

    @ObfuscatedName("jo.aq")
    public int field2570;

    @ObfuscatedName("jo.ad")
    public int field2560;

    @ObfuscatedName("jo.ag")
    public int field2559;

    @ObfuscatedName("jo.ak")
    public int field2567;

    @ObfuscatedName("jo.ap")
    public int field2563;

    @ObfuscatedName("jo.an")
    public int field2561;

    @ObfuscatedName("jo.aj")
    public int field2565;

    @ObfuscatedName("jo.av")
    public int field2566;

    @ObfuscatedName("jo.ab")
    public int field2564;

    @ObfuscatedName("jo.ai")
    public int field2568;

    @ObfuscatedName("jo.aq(Ljm;I)V")
    public void method4238(class248 arg0) {
        if (arg0.field2580 > this.field2565) {
            arg0.field2580 = this.field2565;
        }
        if (arg0.field2576 < this.field2564) {
            arg0.field2576 = this.field2564;
        }
        if (arg0.field2581 > this.field2566) {
            arg0.field2581 = this.field2566;
        }
        if (arg0.field2582 < this.field2568) {
            arg0.field2582 = this.field2568;
        }
    }

    @ObfuscatedName("jo.ad(IIIB)Z")
    public boolean method4239(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2570 && arg0 < this.field2570 + this.field2560) {
            return arg1 >> 6 >= this.field2559 && arg1 >> 6 <= this.field2563 && arg2 >> 6 >= this.field2567 && arg2 >> 6 <= this.field2561;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jo.ag(III)Z")
    public boolean method4240(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2565 && arg0 >> 6 <= this.field2564 && arg1 >> 6 >= this.field2566 && arg1 >> 6 <= this.field2568;
    }

    @ObfuscatedName("jo.ak(IIIB)[I")
    public int[] method4241(int arg0, int arg1, int arg2) {
        return this.method4239(arg0, arg1, arg2) ? new int[] { this.field2565 * 64 - this.field2559 * 64 + arg1, this.field2566 * 64 - this.field2567 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jo.ap(III)Lnl;")
    public class348 method4243(int arg0, int arg1) {
        if (this.method4240(arg0, arg1)) {
            int var3 = this.field2559 * 64 - this.field2565 * 64 + arg0;
            int var4 = this.field2567 * 64 - this.field2566 * 64 + arg1;
            return new class348(this.field2570, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jo.an(Lvp;I)V")
    public void method4259(class547 arg0) {
        this.field2570 = arg0.method8804();
        this.field2560 = arg0.method8804();
        this.field2559 = arg0.method8899();
        this.field2567 = arg0.method8899();
        this.field2563 = arg0.method8899();
        this.field2561 = arg0.method8899();
        this.field2565 = arg0.method8899();
        this.field2566 = arg0.method8899();
        this.field2564 = arg0.method8899();
        this.field2568 = arg0.method8899();
        this.method4244();
    }

    @ObfuscatedName("jo.aj(I)V")
    public void method4244() {
    }
}
