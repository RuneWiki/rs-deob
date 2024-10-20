package deob;

@ObfuscatedName("bk")
public class class56 extends class67 {

    @ObfuscatedName("bk.z")
    public class199 field1168 = new class199();

    @ObfuscatedName("bk.q")
    public class199 field1169 = new class199();

    @ObfuscatedName("bk.k")
    public int field1170 = 0;

    @ObfuscatedName("bk.f")
    public int field1171 = -1;

    @ObfuscatedName("bk.z(Lbt;)V")
    public final synchronized void method1093(class67 arg0) {
        this.field1168.method3498(arg0);
    }

    @ObfuscatedName("bk.q(Lbt;)V")
    public final synchronized void method1119(class67 arg0) {
        arg0.method3583();
    }

    @ObfuscatedName("bk.k()V")
    public void method1095() {
        if (this.field1170 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1169.method3502(); var1 != null; var1 = (class62) this.field1169.method3489()) {
            var1.field1226 -= this.field1170;
        }
        this.field1171 -= this.field1170;
        this.field1170 = 0;
    }

    @ObfuscatedName("bk.f(Lgk;Lbp;)V")
    public void method1096(class208 arg0, class62 arg1) {
        while (this.field1169.field3086 != arg0 && ((class62) arg0).field1226 <= arg1.field1226) {
            arg0 = arg0.field3101;
        }
        class199.method3493(arg1, arg0);
        this.field1171 = ((class62) this.field1169.field3086.field3101).field1226;
    }

    @ObfuscatedName("bk.d(Lbp;)V")
    public void method1115(class62 arg0) {
        arg0.method3583();
        arg0.method1202();
        class208 var2 = this.field1169.field3086.field3101;
        if (this.field1169.field3086 == var2) {
            this.field1171 = -1;
        } else {
            this.field1171 = ((class62) var2).field1226;
        }
    }

    @ObfuscatedName("bk.l()Lbt;")
    public class67 method1098() {
        return (class67) this.field1168.method3502();
    }

    @ObfuscatedName("bk.r()Lbt;")
    public class67 method1103() {
        return (class67) this.field1168.method3489();
    }

    @ObfuscatedName("bk.g()I")
    public int method1100() {
        return 0;
    }

    @ObfuscatedName("bk.h([III)V")
    public final synchronized void method1113(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1171 < 0) {
                this.method1125(arg0, arg1, arg2);
                return;
            }
            if (this.field1170 + arg2 < this.field1171) {
                this.field1170 += arg2;
                this.method1125(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1171 - this.field1170;
            this.method1125(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1170 += var4;
            this.method1095();
            class62 var5 = (class62) this.field1169.method3502();
            synchronized (var5) {
                int var7 = var5.method1201(this);
                if (var7 < 0) {
                    var5.field1226 = 0;
                    this.method1115(var5);
                } else {
                    var5.field1226 = var7;
                    this.method1096(var5.field3101, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bk.n([III)V")
    public void method1125(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1168.method3502(); var4 != null; var4 = (class67) this.field1168.method3489()) {
            var4.method1367(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bk.j(I)V")
    public final synchronized void method1123(int arg0) {
        do {
            if (this.field1171 < 0) {
                this.method1104(arg0);
                return;
            }
            if (this.field1170 + arg0 < this.field1171) {
                this.field1170 += arg0;
                this.method1104(arg0);
                return;
            }
            int var2 = this.field1171 - this.field1170;
            this.method1104(var2);
            arg0 -= var2;
            this.field1170 += var2;
            this.method1095();
            class62 var3 = (class62) this.field1169.method3502();
            synchronized (var3) {
                int var5 = var3.method1201(this);
                if (var5 < 0) {
                    var3.field1226 = 0;
                    this.method1115(var3);
                } else {
                    var3.field1226 = var5;
                    this.method1096(var3.field3101, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bk.a(I)V")
    public void method1104(int arg0) {
        for (class67 var2 = (class67) this.field1168.method3502(); var2 != null; var2 = (class67) this.field1168.method3489()) {
            var2.method1123(arg0);
        }
    }
}
