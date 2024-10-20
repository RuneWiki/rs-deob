package deob;

@ObfuscatedName("bq")
public class class75 implements class94 {

    @ObfuscatedName("bq.u")
    public class80[] field1199;

    @ObfuscatedName("bq.x")
    public class129 field1192 = new class129();

    @ObfuscatedName("bq.i")
    public int field1193;

    @ObfuscatedName("bq.a")
    public int field1194 = 0;

    @ObfuscatedName("bq.f")
    public double field1195 = 1.0D;

    @ObfuscatedName("bq.c")
    public int field1196 = 128;

    @ObfuscatedName("bq.d")
    public class183 field1197;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1197 = arg1;
        this.field1193 = arg2;
        this.field1194 = this.field1193;
        this.field1195 = arg3;
        this.field1196 = arg4;
        int[] var7 = arg0.method3113(0);
        int var8 = var7.length;
        this.field1199 = new class80[arg0.method3122(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class154 var10 = new class154(arg0.method3071(0, var7[var9]));
            this.field1199[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bq.u(D)V")
    public void method1316(double arg0) {
        this.field1195 = arg0;
        this.method1321();
    }

    @ObfuscatedName("bq.x(II)[I")
    public int[] method1322(int arg0) {
        class80 var2 = this.field1199[arg0];
        if (var2 != null) {
            if (var2.field1314 != null) {
                this.field1192.method2238(var2);
                var2.field1315 = true;
                return var2.field1314;
            }
            boolean var3 = var2.method1434(this.field1195, this.field1196, this.field1197);
            if (var3) {
                if (this.field1194 == 0) {
                    class80 var4 = (class80) this.field1192.method2237();
                    var4.method1432();
                } else {
                    this.field1194--;
                }
                this.field1192.method2238(var2);
                var2.field1315 = true;
                return var2.field1314;
            }
        }
        return null;
    }

    @ObfuscatedName("bq.i(II)I")
    public int method1317(int arg0) {
        return this.field1199[arg0] == null ? 0 : this.field1199[arg0].field1302;
    }

    @ObfuscatedName("bq.a(IB)Z")
    public boolean method1315(int arg0) {
        return this.field1199[arg0].field1307;
    }

    @ObfuscatedName("bq.c(II)Z")
    public boolean method1320(int arg0) {
        return this.field1196 == 64;
    }

    @ObfuscatedName("bq.g(I)V")
    public void method1321() {
        for (int var1 = 0; var1 < this.field1199.length; var1++) {
            if (this.field1199[var1] != null) {
                this.field1199[var1].method1432();
            }
        }
        this.field1192 = new class129();
        this.field1194 = this.field1193;
    }

    @ObfuscatedName("bq.z(IB)V")
    public void method1332(int arg0) {
        for (int var2 = 0; var2 < this.field1199.length; var2++) {
            class80 var3 = this.field1199[var2];
            if (var3 != null && var3.field1312 != 0 && var3.field1315) {
                var3.method1433(arg0);
                var3.field1315 = false;
            }
        }
    }
}
