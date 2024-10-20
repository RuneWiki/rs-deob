package deob;

@ObfuscatedName("an")
public class class49 implements class43 {

    @ObfuscatedName("an.e")
    public int field614;

    @ObfuscatedName("an.n")
    public int field605;

    @ObfuscatedName("an.g")
    public int field607;

    @ObfuscatedName("an.y")
    public int field608;

    @ObfuscatedName("an.w")
    public int field609;

    @ObfuscatedName("an.k")
    public int field610;

    @ObfuscatedName("an.v")
    public int field616;

    @ObfuscatedName("an.z")
    public int field611;

    @ObfuscatedName("an.r")
    public int field613;

    @ObfuscatedName("an.u")
    public int field612;

    @ObfuscatedName("an.e(Lae;B)V")
    public void method181(class33 arg0) {
        if (arg0.field458 > this.field609) {
            arg0.field458 = this.field609;
        }
        if (arg0.field461 < this.field609) {
            arg0.field461 = this.field609;
        }
        if (arg0.field454 > this.field610) {
            arg0.field454 = this.field610;
        }
        if (arg0.field463 < this.field610) {
            arg0.field463 = this.field610;
        }
    }

    @ObfuscatedName("an.n(IIII)Z")
    public boolean method209(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field614 && arg0 < this.field614 + this.field605) {
            return arg1 >= (this.field616 << 3) + (this.field607 << 6) && arg1 <= (this.field616 << 3) + (this.field607 << 6) + 7 && arg2 >= (this.field611 << 3) + (this.field608 << 6) && arg2 <= (this.field611 << 3) + (this.field608 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.g(III)Z")
    public boolean method183(int arg0, int arg1) {
        return arg0 >= (this.field613 << 3) + (this.field609 << 6) && arg0 <= (this.field613 << 3) + (this.field609 << 6) + 7 && arg1 >= (this.field612 << 3) + (this.field610 << 6) && arg1 <= (this.field612 << 3) + (this.field610 << 6) + 7;
    }

    @ObfuscatedName("an.y(IIII)[I")
    public int[] method184(int arg0, int arg1, int arg2) {
        return this.method209(arg0, arg1, arg2) ? new int[] { this.field613 * 8 - this.field616 * 8 + this.field609 * 64 - this.field607 * 64 + arg1, this.field612 * 8 - this.field611 * 8 + this.field610 * 64 - this.field608 * 64 + arg2 } : null;
    }

    @ObfuscatedName("an.w(III)Lhq;")
    public class214 method198(int arg0, int arg1) {
        if (this.method183(arg0, arg1)) {
            int var3 = this.field616 * 8 - this.field613 * 8 + this.field607 * 64 - this.field609 * 64 + arg0;
            int var4 = this.field611 * 8 - this.field612 * 8 + this.field608 * 64 - this.field610 * 64 + arg1;
            return new class214(this.field614, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.k(Lfh;B)V")
    public void method186(class175 arg0) {
        this.field614 = arg0.method2928();
        this.field605 = arg0.method2928();
        this.field607 = arg0.method3091();
        this.field616 = arg0.method2928();
        this.field608 = arg0.method3091();
        this.field611 = arg0.method2928();
        this.field609 = arg0.method3091();
        this.field613 = arg0.method2928();
        this.field610 = arg0.method3091();
        this.field612 = arg0.method2928();
        this.method631();
    }

    @ObfuscatedName("an.v(B)V")
    public void method631() {
    }
}
