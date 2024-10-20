package deob;

@ObfuscatedName("ct")
public class class99 extends class116 {

    @ObfuscatedName("ct.a")
    public class262 field1319 = new class262();

    @ObfuscatedName("ct.t")
    public class262 field1317 = new class262();

    @ObfuscatedName("ct.n")
    public int field1318 = 0;

    @ObfuscatedName("ct.q")
    public int field1316 = -1;

    @ObfuscatedName("ct.a(Ldj;)V")
    public final synchronized void method2214(class116 arg0) {
        this.field1319.method4577(arg0);
    }

    @ObfuscatedName("ct.t(Ldj;)V")
    public final synchronized void method2211(class116 arg0) {
        arg0.method3386();
    }

    @ObfuscatedName("ct.n()V")
    public void method2209() {
        if (this.field1318 <= 0) {
            return;
        }
        for (class111 var1 = (class111) this.field1317.method4581(); var1 != null; var1 = (class111) this.field1317.method4589()) {
            var1.field1421 -= this.field1318;
        }
        this.field1316 -= this.field1318;
        this.field1318 = 0;
    }

    @ObfuscatedName("ct.q(Lfd;Ldn;)V")
    public void method2213(class181 arg0, class111 arg1) {
        while (this.field1317.field3528 != arg0 && ((class111) arg0).field1421 <= arg1.field1421) {
            arg0 = arg0.field2090;
        }
        class262.method4585(arg1, arg0);
        this.field1316 = ((class111) this.field1317.field3528.field2090).field1421;
    }

    @ObfuscatedName("ct.v(Ldn;)V")
    public void method2248(class111 arg0) {
        arg0.method3386();
        arg0.method2418();
        class181 var2 = this.field1317.field3528.field2090;
        if (this.field1317.field3528 == var2) {
            this.field1316 = -1;
        } else {
            this.field1316 = ((class111) var2).field1421;
        }
    }

    @ObfuscatedName("ct.l()Ldj;")
    public class116 method2215() {
        return (class116) this.field1319.method4581();
    }

    @ObfuscatedName("ct.c()Ldj;")
    public class116 method2223() {
        return (class116) this.field1319.method4589();
    }

    @ObfuscatedName("ct.o()I")
    public int method2217() {
        return 0;
    }

    @ObfuscatedName("ct.i([III)V")
    public final synchronized void method2218(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1316 < 0) {
                this.method2219(arg0, arg1, arg2);
                return;
            }
            if (this.field1318 + arg2 < this.field1316) {
                this.field1318 += arg2;
                this.method2219(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1316 - this.field1318;
            this.method2219(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1318 += var4;
            this.method2209();
            class111 var5 = (class111) this.field1317.method4581();
            synchronized (var5) {
                int var7 = var5.method2422(this);
                if (var7 < 0) {
                    var5.field1421 = 0;
                    this.method2248(var5);
                } else {
                    var5.field1421 = var7;
                    this.method2213(var5.field2090, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ct.d([III)V")
    public void method2219(int[] arg0, int arg1, int arg2) {
        for (class116 var4 = (class116) this.field1319.method4581(); var4 != null; var4 = (class116) this.field1319.method4589()) {
            var4.method2593(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ct.m(I)V")
    public final synchronized void method2224(int arg0) {
        do {
            if (this.field1316 < 0) {
                this.method2221(arg0);
                return;
            }
            if (this.field1318 + arg0 < this.field1316) {
                this.field1318 += arg0;
                this.method2221(arg0);
                return;
            }
            int var2 = this.field1316 - this.field1318;
            this.method2221(var2);
            arg0 -= var2;
            this.field1318 += var2;
            this.method2209();
            class111 var3 = (class111) this.field1317.method4581();
            synchronized (var3) {
                int var5 = var3.method2422(this);
                if (var5 < 0) {
                    var3.field1421 = 0;
                    this.method2248(var3);
                } else {
                    var3.field1421 = var5;
                    this.method2213(var3.field2090, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ct.p(I)V")
    public void method2221(int arg0) {
        for (class116 var2 = (class116) this.field1319.method4581(); var2 != null; var2 = (class116) this.field1319.method4589()) {
            var2.method2224(arg0);
        }
    }
}
