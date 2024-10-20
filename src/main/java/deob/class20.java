package deob;

@ObfuscatedName("r")
public class class20 implements class38 {

    @ObfuscatedName("r.c")
    public int field136;

    @ObfuscatedName("r.x")
    public int field130;

    @ObfuscatedName("r.t")
    public int field131;

    @ObfuscatedName("r.g")
    public int field132;

    @ObfuscatedName("r.l")
    public int field146;

    @ObfuscatedName("r.u")
    public int field134;

    @ObfuscatedName("r.j")
    public int field135;

    @ObfuscatedName("r.v")
    public int field144;

    @ObfuscatedName("r.d")
    public int field142;

    @ObfuscatedName("r.z")
    public int field137;

    @ObfuscatedName("r.n")
    public int field133;

    @ObfuscatedName("r.h")
    public int field140;

    @ObfuscatedName("r.f")
    public int field141;

    @ObfuscatedName("r.s")
    public int field138;

    @ObfuscatedName("r.c(Lag;S)V")
    public void method185(class27 arg0) {
        if (arg0.field220 > this.field146) {
            arg0.field220 = this.field146;
        }
        if (arg0.field217 < this.field146) {
            arg0.field217 = this.field146;
        }
        if (arg0.field214 > this.field134) {
            arg0.field214 = this.field134;
        }
        if (arg0.field215 < this.field134) {
            arg0.field215 = this.field134;
        }
    }

    @ObfuscatedName("r.x(IIII)Z")
    public boolean method187(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field136 && arg0 < this.field136 + this.field130) {
            return arg1 >= (this.field135 << 3) + (this.field131 << 6) && arg1 <= (this.field142 << 3) + (this.field131 << 6) + 7 && arg2 >= (this.field144 << 3) + (this.field132 << 6) && arg2 <= (this.field137 << 3) + (this.field132 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("r.t(III)Z")
    public boolean method204(int arg0, int arg1) {
        return arg0 >= (this.field146 << 6) + (this.field133 << 3) && arg0 <= (this.field146 << 6) + (this.field141 << 3) + 7 && arg1 >= (this.field140 << 3) + (this.field134 << 6) && arg1 <= (this.field138 << 3) + (this.field134 << 6) + 7;
    }

    @ObfuscatedName("r.g(IIII)[I")
    public int[] method198(int arg0, int arg1, int arg2) {
        return this.method187(arg0, arg1, arg2) ? new int[] { this.field133 * 8 - this.field135 * 8 + this.field146 * 64 - this.field131 * 64 + arg1, this.field140 * 8 - this.field144 * 8 + this.field134 * 64 - this.field132 * 64 + arg2 } : null;
    }

    @ObfuscatedName("r.l(IIB)Lhj;")
    public class214 method188(int arg0, int arg1) {
        if (this.method204(arg0, arg1)) {
            int var3 = this.field135 * 8 - this.field133 * 8 + this.field131 * 64 - this.field146 * 64 + arg0;
            int var4 = this.field144 * 8 - this.field140 * 8 + this.field132 * 64 - this.field134 * 64 + arg1;
            return new class214(this.field136, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("r.u(Lkz;I)V")
    public void method189(class300 arg0) {
        this.field136 = arg0.method5103();
        this.field130 = arg0.method5103();
        this.field131 = arg0.method5304();
        this.field135 = arg0.method5103();
        this.field142 = arg0.method5103();
        this.field132 = arg0.method5304();
        this.field144 = arg0.method5103();
        this.field137 = arg0.method5103();
        this.field146 = arg0.method5304();
        this.field133 = arg0.method5103();
        this.field141 = arg0.method5103();
        this.field134 = arg0.method5304();
        this.field140 = arg0.method5103();
        this.field138 = arg0.method5103();
        this.method190();
    }

    @ObfuscatedName("r.j(I)V")
    public void method190() {
    }
}
