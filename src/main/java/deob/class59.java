package deob;

@ObfuscatedName("bn")
public class class59 extends class70 {

    @ObfuscatedName("bn.f")
    public class203 field1216 = new class203();

    @ObfuscatedName("bn.e")
    public class203 field1215 = new class203();

    @ObfuscatedName("bn.n")
    public int field1217 = 0;

    @ObfuscatedName("bn.t")
    public int field1218 = -1;

    @ObfuscatedName("bn.f(Lbx;)V")
    public final synchronized void method1164(class70 arg0) {
        this.field1216.method3666(arg0);
    }

    @ObfuscatedName("bn.e(Lbx;)V")
    public final synchronized void method1153(class70 arg0) {
        arg0.method3744();
    }

    @ObfuscatedName("bn.n()V")
    public void method1154() {
        if (this.field1217 <= 0) {
            return;
        }
        for (class65 var1 = (class65) this.field1215.method3646(); var1 != null; var1 = (class65) this.field1215.method3648()) {
            var1.field1277 -= this.field1217;
        }
        this.field1218 -= this.field1217;
        this.field1217 = 0;
    }

    @ObfuscatedName("bn.t(Lhs;Lbg;)V")
    public void method1160(class212 arg0, class65 arg1) {
        while (this.field1215.field3149 != arg0 && ((class65) arg0).field1277 <= arg1.field1277) {
            arg0 = arg0.field3166;
        }
        class203.method3644(arg1, arg0);
        this.field1218 = ((class65) this.field1215.field3149.field3166).field1277;
    }

    @ObfuscatedName("bn.v(Lbg;)V")
    public void method1169(class65 arg0) {
        arg0.method3744();
        arg0.method1302();
        class212 var2 = this.field1215.field3149.field3166;
        if (this.field1215.field3149 == var2) {
            this.field1218 = -1;
        } else {
            this.field1218 = ((class65) var2).field1277;
        }
    }

    @ObfuscatedName("bn.b()Lbx;")
    public class70 method1156() {
        return (class70) this.field1216.method3646();
    }

    @ObfuscatedName("bn.m()Lbx;")
    public class70 method1157() {
        return (class70) this.field1216.method3648();
    }

    @ObfuscatedName("bn.k()I")
    public int method1158() {
        return 0;
    }

    @ObfuscatedName("bn.c([III)V")
    public final synchronized void method1159(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1218 < 0) {
                this.method1155(arg0, arg1, arg2);
                return;
            }
            if (this.field1217 + arg2 < this.field1218) {
                this.field1217 += arg2;
                this.method1155(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1218 - this.field1217;
            this.method1155(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1217 += var4;
            this.method1154();
            class65 var5 = (class65) this.field1215.method3646();
            synchronized (var5) {
                int var7 = var5.method1303(this);
                if (var7 < 0) {
                    var5.field1277 = 0;
                    this.method1169(var5);
                } else {
                    var5.field1277 = var7;
                    this.method1160(var5.field3166, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bn.w([III)V")
    public void method1155(int[] arg0, int arg1, int arg2) {
        for (class70 var4 = (class70) this.field1216.method3646(); var4 != null; var4 = (class70) this.field1216.method3648()) {
            var4.method1471(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bn.l(I)V")
    public final synchronized void method1161(int arg0) {
        do {
            if (this.field1218 < 0) {
                this.method1162(arg0);
                return;
            }
            if (this.field1217 + arg0 < this.field1218) {
                this.field1217 += arg0;
                this.method1162(arg0);
                return;
            }
            int var2 = this.field1218 - this.field1217;
            this.method1162(var2);
            arg0 -= var2;
            this.field1217 += var2;
            this.method1154();
            class65 var3 = (class65) this.field1215.method3646();
            synchronized (var3) {
                int var5 = var3.method1303(this);
                if (var5 < 0) {
                    var3.field1277 = 0;
                    this.method1169(var3);
                } else {
                    var3.field1277 = var5;
                    this.method1160(var3.field3166, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bn.h(I)V")
    public void method1162(int arg0) {
        for (class70 var2 = (class70) this.field1216.method3646(); var2 != null; var2 = (class70) this.field1216.method3648()) {
            var2.method1161(arg0);
        }
    }
}
