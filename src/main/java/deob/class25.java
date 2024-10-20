package deob;

@ObfuscatedName("a")
public class class25 implements class38 {

    @ObfuscatedName("a.c")
    public int field211;

    @ObfuscatedName("a.t")
    public int field210;

    @ObfuscatedName("a.o")
    public int field219;

    @ObfuscatedName("a.e")
    public int field212;

    @ObfuscatedName("a.i")
    public int field213;

    @ObfuscatedName("a.g")
    public int field214;

    @ObfuscatedName("a.d")
    public int field215;

    @ObfuscatedName("a.l")
    public int field217;

    @ObfuscatedName("a.j")
    public int field216;

    @ObfuscatedName("a.m")
    public int field218;

    @ObfuscatedName("a.c(Lae;I)V")
    public void method209(class27 arg0) {
        if (arg0.field233 > this.field215) {
            arg0.field233 = this.field215;
        }
        if (arg0.field234 < this.field216) {
            arg0.field234 = this.field216;
        }
        if (arg0.field230 > this.field217) {
            arg0.field230 = this.field217;
        }
        if (arg0.field235 < this.field218) {
            arg0.field235 = this.field218;
        }
    }

    @ObfuscatedName("a.t(IIIB)Z")
    public boolean method197(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field211 && arg0 < this.field211 + this.field210) {
            return arg1 >> 6 >= this.field219 && arg1 >> 6 <= this.field213 && arg2 >> 6 >= this.field212 && arg2 >> 6 <= this.field214;
        } else {
            return false;
        }
    }

    @ObfuscatedName("a.o(IIB)Z")
    public boolean method198(int arg0, int arg1) {
        return arg0 >> 6 >= this.field215 && arg0 >> 6 <= this.field216 && arg1 >> 6 >= this.field217 && arg1 >> 6 <= this.field218;
    }

    @ObfuscatedName("a.e(IIII)[I")
    public int[] method199(int arg0, int arg1, int arg2) {
        return this.method197(arg0, arg1, arg2) ? new int[] { this.field215 * 64 - this.field219 * 64 + arg1, this.field217 * 64 - this.field212 * 64 + arg2 } : null;
    }

    @ObfuscatedName("a.i(III)Lhj;")
    public class214 method213(int arg0, int arg1) {
        if (this.method198(arg0, arg1)) {
            int var3 = this.field219 * 64 - this.field215 * 64 + arg0;
            int var4 = this.field212 * 64 - this.field217 * 64 + arg1;
            return new class214(this.field211, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("a.g(Lkp;B)V")
    public void method205(class301 arg0) {
        this.field211 = arg0.method5129();
        this.field210 = arg0.method5129();
        this.field219 = arg0.method5124();
        this.field212 = arg0.method5124();
        this.field213 = arg0.method5124();
        this.field214 = arg0.method5124();
        this.field215 = arg0.method5124();
        this.field217 = arg0.method5124();
        this.field216 = arg0.method5124();
        this.field218 = arg0.method5124();
        this.method274();
    }

    @ObfuscatedName("a.d(I)V")
    public void method274() {
    }
}
