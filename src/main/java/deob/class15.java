package deob;

@ObfuscatedName("l")
public class class15 implements class32 {

    @ObfuscatedName("l.y")
    public int field109;

    @ObfuscatedName("l.c")
    public int field103;

    @ObfuscatedName("l.n")
    public int field116;

    @ObfuscatedName("l.u")
    public int field118;

    @ObfuscatedName("l.i")
    public int field106;

    @ObfuscatedName("l.r")
    public int field107;

    @ObfuscatedName("l.j")
    public int field108;

    @ObfuscatedName("l.p")
    public int field110;

    @ObfuscatedName("l.e")
    public int field104;

    @ObfuscatedName("l.s")
    public int field111;

    @ObfuscatedName("l.v")
    public int field112;

    @ObfuscatedName("l.k")
    public int field113;

    @ObfuscatedName("l.o")
    public int field114;

    @ObfuscatedName("l.q")
    public int field115;

    @ObfuscatedName("l.y(Lw;S)V")
    public void method119(class21 arg0) {
        if (arg0.field185 > this.field106) {
            arg0.field185 = this.field106;
        }
        if (arg0.field195 < this.field106) {
            arg0.field195 = this.field106;
        }
        if (arg0.field187 > this.field107) {
            arg0.field187 = this.field107;
        }
        if (arg0.field188 < this.field107) {
            arg0.field188 = this.field107;
        }
    }

    @ObfuscatedName("l.c(IIIS)Z")
    public boolean method129(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field109 && arg0 < this.field109 + this.field103) {
            return arg1 >= (this.field116 << 6) + (this.field108 << 3) && arg1 <= (this.field116 << 6) + (this.field104 << 3) + 7 && arg2 >= (this.field118 << 6) + (this.field110 << 3) && arg2 <= (this.field118 << 6) + (this.field111 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("l.n(III)Z")
    public boolean method121(int arg0, int arg1) {
        return arg0 >= (this.field112 << 3) + (this.field106 << 6) && arg0 <= (this.field114 << 3) + (this.field106 << 6) + 7 && arg1 >= (this.field113 << 3) + (this.field107 << 6) && arg1 <= (this.field115 << 3) + (this.field107 << 6) + 7;
    }

    @ObfuscatedName("l.u(IIIB)[I")
    public int[] method118(int arg0, int arg1, int arg2) {
        return this.method129(arg0, arg1, arg2) ? new int[] { this.field112 * 8 - this.field108 * 8 + this.field106 * 64 - this.field116 * 64 + arg1, this.field113 * 8 - this.field110 * 8 + this.field107 * 64 - this.field118 * 64 + arg2 } : null;
    }

    @ObfuscatedName("l.i(III)Lhm;")
    public class229 method123(int arg0, int arg1) {
        if (this.method121(arg0, arg1)) {
            int var3 = this.field108 * 8 - this.field112 * 8 + this.field116 * 64 - this.field106 * 64 + arg0;
            int var4 = this.field110 * 8 - this.field113 * 8 + this.field118 * 64 - this.field107 * 64 + arg1;
            return new class229(this.field109, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("l.p(Lge;I)V")
    public void method122(class185 arg0) {
        this.field109 = arg0.method3299();
        this.field103 = arg0.method3299();
        this.field116 = arg0.method3280();
        this.field108 = arg0.method3299();
        this.field104 = arg0.method3299();
        this.field118 = arg0.method3280();
        this.field110 = arg0.method3299();
        this.field111 = arg0.method3299();
        this.field106 = arg0.method3280();
        this.field112 = arg0.method3299();
        this.field114 = arg0.method3299();
        this.field107 = arg0.method3280();
        this.field113 = arg0.method3299();
        this.field115 = arg0.method3299();
        this.method125();
    }

    @ObfuscatedName("l.e(B)V")
    public void method125() {
    }
}
