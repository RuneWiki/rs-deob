package deob;

@ObfuscatedName("bp")
public class class56 extends class67 {

    @ObfuscatedName("bp.a")
    public class199 field1172 = new class199();

    @ObfuscatedName("bp.r")
    public class199 field1170 = new class199();

    @ObfuscatedName("bp.f")
    public int field1169 = 0;

    @ObfuscatedName("bp.s")
    public int field1171 = -1;

    @ObfuscatedName("bp.a(Lbe;)V")
    public final synchronized void method1127(class67 arg0) {
        this.field1172.method3571(arg0);
    }

    @ObfuscatedName("bp.r(Lbe;)V")
    public final synchronized void method1128(class67 arg0) {
        arg0.method3661();
    }

    @ObfuscatedName("bp.f()V")
    public void method1129() {
        if (this.field1169 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1170.method3575(); var1 != null; var1 = (class62) this.field1170.method3576()) {
            var1.field1230 -= this.field1169;
        }
        this.field1171 -= this.field1169;
        this.field1169 = 0;
    }

    @ObfuscatedName("bp.s(Lgs;Lbs;)V")
    public void method1162(class208 arg0, class62 arg1) {
        while (this.field1170.field3095 != arg0 && ((class62) arg0).field1230 <= arg1.field1230) {
            arg0 = arg0.field3111;
        }
        class199.method3590(arg1, arg0);
        this.field1171 = ((class62) this.field1170.field3095.field3111).field1230;
    }

    @ObfuscatedName("bp.y(Lbs;)V")
    public void method1137(class62 arg0) {
        arg0.method3661();
        arg0.method1247();
        class208 var2 = this.field1170.field3095.field3111;
        if (this.field1170.field3095 == var2) {
            this.field1171 = -1;
        } else {
            this.field1171 = ((class62) var2).field1230;
        }
    }

    @ObfuscatedName("bp.e()Lbe;")
    public class67 method1131() {
        return (class67) this.field1172.method3575();
    }

    @ObfuscatedName("bp.g()Lbe;")
    public class67 method1165() {
        return (class67) this.field1172.method3576();
    }

    @ObfuscatedName("bp.m()I")
    public int method1132() {
        return 0;
    }

    @ObfuscatedName("bp.j([III)V")
    public final synchronized void method1134(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1171 < 0) {
                this.method1135(arg0, arg1, arg2);
                return;
            }
            if (this.field1169 + arg2 < this.field1171) {
                this.field1169 += arg2;
                this.method1135(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1171 - this.field1169;
            this.method1135(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1169 += var4;
            this.method1129();
            class62 var5 = (class62) this.field1170.method3575();
            synchronized (var5) {
                int var7 = var5.method1249(this);
                if (var7 < 0) {
                    var5.field1230 = 0;
                    this.method1137(var5);
                } else {
                    var5.field1230 = var7;
                    this.method1162(var5.field3111, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bp.n([III)V")
    public void method1135(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1172.method3575(); var4 != null; var4 = (class67) this.field1172.method3576()) {
            var4.method1418(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bp.l(I)V")
    public final synchronized void method1136(int arg0) {
        do {
            if (this.field1171 < 0) {
                this.method1149(arg0);
                return;
            }
            if (this.field1169 + arg0 < this.field1171) {
                this.field1169 += arg0;
                this.method1149(arg0);
                return;
            }
            int var2 = this.field1171 - this.field1169;
            this.method1149(var2);
            arg0 -= var2;
            this.field1169 += var2;
            this.method1129();
            class62 var3 = (class62) this.field1170.method3575();
            synchronized (var3) {
                int var5 = var3.method1249(this);
                if (var5 < 0) {
                    var3.field1230 = 0;
                    this.method1137(var3);
                } else {
                    var3.field1230 = var5;
                    this.method1162(var3.field3111, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bp.h(I)V")
    public void method1149(int arg0) {
        for (class67 var2 = (class67) this.field1172.method3575(); var2 != null; var2 = (class67) this.field1172.method3576()) {
            var2.method1136(arg0);
        }
    }
}
