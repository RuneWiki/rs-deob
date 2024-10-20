package deob;

@ObfuscatedName("ca")
public class class99 extends class116 {

    @ObfuscatedName("ca.z")
    public class262 field1321 = new class262();

    @ObfuscatedName("ca.n")
    public class262 field1319 = new class262();

    @ObfuscatedName("ca.v")
    public int field1320 = 0;

    @ObfuscatedName("ca.u")
    public int field1318 = -1;

    @ObfuscatedName("ca.z(Ldc;)V")
    public final synchronized void method2070(class116 arg0) {
        this.field1321.method4434(arg0);
    }

    @ObfuscatedName("ca.n(Ldc;)V")
    public final synchronized void method2071(class116 arg0) {
        arg0.method3249();
    }

    @ObfuscatedName("ca.v()V")
    public void method2072() {
        if (this.field1320 <= 0) {
            return;
        }
        for (class111 var1 = (class111) this.field1319.method4431(); var1 != null; var1 = (class111) this.field1319.method4454()) {
            var1.field1422 -= this.field1320;
        }
        this.field1318 -= this.field1320;
        this.field1320 = 0;
    }

    @ObfuscatedName("ca.u(Lfx;Lde;)V")
    public void method2095(class181 arg0, class111 arg1) {
        while (this.field1319.field3525 != arg0 && ((class111) arg0).field1422 <= arg1.field1422) {
            arg0 = arg0.field2093;
        }
        class262.method4458(arg1, arg0);
        this.field1318 = ((class111) this.field1319.field3525.field2093).field1422;
    }

    @ObfuscatedName("ca.r(Lde;)V")
    public void method2073(class111 arg0) {
        arg0.method3249();
        arg0.method2260();
        class181 var2 = this.field1319.field3525.field2093;
        if (this.field1319.field3525 == var2) {
            this.field1318 = -1;
        } else {
            this.field1318 = ((class111) var2).field1422;
        }
    }

    @ObfuscatedName("ca.p()Ldc;")
    public class116 method2075() {
        return (class116) this.field1321.method4431();
    }

    @ObfuscatedName("ca.q()Ldc;")
    public class116 method2076() {
        return (class116) this.field1321.method4454();
    }

    @ObfuscatedName("ca.m()I")
    public int method2074() {
        return 0;
    }

    @ObfuscatedName("ca.y([III)V")
    public final synchronized void method2078(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1318 < 0) {
                this.method2079(arg0, arg1, arg2);
                return;
            }
            if (this.field1320 + arg2 < this.field1318) {
                this.field1320 += arg2;
                this.method2079(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1318 - this.field1320;
            this.method2079(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1320 += var4;
            this.method2072();
            class111 var5 = (class111) this.field1319.method4431();
            synchronized (var5) {
                int var7 = var5.method2263(this);
                if (var7 < 0) {
                    var5.field1422 = 0;
                    this.method2073(var5);
                } else {
                    var5.field1422 = var7;
                    this.method2095(var5.field2093, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ca.i([III)V")
    public void method2079(int[] arg0, int arg1, int arg2) {
        for (class116 var4 = (class116) this.field1321.method4431(); var4 != null; var4 = (class116) this.field1321.method4454()) {
            var4.method2447(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ca.c(I)V")
    public final synchronized void method2101(int arg0) {
        do {
            if (this.field1318 < 0) {
                this.method2081(arg0);
                return;
            }
            if (this.field1320 + arg0 < this.field1318) {
                this.field1320 += arg0;
                this.method2081(arg0);
                return;
            }
            int var2 = this.field1318 - this.field1320;
            this.method2081(var2);
            arg0 -= var2;
            this.field1320 += var2;
            this.method2072();
            class111 var3 = (class111) this.field1319.method4431();
            synchronized (var3) {
                int var5 = var3.method2263(this);
                if (var5 < 0) {
                    var3.field1422 = 0;
                    this.method2073(var3);
                } else {
                    var3.field1422 = var5;
                    this.method2095(var3.field2093, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ca.b(I)V")
    public void method2081(int arg0) {
        for (class116 var2 = (class116) this.field1321.method4431(); var2 != null; var2 = (class116) this.field1321.method4454()) {
            var2.method2101(arg0);
        }
    }
}
