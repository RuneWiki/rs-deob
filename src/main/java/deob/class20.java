package deob;

@ObfuscatedName("k")
public class class20 implements class38 {

    @ObfuscatedName("k.n")
    public int field130;

    @ObfuscatedName("k.h")
    public int field126;

    @ObfuscatedName("k.l")
    public int field127;

    @ObfuscatedName("k.g")
    public int field136;

    @ObfuscatedName("k.b")
    public int field129;

    @ObfuscatedName("k.a")
    public int field128;

    @ObfuscatedName("k.c")
    public int field139;

    @ObfuscatedName("k.z")
    public int field132;

    @ObfuscatedName("k.j")
    public int field133;

    @ObfuscatedName("k.d")
    public int field134;

    @ObfuscatedName("k.t")
    public int field135;

    @ObfuscatedName("k.f")
    public int field138;

    @ObfuscatedName("k.i")
    public int field137;

    @ObfuscatedName("k.m")
    public int field131;

    @ObfuscatedName("k.n(Laa;I)V")
    public void method220(class27 arg0) {
        if (arg0.field211 > this.field129) {
            arg0.field211 = this.field129;
        }
        if (arg0.field212 < this.field129) {
            arg0.field212 = this.field129;
        }
        if (arg0.field213 > this.field128) {
            arg0.field213 = this.field128;
        }
        if (arg0.field214 < this.field128) {
            arg0.field214 = this.field128;
        }
    }

    @ObfuscatedName("k.h(IIIB)Z")
    public boolean method204(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field130 && arg0 < this.field130 + this.field126) {
            return arg1 >= (this.field139 << 3) + (this.field127 << 6) && arg1 <= (this.field133 << 3) + (this.field127 << 6) + 7 && arg2 >= (this.field136 << 6) + (this.field132 << 3) && arg2 <= (this.field136 << 6) + (this.field134 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("k.l(III)Z")
    public boolean method205(int arg0, int arg1) {
        return arg0 >= (this.field135 << 3) + (this.field129 << 6) && arg0 <= (this.field137 << 3) + (this.field129 << 6) + 7 && arg1 >= (this.field138 << 3) + (this.field128 << 6) && arg1 <= (this.field131 << 3) + (this.field128 << 6) + 7;
    }

    @ObfuscatedName("k.g(IIII)[I")
    public int[] method206(int arg0, int arg1, int arg2) {
        return this.method204(arg0, arg1, arg2) ? new int[] { this.field135 * 8 - this.field139 * 8 + this.field129 * 64 - this.field127 * 64 + arg1, this.field138 * 8 - this.field132 * 8 + this.field128 * 64 - this.field136 * 64 + arg2 } : null;
    }

    @ObfuscatedName("k.b(IIB)Lho;")
    public class234 method203(int arg0, int arg1) {
        if (this.method205(arg0, arg1)) {
            int var3 = this.field139 * 8 - this.field135 * 8 + this.field127 * 64 - this.field129 * 64 + arg0;
            int var4 = this.field132 * 8 - this.field138 * 8 + this.field136 * 64 - this.field128 * 64 + arg1;
            return new class234(this.field130, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("k.a(Lgc;B)V")
    public void method208(class190 arg0) {
        this.field130 = arg0.method3511();
        this.field126 = arg0.method3511();
        this.field127 = arg0.method3513();
        this.field139 = arg0.method3511();
        this.field133 = arg0.method3511();
        this.field136 = arg0.method3513();
        this.field132 = arg0.method3511();
        this.field134 = arg0.method3511();
        this.field129 = arg0.method3513();
        this.field135 = arg0.method3511();
        this.field137 = arg0.method3511();
        this.field128 = arg0.method3513();
        this.field138 = arg0.method3511();
        this.field131 = arg0.method3511();
        this.method211();
    }

    @ObfuscatedName("k.c(I)V")
    public void method211() {
    }
}
