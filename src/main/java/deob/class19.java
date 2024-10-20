package deob;

@ObfuscatedName("t")
public class class19 implements class32 {

    @ObfuscatedName("t.w")
    public int field152;

    @ObfuscatedName("t.m")
    public int field150;

    @ObfuscatedName("t.q")
    public int field151;

    @ObfuscatedName("t.b")
    public int field149;

    @ObfuscatedName("t.f")
    public int field159;

    @ObfuscatedName("t.n")
    public int field154;

    @ObfuscatedName("t.h")
    public int field155;

    @ObfuscatedName("t.x")
    public int field156;

    @ObfuscatedName("t.j")
    public int field153;

    @ObfuscatedName("t.a")
    public int field158;

    @ObfuscatedName("t.w(Li;I)V")
    public void method128(class21 arg0) {
        if (arg0.field177 > this.field155) {
            arg0.field177 = this.field155;
        }
        if (arg0.field178 < this.field153) {
            arg0.field178 = this.field153;
        }
        if (arg0.field179 > this.field156) {
            arg0.field179 = this.field156;
        }
        if (arg0.field180 < this.field158) {
            arg0.field180 = this.field158;
        }
    }

    @ObfuscatedName("t.m(IIII)Z")
    public boolean method127(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field152 && arg0 < this.field152 + this.field150) {
            return arg1 >> 6 >= this.field151 && arg1 >> 6 <= this.field159 && arg2 >> 6 >= this.field149 && arg2 >> 6 <= this.field154;
        } else {
            return false;
        }
    }

    @ObfuscatedName("t.q(III)Z")
    public boolean method130(int arg0, int arg1) {
        return arg0 >> 6 >= this.field155 && arg0 >> 6 <= this.field153 && arg1 >> 6 >= this.field156 && arg1 >> 6 <= this.field158;
    }

    @ObfuscatedName("t.x(IIII)[I")
    public int[] method131(int arg0, int arg1, int arg2) {
        return this.method127(arg0, arg1, arg2) ? new int[] { this.field155 * 64 - this.field151 * 64 + arg1, this.field156 * 64 - this.field149 * 64 + arg2 } : null;
    }

    @ObfuscatedName("t.j(III)Lhh;")
    public class227 method133(int arg0, int arg1) {
        if (this.method130(arg0, arg1)) {
            int var3 = this.field151 * 64 - this.field155 * 64 + arg0;
            int var4 = this.field149 * 64 - this.field156 * 64 + arg1;
            return new class227(this.field152, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("t.a(Lgy;S)V")
    public void method129(class183 arg0) {
        this.field152 = arg0.method3436();
        this.field150 = arg0.method3436();
        this.field151 = arg0.method3268();
        this.field149 = arg0.method3268();
        this.field159 = arg0.method3268();
        this.field154 = arg0.method3268();
        this.field155 = arg0.method3268();
        this.field156 = arg0.method3268();
        this.field153 = arg0.method3268();
        this.field158 = arg0.method3268();
        this.method194();
    }

    @ObfuscatedName("t.l(B)V")
    public void method194() {
    }
}
