package deob;

@ObfuscatedName("bk")
public class class75 implements class94 {

    @ObfuscatedName("bk.s")
    public class80[] field1203;

    @ObfuscatedName("bk.c")
    public class129 field1202 = new class129();

    @ObfuscatedName("bk.f")
    public int field1204;

    @ObfuscatedName("bk.h")
    public int field1209 = 0;

    @ObfuscatedName("bk.a")
    public double field1205 = 1.0D;

    @ObfuscatedName("bk.g")
    public int field1208 = 128;

    @ObfuscatedName("bk.k")
    public class183 field1207;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1207 = arg1;
        this.field1204 = arg2;
        this.field1209 = this.field1204;
        this.field1205 = arg3;
        this.field1208 = arg4;
        int[] var7 = arg0.method2995(0);
        int var8 = var7.length;
        this.field1203 = new class80[arg0.method2996(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class154 var10 = new class154(arg0.method2986(0, var7[var9]));
            this.field1203[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bk.s(D)V")
    public void method1325(double arg0) {
        this.field1205 = arg0;
        this.method1329();
    }

    @ObfuscatedName("bk.c(IB)[I")
    public int[] method1331(int arg0) {
        class80 var2 = this.field1203[arg0];
        if (var2 != null) {
            if (var2.field1319 != null) {
                this.field1202.method2183(var2);
                var2.field1318 = true;
                return var2.field1319;
            }
            boolean var3 = var2.method1432(this.field1205, this.field1208, this.field1207);
            if (var3) {
                if (this.field1209 == 0) {
                    class80 var4 = (class80) this.field1202.method2186();
                    var4.method1434();
                } else {
                    this.field1209--;
                }
                this.field1202.method2183(var2);
                var2.field1318 = true;
                return var2.field1319;
            }
        }
        return null;
    }

    @ObfuscatedName("bk.f(II)I")
    public int method1326(int arg0) {
        return this.field1203[arg0] == null ? 0 : this.field1203[arg0].field1309;
    }

    @ObfuscatedName("bk.g(IB)Z")
    public boolean method1327(int arg0) {
        return this.field1203[arg0].field1310;
    }

    @ObfuscatedName("bk.k(II)Z")
    public boolean method1332(int arg0) {
        return this.field1208 == 64;
    }

    @ObfuscatedName("bk.u(B)V")
    public void method1329() {
        for (int var1 = 0; var1 < this.field1203.length; var1++) {
            if (this.field1203[var1] != null) {
                this.field1203[var1].method1434();
            }
        }
        this.field1202 = new class129();
        this.field1209 = this.field1204;
    }

    @ObfuscatedName("bk.b(II)V")
    public void method1330(int arg0) {
        for (int var2 = 0; var2 < this.field1203.length; var2++) {
            class80 var3 = this.field1203[var2];
            if (var3 != null && var3.field1315 != 0 && var3.field1318) {
                var3.method1431(arg0);
                var3.field1318 = false;
            }
        }
    }
}
