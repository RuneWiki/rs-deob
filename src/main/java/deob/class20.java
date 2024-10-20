package deob;

@ObfuscatedName("s")
public class class20 implements class38 {

    @ObfuscatedName("s.u")
    public int field137;

    @ObfuscatedName("s.f")
    public int field135;

    @ObfuscatedName("s.b")
    public int field144;

    @ObfuscatedName("s.g")
    public int field136;

    @ObfuscatedName("s.z")
    public int field134;

    @ObfuscatedName("s.p")
    public int field138;

    @ObfuscatedName("s.h")
    public int field139;

    @ObfuscatedName("s.y")
    public int field140;

    @ObfuscatedName("s.w")
    public int field146;

    @ObfuscatedName("s.i")
    public int field142;

    @ObfuscatedName("s.k")
    public int field141;

    @ObfuscatedName("s.x")
    public int field133;

    @ObfuscatedName("s.o")
    public int field145;

    @ObfuscatedName("s.e")
    public int field143;

    @ObfuscatedName("s.u(Laf;I)V")
    public void method206(class27 arg0) {
        if (arg0.field215 > this.field134) {
            arg0.field215 = this.field134;
        }
        if (arg0.field224 < this.field134) {
            arg0.field224 = this.field134;
        }
        if (arg0.field217 > this.field138) {
            arg0.field217 = this.field138;
        }
        if (arg0.field218 < this.field138) {
            arg0.field218 = this.field138;
        }
    }

    @ObfuscatedName("s.f(IIIB)Z")
    public boolean method207(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field137 && arg0 < this.field137 + this.field135) {
            return arg1 >= (this.field144 << 6) + (this.field139 << 3) && arg1 <= (this.field146 << 3) + (this.field144 << 6) + 7 && arg2 >= (this.field140 << 3) + (this.field136 << 6) && arg2 <= (this.field142 << 3) + (this.field136 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("s.b(III)Z")
    public boolean method208(int arg0, int arg1) {
        return arg0 >= (this.field141 << 3) + (this.field134 << 6) && arg0 <= (this.field145 << 3) + (this.field134 << 6) + 7 && arg1 >= (this.field138 << 6) + (this.field133 << 3) && arg1 <= (this.field143 << 3) + (this.field138 << 6) + 7;
    }

    @ObfuscatedName("s.g(IIIB)[I")
    public int[] method236(int arg0, int arg1, int arg2) {
        return this.method207(arg0, arg1, arg2) ? new int[] { this.field141 * 8 - this.field139 * 8 + this.field134 * 64 - this.field144 * 64 + arg1, this.field133 * 8 - this.field140 * 8 + this.field138 * 64 - this.field136 * 64 + arg2 } : null;
    }

    @ObfuscatedName("s.z(III)Lhx;")
    public class214 method209(int arg0, int arg1) {
        if (this.method208(arg0, arg1)) {
            int var3 = this.field139 * 8 - this.field141 * 8 + this.field144 * 64 - this.field134 * 64 + arg0;
            int var4 = this.field140 * 8 - this.field133 * 8 + this.field136 * 64 - this.field138 * 64 + arg1;
            return new class214(this.field137, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("s.p(Lkg;I)V")
    public void method211(class300 arg0) {
        this.field137 = arg0.method5138();
        this.field135 = arg0.method5138();
        this.field144 = arg0.method5337();
        this.field139 = arg0.method5138();
        this.field146 = arg0.method5138();
        this.field136 = arg0.method5337();
        this.field140 = arg0.method5138();
        this.field142 = arg0.method5138();
        this.field134 = arg0.method5337();
        this.field141 = arg0.method5138();
        this.field145 = arg0.method5138();
        this.field138 = arg0.method5337();
        this.field133 = arg0.method5138();
        this.field143 = arg0.method5138();
        this.method212();
    }

    @ObfuscatedName("s.h(I)V")
    public void method212() {
    }
}
