package deob;

@ObfuscatedName("by")
public class class59 {

    @ObfuscatedName("by.f")
    public int field1093 = 2;

    @ObfuscatedName("by.i")
    public int[] field1087 = new int[2];

    @ObfuscatedName("by.u")
    public int[] field1091 = new int[2];

    @ObfuscatedName("by.h")
    public int field1089;

    @ObfuscatedName("by.r")
    public int field1090;

    @ObfuscatedName("by.o")
    public int field1088;

    @ObfuscatedName("by.l")
    public int field1092;

    @ObfuscatedName("by.n")
    public int field1086;

    @ObfuscatedName("by.m")
    public int field1094;

    @ObfuscatedName("by.w")
    public int field1095;

    @ObfuscatedName("by.j")
    public int field1096;

    public class59() {
        this.field1087[0] = 0;
        this.field1087[1] = 65535;
        this.field1091[0] = 0;
        this.field1091[1] = 65535;
    }

    @ObfuscatedName("by.f(Leo;)V")
    public final void method1116(class154 arg0) {
        this.field1088 = arg0.method2666();
        this.field1089 = arg0.method2695();
        this.field1090 = arg0.method2695();
        this.method1122(arg0);
    }

    @ObfuscatedName("by.i(Leo;)V")
    public final void method1122(class154 arg0) {
        this.field1093 = arg0.method2666();
        this.field1087 = new int[this.field1093];
        this.field1091 = new int[this.field1093];
        for (int var2 = 0; var2 < this.field1093; var2++) {
            this.field1087[var2] = arg0.method2668();
            this.field1091[var2] = arg0.method2668();
        }
    }

    @ObfuscatedName("by.u()V")
    public final void method1118() {
        this.field1092 = 0;
        this.field1086 = 0;
        this.field1094 = 0;
        this.field1095 = 0;
        this.field1096 = 0;
    }

    @ObfuscatedName("by.r(I)I")
    public final int method1119(int arg0) {
        if (this.field1096 >= this.field1092) {
            this.field1095 = this.field1091[this.field1086++] << 15;
            if (this.field1086 >= this.field1093) {
                this.field1086 = this.field1093 - 1;
            }
            this.field1092 = (int) ((double) this.field1087[this.field1086] / 65536.0D * (double) arg0);
            if (this.field1092 > this.field1096) {
                this.field1094 = ((this.field1091[this.field1086] << 15) - this.field1095) / (this.field1092 - this.field1096);
            }
        }
        this.field1095 += this.field1094;
        this.field1096++;
        return this.field1095 - this.field1094 >> 15;
    }
}
