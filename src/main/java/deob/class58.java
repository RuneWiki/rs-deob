package deob;

@ObfuscatedName("br")
public class class58 {

    @ObfuscatedName("br.l")
    public int field1186 = 2;

    @ObfuscatedName("br.e")
    public int[] field1190 = new int[2];

    @ObfuscatedName("br.q")
    public int[] field1184 = new int[2];

    @ObfuscatedName("br.o")
    public int field1182;

    @ObfuscatedName("br.g")
    public int field1183;

    @ObfuscatedName("br.m")
    public int field1187;

    @ObfuscatedName("br.b")
    public int field1188;

    @ObfuscatedName("br.p")
    public int field1189;

    @ObfuscatedName("br.t")
    public int field1185;

    @ObfuscatedName("br.w")
    public int field1191;

    @ObfuscatedName("br.k")
    public int field1192;

    public class58() {
        this.field1190[0] = 0;
        this.field1190[1] = 65535;
        this.field1184[0] = 0;
        this.field1184[1] = 65535;
    }

    @ObfuscatedName("br.l(Ldl;)V")
    public final void method1216(class119 arg0) {
        this.field1187 = arg0.method2388();
        this.field1182 = arg0.method2393();
        this.field1183 = arg0.method2393();
        this.method1218(arg0);
    }

    @ObfuscatedName("br.e(Ldl;)V")
    public final void method1218(class119 arg0) {
        this.field1186 = arg0.method2388();
        this.field1190 = new int[this.field1186];
        this.field1184 = new int[this.field1186];
        for (int var2 = 0; var2 < this.field1186; var2++) {
            this.field1190[var2] = arg0.method2440();
            this.field1184[var2] = arg0.method2440();
        }
    }

    @ObfuscatedName("br.q()V")
    public final void method1219() {
        this.field1188 = 0;
        this.field1189 = 0;
        this.field1185 = 0;
        this.field1191 = 0;
        this.field1192 = 0;
    }

    @ObfuscatedName("br.o(I)I")
    public final int method1223(int arg0) {
        if (this.field1192 >= this.field1188) {
            this.field1191 = this.field1184[this.field1189++] << 15;
            if (this.field1189 >= this.field1186) {
                this.field1189 = this.field1186 - 1;
            }
            this.field1188 = (int) ((double) this.field1190[this.field1189] / 65536.0D * (double) arg0);
            if (this.field1188 > this.field1192) {
                this.field1185 = ((this.field1184[this.field1189] << 15) - this.field1191) / (this.field1188 - this.field1192);
            }
        }
        this.field1191 += this.field1185;
        this.field1192++;
        return this.field1191 - this.field1185 >> 15;
    }
}
