package deob;

@ObfuscatedName("bs")
public class class75 implements class94 {

    @ObfuscatedName("bs.b")
    public class80[] field1189;

    @ObfuscatedName("bs.l")
    public class129 field1191 = new class129();

    @ObfuscatedName("bs.i")
    public int field1186;

    @ObfuscatedName("bs.t")
    public int field1187 = 0;

    @ObfuscatedName("bs.k")
    public double field1188 = 1.0D;

    @ObfuscatedName("bs.h")
    public int field1184 = 128;

    @ObfuscatedName("bs.n")
    public class183 field1190;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1190 = arg1;
        this.field1186 = arg2;
        this.field1187 = this.field1186;
        this.field1188 = arg3;
        this.field1184 = arg4;
        int[] var7 = arg0.method3159(0);
        int var8 = var7.length;
        this.field1189 = new class80[arg0.method3200(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class154 var10 = new class154(arg0.method3226(0, var7[var9]));
            this.field1189[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bs.b(D)V")
    public void method1434(double arg0) {
        this.field1188 = arg0;
        this.method1418();
    }

    @ObfuscatedName("bs.l(IB)[I")
    public int[] method1414(int arg0) {
        class80 var2 = this.field1189[arg0];
        if (var2 != null) {
            if (var2.field1299 != null) {
                this.field1191.method2322(var2);
                var2.field1295 = true;
                return var2.field1299;
            }
            boolean var3 = var2.method1527(this.field1188, this.field1184, this.field1190);
            if (var3) {
                if (this.field1187 == 0) {
                    class80 var4 = (class80) this.field1191.method2323();
                    var4.method1526();
                } else {
                    this.field1187--;
                }
                this.field1191.method2322(var2);
                var2.field1295 = true;
                return var2.field1299;
            }
        }
        return null;
    }

    @ObfuscatedName("bs.i(II)I")
    public int method1413(int arg0) {
        return this.field1189[arg0] == null ? 0 : this.field1189[arg0].field1291;
    }

    @ObfuscatedName("bs.t(II)Z")
    public boolean method1416(int arg0) {
        return this.field1189[arg0].field1292;
    }

    @ObfuscatedName("bs.k(II)Z")
    public boolean method1417(int arg0) {
        return this.field1184 == 64;
    }

    @ObfuscatedName("bs.x(I)V")
    public void method1418() {
        for (int var1 = 0; var1 < this.field1189.length; var1++) {
            if (this.field1189[var1] != null) {
                this.field1189[var1].method1526();
            }
        }
        this.field1191 = new class129();
        this.field1187 = this.field1186;
    }

    @ObfuscatedName("bs.z(II)V")
    public void method1419(int arg0) {
        for (int var2 = 0; var2 < this.field1189.length; var2++) {
            class80 var3 = this.field1189[var2];
            if (var3 != null && var3.field1300 != 0 && var3.field1295) {
                var3.method1525(arg0);
                var3.field1295 = false;
            }
        }
    }
}
