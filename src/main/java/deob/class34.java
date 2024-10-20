package deob;

@ObfuscatedName("ac")
public class class34 implements class47 {

    @ObfuscatedName("ac.h")
    public int field218;

    @ObfuscatedName("ac.v")
    public int field216;

    @ObfuscatedName("ac.x")
    public int field212;

    @ObfuscatedName("ac.w")
    public int field213;

    @ObfuscatedName("ac.t")
    public int field211;

    @ObfuscatedName("ac.j")
    public int field215;

    @ObfuscatedName("ac.n")
    public int field210;

    @ObfuscatedName("ac.p")
    public int field214;

    @ObfuscatedName("ac.l")
    public int field217;

    @ObfuscatedName("ac.z")
    public int field219;

    @ObfuscatedName("ac.h(Lav;S)V")
    public void method252(class36 arg0) {
        if (arg0.field235 > this.field210) {
            arg0.field235 = this.field210;
        }
        if (arg0.field229 < this.field217) {
            arg0.field229 = this.field217;
        }
        if (arg0.field237 > this.field214) {
            arg0.field237 = this.field214;
        }
        if (arg0.field240 < this.field219) {
            arg0.field240 = this.field219;
        }
    }

    @ObfuscatedName("ac.v(IIII)Z")
    public boolean method253(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field218 && arg0 < this.field218 + this.field216) {
            return arg1 >> 6 >= this.field212 && arg1 >> 6 <= this.field211 && arg2 >> 6 >= this.field213 && arg2 >> 6 <= this.field215;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ac.x(III)Z")
    public boolean method254(int arg0, int arg1) {
        return arg0 >> 6 >= this.field210 && arg0 >> 6 <= this.field217 && arg1 >> 6 >= this.field214 && arg1 >> 6 <= this.field219;
    }

    @ObfuscatedName("ac.w(IIII)[I")
    public int[] method255(int arg0, int arg1, int arg2) {
        return this.method253(arg0, arg1, arg2) ? new int[] { this.field210 * 64 - this.field212 * 64 + arg1, this.field214 * 64 - this.field213 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ac.t(IIB)Lhs;")
    public class223 method256(int arg0, int arg1) {
        if (this.method254(arg0, arg1)) {
            int var3 = this.field212 * 64 - this.field210 * 64 + arg0;
            int var4 = this.field213 * 64 - this.field214 * 64 + arg1;
            return new class223(this.field218, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ac.j(Lkj;B)V")
    public void method257(class311 arg0) {
        this.field218 = arg0.method5274();
        this.field216 = arg0.method5274();
        this.field212 = arg0.method5342();
        this.field213 = arg0.method5342();
        this.field211 = arg0.method5342();
        this.field215 = arg0.method5342();
        this.field210 = arg0.method5342();
        this.field214 = arg0.method5342();
        this.field217 = arg0.method5342();
        this.field219 = arg0.method5342();
        this.method316();
    }

    @ObfuscatedName("ac.n(B)V")
    public void method316() {
    }
}
