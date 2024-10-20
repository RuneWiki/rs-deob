package deob;

@ObfuscatedName("bi")
public class class75 implements class94 {

    @ObfuscatedName("bi.q")
    public class80[] field1216;

    @ObfuscatedName("bi.d")
    public class129 field1214 = new class129();

    @ObfuscatedName("bi.h")
    public int field1215;

    @ObfuscatedName("bi.p")
    public int field1226 = 0;

    @ObfuscatedName("bi.j")
    public double field1222 = 1.0D;

    @ObfuscatedName("bi.n")
    public int field1218 = 128;

    @ObfuscatedName("bi.r")
    public class183 field1219;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1219 = arg1;
        this.field1215 = arg2;
        this.field1226 = this.field1215;
        this.field1222 = arg3;
        this.field1218 = arg4;
        int[] var7 = arg0.method3125(0);
        int var8 = var7.length;
        this.field1216 = new class80[arg0.method3126(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class154 var10 = new class154(arg0.method3133(0, var7[var9]));
            this.field1216[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bi.q(D)V")
    public void method1422(double arg0) {
        this.field1222 = arg0;
        this.method1426();
    }

    @ObfuscatedName("bi.d(II)[I")
    public int[] method1423(int arg0) {
        class80 var2 = this.field1216[arg0];
        if (var2 != null) {
            if (var2.field1334 != null) {
                this.field1214.method2315(var2);
                var2.field1322 = true;
                return var2.field1334;
            }
            boolean var3 = var2.method1535(this.field1222, this.field1218, this.field1219);
            if (var3) {
                if (this.field1226 == 0) {
                    class80 var4 = (class80) this.field1214.method2318();
                    var4.method1533();
                } else {
                    this.field1226--;
                }
                this.field1214.method2315(var2);
                var2.field1322 = true;
                return var2.field1334;
            }
        }
        return null;
    }

    @ObfuscatedName("bi.h(IB)I")
    public int method1444(int arg0) {
        return this.field1216[arg0] == null ? 0 : this.field1216[arg0].field1324;
    }

    @ObfuscatedName("bi.p(II)Z")
    public boolean method1436(int arg0) {
        return this.field1216[arg0].field1327;
    }

    @ObfuscatedName("bi.j(IS)Z")
    public boolean method1421(int arg0) {
        return this.field1218 == 64;
    }

    @ObfuscatedName("bi.n(B)V")
    public void method1426() {
        for (int var1 = 0; var1 < this.field1216.length; var1++) {
            if (this.field1216[var1] != null) {
                this.field1216[var1].method1533();
            }
        }
        this.field1214 = new class129();
        this.field1226 = this.field1215;
    }

    @ObfuscatedName("bi.c(IS)V")
    public void method1427(int arg0) {
        for (int var2 = 0; var2 < this.field1216.length; var2++) {
            class80 var3 = this.field1216[var2];
            if (var3 != null && var3.field1332 != 0 && var3.field1322) {
                var3.method1539(arg0);
                var3.field1322 = false;
            }
        }
    }
}
