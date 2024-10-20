package deob;

@ObfuscatedName("au")
public class class51 extends class62 {

    @ObfuscatedName("au.n")
    public class190 field1105 = new class190();

    @ObfuscatedName("au.d")
    public class190 field1106 = new class190();

    @ObfuscatedName("au.z")
    public int field1108 = 0;

    @ObfuscatedName("au.y")
    public int field1107 = -1;

    @ObfuscatedName("au.n(Lbu;)V")
    public final synchronized void method1021(class62 arg0) {
        this.field1105.method3478(arg0);
    }

    @ObfuscatedName("au.d(Lbu;)V")
    public final synchronized void method1005(class62 arg0) {
        arg0.method3562();
    }

    @ObfuscatedName("au.z()V")
    public void method1006() {
        if (this.field1108 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field1106.method3497(); var1 != null; var1 = (class57) this.field1106.method3475()) {
            var1.field1164 -= this.field1108;
        }
        this.field1107 -= this.field1108;
        this.field1108 = 0;
    }

    @ObfuscatedName("au.y(Lga;Lbj;)V")
    public void method1007(class199 arg0, class57 arg1) {
        while (this.field1106.field2991 != arg0 && ((class57) arg0).field1164 <= arg1.field1164) {
            arg0 = arg0.field3008;
        }
        class190.method3479(arg1, arg0);
        this.field1107 = ((class57) this.field1106.field2991.field3008).field1164;
    }

    @ObfuscatedName("au.e(Lbj;)V")
    public void method1008(class57 arg0) {
        arg0.method3562();
        arg0.method1132();
        class199 var2 = this.field1106.field2991.field3008;
        if (this.field1106.field2991 == var2) {
            this.field1107 = -1;
        } else {
            this.field1107 = ((class57) var2).field1164;
        }
    }

    @ObfuscatedName("au.g()Lbu;")
    public class62 method1020() {
        return (class62) this.field1105.method3497();
    }

    @ObfuscatedName("au.f()Lbu;")
    public class62 method1046() {
        return (class62) this.field1105.method3475();
    }

    @ObfuscatedName("au.m()I")
    public int method1009() {
        return 0;
    }

    @ObfuscatedName("au.a([III)V")
    public final synchronized void method1012(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1107 < 0) {
                this.method1036(arg0, arg1, arg2);
                return;
            }
            if (this.field1108 + arg2 < this.field1107) {
                this.field1108 += arg2;
                this.method1036(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1107 - this.field1108;
            this.method1036(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1108 += var4;
            this.method1006();
            class57 var5 = (class57) this.field1106.method3497();
            synchronized (var5) {
                int var7 = var5.method1134(this);
                if (var7 < 0) {
                    var5.field1164 = 0;
                    this.method1008(var5);
                } else {
                    var5.field1164 = var7;
                    this.method1007(var5.field3008, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("au.h([III)V")
    public void method1036(int[] arg0, int arg1, int arg2) {
        for (class62 var4 = (class62) this.field1105.method3497(); var4 != null; var4 = (class62) this.field1105.method3475()) {
            var4.method1305(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("au.l(I)V")
    public final synchronized void method1014(int arg0) {
        do {
            if (this.field1107 < 0) {
                this.method1039(arg0);
                return;
            }
            if (this.field1108 + arg0 < this.field1107) {
                this.field1108 += arg0;
                this.method1039(arg0);
                return;
            }
            int var2 = this.field1107 - this.field1108;
            this.method1039(var2);
            arg0 -= var2;
            this.field1108 += var2;
            this.method1006();
            class57 var3 = (class57) this.field1106.method3497();
            synchronized (var3) {
                int var5 = var3.method1134(this);
                if (var5 < 0) {
                    var3.field1164 = 0;
                    this.method1008(var3);
                } else {
                    var3.field1164 = var5;
                    this.method1007(var3.field3008, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("au.u(I)V")
    public void method1039(int arg0) {
        for (class62 var2 = (class62) this.field1105.method3497(); var2 != null; var2 = (class62) this.field1105.method3475()) {
            var2.method1014(arg0);
        }
    }
}
