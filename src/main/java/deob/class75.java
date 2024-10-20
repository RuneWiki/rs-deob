package deob;

@ObfuscatedName("bo")
public class class75 implements class94 {

    @ObfuscatedName("bo.i")
    public class80[] field1205;

    @ObfuscatedName("bo.e")
    public class129 field1203 = new class129();

    @ObfuscatedName("bo.f")
    public int field1204;

    @ObfuscatedName("bo.k")
    public int field1211 = 0;

    @ObfuscatedName("bo.g")
    public double field1206 = 1.0D;

    @ObfuscatedName("bo.n")
    public int field1207 = 128;

    @ObfuscatedName("bo.a")
    public class183 field1208;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1208 = arg1;
        this.field1204 = arg2;
        this.field1211 = this.field1204;
        this.field1206 = arg3;
        this.field1207 = arg4;
        int[] var7 = arg0.method3092(0);
        int var8 = var7.length;
        this.field1205 = new class80[arg0.method3023(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class154 var10 = new class154(arg0.method3014(0, var7[var9]));
            this.field1205[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bo.i(D)V")
    public void method1336(double arg0) {
        this.field1206 = arg0;
        this.method1340();
    }

    @ObfuscatedName("bo.e(II)[I")
    public int[] method1337(int arg0) {
        class80 var2 = this.field1205[arg0];
        if (var2 != null) {
            if (var2.field1316 != null) {
                this.field1203.method2205(var2);
                var2.field1310 = true;
                return var2.field1316;
            }
            boolean var3 = var2.method1455(this.field1206, this.field1207, this.field1208);
            if (var3) {
                if (this.field1211 == 0) {
                    class80 var4 = (class80) this.field1203.method2222();
                    var4.method1452();
                } else {
                    this.field1211--;
                }
                this.field1203.method2205(var2);
                var2.field1310 = true;
                return var2.field1316;
            }
        }
        return null;
    }

    @ObfuscatedName("bo.f(IB)I")
    public int method1338(int arg0) {
        return this.field1205[arg0] == null ? 0 : this.field1205[arg0].field1306;
    }

    @ObfuscatedName("bo.k(II)Z")
    public boolean method1367(int arg0) {
        return this.field1205[arg0].field1309;
    }

    @ObfuscatedName("bo.a(II)Z")
    public boolean method1339(int arg0) {
        return this.field1207 == 64;
    }

    @ObfuscatedName("bo.q(I)V")
    public void method1340() {
        for (int var1 = 0; var1 < this.field1205.length; var1++) {
            if (this.field1205[var1] != null) {
                this.field1205[var1].method1452();
            }
        }
        this.field1203 = new class129();
        this.field1211 = this.field1204;
    }

    @ObfuscatedName("bo.w(IB)V")
    public void method1341(int arg0) {
        for (int var2 = 0; var2 < this.field1205.length; var2++) {
            class80 var3 = this.field1205[var2];
            if (var3 != null && var3.field1308 != 0 && var3.field1310) {
                var3.method1453(arg0);
                var3.field1310 = false;
            }
        }
    }
}
