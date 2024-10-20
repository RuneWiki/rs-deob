package deob;

@ObfuscatedName("al")
public class class27 implements class43 {

    @ObfuscatedName("al.m")
    public int field368;

    @ObfuscatedName("al.p")
    public int field363;

    @ObfuscatedName("al.i")
    public int field374;

    @ObfuscatedName("al.j")
    public int field365;

    @ObfuscatedName("al.v")
    public int field362;

    @ObfuscatedName("al.x")
    public int field367;

    @ObfuscatedName("al.e")
    public int field366;

    @ObfuscatedName("al.l")
    public int field369;

    @ObfuscatedName("al.b")
    public int field370;

    @ObfuscatedName("al.n")
    public int field371;

    @ObfuscatedName("al.c")
    public int field364;

    @ObfuscatedName("al.a")
    public int field373;

    @ObfuscatedName("al.y")
    public int field372;

    @ObfuscatedName("al.w")
    public int field375;

    @ObfuscatedName("al.m(Lap;I)V")
    public void method194(class33 arg0) {
        if (arg0.field431 > this.field362) {
            arg0.field431 = this.field362;
        }
        if (arg0.field433 < this.field362) {
            arg0.field433 = this.field362;
        }
        if (arg0.field439 > this.field367) {
            arg0.field439 = this.field367;
        }
        if (arg0.field440 < this.field367) {
            arg0.field440 = this.field367;
        }
    }

    @ObfuscatedName("al.p(IIII)Z")
    public boolean method193(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field368 && arg0 < this.field368 + this.field363) {
            return arg1 >= (this.field374 << 6) + (this.field366 << 3) && arg1 <= (this.field374 << 6) + (this.field370 << 3) + 7 && arg2 >= (this.field369 << 3) + (this.field365 << 6) && arg2 <= (this.field371 << 3) + (this.field365 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("al.i(IIB)Z")
    public boolean method196(int arg0, int arg1) {
        return arg0 >= (this.field364 << 3) + (this.field362 << 6) && arg0 <= (this.field372 << 3) + (this.field362 << 6) + 7 && arg1 >= (this.field373 << 3) + (this.field367 << 6) && arg1 <= (this.field375 << 3) + (this.field367 << 6) + 7;
    }

    @ObfuscatedName("al.j(IIII)[I")
    public int[] method197(int arg0, int arg1, int arg2) {
        return this.method193(arg0, arg1, arg2) ? new int[] { this.field364 * 8 - this.field366 * 8 + this.field362 * 64 - this.field374 * 64 + arg1, this.field373 * 8 - this.field369 * 8 + this.field367 * 64 - this.field365 * 64 + arg2 } : null;
    }

    @ObfuscatedName("al.v(IIB)Lhq;")
    public class220 method198(int arg0, int arg1) {
        if (this.method196(arg0, arg1)) {
            int var3 = this.field366 * 8 - this.field364 * 8 + this.field374 * 64 - this.field362 * 64 + arg0;
            int var4 = this.field369 * 8 - this.field373 * 8 + this.field365 * 64 - this.field367 * 64 + arg1;
            return new class220(this.field368, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("al.x(Lfv;S)V")
    public void method199(class181 arg0) {
        this.field368 = arg0.method3012();
        this.field363 = arg0.method3012();
        this.field374 = arg0.method3009();
        this.field366 = arg0.method3012();
        this.field370 = arg0.method3012();
        this.field365 = arg0.method3009();
        this.field369 = arg0.method3012();
        this.field371 = arg0.method3012();
        this.field362 = arg0.method3009();
        this.field364 = arg0.method3012();
        this.field372 = arg0.method3012();
        this.field367 = arg0.method3009();
        this.field373 = arg0.method3012();
        this.field375 = arg0.method3012();
        this.method211();
    }

    @ObfuscatedName("al.e(I)V")
    public void method211() {
    }
}
