package deob;

@ObfuscatedName("u")
public class class25 implements class38 {

    @ObfuscatedName("u.a")
    public int field190;

    @ObfuscatedName("u.t")
    public int field181;

    @ObfuscatedName("u.n")
    public int field191;

    @ObfuscatedName("u.q")
    public int field183;

    @ObfuscatedName("u.v")
    public int field184;

    @ObfuscatedName("u.l")
    public int field185;

    @ObfuscatedName("u.c")
    public int field186;

    @ObfuscatedName("u.o")
    public int field187;

    @ObfuscatedName("u.i")
    public int field180;

    @ObfuscatedName("u.d")
    public int field182;

    @ObfuscatedName("u.a(Laa;B)V")
    public void method248(class27 arg0) {
        if (arg0.field209 > this.field186) {
            arg0.field209 = this.field186;
        }
        if (arg0.field208 < this.field180) {
            arg0.field208 = this.field180;
        }
        if (arg0.field211 > this.field187) {
            arg0.field211 = this.field187;
        }
        if (arg0.field210 < this.field182) {
            arg0.field210 = this.field182;
        }
    }

    @ObfuscatedName("u.t(IIII)Z")
    public boolean method225(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field190 && arg0 < this.field190 + this.field181) {
            return arg1 >> 6 >= this.field191 && arg1 >> 6 <= this.field184 && arg2 >> 6 >= this.field183 && arg2 >> 6 <= this.field185;
        } else {
            return false;
        }
    }

    @ObfuscatedName("u.n(III)Z")
    public boolean method226(int arg0, int arg1) {
        return arg0 >> 6 >= this.field186 && arg0 >> 6 <= this.field180 && arg1 >> 6 >= this.field187 && arg1 >> 6 <= this.field182;
    }

    @ObfuscatedName("u.q(IIII)[I")
    public int[] method233(int arg0, int arg1, int arg2) {
        return this.method225(arg0, arg1, arg2) ? new int[] { this.field186 * 64 - this.field191 * 64 + arg1, this.field187 * 64 - this.field183 * 64 + arg2 } : null;
    }

    @ObfuscatedName("u.v(IIS)Lhf;")
    public class214 method227(int arg0, int arg1) {
        if (this.method226(arg0, arg1)) {
            int var3 = this.field191 * 64 - this.field186 * 64 + arg0;
            int var4 = this.field183 * 64 - this.field187 * 64 + arg1;
            return new class214(this.field190, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("u.l(Lkc;I)V")
    public void method229(class300 arg0) {
        this.field190 = arg0.method5123();
        this.field181 = arg0.method5123();
        this.field191 = arg0.method5166();
        this.field183 = arg0.method5166();
        this.field184 = arg0.method5166();
        this.field185 = arg0.method5166();
        this.field186 = arg0.method5166();
        this.field187 = arg0.method5166();
        this.field180 = arg0.method5166();
        this.field182 = arg0.method5166();
        this.method303();
    }

    @ObfuscatedName("u.c(I)V")
    public void method303() {
    }
}
