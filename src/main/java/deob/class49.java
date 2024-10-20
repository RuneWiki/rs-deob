package deob;

@ObfuscatedName("au")
public class class49 implements class43 {

    @ObfuscatedName("au.p")
    public int field619;

    @ObfuscatedName("au.m")
    public int field623;

    @ObfuscatedName("au.e")
    public int field624;

    @ObfuscatedName("au.t")
    public int field618;

    @ObfuscatedName("au.w")
    public int field622;

    @ObfuscatedName("au.z")
    public int field627;

    @ObfuscatedName("au.j")
    public int field620;

    @ObfuscatedName("au.i")
    public int field621;

    @ObfuscatedName("au.f")
    public int field625;

    @ObfuscatedName("au.c")
    public int field626;

    @ObfuscatedName("au.p(Lal;I)V")
    public void method213(class33 arg0) {
        if (arg0.field460 > this.field622) {
            arg0.field460 = this.field622;
        }
        if (arg0.field466 < this.field622) {
            arg0.field466 = this.field622;
        }
        if (arg0.field467 > this.field627) {
            arg0.field467 = this.field627;
        }
        if (arg0.field459 < this.field627) {
            arg0.field459 = this.field627;
        }
    }

    @ObfuscatedName("au.m(IIII)Z")
    public boolean method197(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field619 && arg0 < this.field623 + this.field619) {
            return arg1 >= (this.field624 << 6) + (this.field620 << 3) && arg1 <= (this.field624 << 6) + (this.field620 << 3) + 7 && arg2 >= (this.field621 << 3) + (this.field618 << 6) && arg2 <= (this.field621 << 3) + (this.field618 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("au.e(IIB)Z")
    public boolean method198(int arg0, int arg1) {
        return arg0 >= (this.field625 << 3) + (this.field622 << 6) && arg0 <= (this.field625 << 3) + (this.field622 << 6) + 7 && arg1 >= (this.field627 << 6) + (this.field626 << 3) && arg1 <= (this.field627 << 6) + (this.field626 << 3) + 7;
    }

    @ObfuscatedName("au.t(IIII)[I")
    public int[] method208(int arg0, int arg1, int arg2) {
        return this.method197(arg0, arg1, arg2) ? new int[] { this.field625 * 8 - this.field620 * 8 + this.field622 * 64 - this.field624 * 64 + arg1, this.field626 * 8 - this.field621 * 8 + this.field627 * 64 - this.field618 * 64 + arg2 } : null;
    }

    @ObfuscatedName("au.w(III)Lhg;")
    public class213 method200(int arg0, int arg1) {
        if (this.method198(arg0, arg1)) {
            int var3 = this.field620 * 8 - this.field625 * 8 + this.field624 * 64 - this.field622 * 64 + arg0;
            int var4 = this.field621 * 8 - this.field626 * 8 + this.field618 * 64 - this.field627 * 64 + arg1;
            return new class213(this.field619, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("au.z(Lfr;I)V")
    public void method201(class174 arg0) {
        this.field619 = arg0.method2810();
        this.field623 = arg0.method2810();
        this.field624 = arg0.method2824();
        this.field620 = arg0.method2810();
        this.field618 = arg0.method2824();
        this.field621 = arg0.method2810();
        this.field622 = arg0.method2824();
        this.field625 = arg0.method2810();
        this.field627 = arg0.method2824();
        this.field626 = arg0.method2810();
        this.method622();
    }

    @ObfuscatedName("au.j(I)V")
    public void method622() {
    }
}
