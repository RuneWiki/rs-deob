package deob;

@ObfuscatedName("bq")
public class class56 {

    @ObfuscatedName("bq.b")
    public int field1200 = 2;

    @ObfuscatedName("bq.c")
    public int[] field1201 = new int[2];

    @ObfuscatedName("bq.j")
    public int[] field1196 = new int[2];

    @ObfuscatedName("bq.i")
    public int field1197;

    @ObfuscatedName("bq.k")
    public int field1198;

    @ObfuscatedName("bq.q")
    public int field1195;

    @ObfuscatedName("bq.t")
    public int field1199;

    @ObfuscatedName("bq.v")
    public int field1194;

    @ObfuscatedName("bq.y")
    public int field1204;

    @ObfuscatedName("bq.w")
    public int field1202;

    @ObfuscatedName("bq.g")
    public int field1203;

    public class56() {
        this.field1201[0] = 0;
        this.field1201[1] = 65535;
        this.field1196[0] = 0;
        this.field1196[1] = 65535;
    }

    @ObfuscatedName("bq.b(Ldv;)V")
    public final void method1221(class127 arg0) {
        this.field1195 = arg0.method2416();
        this.field1197 = arg0.method2455();
        this.field1198 = arg0.method2455();
        this.method1222(arg0);
    }

    @ObfuscatedName("bq.c(Ldv;)V")
    public final void method1222(class127 arg0) {
        this.field1200 = arg0.method2416();
        this.field1201 = new int[this.field1200];
        this.field1196 = new int[this.field1200];
        for (int var2 = 0; var2 < this.field1200; var2++) {
            this.field1201[var2] = arg0.method2394();
            this.field1196[var2] = arg0.method2394();
        }
    }

    @ObfuscatedName("bq.j()V")
    public final void method1223() {
        this.field1199 = 0;
        this.field1194 = 0;
        this.field1202 = 0;
        this.field1203 = 0;
        this.field1204 = 0;
    }

    @ObfuscatedName("bq.i(I)I")
    public final int method1224(int arg0) {
        if (this.field1204 >= this.field1199) {
            this.field1203 = this.field1196[this.field1194++] << 15;
            if (this.field1194 >= this.field1200) {
                this.field1194 = this.field1200 - 1;
            }
            this.field1199 = (int) ((double) this.field1201[this.field1194] / 65536.0D * (double) arg0);
            if (this.field1199 > this.field1204) {
                this.field1202 = ((this.field1196[this.field1194] << 15) - this.field1203) / (this.field1199 - this.field1204);
            }
        }
        this.field1203 += this.field1202;
        this.field1204++;
        return this.field1203 - this.field1202 >> 15;
    }
}
