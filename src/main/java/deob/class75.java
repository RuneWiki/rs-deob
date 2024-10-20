package deob;

@ObfuscatedName("bh")
public class class75 implements class94 {

    @ObfuscatedName("bh.p")
    public class80[] field1208;

    @ObfuscatedName("bh.g")
    public class129 field1199 = new class129();

    @ObfuscatedName("bh.x")
    public int field1203;

    @ObfuscatedName("bh.q")
    public int field1201 = 0;

    @ObfuscatedName("bh.d")
    public double field1209 = 1.0D;

    @ObfuscatedName("bh.k")
    public int field1202 = 128;

    @ObfuscatedName("bh.j")
    public class183 field1204;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1204 = arg1;
        this.field1203 = arg2;
        this.field1201 = this.field1203;
        this.field1209 = arg3;
        this.field1202 = arg4;
        int[] var7 = arg0.method3039(0);
        int var8 = var7.length;
        this.field1208 = new class80[arg0.method3068(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class154 var10 = new class154(arg0.method3044(0, var7[var9]));
            this.field1208[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bh.p(D)V")
    public void method1333(double arg0) {
        this.field1209 = arg0;
        this.method1336();
    }

    @ObfuscatedName("bh.g(II)[I")
    public int[] method1334(int arg0) {
        class80 var2 = this.field1208[arg0];
        if (var2 != null) {
            if (var2.field1308 != null) {
                this.field1199.method2233(var2);
                var2.field1314 = true;
                return var2.field1308;
            }
            boolean var3 = var2.method1443(this.field1209, this.field1202, this.field1204);
            if (var3) {
                if (this.field1201 == 0) {
                    class80 var4 = (class80) this.field1199.method2236();
                    var4.method1445();
                } else {
                    this.field1201--;
                }
                this.field1199.method2233(var2);
                var2.field1314 = true;
                return var2.field1308;
            }
        }
        return null;
    }

    @ObfuscatedName("bh.x(II)I")
    public int method1335(int arg0) {
        return this.field1208[arg0] == null ? 0 : this.field1208[arg0].field1305;
    }

    @ObfuscatedName("bh.q(IB)Z")
    public boolean method1355(int arg0) {
        return this.field1208[arg0].field1306;
    }

    @ObfuscatedName("bh.d(IB)Z")
    public boolean method1337(int arg0) {
        return this.field1202 == 64;
    }

    @ObfuscatedName("bh.k(B)V")
    public void method1336() {
        for (int var1 = 0; var1 < this.field1208.length; var1++) {
            if (this.field1208[var1] != null) {
                this.field1208[var1].method1445();
            }
        }
        this.field1199 = new class129();
        this.field1201 = this.field1203;
    }

    @ObfuscatedName("bh.j(II)V")
    public void method1339(int arg0) {
        for (int var2 = 0; var2 < this.field1208.length; var2++) {
            class80 var3 = this.field1208[var2];
            if (var3 != null && var3.field1311 != 0 && var3.field1314) {
                var3.method1446(arg0);
                var3.field1314 = false;
            }
        }
    }
}
