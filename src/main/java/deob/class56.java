package deob;

@ObfuscatedName("bg")
public class class56 extends class67 {

    @ObfuscatedName("bg.j")
    public class199 field1180 = new class199();

    @ObfuscatedName("bg.l")
    public class199 field1179 = new class199();

    @ObfuscatedName("bg.a")
    public int field1178 = 0;

    @ObfuscatedName("bg.i")
    public int field1181 = -1;

    @ObfuscatedName("bg.j(Lbf;)V")
    public final synchronized void method1137(class67 arg0) {
        this.field1180.method3524(arg0);
    }

    @ObfuscatedName("bg.l(Lbf;)V")
    public final synchronized void method1122(class67 arg0) {
        arg0.method3608();
    }

    @ObfuscatedName("bg.a()V")
    public void method1123() {
        if (this.field1178 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1179.method3528(); var1 != null; var1 = (class62) this.field1179.method3527()) {
            var1.field1238 -= this.field1178;
        }
        this.field1181 -= this.field1178;
        this.field1178 = 0;
    }

    @ObfuscatedName("bg.i(Lgu;Lbc;)V")
    public void method1133(class208 arg0, class62 arg1) {
        while (this.field1179.field3096 != arg0 && ((class62) arg0).field1238 <= arg1.field1238) {
            arg0 = arg0.field3112;
        }
        class199.method3521(arg1, arg0);
        this.field1181 = ((class62) this.field1179.field3096.field3112).field1238;
    }

    @ObfuscatedName("bg.f(Lbc;)V")
    public void method1125(class62 arg0) {
        arg0.method3608();
        arg0.method1235();
        class208 var2 = this.field1179.field3096.field3112;
        if (this.field1179.field3096 == var2) {
            this.field1181 = -1;
        } else {
            this.field1181 = ((class62) var2).field1238;
        }
    }

    @ObfuscatedName("bg.m()Lbf;")
    public class67 method1126() {
        return (class67) this.field1180.method3528();
    }

    @ObfuscatedName("bg.o()Lbf;")
    public class67 method1138() {
        return (class67) this.field1180.method3527();
    }

    @ObfuscatedName("bg.h()I")
    public int method1121() {
        return 0;
    }

    @ObfuscatedName("bg.n([III)V")
    public final synchronized void method1129(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1181 < 0) {
                this.method1130(arg0, arg1, arg2);
                return;
            }
            if (this.field1178 + arg2 < this.field1181) {
                this.field1178 += arg2;
                this.method1130(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1181 - this.field1178;
            this.method1130(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1178 += var4;
            this.method1123();
            class62 var5 = (class62) this.field1179.method3528();
            synchronized (var5) {
                int var7 = var5.method1236(this);
                if (var7 < 0) {
                    var5.field1238 = 0;
                    this.method1125(var5);
                } else {
                    var5.field1238 = var7;
                    this.method1133(var5.field3112, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bg.k([III)V")
    public void method1130(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1180.method3528(); var4 != null; var4 = (class67) this.field1180.method3527()) {
            var4.method1401(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bg.r(I)V")
    public final synchronized void method1131(int arg0) {
        do {
            if (this.field1181 < 0) {
                this.method1128(arg0);
                return;
            }
            if (this.field1178 + arg0 < this.field1181) {
                this.field1178 += arg0;
                this.method1128(arg0);
                return;
            }
            int var2 = this.field1181 - this.field1178;
            this.method1128(var2);
            arg0 -= var2;
            this.field1178 += var2;
            this.method1123();
            class62 var3 = (class62) this.field1179.method3528();
            synchronized (var3) {
                int var5 = var3.method1236(this);
                if (var5 < 0) {
                    var3.field1238 = 0;
                    this.method1125(var3);
                } else {
                    var3.field1238 = var5;
                    this.method1133(var3.field3112, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bg.b(I)V")
    public void method1128(int arg0) {
        for (class67 var2 = (class67) this.field1180.method3528(); var2 != null; var2 = (class67) this.field1180.method3527()) {
            var2.method1131(arg0);
        }
    }
}
