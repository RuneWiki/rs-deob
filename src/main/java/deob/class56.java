package deob;

@ObfuscatedName("bl")
public class class56 {

    @ObfuscatedName("bl.c")
    public int field1205 = 2;

    @ObfuscatedName("bl.q")
    public int[] field1203 = new int[2];

    @ObfuscatedName("bl.y")
    public int field1208;

    @ObfuscatedName("bl.v")
    public int[] field1206 = new int[2];

    @ObfuscatedName("bl.g")
    public int field1204;

    @ObfuscatedName("bl.u")
    public int field1202;

    @ObfuscatedName("bl.l")
    public int field1207;

    @ObfuscatedName("bl.a")
    public int field1212;

    @ObfuscatedName("bl.h")
    public int field1209;

    @ObfuscatedName("bl.t")
    public int field1210;

    @ObfuscatedName("bl.m")
    public int field1211;

    public class56() {
        this.field1203[0] = 0;
        this.field1203[1] = 65535;
        this.field1206[0] = 0;
        this.field1206[1] = 65535;
    }

    @ObfuscatedName("bl.c(Ldg;)V")
    public final void method1185(class127 arg0) {
        this.field1207 = arg0.method2383();
        this.field1204 = arg0.method2323();
        this.field1202 = arg0.method2323();
        this.method1186(arg0);
    }

    @ObfuscatedName("bl.q(Ldg;)V")
    public final void method1186(class127 arg0) {
        this.field1205 = arg0.method2383();
        this.field1203 = new int[this.field1205];
        this.field1206 = new int[this.field1205];
        for (int var2 = 0; var2 < this.field1205; var2++) {
            this.field1203[var2] = arg0.method2327();
            this.field1206[var2] = arg0.method2327();
        }
    }

    @ObfuscatedName("bl.y()V")
    public final void method1187() {
        this.field1212 = 0;
        this.field1209 = 0;
        this.field1210 = 0;
        this.field1211 = 0;
        this.field1208 = 0;
    }

    @ObfuscatedName("bl.v(I)I")
    public final int method1191(int arg0) {
        if (this.field1208 >= this.field1212) {
            this.field1211 = this.field1206[this.field1209++] << 15;
            if (this.field1209 >= this.field1205) {
                this.field1209 = this.field1205 - 1;
            }
            this.field1212 = (int) ((double) this.field1203[this.field1209] / 65536.0D * (double) arg0);
            if (this.field1212 > this.field1208) {
                this.field1210 = ((this.field1206[this.field1209] << 15) - this.field1211) / (this.field1212 - this.field1208);
            }
        }
        this.field1211 += this.field1210;
        this.field1208++;
        return this.field1211 - this.field1210 >> 15;
    }
}
