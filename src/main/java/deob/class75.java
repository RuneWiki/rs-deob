package deob;

@ObfuscatedName("bx")
public class class75 implements class94 {

    @ObfuscatedName("bx.n")
    public class80[] field1199;

    @ObfuscatedName("bx.d")
    public class129 field1191 = new class129();

    @ObfuscatedName("bx.m")
    public int field1192;

    @ObfuscatedName("bx.h")
    public int field1190 = 0;

    @ObfuscatedName("bx.w")
    public double field1194 = 1.0D;

    @ObfuscatedName("bx.r")
    public int field1195 = 128;

    @ObfuscatedName("bx.c")
    public class183 field1193;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1193 = arg1;
        this.field1192 = arg2;
        this.field1190 = this.field1192;
        this.field1194 = arg3;
        this.field1195 = arg4;
        int[] var7 = arg0.method3102(0);
        int var8 = var7.length;
        this.field1199 = new class80[arg0.method3103(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class161 var10 = new class161(arg0.method3093(0, var7[var9]));
            this.field1199[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bx.n(D)V")
    public void method1373(double arg0) {
        this.field1194 = arg0;
        this.method1375();
    }

    @ObfuscatedName("bx.d(IB)[I")
    public int[] method1372(int arg0) {
        class80 var2 = this.field1199[arg0];
        if (var2 != null) {
            if (var2.field1299 != null) {
                this.field1191.method2279(var2);
                var2.field1308 = true;
                return var2.field1299;
            }
            boolean var3 = var2.method1482(this.field1194, this.field1195, this.field1193);
            if (var3) {
                if (this.field1190 == 0) {
                    class80 var4 = (class80) this.field1191.method2282();
                    var4.method1483();
                } else {
                    this.field1190--;
                }
                this.field1191.method2279(var2);
                var2.field1308 = true;
                return var2.field1299;
            }
        }
        return null;
    }

    @ObfuscatedName("bx.m(II)I")
    public int method1377(int arg0) {
        return this.field1199[arg0] == null ? 0 : this.field1199[arg0].field1303;
    }

    @ObfuscatedName("bx.h(II)Z")
    public boolean method1370(int arg0) {
        return this.field1199[arg0].field1300;
    }

    @ObfuscatedName("bx.w(II)Z")
    public boolean method1374(int arg0) {
        return this.field1195 == 64;
    }

    @ObfuscatedName("bx.r(I)V")
    public void method1375() {
        for (int var1 = 0; var1 < this.field1199.length; var1++) {
            if (this.field1199[var1] != null) {
                this.field1199[var1].method1483();
            }
        }
        this.field1191 = new class129();
        this.field1190 = this.field1192;
    }

    @ObfuscatedName("bx.c(II)V")
    public void method1392(int arg0) {
        for (int var2 = 0; var2 < this.field1199.length; var2++) {
            class80 var3 = this.field1199[var2];
            if (var3 != null && var3.field1305 != 0 && var3.field1308) {
                var3.method1484(arg0);
                var3.field1308 = false;
            }
        }
    }
}
