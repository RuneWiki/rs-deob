package deob;

@ObfuscatedName("ao")
public class class38 implements class32 {

    @ObfuscatedName("ao.w")
    public int field317;

    @ObfuscatedName("ao.m")
    public int field316;

    @ObfuscatedName("ao.q")
    public int field324;

    @ObfuscatedName("ao.b")
    public int field318;

    @ObfuscatedName("ao.f")
    public int field329;

    @ObfuscatedName("ao.n")
    public int field315;

    @ObfuscatedName("ao.h")
    public int field321;

    @ObfuscatedName("ao.x")
    public int field326;

    @ObfuscatedName("ao.j")
    public int field320;

    @ObfuscatedName("ao.a")
    public int field319;

    @ObfuscatedName("ao.w(Li;I)V")
    public void method128(class21 arg0) {
        if (arg0.field177 > this.field329) {
            arg0.field177 = this.field329;
        }
        if (arg0.field178 < this.field329) {
            arg0.field178 = this.field329;
        }
        if (arg0.field179 > this.field315) {
            arg0.field179 = this.field315;
        }
        if (arg0.field180 < this.field315) {
            arg0.field180 = this.field315;
        }
    }

    @ObfuscatedName("ao.m(IIII)Z")
    public boolean method127(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field317 && arg0 < this.field317 + this.field316) {
            return arg1 >= (this.field324 << 6) + (this.field321 << 3) && arg1 <= (this.field324 << 6) + (this.field321 << 3) + 7 && arg2 >= (this.field326 << 3) + (this.field318 << 6) && arg2 <= (this.field326 << 3) + (this.field318 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ao.q(III)Z")
    public boolean method130(int arg0, int arg1) {
        return arg0 >= (this.field329 << 6) + (this.field320 << 3) && arg0 <= (this.field329 << 6) + (this.field320 << 3) + 7 && arg1 >= (this.field319 << 3) + (this.field315 << 6) && arg1 <= (this.field319 << 3) + (this.field315 << 6) + 7;
    }

    @ObfuscatedName("ao.x(IIII)[I")
    public int[] method131(int arg0, int arg1, int arg2) {
        return this.method127(arg0, arg1, arg2) ? new int[] { this.field320 * 8 - this.field321 * 8 + this.field329 * 64 - this.field324 * 64 + arg1, this.field319 * 8 - this.field326 * 8 + this.field315 * 64 - this.field318 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ao.j(III)Lhh;")
    public class227 method133(int arg0, int arg1) {
        if (this.method130(arg0, arg1)) {
            int var3 = this.field321 * 8 - this.field320 * 8 + this.field324 * 64 - this.field329 * 64 + arg0;
            int var4 = this.field326 * 8 - this.field319 * 8 + this.field318 * 64 - this.field315 * 64 + arg1;
            return new class227(this.field317, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ao.a(Lgy;S)V")
    public void method129(class183 arg0) {
        this.field317 = arg0.method3436();
        this.field316 = arg0.method3436();
        this.field324 = arg0.method3268();
        this.field321 = arg0.method3436();
        this.field318 = arg0.method3268();
        this.field326 = arg0.method3436();
        this.field329 = arg0.method3268();
        this.field320 = arg0.method3436();
        this.field315 = arg0.method3268();
        this.field319 = arg0.method3436();
        this.method624();
    }

    @ObfuscatedName("ao.l(B)V")
    public void method624() {
    }
}
