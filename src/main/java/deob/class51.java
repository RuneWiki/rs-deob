package deob;

@ObfuscatedName("aj")
public class class51 extends class62 {

    @ObfuscatedName("aj.o")
    public class190 field1096 = new class190();

    @ObfuscatedName("aj.l")
    public class190 field1095 = new class190();

    @ObfuscatedName("aj.g")
    public int field1097 = 0;

    @ObfuscatedName("aj.u")
    public int field1098 = -1;

    @ObfuscatedName("aj.o(Lbo;)V")
    public final synchronized void method1026(class62 arg0) {
        this.field1096.method3471(arg0);
    }

    @ObfuscatedName("aj.l(Lbo;)V")
    public final synchronized void method1032(class62 arg0) {
        arg0.method3564();
    }

    @ObfuscatedName("aj.g()V")
    public void method1028() {
        if (this.field1097 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field1095.method3499(); var1 != null; var1 = (class57) this.field1095.method3482()) {
            var1.field1153 -= this.field1097;
        }
        this.field1098 -= this.field1097;
        this.field1097 = 0;
    }

    @ObfuscatedName("aj.u(Lgj;Lbd;)V")
    public void method1029(class199 arg0, class57 arg1) {
        while (this.field1095.field2997 != arg0 && ((class57) arg0).field1153 <= arg1.field1153) {
            arg0 = arg0.field3013;
        }
        class190.method3472(arg1, arg0);
        this.field1098 = ((class57) this.field1095.field2997.field3013).field1153;
    }

    @ObfuscatedName("aj.q(Lbd;)V")
    public void method1030(class57 arg0) {
        arg0.method3564();
        arg0.method1152();
        class199 var2 = this.field1095.field2997.field3013;
        if (this.field1095.field2997 == var2) {
            this.field1098 = -1;
        } else {
            this.field1098 = ((class57) var2).field1153;
        }
    }

    @ObfuscatedName("aj.r()Lbo;")
    public class62 method1058() {
        return (class62) this.field1096.method3499();
    }

    @ObfuscatedName("aj.v()Lbo;")
    public class62 method1036() {
        return (class62) this.field1096.method3482();
    }

    @ObfuscatedName("aj.y()I")
    public int method1031() {
        return 0;
    }

    @ObfuscatedName("aj.k([III)V")
    public final synchronized void method1037(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1098 < 0) {
                this.method1034(arg0, arg1, arg2);
                return;
            }
            if (this.field1097 + arg2 < this.field1098) {
                this.field1097 += arg2;
                this.method1034(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1098 - this.field1097;
            this.method1034(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1097 += var4;
            this.method1028();
            class57 var5 = (class57) this.field1095.method3499();
            synchronized (var5) {
                int var7 = var5.method1151(this);
                if (var7 < 0) {
                    var5.field1153 = 0;
                    this.method1030(var5);
                } else {
                    var5.field1153 = var7;
                    this.method1029(var5.field3013, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aj.c([III)V")
    public void method1034(int[] arg0, int arg1, int arg2) {
        for (class62 var4 = (class62) this.field1096.method3499(); var4 != null; var4 = (class62) this.field1096.method3482()) {
            var4.method1303(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aj.j(I)V")
    public final synchronized void method1043(int arg0) {
        do {
            if (this.field1098 < 0) {
                this.method1050(arg0);
                return;
            }
            if (this.field1097 + arg0 < this.field1098) {
                this.field1097 += arg0;
                this.method1050(arg0);
                return;
            }
            int var2 = this.field1098 - this.field1097;
            this.method1050(var2);
            arg0 -= var2;
            this.field1097 += var2;
            this.method1028();
            class57 var3 = (class57) this.field1095.method3499();
            synchronized (var3) {
                int var5 = var3.method1151(this);
                if (var5 < 0) {
                    var3.field1153 = 0;
                    this.method1030(var3);
                } else {
                    var3.field1153 = var5;
                    this.method1029(var3.field3013, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aj.m(I)V")
    public void method1050(int arg0) {
        for (class62 var2 = (class62) this.field1096.method3499(); var2 != null; var2 = (class62) this.field1096.method3482()) {
            var2.method1043(arg0);
        }
    }
}
