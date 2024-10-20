package deob;

@ObfuscatedName("ee")
public class class147 extends class129 {

    @ObfuscatedName("ee.z")
    public class104 field2223 = new class104();

    @ObfuscatedName("ee.g")
    public class104 field2221 = new class104();

    @ObfuscatedName("ee.q")
    public int field2222 = 0;

    @ObfuscatedName("ee.i")
    public int field2220 = -1;

    @ObfuscatedName("ee.p(Ldx;)V")
    public final synchronized void method2174(class129 arg0) {
        this.field2223.method1312(arg0);
    }

    @ObfuscatedName("ee.ad(Ldx;)V")
    public final synchronized void method2175(class129 arg0) {
        arg0.method1325();
    }

    @ObfuscatedName("ee.ac()V")
    public void method2176() {
        if (this.field2222 <= 0) {
            return;
        }
        for (class131 var1 = (class131) this.field2221.method1297(); var1 != null; var1 = (class131) this.field2221.method1299()) {
            var1.field1681 -= this.field2222;
        }
        this.field2220 -= this.field2222;
        this.field2222 = 0;
    }

    @ObfuscatedName("ee.aa(Ldg;Leb;)V")
    public void method2177(class106 arg0, class131 arg1) {
        while (this.field2221.field1500 != arg0 && ((class131) arg0).field1681 <= arg1.field1681) {
            arg0 = arg0.field1505;
        }
        class104.method1294(arg1, arg0);
        this.field2220 = ((class131) this.field2221.field1500.field1505).field1681;
    }

    @ObfuscatedName("ee.as(Leb;)V")
    public void method2178(class131 arg0) {
        arg0.method1325();
        arg0.method1569();
        class106 var2 = this.field2221.field1500.field1505;
        if (this.field2221.field1500 == var2) {
            this.field2220 = -1;
        } else {
            this.field2220 = ((class131) var2).field1681;
        }
    }

    @ObfuscatedName("ee.n()Ldx;")
    public class129 method1516() {
        return (class129) this.field2223.method1297();
    }

    @ObfuscatedName("ee.j()Ldx;")
    public class129 method1517() {
        return (class129) this.field2223.method1299();
    }

    @ObfuscatedName("ee.z()I")
    public int method1518() {
        return 0;
    }

    @ObfuscatedName("ee.q([III)V")
    public final synchronized void method1520(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2220 < 0) {
                this.method2181(arg0, arg1, arg2);
                return;
            }
            if (this.field2222 + arg2 < this.field2220) {
                this.field2222 += arg2;
                this.method2181(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2220 - this.field2222;
            this.method2181(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2222 += var4;
            this.method2176();
            class131 var5 = (class131) this.field2221.method1297();
            synchronized (var5) {
                int var7 = var5.method1565(this);
                if (var7 < 0) {
                    var5.field1681 = 0;
                    this.method2178(var5);
                } else {
                    var5.field1681 = var7;
                    this.method2177(var5.field1505, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ee.am([III)V")
    public void method2181(int[] arg0, int arg1, int arg2) {
        for (class129 var4 = (class129) this.field2223.method1297(); var4 != null; var4 = (class129) this.field2223.method1299()) {
            var4.method1529(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ee.i(I)V")
    public final synchronized void method1521(int arg0) {
        do {
            if (this.field2220 < 0) {
                this.method2180(arg0);
                return;
            }
            if (this.field2222 + arg0 < this.field2220) {
                this.field2222 += arg0;
                this.method2180(arg0);
                return;
            }
            int var2 = this.field2220 - this.field2222;
            this.method2180(var2);
            arg0 -= var2;
            this.field2222 += var2;
            this.method2176();
            class131 var3 = (class131) this.field2221.method1297();
            synchronized (var3) {
                int var5 = var3.method1565(this);
                if (var5 < 0) {
                    var3.field1681 = 0;
                    this.method2178(var3);
                } else {
                    var3.field1681 = var5;
                    this.method2177(var3.field1505, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ee.ap(I)V")
    public void method2180(int arg0) {
        for (class129 var2 = (class129) this.field2223.method1297(); var2 != null; var2 = (class129) this.field2223.method1299()) {
            var2.method1521(arg0);
        }
    }
}
