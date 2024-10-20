package deob;

@ObfuscatedName("bj")
public class class56 {

    @ObfuscatedName("bj.i")
    public int field1198 = 2;

    @ObfuscatedName("bj.w")
    public int[] field1193 = new int[2];

    @ObfuscatedName("bj.f")
    public int[] field1192 = new int[2];

    @ObfuscatedName("bj.e")
    public int field1202;

    @ObfuscatedName("bj.t")
    public int field1196;

    @ObfuscatedName("bj.d")
    public int field1195;

    @ObfuscatedName("bj.p")
    public int field1197;

    @ObfuscatedName("bj.k")
    public int field1199;

    @ObfuscatedName("bj.r")
    public int field1200;

    @ObfuscatedName("bj.l")
    public int field1194;

    @ObfuscatedName("bj.a")
    public int field1201;

    public class56() {
        this.field1193[0] = 0;
        this.field1193[1] = 65535;
        this.field1192[0] = 0;
        this.field1192[1] = 65535;
    }

    @ObfuscatedName("bj.i(Ldz;)V")
    public final void method1230(class127 arg0) {
        this.field1195 = arg0.method2472();
        this.field1202 = arg0.method2457();
        this.field1196 = arg0.method2457();
        this.method1240(arg0);
    }

    @ObfuscatedName("bj.w(Ldz;)V")
    public final void method1240(class127 arg0) {
        this.field1198 = arg0.method2472();
        this.field1193 = new int[this.field1198];
        this.field1192 = new int[this.field1198];
        for (int var2 = 0; var2 < this.field1198; var2++) {
            this.field1193[var2] = arg0.method2615();
            this.field1192[var2] = arg0.method2615();
        }
    }

    @ObfuscatedName("bj.f()V")
    public final void method1232() {
        this.field1197 = 0;
        this.field1199 = 0;
        this.field1200 = 0;
        this.field1194 = 0;
        this.field1201 = 0;
    }

    @ObfuscatedName("bj.e(I)I")
    public final int method1229(int arg0) {
        if (this.field1201 >= this.field1197) {
            this.field1194 = this.field1192[this.field1199++] << 15;
            if (this.field1199 >= this.field1198) {
                this.field1199 = this.field1198 - 1;
            }
            this.field1197 = (int) ((double) this.field1193[this.field1199] / 65536.0D * (double) arg0);
            if (this.field1197 > this.field1201) {
                this.field1200 = ((this.field1192[this.field1199] << 15) - this.field1194) / (this.field1197 - this.field1201);
            }
        }
        this.field1194 += this.field1200;
        this.field1201++;
        return this.field1194 - this.field1200 >> 15;
    }
}
