package deob;

@ObfuscatedName("ao")
public class class51 extends class62 {

    @ObfuscatedName("ao.b")
    public class190 field1097 = new class190();

    @ObfuscatedName("ao.e")
    public class190 field1099 = new class190();

    @ObfuscatedName("ao.a")
    public int field1098 = 0;

    @ObfuscatedName("ao.k")
    public int field1100 = -1;

    @ObfuscatedName("ao.b(Lbk;)V")
    public final synchronized void method971(class62 arg0) {
        this.field1097.method3320(arg0);
    }

    @ObfuscatedName("ao.e(Lbk;)V")
    public final synchronized void method972(class62 arg0) {
        arg0.method3414();
    }

    @ObfuscatedName("ao.a()V")
    public void method973() {
        if (this.field1098 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field1099.method3324(); var1 != null; var1 = (class57) this.field1099.method3326()) {
            var1.field1165 -= this.field1098;
        }
        this.field1100 -= this.field1098;
        this.field1098 = 0;
    }

    @ObfuscatedName("ao.k(Lgv;Lbh;)V")
    public void method1000(class199 arg0, class57 arg1) {
        while (this.field1099.field2989 != arg0 && ((class57) arg0).field1165 <= arg1.field1165) {
            arg0 = arg0.field3005;
        }
        class190.method3321(arg1, arg0);
        this.field1100 = ((class57) this.field1099.field2989.field3005).field1165;
    }

    @ObfuscatedName("ao.p(Lbh;)V")
    public void method993(class57 arg0) {
        arg0.method3414();
        arg0.method1090();
        class199 var2 = this.field1099.field2989.field3005;
        if (this.field1099.field2989 == var2) {
            this.field1100 = -1;
        } else {
            this.field1100 = ((class57) var2).field1165;
        }
    }

    @ObfuscatedName("ao.l()Lbk;")
    public class62 method976() {
        return (class62) this.field1097.method3324();
    }

    @ObfuscatedName("ao.u()Lbk;")
    public class62 method984() {
        return (class62) this.field1097.method3326();
    }

    @ObfuscatedName("ao.o()I")
    public int method978() {
        return 0;
    }

    @ObfuscatedName("ao.m([III)V")
    public final synchronized void method979(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1100 < 0) {
                this.method980(arg0, arg1, arg2);
                return;
            }
            if (this.field1098 + arg2 < this.field1100) {
                this.field1098 += arg2;
                this.method980(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1100 - this.field1098;
            this.method980(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1098 += var4;
            this.method973();
            class57 var5 = (class57) this.field1099.method3324();
            synchronized (var5) {
                int var7 = var5.method1095(this);
                if (var7 < 0) {
                    var5.field1165 = 0;
                    this.method993(var5);
                } else {
                    var5.field1165 = var7;
                    this.method1000(var5.field3005, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ao.q([III)V")
    public void method980(int[] arg0, int arg1, int arg2) {
        for (class62 var4 = (class62) this.field1097.method3324(); var4 != null; var4 = (class62) this.field1097.method3326()) {
            var4.method1246(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ao.v(I)V")
    public final synchronized void method981(int arg0) {
        do {
            if (this.field1100 < 0) {
                this.method982(arg0);
                return;
            }
            if (this.field1098 + arg0 < this.field1100) {
                this.field1098 += arg0;
                this.method982(arg0);
                return;
            }
            int var2 = this.field1100 - this.field1098;
            this.method982(var2);
            arg0 -= var2;
            this.field1098 += var2;
            this.method973();
            class57 var3 = (class57) this.field1099.method3324();
            synchronized (var3) {
                int var5 = var3.method1095(this);
                if (var5 < 0) {
                    var3.field1165 = 0;
                    this.method993(var3);
                } else {
                    var3.field1165 = var5;
                    this.method1000(var3.field3005, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ao.n(I)V")
    public void method982(int arg0) {
        for (class62 var2 = (class62) this.field1097.method3324(); var2 != null; var2 = (class62) this.field1097.method3326()) {
            var2.method981(arg0);
        }
    }
}
