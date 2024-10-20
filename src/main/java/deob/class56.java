package deob;

@ObfuscatedName("bd")
public class class56 extends class67 {

    @ObfuscatedName("bd.i")
    public class199 field1173 = new class199();

    @ObfuscatedName("bd.v")
    public class199 field1171 = new class199();

    @ObfuscatedName("bd.f")
    public int field1172 = 0;

    @ObfuscatedName("bd.h")
    public int field1170 = -1;

    @ObfuscatedName("bd.i(Lbe;)V")
    public final synchronized void method1075(class67 arg0) {
        this.field1173.method3531(arg0);
    }

    @ObfuscatedName("bd.v(Lbe;)V")
    public final synchronized void method1076(class67 arg0) {
        arg0.method3624();
    }

    @ObfuscatedName("bd.f()V")
    public void method1109() {
        if (this.field1172 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1171.method3535(); var1 != null; var1 = (class62) this.field1171.method3537()) {
            var1.field1224 -= this.field1172;
        }
        this.field1170 -= this.field1172;
        this.field1172 = 0;
    }

    @ObfuscatedName("bd.h(Lgp;Lbr;)V")
    public void method1078(class208 arg0, class62 arg1) {
        while (this.field1171.field3083 != arg0 && ((class62) arg0).field1224 <= arg1.field1224) {
            arg0 = arg0.field3098;
        }
        class199.method3550(arg1, arg0);
        this.field1170 = ((class62) this.field1171.field3083.field3098).field1224;
    }

    @ObfuscatedName("bd.a(Lbr;)V")
    public void method1102(class62 arg0) {
        arg0.method3624();
        arg0.method1195();
        class208 var2 = this.field1171.field3083.field3098;
        if (this.field1171.field3083 == var2) {
            this.field1170 = -1;
        } else {
            this.field1170 = ((class62) var2).field1224;
        }
    }

    @ObfuscatedName("bd.s()Lbe;")
    public class67 method1080() {
        return (class67) this.field1173.method3535();
    }

    @ObfuscatedName("bd.p()Lbe;")
    public class67 method1081() {
        return (class67) this.field1173.method3537();
    }

    @ObfuscatedName("bd.r()I")
    public int method1082() {
        return 0;
    }

    @ObfuscatedName("bd.k([III)V")
    public final synchronized void method1079(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1170 < 0) {
                this.method1084(arg0, arg1, arg2);
                return;
            }
            if (this.field1172 + arg2 < this.field1170) {
                this.field1172 += arg2;
                this.method1084(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1170 - this.field1172;
            this.method1084(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1172 += var4;
            this.method1109();
            class62 var5 = (class62) this.field1171.method3535();
            synchronized (var5) {
                int var7 = var5.method1196(this);
                if (var7 < 0) {
                    var5.field1224 = 0;
                    this.method1102(var5);
                } else {
                    var5.field1224 = var7;
                    this.method1078(var5.field3098, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bd.d([III)V")
    public void method1084(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1173.method3535(); var4 != null; var4 = (class67) this.field1173.method3537()) {
            var4.method1368(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bd.n(I)V")
    public final synchronized void method1074(int arg0) {
        do {
            if (this.field1170 < 0) {
                this.method1077(arg0);
                return;
            }
            if (this.field1172 + arg0 < this.field1170) {
                this.field1172 += arg0;
                this.method1077(arg0);
                return;
            }
            int var2 = this.field1170 - this.field1172;
            this.method1077(var2);
            arg0 -= var2;
            this.field1172 += var2;
            this.method1109();
            class62 var3 = (class62) this.field1171.method3535();
            synchronized (var3) {
                int var5 = var3.method1196(this);
                if (var5 < 0) {
                    var3.field1224 = 0;
                    this.method1102(var3);
                } else {
                    var3.field1224 = var5;
                    this.method1078(var3.field3098, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bd.z(I)V")
    public void method1077(int arg0) {
        for (class67 var2 = (class67) this.field1173.method3535(); var2 != null; var2 = (class67) this.field1173.method3537()) {
            var2.method1074(arg0);
        }
    }
}
