package deob;

@ObfuscatedName("bu")
public class class59 {

    @ObfuscatedName("bu.q")
    public int field1090 = 2;

    @ObfuscatedName("bu.d")
    public int[] field1093 = new int[2];

    @ObfuscatedName("bu.h")
    public int[] field1086 = new int[2];

    @ObfuscatedName("bu.p")
    public int field1087;

    @ObfuscatedName("bu.j")
    public int field1088;

    @ObfuscatedName("bu.n")
    public int field1089;

    @ObfuscatedName("bu.r")
    public int field1092;

    @ObfuscatedName("bu.c")
    public int field1091;

    @ObfuscatedName("bu.i")
    public int field1094;

    @ObfuscatedName("bu.o")
    public int field1085;

    @ObfuscatedName("bu.m")
    public int field1084;

    public class59() {
        this.field1093[0] = 0;
        this.field1093[1] = 65535;
        this.field1086[0] = 0;
        this.field1086[1] = 65535;
    }

    @ObfuscatedName("bu.q(Lel;)V")
    public final void method1144(class154 arg0) {
        this.field1089 = arg0.method2666();
        this.field1087 = arg0.method2798();
        this.field1088 = arg0.method2798();
        this.method1155(arg0);
    }

    @ObfuscatedName("bu.d(Lel;)V")
    public final void method1155(class154 arg0) {
        this.field1090 = arg0.method2666();
        this.field1093 = new int[this.field1090];
        this.field1086 = new int[this.field1090];
        for (int var2 = 0; var2 < this.field1090; var2++) {
            this.field1093[var2] = arg0.method2668();
            this.field1086[var2] = arg0.method2668();
        }
    }

    @ObfuscatedName("bu.h()V")
    public final void method1146() {
        this.field1092 = 0;
        this.field1091 = 0;
        this.field1094 = 0;
        this.field1085 = 0;
        this.field1084 = 0;
    }

    @ObfuscatedName("bu.p(I)I")
    public final int method1147(int arg0) {
        if (this.field1084 >= this.field1092) {
            this.field1085 = this.field1086[this.field1091++] << 15;
            if (this.field1091 >= this.field1090) {
                this.field1091 = this.field1090 - 1;
            }
            this.field1092 = (int) ((double) this.field1093[this.field1091] / 65536.0D * (double) arg0);
            if (this.field1092 > this.field1084) {
                this.field1094 = ((this.field1086[this.field1091] << 15) - this.field1085) / (this.field1092 - this.field1084);
            }
        }
        this.field1085 += this.field1094;
        this.field1084++;
        return this.field1085 - this.field1094 >> 15;
    }
}
