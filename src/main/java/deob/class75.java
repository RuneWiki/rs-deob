package deob;

@ObfuscatedName("bh")
public class class75 implements class94 {

    @ObfuscatedName("bh.x")
    public class80[] field1208;

    @ObfuscatedName("bh.j")
    public class129 field1211 = new class129();

    @ObfuscatedName("bh.c")
    public int field1209;

    @ObfuscatedName("bh.d")
    public int field1210 = 0;

    @ObfuscatedName("bh.w")
    public double field1207 = 1.0D;

    @ObfuscatedName("bh.h")
    public int field1213 = 128;

    @ObfuscatedName("bh.u")
    public class183 field1212;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1212 = arg1;
        this.field1209 = arg2;
        this.field1210 = this.field1209;
        this.field1207 = arg3;
        this.field1213 = arg4;
        int[] var7 = arg0.method3105(0);
        int var8 = var7.length;
        this.field1208 = new class80[arg0.method3108(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class154 var10 = new class154(arg0.method3121(0, var7[var9]));
            this.field1208[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bh.x(D)V")
    public void method1412(double arg0) {
        this.field1207 = arg0;
        this.method1414();
    }

    @ObfuscatedName("bh.j(IB)[I")
    public int[] method1410(int arg0) {
        class80 var2 = this.field1208[arg0];
        if (var2 != null) {
            if (var2.field1319 != null) {
                this.field1211.method2286(var2);
                var2.field1313 = true;
                return var2.field1319;
            }
            boolean var3 = var2.method1514(this.field1207, this.field1213, this.field1212);
            if (var3) {
                if (this.field1210 == 0) {
                    class80 var4 = (class80) this.field1211.method2311();
                    var4.method1516();
                } else {
                    this.field1210--;
                }
                this.field1211.method2286(var2);
                var2.field1313 = true;
                return var2.field1319;
            }
        }
        return null;
    }

    @ObfuscatedName("bh.c(IB)I")
    public int method1413(int arg0) {
        return this.field1208[arg0] == null ? 0 : this.field1208[arg0].field1321;
    }

    @ObfuscatedName("bh.d(II)Z")
    public boolean method1420(int arg0) {
        return this.field1208[arg0].field1326;
    }

    @ObfuscatedName("bh.w(II)Z")
    public boolean method1426(int arg0) {
        return this.field1213 == 64;
    }

    @ObfuscatedName("bh.u(I)V")
    public void method1414() {
        for (int var1 = 0; var1 < this.field1208.length; var1++) {
            if (this.field1208[var1] != null) {
                this.field1208[var1].method1516();
            }
        }
        this.field1211 = new class129();
        this.field1210 = this.field1209;
    }

    @ObfuscatedName("bh.y(IB)V")
    public void method1415(int arg0) {
        for (int var2 = 0; var2 < this.field1208.length; var2++) {
            class80 var3 = this.field1208[var2];
            if (var3 != null && var3.field1323 != 0 && var3.field1313) {
                var3.method1522(arg0);
                var3.field1313 = false;
            }
        }
    }
}
