package deob;

@ObfuscatedName("bn")
public class class58 {

    @ObfuscatedName("bn.w")
    public int field1215 = 2;

    @ObfuscatedName("bn.t")
    public int[] field1206 = new int[2];

    @ObfuscatedName("bn.p")
    public int[] field1207 = new int[2];

    @ObfuscatedName("bn.e")
    public int field1208;

    @ObfuscatedName("bn.y")
    public int field1213;

    @ObfuscatedName("bn.m")
    public int field1209;

    @ObfuscatedName("bn.c")
    public int field1210;

    @ObfuscatedName("bn.v")
    public int field1214;

    @ObfuscatedName("bn.l")
    public int field1212;

    @ObfuscatedName("bn.z")
    public int field1211;

    @ObfuscatedName("bn.s")
    public int field1205;

    public class58() {
        this.field1206[0] = 0;
        this.field1206[1] = 65535;
        this.field1207[0] = 0;
        this.field1207[1] = 65535;
    }

    @ObfuscatedName("bn.w(Lde;)V")
    public final void method1204(class120 arg0) {
        this.field1210 = arg0.method2363();
        this.field1208 = arg0.method2368();
        this.field1209 = arg0.method2368();
        this.method1205(arg0);
    }

    @ObfuscatedName("bn.x(Lde;)V")
    public final void method1205(class120 arg0) {
        this.field1215 = arg0.method2363();
        this.field1206 = new int[this.field1215];
        this.field1207 = new int[this.field1215];
        for (int var2 = 0; var2 < this.field1215; var2++) {
            this.field1206[var2] = arg0.method2365();
            this.field1207[var2] = arg0.method2365();
        }
    }

    @ObfuscatedName("bn.t()V")
    public final void method1206() {
        this.field1214 = 0;
        this.field1212 = 0;
        this.field1211 = 0;
        this.field1205 = 0;
        this.field1213 = 0;
    }

    @ObfuscatedName("bn.p(I)I")
    public final int method1208(int arg0) {
        if (this.field1213 >= this.field1214) {
            this.field1205 = this.field1207[this.field1212++] << 15;
            if (this.field1212 >= this.field1215) {
                this.field1212 = this.field1215 - 1;
            }
            this.field1214 = (int) ((double) this.field1206[this.field1212] / 65536.0D * (double) arg0);
            if (this.field1214 > this.field1213) {
                this.field1211 = ((this.field1207[this.field1212] << 15) - this.field1205) / (this.field1214 - this.field1213);
            }
        }
        this.field1205 += this.field1211;
        this.field1213++;
        return this.field1205 - this.field1211 >> 15;
    }
}
