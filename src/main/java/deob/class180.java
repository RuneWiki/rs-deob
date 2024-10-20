package deob;

@ObfuscatedName("fi")
public class class180 implements class201 {

    @ObfuscatedName("fi.n")
    public int field2031;

    @ObfuscatedName("fi.c")
    public int field2023;

    @ObfuscatedName("fi.m")
    public int field2030;

    @ObfuscatedName("fi.k")
    public int field2025;

    @ObfuscatedName("fi.o")
    public int field2026;

    @ObfuscatedName("fi.g")
    public int field2027;

    @ObfuscatedName("fi.z")
    public int field2028;

    @ObfuscatedName("fi.a")
    public int field2022;

    @ObfuscatedName("fi.u")
    public int field2029;

    @ObfuscatedName("fi.e")
    public int field2024;

    @ObfuscatedName("fi.n(Lfr;I)V")
    public void method3162(class181 arg0) {
        if (arg0.field2040 > this.field2028) {
            arg0.field2040 = this.field2028;
        }
        if (arg0.field2041 < this.field2029) {
            arg0.field2041 = this.field2029;
        }
        if (arg0.field2035 > this.field2022) {
            arg0.field2035 = this.field2022;
        }
        if (arg0.field2042 < this.field2024) {
            arg0.field2042 = this.field2024;
        }
    }

    @ObfuscatedName("fi.c(IIII)Z")
    public boolean method3174(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2031 && arg0 < this.field2031 + this.field2023) {
            return arg1 >> 6 >= this.field2030 && arg1 >> 6 <= this.field2026 && arg2 >> 6 >= this.field2025 && arg2 >> 6 <= this.field2027;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fi.m(III)Z")
    public boolean method3180(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2028 && arg0 >> 6 <= this.field2029 && arg1 >> 6 >= this.field2022 && arg1 >> 6 <= this.field2024;
    }

    @ObfuscatedName("fi.k(IIII)[I")
    public int[] method3175(int arg0, int arg1, int arg2) {
        return this.method3174(arg0, arg1, arg2) ? new int[] { this.field2028 * 64 - this.field2030 * 64 + arg1, this.field2022 * 64 - this.field2025 * 64 + arg2 } : null;
    }

    @ObfuscatedName("fi.o(III)Liy;")
    public class258 method3166(int arg0, int arg1) {
        if (this.method3180(arg0, arg1)) {
            int var3 = this.field2030 * 64 - this.field2028 * 64 + arg0;
            int var4 = this.field2025 * 64 - this.field2022 * 64 + arg1;
            return new class258(this.field2031, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fi.g(Lot;I)V")
    public void method3179(class400 arg0) {
        this.field2031 = arg0.method6217();
        this.field2023 = arg0.method6217();
        this.field2030 = arg0.method6219();
        this.field2025 = arg0.method6219();
        this.field2026 = arg0.method6219();
        this.field2027 = arg0.method6219();
        this.field2028 = arg0.method6219();
        this.field2022 = arg0.method6219();
        this.field2029 = arg0.method6219();
        this.field2024 = arg0.method6219();
        this.method3168();
    }

    @ObfuscatedName("fi.z(I)V")
    public void method3168() {
    }
}
