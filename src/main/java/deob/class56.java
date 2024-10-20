package deob;

@ObfuscatedName("bg")
public class class56 {

    @ObfuscatedName("bg.j")
    public int field1184 = 2;

    @ObfuscatedName("bg.r")
    public int[] field1181 = new int[2];

    @ObfuscatedName("bg.v")
    public int[] field1182 = new int[2];

    @ObfuscatedName("bg.p")
    public int field1183;

    @ObfuscatedName("bg.e")
    public int field1180;

    @ObfuscatedName("bg.d")
    public int field1190;

    @ObfuscatedName("bg.y")
    public int field1185;

    @ObfuscatedName("bg.t")
    public int field1186;

    @ObfuscatedName("bg.i")
    public int field1187;

    @ObfuscatedName("bg.z")
    public int field1188;

    @ObfuscatedName("bg.o")
    public int field1189;

    public class56() {
        this.field1181[0] = 0;
        this.field1181[1] = 65535;
        this.field1182[0] = 0;
        this.field1182[1] = 65535;
    }

    @ObfuscatedName("bg.j(Ldn;)V")
    public final void method1249(class127 arg0) {
        this.field1190 = arg0.method2441();
        this.field1183 = arg0.method2446();
        this.field1180 = arg0.method2446();
        this.method1250(arg0);
    }

    @ObfuscatedName("bg.r(Ldn;)V")
    public final void method1250(class127 arg0) {
        this.field1184 = arg0.method2441();
        this.field1181 = new int[this.field1184];
        this.field1182 = new int[this.field1184];
        for (int var2 = 0; var2 < this.field1184; var2++) {
            this.field1181[var2] = arg0.method2609();
            this.field1182[var2] = arg0.method2609();
        }
    }

    @ObfuscatedName("bg.v()V")
    public final void method1240() {
        this.field1186 = 0;
        this.field1187 = 0;
        this.field1188 = 0;
        this.field1189 = 0;
        this.field1185 = 0;
    }

    @ObfuscatedName("bg.p(I)I")
    public final int method1239(int arg0) {
        if (this.field1185 >= this.field1186) {
            this.field1189 = this.field1182[this.field1187++] << 15;
            if (this.field1187 >= this.field1184) {
                this.field1187 = this.field1184 - 1;
            }
            this.field1186 = (int) ((double) this.field1181[this.field1187] / 65536.0D * (double) arg0);
            if (this.field1186 > this.field1185) {
                this.field1188 = ((this.field1182[this.field1187] << 15) - this.field1189) / (this.field1186 - this.field1185);
            }
        }
        this.field1189 += this.field1188;
        this.field1185++;
        return this.field1189 - this.field1188 >> 15;
    }
}
