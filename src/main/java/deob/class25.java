package deob;

@ObfuscatedName("p")
public class class25 implements class38 {

    @ObfuscatedName("p.m")
    public int field197;

    @ObfuscatedName("p.f")
    public int field183;

    @ObfuscatedName("p.q")
    public int field184;

    @ObfuscatedName("p.w")
    public int field195;

    @ObfuscatedName("p.o")
    public int field189;

    @ObfuscatedName("p.u")
    public int field185;

    @ObfuscatedName("p.g")
    public int field188;

    @ObfuscatedName("p.l")
    public int field187;

    @ObfuscatedName("p.e")
    public int field190;

    @ObfuscatedName("p.x")
    public int field186;

    @ObfuscatedName("p.m(Lag;I)V")
    public void method204(class27 arg0) {
        if (arg0.field211 > this.field188) {
            arg0.field211 = this.field188;
        }
        if (arg0.field212 < this.field190) {
            arg0.field212 = this.field190;
        }
        if (arg0.field218 > this.field187) {
            arg0.field218 = this.field187;
        }
        if (arg0.field214 < this.field186) {
            arg0.field214 = this.field186;
        }
    }

    @ObfuscatedName("p.f(IIIB)Z")
    public boolean method205(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field197 && arg0 < this.field197 + this.field183) {
            return arg1 >> 6 >= this.field184 && arg1 >> 6 <= this.field189 && arg2 >> 6 >= this.field195 && arg2 >> 6 <= this.field185;
        } else {
            return false;
        }
    }

    @ObfuscatedName("p.q(IIB)Z")
    public boolean method223(int arg0, int arg1) {
        return arg0 >> 6 >= this.field188 && arg0 >> 6 <= this.field190 && arg1 >> 6 >= this.field187 && arg1 >> 6 <= this.field186;
    }

    @ObfuscatedName("p.w(IIII)[I")
    public int[] method209(int arg0, int arg1, int arg2) {
        return this.method205(arg0, arg1, arg2) ? new int[] { this.field188 * 64 - this.field184 * 64 + arg1, this.field187 * 64 - this.field195 * 64 + arg2 } : null;
    }

    @ObfuscatedName("p.o(III)Lhu;")
    public class225 method207(int arg0, int arg1) {
        if (this.method223(arg0, arg1)) {
            int var3 = this.field184 * 64 - this.field188 * 64 + arg0;
            int var4 = this.field195 * 64 - this.field187 * 64 + arg1;
            return new class225(this.field197, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("p.u(Lgr;B)V")
    public void method208(class202 arg0) {
        this.field197 = arg0.method3551();
        this.field183 = arg0.method3551();
        this.field184 = arg0.method3530();
        this.field195 = arg0.method3530();
        this.field189 = arg0.method3530();
        this.field185 = arg0.method3530();
        this.field188 = arg0.method3530();
        this.field187 = arg0.method3530();
        this.field190 = arg0.method3530();
        this.field186 = arg0.method3530();
        this.method287();
    }

    @ObfuscatedName("p.g(B)V")
    public void method287() {
    }
}
