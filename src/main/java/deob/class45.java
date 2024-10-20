package deob;

@ObfuscatedName("ah")
public class class45 extends class47 {

    @ObfuscatedName("ah.u")
    public class176 field1053 = new class176();

    @ObfuscatedName("ah.k")
    public class176 field1054 = new class176();

    @ObfuscatedName("ah.x")
    public int field1052 = 0;

    @ObfuscatedName("ah.m")
    public int field1055 = -1;

    @ObfuscatedName("ah.u(Lac;)V")
    public final synchronized void method1095(class47 arg0) {
        this.field1053.method3324(arg0);
    }

    @ObfuscatedName("ah.k(Lac;)V")
    public final synchronized void method1096(class47 arg0) {
        arg0.method3357();
    }

    @ObfuscatedName("ah.m()V")
    public void method1097() {
        if (this.field1052 <= 0) {
            return;
        }
        for (class60 var1 = (class60) this.field1054.method3326(); var1 != null; var1 = (class60) this.field1054.method3330()) {
            var1.field1212 -= this.field1052;
        }
        this.field1055 -= this.field1052;
        this.field1052 = 0;
    }

    @ObfuscatedName("ah.n(Lfv;Lbn;)V")
    public void method1105(class178 arg0, class60 arg1) {
        while (this.field1054.field2803 != arg0 && ((class60) arg0).field1212 <= arg1.field1212) {
            arg0 = arg0.field2807;
        }
        class176.method3334(arg1, arg0);
        this.field1055 = ((class60) this.field1054.field2803.field2807).field1212;
    }

    @ObfuscatedName("ah.q(Lbn;)V")
    public void method1109(class60 arg0) {
        arg0.method3357();
        arg0.method1298();
        class178 var2 = this.field1054.field2803.field2807;
        if (this.field1054.field2803 == var2) {
            this.field1055 = -1;
        } else {
            this.field1055 = ((class60) var2).field1212;
        }
    }

    @ObfuscatedName("ah.t()Lac;")
    public class47 method964() {
        return (class47) this.field1053.method3326();
    }

    @ObfuscatedName("ah.r()Lac;")
    public class47 method970() {
        return (class47) this.field1053.method3330();
    }

    @ObfuscatedName("ah.p()I")
    public int method1056() {
        return 0;
    }

    @ObfuscatedName("ah.o([III)V")
    public final synchronized void method1066(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1055 < 0) {
                this.method1102(arg0, arg1, arg2);
                return;
            }
            if (this.field1052 + arg2 < this.field1055) {
                this.field1052 += arg2;
                this.method1102(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1055 - this.field1052;
            this.method1102(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1052 += var4;
            this.method1097();
            class60 var5 = (class60) this.field1054.method3326();
            synchronized (var5) {
                int var7 = var5.method1297(this);
                if (var7 < 0) {
                    var5.field1212 = 0;
                    this.method1109(var5);
                } else {
                    var5.field1212 = var7;
                    this.method1105(var5.field2807, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ah.a([III)V")
    public void method1102(int[] arg0, int arg1, int arg2) {
        for (class47 var4 = (class47) this.field1053.method3326(); var4 != null; var4 = (class47) this.field1053.method3330()) {
            var4.method1112(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ah.ax(I)V")
    public final synchronized void method968(int arg0) {
        do {
            if (this.field1055 < 0) {
                this.method1100(arg0);
                return;
            }
            if (this.field1052 + arg0 < this.field1055) {
                this.field1052 += arg0;
                this.method1100(arg0);
                return;
            }
            int var2 = this.field1055 - this.field1052;
            this.method1100(var2);
            arg0 -= var2;
            this.field1052 += var2;
            this.method1097();
            class60 var3 = (class60) this.field1054.method3326();
            synchronized (var3) {
                int var5 = var3.method1297(this);
                if (var5 < 0) {
                    var3.field1212 = 0;
                    this.method1109(var3);
                } else {
                    var3.field1212 = var5;
                    this.method1105(var3.field2807, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ah.g(I)V")
    public void method1100(int arg0) {
        for (class47 var2 = (class47) this.field1053.method3326(); var2 != null; var2 = (class47) this.field1053.method3330()) {
            var2.method968(arg0);
        }
    }
}
