package deob;

@ObfuscatedName("jv")
public class class244 implements class260 {

    @ObfuscatedName("jv.am")
    public int field2562;

    @ObfuscatedName("jv.ap")
    public int field2561;

    @ObfuscatedName("jv.af")
    public int field2567;

    @ObfuscatedName("jv.aj")
    public int field2563;

    @ObfuscatedName("jv.aq")
    public int field2571;

    @ObfuscatedName("jv.ar")
    public int field2565;

    @ObfuscatedName("jv.ag")
    public int field2566;

    @ObfuscatedName("jv.ao")
    public int field2564;

    @ObfuscatedName("jv.ae")
    public int field2568;

    @ObfuscatedName("jv.aa")
    public int field2560;

    @ObfuscatedName("jv.am(Ljr;S)V")
    public void method4261(class240 arg0) {
        if (arg0.field2513 > this.field2571) {
            arg0.field2513 = this.field2571;
        }
        if (arg0.field2514 < this.field2571) {
            arg0.field2514 = this.field2571;
        }
        if (arg0.field2515 > this.field2565) {
            arg0.field2515 = this.field2565;
        }
        if (arg0.field2516 < this.field2565) {
            arg0.field2516 = this.field2565;
        }
    }

    @ObfuscatedName("jv.ap(IIII)Z")
    public boolean method4243(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2562 && arg0 < this.field2562 + this.field2561) {
            return arg1 >= (this.field2567 << 6) + (this.field2566 << 3) && arg1 <= (this.field2567 << 6) + (this.field2566 << 3) + 7 && arg2 >= (this.field2564 << 3) + (this.field2563 << 6) && arg2 <= (this.field2564 << 3) + (this.field2563 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jv.af(III)Z")
    public boolean method4245(int arg0, int arg1) {
        return arg0 >= (this.field2571 << 6) + (this.field2568 << 3) && arg0 <= (this.field2571 << 6) + (this.field2568 << 3) + 7 && arg1 >= (this.field2565 << 6) + (this.field2560 << 3) && arg1 <= (this.field2565 << 6) + (this.field2560 << 3) + 7;
    }

    @ObfuscatedName("jv.aj(IIII)[I")
    public int[] method4248(int arg0, int arg1, int arg2) {
        return this.method4243(arg0, arg1, arg2) ? new int[] { this.field2568 * 8 - this.field2566 * 8 + this.field2571 * 64 - this.field2567 * 64 + arg1, this.field2560 * 8 - this.field2564 * 8 + this.field2565 * 64 - this.field2563 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jv.aq(III)Lmu;")
    public class337 method4247(int arg0, int arg1) {
        if (this.method4245(arg0, arg1)) {
            int var3 = this.field2566 * 8 - this.field2568 * 8 + this.field2567 * 64 - this.field2571 * 64 + arg0;
            int var4 = this.field2564 * 8 - this.field2560 * 8 + this.field2563 * 64 - this.field2565 * 64 + arg1;
            return new class337(this.field2562, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jv.ar(Luk;B)V")
    public void method4251(class531 arg0) {
        this.field2562 = arg0.method8561();
        this.field2561 = arg0.method8561();
        this.field2567 = arg0.method8775();
        this.field2566 = arg0.method8561();
        this.field2563 = arg0.method8775();
        this.field2564 = arg0.method8561();
        this.field2571 = arg0.method8775();
        this.field2568 = arg0.method8561();
        this.field2565 = arg0.method8775();
        this.field2560 = arg0.method8561();
        this.method4524();
    }

    @ObfuscatedName("jv.ag(I)V")
    public void method4524() {
    }
}
