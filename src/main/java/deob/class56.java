package deob;

@ObfuscatedName("bq")
public class class56 {

    @ObfuscatedName("bq.d")
    public int field1186 = 2;

    @ObfuscatedName("bq.g")
    public int[] field1192 = new int[2];

    @ObfuscatedName("bq.a")
    public int[] field1184 = new int[2];

    @ObfuscatedName("bq.t")
    public int field1187;

    @ObfuscatedName("bq.f")
    public int field1183;

    @ObfuscatedName("bq.c")
    public int field1185;

    @ObfuscatedName("bq.p")
    public int field1188;

    @ObfuscatedName("bq.s")
    public int field1189;

    @ObfuscatedName("bq.k")
    public int field1190;

    @ObfuscatedName("bq.m")
    public int field1191;

    @ObfuscatedName("bq.y")
    public int field1182;

    public class56() {
        this.field1192[0] = 0;
        this.field1192[1] = 65535;
        this.field1184[0] = 0;
        this.field1184[1] = 65535;
    }

    @ObfuscatedName("bq.d(Ldo;)V")
    public final void method1211(class127 arg0) {
        this.field1185 = arg0.method2509();
        this.field1187 = arg0.method2405();
        this.field1183 = arg0.method2405();
        this.method1212(arg0);
    }

    @ObfuscatedName("bq.g(Ldo;)V")
    public final void method1212(class127 arg0) {
        this.field1186 = arg0.method2509();
        this.field1192 = new int[this.field1186];
        this.field1184 = new int[this.field1186];
        for (int var2 = 0; var2 < this.field1186; var2++) {
            this.field1192[var2] = arg0.method2512();
            this.field1184[var2] = arg0.method2512();
        }
    }

    @ObfuscatedName("bq.a()V")
    public final void method1213() {
        this.field1188 = 0;
        this.field1189 = 0;
        this.field1190 = 0;
        this.field1191 = 0;
        this.field1182 = 0;
    }

    @ObfuscatedName("bq.t(I)I")
    public final int method1214(int arg0) {
        if (this.field1182 >= this.field1188) {
            this.field1191 = this.field1184[this.field1189++] << 15;
            if (this.field1189 >= this.field1186) {
                this.field1189 = this.field1186 - 1;
            }
            this.field1188 = (int) ((double) this.field1192[this.field1189] / 65536.0D * (double) arg0);
            if (this.field1188 > this.field1182) {
                this.field1190 = ((this.field1184[this.field1189] << 15) - this.field1191) / (this.field1188 - this.field1182);
            }
        }
        this.field1191 += this.field1190;
        this.field1182++;
        return this.field1191 - this.field1190 >> 15;
    }
}
