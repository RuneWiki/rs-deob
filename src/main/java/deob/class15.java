package deob;

@ObfuscatedName("g")
public class class15 implements class32 {

    @ObfuscatedName("g.w")
    public int field113;

    @ObfuscatedName("g.m")
    public int field112;

    @ObfuscatedName("g.q")
    public int field109;

    @ObfuscatedName("g.b")
    public int field108;

    @ObfuscatedName("g.f")
    public int field110;

    @ObfuscatedName("g.n")
    public int field107;

    @ObfuscatedName("g.h")
    public int field121;

    @ObfuscatedName("g.x")
    public int field114;

    @ObfuscatedName("g.j")
    public int field115;

    @ObfuscatedName("g.a")
    public int field116;

    @ObfuscatedName("g.l")
    public int field117;

    @ObfuscatedName("g.d")
    public int field118;

    @ObfuscatedName("g.s")
    public int field111;

    @ObfuscatedName("g.p")
    public int field120;

    @ObfuscatedName("g.w(Li;I)V")
    public void method128(class21 arg0) {
        if (arg0.field177 > this.field110) {
            arg0.field177 = this.field110;
        }
        if (arg0.field178 < this.field110) {
            arg0.field178 = this.field110;
        }
        if (arg0.field179 > this.field107) {
            arg0.field179 = this.field107;
        }
        if (arg0.field180 < this.field107) {
            arg0.field180 = this.field107;
        }
    }

    @ObfuscatedName("g.m(IIII)Z")
    public boolean method127(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field113 && arg0 < this.field113 + this.field112) {
            return arg1 >= (this.field121 << 3) + (this.field109 << 6) && arg1 <= (this.field115 << 3) + (this.field109 << 6) + 7 && arg2 >= (this.field114 << 3) + (this.field108 << 6) && arg2 <= (this.field116 << 3) + (this.field108 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("g.q(III)Z")
    public boolean method130(int arg0, int arg1) {
        return arg0 >= (this.field117 << 3) + (this.field110 << 6) && arg0 <= (this.field111 << 3) + (this.field110 << 6) + 7 && arg1 >= (this.field118 << 3) + (this.field107 << 6) && arg1 <= (this.field120 << 3) + (this.field107 << 6) + 7;
    }

    @ObfuscatedName("g.x(IIII)[I")
    public int[] method131(int arg0, int arg1, int arg2) {
        return this.method127(arg0, arg1, arg2) ? new int[] { this.field117 * 8 - this.field121 * 8 + this.field110 * 64 - this.field109 * 64 + arg1, this.field118 * 8 - this.field114 * 8 + this.field107 * 64 - this.field108 * 64 + arg2 } : null;
    }

    @ObfuscatedName("g.j(III)Lhh;")
    public class227 method133(int arg0, int arg1) {
        if (this.method130(arg0, arg1)) {
            int var3 = this.field121 * 8 - this.field117 * 8 + this.field109 * 64 - this.field110 * 64 + arg0;
            int var4 = this.field114 * 8 - this.field118 * 8 + this.field108 * 64 - this.field107 * 64 + arg1;
            return new class227(this.field113, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("g.a(Lgy;S)V")
    public void method129(class183 arg0) {
        this.field113 = arg0.method3436();
        this.field112 = arg0.method3436();
        this.field109 = arg0.method3268();
        this.field121 = arg0.method3436();
        this.field115 = arg0.method3436();
        this.field108 = arg0.method3268();
        this.field114 = arg0.method3436();
        this.field116 = arg0.method3436();
        this.field110 = arg0.method3268();
        this.field117 = arg0.method3436();
        this.field111 = arg0.method3436();
        this.field107 = arg0.method3268();
        this.field118 = arg0.method3436();
        this.field120 = arg0.method3436();
        this.method134();
    }

    @ObfuscatedName("g.l(B)V")
    public void method134() {
    }
}
