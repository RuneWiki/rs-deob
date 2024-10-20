package deob;

@ObfuscatedName("bu")
public class class56 extends class67 {

    @ObfuscatedName("bu.g")
    public class199 field1169 = new class199();

    @ObfuscatedName("bu.b")
    public class199 field1167 = new class199();

    @ObfuscatedName("bu.d")
    public int field1168 = 0;

    @ObfuscatedName("bu.z")
    public int field1170 = -1;

    @ObfuscatedName("bu.g(Lby;)V")
    public final synchronized void method1143(class67 arg0) {
        this.field1169.method3599(arg0);
    }

    @ObfuscatedName("bu.b(Lby;)V")
    public final synchronized void method1155(class67 arg0) {
        arg0.method3693();
    }

    @ObfuscatedName("bu.w()V")
    public void method1145() {
        if (this.field1168 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1167.method3603(); var1 != null; var1 = (class62) this.field1167.method3596()) {
            var1.field1223 -= this.field1168;
        }
        this.field1170 -= this.field1168;
        this.field1168 = 0;
    }

    @ObfuscatedName("bu.d(Lgr;Lbb;)V")
    public void method1144(class208 arg0, class62 arg1) {
        while (this.field1167.field3082 != arg0 && ((class62) arg0).field1223 <= arg1.field1223) {
            arg0 = arg0.field3098;
        }
        class199.method3612(arg1, arg0);
        this.field1170 = ((class62) this.field1167.field3082.field3098).field1223;
    }

    @ObfuscatedName("bu.z(Lbb;)V")
    public void method1147(class62 arg0) {
        arg0.method3693();
        arg0.method1278();
        class208 var2 = this.field1167.field3082.field3098;
        if (this.field1167.field3082 == var2) {
            this.field1170 = -1;
        } else {
            this.field1170 = ((class62) var2).field1223;
        }
    }

    @ObfuscatedName("bu.l()Lby;")
    public class67 method1174() {
        return (class67) this.field1169.method3603();
    }

    @ObfuscatedName("bu.m()Lby;")
    public class67 method1149() {
        return (class67) this.field1169.method3596();
    }

    @ObfuscatedName("bu.p()I")
    public int method1177() {
        return 0;
    }

    @ObfuscatedName("bu.u([III)V")
    public final synchronized void method1151(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1170 < 0) {
                this.method1152(arg0, arg1, arg2);
                return;
            }
            if (this.field1168 + arg2 < this.field1170) {
                this.field1168 += arg2;
                this.method1152(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1170 - this.field1168;
            this.method1152(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1168 += var4;
            this.method1145();
            class62 var5 = (class62) this.field1167.method3603();
            synchronized (var5) {
                int var7 = var5.method1277(this);
                if (var7 < 0) {
                    var5.field1223 = 0;
                    this.method1147(var5);
                } else {
                    var5.field1223 = var7;
                    this.method1144(var5.field3098, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bu.c([III)V")
    public void method1152(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1169.method3603(); var4 != null; var4 = (class67) this.field1169.method3596()) {
            var4.method1445(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bu.v(I)V")
    public final synchronized void method1173(int arg0) {
        do {
            if (this.field1170 < 0) {
                this.method1154(arg0);
                return;
            }
            if (this.field1168 + arg0 < this.field1170) {
                this.field1168 += arg0;
                this.method1154(arg0);
                return;
            }
            int var2 = this.field1170 - this.field1168;
            this.method1154(var2);
            arg0 -= var2;
            this.field1168 += var2;
            this.method1145();
            class62 var3 = (class62) this.field1167.method3603();
            synchronized (var3) {
                int var5 = var3.method1277(this);
                if (var5 < 0) {
                    var3.field1223 = 0;
                    this.method1147(var3);
                } else {
                    var3.field1223 = var5;
                    this.method1144(var3.field3098, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bu.o(I)V")
    public void method1154(int arg0) {
        for (class67 var2 = (class67) this.field1169.method3603(); var2 != null; var2 = (class67) this.field1169.method3596()) {
            var2.method1173(arg0);
        }
    }
}
