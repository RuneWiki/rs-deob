package deob;

@ObfuscatedName("az")
public class class46 extends class48 {

    @ObfuscatedName("az.i")
    public class177 field1069 = new class177();

    @ObfuscatedName("az.v")
    public class177 field1068 = new class177();

    @ObfuscatedName("az.m")
    public int field1066 = 0;

    @ObfuscatedName("az.j")
    public int field1067 = -1;

    @ObfuscatedName("az.i(Lan;)V")
    public final synchronized void method1132(class48 arg0) {
        this.field1069.method3365(arg0);
    }

    @ObfuscatedName("az.v(Lan;)V")
    public final synchronized void method1133(class48 arg0) {
        arg0.method3409();
    }

    @ObfuscatedName("az.j()V")
    public void method1136() {
        if (this.field1066 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1068.method3369(); var1 != null; var1 = (class61) this.field1068.method3371()) {
            var1.field1230 -= this.field1066;
        }
        this.field1067 -= this.field1066;
        this.field1066 = 0;
    }

    @ObfuscatedName("az.o(Lfo;Lbk;)V")
    public void method1134(class179 arg0, class61 arg1) {
        while (this.field1068.field2814 != arg0 && ((class61) arg0).field1230 <= arg1.field1230) {
            arg0 = arg0.field2817;
        }
        class177.method3362(arg1, arg0);
        this.field1067 = ((class61) this.field1068.field2814.field2817).field1230;
    }

    @ObfuscatedName("az.l(Lbk;)V")
    public void method1135(class61 arg0) {
        arg0.method3409();
        arg0.method1326();
        class179 var2 = this.field1068.field2814.field2817;
        if (this.field1068.field2814 == var2) {
            this.field1067 = -1;
        } else {
            this.field1067 = ((class61) var2).field1230;
        }
    }

    @ObfuscatedName("az.u()Lan;")
    public class48 method998() {
        return (class48) this.field1069.method3369();
    }

    @ObfuscatedName("az.p()Lan;")
    public class48 method1003() {
        return (class48) this.field1069.method3371();
    }

    @ObfuscatedName("az.t()I")
    public int method1000() {
        return 0;
    }

    @ObfuscatedName("az.s([III)V")
    public final synchronized void method990(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1067 < 0) {
                this.method1137(arg0, arg1, arg2);
                return;
            }
            if (this.field1066 + arg2 < this.field1067) {
                this.field1066 += arg2;
                this.method1137(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1067 - this.field1066;
            this.method1137(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1066 += var4;
            this.method1136();
            class61 var5 = (class61) this.field1068.method3369();
            synchronized (var5) {
                int var7 = var5.method1330(this);
                if (var7 < 0) {
                    var5.field1230 = 0;
                    this.method1135(var5);
                } else {
                    var5.field1230 = var7;
                    this.method1134(var5.field2817, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("az.g([III)V")
    public void method1137(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1069.method3369(); var4 != null; var4 = (class48) this.field1069.method3371()) {
            var4.method1152(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("az.ah(I)V")
    public final synchronized void method1002(int arg0) {
        do {
            if (this.field1067 < 0) {
                this.method1138(arg0);
                return;
            }
            if (this.field1066 + arg0 < this.field1067) {
                this.field1066 += arg0;
                this.method1138(arg0);
                return;
            }
            int var2 = this.field1067 - this.field1066;
            this.method1138(var2);
            arg0 -= var2;
            this.field1066 += var2;
            this.method1136();
            class61 var3 = (class61) this.field1068.method3369();
            synchronized (var3) {
                int var5 = var3.method1330(this);
                if (var5 < 0) {
                    var3.field1230 = 0;
                    this.method1135(var3);
                } else {
                    var3.field1230 = var5;
                    this.method1134(var3.field2817, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("az.w(I)V")
    public void method1138(int arg0) {
        for (class48 var2 = (class48) this.field1069.method3369(); var2 != null; var2 = (class48) this.field1069.method3371()) {
            var2.method1002(arg0);
        }
    }
}
