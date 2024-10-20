package deob;

@ObfuscatedName("fu")
public class class175 implements class188 {

    @ObfuscatedName("fu.s")
    public int field2032;

    @ObfuscatedName("fu.t")
    public int field2023;

    @ObfuscatedName("fu.v")
    public int field2029;

    @ObfuscatedName("fu.j")
    public int field2027;

    @ObfuscatedName("fu.l")
    public int field2026;

    @ObfuscatedName("fu.n")
    public int field2033;

    @ObfuscatedName("fu.w")
    public int field2028;

    @ObfuscatedName("fu.f")
    public int field2031;

    @ObfuscatedName("fu.o")
    public int field2030;

    @ObfuscatedName("fu.x")
    public int field2025;

    @ObfuscatedName("fu.r")
    public int field2022;

    @ObfuscatedName("fu.p")
    public int field2024;

    @ObfuscatedName("fu.h")
    public int field2034;

    @ObfuscatedName("fu.k")
    public int field2035;

    @ObfuscatedName("fu.s(Lfa;I)V")
    public void method2967(class168 arg0) {
        if (arg0.field1953 > this.field2026) {
            arg0.field1953 = this.field2026;
        }
        if (arg0.field1951 < this.field2026) {
            arg0.field1951 = this.field2026;
        }
        if (arg0.field1952 > this.field2033) {
            arg0.field1952 = this.field2033;
        }
        if (arg0.field1957 < this.field2033) {
            arg0.field1957 = this.field2033;
        }
    }

    @ObfuscatedName("fu.t(IIIB)Z")
    public boolean method2946(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2032 && arg0 < this.field2032 + this.field2023) {
            return arg1 >= (this.field2029 << 6) + (this.field2028 << 3) && arg1 <= (this.field2030 << 3) + (this.field2029 << 6) + 7 && arg2 >= (this.field2031 << 3) + (this.field2027 << 6) && arg2 <= (this.field2027 << 6) + (this.field2025 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fu.v(III)Z")
    public boolean method2948(int arg0, int arg1) {
        return arg0 >= (this.field2026 << 6) + (this.field2022 << 3) && arg0 <= (this.field2034 << 3) + (this.field2026 << 6) + 7 && arg1 >= (this.field2033 << 6) + (this.field2024 << 3) && arg1 <= (this.field2035 << 3) + (this.field2033 << 6) + 7;
    }

    @ObfuscatedName("fu.j(IIII)[I")
    public int[] method2962(int arg0, int arg1, int arg2) {
        return this.method2946(arg0, arg1, arg2) ? new int[] { this.field2022 * 8 - this.field2028 * 8 + this.field2026 * 64 - this.field2029 * 64 + arg1, this.field2024 * 8 - this.field2031 * 8 + this.field2033 * 64 - this.field2027 * 64 + arg2 } : null;
    }

    @ObfuscatedName("fu.l(IIB)Lij;")
    public class245 method2947(int arg0, int arg1) {
        if (this.method2948(arg0, arg1)) {
            int var3 = this.field2028 * 8 - this.field2022 * 8 + this.field2029 * 64 - this.field2026 * 64 + arg0;
            int var4 = this.field2031 * 8 - this.field2024 * 8 + this.field2027 * 64 - this.field2033 * 64 + arg1;
            return new class245(this.field2032, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fu.n(Lnv;I)V")
    public void method2949(class385 arg0) {
        this.field2032 = arg0.method5958();
        this.field2023 = arg0.method5958();
        this.field2029 = arg0.method6053();
        this.field2028 = arg0.method5958();
        this.field2030 = arg0.method5958();
        this.field2027 = arg0.method6053();
        this.field2031 = arg0.method5958();
        this.field2025 = arg0.method5958();
        this.field2026 = arg0.method6053();
        this.field2022 = arg0.method5958();
        this.field2034 = arg0.method5958();
        this.field2033 = arg0.method6053();
        this.field2024 = arg0.method5958();
        this.field2035 = arg0.method5958();
        this.method3221();
    }

    @ObfuscatedName("fu.w(I)V")
    public void method3221() {
    }
}
