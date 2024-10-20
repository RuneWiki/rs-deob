package deob;

@ObfuscatedName("bx")
public class class75 implements class94 {

    @ObfuscatedName("bx.b")
    public class80[] field1219;

    @ObfuscatedName("bx.e")
    public class129 field1211 = new class129();

    @ObfuscatedName("bx.c")
    public int field1210;

    @ObfuscatedName("bx.l")
    public int field1213 = 0;

    @ObfuscatedName("bx.y")
    public double field1220 = 1.0D;

    @ObfuscatedName("bx.j")
    public int field1215 = 128;

    @ObfuscatedName("bx.g")
    public class183 field1216;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1216 = arg1;
        this.field1210 = arg2;
        this.field1213 = this.field1210;
        this.field1220 = arg3;
        this.field1215 = arg4;
        int[] var7 = arg0.method3135(0);
        int var8 = var7.length;
        this.field1219 = new class80[arg0.method3136(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class154 var10 = new class154(arg0.method3126(0, var7[var9]));
            this.field1219[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bx.b(D)V")
    public void method1377(double arg0) {
        this.field1220 = arg0;
        this.method1382();
    }

    @ObfuscatedName("bx.e(II)[I")
    public int[] method1378(int arg0) {
        class80 var2 = this.field1219[arg0];
        if (var2 != null) {
            if (var2.field1319 != null) {
                this.field1211.method2309(var2);
                var2.field1320 = true;
                return var2.field1319;
            }
            boolean var3 = var2.method1493(this.field1220, this.field1215, this.field1216);
            if (var3) {
                if (this.field1213 == 0) {
                    class80 var4 = (class80) this.field1211.method2327();
                    var4.method1487();
                } else {
                    this.field1213--;
                }
                this.field1211.method2309(var2);
                var2.field1320 = true;
                return var2.field1319;
            }
        }
        return null;
    }

    @ObfuscatedName("bx.c(II)I")
    public int method1379(int arg0) {
        return this.field1219[arg0] == null ? 0 : this.field1219[arg0].field1311;
    }

    @ObfuscatedName("bx.l(II)Z")
    public boolean method1380(int arg0) {
        return this.field1219[arg0].field1312;
    }

    @ObfuscatedName("bx.y(II)Z")
    public boolean method1383(int arg0) {
        return this.field1215 == 64;
    }

    @ObfuscatedName("bx.j(I)V")
    public void method1382() {
        for (int var1 = 0; var1 < this.field1219.length; var1++) {
            if (this.field1219[var1] != null) {
                this.field1219[var1].method1487();
            }
        }
        this.field1211 = new class129();
        this.field1213 = this.field1210;
    }

    @ObfuscatedName("bx.t(II)V")
    public void method1391(int arg0) {
        for (int var2 = 0; var2 < this.field1219.length; var2++) {
            class80 var3 = this.field1219[var2];
            if (var3 != null && var3.field1317 != 0 && var3.field1320) {
                var3.method1488(arg0);
                var3.field1320 = false;
            }
        }
    }
}
