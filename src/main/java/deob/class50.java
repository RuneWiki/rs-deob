package deob;

@ObfuscatedName("as")
public class class50 extends class61 {

    @ObfuscatedName("as.f")
    public class180 field1081 = new class180();

    @ObfuscatedName("as.k")
    public class180 field1084 = new class180();

    @ObfuscatedName("as.y")
    public int field1083 = 0;

    @ObfuscatedName("as.e")
    public int field1082 = -1;

    @ObfuscatedName("as.f(Lbh;)V")
    public final synchronized void method995(class61 arg0) {
        this.field1081.method3274(arg0);
    }

    @ObfuscatedName("as.k(Lbh;)V")
    public final synchronized void method1002(class61 arg0) {
        arg0.method3367();
    }

    @ObfuscatedName("as.y()V")
    public void method997() {
        if (this.field1083 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field1084.method3285(); var1 != null; var1 = (class56) this.field1084.method3286()) {
            var1.field1145 -= this.field1083;
        }
        this.field1082 -= this.field1083;
        this.field1083 = 0;
    }

    @ObfuscatedName("as.e(Lgx;Lbf;)V")
    public void method1024(class189 arg0, class56 arg1) {
        while (this.field1084.field2867 != arg0 && ((class56) arg0).field1145 <= arg1.field1145) {
            arg0 = arg0.field2883;
        }
        class180.method3278(arg1, arg0);
        this.field1082 = ((class56) this.field1084.field2867.field2883).field1145;
    }

    @ObfuscatedName("as.r(Lbf;)V")
    public void method999(class56 arg0) {
        arg0.method3367();
        arg0.method1106();
        class189 var2 = this.field1084.field2867.field2883;
        if (this.field1084.field2867 == var2) {
            this.field1082 = -1;
        } else {
            this.field1082 = ((class56) var2).field1145;
        }
    }

    @ObfuscatedName("as.a()Lbh;")
    public class61 method1000() {
        return (class61) this.field1081.method3285();
    }

    @ObfuscatedName("as.n()Lbh;")
    public class61 method1001() {
        return (class61) this.field1081.method3286();
    }

    @ObfuscatedName("as.x()I")
    public int method1009() {
        return 0;
    }

    @ObfuscatedName("as.g([III)V")
    public final synchronized void method994(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1082 < 0) {
                this.method1005(arg0, arg1, arg2);
                return;
            }
            if (this.field1083 + arg2 < this.field1082) {
                this.field1083 += arg2;
                this.method1005(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1082 - this.field1083;
            this.method1005(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1083 += var4;
            this.method997();
            class56 var5 = (class56) this.field1084.method3285();
            synchronized (var5) {
                int var7 = var5.method1103(this);
                if (var7 < 0) {
                    var5.field1145 = 0;
                    this.method999(var5);
                } else {
                    var5.field1145 = var7;
                    this.method1024(var5.field2883, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("as.o([III)V")
    public void method1005(int[] arg0, int arg1, int arg2) {
        for (class61 var4 = (class61) this.field1081.method3285(); var4 != null; var4 = (class61) this.field1081.method3286()) {
            var4.method1275(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("as.p(I)V")
    public final synchronized void method1004(int arg0) {
        do {
            if (this.field1082 < 0) {
                this.method1013(arg0);
                return;
            }
            if (this.field1083 + arg0 < this.field1082) {
                this.field1083 += arg0;
                this.method1013(arg0);
                return;
            }
            int var2 = this.field1082 - this.field1083;
            this.method1013(var2);
            arg0 -= var2;
            this.field1083 += var2;
            this.method997();
            class56 var3 = (class56) this.field1084.method3285();
            synchronized (var3) {
                int var5 = var3.method1103(this);
                if (var5 < 0) {
                    var3.field1145 = 0;
                    this.method999(var3);
                } else {
                    var3.field1145 = var5;
                    this.method1024(var3.field2883, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("as.v(I)V")
    public void method1013(int arg0) {
        for (class61 var2 = (class61) this.field1081.method3285(); var2 != null; var2 = (class61) this.field1081.method3286()) {
            var2.method1004(arg0);
        }
    }
}
