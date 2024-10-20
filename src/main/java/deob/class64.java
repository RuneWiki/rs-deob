package deob;

@ObfuscatedName("bg")
public class class64 extends class67 {

    @ObfuscatedName("bg.u")
    public long[] field1244 = new long[10];

    @ObfuscatedName("bg.k")
    public int field1240 = 256;

    @ObfuscatedName("bg.x")
    public int field1241 = 1;

    @ObfuscatedName("bg.m")
    public long field1246 = class120.method2609();

    @ObfuscatedName("bg.n")
    public int field1245 = 0;

    @ObfuscatedName("bg.q")
    public int field1243;

    public class64() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1244[var1] = this.field1246;
        }
    }

    @ObfuscatedName("bg.u(I)V")
    public void method1333() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1244[var1] = 0L;
        }
    }

    @ObfuscatedName("bg.k(III)I")
    public int method1334(int arg0, int arg1) {
        int var3 = this.field1240;
        int var4 = this.field1241;
        this.field1240 = 300;
        this.field1241 = 1;
        this.field1246 = class120.method2609();
        if (this.field1244[this.field1243] == 0L) {
            this.field1240 = var3;
            this.field1241 = var4;
        } else if (this.field1246 > this.field1244[this.field1243]) {
            this.field1240 = (int) ((long) (arg0 * 2560) / (this.field1246 - this.field1244[this.field1243]));
        }
        if (this.field1240 < 25) {
            this.field1240 = 25;
        }
        if (this.field1240 > 256) {
            this.field1240 = 256;
            this.field1241 = (int) ((long) arg0 - (this.field1246 - this.field1244[this.field1243]) / 10L);
        }
        if (this.field1241 > arg0) {
            this.field1241 = arg0;
        }
        this.field1244[this.field1243] = this.field1246;
        this.field1243 = (this.field1243 + 1) % 10;
        if (this.field1241 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1244[var5] != 0L) {
                    this.field1244[var5] += (long) this.field1241;
                }
            }
        }
        if (this.field1241 < arg1) {
            this.field1241 = arg1;
        }
        class125.method1228((long) this.field1241);
        int var6 = 0;
        while (this.field1245 < 256) {
            var6++;
            this.field1245 += this.field1240;
        }
        this.field1245 &= 0xFF;
        return var6;
    }
}
