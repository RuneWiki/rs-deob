package deob;

@ObfuscatedName("be")
public class class65 extends class68 {

    @ObfuscatedName("be.p")
    public long[] field1255 = new long[10];

    @ObfuscatedName("be.l")
    public int field1256 = 256;

    @ObfuscatedName("be.d")
    public int field1254 = 1;

    @ObfuscatedName("be.x")
    public long field1257 = class121.method548();

    @ObfuscatedName("be.o")
    public int field1253 = 0;

    @ObfuscatedName("be.a")
    public int field1252;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1255[var1] = this.field1257;
        }
    }

    @ObfuscatedName("be.p(B)V")
    public void method1398() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1255[var1] = 0L;
        }
    }

    @ObfuscatedName("be.l(III)I")
    public int method1390(int arg0, int arg1) {
        int var3 = this.field1256;
        int var4 = this.field1254;
        this.field1256 = 300;
        this.field1254 = 1;
        this.field1257 = class121.method548();
        if (this.field1255[this.field1252] == 0L) {
            this.field1256 = var3;
            this.field1254 = var4;
        } else if (this.field1257 > this.field1255[this.field1252]) {
            this.field1256 = (int) ((long) (arg0 * 2560) / (this.field1257 - this.field1255[this.field1252]));
        }
        if (this.field1256 < 25) {
            this.field1256 = 25;
        }
        if (this.field1256 > 256) {
            this.field1256 = 256;
            this.field1254 = (int) ((long) arg0 - (this.field1257 - this.field1255[this.field1252]) / 10L);
        }
        if (this.field1254 > arg0) {
            this.field1254 = arg0;
        }
        this.field1255[this.field1252] = this.field1257;
        this.field1252 = (this.field1252 + 1) % 10;
        if (this.field1254 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1255[var5] != 0L) {
                    this.field1255[var5] += (long) this.field1254;
                }
            }
        }
        if (this.field1254 < arg1) {
            this.field1254 = arg1;
        }
        class126.method1463((long) this.field1254);
        int var6 = 0;
        while (this.field1253 < 256) {
            var6++;
            this.field1253 += this.field1256;
        }
        this.field1253 &= 0xFF;
        return var6;
    }
}
