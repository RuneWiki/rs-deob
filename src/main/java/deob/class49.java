package deob;

@ObfuscatedName("aq")
public class class49 extends class60 {

    @ObfuscatedName("aq.k")
    public class178 field1051 = new class178();

    @ObfuscatedName("aq.y")
    public class178 field1049 = new class178();

    @ObfuscatedName("aq.s")
    public int field1050 = 0;

    @ObfuscatedName("aq.g")
    public int field1048 = -1;

    @ObfuscatedName("aq.k(Lbl;)V")
    public final synchronized void method946(class60 arg0) {
        this.field1051.method3294(arg0);
    }

    @ObfuscatedName("aq.y(Lbl;)V")
    public final synchronized void method947(class60 arg0) {
        arg0.method3365();
    }

    @ObfuscatedName("aq.s()V")
    public void method949() {
        if (this.field1050 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1049.method3301(); var1 != null; var1 = (class55) this.field1049.method3278()) {
            var1.field1108 -= this.field1050;
        }
        this.field1048 -= this.field1050;
        this.field1050 = 0;
    }

    @ObfuscatedName("aq.g(Lgk;Lbf;)V")
    public void method972(class187 arg0, class55 arg1) {
        while (this.field1049.field2862 != arg0 && ((class55) arg0).field1108 <= arg1.field1108) {
            arg0 = arg0.field2878;
        }
        class178.method3276(arg1, arg0);
        this.field1048 = ((class55) this.field1049.field2862.field2878).field1108;
    }

    @ObfuscatedName("aq.h(Lbf;)V")
    public void method986(class55 arg0) {
        arg0.method3365();
        arg0.method1078();
        class187 var2 = this.field1049.field2862.field2878;
        if (this.field1049.field2862 == var2) {
            this.field1048 = -1;
        } else {
            this.field1048 = ((class55) var2).field1108;
        }
    }

    @ObfuscatedName("aq.l()Lbl;")
    public class60 method951() {
        return (class60) this.field1051.method3301();
    }

    @ObfuscatedName("aq.e()Lbl;")
    public class60 method950() {
        return (class60) this.field1051.method3278();
    }

    @ObfuscatedName("aq.u()I")
    public int method984() {
        return 0;
    }

    @ObfuscatedName("aq.j([III)V")
    public final synchronized void method954(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1048 < 0) {
                this.method955(arg0, arg1, arg2);
                return;
            }
            if (this.field1050 + arg2 < this.field1048) {
                this.field1050 += arg2;
                this.method955(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1048 - this.field1050;
            this.method955(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1050 += var4;
            this.method949();
            class55 var5 = (class55) this.field1049.method3301();
            synchronized (var5) {
                int var7 = var5.method1079(this);
                if (var7 < 0) {
                    var5.field1108 = 0;
                    this.method986(var5);
                } else {
                    var5.field1108 = var7;
                    this.method972(var5.field2878, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aq.c([III)V")
    public void method955(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1051.method3301(); var4 != null; var4 = (class60) this.field1051.method3278()) {
            var4.method1243(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aq.d(I)V")
    public final synchronized void method956(int arg0) {
        do {
            if (this.field1048 < 0) {
                this.method957(arg0);
                return;
            }
            if (this.field1050 + arg0 < this.field1048) {
                this.field1050 += arg0;
                this.method957(arg0);
                return;
            }
            int var2 = this.field1048 - this.field1050;
            this.method957(var2);
            arg0 -= var2;
            this.field1050 += var2;
            this.method949();
            class55 var3 = (class55) this.field1049.method3301();
            synchronized (var3) {
                int var5 = var3.method1079(this);
                if (var5 < 0) {
                    var3.field1108 = 0;
                    this.method986(var3);
                } else {
                    var3.field1108 = var5;
                    this.method972(var3.field2878, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aq.v(I)V")
    public void method957(int arg0) {
        for (class60 var2 = (class60) this.field1051.method3301(); var2 != null; var2 = (class60) this.field1051.method3278()) {
            var2.method956(arg0);
        }
    }
}
