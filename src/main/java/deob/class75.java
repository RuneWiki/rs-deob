package deob;

@ObfuscatedName("bs")
public class class75 implements class94 {

    @ObfuscatedName("bs.f")
    public class80[] field1230;

    @ObfuscatedName("bs.i")
    public class129 field1221 = new class129();

    @ObfuscatedName("bs.u")
    public int field1228;

    @ObfuscatedName("bs.h")
    public int field1223 = 0;

    @ObfuscatedName("bs.r")
    public double field1224 = 1.0D;

    @ObfuscatedName("bs.o")
    public int field1225 = 128;

    @ObfuscatedName("bs.l")
    public class183 field1231;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1231 = arg1;
        this.field1228 = arg2;
        this.field1223 = this.field1228;
        this.field1224 = arg3;
        this.field1225 = arg4;
        int[] var7 = arg0.method3126(0);
        int var8 = var7.length;
        this.field1230 = new class80[arg0.method3127(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class154 var10 = new class154(arg0.method3163(0, var7[var9]));
            this.field1230[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bs.f(D)V")
    public void method1375(double arg0) {
        this.field1224 = arg0;
        this.method1380();
    }

    @ObfuscatedName("bs.i(IB)[I")
    public int[] method1387(int arg0) {
        class80 var2 = this.field1230[arg0];
        if (var2 != null) {
            if (var2.field1336 != null) {
                this.field1221.method2297(var2);
                var2.field1337 = true;
                return var2.field1336;
            }
            boolean var3 = var2.method1484(this.field1224, this.field1225, this.field1231);
            if (var3) {
                if (this.field1223 == 0) {
                    class80 var4 = (class80) this.field1221.method2300();
                    var4.method1485();
                } else {
                    this.field1223--;
                }
                this.field1221.method2297(var2);
                var2.field1337 = true;
                return var2.field1336;
            }
        }
        return null;
    }

    @ObfuscatedName("bs.u(II)I")
    public int method1389(int arg0) {
        return this.field1230[arg0] == null ? 0 : this.field1230[arg0].field1328;
    }

    @ObfuscatedName("bs.r(II)Z")
    public boolean method1398(int arg0) {
        return this.field1230[arg0].field1329;
    }

    @ObfuscatedName("bs.o(IB)Z")
    public boolean method1379(int arg0) {
        return this.field1225 == 64;
    }

    @ObfuscatedName("bs.l(I)V")
    public void method1380() {
        for (int var1 = 0; var1 < this.field1230.length; var1++) {
            if (this.field1230[var1] != null) {
                this.field1230[var1].method1485();
            }
        }
        this.field1221 = new class129();
        this.field1223 = this.field1228;
    }

    @ObfuscatedName("bs.n(IB)V")
    public void method1381(int arg0) {
        for (int var2 = 0; var2 < this.field1230.length; var2++) {
            class80 var3 = this.field1230[var2];
            if (var3 != null && var3.field1325 != 0 && var3.field1337) {
                var3.method1491(arg0);
                var3.field1337 = false;
            }
        }
    }
}
