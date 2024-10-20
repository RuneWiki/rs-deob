package deob;

@ObfuscatedName("at")
public class class49 extends class60 {

    @ObfuscatedName("at.i")
    public class177 field1077 = new class177();

    @ObfuscatedName("at.c")
    public class177 field1080 = new class177();

    @ObfuscatedName("at.h")
    public int field1079 = 0;

    @ObfuscatedName("at.v")
    public int field1078 = -1;

    @ObfuscatedName("at.i(Lbk;)V")
    public final synchronized void method953(class60 arg0) {
        this.field1077.method3252(arg0);
    }

    @ObfuscatedName("at.c(Lbk;)V")
    public final synchronized void method954(class60 arg0) {
        arg0.method3334();
    }

    @ObfuscatedName("at.h()V")
    public void method955() {
        if (this.field1079 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1080.method3257(); var1 != null; var1 = (class55) this.field1080.method3249()) {
            var1.field1138 -= this.field1079;
        }
        this.field1078 -= this.field1079;
        this.field1079 = 0;
    }

    @ObfuscatedName("at.v(Lgq;Lbm;)V")
    public void method956(class186 arg0, class55 arg1) {
        while (this.field1080.field2854 != arg0 && ((class55) arg0).field1138 <= arg1.field1138) {
            arg0 = arg0.field2870;
        }
        class177.method3253(arg1, arg0);
        this.field1078 = ((class55) this.field1080.field2854.field2870).field1138;
    }

    @ObfuscatedName("at.q(Lbm;)V")
    public void method980(class55 arg0) {
        arg0.method3334();
        arg0.method1079();
        class186 var2 = this.field1080.field2854.field2870;
        if (this.field1080.field2854 == var2) {
            this.field1078 = -1;
        } else {
            this.field1078 = ((class55) var2).field1138;
        }
    }

    @ObfuscatedName("at.s()Lbk;")
    public class60 method958() {
        return (class60) this.field1077.method3257();
    }

    @ObfuscatedName("at.g()Lbk;")
    public class60 method959() {
        return (class60) this.field1077.method3249();
    }

    @ObfuscatedName("at.u()I")
    public int method990() {
        return 0;
    }

    @ObfuscatedName("at.d([III)V")
    public final synchronized void method961(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1078 < 0) {
                this.method962(arg0, arg1, arg2);
                return;
            }
            if (this.field1079 + arg2 < this.field1078) {
                this.field1079 += arg2;
                this.method962(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1078 - this.field1079;
            this.method962(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1079 += var4;
            this.method955();
            class55 var5 = (class55) this.field1080.method3257();
            synchronized (var5) {
                int var7 = var5.method1073(this);
                if (var7 < 0) {
                    var5.field1138 = 0;
                    this.method980(var5);
                } else {
                    var5.field1138 = var7;
                    this.method956(var5.field2870, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("at.y([III)V")
    public void method962(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1077.method3257(); var4 != null; var4 = (class60) this.field1077.method3249()) {
            var4.method1250(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("at.e(I)V")
    public final synchronized void method972(int arg0) {
        do {
            if (this.field1078 < 0) {
                this.method964(arg0);
                return;
            }
            if (this.field1079 + arg0 < this.field1078) {
                this.field1079 += arg0;
                this.method964(arg0);
                return;
            }
            int var2 = this.field1078 - this.field1079;
            this.method964(var2);
            arg0 -= var2;
            this.field1079 += var2;
            this.method955();
            class55 var3 = (class55) this.field1080.method3257();
            synchronized (var3) {
                int var5 = var3.method1073(this);
                if (var5 < 0) {
                    var3.field1138 = 0;
                    this.method980(var3);
                } else {
                    var3.field1138 = var5;
                    this.method956(var3.field2870, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("at.l(I)V")
    public void method964(int arg0) {
        for (class60 var2 = (class60) this.field1077.method3257(); var2 != null; var2 = (class60) this.field1077.method3249()) {
            var2.method972(arg0);
        }
    }
}
