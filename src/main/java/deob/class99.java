package deob;

@ObfuscatedName("ca")
public class class99 extends class116 {

    @ObfuscatedName("ca.u")
    public class262 field1328 = new class262();

    @ObfuscatedName("ca.f")
    public class262 field1327 = new class262();

    @ObfuscatedName("ca.b")
    public int field1329 = 0;

    @ObfuscatedName("ca.g")
    public int field1330 = -1;

    @ObfuscatedName("ca.u(Ldt;)V")
    public final synchronized void method2113(class116 arg0) {
        this.field1328.method4564(arg0);
    }

    @ObfuscatedName("ca.f(Ldt;)V")
    public final synchronized void method2112(class116 arg0) {
        arg0.method3332();
    }

    @ObfuscatedName("ca.b()V")
    public void method2125() {
        if (this.field1329 <= 0) {
            return;
        }
        for (class111 var1 = (class111) this.field1327.method4568(); var1 != null; var1 = (class111) this.field1327.method4561()) {
            var1.field1441 -= this.field1329;
        }
        this.field1330 -= this.field1329;
        this.field1329 = 0;
    }

    @ObfuscatedName("ca.g(Lfb;Ldp;)V")
    public void method2123(class181 arg0, class111 arg1) {
        while (this.field1327.field3540 != arg0 && ((class111) arg0).field1441 <= arg1.field1441) {
            arg0 = arg0.field2127;
        }
        class262.method4565(arg1, arg0);
        this.field1330 = ((class111) this.field1327.field3540.field2127).field1441;
    }

    @ObfuscatedName("ca.z(Ldp;)V")
    public void method2115(class111 arg0) {
        arg0.method3332();
        arg0.method2321();
        class181 var2 = this.field1327.field3540.field2127;
        if (this.field1327.field3540 == var2) {
            this.field1330 = -1;
        } else {
            this.field1330 = ((class111) var2).field1441;
        }
    }

    @ObfuscatedName("ca.p()Ldt;")
    public class116 method2116() {
        return (class116) this.field1328.method4568();
    }

    @ObfuscatedName("ca.h()Ldt;")
    public class116 method2117() {
        return (class116) this.field1328.method4561();
    }

    @ObfuscatedName("ca.y()I")
    public int method2110() {
        return 0;
    }

    @ObfuscatedName("ca.w([III)V")
    public final synchronized void method2119(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1330 < 0) {
                this.method2129(arg0, arg1, arg2);
                return;
            }
            if (this.field1329 + arg2 < this.field1330) {
                this.field1329 += arg2;
                this.method2129(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1330 - this.field1329;
            this.method2129(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1329 += var4;
            this.method2125();
            class111 var5 = (class111) this.field1327.method4568();
            synchronized (var5) {
                int var7 = var5.method2319(this);
                if (var7 < 0) {
                    var5.field1441 = 0;
                    this.method2115(var5);
                } else {
                    var5.field1441 = var7;
                    this.method2123(var5.field2127, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ca.i([III)V")
    public void method2129(int[] arg0, int arg1, int arg2) {
        for (class116 var4 = (class116) this.field1328.method4568(); var4 != null; var4 = (class116) this.field1328.method4561()) {
            var4.method2496(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ca.k(I)V")
    public final synchronized void method2121(int arg0) {
        do {
            if (this.field1330 < 0) {
                this.method2111(arg0);
                return;
            }
            if (this.field1329 + arg0 < this.field1330) {
                this.field1329 += arg0;
                this.method2111(arg0);
                return;
            }
            int var2 = this.field1330 - this.field1329;
            this.method2111(var2);
            arg0 -= var2;
            this.field1329 += var2;
            this.method2125();
            class111 var3 = (class111) this.field1327.method4568();
            synchronized (var3) {
                int var5 = var3.method2319(this);
                if (var5 < 0) {
                    var3.field1441 = 0;
                    this.method2115(var3);
                } else {
                    var3.field1441 = var5;
                    this.method2123(var3.field2127, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ca.x(I)V")
    public void method2111(int arg0) {
        for (class116 var2 = (class116) this.field1328.method4568(); var2 != null; var2 = (class116) this.field1328.method4561()) {
            var2.method2121(arg0);
        }
    }
}
