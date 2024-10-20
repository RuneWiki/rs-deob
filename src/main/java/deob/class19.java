package deob;

@ObfuscatedName("t")
public class class19 implements class32 {

    @ObfuscatedName("t.f")
    public int field148;

    @ObfuscatedName("t.h")
    public int field154;

    @ObfuscatedName("t.e")
    public int field149;

    @ObfuscatedName("t.b")
    public int field150;

    @ObfuscatedName("t.l")
    public int field151;

    @ObfuscatedName("t.w")
    public int field147;

    @ObfuscatedName("t.d")
    public int field153;

    @ObfuscatedName("t.n")
    public int field157;

    @ObfuscatedName("t.s")
    public int field155;

    @ObfuscatedName("t.g")
    public int field152;

    @ObfuscatedName("t.f(Lp;B)V")
    public void method162(class21 arg0) {
        if (arg0.field171 > this.field153) {
            arg0.field171 = this.field153;
        }
        if (arg0.field172 < this.field155) {
            arg0.field172 = this.field155;
        }
        if (arg0.field170 > this.field157) {
            arg0.field170 = this.field157;
        }
        if (arg0.field174 < this.field152) {
            arg0.field174 = this.field152;
        }
    }

    @ObfuscatedName("t.h(IIIB)Z")
    public boolean method151(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field148 && arg0 < this.field154 + this.field148) {
            return arg1 >> 6 >= this.field149 && arg1 >> 6 <= this.field151 && arg2 >> 6 >= this.field150 && arg2 >> 6 <= this.field147;
        } else {
            return false;
        }
    }

    @ObfuscatedName("t.e(IIB)Z")
    public boolean method152(int arg0, int arg1) {
        return arg0 >> 6 >= this.field153 && arg0 >> 6 <= this.field155 && arg1 >> 6 >= this.field157 && arg1 >> 6 <= this.field152;
    }

    @ObfuscatedName("t.b(IIII)[I")
    public int[] method150(int arg0, int arg1, int arg2) {
        return this.method151(arg0, arg1, arg2) ? new int[] { this.field153 * 64 - this.field149 * 64 + arg1, this.field157 * 64 - this.field150 * 64 + arg2 } : null;
    }

    @ObfuscatedName("t.l(IIB)Lhc;")
    public class229 method177(int arg0, int arg1) {
        if (this.method152(arg0, arg1)) {
            int var3 = this.field149 * 64 - this.field153 * 64 + arg0;
            int var4 = this.field150 * 64 - this.field157 * 64 + arg1;
            return new class229(this.field148, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("t.w(Lgx;I)V")
    public void method155(class185 arg0) {
        this.field148 = arg0.method3323();
        this.field154 = arg0.method3323();
        this.field149 = arg0.method3325();
        this.field150 = arg0.method3325();
        this.field151 = arg0.method3325();
        this.field147 = arg0.method3325();
        this.field153 = arg0.method3325();
        this.field157 = arg0.method3325();
        this.field155 = arg0.method3325();
        this.field152 = arg0.method3325();
        this.method215();
    }

    @ObfuscatedName("t.d(I)V")
    public void method215() {
    }
}
