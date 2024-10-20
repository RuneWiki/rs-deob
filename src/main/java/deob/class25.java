package deob;

@ObfuscatedName("r")
public class class25 implements class38 {

    @ObfuscatedName("r.f")
    public int field181;

    @ObfuscatedName("r.i")
    public int field176;

    @ObfuscatedName("r.y")
    public int field177;

    @ObfuscatedName("r.w")
    public int field186;

    @ObfuscatedName("r.p")
    public int field175;

    @ObfuscatedName("r.b")
    public int field180;

    @ObfuscatedName("r.e")
    public int field178;

    @ObfuscatedName("r.x")
    public int field182;

    @ObfuscatedName("r.a")
    public int field183;

    @ObfuscatedName("r.d")
    public int field184;

    @ObfuscatedName("r.f(Laa;I)V")
    public void method185(class27 arg0) {
        if (arg0.field208 > this.field178) {
            arg0.field208 = this.field178;
        }
        if (arg0.field209 < this.field183) {
            arg0.field209 = this.field183;
        }
        if (arg0.field210 > this.field182) {
            arg0.field210 = this.field182;
        }
        if (arg0.field202 < this.field184) {
            arg0.field202 = this.field184;
        }
    }

    @ObfuscatedName("r.i(IIII)Z")
    public boolean method191(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field181 && arg0 < this.field181 + this.field176) {
            return arg1 >> 6 >= this.field177 && arg1 >> 6 <= this.field175 && arg2 >> 6 >= this.field186 && arg2 >> 6 <= this.field180;
        } else {
            return false;
        }
    }

    @ObfuscatedName("r.y(IIB)Z")
    public boolean method187(int arg0, int arg1) {
        return arg0 >> 6 >= this.field178 && arg0 >> 6 <= this.field183 && arg1 >> 6 >= this.field182 && arg1 >> 6 <= this.field184;
    }

    @ObfuscatedName("r.w(IIII)[I")
    public int[] method188(int arg0, int arg1, int arg2) {
        return this.method191(arg0, arg1, arg2) ? new int[] { this.field178 * 64 - this.field177 * 64 + arg1, this.field182 * 64 - this.field186 * 64 + arg2 } : null;
    }

    @ObfuscatedName("r.p(IIB)Lht;")
    public class214 method189(int arg0, int arg1) {
        if (this.method187(arg0, arg1)) {
            int var3 = this.field177 * 64 - this.field178 * 64 + arg0;
            int var4 = this.field186 * 64 - this.field182 * 64 + arg1;
            return new class214(this.field181, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("r.b(Lkq;B)V")
    public void method207(class300 arg0) {
        this.field181 = arg0.method5110();
        this.field176 = arg0.method5110();
        this.field177 = arg0.method5112();
        this.field186 = arg0.method5112();
        this.field175 = arg0.method5112();
        this.field180 = arg0.method5112();
        this.field178 = arg0.method5112();
        this.field182 = arg0.method5112();
        this.field183 = arg0.method5112();
        this.field184 = arg0.method5112();
        this.method256();
    }

    @ObfuscatedName("r.e(I)V")
    public void method256() {
    }
}
