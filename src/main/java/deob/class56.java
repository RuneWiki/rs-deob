package deob;

@ObfuscatedName("bb")
public class class56 {

    @ObfuscatedName("bb.p")
    public int field1187 = 2;

    @ObfuscatedName("bb.l")
    public int[] field1185 = new int[2];

    @ObfuscatedName("bb.d")
    public int[] field1186 = new int[2];

    @ObfuscatedName("bb.o")
    public int field1192;

    @ObfuscatedName("bb.a")
    public int field1188;

    @ObfuscatedName("bb.w")
    public int field1189;

    @ObfuscatedName("bb.i")
    public int field1190;

    @ObfuscatedName("bb.y")
    public int field1194;

    @ObfuscatedName("bb.m")
    public int field1191;

    @ObfuscatedName("bb.u")
    public int field1184;

    @ObfuscatedName("bb.s")
    public int field1193;

    public class56() {
        this.field1185[0] = 0;
        this.field1185[1] = 65535;
        this.field1186[0] = 0;
        this.field1186[1] = 65535;
    }

    @ObfuscatedName("bb.p(Lds;)V")
    public final void method1287(class127 arg0) {
        this.field1189 = arg0.method2498();
        this.field1192 = arg0.method2489();
        this.field1188 = arg0.method2489();
        this.method1289(arg0);
    }

    @ObfuscatedName("bb.l(Lds;)V")
    public final void method1289(class127 arg0) {
        this.field1187 = arg0.method2498();
        this.field1185 = new int[this.field1187];
        this.field1186 = new int[this.field1187];
        for (int var2 = 0; var2 < this.field1187; var2++) {
            this.field1185[var2] = arg0.method2581();
            this.field1186[var2] = arg0.method2581();
        }
    }

    @ObfuscatedName("bb.d()V")
    public final void method1288() {
        this.field1190 = 0;
        this.field1191 = 0;
        this.field1184 = 0;
        this.field1193 = 0;
        this.field1194 = 0;
    }

    @ObfuscatedName("bb.x(I)I")
    public final int method1291(int arg0) {
        if (this.field1194 >= this.field1190) {
            this.field1193 = this.field1186[this.field1191++] << 15;
            if (this.field1191 >= this.field1187) {
                this.field1191 = this.field1187 - 1;
            }
            this.field1190 = (int) ((double) this.field1185[this.field1191] / 65536.0D * (double) arg0);
            if (this.field1190 > this.field1194) {
                this.field1184 = ((this.field1186[this.field1191] << 15) - this.field1193) / (this.field1190 - this.field1194);
            }
        }
        this.field1193 += this.field1184;
        this.field1194++;
        return this.field1193 - this.field1184 >> 15;
    }
}
