package deob;

@ObfuscatedName("cw")
public class class91 extends class108 {

    @ObfuscatedName("cw.f")
    public class208 field1291 = new class208();

    @ObfuscatedName("cw.l")
    public class208 field1292 = new class208();

    @ObfuscatedName("cw.s")
    public int field1293 = 0;

    @ObfuscatedName("cw.e")
    public int field1294 = -1;

    @ObfuscatedName("cw.f(Ldm;)V")
    public final synchronized void method1967(class108 arg0) {
        this.field1291.method3824(arg0);
    }

    @ObfuscatedName("cw.l(Ldm;)V")
    public final synchronized void method1969(class108 arg0) {
        arg0.method3818();
    }

    @ObfuscatedName("cw.w()V")
    public void method1970() {
        if (this.field1293 <= 0) {
            return;
        }
        for (class103 var1 = (class103) this.field1292.method3827(); var1 != null; var1 = (class103) this.field1292.method3829()) {
            var1.field1399 -= this.field1293;
        }
        this.field1294 -= this.field1293;
        this.field1293 = 0;
    }

    @ObfuscatedName("cw.s(Lgu;Lcp;)V")
    public void method1971(class207 arg0, class103 arg1) {
        while (this.field1292.field2498 != arg0 && ((class103) arg0).field1399 <= arg1.field1399) {
            arg0 = arg0.field2495;
        }
        class208.method3845(arg1, arg0);
        this.field1294 = ((class103) this.field1292.field2498.field2495).field1399;
    }

    @ObfuscatedName("cw.e(Lcp;)V")
    public void method2001(class103 arg0) {
        arg0.method3818();
        arg0.method2157();
        class207 var2 = this.field1292.field2498.field2495;
        if (this.field1292.field2498 == var2) {
            this.field1294 = -1;
        } else {
            this.field1294 = ((class103) var2).field1399;
        }
    }

    @ObfuscatedName("cw.c()Ldm;")
    public class108 method1972() {
        return (class108) this.field1291.method3827();
    }

    @ObfuscatedName("cw.p()Ldm;")
    public class108 method1982() {
        return (class108) this.field1291.method3829();
    }

    @ObfuscatedName("cw.r()I")
    public int method1974() {
        return 0;
    }

    @ObfuscatedName("cw.m([III)V")
    public final synchronized void method1975(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1294 < 0) {
                this.method2002(arg0, arg1, arg2);
                return;
            }
            if (this.field1293 + arg2 < this.field1294) {
                this.field1293 += arg2;
                this.method2002(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1294 - this.field1293;
            this.method2002(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1293 += var4;
            this.method1970();
            class103 var5 = (class103) this.field1292.method3827();
            synchronized (var5) {
                int var7 = var5.method2158(this);
                if (var7 < 0) {
                    var5.field1399 = 0;
                    this.method2001(var5);
                } else {
                    var5.field1399 = var7;
                    this.method1971(var5.field2495, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cw.d([III)V")
    public void method2002(int[] arg0, int arg1, int arg2) {
        for (class108 var4 = (class108) this.field1291.method3827(); var4 != null; var4 = (class108) this.field1291.method3829()) {
            var4.method2338(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cw.z(I)V")
    public final synchronized void method1977(int arg0) {
        do {
            if (this.field1294 < 0) {
                this.method1978(arg0);
                return;
            }
            if (this.field1293 + arg0 < this.field1294) {
                this.field1293 += arg0;
                this.method1978(arg0);
                return;
            }
            int var2 = this.field1294 - this.field1293;
            this.method1978(var2);
            arg0 -= var2;
            this.field1293 += var2;
            this.method1970();
            class103 var3 = (class103) this.field1292.method3827();
            synchronized (var3) {
                int var5 = var3.method2158(this);
                if (var5 < 0) {
                    var3.field1399 = 0;
                    this.method2001(var3);
                } else {
                    var3.field1399 = var5;
                    this.method1971(var3.field2495, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cw.x(I)V")
    public void method1978(int arg0) {
        for (class108 var2 = (class108) this.field1291.method3827(); var2 != null; var2 = (class108) this.field1291.method3829()) {
            var2.method1977(arg0);
        }
    }
}
