package deob;

@ObfuscatedName("bn")
public class class75 implements class94 {

    @ObfuscatedName("bn.d")
    public class80[] field1183;

    @ObfuscatedName("bn.c")
    public class150 field1190 = new class150();

    @ObfuscatedName("bn.n")
    public int field1182;

    @ObfuscatedName("bn.q")
    public int field1185 = 0;

    @ObfuscatedName("bn.t")
    public double field1186 = 1.0D;

    @ObfuscatedName("bn.p")
    public int field1187 = 128;

    @ObfuscatedName("bn.u")
    public class185 field1188;

    public class75(class185 arg0, class185 arg1, int arg2, double arg3, int arg4) {
        this.field1188 = arg1;
        this.field1182 = arg2;
        this.field1185 = this.field1182;
        this.field1186 = arg3;
        this.field1187 = arg4;
        int[] var7 = arg0.method3096(0);
        int var8 = var7.length;
        this.field1183 = new class80[arg0.method3097(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class130 var10 = new class130(arg0.method3129(0, var7[var9]));
            this.field1183[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bn.d(D)V")
    public void method1361(double arg0) {
        this.field1186 = arg0;
        this.method1374();
    }

    @ObfuscatedName("bn.c(IB)[I")
    public int[] method1363(int arg0) {
        class80 var2 = this.field1183[arg0];
        if (var2 != null) {
            if (var2.field1303 != null) {
                this.field1190.method2681(var2);
                var2.field1301 = true;
                return var2.field1303;
            }
            boolean var3 = var2.method1470(this.field1186, this.field1187, this.field1188);
            if (var3) {
                if (this.field1185 == 0) {
                    class80 var4 = (class80) this.field1190.method2665();
                    var4.method1471();
                } else {
                    this.field1185--;
                }
                this.field1190.method2681(var2);
                var2.field1301 = true;
                return var2.field1303;
            }
        }
        return null;
    }

    @ObfuscatedName("bn.n(II)I")
    public int method1373(int arg0) {
        return this.field1183[arg0] == null ? 0 : this.field1183[arg0].field1295;
    }

    @ObfuscatedName("bn.q(II)Z")
    public boolean method1365(int arg0) {
        return this.field1183[arg0].field1304;
    }

    @ObfuscatedName("bn.t(II)Z")
    public boolean method1366(int arg0) {
        return this.field1187 == 64;
    }

    @ObfuscatedName("bn.p(S)V")
    public void method1374() {
        for (int var1 = 0; var1 < this.field1183.length; var1++) {
            if (this.field1183[var1] != null) {
                this.field1183[var1].method1471();
            }
        }
        this.field1190 = new class150();
        this.field1185 = this.field1182;
    }

    @ObfuscatedName("bn.u(II)V")
    public void method1368(int arg0) {
        for (int var2 = 0; var2 < this.field1183.length; var2++) {
            class80 var3 = this.field1183[var2];
            if (var3 != null && var3.field1291 != 0 && var3.field1301) {
                var3.method1474(arg0);
                var3.field1301 = false;
            }
        }
    }
}
