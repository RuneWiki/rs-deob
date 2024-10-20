package deob;

@ObfuscatedName("br")
public class class65 extends class68 {

    @ObfuscatedName("br.g")
    public long[] field1264 = new long[10];

    @ObfuscatedName("br.h")
    public int field1257 = 256;

    @ObfuscatedName("br.s")
    public int field1259 = 1;

    @ObfuscatedName("br.o")
    public long field1265 = class121.method226();

    @ObfuscatedName("br.p")
    public int field1261 = 0;

    @ObfuscatedName("br.x")
    public int field1260;

    public class65() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1264[var1] = this.field1265;
        }
    }

    @ObfuscatedName("br.g(I)V")
    public void method1353() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1264[var1] = 0L;
        }
    }

    @ObfuscatedName("br.h(IIB)I")
    public int method1354(int arg0, int arg1) {
        int var3 = this.field1257;
        int var4 = this.field1259;
        this.field1257 = 300;
        this.field1259 = 1;
        this.field1265 = class121.method226();
        if (this.field1264[this.field1260] == 0L) {
            this.field1257 = var3;
            this.field1259 = var4;
        } else if (this.field1265 > this.field1264[this.field1260]) {
            this.field1257 = (int) ((long) (arg0 * 2560) / (this.field1265 - this.field1264[this.field1260]));
        }
        if (this.field1257 < 25) {
            this.field1257 = 25;
        }
        if (this.field1257 > 256) {
            this.field1257 = 256;
            this.field1259 = (int) ((long) arg0 - (this.field1265 - this.field1264[this.field1260]) / 10L);
        }
        if (this.field1259 > arg0) {
            this.field1259 = arg0;
        }
        this.field1264[this.field1260] = this.field1265;
        this.field1260 = (this.field1260 + 1) % 10;
        if (this.field1259 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1264[var5] != 0L) {
                    this.field1264[var5] += (long) this.field1259;
                }
            }
        }
        if (this.field1259 < arg1) {
            this.field1259 = arg1;
        }
        class126.method2355((long) this.field1259);
        int var6 = 0;
        while (this.field1261 < 256) {
            var6++;
            this.field1261 += this.field1257;
        }
        this.field1261 &= 0xFF;
        return var6;
    }
}
