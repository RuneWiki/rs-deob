package deob;

@ObfuscatedName("bl")
public class class58 {

    @ObfuscatedName("bl.j")
    public int field1216 = 2;

    @ObfuscatedName("bl.l")
    public int[] field1207 = new int[2];

    @ObfuscatedName("bl.a")
    public int[] field1212 = new int[2];

    @ObfuscatedName("bl.i")
    public int field1209;

    @ObfuscatedName("bl.f")
    public int field1210;

    @ObfuscatedName("bl.m")
    public int field1211;

    @ObfuscatedName("bl.o")
    public int field1214;

    @ObfuscatedName("bl.h")
    public int field1208;

    @ObfuscatedName("bl.n")
    public int field1206;

    @ObfuscatedName("bl.k")
    public int field1213;

    @ObfuscatedName("bl.r")
    public int field1215;

    public class58() {
        this.field1207[0] = 0;
        this.field1207[1] = 65535;
        this.field1212[0] = 0;
        this.field1212[1] = 65535;
    }

    @ObfuscatedName("bl.j(Ldc;)V")
    public final void method1188(class119 arg0) {
        this.field1211 = arg0.method2316();
        this.field1209 = arg0.method2321();
        this.field1210 = arg0.method2321();
        this.method1199(arg0);
    }

    @ObfuscatedName("bl.l(Ldc;)V")
    public final void method1199(class119 arg0) {
        this.field1216 = arg0.method2316();
        this.field1207 = new int[this.field1216];
        this.field1212 = new int[this.field1216];
        for (int var2 = 0; var2 < this.field1216; var2++) {
            this.field1207[var2] = arg0.method2318();
            this.field1212[var2] = arg0.method2318();
        }
    }

    @ObfuscatedName("bl.a()V")
    public final void method1190() {
        this.field1214 = 0;
        this.field1208 = 0;
        this.field1206 = 0;
        this.field1213 = 0;
        this.field1215 = 0;
    }

    @ObfuscatedName("bl.i(I)I")
    public final int method1191(int arg0) {
        if (this.field1215 >= this.field1214) {
            this.field1213 = this.field1212[this.field1208++] << 15;
            if (this.field1208 >= this.field1216) {
                this.field1208 = this.field1216 - 1;
            }
            this.field1214 = (int) ((double) this.field1207[this.field1208] / 65536.0D * (double) arg0);
            if (this.field1214 > this.field1215) {
                this.field1206 = ((this.field1212[this.field1208] << 15) - this.field1213) / (this.field1214 - this.field1215);
            }
        }
        this.field1213 += this.field1206;
        this.field1215++;
        return this.field1213 - this.field1206 >> 15;
    }
}
