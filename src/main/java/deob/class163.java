package deob;

@ObfuscatedName("at")
public class class163 extends class183 {

    @ObfuscatedName("at.b")
    public class15 field2432 = new class15();

    @ObfuscatedName("at.k")
    public int field2430 = 0;

    @ObfuscatedName("at.h")
    public class15 field2431 = new class15();

    @ObfuscatedName("at.t")
    public int field2433 = -1;

    @ObfuscatedName("at.b(Lag;)V")
    public final synchronized void method2799(class183 arg0) {
        this.field2432.method204(arg0);
    }

    @ObfuscatedName("at.w()V")
    public void method2800() {
        if (this.field2430 <= 0) {
            return;
        }
        for (class111 var1 = (class111) this.field2431.method212(); var1 != null; var1 = (class111) this.field2431.method201()) {
            var1.field1852 -= this.field2430;
        }
        this.field2433 -= this.field2430;
        this.field2430 = 0;
    }

    @ObfuscatedName("at.t(Lft;Lby;)V")
    public void method2801(class17 arg0, class111 arg1) {
        while (this.field2431.field209 != arg0 && ((class111) arg0).field1852 <= arg1.field1852) {
            arg0 = arg0.field214;
        }
        class15.method194(arg1, arg0);
        this.field2433 = ((class111) this.field2431.field209.field214).field1852;
    }

    @ObfuscatedName("at.d(Lby;)V")
    public void method2802(class111 arg0) {
        arg0.method234();
        arg0.method2011();
        class17 var2 = this.field2431.field209.field214;
        if (this.field2431.field209 == var2) {
            this.field2433 = -1;
        } else {
            this.field2433 = ((class111) var2).field1852;
        }
    }

    @ObfuscatedName("at.m()Lag;")
    public class183 method992() {
        return (class183) this.field2432.method201();
    }

    @ObfuscatedName("at.c()I")
    public int method976() {
        return 0;
    }

    @ObfuscatedName("at.v([III)V")
    public final synchronized void method1018(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2433 < 0) {
                this.method2803(arg0, arg1, arg2);
                return;
            }
            if (this.field2430 + arg2 < this.field2433) {
                this.field2430 += arg2;
                this.method2803(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2433 - this.field2430;
            this.method2803(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2430 += var4;
            this.method2800();
            class111 var5 = (class111) this.field2431.method212();
            synchronized (var5) {
                int var7 = var5.method2008(this);
                if (var7 < 0) {
                    var5.field1852 = 0;
                    this.method2802(var5);
                } else {
                    var5.field1852 = var7;
                    this.method2801(var5.field214, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("at.l([III)V")
    public void method2803(int[] arg0, int arg1, int arg2) {
        for (class183 var4 = (class183) this.field2432.method212(); var4 != null; var4 = (class183) this.field2432.method201()) {
            var4.method3334(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("at.ac(I)V")
    public final synchronized void method995(int arg0) {
        do {
            if (this.field2433 < 0) {
                this.method2809(arg0);
                return;
            }
            if (this.field2430 + arg0 < this.field2433) {
                this.field2430 += arg0;
                this.method2809(arg0);
                return;
            }
            int var2 = this.field2433 - this.field2430;
            this.method2809(var2);
            arg0 -= var2;
            this.field2430 += var2;
            this.method2800();
            class111 var3 = (class111) this.field2431.method212();
            synchronized (var3) {
                int var5 = var3.method2008(this);
                if (var5 < 0) {
                    var3.field1852 = 0;
                    this.method2802(var3);
                } else {
                    var3.field1852 = var5;
                    this.method2801(var3.field214, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("at.f(I)V")
    public void method2809(int arg0) {
        for (class183 var2 = (class183) this.field2432.method212(); var2 != null; var2 = (class183) this.field2432.method201()) {
            var2.method995(arg0);
        }
    }

    @ObfuscatedName("at.h(Lag;)V")
    public final synchronized void method2812(class183 arg0) {
        arg0.method234();
    }

    @ObfuscatedName("at.p()Lag;")
    public class183 method1027() {
        return (class183) this.field2432.method212();
    }
}
