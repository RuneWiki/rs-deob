package deob;

@ObfuscatedName("ar")
public class class46 extends class48 {

    @ObfuscatedName("ar.a")
    public class177 field1079 = new class177();

    @ObfuscatedName("ar.x")
    public class177 field1081 = new class177();

    @ObfuscatedName("ar.e")
    public int field1078 = 0;

    @ObfuscatedName("ar.r")
    public int field1080 = -1;

    @ObfuscatedName("ar.a(Law;)V")
    public final synchronized void method1094(class48 arg0) {
        this.field1079.method3248(arg0);
    }

    @ObfuscatedName("ar.x(Law;)V")
    public final synchronized void method1095(class48 arg0) {
        arg0.method3288();
    }

    @ObfuscatedName("ar.r()V")
    public void method1108() {
        if (this.field1078 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1081.method3252(); var1 != null; var1 = (class61) this.field1081.method3268()) {
            var1.field1233 -= this.field1078;
        }
        this.field1080 -= this.field1078;
        this.field1078 = 0;
    }

    @ObfuscatedName("ar.p(Lfp;Lbf;)V")
    public void method1113(class179 arg0, class61 arg1) {
        while (this.field1081.field2812 != arg0 && ((class61) arg0).field1233 <= arg1.field1233) {
            arg0 = arg0.field2815;
        }
        class177.method3277(arg1, arg0);
        this.field1080 = ((class61) this.field1081.field2812.field2815).field1233;
    }

    @ObfuscatedName("ar.n(Lbf;)V")
    public void method1097(class61 arg0) {
        arg0.method3288();
        arg0.method1287();
        class179 var2 = this.field1081.field2812.field2815;
        if (this.field1081.field2812 == var2) {
            this.field1080 = -1;
        } else {
            this.field1080 = ((class61) var2).field1233;
        }
    }

    @ObfuscatedName("ar.m()Law;")
    public class48 method972() {
        return (class48) this.field1079.method3252();
    }

    @ObfuscatedName("ar.k()Law;")
    public class48 method1041() {
        return (class48) this.field1079.method3268();
    }

    @ObfuscatedName("ar.u()I")
    public int method974() {
        return 0;
    }

    @ObfuscatedName("ar.i([III)V")
    public final synchronized void method992(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1080 < 0) {
                this.method1098(arg0, arg1, arg2);
                return;
            }
            if (this.field1078 + arg2 < this.field1080) {
                this.field1078 += arg2;
                this.method1098(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1080 - this.field1078;
            this.method1098(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1078 += var4;
            this.method1108();
            class61 var5 = (class61) this.field1081.method3252();
            synchronized (var5) {
                int var7 = var5.method1288(this);
                if (var7 < 0) {
                    var5.field1233 = 0;
                    this.method1097(var5);
                } else {
                    var5.field1233 = var7;
                    this.method1113(var5.field2815, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ar.o([III)V")
    public void method1098(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1079.method3252(); var4 != null; var4 = (class48) this.field1079.method3268()) {
            var4.method1117(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ar.ah(I)V")
    public final synchronized void method976(int arg0) {
        do {
            if (this.field1080 < 0) {
                this.method1099(arg0);
                return;
            }
            if (this.field1078 + arg0 < this.field1080) {
                this.field1078 += arg0;
                this.method1099(arg0);
                return;
            }
            int var2 = this.field1080 - this.field1078;
            this.method1099(var2);
            arg0 -= var2;
            this.field1078 += var2;
            this.method1108();
            class61 var3 = (class61) this.field1081.method3252();
            synchronized (var3) {
                int var5 = var3.method1288(this);
                if (var5 < 0) {
                    var3.field1233 = 0;
                    this.method1097(var3);
                } else {
                    var3.field1233 = var5;
                    this.method1113(var3.field2815, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ar.l(I)V")
    public void method1099(int arg0) {
        for (class48 var2 = (class48) this.field1079.method3252(); var2 != null; var2 = (class48) this.field1079.method3268()) {
            var2.method976(arg0);
        }
    }
}
