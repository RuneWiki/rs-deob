package deob;

@ObfuscatedName("ay")
public class class28 implements class32 {

    @ObfuscatedName("ay.c")
    public int field255;

    @ObfuscatedName("ay.q")
    public int field247;

    @ObfuscatedName("ay.m")
    public int field248;

    @ObfuscatedName("ay.j")
    public int field249;

    @ObfuscatedName("ay.g")
    public int field254;

    @ObfuscatedName("ay.i")
    public int field251;

    @ObfuscatedName("ay.c(Le;B)V")
    public void method138(class21 arg0) {
        if (arg0.field190 > this.field254) {
            arg0.field190 = this.field254;
        }
        if (arg0.field196 < this.field254) {
            arg0.field196 = this.field254;
        }
        if (arg0.field192 > this.field251) {
            arg0.field192 = this.field251;
        }
        if (arg0.field193 < this.field251) {
            arg0.field193 = this.field251;
        }
    }

    @ObfuscatedName("ay.q(IIII)Z")
    public boolean method150(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field255 && arg0 < this.field255 + this.field247) {
            return arg1 >> 6 == this.field248 && arg2 >> 6 == this.field249;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.m(III)Z")
    public boolean method136(int arg0, int arg1) {
        return arg0 >> 6 == this.field254 && arg1 >> 6 == this.field251;
    }

    @ObfuscatedName("ay.j(IIII)[I")
    public int[] method139(int arg0, int arg1, int arg2) {
        return this.method150(arg0, arg1, arg2) ? new int[] { this.field254 * 64 - this.field248 * 64 + arg1, this.field251 * 64 - this.field249 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ay.g(III)Lhr;")
    public class229 method140(int arg0, int arg1) {
        if (this.method136(arg0, arg1)) {
            int var3 = this.field248 * 64 - this.field254 * 64 + arg0;
            int var4 = this.field249 * 64 - this.field251 * 64 + arg1;
            return new class229(this.field255, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ay.i(Lgg;B)V")
    public void method145(class185 arg0) {
        this.field255 = arg0.method3243();
        this.field247 = arg0.method3243();
        this.field248 = arg0.method3245();
        this.field249 = arg0.method3245();
        this.field254 = arg0.method3245();
        this.field251 = arg0.method3245();
        this.method464();
    }

    @ObfuscatedName("ay.h(I)V")
    public void method464() {
    }
}
