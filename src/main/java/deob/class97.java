package deob;

@ObfuscatedName("ct")
public class class97 extends class114 {

    @ObfuscatedName("ct.m")
    public class273 field1299 = new class273();

    @ObfuscatedName("ct.f")
    public class273 field1300 = new class273();

    @ObfuscatedName("ct.q")
    public int field1301 = 0;

    @ObfuscatedName("ct.o")
    public int field1302 = -1;

    @ObfuscatedName("ct.m(Ldc;)V")
    public final synchronized void method2095(class114 arg0) {
        this.field1299.method4889(arg0);
    }

    @ObfuscatedName("ct.f(Ldc;)V")
    public final synchronized void method2074(class114 arg0) {
        arg0.method3306();
    }

    @ObfuscatedName("ct.q()V")
    public void method2082() {
        if (this.field1301 <= 0) {
            return;
        }
        for (class109 var1 = (class109) this.field1300.method4856(); var1 != null; var1 = (class109) this.field1300.method4858()) {
            var1.field1405 -= this.field1301;
        }
        this.field1302 -= this.field1301;
        this.field1301 = 0;
    }

    @ObfuscatedName("ct.w(Lgw;Ldf;)V")
    public void method2076(class186 arg0, class109 arg1) {
        while (this.field1300.field3605 != arg0 && ((class109) arg0).field1405 <= arg1.field1405) {
            arg0 = arg0.field2140;
        }
        class273.method4853(arg1, arg0);
        this.field1302 = ((class109) this.field1300.field3605.field2140).field1405;
    }

    @ObfuscatedName("ct.o(Ldf;)V")
    public void method2077(class109 arg0) {
        arg0.method3306();
        arg0.method2253();
        class186 var2 = this.field1300.field3605.field2140;
        if (this.field1300.field3605 == var2) {
            this.field1302 = -1;
        } else {
            this.field1302 = ((class109) var2).field1405;
        }
    }

    @ObfuscatedName("ct.u()Ldc;")
    public class114 method2078() {
        return (class114) this.field1299.method4856();
    }

    @ObfuscatedName("ct.g()Ldc;")
    public class114 method2104() {
        return (class114) this.field1299.method4858();
    }

    @ObfuscatedName("ct.l()I")
    public int method2080() {
        return 0;
    }

    @ObfuscatedName("ct.e([III)V")
    public final synchronized void method2081(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1302 < 0) {
                this.method2084(arg0, arg1, arg2);
                return;
            }
            if (this.field1301 + arg2 < this.field1302) {
                this.field1301 += arg2;
                this.method2084(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1302 - this.field1301;
            this.method2084(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1301 += var4;
            this.method2082();
            class109 var5 = (class109) this.field1300.method4856();
            synchronized (var5) {
                int var7 = var5.method2259(this);
                if (var7 < 0) {
                    var5.field1405 = 0;
                    this.method2077(var5);
                } else {
                    var5.field1405 = var7;
                    this.method2076(var5.field2140, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ct.x([III)V")
    public void method2084(int[] arg0, int arg1, int arg2) {
        for (class114 var4 = (class114) this.field1299.method4856(); var4 != null; var4 = (class114) this.field1299.method4858()) {
            var4.method2424(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ct.d(I)V")
    public final synchronized void method2083(int arg0) {
        do {
            if (this.field1302 < 0) {
                this.method2096(arg0);
                return;
            }
            if (this.field1301 + arg0 < this.field1302) {
                this.field1301 += arg0;
                this.method2096(arg0);
                return;
            }
            int var2 = this.field1302 - this.field1301;
            this.method2096(var2);
            arg0 -= var2;
            this.field1301 += var2;
            this.method2082();
            class109 var3 = (class109) this.field1300.method4856();
            synchronized (var3) {
                int var5 = var3.method2259(this);
                if (var5 < 0) {
                    var3.field1405 = 0;
                    this.method2077(var3);
                } else {
                    var3.field1405 = var5;
                    this.method2076(var3.field2140, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ct.a(I)V")
    public void method2096(int arg0) {
        for (class114 var2 = (class114) this.field1299.method4856(); var2 != null; var2 = (class114) this.field1299.method4858()) {
            var2.method2083(arg0);
        }
    }
}
