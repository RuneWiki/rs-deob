package deob;

@ObfuscatedName("aq")
public class class38 implements class32 {

    @ObfuscatedName("aq.c")
    public int field338;

    @ObfuscatedName("aq.q")
    public int field342;

    @ObfuscatedName("aq.m")
    public int field339;

    @ObfuscatedName("aq.j")
    public int field340;

    @ObfuscatedName("aq.g")
    public int field347;

    @ObfuscatedName("aq.i")
    public int field341;

    @ObfuscatedName("aq.h")
    public int field343;

    @ObfuscatedName("aq.l")
    public int field344;

    @ObfuscatedName("aq.d")
    public int field345;

    @ObfuscatedName("aq.o")
    public int field337;

    @ObfuscatedName("aq.c(Le;B)V")
    public void method138(class21 arg0) {
        if (arg0.field190 > this.field347) {
            arg0.field190 = this.field347;
        }
        if (arg0.field196 < this.field347) {
            arg0.field196 = this.field347;
        }
        if (arg0.field192 > this.field341) {
            arg0.field192 = this.field341;
        }
        if (arg0.field193 < this.field341) {
            arg0.field193 = this.field341;
        }
    }

    @ObfuscatedName("aq.q(IIII)Z")
    public boolean method150(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field338 && arg0 < this.field342 + this.field338) {
            return arg1 >= (this.field343 << 3) + (this.field339 << 6) && arg1 <= (this.field343 << 3) + (this.field339 << 6) + 7 && arg2 >= (this.field344 << 3) + (this.field340 << 6) && arg2 <= (this.field344 << 3) + (this.field340 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aq.m(III)Z")
    public boolean method136(int arg0, int arg1) {
        return arg0 >= (this.field347 << 6) + (this.field345 << 3) && arg0 <= (this.field347 << 6) + (this.field345 << 3) + 7 && arg1 >= (this.field341 << 6) + (this.field337 << 3) && arg1 <= (this.field341 << 6) + (this.field337 << 3) + 7;
    }

    @ObfuscatedName("aq.j(IIII)[I")
    public int[] method139(int arg0, int arg1, int arg2) {
        return this.method150(arg0, arg1, arg2) ? new int[] { this.field345 * 8 - this.field343 * 8 + this.field347 * 64 - this.field339 * 64 + arg1, this.field337 * 8 - this.field344 * 8 + this.field341 * 64 - this.field340 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aq.g(III)Lhr;")
    public class229 method140(int arg0, int arg1) {
        if (this.method136(arg0, arg1)) {
            int var3 = this.field343 * 8 - this.field345 * 8 + this.field339 * 64 - this.field347 * 64 + arg0;
            int var4 = this.field344 * 8 - this.field337 * 8 + this.field340 * 64 - this.field341 * 64 + arg1;
            return new class229(this.field338, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aq.i(Lgg;B)V")
    public void method145(class185 arg0) {
        this.field338 = arg0.method3243();
        this.field342 = arg0.method3243();
        this.field339 = arg0.method3245();
        this.field343 = arg0.method3243();
        this.field340 = arg0.method3245();
        this.field344 = arg0.method3243();
        this.field347 = arg0.method3245();
        this.field345 = arg0.method3243();
        this.field341 = arg0.method3245();
        this.field337 = arg0.method3243();
        this.method624();
    }

    @ObfuscatedName("aq.h(I)V")
    public void method624() {
    }
}
