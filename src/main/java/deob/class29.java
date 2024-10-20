package deob;

@ObfuscatedName("ai")
public class class29 implements class47 {

    @ObfuscatedName("ai.x")
    public int field177;

    @ObfuscatedName("ai.m")
    public int field187;

    @ObfuscatedName("ai.k")
    public int field175;

    @ObfuscatedName("ai.d")
    public int field178;

    @ObfuscatedName("ai.w")
    public int field176;

    @ObfuscatedName("ai.v")
    public int field182;

    @ObfuscatedName("ai.q")
    public int field179;

    @ObfuscatedName("ai.z")
    public int field180;

    @ObfuscatedName("ai.t")
    public int field181;

    @ObfuscatedName("ai.e")
    public int field173;

    @ObfuscatedName("ai.s")
    public int field183;

    @ObfuscatedName("ai.p")
    public int field184;

    @ObfuscatedName("ai.n")
    public int field185;

    @ObfuscatedName("ai.u")
    public int field186;

    @ObfuscatedName("ai.x(Las;I)V")
    public void method293(class36 arg0) {
        if (arg0.field259 > this.field176) {
            arg0.field259 = this.field176;
        }
        if (arg0.field260 < this.field176) {
            arg0.field260 = this.field176;
        }
        if (arg0.field262 > this.field182) {
            arg0.field262 = this.field182;
        }
        if (arg0.field254 < this.field182) {
            arg0.field254 = this.field182;
        }
    }

    @ObfuscatedName("ai.m(IIII)Z")
    public boolean method280(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field177 && arg0 < this.field187 + this.field177) {
            return arg1 >= (this.field179 << 3) + (this.field175 << 6) && arg1 <= (this.field181 << 3) + (this.field175 << 6) + 7 && arg2 >= (this.field180 << 3) + (this.field178 << 6) && arg2 <= (this.field178 << 6) + (this.field173 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ai.k(III)Z")
    public boolean method281(int arg0, int arg1) {
        return arg0 >= (this.field183 << 3) + (this.field176 << 6) && arg0 <= (this.field185 << 3) + (this.field176 << 6) + 7 && arg1 >= (this.field184 << 3) + (this.field182 << 6) && arg1 <= (this.field186 << 3) + (this.field182 << 6) + 7;
    }

    @ObfuscatedName("ai.d(IIII)[I")
    public int[] method282(int arg0, int arg1, int arg2) {
        return this.method280(arg0, arg1, arg2) ? new int[] { this.field183 * 8 - this.field179 * 8 + this.field176 * 64 - this.field175 * 64 + arg1, this.field184 * 8 - this.field180 * 8 + this.field182 * 64 - this.field178 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ai.w(III)Lhj;")
    public class223 method283(int arg0, int arg1) {
        if (this.method281(arg0, arg1)) {
            int var3 = this.field179 * 8 - this.field183 * 8 + this.field175 * 64 - this.field176 * 64 + arg0;
            int var4 = this.field180 * 8 - this.field184 * 8 + this.field178 * 64 - this.field182 * 64 + arg1;
            return new class223(this.field177, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ai.v(Lkb;I)V")
    public void method284(class310 arg0) {
        this.field177 = arg0.method5137();
        this.field187 = arg0.method5137();
        this.field175 = arg0.method5139();
        this.field179 = arg0.method5137();
        this.field181 = arg0.method5137();
        this.field178 = arg0.method5139();
        this.field180 = arg0.method5137();
        this.field173 = arg0.method5137();
        this.field176 = arg0.method5139();
        this.field183 = arg0.method5137();
        this.field185 = arg0.method5137();
        this.field182 = arg0.method5139();
        this.field184 = arg0.method5137();
        this.field186 = arg0.method5137();
        this.method297();
    }

    @ObfuscatedName("ai.q(I)V")
    public void method297() {
    }
}
