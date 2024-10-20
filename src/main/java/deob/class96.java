package deob;

@ObfuscatedName("cn")
public class class96 extends class113 {

    @ObfuscatedName("cn.a")
    public class213 field1322 = new class213();

    @ObfuscatedName("cn.s")
    public class213 field1323 = new class213();

    @ObfuscatedName("cn.g")
    public int field1324 = 0;

    @ObfuscatedName("cn.x")
    public int field1325 = -1;

    @ObfuscatedName("cn.a(Ldo;)V")
    public final synchronized void method2124(class113 arg0) {
        this.field1322.method3967(arg0);
    }

    @ObfuscatedName("cn.s(Ldo;)V")
    public final synchronized void method2120(class113 arg0) {
        arg0.method3960();
    }

    @ObfuscatedName("cn.g()V")
    public void method2121() {
        if (this.field1324 <= 0) {
            return;
        }
        for (class108 var1 = (class108) this.field1323.method3990(); var1 != null; var1 = (class108) this.field1323.method3984()) {
            var1.field1426 -= this.field1324;
        }
        this.field1325 -= this.field1324;
        this.field1324 = 0;
    }

    @ObfuscatedName("cn.x(Lhy;Ldl;)V")
    public void method2122(class212 arg0, class108 arg1) {
        while (this.field1323.field2514 != arg0 && ((class108) arg0).field1426 <= arg1.field1426) {
            arg0 = arg0.field2511;
        }
        class213.method3973(arg1, arg0);
        this.field1325 = ((class108) this.field1323.field2514.field2511).field1426;
    }

    @ObfuscatedName("cn.h(Ldl;)V")
    public void method2123(class108 arg0) {
        arg0.method3960();
        arg0.method2315();
        class212 var2 = this.field1323.field2514.field2511;
        if (this.field1323.field2514 == var2) {
            this.field1325 = -1;
        } else {
            this.field1325 = ((class108) var2).field1426;
        }
    }

    @ObfuscatedName("cn.f()Ldo;")
    public class113 method2139() {
        return (class113) this.field1322.method3990();
    }

    @ObfuscatedName("cn.p()Ldo;")
    public class113 method2125() {
        return (class113) this.field1322.method3984();
    }

    @ObfuscatedName("cn.m()I")
    public int method2156() {
        return 0;
    }

    @ObfuscatedName("cn.q([III)V")
    public final synchronized void method2127(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1325 < 0) {
                this.method2128(arg0, arg1, arg2);
                return;
            }
            if (this.field1324 + arg2 < this.field1325) {
                this.field1324 += arg2;
                this.method2128(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1325 - this.field1324;
            this.method2128(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1324 += var4;
            this.method2121();
            class108 var5 = (class108) this.field1323.method3990();
            synchronized (var5) {
                int var7 = var5.method2318(this);
                if (var7 < 0) {
                    var5.field1426 = 0;
                    this.method2123(var5);
                } else {
                    var5.field1426 = var7;
                    this.method2122(var5.field2511, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cn.b([III)V")
    public void method2128(int[] arg0, int arg1, int arg2) {
        for (class113 var4 = (class113) this.field1322.method3990(); var4 != null; var4 = (class113) this.field1322.method3984()) {
            var4.method2490(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cn.n(I)V")
    public final synchronized void method2129(int arg0) {
        do {
            if (this.field1325 < 0) {
                this.method2130(arg0);
                return;
            }
            if (this.field1324 + arg0 < this.field1325) {
                this.field1324 += arg0;
                this.method2130(arg0);
                return;
            }
            int var2 = this.field1325 - this.field1324;
            this.method2130(var2);
            arg0 -= var2;
            this.field1324 += var2;
            this.method2121();
            class108 var3 = (class108) this.field1323.method3990();
            synchronized (var3) {
                int var5 = var3.method2318(this);
                if (var5 < 0) {
                    var3.field1426 = 0;
                    this.method2123(var3);
                } else {
                    var3.field1426 = var5;
                    this.method2122(var3.field2511, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cn.e(I)V")
    public void method2130(int arg0) {
        for (class113 var2 = (class113) this.field1322.method3990(); var2 != null; var2 = (class113) this.field1322.method3984()) {
            var2.method2129(arg0);
        }
    }
}
