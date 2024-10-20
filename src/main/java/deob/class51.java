package deob;

@ObfuscatedName("ap")
public class class51 extends class62 {

    @ObfuscatedName("ap.n")
    public class190 field1127 = new class190();

    @ObfuscatedName("ap.g")
    public class190 field1128 = new class190();

    @ObfuscatedName("ap.a")
    public int field1129 = 0;

    @ObfuscatedName("ap.m")
    public int field1130 = -1;

    @ObfuscatedName("ap.n(Lbh;)V")
    public final synchronized void method993(class62 arg0) {
        this.field1127.method3464(arg0);
    }

    @ObfuscatedName("ap.g(Lbh;)V")
    public final synchronized void method994(class62 arg0) {
        arg0.method3554();
    }

    @ObfuscatedName("ap.a()V")
    public void method995() {
        if (this.field1129 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field1128.method3468(); var1 != null; var1 = (class57) this.field1128.method3470()) {
            var1.field1185 -= this.field1129;
        }
        this.field1130 -= this.field1129;
        this.field1129 = 0;
    }

    @ObfuscatedName("ap.m(Lgg;Lbm;)V")
    public void method1007(class199 arg0, class57 arg1) {
        while (this.field1128.field3001 != arg0 && ((class57) arg0).field1185 <= arg1.field1185) {
            arg0 = arg0.field3017;
        }
        class190.method3465(arg1, arg0);
        this.field1130 = ((class57) this.field1128.field3001.field3017).field1185;
    }

    @ObfuscatedName("ap.s(Lbm;)V")
    public void method997(class57 arg0) {
        arg0.method3554();
        arg0.method1132();
        class199 var2 = this.field1128.field3001.field3017;
        if (this.field1128.field3001 == var2) {
            this.field1130 = -1;
        } else {
            this.field1130 = ((class57) var2).field1185;
        }
    }

    @ObfuscatedName("ap.j()Lbh;")
    public class62 method998() {
        return (class62) this.field1127.method3468();
    }

    @ObfuscatedName("ap.f()Lbh;")
    public class62 method999() {
        return (class62) this.field1127.method3470();
    }

    @ObfuscatedName("ap.b()I")
    public int method1000() {
        return 0;
    }

    @ObfuscatedName("ap.t([III)V")
    public final synchronized void method1001(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1130 < 0) {
                this.method1015(arg0, arg1, arg2);
                return;
            }
            if (this.field1129 + arg2 < this.field1130) {
                this.field1129 += arg2;
                this.method1015(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1130 - this.field1129;
            this.method1015(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1129 += var4;
            this.method995();
            class57 var5 = (class57) this.field1128.method3468();
            synchronized (var5) {
                int var7 = var5.method1133(this);
                if (var7 < 0) {
                    var5.field1185 = 0;
                    this.method997(var5);
                } else {
                    var5.field1185 = var7;
                    this.method1007(var5.field3017, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ap.i([III)V")
    public void method1015(int[] arg0, int arg1, int arg2) {
        for (class62 var4 = (class62) this.field1127.method3468(); var4 != null; var4 = (class62) this.field1127.method3470()) {
            var4.method1315(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ap.c(I)V")
    public final synchronized void method1022(int arg0) {
        do {
            if (this.field1130 < 0) {
                this.method1004(arg0);
                return;
            }
            if (this.field1129 + arg0 < this.field1130) {
                this.field1129 += arg0;
                this.method1004(arg0);
                return;
            }
            int var2 = this.field1130 - this.field1129;
            this.method1004(var2);
            arg0 -= var2;
            this.field1129 += var2;
            this.method995();
            class57 var3 = (class57) this.field1128.method3468();
            synchronized (var3) {
                int var5 = var3.method1133(this);
                if (var5 < 0) {
                    var3.field1185 = 0;
                    this.method997(var3);
                } else {
                    var3.field1185 = var5;
                    this.method1007(var3.field3017, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ap.k(I)V")
    public void method1004(int arg0) {
        for (class62 var2 = (class62) this.field1127.method3468(); var2 != null; var2 = (class62) this.field1127.method3470()) {
            var2.method1022(arg0);
        }
    }
}
