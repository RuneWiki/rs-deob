package deob;

@ObfuscatedName("ec")
public class class133 extends class125 {

    @ObfuscatedName("ec.e")
    public long[] field2021 = new long[10];

    @ObfuscatedName("ec.a")
    public int field2020 = 256;

    @ObfuscatedName("ec.l")
    public int field2025 = 1;

    @ObfuscatedName("ec.c")
    public long field2019 = class107.method635();

    @ObfuscatedName("ec.u")
    public int field2023 = 0;

    @ObfuscatedName("ec.w")
    public int field2024;

    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2021[var1] = this.field2019;
        }
    }

    @ObfuscatedName("ec.a(I)V")
    public void method2532() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2021[var1] = 0L;
        }
    }

    @ObfuscatedName("ec.l(III)I")
    public int method2534(int arg0, int arg1) {
        int var3 = this.field2020;
        int var4 = this.field2025;
        this.field2020 = 300;
        this.field2025 = 1;
        this.field2019 = class107.method635();
        if (this.field2021[this.field2024] == 0L) {
            this.field2020 = var3;
            this.field2025 = var4;
        } else if (this.field2019 > this.field2021[this.field2024]) {
            this.field2020 = (int) ((long) (arg0 * 2560) / (this.field2019 - this.field2021[this.field2024]));
        }
        if (this.field2020 < 25) {
            this.field2020 = 25;
        }
        if (this.field2020 > 256) {
            this.field2020 = 256;
            this.field2025 = (int) ((long) arg0 - (this.field2019 - this.field2021[this.field2024]) / 10L);
        }
        if (this.field2025 > arg0) {
            this.field2025 = arg0;
        }
        this.field2021[this.field2024] = this.field2019;
        this.field2024 = (this.field2024 + 1) % 10;
        if (this.field2025 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2021[var5] != 0L) {
                    this.field2021[var5] += (long) this.field2025;
                }
            }
        }
        if (this.field2025 < arg1) {
            this.field2025 = arg1;
        }
        class119.method837((long) this.field2025);
        int var6 = 0;
        while (this.field2023 < 256) {
            var6++;
            this.field2023 += this.field2020;
        }
        this.field2023 &= 0xFF;
        return var6;
    }
}
