package deob;

@ObfuscatedName("ab")
public class class39 implements class43 {

    @ObfuscatedName("ab.n")
    public int field527;

    @ObfuscatedName("ab.p")
    public int field520;

    @ObfuscatedName("ab.i")
    public int field521;

    @ObfuscatedName("ab.j")
    public int field524;

    @ObfuscatedName("ab.f")
    public int field523;

    @ObfuscatedName("ab.m")
    public int field519;

    @ObfuscatedName("ab.n(Lal;B)V")
    public void method214(class33 arg0) {
        if (arg0.field461 > this.field523) {
            arg0.field461 = this.field523;
        }
        if (arg0.field469 < this.field523) {
            arg0.field469 = this.field523;
        }
        if (arg0.field466 > this.field519) {
            arg0.field466 = this.field519;
        }
        if (arg0.field467 < this.field519) {
            arg0.field467 = this.field519;
        }
    }

    @ObfuscatedName("ab.p(IIIB)Z")
    public boolean method210(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field527 && arg0 < this.field527 + this.field520) {
            return arg1 >> 6 == this.field521 && arg2 >> 6 == this.field524;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ab.i(III)Z")
    public boolean method198(int arg0, int arg1) {
        return arg0 >> 6 == this.field523 && arg1 >> 6 == this.field519;
    }

    @ObfuscatedName("ab.j(IIIB)[I")
    public int[] method195(int arg0, int arg1, int arg2) {
        return this.method210(arg0, arg1, arg2) ? new int[] { this.field523 * 64 - this.field521 * 64 + arg1, this.field519 * 64 - this.field524 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ab.f(III)Lhl;")
    public class213 method211(int arg0, int arg1) {
        if (this.method198(arg0, arg1)) {
            int var3 = this.field521 * 64 - this.field523 * 64 + arg0;
            int var4 = this.field524 * 64 - this.field519 * 64 + arg1;
            return new class213(this.field527, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ab.m(Lfl;I)V")
    public void method201(class174 arg0) {
        this.field527 = arg0.method2925();
        this.field520 = arg0.method2925();
        this.field521 = arg0.method3065();
        this.field524 = arg0.method3065();
        this.field523 = arg0.method3065();
        this.field519 = arg0.method3065();
        this.method473();
    }

    @ObfuscatedName("ab.c(I)V")
    public void method473() {
    }
}
