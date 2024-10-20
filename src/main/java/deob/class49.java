package deob;

@ObfuscatedName("aa")
public class class49 extends class60 {

    @ObfuscatedName("aa.k")
    public class177 field1073 = new class177();

    @ObfuscatedName("aa.b")
    public class177 field1071 = new class177();

    @ObfuscatedName("aa.e")
    public int field1070 = 0;

    @ObfuscatedName("aa.i")
    public int field1072 = -1;

    @ObfuscatedName("aa.k(Lbh;)V")
    public final synchronized void method958(class60 arg0) {
        this.field1073.method3224(arg0);
    }

    @ObfuscatedName("aa.b(Lbh;)V")
    public final synchronized void method944(class60 arg0) {
        arg0.method3321();
    }

    @ObfuscatedName("aa.e()V")
    public void method963() {
        if (this.field1070 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1071.method3228(); var1 != null; var1 = (class55) this.field1071.method3254()) {
            var1.field1127 -= this.field1070;
        }
        this.field1072 -= this.field1070;
        this.field1070 = 0;
    }

    @ObfuscatedName("aa.i(Lgy;Lbm;)V")
    public void method946(class186 arg0, class55 arg1) {
        while (this.field1071.field2851 != arg0 && ((class55) arg0).field1127 <= arg1.field1127) {
            arg0 = arg0.field2866;
        }
        class177.method3225(arg1, arg0);
        this.field1072 = ((class55) this.field1071.field2851.field2866).field1127;
    }

    @ObfuscatedName("aa.t(Lbm;)V")
    public void method947(class55 arg0) {
        arg0.method3321();
        arg0.method1066();
        class186 var2 = this.field1071.field2851.field2866;
        if (this.field1071.field2851 == var2) {
            this.field1072 = -1;
        } else {
            this.field1072 = ((class55) var2).field1127;
        }
    }

    @ObfuscatedName("aa.z()Lbh;")
    public class60 method948() {
        return (class60) this.field1073.method3228();
    }

    @ObfuscatedName("aa.g()Lbh;")
    public class60 method942() {
        return (class60) this.field1073.method3254();
    }

    @ObfuscatedName("aa.c()I")
    public int method951() {
        return 0;
    }

    @ObfuscatedName("aa.o([III)V")
    public final synchronized void method979(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1072 < 0) {
                this.method970(arg0, arg1, arg2);
                return;
            }
            if (this.field1070 + arg2 < this.field1072) {
                this.field1070 += arg2;
                this.method970(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1072 - this.field1070;
            this.method970(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1070 += var4;
            this.method963();
            class55 var5 = (class55) this.field1071.method3228();
            synchronized (var5) {
                int var7 = var5.method1067(this);
                if (var7 < 0) {
                    var5.field1127 = 0;
                    this.method947(var5);
                } else {
                    var5.field1127 = var7;
                    this.method946(var5.field2866, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aa.q([III)V")
    public void method970(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1073.method3228(); var4 != null; var4 = (class60) this.field1073.method3254()) {
            var4.method1240(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aa.w(I)V")
    public final synchronized void method943(int arg0) {
        do {
            if (this.field1072 < 0) {
                this.method950(arg0);
                return;
            }
            if (this.field1070 + arg0 < this.field1072) {
                this.field1070 += arg0;
                this.method950(arg0);
                return;
            }
            int var2 = this.field1072 - this.field1070;
            this.method950(var2);
            arg0 -= var2;
            this.field1070 += var2;
            this.method963();
            class55 var3 = (class55) this.field1071.method3228();
            synchronized (var3) {
                int var5 = var3.method1067(this);
                if (var5 < 0) {
                    var3.field1127 = 0;
                    this.method947(var3);
                } else {
                    var3.field1127 = var5;
                    this.method946(var3.field2866, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aa.y(I)V")
    public void method950(int arg0) {
        for (class60 var2 = (class60) this.field1073.method3228(); var2 != null; var2 = (class60) this.field1073.method3254()) {
            var2.method943(arg0);
        }
    }
}
