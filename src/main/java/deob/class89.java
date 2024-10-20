package deob;

@ObfuscatedName("cm")
public class class89 implements class86 {

    @ObfuscatedName("cm.p")
    public class77[] field1511;

    @ObfuscatedName("cm.y")
    public class182 field1515 = new class182();

    @ObfuscatedName("cm.d")
    public int field1514;

    @ObfuscatedName("cm.c")
    public int field1519 = 0;

    @ObfuscatedName("cm.r")
    public double field1513 = 1.0D;

    @ObfuscatedName("cm.f")
    public int field1512 = 128;

    @ObfuscatedName("cm.z")
    public class151 field1516;

    public class89(class151 arg0, class151 arg1, int arg2, double arg3, int arg4) {
        this.field1516 = arg1;
        this.field1514 = arg2;
        this.field1519 = this.field1514;
        this.field1513 = arg3;
        this.field1512 = arg4;
        int[] var7 = arg0.method2756(0);
        int var8 = var7.length;
        this.field1511 = new class77[arg0.method2757(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class110 var10 = new class110(arg0.method2811(0, var7[var9]));
            this.field1511[var7[var9]] = new class77(var10);
        }
    }

    @ObfuscatedName("cm.e(D)V")
    public void method1880(double arg0) {
        this.field1513 = arg0;
        this.method1882();
    }

    @ObfuscatedName("cm.p(II)[I")
    public int[] method1865(int arg0) {
        class77 var2 = this.field1511[arg0];
        if (var2 != null) {
            if (var2.field1334 != null) {
                this.field1515.method3273(var2);
                var2.field1335 = true;
                return var2.field1334;
            }
            boolean var3 = var2.method1606(this.field1513, this.field1512, this.field1516);
            if (var3) {
                if (this.field1519 == 0) {
                    class77 var4 = (class77) this.field1515.method3259();
                    var4.method1607();
                } else {
                    this.field1519--;
                }
                this.field1515.method3273(var2);
                var2.field1335 = true;
                return var2.field1334;
            }
        }
        return null;
    }

    @ObfuscatedName("cm.y(II)I")
    public int method1870(int arg0) {
        return this.field1511[arg0] == null ? 0 : this.field1511[arg0].field1326;
    }

    @ObfuscatedName("cm.d(II)Z")
    public boolean method1863(int arg0) {
        return this.field1511[arg0].field1327;
    }

    @ObfuscatedName("cm.c(II)Z")
    public boolean method1864(int arg0) {
        return this.field1512 == 64;
    }

    @ObfuscatedName("cm.b(I)V")
    public void method1882() {
        for (int var1 = 0; var1 < this.field1511.length; var1++) {
            if (this.field1511[var1] != null) {
                this.field1511[var1].method1607();
            }
        }
        this.field1515 = new class182();
        this.field1519 = this.field1514;
    }

    @ObfuscatedName("cm.g(IB)V")
    public void method1883(int arg0) {
        for (int var2 = 0; var2 < this.field1511.length; var2++) {
            class77 var3 = this.field1511[var2];
            if (var3 != null && var3.field1322 != 0 && var3.field1335) {
                var3.method1613(arg0);
                var3.field1335 = false;
            }
        }
    }
}
