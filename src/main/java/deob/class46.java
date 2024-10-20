package deob;

@ObfuscatedName("aj")
public class class46 extends class48 {

    @ObfuscatedName("aj.g")
    public class177 field1057 = new class177();

    @ObfuscatedName("aj.m")
    public class177 field1056 = new class177();

    @ObfuscatedName("aj.v")
    public int field1058 = 0;

    @ObfuscatedName("aj.r")
    public int field1059 = -1;

    @ObfuscatedName("aj.g(Lax;)V")
    public final synchronized void method1103(class48 arg0) {
        this.field1057.method3320(arg0);
    }

    @ObfuscatedName("aj.m(Lax;)V")
    public final synchronized void method1104(class48 arg0) {
        arg0.method3346();
    }

    @ObfuscatedName("aj.r()V")
    public void method1106() {
        if (this.field1058 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1056.method3321(); var1 != null; var1 = (class61) this.field1056.method3323()) {
            var1.field1213 -= this.field1058;
        }
        this.field1059 -= this.field1058;
        this.field1058 = 0;
    }

    @ObfuscatedName("aj.n(Lfu;Lbu;)V")
    public void method1109(class179 arg0, class61 arg1) {
        while (this.field1056.field2809 != arg0 && ((class61) arg0).field1213 <= arg1.field1213) {
            arg0 = arg0.field2815;
        }
        class177.method3329(arg1, arg0);
        this.field1059 = ((class61) this.field1056.field2809.field2815).field1213;
    }

    @ObfuscatedName("aj.i(Lbu;)V")
    public void method1107(class61 arg0) {
        arg0.method3346();
        arg0.method1306();
        class179 var2 = this.field1056.field2809.field2815;
        if (this.field1056.field2809 == var2) {
            this.field1059 = -1;
        } else {
            this.field1059 = ((class61) var2).field1213;
        }
    }

    @ObfuscatedName("aj.y()Lax;")
    public class48 method935() {
        return (class48) this.field1057.method3321();
    }

    @ObfuscatedName("aj.q()Lax;")
    public class48 method1044() {
        return (class48) this.field1057.method3323();
    }

    @ObfuscatedName("aj.c()I")
    public int method946() {
        return 0;
    }

    @ObfuscatedName("aj.u([III)V")
    public final synchronized void method957(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1059 < 0) {
                this.method1118(arg0, arg1, arg2);
                return;
            }
            if (this.field1058 + arg2 < this.field1059) {
                this.field1058 += arg2;
                this.method1118(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1059 - this.field1058;
            this.method1118(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1058 += var4;
            this.method1106();
            class61 var5 = (class61) this.field1056.method3321();
            synchronized (var5) {
                int var7 = var5.method1307(this);
                if (var7 < 0) {
                    var5.field1213 = 0;
                    this.method1107(var5);
                } else {
                    var5.field1213 = var7;
                    this.method1109(var5.field2815, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aj.s([III)V")
    public void method1118(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1057.method3321(); var4 != null; var4 = (class48) this.field1057.method3323()) {
            var4.method1127(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aj.ah(I)V")
    public final synchronized void method958(int arg0) {
        do {
            if (this.field1059 < 0) {
                this.method1112(arg0);
                return;
            }
            if (this.field1058 + arg0 < this.field1059) {
                this.field1058 += arg0;
                this.method1112(arg0);
                return;
            }
            int var2 = this.field1059 - this.field1058;
            this.method1112(var2);
            arg0 -= var2;
            this.field1058 += var2;
            this.method1106();
            class61 var3 = (class61) this.field1056.method3321();
            synchronized (var3) {
                int var5 = var3.method1307(this);
                if (var5 < 0) {
                    var3.field1213 = 0;
                    this.method1107(var3);
                } else {
                    var3.field1213 = var5;
                    this.method1109(var3.field2815, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aj.w(I)V")
    public void method1112(int arg0) {
        for (class48 var2 = (class48) this.field1057.method3321(); var2 != null; var2 = (class48) this.field1057.method3323()) {
            var2.method958(arg0);
        }
    }
}
