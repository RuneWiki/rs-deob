package deob;

@ObfuscatedName("cj")
public class class97 {

    @ObfuscatedName("cj.z")
    public int field1317 = 2;

    @ObfuscatedName("cj.w")
    public int[] field1324 = new int[2];

    @ObfuscatedName("cj.s")
    public int[] field1320 = new int[2];

    @ObfuscatedName("cj.l")
    public int field1315;

    @ObfuscatedName("cj.u")
    public int field1319;

    @ObfuscatedName("cj.q")
    public int field1318;

    @ObfuscatedName("cj.k")
    public int field1321;

    @ObfuscatedName("cj.i")
    public int field1322;

    @ObfuscatedName("cj.e")
    public int field1323;

    @ObfuscatedName("cj.p")
    public int field1316;

    @ObfuscatedName("cj.b")
    public int field1325;

    public class97() {
        this.field1324[0] = 0;
        this.field1324[1] = 65535;
        this.field1320[0] = 0;
        this.field1320[1] = 65535;
    }

    @ObfuscatedName("cj.z(Lgk;)V")
    public final void method2043(class183 arg0) {
        this.field1318 = arg0.method3247();
        this.field1315 = arg0.method3374();
        this.field1319 = arg0.method3374();
        this.method2041(arg0);
    }

    @ObfuscatedName("cj.w(Lgk;)V")
    public final void method2041(class183 arg0) {
        this.field1317 = arg0.method3247();
        this.field1324 = new int[this.field1317];
        this.field1320 = new int[this.field1317];
        for (int var2 = 0; var2 < this.field1317; var2++) {
            this.field1324[var2] = arg0.method3253();
            this.field1320[var2] = arg0.method3253();
        }
    }

    @ObfuscatedName("cj.s()V")
    public final void method2042() {
        this.field1321 = 0;
        this.field1322 = 0;
        this.field1323 = 0;
        this.field1316 = 0;
        this.field1325 = 0;
    }

    @ObfuscatedName("cj.l(I)I")
    public final int method2050(int arg0) {
        if (this.field1325 >= this.field1321) {
            this.field1316 = this.field1320[this.field1322++] << 15;
            if (this.field1322 >= this.field1317) {
                this.field1322 = this.field1317 - 1;
            }
            this.field1321 = (int) ((double) this.field1324[this.field1322] / 65536.0D * (double) arg0);
            if (this.field1321 > this.field1325) {
                this.field1323 = ((this.field1320[this.field1322] << 15) - this.field1316) / (this.field1321 - this.field1325);
            }
        }
        this.field1316 += this.field1323;
        this.field1325++;
        return this.field1316 - this.field1323 >> 15;
    }
}
