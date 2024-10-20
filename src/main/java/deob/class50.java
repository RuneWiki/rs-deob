package deob;

@ObfuscatedName("al")
public class class50 extends class61 {

    @ObfuscatedName("al.c")
    public class180 field1077 = new class180();

    @ObfuscatedName("al.j")
    public class180 field1075 = new class180();

    @ObfuscatedName("al.y")
    public int field1076 = 0;

    @ObfuscatedName("al.r")
    public int field1074 = -1;

    @ObfuscatedName("al.c(Lbr;)V")
    public final synchronized void method956(class61 arg0) {
        this.field1077.method3242(arg0);
    }

    @ObfuscatedName("al.j(Lbr;)V")
    public final synchronized void method996(class61 arg0) {
        arg0.method3334();
    }

    @ObfuscatedName("al.y()V")
    public void method958() {
        if (this.field1076 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field1075.method3249(); var1 != null; var1 = (class56) this.field1075.method3248()) {
            var1.field1128 -= this.field1076;
        }
        this.field1074 -= this.field1076;
        this.field1076 = 0;
    }

    @ObfuscatedName("al.r(Lgy;Lby;)V")
    public void method991(class189 arg0, class56 arg1) {
        while (this.field1075.field2869 != arg0 && ((class56) arg0).field1128 <= arg1.field1128) {
            arg0 = arg0.field2885;
        }
        class180.method3243(arg1, arg0);
        this.field1074 = ((class56) this.field1075.field2869.field2885).field1128;
    }

    @ObfuscatedName("al.f(Lby;)V")
    public void method960(class56 arg0) {
        arg0.method3334();
        arg0.method1082();
        class189 var2 = this.field1075.field2869.field2885;
        if (this.field1075.field2869 == var2) {
            this.field1074 = -1;
        } else {
            this.field1074 = ((class56) var2).field1128;
        }
    }

    @ObfuscatedName("al.l()Lbr;")
    public class61 method961() {
        return (class61) this.field1077.method3249();
    }

    @ObfuscatedName("al.b()Lbr;")
    public class61 method962() {
        return (class61) this.field1077.method3248();
    }

    @ObfuscatedName("al.k()I")
    public int method963() {
        return 0;
    }

    @ObfuscatedName("al.g([III)V")
    public final synchronized void method986(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1074 < 0) {
                this.method965(arg0, arg1, arg2);
                return;
            }
            if (this.field1076 + arg2 < this.field1074) {
                this.field1076 += arg2;
                this.method965(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1074 - this.field1076;
            this.method965(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1076 += var4;
            this.method958();
            class56 var5 = (class56) this.field1075.method3249();
            synchronized (var5) {
                int var7 = var5.method1083(this);
                if (var7 < 0) {
                    var5.field1128 = 0;
                    this.method960(var5);
                } else {
                    var5.field1128 = var7;
                    this.method991(var5.field2885, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("al.v([III)V")
    public void method965(int[] arg0, int arg1, int arg2) {
        for (class61 var4 = (class61) this.field1077.method3249(); var4 != null; var4 = (class61) this.field1077.method3248()) {
            var4.method1236(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("al.i(I)V")
    public final synchronized void method964(int arg0) {
        do {
            if (this.field1074 < 0) {
                this.method1002(arg0);
                return;
            }
            if (this.field1076 + arg0 < this.field1074) {
                this.field1076 += arg0;
                this.method1002(arg0);
                return;
            }
            int var2 = this.field1074 - this.field1076;
            this.method1002(var2);
            arg0 -= var2;
            this.field1076 += var2;
            this.method958();
            class56 var3 = (class56) this.field1075.method3249();
            synchronized (var3) {
                int var5 = var3.method1083(this);
                if (var5 < 0) {
                    var3.field1128 = 0;
                    this.method960(var3);
                } else {
                    var3.field1128 = var5;
                    this.method991(var3.field2885, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("al.x(I)V")
    public void method1002(int arg0) {
        for (class61 var2 = (class61) this.field1077.method3249(); var2 != null; var2 = (class61) this.field1077.method3248()) {
            var2.method964(arg0);
        }
    }
}
