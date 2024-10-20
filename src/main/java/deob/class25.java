package deob;

@ObfuscatedName("m")
public class class25 implements class38 {

    @ObfuscatedName("m.s")
    public int field182;

    @ObfuscatedName("m.j")
    public int field189;

    @ObfuscatedName("m.i")
    public int field185;

    @ObfuscatedName("m.k")
    public int field183;

    @ObfuscatedName("m.u")
    public int field194;

    @ObfuscatedName("m.n")
    public int field181;

    @ObfuscatedName("m.t")
    public int field186;

    @ObfuscatedName("m.q")
    public int field187;

    @ObfuscatedName("m.x")
    public int field188;

    @ObfuscatedName("m.d")
    public int field180;

    @ObfuscatedName("m.s(Lav;I)V")
    public void method210(class27 arg0) {
        if (arg0.field207 > this.field186) {
            arg0.field207 = this.field186;
        }
        if (arg0.field209 < this.field188) {
            arg0.field209 = this.field188;
        }
        if (arg0.field211 > this.field187) {
            arg0.field211 = this.field187;
        }
        if (arg0.field212 < this.field180) {
            arg0.field212 = this.field180;
        }
    }

    @ObfuscatedName("m.j(IIII)Z")
    public boolean method187(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field182 && arg0 < this.field189 + this.field182) {
            return arg1 >> 6 >= this.field185 && arg1 >> 6 <= this.field194 && arg2 >> 6 >= this.field183 && arg2 >> 6 <= this.field181;
        } else {
            return false;
        }
    }

    @ObfuscatedName("m.i(III)Z")
    public boolean method208(int arg0, int arg1) {
        return arg0 >> 6 >= this.field186 && arg0 >> 6 <= this.field188 && arg1 >> 6 >= this.field187 && arg1 >> 6 <= this.field180;
    }

    @ObfuscatedName("m.k(IIII)[I")
    public int[] method189(int arg0, int arg1, int arg2) {
        return this.method187(arg0, arg1, arg2) ? new int[] { this.field186 * 64 - this.field185 * 64 + arg1, this.field187 * 64 - this.field183 * 64 + arg2 } : null;
    }

    @ObfuscatedName("m.u(III)Lhd;")
    public class214 method185(int arg0, int arg1) {
        if (this.method208(arg0, arg1)) {
            int var3 = this.field185 * 64 - this.field186 * 64 + arg0;
            int var4 = this.field183 * 64 - this.field187 * 64 + arg1;
            return new class214(this.field182, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("m.n(Lky;I)V")
    public void method191(class300 arg0) {
        this.field182 = arg0.method5179();
        this.field189 = arg0.method5179();
        this.field185 = arg0.method5054();
        this.field183 = arg0.method5054();
        this.field194 = arg0.method5054();
        this.field181 = arg0.method5054();
        this.field186 = arg0.method5054();
        this.field187 = arg0.method5054();
        this.field188 = arg0.method5054();
        this.field180 = arg0.method5054();
        this.method263();
    }

    @ObfuscatedName("m.t(I)V")
    public void method263() {
    }
}
