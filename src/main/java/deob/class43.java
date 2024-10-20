package deob;

@ObfuscatedName("as")
public class class43 implements class38 {

    @ObfuscatedName("as.m")
    public int field349;

    @ObfuscatedName("as.f")
    public int field341;

    @ObfuscatedName("as.q")
    public int field340;

    @ObfuscatedName("as.w")
    public int field351;

    @ObfuscatedName("as.o")
    public int field343;

    @ObfuscatedName("as.u")
    public int field344;

    @ObfuscatedName("as.g")
    public int field339;

    @ObfuscatedName("as.l")
    public int field346;

    @ObfuscatedName("as.e")
    public int field345;

    @ObfuscatedName("as.x")
    public int field348;

    @ObfuscatedName("as.m(Lag;I)V")
    public void method204(class27 arg0) {
        if (arg0.field211 > this.field343) {
            arg0.field211 = this.field343;
        }
        if (arg0.field212 < this.field343) {
            arg0.field212 = this.field343;
        }
        if (arg0.field218 > this.field344) {
            arg0.field218 = this.field344;
        }
        if (arg0.field214 < this.field344) {
            arg0.field214 = this.field344;
        }
    }

    @ObfuscatedName("as.f(IIIB)Z")
    public boolean method205(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field349 && arg0 < this.field349 + this.field341) {
            return arg1 >= (this.field340 << 6) + (this.field339 << 3) && arg1 <= (this.field340 << 6) + (this.field339 << 3) + 7 && arg2 >= (this.field351 << 6) + (this.field346 << 3) && arg2 <= (this.field351 << 6) + (this.field346 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.q(IIB)Z")
    public boolean method223(int arg0, int arg1) {
        return arg0 >= (this.field345 << 3) + (this.field343 << 6) && arg0 <= (this.field345 << 3) + (this.field343 << 6) + 7 && arg1 >= (this.field348 << 3) + (this.field344 << 6) && arg1 <= (this.field348 << 3) + (this.field344 << 6) + 7;
    }

    @ObfuscatedName("as.w(IIII)[I")
    public int[] method209(int arg0, int arg1, int arg2) {
        return this.method205(arg0, arg1, arg2) ? new int[] { this.field345 * 8 - this.field339 * 8 + this.field343 * 64 - this.field340 * 64 + arg1, this.field348 * 8 - this.field346 * 8 + this.field344 * 64 - this.field351 * 64 + arg2 } : null;
    }

    @ObfuscatedName("as.o(III)Lhu;")
    public class225 method207(int arg0, int arg1) {
        if (this.method223(arg0, arg1)) {
            int var3 = this.field339 * 8 - this.field345 * 8 + this.field340 * 64 - this.field343 * 64 + arg0;
            int var4 = this.field346 * 8 - this.field348 * 8 + this.field351 * 64 - this.field344 * 64 + arg1;
            return new class225(this.field349, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("as.u(Lgr;B)V")
    public void method208(class202 arg0) {
        this.field349 = arg0.method3551();
        this.field341 = arg0.method3551();
        this.field340 = arg0.method3530();
        this.field339 = arg0.method3551();
        this.field351 = arg0.method3530();
        this.field346 = arg0.method3551();
        this.field343 = arg0.method3530();
        this.field345 = arg0.method3551();
        this.field344 = arg0.method3530();
        this.field348 = arg0.method3551();
        this.method666();
    }

    @ObfuscatedName("as.g(I)V")
    public void method666() {
    }
}
