package deob;

@ObfuscatedName("b")
public class class19 implements class32 {

    @ObfuscatedName("b.c")
    public int field172;

    @ObfuscatedName("b.q")
    public int field163;

    @ObfuscatedName("b.m")
    public int field168;

    @ObfuscatedName("b.j")
    public int field165;

    @ObfuscatedName("b.g")
    public int field166;

    @ObfuscatedName("b.i")
    public int field167;

    @ObfuscatedName("b.h")
    public int field169;

    @ObfuscatedName("b.l")
    public int field175;

    @ObfuscatedName("b.d")
    public int field170;

    @ObfuscatedName("b.o")
    public int field171;

    @ObfuscatedName("b.c(Le;B)V")
    public void method138(class21 arg0) {
        if (arg0.field190 > this.field169) {
            arg0.field190 = this.field169;
        }
        if (arg0.field196 < this.field170) {
            arg0.field196 = this.field170;
        }
        if (arg0.field192 > this.field175) {
            arg0.field192 = this.field175;
        }
        if (arg0.field193 < this.field171) {
            arg0.field193 = this.field171;
        }
    }

    @ObfuscatedName("b.q(IIII)Z")
    public boolean method150(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field172 && arg0 < this.field172 + this.field163) {
            return arg1 >> 6 >= this.field168 && arg1 >> 6 <= this.field166 && arg2 >> 6 >= this.field165 && arg2 >> 6 <= this.field167;
        } else {
            return false;
        }
    }

    @ObfuscatedName("b.m(III)Z")
    public boolean method136(int arg0, int arg1) {
        return arg0 >> 6 >= this.field169 && arg0 >> 6 <= this.field170 && arg1 >> 6 >= this.field175 && arg1 >> 6 <= this.field171;
    }

    @ObfuscatedName("b.j(IIII)[I")
    public int[] method139(int arg0, int arg1, int arg2) {
        return this.method150(arg0, arg1, arg2) ? new int[] { this.field169 * 64 - this.field168 * 64 + arg1, this.field175 * 64 - this.field165 * 64 + arg2 } : null;
    }

    @ObfuscatedName("b.g(III)Lhr;")
    public class229 method140(int arg0, int arg1) {
        if (this.method136(arg0, arg1)) {
            int var3 = this.field168 * 64 - this.field169 * 64 + arg0;
            int var4 = this.field165 * 64 - this.field175 * 64 + arg1;
            return new class229(this.field172, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("b.i(Lgg;B)V")
    public void method145(class185 arg0) {
        this.field172 = arg0.method3243();
        this.field163 = arg0.method3243();
        this.field168 = arg0.method3245();
        this.field165 = arg0.method3245();
        this.field166 = arg0.method3245();
        this.field167 = arg0.method3245();
        this.field169 = arg0.method3245();
        this.field175 = arg0.method3245();
        this.field170 = arg0.method3245();
        this.field171 = arg0.method3245();
        this.method197();
    }

    @ObfuscatedName("b.h(I)V")
    public void method197() {
    }
}
