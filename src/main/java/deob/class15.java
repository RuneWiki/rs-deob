package deob;

@ObfuscatedName("z")
public class class15 implements class32 {

    @ObfuscatedName("z.v")
    public int field119;

    @ObfuscatedName("z.s")
    public int field103;

    @ObfuscatedName("z.o")
    public int field105;

    @ObfuscatedName("z.k")
    public int field106;

    @ObfuscatedName("z.u")
    public int field107;

    @ObfuscatedName("z.i")
    public int field108;

    @ObfuscatedName("z.t")
    public int field109;

    @ObfuscatedName("z.p")
    public int field104;

    @ObfuscatedName("z.l")
    public int field111;

    @ObfuscatedName("z.b")
    public int field112;

    @ObfuscatedName("z.c")
    public int field113;

    @ObfuscatedName("z.d")
    public int field114;

    @ObfuscatedName("z.w")
    public int field115;

    @ObfuscatedName("z.a")
    public int field116;

    @ObfuscatedName("z.v(Lh;I)V")
    public void method147(class21 arg0) {
        if (arg0.field173 > this.field107) {
            arg0.field173 = this.field107;
        }
        if (arg0.field178 < this.field107) {
            arg0.field178 = this.field107;
        }
        if (arg0.field181 > this.field108) {
            arg0.field181 = this.field108;
        }
        if (arg0.field182 < this.field108) {
            arg0.field182 = this.field108;
        }
    }

    @ObfuscatedName("z.s(IIII)Z")
    public boolean method167(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field119 && arg0 < this.field119 + this.field103) {
            return arg1 >= (this.field109 << 3) + (this.field105 << 6) && arg1 <= (this.field111 << 3) + (this.field105 << 6) + 7 && arg2 >= (this.field106 << 6) + (this.field104 << 3) && arg2 <= (this.field112 << 3) + (this.field106 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("z.o(III)Z")
    public boolean method149(int arg0, int arg1) {
        return arg0 >= (this.field113 << 3) + (this.field107 << 6) && arg0 <= (this.field115 << 3) + (this.field107 << 6) + 7 && arg1 >= (this.field114 << 3) + (this.field108 << 6) && arg1 <= (this.field116 << 3) + (this.field108 << 6) + 7;
    }

    @ObfuscatedName("z.k(IIIB)[I")
    public int[] method150(int arg0, int arg1, int arg2) {
        return this.method167(arg0, arg1, arg2) ? new int[] { this.field113 * 8 - this.field109 * 8 + this.field107 * 64 - this.field105 * 64 + arg1, this.field114 * 8 - this.field104 * 8 + this.field108 * 64 - this.field106 * 64 + arg2 } : null;
    }

    @ObfuscatedName("z.u(IIB)Lhv;")
    public class229 method151(int arg0, int arg1) {
        if (this.method149(arg0, arg1)) {
            int var3 = this.field109 * 8 - this.field113 * 8 + this.field105 * 64 - this.field107 * 64 + arg0;
            int var4 = this.field104 * 8 - this.field114 * 8 + this.field106 * 64 - this.field108 * 64 + arg1;
            return new class229(this.field119, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("z.i(Lgx;I)V")
    public void method152(class185 arg0) {
        this.field119 = arg0.method3274();
        this.field103 = arg0.method3274();
        this.field105 = arg0.method3276();
        this.field109 = arg0.method3274();
        this.field111 = arg0.method3274();
        this.field106 = arg0.method3276();
        this.field104 = arg0.method3274();
        this.field112 = arg0.method3274();
        this.field107 = arg0.method3276();
        this.field113 = arg0.method3274();
        this.field115 = arg0.method3274();
        this.field108 = arg0.method3276();
        this.field114 = arg0.method3274();
        this.field116 = arg0.method3274();
        this.method171();
    }

    @ObfuscatedName("z.t(I)V")
    public void method171() {
    }
}
