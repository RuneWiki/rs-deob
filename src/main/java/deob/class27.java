package deob;

@ObfuscatedName("ac")
public class class27 implements class44 {

    @ObfuscatedName("ac.c")
    public int field371;

    @ObfuscatedName("ac.i")
    public int field363;

    @ObfuscatedName("ac.o")
    public int field362;

    @ObfuscatedName("ac.j")
    public int field365;

    @ObfuscatedName("ac.k")
    public int field366;

    @ObfuscatedName("ac.x")
    public int field367;

    @ObfuscatedName("ac.z")
    public int field368;

    @ObfuscatedName("ac.p")
    public int field372;

    @ObfuscatedName("ac.w")
    public int field370;

    @ObfuscatedName("ac.r")
    public int field377;

    @ObfuscatedName("ac.d")
    public int field375;

    @ObfuscatedName("ac.a")
    public int field369;

    @ObfuscatedName("ac.e")
    public int field374;

    @ObfuscatedName("ac.f")
    public int field373;

    @ObfuscatedName("ac.c(Las;I)V")
    public void method216(class33 arg0) {
        if (arg0.field434 > this.field366) {
            arg0.field434 = this.field366;
        }
        if (arg0.field432 < this.field366) {
            arg0.field432 = this.field366;
        }
        if (arg0.field435 > this.field367) {
            arg0.field435 = this.field367;
        }
        if (arg0.field437 < this.field367) {
            arg0.field437 = this.field367;
        }
    }

    @ObfuscatedName("ac.i(IIII)Z")
    public boolean method194(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field371 && arg0 < this.field371 + this.field363) {
            return arg1 >= (this.field368 << 3) + (this.field362 << 6) && arg1 <= (this.field370 << 3) + (this.field362 << 6) + 7 && arg2 >= (this.field372 << 3) + (this.field365 << 6) && arg2 <= (this.field377 << 3) + (this.field365 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ac.o(IIS)Z")
    public boolean method195(int arg0, int arg1) {
        return arg0 >= (this.field375 << 3) + (this.field366 << 6) && arg0 <= (this.field374 << 3) + (this.field366 << 6) + 7 && arg1 >= (this.field369 << 3) + (this.field367 << 6) && arg1 <= (this.field373 << 3) + (this.field367 << 6) + 7;
    }

    @ObfuscatedName("ac.j(IIII)[I")
    public int[] method196(int arg0, int arg1, int arg2) {
        return this.method194(arg0, arg1, arg2) ? new int[] { this.field375 * 8 - this.field368 * 8 + this.field366 * 64 - this.field362 * 64 + arg1, this.field369 * 8 - this.field372 * 8 + this.field367 * 64 - this.field365 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ac.k(IIB)Lim;")
    public class239 method218(int arg0, int arg1) {
        if (this.method195(arg0, arg1)) {
            int var3 = this.field368 * 8 - this.field375 * 8 + this.field362 * 64 - this.field366 * 64 + arg0;
            int var4 = this.field372 * 8 - this.field369 * 8 + this.field365 * 64 - this.field367 * 64 + arg1;
            return new class239(this.field371, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ac.x(Lgp;I)V")
    public void method198(class195 arg0) {
        this.field371 = arg0.method3429();
        this.field363 = arg0.method3429();
        this.field362 = arg0.method3218();
        this.field368 = arg0.method3429();
        this.field370 = arg0.method3429();
        this.field365 = arg0.method3218();
        this.field372 = arg0.method3429();
        this.field377 = arg0.method3429();
        this.field366 = arg0.method3218();
        this.field375 = arg0.method3429();
        this.field374 = arg0.method3429();
        this.field367 = arg0.method3218();
        this.field369 = arg0.method3429();
        this.field373 = arg0.method3429();
        this.method199();
    }

    @ObfuscatedName("ac.z(B)V")
    public void method199() {
    }
}
