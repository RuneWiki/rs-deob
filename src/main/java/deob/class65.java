package deob;

@ObfuscatedName("bu")
public class class65 extends class68 {

    @ObfuscatedName("bu.j")
    public long[] field1257 = new long[10];

    @ObfuscatedName("bu.r")
    public int field1252 = 256;

    @ObfuscatedName("bu.v")
    public int field1258 = 1;

    @ObfuscatedName("bu.p")
    public long field1254 = Statics.method2045();

    @ObfuscatedName("bu.e")
    public int field1255 = 0;

    @ObfuscatedName("bu.d")
    public int field1256;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1257[var1] = this.field1254;
        }
    }

    @ObfuscatedName("bu.j(B)V")
    public void method1347() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1257[var1] = 0L;
        }
    }

    @ObfuscatedName("bu.r(IIB)I")
    public int method1340(int arg0, int arg1) {
        int var3 = this.field1252;
        int var4 = this.field1258;
        this.field1252 = 300;
        this.field1258 = 1;
        this.field1254 = Statics.method2045();
        if (this.field1257[this.field1256] == 0L) {
            this.field1252 = var3;
            this.field1258 = var4;
        } else if (this.field1254 > this.field1257[this.field1256]) {
            this.field1252 = (int) ((long) (arg0 * 2560) / (this.field1254 - this.field1257[this.field1256]));
        }
        if (this.field1252 < 25) {
            this.field1252 = 25;
        }
        if (this.field1252 > 256) {
            this.field1252 = 256;
            this.field1258 = (int) ((long) arg0 - (this.field1254 - this.field1257[this.field1256]) / 10L);
        }
        if (this.field1258 > arg0) {
            this.field1258 = arg0;
        }
        this.field1257[this.field1256] = this.field1254;
        this.field1256 = (this.field1256 + 1) % 10;
        if (this.field1258 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1257[var5] != 0L) {
                    this.field1257[var5] += (long) this.field1258;
                }
            }
        }
        if (this.field1258 < arg1) {
            this.field1258 = arg1;
        }
        class126.method1316((long) this.field1258);
        int var6 = 0;
        while (this.field1255 < 256) {
            var6++;
            this.field1255 += this.field1252;
        }
        this.field1255 &= 0xFF;
        return var6;
    }
}
