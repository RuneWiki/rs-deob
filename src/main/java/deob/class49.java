package deob;

@ObfuscatedName("ay")
public class class49 implements class43 {

    @ObfuscatedName("ay.n")
    public int field616;

    @ObfuscatedName("ay.p")
    public int field604;

    @ObfuscatedName("ay.i")
    public int field605;

    @ObfuscatedName("ay.j")
    public int field611;

    @ObfuscatedName("ay.f")
    public int field607;

    @ObfuscatedName("ay.m")
    public int field608;

    @ObfuscatedName("ay.c")
    public int field609;

    @ObfuscatedName("ay.z")
    public int field610;

    @ObfuscatedName("ay.h")
    public int field603;

    @ObfuscatedName("ay.g")
    public int field612;

    @ObfuscatedName("ay.n(Lal;B)V")
    public void method214(class33 arg0) {
        if (arg0.field461 > this.field607) {
            arg0.field461 = this.field607;
        }
        if (arg0.field469 < this.field607) {
            arg0.field469 = this.field607;
        }
        if (arg0.field466 > this.field608) {
            arg0.field466 = this.field608;
        }
        if (arg0.field467 < this.field608) {
            arg0.field467 = this.field608;
        }
    }

    @ObfuscatedName("ay.p(IIIB)Z")
    public boolean method210(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field616 && arg0 < this.field616 + this.field604) {
            return arg1 >= (this.field609 << 3) + (this.field605 << 6) && arg1 <= (this.field609 << 3) + (this.field605 << 6) + 7 && arg2 >= (this.field611 << 6) + (this.field610 << 3) && arg2 <= (this.field611 << 6) + (this.field610 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.i(III)Z")
    public boolean method198(int arg0, int arg1) {
        return arg0 >= (this.field607 << 6) + (this.field603 << 3) && arg0 <= (this.field607 << 6) + (this.field603 << 3) + 7 && arg1 >= (this.field612 << 3) + (this.field608 << 6) && arg1 <= (this.field612 << 3) + (this.field608 << 6) + 7;
    }

    @ObfuscatedName("ay.j(IIIB)[I")
    public int[] method195(int arg0, int arg1, int arg2) {
        return this.method210(arg0, arg1, arg2) ? new int[] { this.field603 * 8 - this.field609 * 8 + this.field607 * 64 - this.field605 * 64 + arg1, this.field612 * 8 - this.field610 * 8 + this.field608 * 64 - this.field611 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ay.f(III)Lhl;")
    public class213 method211(int arg0, int arg1) {
        if (this.method198(arg0, arg1)) {
            int var3 = this.field609 * 8 - this.field603 * 8 + this.field605 * 64 - this.field607 * 64 + arg0;
            int var4 = this.field610 * 8 - this.field612 * 8 + this.field611 * 64 - this.field608 * 64 + arg1;
            return new class213(this.field616, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ay.m(Lfl;I)V")
    public void method201(class174 arg0) {
        this.field616 = arg0.method2925();
        this.field604 = arg0.method2925();
        this.field605 = arg0.method3065();
        this.field609 = arg0.method2925();
        this.field611 = arg0.method3065();
        this.field610 = arg0.method2925();
        this.field607 = arg0.method3065();
        this.field603 = arg0.method2925();
        this.field608 = arg0.method3065();
        this.field612 = arg0.method2925();
        this.method622();
    }

    @ObfuscatedName("ay.c(I)V")
    public void method622() {
    }
}
