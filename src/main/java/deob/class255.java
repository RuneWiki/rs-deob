package deob;

@ObfuscatedName("jl")
public class class255 implements class268 {

    @ObfuscatedName("jl.aq")
    public int field2649;

    @ObfuscatedName("jl.ad")
    public int field2643;

    @ObfuscatedName("jl.ag")
    public int field2654;

    @ObfuscatedName("jl.ak")
    public int field2645;

    @ObfuscatedName("jl.ap")
    public int field2646;

    @ObfuscatedName("jl.an")
    public int field2656;

    @ObfuscatedName("jl.aj")
    public int field2655;

    @ObfuscatedName("jl.av")
    public int field2644;

    @ObfuscatedName("jl.ab")
    public int field2650;

    @ObfuscatedName("jl.ai")
    public int field2651;

    @ObfuscatedName("jl.ae")
    public int field2652;

    @ObfuscatedName("jl.au")
    public int field2653;

    @ObfuscatedName("jl.ah")
    public int field2647;

    @ObfuscatedName("jl.az")
    public int field2642;

    @ObfuscatedName("jl.aq(Ljm;I)V")
    public void method4238(class248 arg0) {
        if (arg0.field2580 > this.field2646) {
            arg0.field2580 = this.field2646;
        }
        if (arg0.field2576 < this.field2646) {
            arg0.field2576 = this.field2646;
        }
        if (arg0.field2581 > this.field2656) {
            arg0.field2581 = this.field2656;
        }
        if (arg0.field2582 < this.field2656) {
            arg0.field2582 = this.field2656;
        }
    }

    @ObfuscatedName("jl.ad(IIIB)Z")
    public boolean method4239(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2649 && arg0 < this.field2649 + this.field2643) {
            return arg1 >= (this.field2655 << 3) + (this.field2654 << 6) && arg1 <= (this.field2654 << 6) + (this.field2650 << 3) + 7 && arg2 >= (this.field2645 << 6) + (this.field2644 << 3) && arg2 <= (this.field2651 << 3) + (this.field2645 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jl.ag(III)Z")
    public boolean method4240(int arg0, int arg1) {
        return arg0 >= (this.field2652 << 3) + (this.field2646 << 6) && arg0 <= (this.field2647 << 3) + (this.field2646 << 6) + 7 && arg1 >= (this.field2656 << 6) + (this.field2653 << 3) && arg1 <= (this.field2656 << 6) + (this.field2642 << 3) + 7;
    }

    @ObfuscatedName("jl.ak(IIIB)[I")
    public int[] method4241(int arg0, int arg1, int arg2) {
        return this.method4239(arg0, arg1, arg2) ? new int[] { this.field2652 * 8 - this.field2655 * 8 + this.field2646 * 64 - this.field2654 * 64 + arg1, this.field2653 * 8 - this.field2644 * 8 + this.field2656 * 64 - this.field2645 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jl.ap(III)Lnl;")
    public class348 method4243(int arg0, int arg1) {
        if (this.method4240(arg0, arg1)) {
            int var3 = this.field2655 * 8 - this.field2652 * 8 + this.field2654 * 64 - this.field2646 * 64 + arg0;
            int var4 = this.field2644 * 8 - this.field2653 * 8 + this.field2645 * 64 - this.field2656 * 64 + arg1;
            return new class348(this.field2649, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jl.an(Lvp;I)V")
    public void method4259(class547 arg0) {
        this.field2649 = arg0.method8804();
        this.field2643 = arg0.method8804();
        this.field2654 = arg0.method8899();
        this.field2655 = arg0.method8804();
        this.field2650 = arg0.method8804();
        this.field2645 = arg0.method8899();
        this.field2644 = arg0.method8804();
        this.field2651 = arg0.method8804();
        this.field2646 = arg0.method8899();
        this.field2652 = arg0.method8804();
        this.field2647 = arg0.method8804();
        this.field2656 = arg0.method8899();
        this.field2653 = arg0.method8804();
        this.field2642 = arg0.method8804();
        this.method4531();
    }

    @ObfuscatedName("jl.aj(I)V")
    public void method4531() {
    }
}
