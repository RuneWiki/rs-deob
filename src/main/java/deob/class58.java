package deob;

@ObfuscatedName("bd")
public class class58 {

    @ObfuscatedName("bd.z")
    public int field1206 = 2;

    @ObfuscatedName("bd.q")
    public int[] field1199 = new int[2];

    @ObfuscatedName("bd.k")
    public int[] field1205 = new int[2];

    @ObfuscatedName("bd.f")
    public int field1201;

    @ObfuscatedName("bd.d")
    public int field1202;

    @ObfuscatedName("bd.l")
    public int field1203;

    @ObfuscatedName("bd.r")
    public int field1204;

    @ObfuscatedName("bd.g")
    public int field1200;

    @ObfuscatedName("bd.h")
    public int field1198;

    @ObfuscatedName("bd.n")
    public int field1207;

    @ObfuscatedName("bd.j")
    public int field1208;

    public class58() {
        this.field1199[0] = 0;
        this.field1199[1] = 65535;
        this.field1205[0] = 0;
        this.field1205[1] = 65535;
    }

    @ObfuscatedName("bd.z(Lda;)V")
    public final void method1163(class119 arg0) {
        this.field1203 = arg0.method2457();
        this.field1201 = arg0.method2306();
        this.field1202 = arg0.method2306();
        this.method1162(arg0);
    }

    @ObfuscatedName("bd.q(Lda;)V")
    public final void method1162(class119 arg0) {
        this.field1206 = arg0.method2457();
        this.field1199 = new int[this.field1206];
        this.field1205 = new int[this.field1206];
        for (int var2 = 0; var2 < this.field1206; var2++) {
            this.field1199[var2] = arg0.method2415();
            this.field1205[var2] = arg0.method2415();
        }
    }

    @ObfuscatedName("bd.k()V")
    public final void method1170() {
        this.field1204 = 0;
        this.field1200 = 0;
        this.field1198 = 0;
        this.field1207 = 0;
        this.field1208 = 0;
    }

    @ObfuscatedName("bd.f(I)I")
    public final int method1164(int arg0) {
        if (this.field1208 >= this.field1204) {
            this.field1207 = this.field1205[this.field1200++] << 15;
            if (this.field1200 >= this.field1206) {
                this.field1200 = this.field1206 - 1;
            }
            this.field1204 = (int) ((double) this.field1199[this.field1200] / 65536.0D * (double) arg0);
            if (this.field1204 > this.field1208) {
                this.field1198 = ((this.field1205[this.field1200] << 15) - this.field1207) / (this.field1204 - this.field1208);
            }
        }
        this.field1207 += this.field1198;
        this.field1208++;
        return this.field1207 - this.field1198 >> 15;
    }
}
