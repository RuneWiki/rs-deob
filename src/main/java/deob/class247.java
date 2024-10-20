package deob;

@ObfuscatedName("jf")
public class class247 implements class260 {

    @ObfuscatedName("jf.am")
    public int field2580;

    @ObfuscatedName("jf.ap")
    public int field2585;

    @ObfuscatedName("jf.af")
    public int field2581;

    @ObfuscatedName("jf.aj")
    public int field2582;

    @ObfuscatedName("jf.aq")
    public int field2583;

    @ObfuscatedName("jf.ar")
    public int field2584;

    @ObfuscatedName("jf.ag")
    public int field2579;

    @ObfuscatedName("jf.ao")
    public int field2597;

    @ObfuscatedName("jf.ae")
    public int field2587;

    @ObfuscatedName("jf.aa")
    public int field2586;

    @ObfuscatedName("jf.au")
    public int field2589;

    @ObfuscatedName("jf.an")
    public int field2590;

    @ObfuscatedName("jf.ad")
    public int field2591;

    @ObfuscatedName("jf.ax")
    public int field2595;

    @ObfuscatedName("jf.am(Ljr;S)V")
    public void method4261(class240 arg0) {
        if (arg0.field2513 > this.field2583) {
            arg0.field2513 = this.field2583;
        }
        if (arg0.field2514 < this.field2583) {
            arg0.field2514 = this.field2583;
        }
        if (arg0.field2515 > this.field2584) {
            arg0.field2515 = this.field2584;
        }
        if (arg0.field2516 < this.field2584) {
            arg0.field2516 = this.field2584;
        }
    }

    @ObfuscatedName("jf.ap(IIII)Z")
    public boolean method4243(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2580 && arg0 < this.field2585 + this.field2580) {
            return arg1 >= (this.field2581 << 6) + (this.field2579 << 3) && arg1 <= (this.field2587 << 3) + (this.field2581 << 6) + 7 && arg2 >= (this.field2597 << 3) + (this.field2582 << 6) && arg2 <= (this.field2586 << 3) + (this.field2582 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jf.af(III)Z")
    public boolean method4245(int arg0, int arg1) {
        return arg0 >= (this.field2589 << 3) + (this.field2583 << 6) && arg0 <= (this.field2591 << 3) + (this.field2583 << 6) + 7 && arg1 >= (this.field2590 << 3) + (this.field2584 << 6) && arg1 <= (this.field2595 << 3) + (this.field2584 << 6) + 7;
    }

    @ObfuscatedName("jf.aj(IIII)[I")
    public int[] method4248(int arg0, int arg1, int arg2) {
        return this.method4243(arg0, arg1, arg2) ? new int[] { this.field2589 * 8 - this.field2579 * 8 + this.field2583 * 64 - this.field2581 * 64 + arg1, this.field2590 * 8 - this.field2597 * 8 + this.field2584 * 64 - this.field2582 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jf.aq(III)Lmu;")
    public class337 method4247(int arg0, int arg1) {
        if (this.method4245(arg0, arg1)) {
            int var3 = this.field2579 * 8 - this.field2589 * 8 + this.field2581 * 64 - this.field2583 * 64 + arg0;
            int var4 = this.field2597 * 8 - this.field2590 * 8 + this.field2582 * 64 - this.field2584 * 64 + arg1;
            return new class337(this.field2580, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jf.ar(Luk;B)V")
    public void method4251(class531 arg0) {
        this.field2580 = arg0.method8561();
        this.field2585 = arg0.method8561();
        this.field2581 = arg0.method8775();
        this.field2579 = arg0.method8561();
        this.field2587 = arg0.method8561();
        this.field2582 = arg0.method8775();
        this.field2597 = arg0.method8561();
        this.field2586 = arg0.method8561();
        this.field2583 = arg0.method8775();
        this.field2589 = arg0.method8561();
        this.field2591 = arg0.method8561();
        this.field2584 = arg0.method8775();
        this.field2590 = arg0.method8561();
        this.field2595 = arg0.method8561();
        this.method4535();
    }

    @ObfuscatedName("jf.ag(I)V")
    public void method4535() {
    }
}
