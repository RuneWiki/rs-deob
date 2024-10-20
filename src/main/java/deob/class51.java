package deob;

@ObfuscatedName("ak")
public class class51 extends class62 {

    @ObfuscatedName("ak.y")
    public class190 field1104 = new class190();

    @ObfuscatedName("ak.k")
    public class190 field1106 = new class190();

    @ObfuscatedName("ak.g")
    public int field1105 = 0;

    @ObfuscatedName("ak.n")
    public int field1107 = -1;

    @ObfuscatedName("ak.y(Lbk;)V")
    public final synchronized void method1045(class62 arg0) {
        this.field1104.method3415(arg0);
    }

    @ObfuscatedName("ak.k(Lbk;)V")
    public final synchronized void method1035(class62 arg0) {
        arg0.method3482();
    }

    @ObfuscatedName("ak.g()V")
    public void method1019() {
        if (this.field1105 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field1106.method3396(); var1 != null; var1 = (class57) this.field1106.method3398()) {
            var1.field1159 -= this.field1105;
        }
        this.field1107 -= this.field1105;
        this.field1105 = 0;
    }

    @ObfuscatedName("ak.n(Lgb;Lbj;)V")
    public void method1004(class199 arg0, class57 arg1) {
        while (this.field1106.field3009 != arg0 && ((class57) arg0).field1159 <= arg1.field1159) {
            arg0 = arg0.field3025;
        }
        class190.method3423(arg1, arg0);
        this.field1107 = ((class57) this.field1106.field3009.field3025).field1159;
    }

    @ObfuscatedName("ak.t(Lbj;)V")
    public void method1033(class57 arg0) {
        arg0.method3482();
        arg0.method1128();
        class199 var2 = this.field1106.field3009.field3025;
        if (this.field1106.field3009 == var2) {
            this.field1107 = -1;
        } else {
            this.field1107 = ((class57) var2).field1159;
        }
    }

    @ObfuscatedName("ak.e()Lbk;")
    public class62 method1009() {
        return (class62) this.field1104.method3396();
    }

    @ObfuscatedName("ak.q()Lbk;")
    public class62 method1007() {
        return (class62) this.field1104.method3398();
    }

    @ObfuscatedName("ak.z()I")
    public int method1006() {
        return 0;
    }

    @ObfuscatedName("ak.v([III)V")
    public final synchronized void method1005(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1107 < 0) {
                this.method1008(arg0, arg1, arg2);
                return;
            }
            if (this.field1105 + arg2 < this.field1107) {
                this.field1105 += arg2;
                this.method1008(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1107 - this.field1105;
            this.method1008(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1105 += var4;
            this.method1019();
            class57 var5 = (class57) this.field1106.method3396();
            synchronized (var5) {
                int var7 = var5.method1134(this);
                if (var7 < 0) {
                    var5.field1159 = 0;
                    this.method1033(var5);
                } else {
                    var5.field1159 = var7;
                    this.method1004(var5.field3025, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ak.b([III)V")
    public void method1008(int[] arg0, int arg1, int arg2) {
        for (class62 var4 = (class62) this.field1104.method3396(); var4 != null; var4 = (class62) this.field1104.method3398()) {
            var4.method1294(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ak.f(I)V")
    public final synchronized void method1011(int arg0) {
        do {
            if (this.field1107 < 0) {
                this.method1012(arg0);
                return;
            }
            if (this.field1105 + arg0 < this.field1107) {
                this.field1105 += arg0;
                this.method1012(arg0);
                return;
            }
            int var2 = this.field1107 - this.field1105;
            this.method1012(var2);
            arg0 -= var2;
            this.field1105 += var2;
            this.method1019();
            class57 var3 = (class57) this.field1106.method3396();
            synchronized (var3) {
                int var5 = var3.method1134(this);
                if (var5 < 0) {
                    var3.field1159 = 0;
                    this.method1033(var3);
                } else {
                    var3.field1159 = var5;
                    this.method1004(var3.field3025, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ak.i(I)V")
    public void method1012(int arg0) {
        for (class62 var2 = (class62) this.field1104.method3396(); var2 != null; var2 = (class62) this.field1104.method3398()) {
            var2.method1011(arg0);
        }
    }
}
