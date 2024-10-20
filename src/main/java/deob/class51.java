package deob;

@ObfuscatedName("as")
public class class51 extends class62 {

    @ObfuscatedName("as.e")
    public class189 field1055 = new class189();

    @ObfuscatedName("as.a")
    public class189 field1053 = new class189();

    @ObfuscatedName("as.l")
    public int field1052 = 0;

    @ObfuscatedName("as.c")
    public int field1054 = -1;

    @ObfuscatedName("as.e(Lbu;)V")
    public final synchronized void method999(class62 arg0) {
        this.field1055.method3388(arg0);
    }

    @ObfuscatedName("as.a(Lbu;)V")
    public final synchronized void method1000(class62 arg0) {
        arg0.method3463();
    }

    @ObfuscatedName("as.l()V")
    public void method1032() {
        if (this.field1052 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field1053.method3378(); var1 != null; var1 = (class57) this.field1053.method3394()) {
            var1.field1109 -= this.field1052;
        }
        this.field1054 -= this.field1052;
        this.field1052 = 0;
    }

    @ObfuscatedName("as.c(Lgm;Lbp;)V")
    public void method1002(class198 arg0, class57 arg1) {
        while (this.field1053.field2946 != arg0 && ((class57) arg0).field1109 <= arg1.field1109) {
            arg0 = arg0.field2962;
        }
        class189.method3372(arg1, arg0);
        this.field1054 = ((class57) this.field1053.field2946.field2962).field1109;
    }

    @ObfuscatedName("as.u(Lbp;)V")
    public void method1003(class57 arg0) {
        arg0.method3463();
        arg0.method1122();
        class198 var2 = this.field1053.field2946.field2962;
        if (this.field1053.field2946 == var2) {
            this.field1054 = -1;
        } else {
            this.field1054 = ((class57) var2).field1109;
        }
    }

    @ObfuscatedName("as.w()Lbu;")
    public class62 method1004() {
        return (class62) this.field1055.method3378();
    }

    @ObfuscatedName("as.i()Lbu;")
    public class62 method1009() {
        return (class62) this.field1055.method3394();
    }

    @ObfuscatedName("as.r()I")
    public int method1006() {
        return 0;
    }

    @ObfuscatedName("as.f([III)V")
    public final synchronized void method1007(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1054 < 0) {
                this.method1008(arg0, arg1, arg2);
                return;
            }
            if (this.field1052 + arg2 < this.field1054) {
                this.field1052 += arg2;
                this.method1008(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1054 - this.field1052;
            this.method1008(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1052 += var4;
            this.method1032();
            class57 var5 = (class57) this.field1053.method3378();
            synchronized (var5) {
                int var7 = var5.method1121(this);
                if (var7 < 0) {
                    var5.field1109 = 0;
                    this.method1003(var5);
                } else {
                    var5.field1109 = var7;
                    this.method1002(var5.field2962, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("as.g([III)V")
    public void method1008(int[] arg0, int arg1, int arg2) {
        for (class62 var4 = (class62) this.field1055.method3378(); var4 != null; var4 = (class62) this.field1055.method3394()) {
            var4.method1282(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("as.o(I)V")
    public final synchronized void method1030(int arg0) {
        do {
            if (this.field1054 < 0) {
                this.method1011(arg0);
                return;
            }
            if (this.field1052 + arg0 < this.field1054) {
                this.field1052 += arg0;
                this.method1011(arg0);
                return;
            }
            int var2 = this.field1054 - this.field1052;
            this.method1011(var2);
            arg0 -= var2;
            this.field1052 += var2;
            this.method1032();
            class57 var3 = (class57) this.field1053.method3378();
            synchronized (var3) {
                int var5 = var3.method1121(this);
                if (var5 < 0) {
                    var3.field1109 = 0;
                    this.method1003(var3);
                } else {
                    var3.field1109 = var5;
                    this.method1002(var3.field2962, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("as.h(I)V")
    public void method1011(int arg0) {
        for (class62 var2 = (class62) this.field1055.method3378(); var2 != null; var2 = (class62) this.field1055.method3394()) {
            var2.method1030(arg0);
        }
    }
}
