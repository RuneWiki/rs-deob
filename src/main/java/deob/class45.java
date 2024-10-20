package deob;

@ObfuscatedName("aa")
public class class45 extends class47 {

    @ObfuscatedName("aa.p")
    public class176 field1058 = new class176();

    @ObfuscatedName("aa.j")
    public class176 field1056 = new class176();

    @ObfuscatedName("aa.h")
    public int field1057 = 0;

    @ObfuscatedName("aa.v")
    public int field1055 = -1;

    @ObfuscatedName("aa.p(Lau;)V")
    public final synchronized void method1062(class47 arg0) {
        this.field1058.method3281(arg0);
    }

    @ObfuscatedName("aa.j(Lau;)V")
    public final synchronized void method1075(class47 arg0) {
        arg0.method3327();
    }

    @ObfuscatedName("aa.h()V")
    public void method1063() {
        if (this.field1057 <= 0) {
            return;
        }
        for (class60 var1 = (class60) this.field1056.method3285(); var1 != null; var1 = (class60) this.field1056.method3299()) {
            var1.field1217 -= this.field1057;
        }
        this.field1055 -= this.field1057;
        this.field1057 = 0;
    }

    @ObfuscatedName("aa.v(Lfi;Lbq;)V")
    public void method1061(class178 arg0, class60 arg1) {
        while (this.field1056.field2805 != arg0 && ((class60) arg0).field1217 <= arg1.field1217) {
            arg0 = arg0.field2810;
        }
        class176.method3282(arg1, arg0);
        this.field1055 = ((class60) this.field1056.field2805.field2810).field1217;
    }

    @ObfuscatedName("aa.k(Lbq;)V")
    public void method1068(class60 arg0) {
        arg0.method3327();
        arg0.method1267();
        class178 var2 = this.field1056.field2805.field2810;
        if (this.field1056.field2805 == var2) {
            this.field1055 = -1;
        } else {
            this.field1055 = ((class60) var2).field1217;
        }
    }

    @ObfuscatedName("aa.r()Lau;")
    public class47 method934() {
        return (class47) this.field1058.method3285();
    }

    @ObfuscatedName("aa.t()Lau;")
    public class47 method935() {
        return (class47) this.field1058.method3299();
    }

    @ObfuscatedName("aa.b()I")
    public int method936() {
        return 0;
    }

    @ObfuscatedName("aa.q([III)V")
    public final synchronized void method972(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1055 < 0) {
                this.method1066(arg0, arg1, arg2);
                return;
            }
            if (this.field1057 + arg2 < this.field1055) {
                this.field1057 += arg2;
                this.method1066(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1055 - this.field1057;
            this.method1066(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1057 += var4;
            this.method1063();
            class60 var5 = (class60) this.field1056.method3285();
            synchronized (var5) {
                int var7 = var5.method1266(this);
                if (var7 < 0) {
                    var5.field1217 = 0;
                    this.method1068(var5);
                } else {
                    var5.field1217 = var7;
                    this.method1061(var5.field2810, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aa.g([III)V")
    public void method1066(int[] arg0, int arg1, int arg2) {
        for (class47 var4 = (class47) this.field1058.method3285(); var4 != null; var4 = (class47) this.field1058.method3299()) {
            var4.method1086(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aa.ae(I)V")
    public final synchronized void method1039(int arg0) {
        do {
            if (this.field1055 < 0) {
                this.method1083(arg0);
                return;
            }
            if (this.field1057 + arg0 < this.field1055) {
                this.field1057 += arg0;
                this.method1083(arg0);
                return;
            }
            int var2 = this.field1055 - this.field1057;
            this.method1083(var2);
            arg0 -= var2;
            this.field1057 += var2;
            this.method1063();
            class60 var3 = (class60) this.field1056.method3285();
            synchronized (var3) {
                int var5 = var3.method1266(this);
                if (var5 < 0) {
                    var3.field1217 = 0;
                    this.method1068(var3);
                } else {
                    var3.field1217 = var5;
                    this.method1061(var3.field2810, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aa.n(I)V")
    public void method1083(int arg0) {
        for (class47 var2 = (class47) this.field1058.method3285(); var2 != null; var2 = (class47) this.field1058.method3299()) {
            var2.method1039(arg0);
        }
    }
}
