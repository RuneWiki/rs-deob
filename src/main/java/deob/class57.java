package deob;

@ObfuscatedName("bl")
public class class57 {

    @ObfuscatedName("bl.e")
    public int field1211 = 2;

    @ObfuscatedName("bl.i")
    public int[] field1206 = new int[2];

    @ObfuscatedName("bl.k")
    public int[] field1215 = new int[2];

    @ObfuscatedName("bl.q")
    public int field1208;

    @ObfuscatedName("bl.j")
    public int field1209;

    @ObfuscatedName("bl.z")
    public int field1210;

    @ObfuscatedName("bl.m")
    public int field1205;

    @ObfuscatedName("bl.w")
    public int field1212;

    @ObfuscatedName("bl.a")
    public int field1213;

    @ObfuscatedName("bl.d")
    public int field1214;

    @ObfuscatedName("bl.u")
    public int field1207;

    public class57() {
        this.field1206[0] = 0;
        this.field1206[1] = 65535;
        this.field1215[0] = 0;
        this.field1215[1] = 65535;
    }

    @ObfuscatedName("bl.e(Ldl;)V")
    public final void method1294(class128 arg0) {
        this.field1210 = arg0.method2548();
        this.field1208 = arg0.method2592();
        this.field1209 = arg0.method2592();
        this.method1292(arg0);
    }

    @ObfuscatedName("bl.i(Ldl;)V")
    public final void method1292(class128 arg0) {
        this.field1211 = arg0.method2548();
        this.field1206 = new int[this.field1211];
        this.field1215 = new int[this.field1211];
        for (int var2 = 0; var2 < this.field1211; var2++) {
            this.field1206[var2] = arg0.method2456();
            this.field1215[var2] = arg0.method2456();
        }
    }

    @ObfuscatedName("bl.k()V")
    public final void method1291() {
        this.field1205 = 0;
        this.field1212 = 0;
        this.field1213 = 0;
        this.field1214 = 0;
        this.field1207 = 0;
    }

    @ObfuscatedName("bl.q(I)I")
    public final int method1296(int arg0) {
        if (this.field1207 >= this.field1205) {
            this.field1214 = this.field1215[this.field1212++] << 15;
            if (this.field1212 >= this.field1211) {
                this.field1212 = this.field1211 - 1;
            }
            this.field1205 = (int) ((double) this.field1206[this.field1212] / 65536.0D * (double) arg0);
            if (this.field1205 > this.field1207) {
                this.field1213 = ((this.field1215[this.field1212] << 15) - this.field1214) / (this.field1205 - this.field1207);
            }
        }
        this.field1214 += this.field1213;
        this.field1207++;
        return this.field1214 - this.field1213 >> 15;
    }
}
