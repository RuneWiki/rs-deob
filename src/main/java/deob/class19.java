package deob;

@ObfuscatedName("t")
public class class19 implements class32 {

    @ObfuscatedName("t.f")
    public int field176;

    @ObfuscatedName("t.l")
    public int field167;

    @ObfuscatedName("t.w")
    public int field166;

    @ObfuscatedName("t.s")
    public int field168;

    @ObfuscatedName("t.e")
    public int field170;

    @ObfuscatedName("t.a")
    public int field171;

    @ObfuscatedName("t.c")
    public int field175;

    @ObfuscatedName("t.p")
    public int field173;

    @ObfuscatedName("t.r")
    public int field174;

    @ObfuscatedName("t.m")
    public int field177;

    @ObfuscatedName("t.f(Lh;B)V")
    public void method121(class21 arg0) {
        if (arg0.field191 > this.field175) {
            arg0.field191 = this.field175;
        }
        if (arg0.field192 < this.field174) {
            arg0.field192 = this.field174;
        }
        if (arg0.field187 > this.field173) {
            arg0.field187 = this.field173;
        }
        if (arg0.field194 < this.field177) {
            arg0.field194 = this.field177;
        }
    }

    @ObfuscatedName("t.l(IIIB)Z")
    public boolean method122(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field176 && arg0 < this.field176 + this.field167) {
            return arg1 >> 6 >= this.field166 && arg1 >> 6 <= this.field170 && arg2 >> 6 >= this.field168 && arg2 >> 6 <= this.field171;
        } else {
            return false;
        }
    }

    @ObfuscatedName("t.w(IIB)Z")
    public boolean method131(int arg0, int arg1) {
        return arg0 >> 6 >= this.field175 && arg0 >> 6 <= this.field174 && arg1 >> 6 >= this.field173 && arg1 >> 6 <= this.field177;
    }

    @ObfuscatedName("t.s(IIII)[I")
    public int[] method124(int arg0, int arg1, int arg2) {
        return this.method122(arg0, arg1, arg2) ? new int[] { this.field175 * 64 - this.field166 * 64 + arg1, this.field173 * 64 - this.field168 * 64 + arg2 } : null;
    }

    @ObfuscatedName("t.e(IIB)Lhx;")
    public class229 method125(int arg0, int arg1) {
        if (this.method131(arg0, arg1)) {
            int var3 = this.field166 * 64 - this.field175 * 64 + arg0;
            int var4 = this.field168 * 64 - this.field173 * 64 + arg1;
            return new class229(this.field176, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("t.c(Lgm;I)V")
    public void method126(class185 arg0) {
        this.field176 = arg0.method3344();
        this.field167 = arg0.method3344();
        this.field166 = arg0.method3346();
        this.field168 = arg0.method3346();
        this.field170 = arg0.method3346();
        this.field171 = arg0.method3346();
        this.field175 = arg0.method3346();
        this.field173 = arg0.method3346();
        this.field174 = arg0.method3346();
        this.field177 = arg0.method3346();
        this.method179();
    }

    @ObfuscatedName("t.p(B)V")
    public void method179() {
    }
}
