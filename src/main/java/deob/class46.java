package deob;

@ObfuscatedName("ap")
public class class46 extends class48 {

    @ObfuscatedName("ap.y")
    public class177 field1047 = new class177();

    @ObfuscatedName("ap.m")
    public class177 field1048 = new class177();

    @ObfuscatedName("ap.d")
    public int field1049 = 0;

    @ObfuscatedName("ap.k")
    public int field1050 = -1;

    @ObfuscatedName("ap.y(Lad;)V")
    public final synchronized void method1109(class48 arg0) {
        this.field1047.method3351(arg0);
    }

    @ObfuscatedName("ap.m(Lad;)V")
    public final synchronized void method1119(class48 arg0) {
        arg0.method3395();
    }

    @ObfuscatedName("ap.k()V")
    public void method1120() {
        if (this.field1049 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1048.method3355(); var1 != null; var1 = (class61) this.field1048.method3357()) {
            var1.field1212 -= this.field1049;
        }
        this.field1050 -= this.field1049;
        this.field1049 = 0;
    }

    @ObfuscatedName("ap.n(Lfk;Lbw;)V")
    public void method1112(class179 arg0, class61 arg1) {
        while (this.field1048.field2814 != arg0 && ((class61) arg0).field1212 <= arg1.field1212) {
            arg0 = arg0.field2818;
        }
        class177.method3352(arg1, arg0);
        this.field1050 = ((class61) this.field1048.field2814.field2818).field1212;
    }

    @ObfuscatedName("ap.s(Lbw;)V")
    public void method1113(class61 arg0) {
        arg0.method3395();
        arg0.method1306();
        class179 var2 = this.field1048.field2814.field2818;
        if (this.field1048.field2814 == var2) {
            this.field1050 = -1;
        } else {
            this.field1050 = ((class61) var2).field1212;
        }
    }

    @ObfuscatedName("ap.h()Lad;")
    public class48 method977() {
        return (class48) this.field1047.method3355();
    }

    @ObfuscatedName("ap.q()Lad;")
    public class48 method978() {
        return (class48) this.field1047.method3357();
    }

    @ObfuscatedName("ap.g()I")
    public int method984() {
        return 0;
    }

    @ObfuscatedName("ap.e([III)V")
    public final synchronized void method1066(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1050 < 0) {
                this.method1116(arg0, arg1, arg2);
                return;
            }
            if (this.field1049 + arg2 < this.field1050) {
                this.field1049 += arg2;
                this.method1116(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1050 - this.field1049;
            this.method1116(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1049 += var4;
            this.method1120();
            class61 var5 = (class61) this.field1048.method3355();
            synchronized (var5) {
                int var7 = var5.method1307(this);
                if (var7 < 0) {
                    var5.field1212 = 0;
                    this.method1113(var5);
                } else {
                    var5.field1212 = var7;
                    this.method1112(var5.field2818, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ap.x([III)V")
    public void method1116(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1047.method3355(); var4 != null; var4 = (class48) this.field1047.method3357()) {
            var4.method1136(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ap.as(I)V")
    public final synchronized void method981(int arg0) {
        do {
            if (this.field1050 < 0) {
                this.method1118(arg0);
                return;
            }
            if (this.field1049 + arg0 < this.field1050) {
                this.field1049 += arg0;
                this.method1118(arg0);
                return;
            }
            int var2 = this.field1050 - this.field1049;
            this.method1118(var2);
            arg0 -= var2;
            this.field1049 += var2;
            this.method1120();
            class61 var3 = (class61) this.field1048.method3355();
            synchronized (var3) {
                int var5 = var3.method1307(this);
                if (var5 < 0) {
                    var3.field1212 = 0;
                    this.method1113(var3);
                } else {
                    var3.field1212 = var5;
                    this.method1112(var3.field2818, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ap.b(I)V")
    public void method1118(int arg0) {
        for (class48 var2 = (class48) this.field1047.method3355(); var2 != null; var2 = (class48) this.field1047.method3357()) {
            var2.method981(arg0);
        }
    }
}
