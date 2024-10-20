package deob;

@ObfuscatedName("cz")
public class class91 extends class108 {

    @ObfuscatedName("cz.f")
    public class208 field1275 = new class208();

    @ObfuscatedName("cz.h")
    public class208 field1276 = new class208();

    @ObfuscatedName("cz.e")
    public int field1277 = 0;

    @ObfuscatedName("cz.b")
    public int field1278 = -1;

    @ObfuscatedName("cz.f(Lde;)V")
    public final synchronized void method1916(class108 arg0) {
        this.field1275.method3816(arg0);
    }

    @ObfuscatedName("cz.h(Lde;)V")
    public final synchronized void method1910(class108 arg0) {
        arg0.method3812();
    }

    @ObfuscatedName("cz.e()V")
    public void method1933() {
        if (this.field1277 <= 0) {
            return;
        }
        for (class103 var1 = (class103) this.field1276.method3823(); var1 != null; var1 = (class103) this.field1276.method3822()) {
            var1.field1383 -= this.field1277;
        }
        this.field1278 -= this.field1277;
        this.field1277 = 0;
    }

    @ObfuscatedName("cz.b(Lgf;Lck;)V")
    public void method1912(class207 arg0, class103 arg1) {
        while (this.field1276.field2488 != arg0 && ((class103) arg0).field1383 <= arg1.field1383) {
            arg0 = arg0.field2487;
        }
        class208.method3817(arg1, arg0);
        this.field1278 = ((class103) this.field1276.field2488.field2487).field1383;
    }

    @ObfuscatedName("cz.l(Lck;)V")
    public void method1911(class103 arg0) {
        arg0.method3812();
        arg0.method2107();
        class207 var2 = this.field1276.field2488.field2487;
        if (this.field1276.field2488 == var2) {
            this.field1278 = -1;
        } else {
            this.field1278 = ((class103) var2).field1383;
        }
    }

    @ObfuscatedName("cz.w()Lde;")
    public class108 method1914() {
        return (class108) this.field1275.method3823();
    }

    @ObfuscatedName("cz.d()Lde;")
    public class108 method1915() {
        return (class108) this.field1275.method3822();
    }

    @ObfuscatedName("cz.n()I")
    public int method1908() {
        return 0;
    }

    @ObfuscatedName("cz.s([III)V")
    public final synchronized void method1917(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1278 < 0) {
                this.method1918(arg0, arg1, arg2);
                return;
            }
            if (this.field1277 + arg2 < this.field1278) {
                this.field1277 += arg2;
                this.method1918(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1278 - this.field1277;
            this.method1918(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1277 += var4;
            this.method1933();
            class103 var5 = (class103) this.field1276.method3823();
            synchronized (var5) {
                int var7 = var5.method2106(this);
                if (var7 < 0) {
                    var5.field1383 = 0;
                    this.method1911(var5);
                } else {
                    var5.field1383 = var7;
                    this.method1912(var5.field2487, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cz.g([III)V")
    public void method1918(int[] arg0, int arg1, int arg2) {
        for (class108 var4 = (class108) this.field1275.method3823(); var4 != null; var4 = (class108) this.field1275.method3822()) {
            var4.method2274(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cz.k(I)V")
    public final synchronized void method1919(int arg0) {
        do {
            if (this.field1278 < 0) {
                this.method1920(arg0);
                return;
            }
            if (this.field1277 + arg0 < this.field1278) {
                this.field1277 += arg0;
                this.method1920(arg0);
                return;
            }
            int var2 = this.field1278 - this.field1277;
            this.method1920(var2);
            arg0 -= var2;
            this.field1277 += var2;
            this.method1933();
            class103 var3 = (class103) this.field1276.method3823();
            synchronized (var3) {
                int var5 = var3.method2106(this);
                if (var5 < 0) {
                    var3.field1383 = 0;
                    this.method1911(var3);
                } else {
                    var3.field1383 = var5;
                    this.method1912(var3.field2487, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cz.m(I)V")
    public void method1920(int arg0) {
        for (class108 var2 = (class108) this.field1275.method3823(); var2 != null; var2 = (class108) this.field1275.method3822()) {
            var2.method1919(arg0);
        }
    }
}
