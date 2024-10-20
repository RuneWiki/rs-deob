package deob;

@ObfuscatedName("bu")
public class class58 {

    @ObfuscatedName("bu.j")
    public int field1191 = 2;

    @ObfuscatedName("bu.m")
    public int[] field1187 = new int[2];

    @ObfuscatedName("bu.f")
    public int[] field1195 = new int[2];

    @ObfuscatedName("bu.l")
    public int field1188;

    @ObfuscatedName("bu.u")
    public int field1185;

    @ObfuscatedName("bu.a")
    public int field1190;

    @ObfuscatedName("bu.h")
    public int field1189;

    @ObfuscatedName("bu.i")
    public int field1192;

    @ObfuscatedName("bu.t")
    public int field1193;

    @ObfuscatedName("bu.k")
    public int field1194;

    @ObfuscatedName("bu.s")
    public int field1186;

    public class58() {
        this.field1187[0] = 0;
        this.field1187[1] = 65535;
        this.field1195[0] = 0;
        this.field1195[1] = 65535;
    }

    @ObfuscatedName("bu.j(Ldc;)V")
    public final void method1213(class119 arg0) {
        this.field1190 = arg0.method2372();
        this.field1188 = arg0.method2377();
        this.field1185 = arg0.method2377();
        this.method1212(arg0);
    }

    @ObfuscatedName("bu.m(Ldc;)V")
    public final void method1212(class119 arg0) {
        this.field1191 = arg0.method2372();
        this.field1187 = new int[this.field1191];
        this.field1195 = new int[this.field1191];
        for (int var2 = 0; var2 < this.field1191; var2++) {
            this.field1187[var2] = arg0.method2374();
            this.field1195[var2] = arg0.method2374();
        }
    }

    @ObfuscatedName("bu.f()V")
    public final void method1215() {
        this.field1189 = 0;
        this.field1192 = 0;
        this.field1193 = 0;
        this.field1194 = 0;
        this.field1186 = 0;
    }

    @ObfuscatedName("bu.l(I)I")
    public final int method1220(int arg0) {
        if (this.field1186 >= this.field1189) {
            this.field1194 = this.field1195[this.field1192++] << 15;
            if (this.field1192 >= this.field1191) {
                this.field1192 = this.field1191 - 1;
            }
            this.field1189 = (int) ((double) this.field1187[this.field1192] / 65536.0D * (double) arg0);
            if (this.field1189 > this.field1186) {
                this.field1193 = ((this.field1195[this.field1192] << 15) - this.field1194) / (this.field1189 - this.field1186);
            }
        }
        this.field1194 += this.field1193;
        this.field1186++;
        return this.field1194 - this.field1193 >> 15;
    }
}
