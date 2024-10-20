package deob;

@ObfuscatedName("cq")
public class class99 extends class116 {

    @ObfuscatedName("cq.c")
    public class262 field1307 = new class262();

    @ObfuscatedName("cq.x")
    public class262 field1308 = new class262();

    @ObfuscatedName("cq.t")
    public int field1309 = 0;

    @ObfuscatedName("cq.g")
    public int field1310 = -1;

    @ObfuscatedName("cq.c(Ldg;)V")
    public final synchronized void method2144(class116 arg0) {
        this.field1307.method4543(arg0);
    }

    @ObfuscatedName("cq.x(Ldg;)V")
    public final synchronized void method2114(class116 arg0) {
        arg0.method3326();
    }

    @ObfuscatedName("cq.t()V")
    public void method2141() {
        if (this.field1309 <= 0) {
            return;
        }
        for (class111 var1 = (class111) this.field1308.method4550(); var1 != null; var1 = (class111) this.field1308.method4573()) {
            var1.field1419 -= this.field1309;
        }
        this.field1310 -= this.field1309;
        this.field1309 = 0;
    }

    @ObfuscatedName("cq.g(Lfn;Ldp;)V")
    public void method2116(class181 arg0, class111 arg1) {
        while (this.field1308.field3509 != arg0 && ((class111) arg0).field1419 <= arg1.field1419) {
            arg0 = arg0.field2095;
        }
        class262.method4581(arg1, arg0);
        this.field1310 = ((class111) this.field1308.field3509.field2095).field1419;
    }

    @ObfuscatedName("cq.l(Ldp;)V")
    public void method2145(class111 arg0) {
        arg0.method3326();
        arg0.method2306();
        class181 var2 = this.field1308.field3509.field2095;
        if (this.field1308.field3509 == var2) {
            this.field1310 = -1;
        } else {
            this.field1310 = ((class111) var2).field1419;
        }
    }

    @ObfuscatedName("cq.u()Ldg;")
    public class116 method2118() {
        return (class116) this.field1307.method4550();
    }

    @ObfuscatedName("cq.j()Ldg;")
    public class116 method2119() {
        return (class116) this.field1307.method4573();
    }

    @ObfuscatedName("cq.v()I")
    public int method2120() {
        return 0;
    }

    @ObfuscatedName("cq.d([III)V")
    public final synchronized void method2121(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1310 < 0) {
                this.method2122(arg0, arg1, arg2);
                return;
            }
            if (this.field1309 + arg2 < this.field1310) {
                this.field1309 += arg2;
                this.method2122(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1310 - this.field1309;
            this.method2122(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1309 += var4;
            this.method2141();
            class111 var5 = (class111) this.field1308.method4550();
            synchronized (var5) {
                int var7 = var5.method2307(this);
                if (var7 < 0) {
                    var5.field1419 = 0;
                    this.method2145(var5);
                } else {
                    var5.field1419 = var7;
                    this.method2116(var5.field2095, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cq.z([III)V")
    public void method2122(int[] arg0, int arg1, int arg2) {
        for (class116 var4 = (class116) this.field1307.method4550(); var4 != null; var4 = (class116) this.field1307.method4573()) {
            var4.method2484(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cq.s(I)V")
    public final synchronized void method2139(int arg0) {
        do {
            if (this.field1310 < 0) {
                this.method2124(arg0);
                return;
            }
            if (this.field1309 + arg0 < this.field1310) {
                this.field1309 += arg0;
                this.method2124(arg0);
                return;
            }
            int var2 = this.field1310 - this.field1309;
            this.method2124(var2);
            arg0 -= var2;
            this.field1309 += var2;
            this.method2141();
            class111 var3 = (class111) this.field1308.method4550();
            synchronized (var3) {
                int var5 = var3.method2307(this);
                if (var5 < 0) {
                    var3.field1419 = 0;
                    this.method2145(var3);
                } else {
                    var3.field1419 = var5;
                    this.method2116(var3.field2095, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cq.p(I)V")
    public void method2124(int arg0) {
        for (class116 var2 = (class116) this.field1307.method4550(); var2 != null; var2 = (class116) this.field1307.method4573()) {
            var2.method2139(arg0);
        }
    }
}
