package deob;

@ObfuscatedName("bk")
public class class56 extends class67 {

    @ObfuscatedName("bk.c")
    public class199 field1172 = new class199();

    @ObfuscatedName("bk.h")
    public class199 field1170 = new class199();

    @ObfuscatedName("bk.k")
    public int field1171 = 0;

    @ObfuscatedName("bk.t")
    public int field1169 = -1;

    @ObfuscatedName("bk.c(Lbv;)V")
    public final synchronized void method1092(class67 arg0) {
        this.field1172.method3577(arg0);
    }

    @ObfuscatedName("bk.h(Lbv;)V")
    public final synchronized void method1093(class67 arg0) {
        arg0.method3646();
    }

    @ObfuscatedName("bk.k()V")
    public void method1094() {
        if (this.field1171 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1170.method3558(); var1 != null; var1 = (class62) this.field1170.method3554()) {
            var1.field1223 -= this.field1171;
        }
        this.field1169 -= this.field1171;
        this.field1171 = 0;
    }

    @ObfuscatedName("bk.t(Lgc;Lbm;)V")
    public void method1095(class208 arg0, class62 arg1) {
        while (this.field1170.field3081 != arg0 && ((class62) arg0).field1223 <= arg1.field1223) {
            arg0 = arg0.field3097;
        }
        class199.method3551(arg1, arg0);
        this.field1169 = ((class62) this.field1170.field3081.field3097).field1223;
    }

    @ObfuscatedName("bk.g(Lbm;)V")
    public void method1096(class62 arg0) {
        arg0.method3646();
        arg0.method1227();
        class208 var2 = this.field1170.field3081.field3097;
        if (this.field1170.field3081 == var2) {
            this.field1169 = -1;
        } else {
            this.field1169 = ((class62) var2).field1223;
        }
    }

    @ObfuscatedName("bk.o()Lbv;")
    public class67 method1110() {
        return (class67) this.field1172.method3558();
    }

    @ObfuscatedName("bk.i()Lbv;")
    public class67 method1098() {
        return (class67) this.field1172.method3554();
    }

    @ObfuscatedName("bk.w()I")
    public int method1124() {
        return 0;
    }

    @ObfuscatedName("bk.m([III)V")
    public final synchronized void method1100(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1169 < 0) {
                this.method1101(arg0, arg1, arg2);
                return;
            }
            if (this.field1171 + arg2 < this.field1169) {
                this.field1171 += arg2;
                this.method1101(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1169 - this.field1171;
            this.method1101(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1171 += var4;
            this.method1094();
            class62 var5 = (class62) this.field1170.method3558();
            synchronized (var5) {
                int var7 = var5.method1224(this);
                if (var7 < 0) {
                    var5.field1223 = 0;
                    this.method1096(var5);
                } else {
                    var5.field1223 = var7;
                    this.method1095(var5.field3097, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bk.r([III)V")
    public void method1101(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1172.method3558(); var4 != null; var4 = (class67) this.field1172.method3554()) {
            var4.method1395(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bk.y(I)V")
    public final synchronized void method1109(int arg0) {
        do {
            if (this.field1169 < 0) {
                this.method1103(arg0);
                return;
            }
            if (this.field1171 + arg0 < this.field1169) {
                this.field1171 += arg0;
                this.method1103(arg0);
                return;
            }
            int var2 = this.field1169 - this.field1171;
            this.method1103(var2);
            arg0 -= var2;
            this.field1171 += var2;
            this.method1094();
            class62 var3 = (class62) this.field1170.method3558();
            synchronized (var3) {
                int var5 = var3.method1224(this);
                if (var5 < 0) {
                    var3.field1223 = 0;
                    this.method1096(var3);
                } else {
                    var3.field1223 = var5;
                    this.method1095(var3.field3097, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bk.q(I)V")
    public void method1103(int arg0) {
        for (class67 var2 = (class67) this.field1172.method3558(); var2 != null; var2 = (class67) this.field1172.method3554()) {
            var2.method1109(arg0);
        }
    }
}
