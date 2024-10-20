package deob;

@ObfuscatedName("bx")
public class class56 extends class67 {

    @ObfuscatedName("bx.f")
    public class200 field1183 = new class200();

    @ObfuscatedName("bx.u")
    public class200 field1184 = new class200();

    @ObfuscatedName("bx.x")
    public int field1185 = 0;

    @ObfuscatedName("bx.b")
    public int field1186 = -1;

    @ObfuscatedName("bx.f(Lbt;)V")
    public final synchronized void method1202(class67 arg0) {
        this.field1183.method3584(arg0);
    }

    @ObfuscatedName("bx.u(Lbt;)V")
    public final synchronized void method1173(class67 arg0) {
        arg0.method3679();
    }

    @ObfuscatedName("bx.x()V")
    public void method1174() {
        if (this.field1185 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1184.method3585(); var1 != null; var1 = (class62) this.field1184.method3590()) {
            var1.field1246 -= this.field1185;
        }
        this.field1186 -= this.field1185;
        this.field1185 = 0;
    }

    @ObfuscatedName("bx.b(Lhf;Lbm;)V")
    public void method1175(class209 arg0, class62 arg1) {
        while (this.field1184.field3101 != arg0 && ((class62) arg0).field1246 <= arg1.field1246) {
            arg0 = arg0.field3117;
        }
        class200.method3605(arg1, arg0);
        this.field1186 = ((class62) this.field1184.field3101.field3117).field1246;
    }

    @ObfuscatedName("bx.l(Lbm;)V")
    public void method1179(class62 arg0) {
        arg0.method3679();
        arg0.method1285();
        class209 var2 = this.field1184.field3101.field3117;
        if (this.field1184.field3101 == var2) {
            this.field1186 = -1;
        } else {
            this.field1186 = ((class62) var2).field1246;
        }
    }

    @ObfuscatedName("bx.d()Lbt;")
    public class67 method1177() {
        return (class67) this.field1183.method3585();
    }

    @ObfuscatedName("bx.n()Lbt;")
    public class67 method1178() {
        return (class67) this.field1183.method3590();
    }

    @ObfuscatedName("bx.m()I")
    public int method1189() {
        return 0;
    }

    @ObfuscatedName("bx.g([III)V")
    public final synchronized void method1185(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1186 < 0) {
                this.method1180(arg0, arg1, arg2);
                return;
            }
            if (this.field1185 + arg2 < this.field1186) {
                this.field1185 += arg2;
                this.method1180(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1186 - this.field1185;
            this.method1180(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1185 += var4;
            this.method1174();
            class62 var5 = (class62) this.field1184.method3585();
            synchronized (var5) {
                int var7 = var5.method1288(this);
                if (var7 < 0) {
                    var5.field1246 = 0;
                    this.method1179(var5);
                } else {
                    var5.field1246 = var7;
                    this.method1175(var5.field3117, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bx.s([III)V")
    public void method1180(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1183.method3585(); var4 != null; var4 = (class67) this.field1183.method3590()) {
            var4.method1449(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bx.r(I)V")
    public final synchronized void method1181(int arg0) {
        do {
            if (this.field1186 < 0) {
                this.method1182(arg0);
                return;
            }
            if (this.field1185 + arg0 < this.field1186) {
                this.field1185 += arg0;
                this.method1182(arg0);
                return;
            }
            int var2 = this.field1186 - this.field1185;
            this.method1182(var2);
            arg0 -= var2;
            this.field1185 += var2;
            this.method1174();
            class62 var3 = (class62) this.field1184.method3585();
            synchronized (var3) {
                int var5 = var3.method1288(this);
                if (var5 < 0) {
                    var3.field1246 = 0;
                    this.method1179(var3);
                } else {
                    var3.field1246 = var5;
                    this.method1175(var3.field3117, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bx.k(I)V")
    public void method1182(int arg0) {
        for (class67 var2 = (class67) this.field1183.method3585(); var2 != null; var2 = (class67) this.field1183.method3590()) {
            var2.method1181(arg0);
        }
    }
}
