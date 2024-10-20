package deob;

@ObfuscatedName("fz")
public class class174 extends class180 {

    @ObfuscatedName("fz.x")
    public long[] field2029 = new long[10];

    @ObfuscatedName("fz.m")
    public int field2021 = 256;

    @ObfuscatedName("fz.k")
    public int field2022 = 1;

    @ObfuscatedName("fz.d")
    public long field2020 = Statics.method3668();

    @ObfuscatedName("fz.w")
    public int field2024 = 0;

    @ObfuscatedName("fz.v")
    public int field2025;

    public class174() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2029[var1] = this.field2020;
        }
    }

    @ObfuscatedName("fz.x(I)V")
    public void method3246() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2029[var1] = 0L;
        }
    }

    @ObfuscatedName("fz.m(III)I")
    public int method3249(int arg0, int arg1) {
        int var3 = this.field2021;
        int var4 = this.field2022;
        this.field2021 = 300;
        this.field2022 = 1;
        this.field2020 = Statics.method3668();
        if (this.field2029[this.field2025] == 0L) {
            this.field2021 = var3;
            this.field2022 = var4;
        } else if (this.field2020 > this.field2029[this.field2025]) {
            this.field2021 = (int) ((long) (arg0 * 2560) / (this.field2020 - this.field2029[this.field2025]));
        }
        if (this.field2021 < 25) {
            this.field2021 = 25;
        }
        if (this.field2021 > 256) {
            this.field2021 = 256;
            this.field2022 = (int) ((long) arg0 - (this.field2020 - this.field2029[this.field2025]) / 10L);
        }
        if (this.field2022 > arg0) {
            this.field2022 = arg0;
        }
        this.field2029[this.field2025] = this.field2020;
        this.field2025 = (this.field2025 + 1) % 10;
        if (this.field2022 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2029[var5] != 0L) {
                    this.field2029[var5] += (long) this.field2022;
                }
            }
        }
        if (this.field2022 < arg1) {
            this.field2022 = arg1;
        }
        class308.method3243((long) this.field2022);
        int var6 = 0;
        while (this.field2024 < 256) {
            var6++;
            this.field2024 += this.field2021;
        }
        this.field2024 &= 0xFF;
        return var6;
    }
}
