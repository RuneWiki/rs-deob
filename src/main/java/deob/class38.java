package deob;

@ObfuscatedName("ae")
public class class38 implements class32 {

    @ObfuscatedName("ae.f")
    public int field325;

    @ObfuscatedName("ae.h")
    public int field320;

    @ObfuscatedName("ae.e")
    public int field319;

    @ObfuscatedName("ae.b")
    public int field321;

    @ObfuscatedName("ae.l")
    public int field322;

    @ObfuscatedName("ae.w")
    public int field323;

    @ObfuscatedName("ae.d")
    public int field317;

    @ObfuscatedName("ae.n")
    public int field324;

    @ObfuscatedName("ae.s")
    public int field318;

    @ObfuscatedName("ae.g")
    public int field326;

    @ObfuscatedName("ae.f(Lp;B)V")
    public void method162(class21 arg0) {
        if (arg0.field171 > this.field322) {
            arg0.field171 = this.field322;
        }
        if (arg0.field172 < this.field322) {
            arg0.field172 = this.field322;
        }
        if (arg0.field170 > this.field323) {
            arg0.field170 = this.field323;
        }
        if (arg0.field174 < this.field323) {
            arg0.field174 = this.field323;
        }
    }

    @ObfuscatedName("ae.h(IIIB)Z")
    public boolean method151(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field325 && arg0 < this.field325 + this.field320) {
            return arg1 >= (this.field319 << 6) + (this.field317 << 3) && arg1 <= (this.field319 << 6) + (this.field317 << 3) + 7 && arg2 >= (this.field324 << 3) + (this.field321 << 6) && arg2 <= (this.field324 << 3) + (this.field321 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.e(IIB)Z")
    public boolean method152(int arg0, int arg1) {
        return arg0 >= (this.field322 << 6) + (this.field318 << 3) && arg0 <= (this.field322 << 6) + (this.field318 << 3) + 7 && arg1 >= (this.field326 << 3) + (this.field323 << 6) && arg1 <= (this.field326 << 3) + (this.field323 << 6) + 7;
    }

    @ObfuscatedName("ae.b(IIII)[I")
    public int[] method150(int arg0, int arg1, int arg2) {
        return this.method151(arg0, arg1, arg2) ? new int[] { this.field318 * 8 - this.field317 * 8 + this.field322 * 64 - this.field319 * 64 + arg1, this.field326 * 8 - this.field324 * 8 + this.field323 * 64 - this.field321 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ae.l(IIB)Lhc;")
    public class229 method177(int arg0, int arg1) {
        if (this.method152(arg0, arg1)) {
            int var3 = this.field317 * 8 - this.field318 * 8 + this.field319 * 64 - this.field322 * 64 + arg0;
            int var4 = this.field324 * 8 - this.field326 * 8 + this.field321 * 64 - this.field323 * 64 + arg1;
            return new class229(this.field325, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ae.w(Lgx;I)V")
    public void method155(class185 arg0) {
        this.field325 = arg0.method3323();
        this.field320 = arg0.method3323();
        this.field319 = arg0.method3325();
        this.field317 = arg0.method3323();
        this.field321 = arg0.method3325();
        this.field324 = arg0.method3323();
        this.field322 = arg0.method3325();
        this.field318 = arg0.method3323();
        this.field323 = arg0.method3325();
        this.field326 = arg0.method3323();
        this.method605();
    }

    @ObfuscatedName("ae.d(I)V")
    public void method605() {
    }
}
