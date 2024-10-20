package deob;

@ObfuscatedName("ay")
public class class51 {

    @ObfuscatedName("ay.p")
    public int field1093 = 2;

    @ObfuscatedName("ay.g")
    public int[] field1091 = new int[2];

    @ObfuscatedName("ay.c")
    public int[] field1100 = new int[2];

    @ObfuscatedName("ay.n")
    public int field1092;

    @ObfuscatedName("ay.s")
    public int field1094;

    @ObfuscatedName("ay.r")
    public int field1095;

    @ObfuscatedName("ay.w")
    public int field1096;

    @ObfuscatedName("ay.u")
    public int field1097;

    @ObfuscatedName("ay.d")
    public int field1098;

    @ObfuscatedName("ay.h")
    public int field1099;

    @ObfuscatedName("ay.a")
    public int field1090;

    public class51() {
        this.field1091[0] = 0;
        this.field1091[1] = 65535;
        this.field1100[0] = 0;
        this.field1100[1] = 65535;
    }

    @ObfuscatedName("ay.p(Ldp;)V")
    public final void method1073(class107 arg0) {
        this.field1095 = arg0.method2173();
        this.field1092 = arg0.method2305();
        this.field1094 = arg0.method2305();
        this.method1080(arg0);
    }

    @ObfuscatedName("ay.g(Ldp;)V")
    public final void method1080(class107 arg0) {
        this.field1093 = arg0.method2173();
        this.field1091 = new int[this.field1093];
        this.field1100 = new int[this.field1093];
        for (int var2 = 0; var2 < this.field1093; var2++) {
            this.field1091[var2] = arg0.method2175();
            this.field1100[var2] = arg0.method2175();
        }
    }

    @ObfuscatedName("ay.x()V")
    public final void method1075() {
        this.field1096 = 0;
        this.field1097 = 0;
        this.field1098 = 0;
        this.field1099 = 0;
        this.field1090 = 0;
    }

    @ObfuscatedName("ay.c(I)I")
    public final int method1076(int arg0) {
        if (this.field1090 >= this.field1096) {
            this.field1099 = this.field1100[this.field1097++] << 15;
            if (this.field1097 >= this.field1093) {
                this.field1097 = this.field1093 - 1;
            }
            this.field1096 = (int) ((double) this.field1091[this.field1097] / 65536.0D * (double) arg0);
            if (this.field1096 > this.field1090) {
                this.field1098 = ((this.field1100[this.field1097] << 15) - this.field1099) / (this.field1096 - this.field1090);
            }
        }
        this.field1099 += this.field1098;
        this.field1090++;
        return this.field1099 - this.field1098 >> 15;
    }
}
