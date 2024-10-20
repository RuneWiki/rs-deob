package deob;

@ObfuscatedName("au")
public class class52 extends class69 {

    @ObfuscatedName("au.d")
    public class150 field967 = new class150();

    @ObfuscatedName("au.c")
    public class150 field965 = new class150();

    @ObfuscatedName("au.n")
    public int field966 = 0;

    @ObfuscatedName("au.q")
    public int field964 = -1;

    @ObfuscatedName("au.d(Lbc;)V")
    public final synchronized void method907(class69 arg0) {
        this.field967.method2681(arg0);
    }

    @ObfuscatedName("au.c(Lbc;)V")
    public final synchronized void method917(class69 arg0) {
        arg0.method2652();
    }

    @ObfuscatedName("au.n()V")
    public void method908() {
        if (this.field966 <= 0) {
            return;
        }
        for (class63 var1 = (class63) this.field965.method2666(); var1 != null; var1 = (class63) this.field965.method2668()) {
            var1.field1075 -= this.field966;
        }
        this.field964 -= this.field966;
        this.field966 = 0;
    }

    @ObfuscatedName("au.q(Lew;Lbe;)V")
    public void method935(class149 arg0, class63 arg1) {
        while (this.field965.field2035 != arg0 && ((class63) arg0).field1075 <= arg1.field1075) {
            arg0 = arg0.field2032;
        }
        class150.method2660(arg1, arg0);
        this.field964 = ((class63) this.field965.field2035.field2032).field1075;
    }

    @ObfuscatedName("au.t(Lbe;)V")
    public void method911(class63 arg0) {
        arg0.method2652();
        arg0.method1131();
        class149 var2 = this.field965.field2035.field2032;
        if (this.field965.field2035 == var2) {
            this.field964 = -1;
        } else {
            this.field964 = ((class63) var2).field1075;
        }
    }

    @ObfuscatedName("au.p()Lbc;")
    public class69 method910() {
        return (class69) this.field967.method2666();
    }

    @ObfuscatedName("au.u()Lbc;")
    public class69 method913() {
        return (class69) this.field967.method2668();
    }

    @ObfuscatedName("au.w()I")
    public int method914() {
        return 0;
    }

    @ObfuscatedName("au.r([III)V")
    public final synchronized void method915(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field964 < 0) {
                this.method916(arg0, arg1, arg2);
                return;
            }
            if (this.field966 + arg2 < this.field964) {
                this.field966 += arg2;
                this.method916(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field964 - this.field966;
            this.method916(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field966 += var4;
            this.method908();
            class63 var5 = (class63) this.field965.method2666();
            synchronized (var5) {
                int var7 = var5.method1135(this);
                if (var7 < 0) {
                    var5.field1075 = 0;
                    this.method911(var5);
                } else {
                    var5.field1075 = var7;
                    this.method935(var5.field2032, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("au.s([III)V")
    public void method916(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field967.method2666(); var4 != null; var4 = (class69) this.field967.method2668()) {
            var4.method1296(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("au.k(I)V")
    public final synchronized void method920(int arg0) {
        do {
            if (this.field964 < 0) {
                this.method918(arg0);
                return;
            }
            if (this.field966 + arg0 < this.field964) {
                this.field966 += arg0;
                this.method918(arg0);
                return;
            }
            int var2 = this.field964 - this.field966;
            this.method918(var2);
            arg0 -= var2;
            this.field966 += var2;
            this.method908();
            class63 var3 = (class63) this.field965.method2666();
            synchronized (var3) {
                int var5 = var3.method1135(this);
                if (var5 < 0) {
                    var3.field1075 = 0;
                    this.method911(var3);
                } else {
                    var3.field1075 = var5;
                    this.method935(var3.field2032, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("au.e(I)V")
    public void method918(int arg0) {
        for (class69 var2 = (class69) this.field967.method2666(); var2 != null; var2 = (class69) this.field967.method2668()) {
            var2.method920(arg0);
        }
    }
}
