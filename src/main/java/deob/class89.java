package deob;

@ObfuscatedName("cp")
public class class89 extends class106 {

    @ObfuscatedName("cp.m")
    public class206 field1256 = new class206();

    @ObfuscatedName("cp.q")
    public class206 field1257 = new class206();

    @ObfuscatedName("cp.b")
    public int field1258 = 0;

    @ObfuscatedName("cp.f")
    public int field1259 = -1;

    @ObfuscatedName("cp.w(Ldu;)V")
    public final synchronized void method1903(class106 arg0) {
        this.field1256.method3791(arg0);
    }

    @ObfuscatedName("cp.m(Ldu;)V")
    public final synchronized void method1904(class106 arg0) {
        arg0.method3782();
    }

    @ObfuscatedName("cp.q()V")
    public void method1932() {
        if (this.field1258 <= 0) {
            return;
        }
        for (class101 var1 = (class101) this.field1257.method3797(); var1 != null; var1 = (class101) this.field1257.method3788()) {
            var1.field1365 -= this.field1258;
        }
        this.field1259 -= this.field1258;
        this.field1258 = 0;
    }

    @ObfuscatedName("cp.x(Lgl;Lcr;)V")
    public void method1906(class205 arg0, class101 arg1) {
        while (this.field1257.field2452 != arg0 && ((class101) arg0).field1365 <= arg1.field1365) {
            arg0 = arg0.field2448;
        }
        class206.method3816(arg1, arg0);
        this.field1259 = ((class101) this.field1257.field2452.field2448).field1365;
    }

    @ObfuscatedName("cp.j(Lcr;)V")
    public void method1907(class101 arg0) {
        arg0.method3782();
        arg0.method2119();
        class205 var2 = this.field1257.field2452.field2448;
        if (this.field1257.field2452 == var2) {
            this.field1259 = -1;
        } else {
            this.field1259 = ((class101) var2).field1365;
        }
    }

    @ObfuscatedName("cp.a()Ldu;")
    public class106 method1908() {
        return (class106) this.field1256.method3797();
    }

    @ObfuscatedName("cp.l()Ldu;")
    public class106 method1909() {
        return (class106) this.field1256.method3788();
    }

    @ObfuscatedName("cp.d()I")
    public int method1910() {
        return 0;
    }

    @ObfuscatedName("cp.s([III)V")
    public final synchronized void method1945(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1259 < 0) {
                this.method1911(arg0, arg1, arg2);
                return;
            }
            if (this.field1258 + arg2 < this.field1259) {
                this.field1258 += arg2;
                this.method1911(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1259 - this.field1258;
            this.method1911(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1258 += var4;
            this.method1932();
            class101 var5 = (class101) this.field1257.method3797();
            synchronized (var5) {
                int var7 = var5.method2126(this);
                if (var7 < 0) {
                    var5.field1365 = 0;
                    this.method1907(var5);
                } else {
                    var5.field1365 = var7;
                    this.method1906(var5.field2448, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cp.p([III)V")
    public void method1911(int[] arg0, int arg1, int arg2) {
        for (class106 var4 = (class106) this.field1256.method3797(); var4 != null; var4 = (class106) this.field1256.method3788()) {
            var4.method2293(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cp.g(I)V")
    public final synchronized void method1917(int arg0) {
        do {
            if (this.field1259 < 0) {
                this.method1913(arg0);
                return;
            }
            if (this.field1258 + arg0 < this.field1259) {
                this.field1258 += arg0;
                this.method1913(arg0);
                return;
            }
            int var2 = this.field1259 - this.field1258;
            this.method1913(var2);
            arg0 -= var2;
            this.field1258 += var2;
            this.method1932();
            class101 var3 = (class101) this.field1257.method3797();
            synchronized (var3) {
                int var5 = var3.method2126(this);
                if (var5 < 0) {
                    var3.field1365 = 0;
                    this.method1907(var3);
                } else {
                    var3.field1365 = var5;
                    this.method1906(var3.field2448, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cp.y(I)V")
    public void method1913(int arg0) {
        for (class106 var2 = (class106) this.field1256.method3797(); var2 != null; var2 = (class106) this.field1256.method3788()) {
            var2.method1917(arg0);
        }
    }
}
