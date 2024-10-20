package deob;

@ObfuscatedName("fi")
public class class165 extends class171 {

    @ObfuscatedName("fi.u")
    public long[] field2018 = new long[10];

    @ObfuscatedName("fi.f")
    public int field2019 = 256;

    @ObfuscatedName("fi.b")
    public int field2020 = 1;

    @ObfuscatedName("fi.g")
    public long field2023 = class297.method3217();

    @ObfuscatedName("fi.z")
    public int field2022 = 0;

    @ObfuscatedName("fi.p")
    public int field2021;

    public class165() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2018[var1] = this.field2023;
        }
    }

    @ObfuscatedName("fi.u(I)V")
    public void method3196() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2018[var1] = 0L;
        }
    }

    @ObfuscatedName("fi.f(IIB)I")
    public int method3197(int arg0, int arg1) {
        int var3 = this.field2019;
        int var4 = this.field2020;
        this.field2019 = 300;
        this.field2020 = 1;
        this.field2023 = class297.method3217();
        if (this.field2018[this.field2021] == 0L) {
            this.field2019 = var3;
            this.field2020 = var4;
        } else if (this.field2023 > this.field2018[this.field2021]) {
            this.field2019 = (int) ((long) (arg0 * 2560) / (this.field2023 - this.field2018[this.field2021]));
        }
        if (this.field2019 < 25) {
            this.field2019 = 25;
        }
        if (this.field2019 > 256) {
            this.field2019 = 256;
            this.field2020 = (int) ((long) arg0 - (this.field2023 - this.field2018[this.field2021]) / 10L);
        }
        if (this.field2020 > arg0) {
            this.field2020 = arg0;
        }
        this.field2018[this.field2021] = this.field2023;
        this.field2021 = (this.field2021 + 1) % 10;
        if (this.field2020 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2018[var5] != 0L) {
                    this.field2018[var5] += (long) this.field2020;
                }
            }
        }
        if (this.field2020 < arg1) {
            this.field2020 = arg1;
        }
        long var6 = (long) this.field2020;
        if (var6 > 0L) {
            if (var6 % 10L == 0L) {
                long var8 = var6 - 1L;
                try {
                    Thread.sleep(var8);
                } catch (InterruptedException var16) {
                }
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException var15) {
                }
            } else {
                try {
                    Thread.sleep(var6);
                } catch (InterruptedException var14) {
                }
            }
        }
        int var13 = 0;
        while (this.field2022 < 256) {
            var13++;
            this.field2022 += this.field2019;
        }
        this.field2022 &= 0xFF;
        return var13;
    }
}
