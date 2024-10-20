package deob;

@ObfuscatedName("jg")
public class class257 implements class260 {

    @ObfuscatedName("jg.am")
    public int field2658;

    @ObfuscatedName("jg.ap")
    public int field2657;

    @ObfuscatedName("jg.af")
    public int field2661;

    @ObfuscatedName("jg.aj")
    public int field2660;

    @ObfuscatedName("jg.aq")
    public int field2659;

    @ObfuscatedName("jg.ar")
    public int field2662;

    @ObfuscatedName("jg.am(Ljr;S)V")
    public void method4261(class240 arg0) {
        if (arg0.field2513 > this.field2659) {
            arg0.field2513 = this.field2659;
        }
        if (arg0.field2514 < this.field2659) {
            arg0.field2514 = this.field2659;
        }
        if (arg0.field2515 > this.field2662) {
            arg0.field2515 = this.field2662;
        }
        if (arg0.field2516 < this.field2662) {
            arg0.field2516 = this.field2662;
        }
    }

    @ObfuscatedName("jg.ap(IIII)Z")
    public boolean method4243(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2658 && arg0 < this.field2658 + this.field2657) {
            return arg1 >> 6 == this.field2661 && arg2 >> 6 == this.field2660;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jg.af(III)Z")
    public boolean method4245(int arg0, int arg1) {
        return arg0 >> 6 == this.field2659 && arg1 >> 6 == this.field2662;
    }

    @ObfuscatedName("jg.aj(IIII)[I")
    public int[] method4248(int arg0, int arg1, int arg2) {
        return this.method4243(arg0, arg1, arg2) ? new int[] { this.field2659 * 64 - this.field2661 * 64 + arg1, this.field2662 * 64 - this.field2660 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jg.aq(III)Lmu;")
    public class337 method4247(int arg0, int arg1) {
        if (this.method4245(arg0, arg1)) {
            int var3 = this.field2661 * 64 - this.field2659 * 64 + arg0;
            int var4 = this.field2660 * 64 - this.field2662 * 64 + arg1;
            return new class337(this.field2658, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jg.ar(Luk;B)V")
    public void method4251(class531 arg0) {
        this.field2658 = arg0.method8561();
        this.field2657 = arg0.method8561();
        this.field2661 = arg0.method8775();
        this.field2660 = arg0.method8775();
        this.field2659 = arg0.method8775();
        this.field2662 = arg0.method8775();
        this.method4587();
    }

    @ObfuscatedName("jg.ag(S)V")
    public void method4587() {
    }
}
