package deob;

@ObfuscatedName("aa")
public class class51 extends class62 {

    @ObfuscatedName("aa.n")
    public class190 field1097 = new class190();

    @ObfuscatedName("aa.i")
    public class190 field1098 = new class190();

    @ObfuscatedName("aa.e")
    public int field1099 = 0;

    @ObfuscatedName("aa.h")
    public int field1100 = -1;

    @ObfuscatedName("aa.n(Lba;)V")
    public final synchronized void method1000(class62 arg0) {
        this.field1097.method3378(arg0);
    }

    @ObfuscatedName("aa.w(Lba;)V")
    public final synchronized void method1001(class62 arg0) {
        arg0.method3474();
    }

    @ObfuscatedName("aa.i()V")
    public void method1002() {
        if (this.field1099 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field1098.method3382(); var1 != null; var1 = (class57) this.field1098.method3384()) {
            var1.field1160 -= this.field1099;
        }
        this.field1100 -= this.field1099;
        this.field1099 = 0;
    }

    @ObfuscatedName("aa.e(Lgn;Lbh;)V")
    public void method1003(class199 arg0, class57 arg1) {
        while (this.field1098.field2997 != arg0 && ((class57) arg0).field1160 <= arg1.field1160) {
            arg0 = arg0.field3014;
        }
        class190.method3379(arg1, arg0);
        this.field1100 = ((class57) this.field1098.field2997.field3014).field1160;
    }

    @ObfuscatedName("aa.h(Lbh;)V")
    public void method1004(class57 arg0) {
        arg0.method3474();
        arg0.method1112();
        class199 var2 = this.field1098.field2997.field3014;
        if (this.field1098.field2997 == var2) {
            this.field1100 = -1;
        } else {
            this.field1100 = ((class57) var2).field1160;
        }
    }

    @ObfuscatedName("aa.q()Lba;")
    public class62 method1005() {
        return (class62) this.field1097.method3382();
    }

    @ObfuscatedName("aa.l()Lba;")
    public class62 method1006() {
        return (class62) this.field1097.method3384();
    }

    @ObfuscatedName("aa.c()I")
    public int method1007() {
        return 0;
    }

    @ObfuscatedName("aa.f([III)V")
    public final synchronized void method1008(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1100 < 0) {
                this.method1009(arg0, arg1, arg2);
                return;
            }
            if (this.field1099 + arg2 < this.field1100) {
                this.field1099 += arg2;
                this.method1009(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1100 - this.field1099;
            this.method1009(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1099 += var4;
            this.method1002();
            class57 var5 = (class57) this.field1098.method3382();
            synchronized (var5) {
                int var7 = var5.method1113(this);
                if (var7 < 0) {
                    var5.field1160 = 0;
                    this.method1004(var5);
                } else {
                    var5.field1160 = var7;
                    this.method1003(var5.field3014, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aa.s([III)V")
    public void method1009(int[] arg0, int arg1, int arg2) {
        for (class62 var4 = (class62) this.field1097.method3382(); var4 != null; var4 = (class62) this.field1097.method3384()) {
            var4.method1279(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aa.m(I)V")
    public final synchronized void method1010(int arg0) {
        do {
            if (this.field1100 < 0) {
                this.method1016(arg0);
                return;
            }
            if (this.field1099 + arg0 < this.field1100) {
                this.field1099 += arg0;
                this.method1016(arg0);
                return;
            }
            int var2 = this.field1100 - this.field1099;
            this.method1016(var2);
            arg0 -= var2;
            this.field1099 += var2;
            this.method1002();
            class57 var3 = (class57) this.field1098.method3382();
            synchronized (var3) {
                int var5 = var3.method1113(this);
                if (var5 < 0) {
                    var3.field1160 = 0;
                    this.method1004(var3);
                } else {
                    var3.field1160 = var5;
                    this.method1003(var3.field3014, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aa.y(I)V")
    public void method1016(int arg0) {
        for (class62 var2 = (class62) this.field1097.method3382(); var2 != null; var2 = (class62) this.field1097.method3384()) {
            var2.method1010(arg0);
        }
    }
}
