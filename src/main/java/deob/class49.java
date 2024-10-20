package deob;

@ObfuscatedName("ac")
public class class49 extends class60 {

    @ObfuscatedName("ac.k")
    public class177 field1073 = new class177();

    @ObfuscatedName("ac.r")
    public class177 field1072 = new class177();

    @ObfuscatedName("ac.y")
    public int field1070 = 0;

    @ObfuscatedName("ac.m")
    public int field1071 = -1;

    @ObfuscatedName("ac.k(Lbz;)V")
    public final synchronized void method967(class60 arg0) {
        this.field1073.method3191(arg0);
    }

    @ObfuscatedName("ac.r(Lbz;)V")
    public final synchronized void method977(class60 arg0) {
        arg0.method3275();
    }

    @ObfuscatedName("ac.y()V")
    public void method979() {
        if (this.field1070 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1072.method3195(); var1 != null; var1 = (class55) this.field1072.method3212()) {
            var1.field1128 -= this.field1070;
        }
        this.field1071 -= this.field1070;
        this.field1070 = 0;
    }

    @ObfuscatedName("ac.w(Lgo;Lbn;)V")
    public void method986(class186 arg0, class55 arg1) {
        while (this.field1072.field2859 != arg0 && ((class55) arg0).field1128 <= arg1.field1128) {
            arg0 = arg0.field2875;
        }
        class177.method3192(arg1, arg0);
        this.field1071 = ((class55) this.field1072.field2859.field2875).field1128;
    }

    @ObfuscatedName("ac.m(Lbn;)V")
    public void method997(class55 arg0) {
        arg0.method3275();
        arg0.method1082();
        class186 var2 = this.field1072.field2859.field2875;
        if (this.field1072.field2859 == var2) {
            this.field1071 = -1;
        } else {
            this.field1071 = ((class55) var2).field1128;
        }
    }

    @ObfuscatedName("ac.j()Lbz;")
    public class60 method991() {
        return (class60) this.field1073.method3195();
    }

    @ObfuscatedName("ac.g()Lbz;")
    public class60 method969() {
        return (class60) this.field1073.method3212();
    }

    @ObfuscatedName("ac.p()I")
    public int method974() {
        return 0;
    }

    @ObfuscatedName("ac.o([III)V")
    public final synchronized void method1004(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1071 < 0) {
                this.method975(arg0, arg1, arg2);
                return;
            }
            if (this.field1070 + arg2 < this.field1071) {
                this.field1070 += arg2;
                this.method975(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1071 - this.field1070;
            this.method975(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1070 += var4;
            this.method979();
            class55 var5 = (class55) this.field1072.method3195();
            synchronized (var5) {
                int var7 = var5.method1081(this);
                if (var7 < 0) {
                    var5.field1128 = 0;
                    this.method997(var5);
                } else {
                    var5.field1128 = var7;
                    this.method986(var5.field2875, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ac.b([III)V")
    public void method975(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1073.method3195(); var4 != null; var4 = (class60) this.field1073.method3212()) {
            var4.method1259(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ac.x(I)V")
    public final synchronized void method976(int arg0) {
        do {
            if (this.field1071 < 0) {
                this.method993(arg0);
                return;
            }
            if (this.field1070 + arg0 < this.field1071) {
                this.field1070 += arg0;
                this.method993(arg0);
                return;
            }
            int var2 = this.field1071 - this.field1070;
            this.method993(var2);
            arg0 -= var2;
            this.field1070 += var2;
            this.method979();
            class55 var3 = (class55) this.field1072.method3195();
            synchronized (var3) {
                int var5 = var3.method1081(this);
                if (var5 < 0) {
                    var3.field1128 = 0;
                    this.method997(var3);
                } else {
                    var3.field1128 = var5;
                    this.method986(var3.field2875, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ac.n(I)V")
    public void method993(int arg0) {
        for (class60 var2 = (class60) this.field1073.method3195(); var2 != null; var2 = (class60) this.field1073.method3212()) {
            var2.method976(arg0);
        }
    }
}
