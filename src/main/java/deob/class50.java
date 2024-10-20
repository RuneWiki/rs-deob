package deob;

@ObfuscatedName("aj")
public class class50 implements class44 {

    @ObfuscatedName("aj.d")
    public int field615;

    @ObfuscatedName("aj.z")
    public int field605;

    @ObfuscatedName("aj.n")
    public int field606;

    @ObfuscatedName("aj.r")
    public int field609;

    @ObfuscatedName("aj.e")
    public int field608;

    @ObfuscatedName("aj.y")
    public int field613;

    @ObfuscatedName("aj.k")
    public int field610;

    @ObfuscatedName("aj.s")
    public int field611;

    @ObfuscatedName("aj.p")
    public int field612;

    @ObfuscatedName("aj.x")
    public int field607;

    @ObfuscatedName("aj.d(Lal;B)V")
    public void method185(class33 arg0) {
        if (arg0.field460 > this.field608) {
            arg0.field460 = this.field608;
        }
        if (arg0.field461 < this.field608) {
            arg0.field461 = this.field608;
        }
        if (arg0.field454 > this.field613) {
            arg0.field454 = this.field613;
        }
        if (arg0.field463 < this.field613) {
            arg0.field463 = this.field613;
        }
    }

    @ObfuscatedName("aj.z(IIII)Z")
    public boolean method186(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field615 && arg0 < this.field615 + this.field605) {
            return arg1 >= (this.field610 << 3) + (this.field606 << 6) && arg1 <= (this.field610 << 3) + (this.field606 << 6) + 7 && arg2 >= (this.field611 << 3) + (this.field609 << 6) && arg2 <= (this.field611 << 3) + (this.field609 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aj.n(IIB)Z")
    public boolean method187(int arg0, int arg1) {
        return arg0 >= (this.field612 << 3) + (this.field608 << 6) && arg0 <= (this.field612 << 3) + (this.field608 << 6) + 7 && arg1 >= (this.field613 << 6) + (this.field607 << 3) && arg1 <= (this.field613 << 6) + (this.field607 << 3) + 7;
    }

    @ObfuscatedName("aj.r(IIII)[I")
    public int[] method207(int arg0, int arg1, int arg2) {
        return this.method186(arg0, arg1, arg2) ? new int[] { this.field612 * 8 - this.field610 * 8 + this.field608 * 64 - this.field606 * 64 + arg1, this.field607 * 8 - this.field611 * 8 + this.field613 * 64 - this.field609 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aj.e(III)Lic;")
    public class239 method191(int arg0, int arg1) {
        if (this.method187(arg0, arg1)) {
            int var3 = this.field610 * 8 - this.field612 * 8 + this.field606 * 64 - this.field608 * 64 + arg0;
            int var4 = this.field611 * 8 - this.field607 * 8 + this.field609 * 64 - this.field613 * 64 + arg1;
            return new class239(this.field615, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aj.y(Lgy;I)V")
    public void method190(class195 arg0) {
        this.field615 = arg0.method3330();
        this.field605 = arg0.method3330();
        this.field606 = arg0.method3269();
        this.field610 = arg0.method3330();
        this.field609 = arg0.method3269();
        this.field611 = arg0.method3330();
        this.field608 = arg0.method3269();
        this.field612 = arg0.method3330();
        this.field613 = arg0.method3269();
        this.field607 = arg0.method3330();
        this.method632();
    }

    @ObfuscatedName("aj.k(I)V")
    public void method632() {
    }
}
