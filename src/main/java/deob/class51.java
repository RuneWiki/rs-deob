package deob;

@ObfuscatedName("ao")
public class class51 {

    @ObfuscatedName("ao.e")
    public int field1090 = 2;

    @ObfuscatedName("ao.p")
    public int[] field1091 = new int[2];

    @ObfuscatedName("ao.a")
    public int[] field1089 = new int[2];

    @ObfuscatedName("ao.g")
    public int field1092;

    @ObfuscatedName("ao.u")
    public int field1095;

    @ObfuscatedName("ao.k")
    public int field1094;

    @ObfuscatedName("ao.m")
    public int field1096;

    @ObfuscatedName("ao.t")
    public int field1093;

    @ObfuscatedName("ao.l")
    public int field1097;

    @ObfuscatedName("ao.f")
    public int field1098;

    @ObfuscatedName("ao.c")
    public int field1099;

    public class51() {
        this.field1091[0] = 0;
        this.field1091[1] = 65535;
        this.field1089[0] = 0;
        this.field1089[1] = 65535;
    }

    @ObfuscatedName("ao.e(Ldp;)V")
    public final void method1054(class107 arg0) {
        this.field1094 = arg0.method2125();
        this.field1092 = arg0.method2146();
        this.field1095 = arg0.method2146();
        this.method1055(arg0);
    }

    @ObfuscatedName("ao.p(Ldp;)V")
    public final void method1055(class107 arg0) {
        this.field1090 = arg0.method2125();
        this.field1091 = new int[this.field1090];
        this.field1089 = new int[this.field1090];
        for (int var2 = 0; var2 < this.field1090; var2++) {
            this.field1091[var2] = arg0.method2182();
            this.field1089[var2] = arg0.method2182();
        }
    }

    @ObfuscatedName("ao.a()V")
    public final void method1056() {
        this.field1096 = 0;
        this.field1093 = 0;
        this.field1097 = 0;
        this.field1098 = 0;
        this.field1099 = 0;
    }

    @ObfuscatedName("ao.g(I)I")
    public final int method1053(int arg0) {
        if (this.field1099 >= this.field1096) {
            this.field1098 = this.field1089[this.field1093++] << 15;
            if (this.field1093 >= this.field1090) {
                this.field1093 = this.field1090 - 1;
            }
            this.field1096 = (int) ((double) this.field1091[this.field1093] / 65536.0D * (double) arg0);
            if (this.field1096 > this.field1099) {
                this.field1097 = ((this.field1089[this.field1093] << 15) - this.field1098) / (this.field1096 - this.field1099);
            }
        }
        this.field1098 += this.field1097;
        this.field1099++;
        return this.field1098 - this.field1097 >> 15;
    }
}
