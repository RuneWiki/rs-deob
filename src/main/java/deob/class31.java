package deob;

@ObfuscatedName("ad")
public class class31 implements class43 {

    @ObfuscatedName("ad.d")
    public int field445;

    @ObfuscatedName("ad.k")
    public int field450;

    @ObfuscatedName("ad.e")
    public int field446;

    @ObfuscatedName("ad.p")
    public int field441;

    @ObfuscatedName("ad.q")
    public int field444;

    @ObfuscatedName("ad.s")
    public int field440;

    @ObfuscatedName("ad.r")
    public int field449;

    @ObfuscatedName("ad.g")
    public int field447;

    @ObfuscatedName("ad.v")
    public int field448;

    @ObfuscatedName("ad.t")
    public int field443;

    @ObfuscatedName("ad.d(Las;B)V")
    public void method175(class33 arg0) {
        if (arg0.field474 > this.field449) {
            arg0.field474 = this.field449;
        }
        if (arg0.field475 < this.field448) {
            arg0.field475 = this.field448;
        }
        if (arg0.field476 > this.field447) {
            arg0.field476 = this.field447;
        }
        if (arg0.field477 < this.field443) {
            arg0.field477 = this.field443;
        }
    }

    @ObfuscatedName("ad.k(IIII)Z")
    public boolean method169(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field445 && arg0 < this.field450 + this.field445) {
            return arg1 >> 6 >= this.field446 && arg1 >> 6 <= this.field444 && arg2 >> 6 >= this.field441 && arg2 >> 6 <= this.field440;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.e(III)Z")
    public boolean method170(int arg0, int arg1) {
        return arg0 >> 6 >= this.field449 && arg0 >> 6 <= this.field448 && arg1 >> 6 >= this.field447 && arg1 >> 6 <= this.field443;
    }

    @ObfuscatedName("ad.p(IIII)[I")
    public int[] method168(int arg0, int arg1, int arg2) {
        return this.method169(arg0, arg1, arg2) ? new int[] { this.field449 * 64 - this.field446 * 64 + arg1, this.field447 * 64 - this.field441 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ad.q(IIB)Lhl;")
    public class213 method177(int arg0, int arg1) {
        if (this.method170(arg0, arg1)) {
            int var3 = this.field446 * 64 - this.field449 * 64 + arg0;
            int var4 = this.field441 * 64 - this.field447 * 64 + arg1;
            return new class213(this.field445, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.s(Lfg;B)V")
    public void method194(class174 arg0) {
        this.field445 = arg0.method2955();
        this.field450 = arg0.method2955();
        this.field446 = arg0.method3035();
        this.field441 = arg0.method3035();
        this.field444 = arg0.method3035();
        this.field440 = arg0.method3035();
        this.field449 = arg0.method3035();
        this.field447 = arg0.method3035();
        this.field448 = arg0.method3035();
        this.field443 = arg0.method3035();
        this.method230();
    }

    @ObfuscatedName("ad.r(I)V")
    public void method230() {
    }
}
