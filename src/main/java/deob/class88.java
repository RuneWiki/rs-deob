package deob;

@ObfuscatedName("ct")
public class class88 implements class85 {

    @ObfuscatedName("ct.t")
    public class76[] field1514;

    @ObfuscatedName("ct.o")
    public class177 field1509 = new class177();

    @ObfuscatedName("ct.i")
    public int field1515;

    @ObfuscatedName("ct.p")
    public int field1511 = 0;

    @ObfuscatedName("ct.c")
    public double field1512 = 1.0D;

    @ObfuscatedName("ct.y")
    public int field1513 = 128;

    @ObfuscatedName("ct.g")
    public class146 field1518;

    public class88(class146 arg0, class146 arg1, int arg2, double arg3, int arg4) {
        this.field1518 = arg1;
        this.field1515 = arg2;
        this.field1511 = this.field1515;
        this.field1512 = arg3;
        this.field1513 = arg4;
        int[] var7 = arg0.method2677(0);
        int var8 = var7.length;
        this.field1514 = new class76[arg0.method2740(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2668(0, var7[var9]));
            this.field1514[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("ct.z(D)V")
    public void method1862(double arg0) {
        this.field1512 = arg0;
        this.method1864();
    }

    @ObfuscatedName("ct.t(IB)[I")
    public int[] method1845(int arg0) {
        class76 var2 = this.field1514[arg0];
        if (var2 != null) {
            if (var2.field1337 != null) {
                this.field1509.method3167(var2);
                var2.field1338 = true;
                return var2.field1337;
            }
            boolean var3 = var2.method1573(this.field1512, this.field1513, this.field1518);
            if (var3) {
                if (this.field1511 == 0) {
                    class76 var4 = (class76) this.field1509.method3169();
                    var4.method1574();
                } else {
                    this.field1511--;
                }
                this.field1509.method3167(var2);
                var2.field1338 = true;
                return var2.field1337;
            }
        }
        return null;
    }

    @ObfuscatedName("ct.o(II)I")
    public int method1837(int arg0) {
        return this.field1514[arg0] == null ? 0 : this.field1514[arg0].field1329;
    }

    @ObfuscatedName("ct.i(II)Z")
    public boolean method1838(int arg0) {
        return this.field1514[arg0].field1334;
    }

    @ObfuscatedName("ct.p(II)Z")
    public boolean method1843(int arg0) {
        return this.field1513 == 64;
    }

    @ObfuscatedName("ct.v(I)V")
    public void method1864() {
        for (int var1 = 0; var1 < this.field1514.length; var1++) {
            if (this.field1514[var1] != null) {
                this.field1514[var1].method1574();
            }
        }
        this.field1509 = new class177();
        this.field1511 = this.field1515;
    }

    @ObfuscatedName("ct.k(II)V")
    public void method1863(int arg0) {
        for (int var2 = 0; var2 < this.field1514.length; var2++) {
            class76 var3 = this.field1514[var2];
            if (var3 != null && var3.field1335 != 0 && var3.field1338) {
                var3.method1572(arg0);
                var3.field1338 = false;
            }
        }
    }
}
