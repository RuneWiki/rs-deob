package deob;

@ObfuscatedName("ct")
public class class91 extends class108 {

    @ObfuscatedName("ct.y")
    public class208 field1286 = new class208();

    @ObfuscatedName("ct.c")
    public class208 field1287 = new class208();

    @ObfuscatedName("ct.n")
    public int field1285 = 0;

    @ObfuscatedName("ct.u")
    public int field1284 = -1;

    @ObfuscatedName("ct.y(Ldt;)V")
    public final synchronized void method1923(class108 arg0) {
        this.field1286.method3774(arg0);
    }

    @ObfuscatedName("ct.c(Ldt;)V")
    public final synchronized void method1924(class108 arg0) {
        arg0.method3766();
    }

    @ObfuscatedName("ct.n()V")
    public void method1957() {
        if (this.field1285 <= 0) {
            return;
        }
        for (class103 var1 = (class103) this.field1287.method3799(); var1 != null; var1 = (class103) this.field1287.method3780()) {
            var1.field1392 -= this.field1285;
        }
        this.field1284 -= this.field1285;
        this.field1285 = 0;
    }

    @ObfuscatedName("ct.u(Lgp;Lce;)V")
    public void method1926(class207 arg0, class103 arg1) {
        while (this.field1287.field2474 != arg0 && ((class103) arg0).field1392 <= arg1.field1392) {
            arg0 = arg0.field2471;
        }
        class208.method3805(arg1, arg0);
        this.field1284 = ((class103) this.field1287.field2474.field2471).field1392;
    }

    @ObfuscatedName("ct.i(Lce;)V")
    public void method1927(class103 arg0) {
        arg0.method3766();
        arg0.method2104();
        class207 var2 = this.field1287.field2474.field2471;
        if (this.field1287.field2474 == var2) {
            this.field1284 = -1;
        } else {
            this.field1284 = ((class103) var2).field1392;
        }
    }

    @ObfuscatedName("ct.p()Ldt;")
    public class108 method1928() {
        return (class108) this.field1286.method3799();
    }

    @ObfuscatedName("ct.e()Ldt;")
    public class108 method1929() {
        return (class108) this.field1286.method3780();
    }

    @ObfuscatedName("ct.s()I")
    public int method1936() {
        return 0;
    }

    @ObfuscatedName("ct.v([III)V")
    public final synchronized void method1931(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1284 < 0) {
                this.method1940(arg0, arg1, arg2);
                return;
            }
            if (this.field1285 + arg2 < this.field1284) {
                this.field1285 += arg2;
                this.method1940(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1284 - this.field1285;
            this.method1940(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1285 += var4;
            this.method1957();
            class103 var5 = (class103) this.field1287.method3799();
            synchronized (var5) {
                int var7 = var5.method2101(this);
                if (var7 < 0) {
                    var5.field1392 = 0;
                    this.method1927(var5);
                } else {
                    var5.field1392 = var7;
                    this.method1926(var5.field2471, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ct.k([III)V")
    public void method1940(int[] arg0, int arg1, int arg2) {
        for (class108 var4 = (class108) this.field1286.method3799(); var4 != null; var4 = (class108) this.field1286.method3780()) {
            var4.method2271(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ct.o(I)V")
    public final synchronized void method1958(int arg0) {
        do {
            if (this.field1284 < 0) {
                this.method1934(arg0);
                return;
            }
            if (this.field1285 + arg0 < this.field1284) {
                this.field1285 += arg0;
                this.method1934(arg0);
                return;
            }
            int var2 = this.field1284 - this.field1285;
            this.method1934(var2);
            arg0 -= var2;
            this.field1285 += var2;
            this.method1957();
            class103 var3 = (class103) this.field1287.method3799();
            synchronized (var3) {
                int var5 = var3.method2101(this);
                if (var5 < 0) {
                    var3.field1392 = 0;
                    this.method1927(var3);
                } else {
                    var3.field1392 = var5;
                    this.method1926(var3.field2471, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ct.q(I)V")
    public void method1934(int arg0) {
        for (class108 var2 = (class108) this.field1286.method3799(); var2 != null; var2 = (class108) this.field1286.method3780()) {
            var2.method1958(arg0);
        }
    }
}
