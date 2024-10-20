package deob;

@ObfuscatedName("by")
public class class75 implements class94 {

    @ObfuscatedName("by.k")
    public class80[] field1203;

    @ObfuscatedName("by.y")
    public class129 field1201 = new class129();

    @ObfuscatedName("by.o")
    public int field1202;

    @ObfuscatedName("by.r")
    public int field1205 = 0;

    @ObfuscatedName("by.w")
    public double field1204 = 1.0D;

    @ObfuscatedName("by.j")
    public int field1208 = 128;

    @ObfuscatedName("by.q")
    public class183 field1206;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1206 = arg1;
        this.field1202 = arg2;
        this.field1205 = this.field1202;
        this.field1204 = arg3;
        this.field1208 = arg4;
        int[] var7 = arg0.method3074(0);
        int var8 = var7.length;
        this.field1203 = new class80[arg0.method3075(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class161 var10 = new class161(arg0.method3065(0, var7[var9]));
            this.field1203[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("by.k(D)V")
    public void method1354(double arg0) {
        this.field1204 = arg0;
        this.method1359();
    }

    @ObfuscatedName("by.y(II)[I")
    public int[] method1355(int arg0) {
        class80 var2 = this.field1203[arg0];
        if (var2 != null) {
            if (var2.field1314 != null) {
                this.field1201.method2221(var2);
                var2.field1309 = true;
                return var2.field1314;
            }
            boolean var3 = var2.method1470(this.field1204, this.field1208, this.field1206);
            if (var3) {
                if (this.field1205 == 0) {
                    class80 var4 = (class80) this.field1201.method2224();
                    var4.method1464();
                } else {
                    this.field1205--;
                }
                this.field1201.method2221(var2);
                var2.field1309 = true;
                return var2.field1314;
            }
        }
        return null;
    }

    @ObfuscatedName("by.o(II)I")
    public int method1356(int arg0) {
        return this.field1203[arg0] == null ? 0 : this.field1203[arg0].field1305;
    }

    @ObfuscatedName("by.r(II)Z")
    public boolean method1364(int arg0) {
        return this.field1203[arg0].field1307;
    }

    @ObfuscatedName("by.w(IB)Z")
    public boolean method1358(int arg0) {
        return this.field1208 == 64;
    }

    @ObfuscatedName("by.j(I)V")
    public void method1359() {
        for (int var1 = 0; var1 < this.field1203.length; var1++) {
            if (this.field1203[var1] != null) {
                this.field1203[var1].method1464();
            }
        }
        this.field1201 = new class129();
        this.field1205 = this.field1202;
    }

    @ObfuscatedName("by.c(IB)V")
    public void method1360(int arg0) {
        for (int var2 = 0; var2 < this.field1203.length; var2++) {
            class80 var3 = this.field1203[var2];
            if (var3 != null && var3.field1312 != 0 && var3.field1309) {
                var3.method1465(arg0);
                var3.field1309 = false;
            }
        }
    }
}
