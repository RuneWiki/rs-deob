package deob;

@ObfuscatedName("cg")
public class class91 extends class108 {

    @ObfuscatedName("cg.v")
    public class208 field1279 = new class208();

    @ObfuscatedName("cg.s")
    public class208 field1280 = new class208();

    @ObfuscatedName("cg.o")
    public int field1281 = 0;

    @ObfuscatedName("cg.k")
    public int field1282 = -1;

    @ObfuscatedName("cg.v(Ldm;)V")
    public final synchronized void method1894(class108 arg0) {
        this.field1279.method3824(arg0);
    }

    @ObfuscatedName("cg.s(Ldm;)V")
    public final synchronized void method1944(class108 arg0) {
        arg0.method3787();
    }

    @ObfuscatedName("cg.o()V")
    public void method1896() {
        if (this.field1281 <= 0) {
            return;
        }
        for (class103 var1 = (class103) this.field1280.method3792(); var1 != null; var1 = (class103) this.field1280.method3800()) {
            var1.field1389 -= this.field1281;
        }
        this.field1282 -= this.field1281;
        this.field1281 = 0;
    }

    @ObfuscatedName("cg.k(Lgl;Lca;)V")
    public void method1932(class207 arg0, class103 arg1) {
        while (this.field1280.field2466 != arg0 && ((class103) arg0).field1389 <= arg1.field1389) {
            arg0 = arg0.field2463;
        }
        class208.method3795(arg1, arg0);
        this.field1282 = ((class103) this.field1280.field2466.field2463).field1389;
    }

    @ObfuscatedName("cg.u(Lca;)V")
    public void method1898(class103 arg0) {
        arg0.method3787();
        arg0.method2111();
        class207 var2 = this.field1280.field2466.field2463;
        if (this.field1280.field2466 == var2) {
            this.field1282 = -1;
        } else {
            this.field1282 = ((class103) var2).field1389;
        }
    }

    @ObfuscatedName("cg.i()Ldm;")
    public class108 method1899() {
        return (class108) this.field1279.method3792();
    }

    @ObfuscatedName("cg.t()Ldm;")
    public class108 method1900() {
        return (class108) this.field1279.method3800();
    }

    @ObfuscatedName("cg.c()I")
    public int method1901() {
        return 0;
    }

    @ObfuscatedName("cg.w([III)V")
    public final synchronized void method1933(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1282 < 0) {
                this.method1903(arg0, arg1, arg2);
                return;
            }
            if (this.field1281 + arg2 < this.field1282) {
                this.field1281 += arg2;
                this.method1903(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1282 - this.field1281;
            this.method1903(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1281 += var4;
            this.method1896();
            class103 var5 = (class103) this.field1280.method3792();
            synchronized (var5) {
                int var7 = var5.method2114(this);
                if (var7 < 0) {
                    var5.field1389 = 0;
                    this.method1898(var5);
                } else {
                    var5.field1389 = var7;
                    this.method1932(var5.field2463, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cg.a([III)V")
    public void method1903(int[] arg0, int arg1, int arg2) {
        for (class108 var4 = (class108) this.field1279.method3792(); var4 != null; var4 = (class108) this.field1279.method3800()) {
            var4.method2287(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cg.z(I)V")
    public final synchronized void method1904(int arg0) {
        do {
            if (this.field1282 < 0) {
                this.method1905(arg0);
                return;
            }
            if (this.field1281 + arg0 < this.field1282) {
                this.field1281 += arg0;
                this.method1905(arg0);
                return;
            }
            int var2 = this.field1282 - this.field1281;
            this.method1905(var2);
            arg0 -= var2;
            this.field1281 += var2;
            this.method1896();
            class103 var3 = (class103) this.field1280.method3792();
            synchronized (var3) {
                int var5 = var3.method2114(this);
                if (var5 < 0) {
                    var3.field1389 = 0;
                    this.method1898(var3);
                } else {
                    var3.field1389 = var5;
                    this.method1932(var3.field2463, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cg.e(I)V")
    public void method1905(int arg0) {
        for (class108 var2 = (class108) this.field1279.method3792(); var2 != null; var2 = (class108) this.field1279.method3800()) {
            var2.method1904(arg0);
        }
    }
}
