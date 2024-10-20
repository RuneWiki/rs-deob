package deob;

@ObfuscatedName("a")
public class class19 implements class32 {

    @ObfuscatedName("a.g")
    public int field175;

    @ObfuscatedName("a.r")
    public int field165;

    @ObfuscatedName("a.e")
    public int field167;

    @ObfuscatedName("a.q")
    public int field178;

    @ObfuscatedName("a.c")
    public int field169;

    @ObfuscatedName("a.l")
    public int field170;

    @ObfuscatedName("a.b")
    public int field168;

    @ObfuscatedName("a.w")
    public int field172;

    @ObfuscatedName("a.n")
    public int field173;

    @ObfuscatedName("a.i")
    public int field174;

    @ObfuscatedName("a.g(Lk;B)V")
    public void method147(class21 arg0) {
        if (arg0.field199 > this.field168) {
            arg0.field199 = this.field168;
        }
        if (arg0.field200 < this.field173) {
            arg0.field200 = this.field173;
        }
        if (arg0.field195 > this.field172) {
            arg0.field195 = this.field172;
        }
        if (arg0.field204 < this.field174) {
            arg0.field204 = this.field174;
        }
    }

    @ObfuscatedName("a.r(IIIB)Z")
    public boolean method148(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field175 && arg0 < this.field175 + this.field165) {
            return arg1 >> 6 >= this.field167 && arg1 >> 6 <= this.field169 && arg2 >> 6 >= this.field178 && arg2 >> 6 <= this.field170;
        } else {
            return false;
        }
    }

    @ObfuscatedName("a.e(IIB)Z")
    public boolean method149(int arg0, int arg1) {
        return arg0 >> 6 >= this.field168 && arg0 >> 6 <= this.field173 && arg1 >> 6 >= this.field172 && arg1 >> 6 <= this.field174;
    }

    @ObfuscatedName("a.q(IIII)[I")
    public int[] method150(int arg0, int arg1, int arg2) {
        return this.method148(arg0, arg1, arg2) ? new int[] { this.field168 * 64 - this.field167 * 64 + arg1, this.field172 * 64 - this.field178 * 64 + arg2 } : null;
    }

    @ObfuscatedName("a.c(IIB)Lhz;")
    public class229 method153(int arg0, int arg1) {
        if (this.method149(arg0, arg1)) {
            int var3 = this.field167 * 64 - this.field168 * 64 + arg0;
            int var4 = this.field178 * 64 - this.field172 * 64 + arg1;
            return new class229(this.field175, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("a.i(Lgl;I)V")
    public void method151(class185 arg0) {
        this.field175 = arg0.method3679();
        this.field165 = arg0.method3679();
        this.field167 = arg0.method3467();
        this.field178 = arg0.method3467();
        this.field169 = arg0.method3467();
        this.field170 = arg0.method3467();
        this.field168 = arg0.method3467();
        this.field172 = arg0.method3467();
        this.field173 = arg0.method3467();
        this.field174 = arg0.method3467();
        this.method217();
    }

    @ObfuscatedName("a.p(I)V")
    public void method217() {
    }
}
