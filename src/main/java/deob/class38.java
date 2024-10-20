package deob;

@ObfuscatedName("ap")
public class class38 implements class32 {

    @ObfuscatedName("ap.z")
    public int field319;

    @ObfuscatedName("ap.w")
    public int field325;

    @ObfuscatedName("ap.s")
    public int field320;

    @ObfuscatedName("ap.l")
    public int field318;

    @ObfuscatedName("ap.u")
    public int field316;

    @ObfuscatedName("ap.q")
    public int field321;

    @ObfuscatedName("ap.k")
    public int field322;

    @ObfuscatedName("ap.i")
    public int field323;

    @ObfuscatedName("ap.x")
    public int field317;

    @ObfuscatedName("ap.e")
    public int field324;

    @ObfuscatedName("ap.z(La;B)V")
    public void method116(class21 arg0) {
        if (arg0.field167 > this.field316) {
            arg0.field167 = this.field316;
        }
        if (arg0.field168 < this.field316) {
            arg0.field168 = this.field316;
        }
        if (arg0.field169 > this.field321) {
            arg0.field169 = this.field321;
        }
        if (arg0.field163 < this.field321) {
            arg0.field163 = this.field321;
        }
    }

    @ObfuscatedName("ap.w(IIII)Z")
    public boolean method117(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field319 && arg0 < this.field325 + this.field319) {
            return arg1 >= (this.field322 << 3) + (this.field320 << 6) && arg1 <= (this.field322 << 3) + (this.field320 << 6) + 7 && arg2 >= (this.field323 << 3) + (this.field318 << 6) && arg2 <= (this.field323 << 3) + (this.field318 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.s(III)Z")
    public boolean method118(int arg0, int arg1) {
        return arg0 >= (this.field317 << 3) + (this.field316 << 6) && arg0 <= (this.field317 << 3) + (this.field316 << 6) + 7 && arg1 >= (this.field324 << 3) + (this.field321 << 6) && arg1 <= (this.field324 << 3) + (this.field321 << 6) + 7;
    }

    @ObfuscatedName("ap.l(IIIB)[I")
    public int[] method119(int arg0, int arg1, int arg2) {
        return this.method117(arg0, arg1, arg2) ? new int[] { this.field317 * 8 - this.field322 * 8 + this.field316 * 64 - this.field320 * 64 + arg1, this.field324 * 8 - this.field323 * 8 + this.field321 * 64 - this.field318 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ap.u(III)Lha;")
    public class227 method120(int arg0, int arg1) {
        if (this.method118(arg0, arg1)) {
            int var3 = this.field322 * 8 - this.field317 * 8 + this.field320 * 64 - this.field316 * 64 + arg0;
            int var4 = this.field323 * 8 - this.field324 * 8 + this.field318 * 64 - this.field321 * 64 + arg1;
            return new class227(this.field319, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ap.q(Lgk;B)V")
    public void method121(class183 arg0) {
        this.field319 = arg0.method3247();
        this.field325 = arg0.method3247();
        this.field320 = arg0.method3253();
        this.field322 = arg0.method3247();
        this.field318 = arg0.method3253();
        this.field323 = arg0.method3247();
        this.field316 = arg0.method3253();
        this.field317 = arg0.method3247();
        this.field321 = arg0.method3253();
        this.field324 = arg0.method3247();
        this.method577();
    }

    @ObfuscatedName("ap.i(B)V")
    public void method577() {
    }
}
