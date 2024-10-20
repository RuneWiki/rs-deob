package deob;

@ObfuscatedName("an")
public class class39 implements class43 {

    @ObfuscatedName("an.d")
    public int field539;

    @ObfuscatedName("an.k")
    public int field541;

    @ObfuscatedName("an.e")
    public int field536;

    @ObfuscatedName("an.p")
    public int field537;

    @ObfuscatedName("an.q")
    public int field538;

    @ObfuscatedName("an.s")
    public int field535;

    @ObfuscatedName("an.d(Las;B)V")
    public void method175(class33 arg0) {
        if (arg0.field474 > this.field538) {
            arg0.field474 = this.field538;
        }
        if (arg0.field475 < this.field538) {
            arg0.field475 = this.field538;
        }
        if (arg0.field476 > this.field535) {
            arg0.field476 = this.field535;
        }
        if (arg0.field477 < this.field535) {
            arg0.field477 = this.field535;
        }
    }

    @ObfuscatedName("an.k(IIII)Z")
    public boolean method169(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field539 && arg0 < this.field541 + this.field539) {
            return arg1 >> 6 == this.field536 && arg2 >> 6 == this.field537;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.e(III)Z")
    public boolean method170(int arg0, int arg1) {
        return arg0 >> 6 == this.field538 && arg1 >> 6 == this.field535;
    }

    @ObfuscatedName("an.p(IIII)[I")
    public int[] method168(int arg0, int arg1, int arg2) {
        return this.method169(arg0, arg1, arg2) ? new int[] { this.field538 * 64 - this.field536 * 64 + arg1, this.field535 * 64 - this.field537 * 64 + arg2 } : null;
    }

    @ObfuscatedName("an.q(IIB)Lhl;")
    public class213 method177(int arg0, int arg1) {
        if (this.method170(arg0, arg1)) {
            int var3 = this.field536 * 64 - this.field538 * 64 + arg0;
            int var4 = this.field537 * 64 - this.field535 * 64 + arg1;
            return new class213(this.field539, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.s(Lfg;B)V")
    public void method194(class174 arg0) {
        this.field539 = arg0.method2955();
        this.field541 = arg0.method2955();
        this.field536 = arg0.method3035();
        this.field537 = arg0.method3035();
        this.field538 = arg0.method3035();
        this.field535 = arg0.method3035();
        this.method465();
    }

    @ObfuscatedName("an.r(B)V")
    public void method465() {
    }
}
