package deob;

@ObfuscatedName("ak")
public class class49 implements class43 {

    @ObfuscatedName("ak.s")
    public int field611;

    @ObfuscatedName("ak.c")
    public int field604;

    @ObfuscatedName("ak.f")
    public int field606;

    @ObfuscatedName("ak.m")
    public int field614;

    @ObfuscatedName("ak.h")
    public int field608;

    @ObfuscatedName("ak.t")
    public int field609;

    @ObfuscatedName("ak.p")
    public int field610;

    @ObfuscatedName("ak.d")
    public int field605;

    @ObfuscatedName("ak.n")
    public int field612;

    @ObfuscatedName("ak.z")
    public int field613;

    @ObfuscatedName("ak.s(Laq;I)V")
    public void method184(class33 arg0) {
        if (arg0.field467 > this.field608) {
            arg0.field467 = this.field608;
        }
        if (arg0.field463 < this.field608) {
            arg0.field463 = this.field608;
        }
        if (arg0.field464 > this.field609) {
            arg0.field464 = this.field609;
        }
        if (arg0.field465 < this.field609) {
            arg0.field465 = this.field609;
        }
    }

    @ObfuscatedName("ak.c(IIII)Z")
    public boolean method185(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field611 && arg0 < this.field611 + this.field604) {
            return arg1 >= (this.field610 << 3) + (this.field606 << 6) && arg1 <= (this.field610 << 3) + (this.field606 << 6) + 7 && arg2 >= (this.field614 << 6) + (this.field605 << 3) && arg2 <= (this.field614 << 6) + (this.field605 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ak.f(III)Z")
    public boolean method208(int arg0, int arg1) {
        return arg0 >= (this.field612 << 3) + (this.field608 << 6) && arg0 <= (this.field612 << 3) + (this.field608 << 6) + 7 && arg1 >= (this.field613 << 3) + (this.field609 << 6) && arg1 <= (this.field613 << 3) + (this.field609 << 6) + 7;
    }

    @ObfuscatedName("ak.m(IIII)[I")
    public int[] method213(int arg0, int arg1, int arg2) {
        return this.method185(arg0, arg1, arg2) ? new int[] { this.field612 * 8 - this.field610 * 8 + this.field608 * 64 - this.field606 * 64 + arg1, this.field613 * 8 - this.field605 * 8 + this.field609 * 64 - this.field614 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ak.h(IIB)Lhp;")
    public class216 method188(int arg0, int arg1) {
        if (this.method208(arg0, arg1)) {
            int var3 = this.field610 * 8 - this.field612 * 8 + this.field606 * 64 - this.field608 * 64 + arg0;
            int var4 = this.field605 * 8 - this.field613 * 8 + this.field614 * 64 - this.field609 * 64 + arg1;
            return new class216(this.field611, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ak.t(Lfs;I)V")
    public void method189(class177 arg0) {
        this.field611 = arg0.method2965();
        this.field604 = arg0.method2965();
        this.field606 = arg0.method2967();
        this.field610 = arg0.method2965();
        this.field614 = arg0.method2967();
        this.field605 = arg0.method2965();
        this.field608 = arg0.method2967();
        this.field612 = arg0.method2965();
        this.field609 = arg0.method2967();
        this.field613 = arg0.method2965();
        this.method629();
    }

    @ObfuscatedName("ak.p(S)V")
    public void method629() {
    }
}
