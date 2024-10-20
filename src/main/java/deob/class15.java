package deob;

@ObfuscatedName("q")
public class class15 implements class32 {

    @ObfuscatedName("q.f")
    public int field113;

    @ObfuscatedName("q.h")
    public int field98;

    @ObfuscatedName("q.e")
    public int field106;

    @ObfuscatedName("q.b")
    public int field100;

    @ObfuscatedName("q.l")
    public int field97;

    @ObfuscatedName("q.w")
    public int field101;

    @ObfuscatedName("q.d")
    public int field103;

    @ObfuscatedName("q.n")
    public int field104;

    @ObfuscatedName("q.s")
    public int field105;

    @ObfuscatedName("q.g")
    public int field108;

    @ObfuscatedName("q.a")
    public int field107;

    @ObfuscatedName("q.r")
    public int field111;

    @ObfuscatedName("q.k")
    public int field109;

    @ObfuscatedName("q.m")
    public int field110;

    @ObfuscatedName("q.f(Lp;B)V")
    public void method162(class21 arg0) {
        if (arg0.field171 > this.field97) {
            arg0.field171 = this.field97;
        }
        if (arg0.field172 < this.field97) {
            arg0.field172 = this.field97;
        }
        if (arg0.field170 > this.field101) {
            arg0.field170 = this.field101;
        }
        if (arg0.field174 < this.field101) {
            arg0.field174 = this.field101;
        }
    }

    @ObfuscatedName("q.h(IIIB)Z")
    public boolean method151(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field113 && arg0 < this.field98 + this.field113) {
            return arg1 >= (this.field106 << 6) + (this.field103 << 3) && arg1 <= (this.field106 << 6) + (this.field105 << 3) + 7 && arg2 >= (this.field104 << 3) + (this.field100 << 6) && arg2 <= (this.field108 << 3) + (this.field100 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("q.e(IIB)Z")
    public boolean method152(int arg0, int arg1) {
        return arg0 >= (this.field97 << 6) + (this.field107 << 3) && arg0 <= (this.field97 << 6) + (this.field109 << 3) + 7 && arg1 >= (this.field111 << 3) + (this.field101 << 6) && arg1 <= (this.field110 << 3) + (this.field101 << 6) + 7;
    }

    @ObfuscatedName("q.b(IIII)[I")
    public int[] method150(int arg0, int arg1, int arg2) {
        return this.method151(arg0, arg1, arg2) ? new int[] { this.field107 * 8 - this.field103 * 8 + this.field97 * 64 - this.field106 * 64 + arg1, this.field111 * 8 - this.field104 * 8 + this.field101 * 64 - this.field100 * 64 + arg2 } : null;
    }

    @ObfuscatedName("q.l(IIB)Lhc;")
    public class229 method177(int arg0, int arg1) {
        if (this.method152(arg0, arg1)) {
            int var3 = this.field103 * 8 - this.field107 * 8 + this.field106 * 64 - this.field97 * 64 + arg0;
            int var4 = this.field104 * 8 - this.field111 * 8 + this.field100 * 64 - this.field101 * 64 + arg1;
            return new class229(this.field113, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("q.w(Lgx;I)V")
    public void method155(class185 arg0) {
        this.field113 = arg0.method3323();
        this.field98 = arg0.method3323();
        this.field106 = arg0.method3325();
        this.field103 = arg0.method3323();
        this.field105 = arg0.method3323();
        this.field100 = arg0.method3325();
        this.field104 = arg0.method3323();
        this.field108 = arg0.method3323();
        this.field97 = arg0.method3325();
        this.field107 = arg0.method3323();
        this.field109 = arg0.method3323();
        this.field101 = arg0.method3325();
        this.field111 = arg0.method3323();
        this.field110 = arg0.method3323();
        this.method169();
    }

    @ObfuscatedName("q.d(I)V")
    public void method169() {
    }
}
