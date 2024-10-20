package deob;

@ObfuscatedName("n")
public class class15 implements class32 {

    @ObfuscatedName("n.c")
    public int field115;

    @ObfuscatedName("n.q")
    public int field113;

    @ObfuscatedName("n.m")
    public int field121;

    @ObfuscatedName("n.j")
    public int field120;

    @ObfuscatedName("n.g")
    public int field116;

    @ObfuscatedName("n.i")
    public int field117;

    @ObfuscatedName("n.h")
    public int field118;

    @ObfuscatedName("n.l")
    public int field119;

    @ObfuscatedName("n.d")
    public int field114;

    @ObfuscatedName("n.o")
    public int field112;

    @ObfuscatedName("n.s")
    public int field122;

    @ObfuscatedName("n.k")
    public int field123;

    @ObfuscatedName("n.v")
    public int field124;

    @ObfuscatedName("n.p")
    public int field125;

    @ObfuscatedName("n.c(Le;B)V")
    public void method138(class21 arg0) {
        if (arg0.field190 > this.field116) {
            arg0.field190 = this.field116;
        }
        if (arg0.field196 < this.field116) {
            arg0.field196 = this.field116;
        }
        if (arg0.field192 > this.field117) {
            arg0.field192 = this.field117;
        }
        if (arg0.field193 < this.field117) {
            arg0.field193 = this.field117;
        }
    }

    @ObfuscatedName("n.q(IIII)Z")
    public boolean method150(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field115 && arg0 < this.field115 + this.field113) {
            return arg1 >= (this.field121 << 6) + (this.field118 << 3) && arg1 <= (this.field121 << 6) + (this.field114 << 3) + 7 && arg2 >= (this.field120 << 6) + (this.field119 << 3) && arg2 <= (this.field120 << 6) + (this.field112 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("n.m(III)Z")
    public boolean method136(int arg0, int arg1) {
        return arg0 >= (this.field122 << 3) + (this.field116 << 6) && arg0 <= (this.field124 << 3) + (this.field116 << 6) + 7 && arg1 >= (this.field123 << 3) + (this.field117 << 6) && arg1 <= (this.field125 << 3) + (this.field117 << 6) + 7;
    }

    @ObfuscatedName("n.j(IIII)[I")
    public int[] method139(int arg0, int arg1, int arg2) {
        return this.method150(arg0, arg1, arg2) ? new int[] { this.field122 * 8 - this.field118 * 8 + this.field116 * 64 - this.field121 * 64 + arg1, this.field123 * 8 - this.field119 * 8 + this.field117 * 64 - this.field120 * 64 + arg2 } : null;
    }

    @ObfuscatedName("n.g(III)Lhr;")
    public class229 method140(int arg0, int arg1) {
        if (this.method136(arg0, arg1)) {
            int var3 = this.field118 * 8 - this.field122 * 8 + this.field121 * 64 - this.field116 * 64 + arg0;
            int var4 = this.field119 * 8 - this.field123 * 8 + this.field120 * 64 - this.field117 * 64 + arg1;
            return new class229(this.field115, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("n.i(Lgg;B)V")
    public void method145(class185 arg0) {
        this.field115 = arg0.method3243();
        this.field113 = arg0.method3243();
        this.field121 = arg0.method3245();
        this.field118 = arg0.method3243();
        this.field114 = arg0.method3243();
        this.field120 = arg0.method3245();
        this.field119 = arg0.method3243();
        this.field112 = arg0.method3243();
        this.field116 = arg0.method3245();
        this.field122 = arg0.method3243();
        this.field124 = arg0.method3243();
        this.field117 = arg0.method3245();
        this.field123 = arg0.method3243();
        this.field125 = arg0.method3243();
        this.method141();
    }

    @ObfuscatedName("n.h(I)V")
    public void method141() {
    }
}
