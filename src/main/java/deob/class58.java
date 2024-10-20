package deob;

@ObfuscatedName("bx")
public class class58 {

    @ObfuscatedName("bx.h")
    public int field1208 = 2;

    @ObfuscatedName("bx.m")
    public int[] field1215 = new int[2];

    @ObfuscatedName("bx.i")
    public int[] field1213 = new int[2];

    @ObfuscatedName("bx.q")
    public int field1211;

    @ObfuscatedName("bx.p")
    public int field1212;

    @ObfuscatedName("bx.c")
    public int field1209;

    @ObfuscatedName("bx.f")
    public int field1214;

    @ObfuscatedName("bx.y")
    public int field1218;

    @ObfuscatedName("bx.w")
    public int field1210;

    @ObfuscatedName("bx.l")
    public int field1216;

    @ObfuscatedName("bx.v")
    public int field1217;

    public class58() {
        this.field1215[0] = 0;
        this.field1215[1] = 65535;
        this.field1213[0] = 0;
        this.field1213[1] = 65535;
    }

    @ObfuscatedName("bx.h(Ldp;)V")
    public final void method1182(class119 arg0) {
        this.field1209 = arg0.method2320();
        this.field1211 = arg0.method2324();
        this.field1212 = arg0.method2324();
        this.method1183(arg0);
    }

    @ObfuscatedName("bx.m(Ldp;)V")
    public final void method1183(class119 arg0) {
        this.field1208 = arg0.method2320();
        this.field1215 = new int[this.field1208];
        this.field1213 = new int[this.field1208];
        for (int var2 = 0; var2 < this.field1208; var2++) {
            this.field1215[var2] = arg0.method2322();
            this.field1213[var2] = arg0.method2322();
        }
    }

    @ObfuscatedName("bx.i()V")
    public final void method1184() {
        this.field1214 = 0;
        this.field1210 = 0;
        this.field1216 = 0;
        this.field1217 = 0;
        this.field1218 = 0;
    }

    @ObfuscatedName("bx.q(I)I")
    public final int method1185(int arg0) {
        if (this.field1218 >= this.field1214) {
            this.field1217 = this.field1213[this.field1210++] << 15;
            if (this.field1210 >= this.field1208) {
                this.field1210 = this.field1208 - 1;
            }
            this.field1214 = (int) ((double) this.field1215[this.field1210] / 65536.0D * (double) arg0);
            if (this.field1214 > this.field1218) {
                this.field1216 = ((this.field1213[this.field1210] << 15) - this.field1217) / (this.field1214 - this.field1218);
            }
        }
        this.field1217 += this.field1216;
        this.field1218++;
        return this.field1217 - this.field1216 >> 15;
    }
}
