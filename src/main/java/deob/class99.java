package deob;

@ObfuscatedName("cq")
public class class99 extends class116 {

    @ObfuscatedName("cq.s")
    public class262 field1317 = new class262();

    @ObfuscatedName("cq.j")
    public class262 field1318 = new class262();

    @ObfuscatedName("cq.i")
    public int field1316 = 0;

    @ObfuscatedName("cq.k")
    public int field1315 = -1;

    @ObfuscatedName("cq.s(Ldz;)V")
    public final synchronized void method2103(class116 arg0) {
        this.field1317.method4476(arg0);
    }

    @ObfuscatedName("cq.j(Ldz;)V")
    public final synchronized void method2109(class116 arg0) {
        arg0.method3304();
    }

    @ObfuscatedName("cq.i()V")
    public void method2090() {
        if (this.field1316 <= 0) {
            return;
        }
        for (class111 var1 = (class111) this.field1318.method4480(); var1 != null; var1 = (class111) this.field1318.method4491()) {
            var1.field1430 -= this.field1316;
        }
        this.field1315 -= this.field1316;
        this.field1316 = 0;
    }

    @ObfuscatedName("cq.k(Lfb;Ldj;)V")
    public void method2098(class181 arg0, class111 arg1) {
        while (this.field1318.field3514 != arg0 && ((class111) arg0).field1430 <= arg1.field1430) {
            arg0 = arg0.field2097;
        }
        class262.method4496(arg1, arg0);
        this.field1315 = ((class111) this.field1318.field3514.field2097).field1430;
    }

    @ObfuscatedName("cq.u(Ldj;)V")
    public void method2102(class111 arg0) {
        arg0.method3304();
        arg0.method2286();
        class181 var2 = this.field1318.field3514.field2097;
        if (this.field1318.field3514 == var2) {
            this.field1315 = -1;
        } else {
            this.field1315 = ((class111) var2).field1430;
        }
    }

    @ObfuscatedName("cq.n()Ldz;")
    public class116 method2093() {
        return (class116) this.field1317.method4480();
    }

    @ObfuscatedName("cq.t()Ldz;")
    public class116 method2094() {
        return (class116) this.field1317.method4491();
    }

    @ObfuscatedName("cq.q()I")
    public int method2095() {
        return 0;
    }

    @ObfuscatedName("cq.x([III)V")
    public final synchronized void method2096(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1315 < 0) {
                this.method2088(arg0, arg1, arg2);
                return;
            }
            if (this.field1316 + arg2 < this.field1315) {
                this.field1316 += arg2;
                this.method2088(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1315 - this.field1316;
            this.method2088(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1316 += var4;
            this.method2090();
            class111 var5 = (class111) this.field1318.method4480();
            synchronized (var5) {
                int var7 = var5.method2285(this);
                if (var7 < 0) {
                    var5.field1430 = 0;
                    this.method2102(var5);
                } else {
                    var5.field1430 = var7;
                    this.method2098(var5.field2097, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cq.d([III)V")
    public void method2088(int[] arg0, int arg1, int arg2) {
        for (class116 var4 = (class116) this.field1317.method4480(); var4 != null; var4 = (class116) this.field1317.method4491()) {
            var4.method2474(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cq.f(I)V")
    public final synchronized void method2106(int arg0) {
        do {
            if (this.field1315 < 0) {
                this.method2099(arg0);
                return;
            }
            if (this.field1316 + arg0 < this.field1315) {
                this.field1316 += arg0;
                this.method2099(arg0);
                return;
            }
            int var2 = this.field1315 - this.field1316;
            this.method2099(var2);
            arg0 -= var2;
            this.field1316 += var2;
            this.method2090();
            class111 var3 = (class111) this.field1318.method4480();
            synchronized (var3) {
                int var5 = var3.method2285(this);
                if (var5 < 0) {
                    var3.field1430 = 0;
                    this.method2102(var3);
                } else {
                    var3.field1430 = var5;
                    this.method2098(var3.field2097, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cq.c(I)V")
    public void method2099(int arg0) {
        for (class116 var2 = (class116) this.field1317.method4480(); var2 != null; var2 = (class116) this.field1317.method4491()) {
            var2.method2106(arg0);
        }
    }
}
