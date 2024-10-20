package deob;

@ObfuscatedName("be")
public class class58 {

    @ObfuscatedName("be.o")
    public int field1198 = 2;

    @ObfuscatedName("be.e")
    public int[] field1192 = new int[2];

    @ObfuscatedName("be.u")
    public int[] field1193 = new int[2];

    @ObfuscatedName("be.b")
    public int field1194;

    @ObfuscatedName("be.p")
    public int field1201;

    @ObfuscatedName("be.s")
    public int field1196;

    @ObfuscatedName("be.y")
    public int field1200;

    @ObfuscatedName("be.t")
    public int field1197;

    @ObfuscatedName("be.w")
    public int field1195;

    @ObfuscatedName("be.h")
    public int field1199;

    @ObfuscatedName("be.d")
    public int field1191;

    public class58() {
        this.field1192[0] = 0;
        this.field1192[1] = 65535;
        this.field1193[0] = 0;
        this.field1193[1] = 65535;
    }

    @ObfuscatedName("be.o(Ldi;)V")
    public final void method1179(class119 arg0) {
        this.field1196 = arg0.method2427();
        this.field1194 = arg0.method2342();
        this.field1201 = arg0.method2342();
        this.method1167(arg0);
    }

    @ObfuscatedName("be.e(Ldi;)V")
    public final void method1167(class119 arg0) {
        this.field1198 = arg0.method2427();
        this.field1192 = new int[this.field1198];
        this.field1193 = new int[this.field1198];
        for (int var2 = 0; var2 < this.field1198; var2++) {
            this.field1192[var2] = arg0.method2339();
            this.field1193[var2] = arg0.method2339();
        }
    }

    @ObfuscatedName("be.u()V")
    public final void method1172() {
        this.field1197 = 0;
        this.field1195 = 0;
        this.field1199 = 0;
        this.field1191 = 0;
        this.field1200 = 0;
    }

    @ObfuscatedName("be.b(I)I")
    public final int method1165(int arg0) {
        if (this.field1200 >= this.field1197) {
            this.field1191 = this.field1193[this.field1195++] << 15;
            if (this.field1195 >= this.field1198) {
                this.field1195 = this.field1198 - 1;
            }
            this.field1197 = (int) ((double) this.field1192[this.field1195] / 65536.0D * (double) arg0);
            if (this.field1197 > this.field1200) {
                this.field1199 = ((this.field1193[this.field1195] << 15) - this.field1191) / (this.field1197 - this.field1200);
            }
        }
        this.field1191 += this.field1199;
        this.field1200++;
        return this.field1191 - this.field1199 >> 15;
    }
}
