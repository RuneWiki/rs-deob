package deob;

@ObfuscatedName("fu")
public class class174 extends class180 {

    @ObfuscatedName("fu.z")
    public long[] field2058 = new long[10];

    @ObfuscatedName("fu.k")
    public int field2054 = 256;

    @ObfuscatedName("fu.s")
    public int field2056 = 1;

    @ObfuscatedName("fu.t")
    public long field2057 = class307.method2184();

    @ObfuscatedName("fu.i")
    public int field2055 = 0;

    @ObfuscatedName("fu.o")
    public int field2059;

    public class174() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2058[var1] = this.field2057;
        }
    }

    @ObfuscatedName("fu.z(I)V")
    public void method3268() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2058[var1] = 0L;
        }
    }

    @ObfuscatedName("fu.k(III)I")
    public int method3269(int arg0, int arg1) {
        int var3 = this.field2054;
        int var4 = this.field2056;
        this.field2054 = 300;
        this.field2056 = 1;
        this.field2057 = class307.method2184();
        if (this.field2058[this.field2059] == 0L) {
            this.field2054 = var3;
            this.field2056 = var4;
        } else if (this.field2057 > this.field2058[this.field2059]) {
            this.field2054 = (int) ((long) (arg0 * 2560) / (this.field2057 - this.field2058[this.field2059]));
        }
        if (this.field2054 < 25) {
            this.field2054 = 25;
        }
        if (this.field2054 > 256) {
            this.field2054 = 256;
            this.field2056 = (int) ((long) arg0 - (this.field2057 - this.field2058[this.field2059]) / 10L);
        }
        if (this.field2056 > arg0) {
            this.field2056 = arg0;
        }
        this.field2058[this.field2059] = this.field2057;
        this.field2059 = (this.field2059 + 1) % 10;
        if (this.field2056 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2058[var5] != 0L) {
                    this.field2058[var5] += (long) this.field2056;
                }
            }
        }
        if (this.field2056 < arg1) {
            this.field2056 = arg1;
        }
        class308.method3834((long) this.field2056);
        int var6 = 0;
        while (this.field2055 < 256) {
            var6++;
            this.field2055 += this.field2054;
        }
        this.field2055 &= 0xFF;
        return var6;
    }
}
