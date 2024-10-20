package deob;

@ObfuscatedName("br")
public class class61 {

    @ObfuscatedName("br.s")
    public int field1247 = 2;

    @ObfuscatedName("br.z")
    public int[] field1244 = new int[2];

    @ObfuscatedName("br.t")
    public int[] field1245 = new int[2];

    @ObfuscatedName("br.y")
    public int field1248;

    @ObfuscatedName("br.p")
    public int field1246;

    @ObfuscatedName("br.g")
    public int field1253;

    @ObfuscatedName("br.m")
    public int field1243;

    @ObfuscatedName("br.f")
    public int field1249;

    @ObfuscatedName("br.k")
    public int field1250;

    @ObfuscatedName("br.h")
    public int field1252;

    @ObfuscatedName("br.r")
    public int field1251;

    public class61() {
        this.field1244[0] = 0;
        this.field1244[1] = 65535;
        this.field1245[0] = 0;
        this.field1245[1] = 65535;
    }

    @ObfuscatedName("br.s(Ldy;)V")
    public final void method1216(class123 arg0) {
        this.field1243 = arg0.method2363();
        this.field1246 = arg0.method2408();
        this.field1253 = arg0.method2408();
        this.method1217(arg0);
    }

    @ObfuscatedName("br.z(Ldy;)V")
    public final void method1217(class123 arg0) {
        this.field1247 = arg0.method2363();
        this.field1244 = new int[this.field1247];
        this.field1245 = new int[this.field1247];
        for (int var2 = 0; var2 < this.field1247; var2++) {
            this.field1244[var2] = arg0.method2550();
            this.field1245[var2] = arg0.method2550();
        }
    }

    @ObfuscatedName("br.t()V")
    public final void method1228() {
        this.field1249 = 0;
        this.field1250 = 0;
        this.field1252 = 0;
        this.field1251 = 0;
        this.field1248 = 0;
    }

    @ObfuscatedName("br.y(I)I")
    public final int method1226(int arg0) {
        if (this.field1248 >= this.field1249) {
            this.field1251 = this.field1245[this.field1250++] << 15;
            if (this.field1250 >= this.field1247) {
                this.field1250 = this.field1247 - 1;
            }
            this.field1249 = (int) ((double) this.field1244[this.field1250] / 65536.0D * (double) arg0);
            if (this.field1249 > this.field1248) {
                this.field1252 = ((this.field1245[this.field1250] << 15) - this.field1251) / (this.field1249 - this.field1248);
            }
        }
        this.field1251 += this.field1252;
        this.field1248++;
        return this.field1251 - this.field1252 >> 15;
    }
}
