package deob;

@ObfuscatedName("cp")
public class class96 extends class113 {

    @ObfuscatedName("cp.n")
    public class213 field1291 = new class213();

    @ObfuscatedName("cp.h")
    public class213 field1289 = new class213();

    @ObfuscatedName("cp.l")
    public int field1290 = 0;

    @ObfuscatedName("cp.g")
    public int field1292 = -1;

    @ObfuscatedName("cp.n(Ldv;)V")
    public final synchronized void method2090(class113 arg0) {
        this.field1291.method3982(arg0);
    }

    @ObfuscatedName("cp.h(Ldv;)V")
    public final synchronized void method2117(class113 arg0) {
        arg0.method3973();
    }

    @ObfuscatedName("cp.l()V")
    public void method2092() {
        if (this.field1290 <= 0) {
            return;
        }
        for (class108 var1 = (class108) this.field1289.method3986(); var1 != null; var1 = (class108) this.field1289.method3988()) {
            var1.field1403 -= this.field1290;
        }
        this.field1292 -= this.field1290;
        this.field1290 = 0;
    }

    @ObfuscatedName("cp.g(Lhv;Ldb;)V")
    public void method2113(class212 arg0, class108 arg1) {
        while (this.field1289.field2504 != arg0 && ((class108) arg0).field1403 <= arg1.field1403) {
            arg0 = arg0.field2500;
        }
        class213.method3983(arg1, arg0);
        this.field1292 = ((class108) this.field1289.field2504.field2500).field1403;
    }

    @ObfuscatedName("cp.b(Ldb;)V")
    public void method2094(class108 arg0) {
        arg0.method3973();
        arg0.method2310();
        class212 var2 = this.field1289.field2504.field2500;
        if (this.field1289.field2504 == var2) {
            this.field1292 = -1;
        } else {
            this.field1292 = ((class108) var2).field1403;
        }
    }

    @ObfuscatedName("cp.a()Ldv;")
    public class113 method2128() {
        return (class113) this.field1291.method3986();
    }

    @ObfuscatedName("cp.c()Ldv;")
    public class113 method2093() {
        return (class113) this.field1291.method3988();
    }

    @ObfuscatedName("cp.z()I")
    public int method2122() {
        return 0;
    }

    @ObfuscatedName("cp.j([III)V")
    public final synchronized void method2098(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1292 < 0) {
                this.method2099(arg0, arg1, arg2);
                return;
            }
            if (this.field1290 + arg2 < this.field1292) {
                this.field1290 += arg2;
                this.method2099(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1292 - this.field1290;
            this.method2099(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1290 += var4;
            this.method2092();
            class108 var5 = (class108) this.field1289.method3986();
            synchronized (var5) {
                int var7 = var5.method2308(this);
                if (var7 < 0) {
                    var5.field1403 = 0;
                    this.method2094(var5);
                } else {
                    var5.field1403 = var7;
                    this.method2113(var5.field2500, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cp.d([III)V")
    public void method2099(int[] arg0, int arg1, int arg2) {
        for (class113 var4 = (class113) this.field1291.method3986(); var4 != null; var4 = (class113) this.field1291.method3988()) {
            var4.method2474(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cp.i(I)V")
    public final synchronized void method2100(int arg0) {
        do {
            if (this.field1292 < 0) {
                this.method2107(arg0);
                return;
            }
            if (this.field1290 + arg0 < this.field1292) {
                this.field1290 += arg0;
                this.method2107(arg0);
                return;
            }
            int var2 = this.field1292 - this.field1290;
            this.method2107(var2);
            arg0 -= var2;
            this.field1290 += var2;
            this.method2092();
            class108 var3 = (class108) this.field1289.method3986();
            synchronized (var3) {
                int var5 = var3.method2308(this);
                if (var5 < 0) {
                    var3.field1403 = 0;
                    this.method2094(var3);
                } else {
                    var3.field1403 = var5;
                    this.method2113(var3.field2500, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cp.m(I)V")
    public void method2107(int arg0) {
        for (class113 var2 = (class113) this.field1291.method3986(); var2 != null; var2 = (class113) this.field1291.method3988()) {
            var2.method2100(arg0);
        }
    }
}
