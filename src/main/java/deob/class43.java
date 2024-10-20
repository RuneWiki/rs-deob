package deob;

@ObfuscatedName("ae")
public class class43 implements class38 {

    @ObfuscatedName("ae.u")
    public int field371;

    @ObfuscatedName("ae.f")
    public int field362;

    @ObfuscatedName("ae.b")
    public int field372;

    @ObfuscatedName("ae.g")
    public int field364;

    @ObfuscatedName("ae.z")
    public int field363;

    @ObfuscatedName("ae.p")
    public int field366;

    @ObfuscatedName("ae.h")
    public int field367;

    @ObfuscatedName("ae.y")
    public int field368;

    @ObfuscatedName("ae.w")
    public int field369;

    @ObfuscatedName("ae.i")
    public int field370;

    @ObfuscatedName("ae.u(Laf;I)V")
    public void method206(class27 arg0) {
        if (arg0.field215 > this.field363) {
            arg0.field215 = this.field363;
        }
        if (arg0.field224 < this.field363) {
            arg0.field224 = this.field363;
        }
        if (arg0.field217 > this.field366) {
            arg0.field217 = this.field366;
        }
        if (arg0.field218 < this.field366) {
            arg0.field218 = this.field366;
        }
    }

    @ObfuscatedName("ae.f(IIIB)Z")
    public boolean method207(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field371 && arg0 < this.field371 + this.field362) {
            return arg1 >= (this.field372 << 6) + (this.field367 << 3) && arg1 <= (this.field372 << 6) + (this.field367 << 3) + 7 && arg2 >= (this.field368 << 3) + (this.field364 << 6) && arg2 <= (this.field368 << 3) + (this.field364 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.b(III)Z")
    public boolean method208(int arg0, int arg1) {
        return arg0 >= (this.field369 << 3) + (this.field363 << 6) && arg0 <= (this.field369 << 3) + (this.field363 << 6) + 7 && arg1 >= (this.field370 << 3) + (this.field366 << 6) && arg1 <= (this.field370 << 3) + (this.field366 << 6) + 7;
    }

    @ObfuscatedName("ae.g(IIIB)[I")
    public int[] method236(int arg0, int arg1, int arg2) {
        return this.method207(arg0, arg1, arg2) ? new int[] { this.field369 * 8 - this.field367 * 8 + this.field363 * 64 - this.field372 * 64 + arg1, this.field370 * 8 - this.field368 * 8 + this.field366 * 64 - this.field364 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ae.z(III)Lhx;")
    public class214 method209(int arg0, int arg1) {
        if (this.method208(arg0, arg1)) {
            int var3 = this.field367 * 8 - this.field369 * 8 + this.field372 * 64 - this.field363 * 64 + arg0;
            int var4 = this.field368 * 8 - this.field370 * 8 + this.field364 * 64 - this.field366 * 64 + arg1;
            return new class214(this.field371, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ae.p(Lkg;I)V")
    public void method211(class300 arg0) {
        this.field371 = arg0.method5138();
        this.field362 = arg0.method5138();
        this.field372 = arg0.method5337();
        this.field367 = arg0.method5138();
        this.field364 = arg0.method5337();
        this.field368 = arg0.method5138();
        this.field363 = arg0.method5337();
        this.field369 = arg0.method5138();
        this.field366 = arg0.method5337();
        this.field370 = arg0.method5138();
        this.method657();
    }

    @ObfuscatedName("ae.h(I)V")
    public void method657() {
    }
}
