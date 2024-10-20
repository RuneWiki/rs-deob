package deob;

@ObfuscatedName("ev")
public class class148 extends class130 {

    @ObfuscatedName("ev.d")
    public class105 field2221 = new class105();

    @ObfuscatedName("ev.k")
    public class105 field2220 = new class105();

    @ObfuscatedName("ev.u")
    public int field2219 = 0;

    @ObfuscatedName("ev.v")
    public int field2222 = -1;

    @ObfuscatedName("ev.ar(Ldr;)V")
    public final synchronized void method2194(class130 arg0) {
        this.field2221.method1320(arg0);
    }

    @ObfuscatedName("ev.au(Ldr;)V")
    public final synchronized void method2185(class130 arg0) {
        arg0.method1328();
    }

    @ObfuscatedName("ev.an()V")
    public void method2188() {
        if (this.field2219 <= 0) {
            return;
        }
        for (class132 var1 = (class132) this.field2220.method1298(); var1 != null; var1 = (class132) this.field2220.method1299()) {
            var1.field1677 -= this.field2219;
        }
        this.field2222 -= this.field2219;
        this.field2219 = 0;
    }

    @ObfuscatedName("ev.az(Ldn;Les;)V")
    public void method2186(class107 arg0, class132 arg1) {
        while (this.field2220.field1509 != arg0 && ((class132) arg0).field1677 <= arg1.field1677) {
            arg0 = arg0.field1512;
        }
        class105.method1295(arg1, arg0);
        this.field2222 = ((class132) this.field2220.field1509.field1512).field1677;
    }

    @ObfuscatedName("ev.ac(Les;)V")
    public void method2193(class132 arg0) {
        arg0.method1328();
        arg0.method1567();
        class107 var2 = this.field2220.field1509.field1512;
        if (this.field2220.field1509 == var2) {
            this.field2222 = -1;
        } else {
            this.field2222 = ((class132) var2).field1677;
        }
    }

    @ObfuscatedName("ev.d()Ldr;")
    public class130 method1527() {
        return (class130) this.field2221.method1298();
    }

    @ObfuscatedName("ev.k()Ldr;")
    public class130 method1511() {
        return (class130) this.field2221.method1299();
    }

    @ObfuscatedName("ev.u()I")
    public int method1512() {
        return 0;
    }

    @ObfuscatedName("ev.f([III)V")
    public final synchronized void method1514(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2222 < 0) {
                this.method2187(arg0, arg1, arg2);
                return;
            }
            if (this.field2219 + arg2 < this.field2222) {
                this.field2219 += arg2;
                this.method2187(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2222 - this.field2219;
            this.method2187(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2219 += var4;
            this.method2188();
            class132 var5 = (class132) this.field2220.method1298();
            synchronized (var5) {
                int var7 = var5.method1568(this);
                if (var7 < 0) {
                    var5.field1677 = 0;
                    this.method2193(var5);
                } else {
                    var5.field1677 = var7;
                    this.method2186(var5.field1512, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ev.ap([III)V")
    public void method2187(int[] arg0, int arg1, int arg2) {
        for (class130 var4 = (class130) this.field2221.method1298(); var4 != null; var4 = (class130) this.field2221.method1299()) {
            var4.method1518(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ev.s(I)V")
    public final synchronized void method1515(int arg0) {
        do {
            if (this.field2222 < 0) {
                this.method2189(arg0);
                return;
            }
            if (this.field2219 + arg0 < this.field2222) {
                this.field2219 += arg0;
                this.method2189(arg0);
                return;
            }
            int var2 = this.field2222 - this.field2219;
            this.method2189(var2);
            arg0 -= var2;
            this.field2219 += var2;
            this.method2188();
            class132 var3 = (class132) this.field2220.method1298();
            synchronized (var3) {
                int var5 = var3.method1568(this);
                if (var5 < 0) {
                    var3.field1677 = 0;
                    this.method2193(var3);
                } else {
                    var3.field1677 = var5;
                    this.method2186(var3.field1512, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ev.ad(I)V")
    public void method2189(int arg0) {
        for (class130 var2 = (class130) this.field2221.method1298(); var2 != null; var2 = (class130) this.field2221.method1299()) {
            var2.method1515(arg0);
        }
    }
}
