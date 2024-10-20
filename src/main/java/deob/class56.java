package deob;

@ObfuscatedName("bq")
public class class56 extends class67 {

    @ObfuscatedName("bq.n")
    public class199 field1159 = new class199();

    @ObfuscatedName("bq.d")
    public class199 field1158 = new class199();

    @ObfuscatedName("bq.s")
    public int field1160 = 0;

    @ObfuscatedName("bq.q")
    public int field1161 = -1;

    @ObfuscatedName("bq.n(Lbj;)V")
    public final synchronized void method1099(class67 arg0) {
        this.field1159.method3549(arg0);
    }

    @ObfuscatedName("bq.d(Lbj;)V")
    public final synchronized void method1098(class67 arg0) {
        arg0.method3651();
    }

    @ObfuscatedName("bq.s()V")
    public void method1129() {
        if (this.field1160 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1158.method3574(); var1 != null; var1 = (class62) this.field1158.method3568()) {
            var1.field1216 -= this.field1160;
        }
        this.field1161 -= this.field1160;
        this.field1160 = 0;
    }

    @ObfuscatedName("bq.q(Lge;Lbo;)V")
    public void method1102(class208 arg0, class62 arg1) {
        while (this.field1158.field3080 != arg0 && ((class62) arg0).field1216 <= arg1.field1216) {
            arg0 = arg0.field3097;
        }
        class199.method3550(arg1, arg0);
        this.field1161 = ((class62) this.field1158.field3080.field3097).field1216;
    }

    @ObfuscatedName("bq.j(Lbo;)V")
    public void method1105(class62 arg0) {
        arg0.method3651();
        arg0.method1208();
        class208 var2 = this.field1158.field3080.field3097;
        if (this.field1158.field3080 == var2) {
            this.field1161 = -1;
        } else {
            this.field1161 = ((class62) var2).field1216;
        }
    }

    @ObfuscatedName("bq.k()Lbj;")
    public class67 method1104() {
        return (class67) this.field1159.method3574();
    }

    @ObfuscatedName("bq.i()Lbj;")
    public class67 method1121() {
        return (class67) this.field1159.method3568();
    }

    @ObfuscatedName("bq.m()I")
    public int method1106() {
        return 0;
    }

    @ObfuscatedName("bq.p([III)V")
    public final synchronized void method1107(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1161 < 0) {
                this.method1131(arg0, arg1, arg2);
                return;
            }
            if (this.field1160 + arg2 < this.field1161) {
                this.field1160 += arg2;
                this.method1131(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1161 - this.field1160;
            this.method1131(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1160 += var4;
            this.method1129();
            class62 var5 = (class62) this.field1158.method3574();
            synchronized (var5) {
                int var7 = var5.method1210(this);
                if (var7 < 0) {
                    var5.field1216 = 0;
                    this.method1105(var5);
                } else {
                    var5.field1216 = var7;
                    this.method1102(var5.field3097, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bq.h([III)V")
    public void method1131(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1159.method3574(); var4 != null; var4 = (class67) this.field1159.method3568()) {
            var4.method1369(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bq.e(I)V")
    public final synchronized void method1109(int arg0) {
        do {
            if (this.field1161 < 0) {
                this.method1110(arg0);
                return;
            }
            if (this.field1160 + arg0 < this.field1161) {
                this.field1160 += arg0;
                this.method1110(arg0);
                return;
            }
            int var2 = this.field1161 - this.field1160;
            this.method1110(var2);
            arg0 -= var2;
            this.field1160 += var2;
            this.method1129();
            class62 var3 = (class62) this.field1158.method3574();
            synchronized (var3) {
                int var5 = var3.method1210(this);
                if (var5 < 0) {
                    var3.field1216 = 0;
                    this.method1105(var3);
                } else {
                    var3.field1216 = var5;
                    this.method1102(var3.field3097, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bq.g(I)V")
    public void method1110(int arg0) {
        for (class67 var2 = (class67) this.field1159.method3574(); var2 != null; var2 = (class67) this.field1159.method3568()) {
            var2.method1109(arg0);
        }
    }
}
