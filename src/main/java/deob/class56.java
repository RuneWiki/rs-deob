package deob;

@ObfuscatedName("bn")
public class class56 {

    @ObfuscatedName("bn.a")
    public int field1202 = 2;

    @ObfuscatedName("bn.e")
    public int[] field1199 = new int[2];

    @ObfuscatedName("bn.r")
    public int[] field1200 = new int[2];

    @ObfuscatedName("bn.p")
    public int field1201;

    @ObfuscatedName("bn.n")
    public int field1207;

    @ObfuscatedName("bn.o")
    public int field1203;

    @ObfuscatedName("bn.l")
    public int field1198;

    @ObfuscatedName("bn.t")
    public int field1204;

    @ObfuscatedName("bn.q")
    public int field1205;

    @ObfuscatedName("bn.c")
    public int field1206;

    @ObfuscatedName("bn.z")
    public int field1208;

    public class56() {
        this.field1199[0] = 0;
        this.field1199[1] = 65535;
        this.field1200[0] = 0;
        this.field1200[1] = 65535;
    }

    @ObfuscatedName("bn.a(Ldy;)V")
    public final void method1241(class127 arg0) {
        this.field1203 = arg0.method2411();
        this.field1201 = arg0.method2416();
        this.field1207 = arg0.method2416();
        this.method1230(arg0);
    }

    @ObfuscatedName("bn.x(Ldy;)V")
    public final void method1230(class127 arg0) {
        this.field1202 = arg0.method2411();
        this.field1199 = new int[this.field1202];
        this.field1200 = new int[this.field1202];
        for (int var2 = 0; var2 < this.field1202; var2++) {
            this.field1199[var2] = arg0.method2413();
            this.field1200[var2] = arg0.method2413();
        }
    }

    @ObfuscatedName("bn.e()V")
    public final void method1231() {
        this.field1198 = 0;
        this.field1204 = 0;
        this.field1205 = 0;
        this.field1206 = 0;
        this.field1208 = 0;
    }

    @ObfuscatedName("bn.r(I)I")
    public final int method1232(int arg0) {
        if (this.field1208 >= this.field1198) {
            this.field1206 = this.field1200[this.field1204++] << 15;
            if (this.field1204 >= this.field1202) {
                this.field1204 = this.field1202 - 1;
            }
            this.field1198 = (int) ((double) this.field1199[this.field1204] / 65536.0D * (double) arg0);
            if (this.field1198 > this.field1208) {
                this.field1205 = ((this.field1200[this.field1204] << 15) - this.field1206) / (this.field1198 - this.field1208);
            }
        }
        this.field1206 += this.field1205;
        this.field1208++;
        return this.field1206 - this.field1205 >> 15;
    }
}
