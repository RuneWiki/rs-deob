package deob;

@ObfuscatedName("ah")
public class class43 implements class38 {

    @ObfuscatedName("ah.c")
    public int field352;

    @ObfuscatedName("ah.x")
    public int field347;

    @ObfuscatedName("ah.t")
    public int field348;

    @ObfuscatedName("ah.g")
    public int field358;

    @ObfuscatedName("ah.l")
    public int field350;

    @ObfuscatedName("ah.u")
    public int field351;

    @ObfuscatedName("ah.j")
    public int field349;

    @ObfuscatedName("ah.v")
    public int field353;

    @ObfuscatedName("ah.d")
    public int field354;

    @ObfuscatedName("ah.z")
    public int field355;

    @ObfuscatedName("ah.c(Lag;S)V")
    public void method185(class27 arg0) {
        if (arg0.field220 > this.field350) {
            arg0.field220 = this.field350;
        }
        if (arg0.field217 < this.field350) {
            arg0.field217 = this.field350;
        }
        if (arg0.field214 > this.field351) {
            arg0.field214 = this.field351;
        }
        if (arg0.field215 < this.field351) {
            arg0.field215 = this.field351;
        }
    }

    @ObfuscatedName("ah.x(IIII)Z")
    public boolean method187(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field352 && arg0 < this.field352 + this.field347) {
            return arg1 >= (this.field349 << 3) + (this.field348 << 6) && arg1 <= (this.field349 << 3) + (this.field348 << 6) + 7 && arg2 >= (this.field358 << 6) + (this.field353 << 3) && arg2 <= (this.field358 << 6) + (this.field353 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ah.t(III)Z")
    public boolean method204(int arg0, int arg1) {
        return arg0 >= (this.field354 << 3) + (this.field350 << 6) && arg0 <= (this.field354 << 3) + (this.field350 << 6) + 7 && arg1 >= (this.field355 << 3) + (this.field351 << 6) && arg1 <= (this.field355 << 3) + (this.field351 << 6) + 7;
    }

    @ObfuscatedName("ah.g(IIII)[I")
    public int[] method198(int arg0, int arg1, int arg2) {
        return this.method187(arg0, arg1, arg2) ? new int[] { this.field354 * 8 - this.field349 * 8 + this.field350 * 64 - this.field348 * 64 + arg1, this.field355 * 8 - this.field353 * 8 + this.field351 * 64 - this.field358 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ah.l(IIB)Lhj;")
    public class214 method188(int arg0, int arg1) {
        if (this.method204(arg0, arg1)) {
            int var3 = this.field349 * 8 - this.field354 * 8 + this.field348 * 64 - this.field350 * 64 + arg0;
            int var4 = this.field353 * 8 - this.field355 * 8 + this.field358 * 64 - this.field351 * 64 + arg1;
            return new class214(this.field352, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ah.u(Lkz;I)V")
    public void method189(class300 arg0) {
        this.field352 = arg0.method5103();
        this.field347 = arg0.method5103();
        this.field348 = arg0.method5304();
        this.field349 = arg0.method5103();
        this.field358 = arg0.method5304();
        this.field353 = arg0.method5103();
        this.field350 = arg0.method5304();
        this.field354 = arg0.method5103();
        this.field351 = arg0.method5304();
        this.field355 = arg0.method5103();
        this.method628();
    }

    @ObfuscatedName("ah.j(I)V")
    public void method628() {
    }
}
