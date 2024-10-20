package deob;

@ObfuscatedName("au")
public class class49 implements class43 {

    @ObfuscatedName("au.c")
    public int field620;

    @ObfuscatedName("au.o")
    public int field612;

    @ObfuscatedName("au.i")
    public int field610;

    @ObfuscatedName("au.u")
    public int field609;

    @ObfuscatedName("au.g")
    public int field613;

    @ObfuscatedName("au.m")
    public int field614;

    @ObfuscatedName("au.s")
    public int field619;

    @ObfuscatedName("au.x")
    public int field616;

    @ObfuscatedName("au.p")
    public int field611;

    @ObfuscatedName("au.k")
    public int field618;

    @ObfuscatedName("au.c(Lab;S)V")
    public void method172(class33 arg0) {
        if (arg0.field444 > this.field613) {
            arg0.field444 = this.field613;
        }
        if (arg0.field445 < this.field613) {
            arg0.field445 = this.field613;
        }
        if (arg0.field443 > this.field614) {
            arg0.field443 = this.field614;
        }
        if (arg0.field436 < this.field614) {
            arg0.field436 = this.field614;
        }
    }

    @ObfuscatedName("au.o(IIII)Z")
    public boolean method173(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field620 && arg0 < this.field620 + this.field612) {
            return arg1 >= (this.field619 << 3) + (this.field610 << 6) && arg1 <= (this.field619 << 3) + (this.field610 << 6) + 7 && arg2 >= (this.field616 << 3) + (this.field609 << 6) && arg2 <= (this.field616 << 3) + (this.field609 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("au.i(IIS)Z")
    public boolean method174(int arg0, int arg1) {
        return arg0 >= (this.field613 << 6) + (this.field611 << 3) && arg0 <= (this.field613 << 6) + (this.field611 << 3) + 7 && arg1 >= (this.field618 << 3) + (this.field614 << 6) && arg1 <= (this.field618 << 3) + (this.field614 << 6) + 7;
    }

    @ObfuscatedName("au.u(IIII)[I")
    public int[] method175(int arg0, int arg1, int arg2) {
        return this.method173(arg0, arg1, arg2) ? new int[] { this.field611 * 8 - this.field619 * 8 + this.field613 * 64 - this.field610 * 64 + arg1, this.field618 * 8 - this.field616 * 8 + this.field614 * 64 - this.field609 * 64 + arg2 } : null;
    }

    @ObfuscatedName("au.g(III)Lhs;")
    public class213 method179(int arg0, int arg1) {
        if (this.method174(arg0, arg1)) {
            int var3 = this.field619 * 8 - this.field611 * 8 + this.field610 * 64 - this.field613 * 64 + arg0;
            int var4 = this.field616 * 8 - this.field618 * 8 + this.field609 * 64 - this.field614 * 64 + arg1;
            return new class213(this.field620, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("au.m(Lfp;B)V")
    public void method177(class174 arg0) {
        this.field620 = arg0.method2843();
        this.field612 = arg0.method2843();
        this.field610 = arg0.method2861();
        this.field619 = arg0.method2843();
        this.field609 = arg0.method2861();
        this.field616 = arg0.method2843();
        this.field613 = arg0.method2861();
        this.field611 = arg0.method2843();
        this.field614 = arg0.method2861();
        this.field618 = arg0.method2843();
        this.method602();
    }

    @ObfuscatedName("au.s(I)V")
    public void method602() {
    }
}
