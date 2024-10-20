package deob;

@ObfuscatedName("bl")
public class class53 {

    @ObfuscatedName("bl.e")
    public int field1083 = 2;

    @ObfuscatedName("bl.a")
    public int[] field1079 = new int[2];

    @ObfuscatedName("bl.l")
    public int[] field1081 = new int[2];

    @ObfuscatedName("bl.c")
    public int field1088;

    @ObfuscatedName("bl.u")
    public int field1082;

    @ObfuscatedName("bl.w")
    public int field1084;

    @ObfuscatedName("bl.i")
    public int field1085;

    @ObfuscatedName("bl.r")
    public int field1086;

    @ObfuscatedName("bl.f")
    public int field1087;

    @ObfuscatedName("bl.g")
    public int field1080;

    @ObfuscatedName("bl.o")
    public int field1089;

    public class53() {
        this.field1079[0] = 0;
        this.field1079[1] = 65535;
        this.field1081[0] = 0;
        this.field1081[1] = 65535;
    }

    @ObfuscatedName("bl.e(Ldh;)V")
    public final void method1070(class111 arg0) {
        this.field1084 = arg0.method2176();
        this.field1088 = arg0.method2378();
        this.field1082 = arg0.method2378();
        this.method1075(arg0);
    }

    @ObfuscatedName("bl.a(Ldh;)V")
    public final void method1075(class111 arg0) {
        this.field1083 = arg0.method2176();
        this.field1079 = new int[this.field1083];
        this.field1081 = new int[this.field1083];
        for (int var2 = 0; var2 < this.field1083; var2++) {
            this.field1079[var2] = arg0.method2178();
            this.field1081[var2] = arg0.method2178();
        }
    }

    @ObfuscatedName("bl.l()V")
    public final void method1071() {
        this.field1085 = 0;
        this.field1086 = 0;
        this.field1087 = 0;
        this.field1080 = 0;
        this.field1089 = 0;
    }

    @ObfuscatedName("bl.c(I)I")
    public final int method1073(int arg0) {
        if (this.field1089 >= this.field1085) {
            this.field1080 = this.field1081[this.field1086++] << 15;
            if (this.field1086 >= this.field1083) {
                this.field1086 = this.field1083 - 1;
            }
            this.field1085 = (int) ((double) this.field1079[this.field1086] / 65536.0D * (double) arg0);
            if (this.field1085 > this.field1089) {
                this.field1087 = ((this.field1081[this.field1086] << 15) - this.field1080) / (this.field1085 - this.field1089);
            }
        }
        this.field1080 += this.field1087;
        this.field1089++;
        return this.field1080 - this.field1087 >> 15;
    }
}
