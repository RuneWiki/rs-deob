package deob;

@ObfuscatedName("au")
public class class49 implements class43 {

    @ObfuscatedName("au.d")
    public int field630;

    @ObfuscatedName("au.k")
    public int field627;

    @ObfuscatedName("au.e")
    public int field642;

    @ObfuscatedName("au.p")
    public int field629;

    @ObfuscatedName("au.q")
    public int field628;

    @ObfuscatedName("au.s")
    public int field637;

    @ObfuscatedName("au.r")
    public int field632;

    @ObfuscatedName("au.g")
    public int field631;

    @ObfuscatedName("au.v")
    public int field634;

    @ObfuscatedName("au.t")
    public int field626;

    @ObfuscatedName("au.d(Las;B)V")
    public void method175(class33 arg0) {
        if (arg0.field474 > this.field628) {
            arg0.field474 = this.field628;
        }
        if (arg0.field475 < this.field628) {
            arg0.field475 = this.field628;
        }
        if (arg0.field476 > this.field637) {
            arg0.field476 = this.field637;
        }
        if (arg0.field477 < this.field637) {
            arg0.field477 = this.field637;
        }
    }

    @ObfuscatedName("au.k(IIII)Z")
    public boolean method169(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field630 && arg0 < this.field630 + this.field627) {
            return arg1 >= (this.field642 << 6) + (this.field632 << 3) && arg1 <= (this.field642 << 6) + (this.field632 << 3) + 7 && arg2 >= (this.field631 << 3) + (this.field629 << 6) && arg2 <= (this.field631 << 3) + (this.field629 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("au.e(III)Z")
    public boolean method170(int arg0, int arg1) {
        return arg0 >= (this.field634 << 3) + (this.field628 << 6) && arg0 <= (this.field634 << 3) + (this.field628 << 6) + 7 && arg1 >= (this.field637 << 6) + (this.field626 << 3) && arg1 <= (this.field637 << 6) + (this.field626 << 3) + 7;
    }

    @ObfuscatedName("au.p(IIII)[I")
    public int[] method168(int arg0, int arg1, int arg2) {
        return this.method169(arg0, arg1, arg2) ? new int[] { this.field634 * 8 - this.field632 * 8 + this.field628 * 64 - this.field642 * 64 + arg1, this.field626 * 8 - this.field631 * 8 + this.field637 * 64 - this.field629 * 64 + arg2 } : null;
    }

    @ObfuscatedName("au.q(IIB)Lhl;")
    public class213 method177(int arg0, int arg1) {
        if (this.method170(arg0, arg1)) {
            int var3 = this.field632 * 8 - this.field634 * 8 + this.field642 * 64 - this.field628 * 64 + arg0;
            int var4 = this.field631 * 8 - this.field626 * 8 + this.field629 * 64 - this.field637 * 64 + arg1;
            return new class213(this.field630, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("au.s(Lfg;B)V")
    public void method194(class174 arg0) {
        this.field630 = arg0.method2955();
        this.field627 = arg0.method2955();
        this.field642 = arg0.method3035();
        this.field632 = arg0.method2955();
        this.field629 = arg0.method3035();
        this.field631 = arg0.method2955();
        this.field628 = arg0.method3035();
        this.field634 = arg0.method2955();
        this.field637 = arg0.method3035();
        this.field626 = arg0.method2955();
        this.method644();
    }

    @ObfuscatedName("au.r(I)V")
    public void method644() {
    }
}
