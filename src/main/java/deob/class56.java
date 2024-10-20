package deob;

@ObfuscatedName("bn")
public class class56 {

    @ObfuscatedName("bn.q")
    public int field1181 = 2;

    @ObfuscatedName("bn.c")
    public int[] field1177 = new int[2];

    @ObfuscatedName("bn.p")
    public int[] field1185 = new int[2];

    @ObfuscatedName("bn.z")
    public int field1178;

    @ObfuscatedName("bn.m")
    public int field1180;

    @ObfuscatedName("bn.k")
    public int field1179;

    @ObfuscatedName("bn.v")
    public int field1183;

    @ObfuscatedName("bn.y")
    public int field1186;

    @ObfuscatedName("bn.d")
    public int field1176;

    @ObfuscatedName("bn.l")
    public int field1184;

    @ObfuscatedName("bn.h")
    public int field1182;

    public class56() {
        this.field1177[0] = 0;
        this.field1177[1] = 65535;
        this.field1185[0] = 0;
        this.field1185[1] = 65535;
    }

    @ObfuscatedName("bn.q(Ldo;)V")
    public final void method1259(class127 arg0) {
        this.field1179 = arg0.method2534();
        this.field1178 = arg0.method2430();
        this.field1180 = arg0.method2430();
        this.method1260(arg0);
    }

    @ObfuscatedName("bn.c(Ldo;)V")
    public final void method1260(class127 arg0) {
        this.field1181 = arg0.method2534();
        this.field1177 = new int[this.field1181];
        this.field1185 = new int[this.field1181];
        for (int var2 = 0; var2 < this.field1181; var2++) {
            this.field1177[var2] = arg0.method2427();
            this.field1185[var2] = arg0.method2427();
        }
    }

    @ObfuscatedName("bn.p()V")
    public final void method1261() {
        this.field1183 = 0;
        this.field1176 = 0;
        this.field1184 = 0;
        this.field1182 = 0;
        this.field1186 = 0;
    }

    @ObfuscatedName("bn.z(I)I")
    public final int method1263(int arg0) {
        if (this.field1186 >= this.field1183) {
            this.field1182 = this.field1185[this.field1176++] << 15;
            if (this.field1176 >= this.field1181) {
                this.field1176 = this.field1181 - 1;
            }
            this.field1183 = (int) ((double) this.field1177[this.field1176] / 65536.0D * (double) arg0);
            if (this.field1183 > this.field1186) {
                this.field1184 = ((this.field1185[this.field1176] << 15) - this.field1182) / (this.field1183 - this.field1186);
            }
        }
        this.field1182 += this.field1184;
        this.field1186++;
        return this.field1182 - this.field1184 >> 15;
    }
}
