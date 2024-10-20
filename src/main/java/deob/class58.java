package deob;

@ObfuscatedName("bc")
public class class58 {

    @ObfuscatedName("bc.k")
    public int field1178 = 2;

    @ObfuscatedName("bc.h")
    public int[] field1183 = new int[2];

    @ObfuscatedName("bc.o")
    public int[] field1185 = new int[2];

    @ObfuscatedName("bc.z")
    public int field1180;

    @ObfuscatedName("bc.c")
    public int field1181;

    @ObfuscatedName("bc.d")
    public int field1182;

    @ObfuscatedName("bc.l")
    public int field1179;

    @ObfuscatedName("bc.b")
    public int field1177;

    @ObfuscatedName("bc.j")
    public int field1184;

    @ObfuscatedName("bc.f")
    public int field1186;

    @ObfuscatedName("bc.i")
    public int field1187;

    public class58() {
        this.field1183[0] = 0;
        this.field1183[1] = 65535;
        this.field1185[0] = 0;
        this.field1185[1] = 65535;
    }

    @ObfuscatedName("bc.k(Ldk;)V")
    public final void method1166(class119 arg0) {
        this.field1182 = arg0.method2330();
        this.field1180 = arg0.method2415();
        this.field1181 = arg0.method2415();
        this.method1167(arg0);
    }

    @ObfuscatedName("bc.h(Ldk;)V")
    public final void method1167(class119 arg0) {
        this.field1178 = arg0.method2330();
        this.field1183 = new int[this.field1178];
        this.field1185 = new int[this.field1178];
        for (int var2 = 0; var2 < this.field1178; var2++) {
            this.field1183[var2] = arg0.method2332();
            this.field1185[var2] = arg0.method2332();
        }
    }

    @ObfuscatedName("bc.o()V")
    public final void method1168() {
        this.field1179 = 0;
        this.field1177 = 0;
        this.field1184 = 0;
        this.field1186 = 0;
        this.field1187 = 0;
    }

    @ObfuscatedName("bc.z(I)I")
    public final int method1169(int arg0) {
        if (this.field1187 >= this.field1179) {
            this.field1186 = this.field1185[this.field1177++] << 15;
            if (this.field1177 >= this.field1178) {
                this.field1177 = this.field1178 - 1;
            }
            this.field1179 = (int) ((double) this.field1183[this.field1177] / 65536.0D * (double) arg0);
            if (this.field1179 > this.field1187) {
                this.field1184 = ((this.field1185[this.field1177] << 15) - this.field1186) / (this.field1179 - this.field1187);
            }
        }
        this.field1186 += this.field1184;
        this.field1187++;
        return this.field1186 - this.field1184 >> 15;
    }
}
