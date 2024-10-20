package deob;

@ObfuscatedName("bh")
public class class75 implements class94 {

    @ObfuscatedName("bh.x")
    public class80[] field1219;

    @ObfuscatedName("bh.n")
    public class129 field1214 = new class129();

    @ObfuscatedName("bh.g")
    public int field1220;

    @ObfuscatedName("bh.v")
    public int field1216 = 0;

    @ObfuscatedName("bh.y")
    public double field1222 = 1.0D;

    @ObfuscatedName("bh.p")
    public int field1218 = 128;

    @ObfuscatedName("bh.j")
    public class183 field1217;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1217 = arg1;
        this.field1220 = arg2;
        this.field1216 = this.field1220;
        this.field1222 = arg3;
        this.field1218 = arg4;
        int[] var7 = arg0.method3162(0);
        int var8 = var7.length;
        this.field1219 = new class80[arg0.method3150(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class154 var10 = new class154(arg0.method3153(0, var7[var9]));
            this.field1219[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bh.x(D)V")
    public void method1465(double arg0) {
        this.field1222 = arg0;
        this.method1461();
    }

    @ObfuscatedName("bh.n(II)[I")
    public int[] method1431(int arg0) {
        class80 var2 = this.field1219[arg0];
        if (var2 != null) {
            if (var2.field1325 != null) {
                this.field1214.method2349(var2);
                var2.field1316 = true;
                return var2.field1325;
            }
            boolean var3 = var2.method1550(this.field1222, this.field1218, this.field1217);
            if (var3) {
                if (this.field1216 == 0) {
                    class80 var4 = (class80) this.field1214.method2348();
                    var4.method1557();
                } else {
                    this.field1216--;
                }
                this.field1214.method2349(var2);
                var2.field1316 = true;
                return var2.field1325;
            }
        }
        return null;
    }

    @ObfuscatedName("bh.g(II)I")
    public int method1432(int arg0) {
        return this.field1219[arg0] == null ? 0 : this.field1219[arg0].field1313;
    }

    @ObfuscatedName("bh.v(IB)Z")
    public boolean method1442(int arg0) {
        return this.field1219[arg0].field1318;
    }

    @ObfuscatedName("bh.y(IB)Z")
    public boolean method1434(int arg0) {
        return this.field1218 == 64;
    }

    @ObfuscatedName("bh.p(I)V")
    public void method1461() {
        for (int var1 = 0; var1 < this.field1219.length; var1++) {
            if (this.field1219[var1] != null) {
                this.field1219[var1].method1557();
            }
        }
        this.field1214 = new class129();
        this.field1216 = this.field1220;
    }

    @ObfuscatedName("bh.j(II)V")
    public void method1436(int arg0) {
        for (int var2 = 0; var2 < this.field1219.length; var2++) {
            class80 var3 = this.field1219[var2];
            if (var3 != null && var3.field1314 != 0 && var3.field1316) {
                var3.method1552(arg0);
                var3.field1316 = false;
            }
        }
    }
}
