package deob;

@ObfuscatedName("ch")
public class class99 extends class116 {

    @ObfuscatedName("ch.c")
    public class263 field1331 = new class263();

    @ObfuscatedName("ch.t")
    public class263 field1328 = new class263();

    @ObfuscatedName("ch.o")
    public int field1330 = 0;

    @ObfuscatedName("ch.e")
    public int field1329 = -1;

    @ObfuscatedName("ch.c(Ldn;)V")
    public final synchronized void method2154(class116 arg0) {
        this.field1331.method4565(arg0);
    }

    @ObfuscatedName("ch.t(Ldn;)V")
    public final synchronized void method2174(class116 arg0) {
        arg0.method3351();
    }

    @ObfuscatedName("ch.o()V")
    public void method2156() {
        if (this.field1330 <= 0) {
            return;
        }
        for (class111 var1 = (class111) this.field1328.method4543(); var1 != null; var1 = (class111) this.field1328.method4564()) {
            var1.field1436 -= this.field1330;
        }
        this.field1329 -= this.field1330;
        this.field1330 = 0;
    }

    @ObfuscatedName("ch.e(Lft;Ldi;)V")
    public void method2157(class181 arg0, class111 arg1) {
        while (this.field1328.field3531 != arg0 && ((class111) arg0).field1436 <= arg1.field1436) {
            arg0 = arg0.field2114;
        }
        class263.method4561(arg1, arg0);
        this.field1329 = ((class111) this.field1328.field3531.field2114).field1436;
    }

    @ObfuscatedName("ch.i(Ldi;)V")
    public void method2158(class111 arg0) {
        arg0.method3351();
        arg0.method2359();
        class181 var2 = this.field1328.field3531.field2114;
        if (this.field1328.field3531 == var2) {
            this.field1329 = -1;
        } else {
            this.field1329 = ((class111) var2).field1436;
        }
    }

    @ObfuscatedName("ch.g()Ldn;")
    public class116 method2159() {
        return (class116) this.field1331.method4543();
    }

    @ObfuscatedName("ch.d()Ldn;")
    public class116 method2160() {
        return (class116) this.field1331.method4564();
    }

    @ObfuscatedName("ch.l()I")
    public int method2161() {
        return 0;
    }

    @ObfuscatedName("ch.j([III)V")
    public final synchronized void method2162(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1329 < 0) {
                this.method2186(arg0, arg1, arg2);
                return;
            }
            if (this.field1330 + arg2 < this.field1329) {
                this.field1330 += arg2;
                this.method2186(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1329 - this.field1330;
            this.method2186(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1330 += var4;
            this.method2156();
            class111 var5 = (class111) this.field1328.method4543();
            synchronized (var5) {
                int var7 = var5.method2361(this);
                if (var7 < 0) {
                    var5.field1436 = 0;
                    this.method2158(var5);
                } else {
                    var5.field1436 = var7;
                    this.method2157(var5.field2114, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ch.m([III)V")
    public void method2186(int[] arg0, int arg1, int arg2) {
        for (class116 var4 = (class116) this.field1331.method4543(); var4 != null; var4 = (class116) this.field1331.method4564()) {
            var4.method2529(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ch.p(I)V")
    public final synchronized void method2180(int arg0) {
        do {
            if (this.field1329 < 0) {
                this.method2165(arg0);
                return;
            }
            if (this.field1330 + arg0 < this.field1329) {
                this.field1330 += arg0;
                this.method2165(arg0);
                return;
            }
            int var2 = this.field1329 - this.field1330;
            this.method2165(var2);
            arg0 -= var2;
            this.field1330 += var2;
            this.method2156();
            class111 var3 = (class111) this.field1328.method4543();
            synchronized (var3) {
                int var5 = var3.method2361(this);
                if (var5 < 0) {
                    var3.field1436 = 0;
                    this.method2158(var3);
                } else {
                    var3.field1436 = var5;
                    this.method2157(var3.field2114, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ch.h(I)V")
    public void method2165(int arg0) {
        for (class116 var2 = (class116) this.field1331.method4543(); var2 != null; var2 = (class116) this.field1331.method4564()) {
            var2.method2180(arg0);
        }
    }
}
