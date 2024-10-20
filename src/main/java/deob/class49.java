package deob;

@ObfuscatedName("ah")
public class class49 extends class60 {

    @ObfuscatedName("ah.j")
    public class177 field1075 = new class177();

    @ObfuscatedName("ah.z")
    public class177 field1077 = new class177();

    @ObfuscatedName("ah.y")
    public int field1076 = 0;

    @ObfuscatedName("ah.h")
    public int field1074 = -1;

    @ObfuscatedName("ah.j(Lbf;)V")
    public final synchronized void method957(class60 arg0) {
        this.field1075.method3237(arg0);
    }

    @ObfuscatedName("ah.z(Lbf;)V")
    public final synchronized void method948(class60 arg0) {
        arg0.method3309();
    }

    @ObfuscatedName("ah.y()V")
    public void method932() {
        if (this.field1076 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1077.method3236(); var1 != null; var1 = (class55) this.field1077.method3243()) {
            var1.field1135 -= this.field1076;
        }
        this.field1074 -= this.field1076;
        this.field1076 = 0;
    }

    @ObfuscatedName("ah.h(Lgb;Lbp;)V")
    public void method933(class184 arg0, class55 arg1) {
        while (this.field1077.field2848 != arg0 && ((class55) arg0).field1135 <= arg1.field1135) {
            arg0 = arg0.field2860;
        }
        class177.method3238(arg1, arg0);
        this.field1074 = ((class55) this.field1077.field2848.field2860).field1135;
    }

    @ObfuscatedName("ah.r(Lbp;)V")
    public void method934(class55 arg0) {
        arg0.method3309();
        arg0.method1057();
        class184 var2 = this.field1077.field2848.field2860;
        if (this.field1077.field2848 == var2) {
            this.field1074 = -1;
        } else {
            this.field1074 = ((class55) var2).field1135;
        }
    }

    @ObfuscatedName("ah.e()Lbf;")
    public class60 method935() {
        return (class60) this.field1075.method3236();
    }

    @ObfuscatedName("ah.k()Lbf;")
    public class60 method954() {
        return (class60) this.field1075.method3243();
    }

    @ObfuscatedName("ah.b()I")
    public int method937() {
        return 0;
    }

    @ObfuscatedName("ah.n([III)V")
    public final synchronized void method938(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1074 < 0) {
                this.method939(arg0, arg1, arg2);
                return;
            }
            if (this.field1076 + arg2 < this.field1074) {
                this.field1076 += arg2;
                this.method939(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1074 - this.field1076;
            this.method939(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1076 += var4;
            this.method932();
            class55 var5 = (class55) this.field1077.method3236();
            synchronized (var5) {
                int var7 = var5.method1058(this);
                if (var7 < 0) {
                    var5.field1135 = 0;
                    this.method934(var5);
                } else {
                    var5.field1135 = var7;
                    this.method933(var5.field2860, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ah.a([III)V")
    public void method939(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1075.method3236(); var4 != null; var4 = (class60) this.field1075.method3243()) {
            var4.method1235(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ah.q(I)V")
    public final synchronized void method940(int arg0) {
        do {
            if (this.field1074 < 0) {
                this.method941(arg0);
                return;
            }
            if (this.field1076 + arg0 < this.field1074) {
                this.field1076 += arg0;
                this.method941(arg0);
                return;
            }
            int var2 = this.field1074 - this.field1076;
            this.method941(var2);
            arg0 -= var2;
            this.field1076 += var2;
            this.method932();
            class55 var3 = (class55) this.field1077.method3236();
            synchronized (var3) {
                int var5 = var3.method1058(this);
                if (var5 < 0) {
                    var3.field1135 = 0;
                    this.method934(var3);
                } else {
                    var3.field1135 = var5;
                    this.method933(var3.field2860, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ah.i(I)V")
    public void method941(int arg0) {
        for (class60 var2 = (class60) this.field1075.method3236(); var2 != null; var2 = (class60) this.field1075.method3243()) {
            var2.method940(arg0);
        }
    }
}
