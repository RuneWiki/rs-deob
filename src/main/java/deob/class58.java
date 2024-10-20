package deob;

@ObfuscatedName("bh")
public class class58 {

    @ObfuscatedName("bh.t")
    public int field1208 = 2;

    @ObfuscatedName("bh.i")
    public int[] field1207 = new int[2];

    @ObfuscatedName("bh.g")
    public int[] field1209 = new int[2];

    @ObfuscatedName("bh.h")
    public int field1212;

    @ObfuscatedName("bh.z")
    public int field1210;

    @ObfuscatedName("bh.r")
    public int field1211;

    @ObfuscatedName("bh.f")
    public int field1213;

    @ObfuscatedName("bh.s")
    public int field1206;

    @ObfuscatedName("bh.d")
    public int field1214;

    @ObfuscatedName("bh.l")
    public int field1215;

    @ObfuscatedName("bh.y")
    public int field1216;

    public class58() {
        this.field1207[0] = 0;
        this.field1207[1] = 65535;
        this.field1209[0] = 0;
        this.field1209[1] = 65535;
    }

    @ObfuscatedName("bh.t(Ldr;)V")
    public final void method1140(class120 arg0) {
        this.field1211 = arg0.method2334();
        this.field1212 = arg0.method2345();
        this.field1210 = arg0.method2345();
        this.method1141(arg0);
    }

    @ObfuscatedName("bh.i(Ldr;)V")
    public final void method1141(class120 arg0) {
        this.field1208 = arg0.method2334();
        this.field1207 = new int[this.field1208];
        this.field1209 = new int[this.field1208];
        for (int var2 = 0; var2 < this.field1208; var2++) {
            this.field1207[var2] = arg0.method2310();
            this.field1209[var2] = arg0.method2310();
        }
    }

    @ObfuscatedName("bh.g()V")
    public final void method1142() {
        this.field1213 = 0;
        this.field1206 = 0;
        this.field1214 = 0;
        this.field1215 = 0;
        this.field1216 = 0;
    }

    @ObfuscatedName("bh.h(I)I")
    public final int method1143(int arg0) {
        if (this.field1216 >= this.field1213) {
            this.field1215 = this.field1209[this.field1206++] << 15;
            if (this.field1206 >= this.field1208) {
                this.field1206 = this.field1208 - 1;
            }
            this.field1213 = (int) ((double) this.field1207[this.field1206] / 65536.0D * (double) arg0);
            if (this.field1213 > this.field1216) {
                this.field1214 = ((this.field1209[this.field1206] << 15) - this.field1215) / (this.field1213 - this.field1216);
            }
        }
        this.field1215 += this.field1214;
        this.field1216++;
        return this.field1215 - this.field1214 >> 15;
    }
}
