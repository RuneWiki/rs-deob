package deob;

@ObfuscatedName("ck")
public class class91 extends class108 {

    @ObfuscatedName("ck.c")
    public class208 field1292 = new class208();

    @ObfuscatedName("ck.q")
    public class208 field1289 = new class208();

    @ObfuscatedName("ck.m")
    public int field1290 = 0;

    @ObfuscatedName("ck.j")
    public int field1291 = -1;

    @ObfuscatedName("ck.c(Ldd;)V")
    public final synchronized void method1891(class108 arg0) {
        this.field1292.method3753(arg0);
    }

    @ObfuscatedName("ck.q(Ldd;)V")
    public final synchronized void method1869(class108 arg0) {
        arg0.method3733();
    }

    @ObfuscatedName("ck.m()V")
    public void method1870() {
        if (this.field1290 <= 0) {
            return;
        }
        for (class103 var1 = (class103) this.field1289.method3746(); var1 != null; var1 = (class103) this.field1289.method3747()) {
            var1.field1401 -= this.field1290;
        }
        this.field1291 -= this.field1290;
        this.field1290 = 0;
    }

    @ObfuscatedName("ck.j(Lgk;Lcl;)V")
    public void method1867(class207 arg0, class103 arg1) {
        while (this.field1289.field2469 != arg0 && ((class103) arg0).field1401 <= arg1.field1401) {
            arg0 = arg0.field2465;
        }
        class208.method3742(arg1, arg0);
        this.field1291 = ((class103) this.field1289.field2469.field2465).field1401;
    }

    @ObfuscatedName("ck.g(Lcl;)V")
    public void method1871(class103 arg0) {
        arg0.method3733();
        arg0.method2060();
        class207 var2 = this.field1289.field2469.field2465;
        if (this.field1289.field2469 == var2) {
            this.field1291 = -1;
        } else {
            this.field1291 = ((class103) var2).field1401;
        }
    }

    @ObfuscatedName("ck.i()Ldd;")
    public class108 method1879() {
        return (class108) this.field1292.method3746();
    }

    @ObfuscatedName("ck.h()Ldd;")
    public class108 method1874() {
        return (class108) this.field1292.method3747();
    }

    @ObfuscatedName("ck.l()I")
    public int method1875() {
        return 0;
    }

    @ObfuscatedName("ck.o([III)V")
    public final synchronized void method1893(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1291 < 0) {
                this.method1877(arg0, arg1, arg2);
                return;
            }
            if (this.field1290 + arg2 < this.field1291) {
                this.field1290 += arg2;
                this.method1877(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1291 - this.field1290;
            this.method1877(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1290 += var4;
            this.method1870();
            class103 var5 = (class103) this.field1289.method3746();
            synchronized (var5) {
                int var7 = var5.method2059(this);
                if (var7 < 0) {
                    var5.field1401 = 0;
                    this.method1871(var5);
                } else {
                    var5.field1401 = var7;
                    this.method1867(var5.field2465, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ck.k([III)V")
    public void method1877(int[] arg0, int arg1, int arg2) {
        for (class108 var4 = (class108) this.field1292.method3746(); var4 != null; var4 = (class108) this.field1292.method3747()) {
            var4.method2229(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ck.v(I)V")
    public final synchronized void method1872(int arg0) {
        do {
            if (this.field1291 < 0) {
                this.method1878(arg0);
                return;
            }
            if (this.field1290 + arg0 < this.field1291) {
                this.field1290 += arg0;
                this.method1878(arg0);
                return;
            }
            int var2 = this.field1291 - this.field1290;
            this.method1878(var2);
            arg0 -= var2;
            this.field1290 += var2;
            this.method1870();
            class103 var3 = (class103) this.field1289.method3746();
            synchronized (var3) {
                int var5 = var3.method2059(this);
                if (var5 < 0) {
                    var3.field1401 = 0;
                    this.method1871(var3);
                } else {
                    var3.field1401 = var5;
                    this.method1867(var3.field2465, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ck.p(I)V")
    public void method1878(int arg0) {
        for (class108 var2 = (class108) this.field1292.method3746(); var2 != null; var2 = (class108) this.field1292.method3747()) {
            var2.method1872(arg0);
        }
    }
}
