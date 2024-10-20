package deob;

@ObfuscatedName("bk")
public class class56 extends class67 {

    @ObfuscatedName("bk.d")
    public class199 field1171 = new class199();

    @ObfuscatedName("bk.p")
    public class199 field1172 = new class199();

    @ObfuscatedName("bk.v")
    public int field1173 = 0;

    @ObfuscatedName("bk.l")
    public int field1174 = -1;

    @ObfuscatedName("bk.d(Lbz;)V")
    public final synchronized void method1115(class67 arg0) {
        this.field1171.method3630(arg0);
    }

    @ObfuscatedName("bk.p(Lbz;)V")
    public final synchronized void method1116(class67 arg0) {
        arg0.method3715();
    }

    @ObfuscatedName("bk.v()V")
    public void method1117() {
        if (this.field1173 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1172.method3613(); var1 != null; var1 = (class62) this.field1172.method3615()) {
            var1.field1231 -= this.field1173;
        }
        this.field1174 -= this.field1173;
        this.field1173 = 0;
    }

    @ObfuscatedName("bk.l(Lgj;Lbb;)V")
    public void method1118(class208 arg0, class62 arg1) {
        while (this.field1172.field3089 != arg0 && ((class62) arg0).field1231 <= arg1.field1231) {
            arg0 = arg0.field3105;
        }
        class199.method3610(arg1, arg0);
        this.field1174 = ((class62) this.field1172.field3089.field3105).field1231;
    }

    @ObfuscatedName("bk.y(Lbb;)V")
    public void method1144(class62 arg0) {
        arg0.method3715();
        arg0.method1233();
        class208 var2 = this.field1172.field3089.field3105;
        if (this.field1172.field3089 == var2) {
            this.field1174 = -1;
        } else {
            this.field1174 = ((class62) var2).field1231;
        }
    }

    @ObfuscatedName("bk.w()Lbz;")
    public class67 method1120() {
        return (class67) this.field1171.method3613();
    }

    @ObfuscatedName("bk.u()Lbz;")
    public class67 method1121() {
        return (class67) this.field1171.method3615();
    }

    @ObfuscatedName("bk.a()I")
    public int method1122() {
        return 0;
    }

    @ObfuscatedName("bk.e([III)V")
    public final synchronized void method1123(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1174 < 0) {
                this.method1146(arg0, arg1, arg2);
                return;
            }
            if (this.field1173 + arg2 < this.field1174) {
                this.field1173 += arg2;
                this.method1146(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1174 - this.field1173;
            this.method1146(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1173 += var4;
            this.method1117();
            class62 var5 = (class62) this.field1172.method3613();
            synchronized (var5) {
                int var7 = var5.method1234(this);
                if (var7 < 0) {
                    var5.field1231 = 0;
                    this.method1144(var5);
                } else {
                    var5.field1231 = var7;
                    this.method1118(var5.field3105, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bk.b([III)V")
    public void method1146(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1171.method3613(); var4 != null; var4 = (class67) this.field1171.method3615()) {
            var4.method1400(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bk.o(I)V")
    public final synchronized void method1125(int arg0) {
        do {
            if (this.field1174 < 0) {
                this.method1132(arg0);
                return;
            }
            if (this.field1173 + arg0 < this.field1174) {
                this.field1173 += arg0;
                this.method1132(arg0);
                return;
            }
            int var2 = this.field1174 - this.field1173;
            this.method1132(var2);
            arg0 -= var2;
            this.field1173 += var2;
            this.method1117();
            class62 var3 = (class62) this.field1172.method3613();
            synchronized (var3) {
                int var5 = var3.method1234(this);
                if (var5 < 0) {
                    var3.field1231 = 0;
                    this.method1144(var3);
                } else {
                    var3.field1231 = var5;
                    this.method1118(var3.field3105, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bk.m(I)V")
    public void method1132(int arg0) {
        for (class67 var2 = (class67) this.field1171.method3613(); var2 != null; var2 = (class67) this.field1171.method3615()) {
            var2.method1125(arg0);
        }
    }
}
