package deob;

@ObfuscatedName("an")
public class class51 {

    @ObfuscatedName("an.y")
    public int field1084;

    @ObfuscatedName("an.u")
    public int field1087 = 2;

    @ObfuscatedName("an.k")
    public int[] field1085 = new int[2];

    @ObfuscatedName("an.v")
    public int[] field1086 = new int[2];

    @ObfuscatedName("an.l")
    public int field1088;

    @ObfuscatedName("an.g")
    public int field1093;

    @ObfuscatedName("an.a")
    public int field1089;

    @ObfuscatedName("an.r")
    public int field1090;

    @ObfuscatedName("an.w")
    public int field1091;

    @ObfuscatedName("an.c")
    public int field1092;

    @ObfuscatedName("an.f")
    public int field1094;

    public class51() {
        this.field1085[0] = 0;
        this.field1085[1] = 65535;
        this.field1086[0] = 0;
        this.field1086[1] = 65535;
    }

    @ObfuscatedName("an.y(Ldo;)V")
    public final void method1012(class107 arg0) {
        this.field1089 = arg0.method2109();
        this.field1088 = arg0.method2114();
        this.field1093 = arg0.method2114();
        this.method1013(arg0);
    }

    @ObfuscatedName("an.u(Ldo;)V")
    public final void method1013(class107 arg0) {
        this.field1087 = arg0.method2109();
        this.field1085 = new int[this.field1087];
        this.field1086 = new int[this.field1087];
        for (int var2 = 0; var2 < this.field1087; var2++) {
            this.field1085[var2] = arg0.method2111();
            this.field1086[var2] = arg0.method2111();
        }
    }

    @ObfuscatedName("an.k()V")
    public final void method1011() {
        this.field1090 = 0;
        this.field1091 = 0;
        this.field1092 = 0;
        this.field1094 = 0;
        this.field1084 = 0;
    }

    @ObfuscatedName("an.v(I)I")
    public final int method1015(int arg0) {
        if (this.field1084 >= this.field1090) {
            this.field1094 = this.field1086[this.field1091++] << 15;
            if (this.field1091 >= this.field1087) {
                this.field1091 = this.field1087 - 1;
            }
            this.field1090 = (int) ((double) this.field1085[this.field1091] / 65536.0D * (double) arg0);
            if (this.field1090 > this.field1084) {
                this.field1092 = ((this.field1086[this.field1091] << 15) - this.field1094) / (this.field1090 - this.field1084);
            }
        }
        this.field1094 += this.field1092;
        this.field1084++;
        return this.field1094 - this.field1092 >> 15;
    }
}
