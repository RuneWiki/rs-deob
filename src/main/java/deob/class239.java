package deob;

@ObfuscatedName("jc")
public class class239 implements class260 {

    @ObfuscatedName("jc.am")
    public int field2496;

    @ObfuscatedName("jc.ap")
    public int field2497;

    @ObfuscatedName("jc.af")
    public int field2504;

    @ObfuscatedName("jc.aj")
    public int field2498;

    @ObfuscatedName("jc.aq")
    public int field2499;

    @ObfuscatedName("jc.ar")
    public int field2495;

    @ObfuscatedName("jc.ag")
    public int field2501;

    @ObfuscatedName("jc.ao")
    public int field2502;

    @ObfuscatedName("jc.ae")
    public int field2503;

    @ObfuscatedName("jc.aa")
    public int field2500;

    @ObfuscatedName("jc.am(Ljr;S)V")
    public void method4261(class240 arg0) {
        if (arg0.field2513 > this.field2501) {
            arg0.field2513 = this.field2501;
        }
        if (arg0.field2514 < this.field2503) {
            arg0.field2514 = this.field2503;
        }
        if (arg0.field2515 > this.field2502) {
            arg0.field2515 = this.field2502;
        }
        if (arg0.field2516 < this.field2500) {
            arg0.field2516 = this.field2500;
        }
    }

    @ObfuscatedName("jc.ap(IIII)Z")
    public boolean method4243(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2496 && arg0 < this.field2497 + this.field2496) {
            return arg1 >> 6 >= this.field2504 && arg1 >> 6 <= this.field2499 && arg2 >> 6 >= this.field2498 && arg2 >> 6 <= this.field2495;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jc.af(III)Z")
    public boolean method4245(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2501 && arg0 >> 6 <= this.field2503 && arg1 >> 6 >= this.field2502 && arg1 >> 6 <= this.field2500;
    }

    @ObfuscatedName("jc.aj(IIII)[I")
    public int[] method4248(int arg0, int arg1, int arg2) {
        return this.method4243(arg0, arg1, arg2) ? new int[] { this.field2501 * 64 - this.field2504 * 64 + arg1, this.field2502 * 64 - this.field2498 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jc.aq(III)Lmu;")
    public class337 method4247(int arg0, int arg1) {
        if (this.method4245(arg0, arg1)) {
            int var3 = this.field2504 * 64 - this.field2501 * 64 + arg0;
            int var4 = this.field2498 * 64 - this.field2502 * 64 + arg1;
            return new class337(this.field2496, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jc.ar(Luk;B)V")
    public void method4251(class531 arg0) {
        this.field2496 = arg0.method8561();
        this.field2497 = arg0.method8561();
        this.field2504 = arg0.method8775();
        this.field2498 = arg0.method8775();
        this.field2499 = arg0.method8775();
        this.field2495 = arg0.method8775();
        this.field2501 = arg0.method8775();
        this.field2502 = arg0.method8775();
        this.field2503 = arg0.method8775();
        this.field2500 = arg0.method8775();
        this.method4249();
    }

    @ObfuscatedName("jc.ag(S)V")
    public void method4249() {
    }
}
