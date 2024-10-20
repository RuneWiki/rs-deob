package deob;

@ObfuscatedName("ae")
public class class43 implements class38 {

    @ObfuscatedName("ae.n")
    public int field353;

    @ObfuscatedName("ae.h")
    public int field361;

    @ObfuscatedName("ae.l")
    public int field357;

    @ObfuscatedName("ae.g")
    public int field355;

    @ObfuscatedName("ae.b")
    public int field363;

    @ObfuscatedName("ae.a")
    public int field360;

    @ObfuscatedName("ae.c")
    public int field358;

    @ObfuscatedName("ae.z")
    public int field359;

    @ObfuscatedName("ae.j")
    public int field356;

    @ObfuscatedName("ae.d")
    public int field354;

    @ObfuscatedName("ae.n(Laa;I)V")
    public void method220(class27 arg0) {
        if (arg0.field211 > this.field363) {
            arg0.field211 = this.field363;
        }
        if (arg0.field212 < this.field363) {
            arg0.field212 = this.field363;
        }
        if (arg0.field213 > this.field360) {
            arg0.field213 = this.field360;
        }
        if (arg0.field214 < this.field360) {
            arg0.field214 = this.field360;
        }
    }

    @ObfuscatedName("ae.h(IIIB)Z")
    public boolean method204(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field353 && arg0 < this.field361 + this.field353) {
            return arg1 >= (this.field358 << 3) + (this.field357 << 6) && arg1 <= (this.field358 << 3) + (this.field357 << 6) + 7 && arg2 >= (this.field359 << 3) + (this.field355 << 6) && arg2 <= (this.field359 << 3) + (this.field355 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.l(III)Z")
    public boolean method205(int arg0, int arg1) {
        return arg0 >= (this.field363 << 6) + (this.field356 << 3) && arg0 <= (this.field363 << 6) + (this.field356 << 3) + 7 && arg1 >= (this.field360 << 6) + (this.field354 << 3) && arg1 <= (this.field360 << 6) + (this.field354 << 3) + 7;
    }

    @ObfuscatedName("ae.g(IIII)[I")
    public int[] method206(int arg0, int arg1, int arg2) {
        return this.method204(arg0, arg1, arg2) ? new int[] { this.field356 * 8 - this.field358 * 8 + this.field363 * 64 - this.field357 * 64 + arg1, this.field354 * 8 - this.field359 * 8 + this.field360 * 64 - this.field355 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ae.b(IIB)Lho;")
    public class234 method203(int arg0, int arg1) {
        if (this.method205(arg0, arg1)) {
            int var3 = this.field358 * 8 - this.field356 * 8 + this.field357 * 64 - this.field363 * 64 + arg0;
            int var4 = this.field359 * 8 - this.field354 * 8 + this.field355 * 64 - this.field360 * 64 + arg1;
            return new class234(this.field353, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ae.a(Lgc;B)V")
    public void method208(class190 arg0) {
        this.field353 = arg0.method3511();
        this.field361 = arg0.method3511();
        this.field357 = arg0.method3513();
        this.field358 = arg0.method3511();
        this.field355 = arg0.method3513();
        this.field359 = arg0.method3511();
        this.field363 = arg0.method3513();
        this.field356 = arg0.method3511();
        this.field360 = arg0.method3513();
        this.field354 = arg0.method3511();
        this.method640();
    }

    @ObfuscatedName("ae.c(B)V")
    public void method640() {
    }
}
