package deob;

@ObfuscatedName("aq")
public class class34 implements class38 {

    @ObfuscatedName("aq.f")
    public int field272;

    @ObfuscatedName("aq.i")
    public int field267;

    @ObfuscatedName("aq.y")
    public int field273;

    @ObfuscatedName("aq.w")
    public int field269;

    @ObfuscatedName("aq.p")
    public int field276;

    @ObfuscatedName("aq.b")
    public int field271;

    @ObfuscatedName("aq.f(Laa;I)V")
    public void method185(class27 arg0) {
        if (arg0.field208 > this.field276) {
            arg0.field208 = this.field276;
        }
        if (arg0.field209 < this.field276) {
            arg0.field209 = this.field276;
        }
        if (arg0.field210 > this.field271) {
            arg0.field210 = this.field271;
        }
        if (arg0.field202 < this.field271) {
            arg0.field202 = this.field271;
        }
    }

    @ObfuscatedName("aq.i(IIII)Z")
    public boolean method191(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field272 && arg0 < this.field272 + this.field267) {
            return arg1 >> 6 == this.field273 && arg2 >> 6 == this.field269;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aq.y(IIB)Z")
    public boolean method187(int arg0, int arg1) {
        return arg0 >> 6 == this.field276 && arg1 >> 6 == this.field271;
    }

    @ObfuscatedName("aq.w(IIII)[I")
    public int[] method188(int arg0, int arg1, int arg2) {
        return this.method191(arg0, arg1, arg2) ? new int[] { this.field276 * 64 - this.field273 * 64 + arg1, this.field271 * 64 - this.field269 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aq.p(IIB)Lht;")
    public class214 method189(int arg0, int arg1) {
        if (this.method187(arg0, arg1)) {
            int var3 = this.field273 * 64 - this.field276 * 64 + arg0;
            int var4 = this.field269 * 64 - this.field271 * 64 + arg1;
            return new class214(this.field272, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aq.b(Lkq;B)V")
    public void method207(class300 arg0) {
        this.field272 = arg0.method5110();
        this.field267 = arg0.method5110();
        this.field273 = arg0.method5112();
        this.field269 = arg0.method5112();
        this.field276 = arg0.method5112();
        this.field271 = arg0.method5112();
        this.method499();
    }

    @ObfuscatedName("aq.e(B)V")
    public void method499() {
    }
}
