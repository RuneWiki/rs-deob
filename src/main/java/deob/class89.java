package deob;

@ObfuscatedName("ca")
public class class89 extends class106 {

    @ObfuscatedName("ca.z")
    public class206 field1230 = new class206();

    @ObfuscatedName("ca.s")
    public class206 field1231 = new class206();

    @ObfuscatedName("ca.l")
    public int field1232 = 0;

    @ObfuscatedName("ca.u")
    public int field1233 = -1;

    @ObfuscatedName("ca.z(Ldo;)V")
    public final synchronized void method1899(class106 arg0) {
        this.field1230.method3766(arg0);
    }

    @ObfuscatedName("ca.w(Ldo;)V")
    public final synchronized void method1876(class106 arg0) {
        arg0.method3756();
    }

    @ObfuscatedName("ca.s()V")
    public void method1877() {
        if (this.field1232 <= 0) {
            return;
        }
        for (class101 var1 = (class101) this.field1231.method3790(); var1 != null; var1 = (class101) this.field1231.method3771()) {
            var1.field1339 -= this.field1232;
        }
        this.field1233 -= this.field1232;
        this.field1232 = 0;
    }

    @ObfuscatedName("ca.l(Lga;Lcz;)V")
    public void method1878(class205 arg0, class101 arg1) {
        while (this.field1231.field2426 != arg0 && ((class101) arg0).field1339 <= arg1.field1339) {
            arg0 = arg0.field2423;
        }
        class206.method3767(arg1, arg0);
        this.field1233 = ((class101) this.field1231.field2426.field2423).field1339;
    }

    @ObfuscatedName("ca.u(Lcz;)V")
    public void method1875(class101 arg0) {
        arg0.method3756();
        arg0.method2075();
        class205 var2 = this.field1231.field2426.field2423;
        if (this.field1231.field2426 == var2) {
            this.field1233 = -1;
        } else {
            this.field1233 = ((class101) var2).field1339;
        }
    }

    @ObfuscatedName("ca.q()Ldo;")
    public class106 method1880() {
        return (class106) this.field1230.method3790();
    }

    @ObfuscatedName("ca.i()Ldo;")
    public class106 method1881() {
        return (class106) this.field1230.method3771();
    }

    @ObfuscatedName("ca.x()I")
    public int method1903() {
        return 0;
    }

    @ObfuscatedName("ca.e([III)V")
    public final synchronized void method1883(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1233 < 0) {
                this.method1909(arg0, arg1, arg2);
                return;
            }
            if (this.field1232 + arg2 < this.field1233) {
                this.field1232 += arg2;
                this.method1909(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1233 - this.field1232;
            this.method1909(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1232 += var4;
            this.method1877();
            class101 var5 = (class101) this.field1231.method3790();
            synchronized (var5) {
                int var7 = var5.method2076(this);
                if (var7 < 0) {
                    var5.field1339 = 0;
                    this.method1875(var5);
                } else {
                    var5.field1339 = var7;
                    this.method1878(var5.field2423, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ca.p([III)V")
    public void method1909(int[] arg0, int arg1, int arg2) {
        for (class106 var4 = (class106) this.field1230.method3790(); var4 != null; var4 = (class106) this.field1230.method3771()) {
            var4.method2258(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ca.b(I)V")
    public final synchronized void method1885(int arg0) {
        do {
            if (this.field1233 < 0) {
                this.method1892(arg0);
                return;
            }
            if (this.field1232 + arg0 < this.field1233) {
                this.field1232 += arg0;
                this.method1892(arg0);
                return;
            }
            int var2 = this.field1233 - this.field1232;
            this.method1892(var2);
            arg0 -= var2;
            this.field1232 += var2;
            this.method1877();
            class101 var3 = (class101) this.field1231.method3790();
            synchronized (var3) {
                int var5 = var3.method2076(this);
                if (var5 < 0) {
                    var3.field1339 = 0;
                    this.method1875(var3);
                } else {
                    var3.field1339 = var5;
                    this.method1878(var3.field2423, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ca.n(I)V")
    public void method1892(int arg0) {
        for (class106 var2 = (class106) this.field1230.method3790(); var2 != null; var2 = (class106) this.field1230.method3771()) {
            var2.method1885(arg0);
        }
    }
}
