package deob;

@ObfuscatedName("bp")
public class class55 {

    @ObfuscatedName("bp.z")
    public int field1186 = 2;

    @ObfuscatedName("bp.h")
    public int[] field1183 = new int[2];

    @ObfuscatedName("bp.c")
    public int[] field1191 = new int[2];

    @ObfuscatedName("bp.p")
    public int field1185;

    @ObfuscatedName("bp.i")
    public int field1192;

    @ObfuscatedName("bp.v")
    public int field1187;

    @ObfuscatedName("bp.l")
    public int field1188;

    @ObfuscatedName("bp.m")
    public int field1189;

    @ObfuscatedName("bp.g")
    public int field1190;

    @ObfuscatedName("bp.t")
    public int field1182;

    @ObfuscatedName("bp.o")
    public int field1184;

    public class55() {
        this.field1183[0] = 0;
        this.field1183[1] = 65535;
        this.field1191[0] = 0;
        this.field1191[1] = 65535;
    }

    @ObfuscatedName("bp.z(Ldq;)V")
    public final void method1231(class126 arg0) {
        this.field1187 = arg0.method2450();
        this.field1185 = arg0.method2467();
        this.field1192 = arg0.method2467();
        this.method1232(arg0);
    }

    @ObfuscatedName("bp.h(Ldq;)V")
    public final void method1232(class126 arg0) {
        this.field1186 = arg0.method2450();
        this.field1183 = new int[this.field1186];
        this.field1191 = new int[this.field1186];
        for (int var2 = 0; var2 < this.field1186; var2++) {
            this.field1183[var2] = arg0.method2627();
            this.field1191[var2] = arg0.method2627();
        }
    }

    @ObfuscatedName("bp.c()V")
    public final void method1230() {
        this.field1188 = 0;
        this.field1189 = 0;
        this.field1190 = 0;
        this.field1182 = 0;
        this.field1184 = 0;
    }

    @ObfuscatedName("bp.p(I)I")
    public final int method1235(int arg0) {
        if (this.field1184 >= this.field1188) {
            this.field1182 = this.field1191[this.field1189++] << 15;
            if (this.field1189 >= this.field1186) {
                this.field1189 = this.field1186 - 1;
            }
            this.field1188 = (int) ((double) this.field1183[this.field1189] / 65536.0D * (double) arg0);
            if (this.field1188 > this.field1184) {
                this.field1190 = ((this.field1191[this.field1189] << 15) - this.field1182) / (this.field1188 - this.field1184);
            }
        }
        this.field1182 += this.field1190;
        this.field1184++;
        return this.field1182 - this.field1190 >> 15;
    }
}
