package deob;

@ObfuscatedName("ag")
public class class49 implements class43 {

    @ObfuscatedName("ag.i")
    public int field639;

    @ObfuscatedName("ag.w")
    public int field640;

    @ObfuscatedName("ag.a")
    public int field641;

    @ObfuscatedName("ag.t")
    public int field643;

    @ObfuscatedName("ag.s")
    public int field653;

    @ObfuscatedName("ag.r")
    public int field642;

    @ObfuscatedName("ag.v")
    public int field645;

    @ObfuscatedName("ag.y")
    public int field646;

    @ObfuscatedName("ag.j")
    public int field647;

    @ObfuscatedName("ag.k")
    public int field648;

    @ObfuscatedName("ag.i(Lar;I)V")
    public void method162(class33 arg0) {
        if (arg0.field468 > this.field653) {
            arg0.field468 = this.field653;
        }
        if (arg0.field469 < this.field653) {
            arg0.field469 = this.field653;
        }
        if (arg0.field473 > this.field642) {
            arg0.field473 = this.field642;
        }
        if (arg0.field467 < this.field642) {
            arg0.field467 = this.field642;
        }
    }

    @ObfuscatedName("ag.w(IIII)Z")
    public boolean method167(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field639 && arg0 < this.field640 + this.field639) {
            return arg1 >= (this.field645 << 3) + (this.field641 << 6) && arg1 <= (this.field645 << 3) + (this.field641 << 6) + 7 && arg2 >= (this.field646 << 3) + (this.field643 << 6) && arg2 <= (this.field646 << 3) + (this.field643 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.a(III)Z")
    public boolean method189(int arg0, int arg1) {
        return arg0 >= (this.field653 << 6) + (this.field647 << 3) && arg0 <= (this.field653 << 6) + (this.field647 << 3) + 7 && arg1 >= (this.field648 << 3) + (this.field642 << 6) && arg1 <= (this.field648 << 3) + (this.field642 << 6) + 7;
    }

    @ObfuscatedName("ag.t(IIII)[I")
    public int[] method164(int arg0, int arg1, int arg2) {
        return this.method167(arg0, arg1, arg2) ? new int[] { this.field647 * 8 - this.field645 * 8 + this.field653 * 64 - this.field641 * 64 + arg1, this.field648 * 8 - this.field646 * 8 + this.field642 * 64 - this.field643 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ag.s(III)Lhb;")
    public class213 method165(int arg0, int arg1) {
        if (this.method189(arg0, arg1)) {
            int var3 = this.field645 * 8 - this.field647 * 8 + this.field641 * 64 - this.field653 * 64 + arg0;
            int var4 = this.field646 * 8 - this.field648 * 8 + this.field643 * 64 - this.field642 * 64 + arg1;
            return new class213(this.field639, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ag.r(Lfp;I)V")
    public void method166(class174 arg0) {
        this.field639 = arg0.method3061();
        this.field640 = arg0.method3061();
        this.field641 = arg0.method2882();
        this.field645 = arg0.method3061();
        this.field643 = arg0.method2882();
        this.field646 = arg0.method3061();
        this.field653 = arg0.method2882();
        this.field647 = arg0.method3061();
        this.field642 = arg0.method2882();
        this.field648 = arg0.method3061();
        this.method642();
    }

    @ObfuscatedName("ag.v(I)V")
    public void method642() {
    }
}
