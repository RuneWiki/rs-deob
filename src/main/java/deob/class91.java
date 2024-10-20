package deob;

@ObfuscatedName("cn")
public class class91 extends class108 {

    @ObfuscatedName("cn.g")
    public class208 field1298 = new class208();

    @ObfuscatedName("cn.r")
    public class208 field1297 = new class208();

    @ObfuscatedName("cn.e")
    public int field1299 = 0;

    @ObfuscatedName("cn.q")
    public int field1300 = -1;

    @ObfuscatedName("cn.g(Ldz;)V")
    public final synchronized void method2082(class108 arg0) {
        this.field1298.method3958(arg0);
    }

    @ObfuscatedName("cn.r(Ldz;)V")
    public final synchronized void method2081(class108 arg0) {
        arg0.method3952();
    }

    @ObfuscatedName("cn.e()V")
    public void method2083() {
        if (this.field1299 <= 0) {
            return;
        }
        for (class103 var1 = (class103) this.field1297.method3979(); var1 != null; var1 = (class103) this.field1297.method3964()) {
            var1.field1402 -= this.field1299;
        }
        this.field1300 -= this.field1299;
        this.field1299 = 0;
    }

    @ObfuscatedName("cn.q(Lgy;Lcw;)V")
    public void method2080(class207 arg0, class103 arg1) {
        while (this.field1297.field2499 != arg0 && ((class103) arg0).field1402 <= arg1.field1402) {
            arg0 = arg0.field2496;
        }
        class208.method3988(arg1, arg0);
        this.field1300 = ((class103) this.field1297.field2499.field2496).field1402;
    }

    @ObfuscatedName("cn.c(Lcw;)V")
    public void method2106(class103 arg0) {
        arg0.method3952();
        arg0.method2278();
        class207 var2 = this.field1297.field2499.field2496;
        if (this.field1297.field2499 == var2) {
            this.field1300 = -1;
        } else {
            this.field1300 = ((class103) var2).field1402;
        }
    }

    @ObfuscatedName("cn.i()Ldz;")
    public class108 method2084() {
        return (class108) this.field1298.method3979();
    }

    @ObfuscatedName("cn.p()Ldz;")
    public class108 method2085() {
        return (class108) this.field1298.method3964();
    }

    @ObfuscatedName("cn.m()I")
    public int method2086() {
        return 0;
    }

    @ObfuscatedName("cn.d([III)V")
    public final synchronized void method2087(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1300 < 0) {
                this.method2088(arg0, arg1, arg2);
                return;
            }
            if (this.field1299 + arg2 < this.field1300) {
                this.field1299 += arg2;
                this.method2088(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1300 - this.field1299;
            this.method2088(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1299 += var4;
            this.method2083();
            class103 var5 = (class103) this.field1297.method3979();
            synchronized (var5) {
                int var7 = var5.method2279(this);
                if (var7 < 0) {
                    var5.field1402 = 0;
                    this.method2106(var5);
                } else {
                    var5.field1402 = var7;
                    this.method2080(var5.field2496, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cn.j([III)V")
    public void method2088(int[] arg0, int arg1, int arg2) {
        for (class108 var4 = (class108) this.field1298.method3979(); var4 != null; var4 = (class108) this.field1298.method3964()) {
            var4.method2470(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cn.x(I)V")
    public final synchronized void method2089(int arg0) {
        do {
            if (this.field1300 < 0) {
                this.method2108(arg0);
                return;
            }
            if (this.field1299 + arg0 < this.field1300) {
                this.field1299 += arg0;
                this.method2108(arg0);
                return;
            }
            int var2 = this.field1300 - this.field1299;
            this.method2108(var2);
            arg0 -= var2;
            this.field1299 += var2;
            this.method2083();
            class103 var3 = (class103) this.field1297.method3979();
            synchronized (var3) {
                int var5 = var3.method2279(this);
                if (var5 < 0) {
                    var3.field1402 = 0;
                    this.method2106(var3);
                } else {
                    var3.field1402 = var5;
                    this.method2080(var3.field2496, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cn.v(I)V")
    public void method2108(int arg0) {
        for (class108 var2 = (class108) this.field1298.method3979(); var2 != null; var2 = (class108) this.field1298.method3964()) {
            var2.method2089(arg0);
        }
    }
}
