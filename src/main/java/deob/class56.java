package deob;

@ObfuscatedName("bq")
public class class56 {

    @ObfuscatedName("bq.g")
    public int field1190 = 2;

    @ObfuscatedName("bq.h")
    public int[] field1188 = new int[2];

    @ObfuscatedName("bq.s")
    public int[] field1198 = new int[2];

    @ObfuscatedName("bq.o")
    public int field1191;

    @ObfuscatedName("bq.p")
    public int field1192;

    @ObfuscatedName("bq.k")
    public int field1189;

    @ObfuscatedName("bq.r")
    public int field1194;

    @ObfuscatedName("bq.z")
    public int field1195;

    @ObfuscatedName("bq.n")
    public int field1196;

    @ObfuscatedName("bq.j")
    public int field1197;

    @ObfuscatedName("bq.b")
    public int field1193;

    public class56() {
        this.field1188[0] = 0;
        this.field1188[1] = 65535;
        this.field1198[0] = 0;
        this.field1198[1] = 65535;
    }

    @ObfuscatedName("bq.g(Ldw;)V")
    public final void method1260(class127 arg0) {
        this.field1189 = arg0.method2499();
        this.field1191 = arg0.method2548();
        this.field1192 = arg0.method2548();
        this.method1261(arg0);
    }

    @ObfuscatedName("bq.h(Ldw;)V")
    public final void method1261(class127 arg0) {
        this.field1190 = arg0.method2499();
        this.field1188 = new int[this.field1190];
        this.field1198 = new int[this.field1190];
        for (int var2 = 0; var2 < this.field1190; var2++) {
            this.field1188[var2] = arg0.method2501();
            this.field1198[var2] = arg0.method2501();
        }
    }

    @ObfuscatedName("bq.s()V")
    public final void method1272() {
        this.field1194 = 0;
        this.field1195 = 0;
        this.field1196 = 0;
        this.field1197 = 0;
        this.field1193 = 0;
    }

    @ObfuscatedName("bq.o(I)I")
    public final int method1263(int arg0) {
        if (this.field1193 >= this.field1194) {
            this.field1197 = this.field1198[this.field1195++] << 15;
            if (this.field1195 >= this.field1190) {
                this.field1195 = this.field1190 - 1;
            }
            this.field1194 = (int) ((double) this.field1188[this.field1195] / 65536.0D * (double) arg0);
            if (this.field1194 > this.field1193) {
                this.field1196 = ((this.field1198[this.field1195] << 15) - this.field1197) / (this.field1194 - this.field1193);
            }
        }
        this.field1197 += this.field1196;
        this.field1193++;
        return this.field1197 - this.field1196 >> 15;
    }
}
