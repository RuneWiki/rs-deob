package deob;

@ObfuscatedName("as")
public class class49 extends class60 {

    @ObfuscatedName("as.e")
    public class177 field1058 = new class177();

    @ObfuscatedName("as.v")
    public class177 field1060 = new class177();

    @ObfuscatedName("as.i")
    public int field1059 = 0;

    @ObfuscatedName("as.g")
    public int field1061 = -1;

    @ObfuscatedName("as.e(Lbl;)V")
    public final synchronized void method947(class60 arg0) {
        this.field1058.method3216(arg0);
    }

    @ObfuscatedName("as.v(Lbl;)V")
    public final synchronized void method965(class60 arg0) {
        arg0.method3273();
    }

    @ObfuscatedName("as.i()V")
    public void method928() {
        if (this.field1059 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1060.method3210(); var1 != null; var1 = (class55) this.field1060.method3182()) {
            var1.field1123 -= this.field1059;
        }
        this.field1061 -= this.field1059;
        this.field1059 = 0;
    }

    @ObfuscatedName("as.g(Lgc;Lbo;)V")
    public void method929(class186 arg0, class55 arg1) {
        while (this.field1060.field2849 != arg0 && ((class55) arg0).field1123 <= arg1.field1123) {
            arg0 = arg0.field2865;
        }
        class177.method3186(arg1, arg0);
        this.field1061 = ((class55) this.field1060.field2849.field2865).field1123;
    }

    @ObfuscatedName("as.x(Lbo;)V")
    public void method930(class55 arg0) {
        arg0.method3273();
        arg0.method1053();
        class186 var2 = this.field1060.field2849.field2865;
        if (this.field1060.field2849 == var2) {
            this.field1061 = -1;
        } else {
            this.field1061 = ((class55) var2).field1123;
        }
    }

    @ObfuscatedName("as.b()Lbl;")
    public class60 method962() {
        return (class60) this.field1058.method3210();
    }

    @ObfuscatedName("as.q()Lbl;")
    public class60 method932() {
        return (class60) this.field1058.method3182();
    }

    @ObfuscatedName("as.l()I")
    public int method933() {
        return 0;
    }

    @ObfuscatedName("as.m([III)V")
    public final synchronized void method934(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1061 < 0) {
                this.method935(arg0, arg1, arg2);
                return;
            }
            if (this.field1059 + arg2 < this.field1061) {
                this.field1059 += arg2;
                this.method935(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1061 - this.field1059;
            this.method935(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1059 += var4;
            this.method928();
            class55 var5 = (class55) this.field1060.method3210();
            synchronized (var5) {
                int var7 = var5.method1054(this);
                if (var7 < 0) {
                    var5.field1123 = 0;
                    this.method930(var5);
                } else {
                    var5.field1123 = var7;
                    this.method929(var5.field2865, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("as.u([III)V")
    public void method935(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1058.method3210(); var4 != null; var4 = (class60) this.field1058.method3182()) {
            var4.method1221(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("as.s(I)V")
    public final synchronized void method936(int arg0) {
        do {
            if (this.field1061 < 0) {
                this.method937(arg0);
                return;
            }
            if (this.field1059 + arg0 < this.field1061) {
                this.field1059 += arg0;
                this.method937(arg0);
                return;
            }
            int var2 = this.field1061 - this.field1059;
            this.method937(var2);
            arg0 -= var2;
            this.field1059 += var2;
            this.method928();
            class55 var3 = (class55) this.field1060.method3210();
            synchronized (var3) {
                int var5 = var3.method1054(this);
                if (var5 < 0) {
                    var3.field1123 = 0;
                    this.method930(var3);
                } else {
                    var3.field1123 = var5;
                    this.method929(var3.field2865, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("as.f(I)V")
    public void method937(int arg0) {
        for (class60 var2 = (class60) this.field1058.method3210(); var2 != null; var2 = (class60) this.field1058.method3182()) {
            var2.method936(arg0);
        }
    }
}
