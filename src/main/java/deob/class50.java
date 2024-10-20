package deob;

@ObfuscatedName("ac")
public class class50 extends class61 {

    @ObfuscatedName("ac.a")
    public class182 field1078 = new class182();

    @ObfuscatedName("ac.v")
    public class182 field1079 = new class182();

    @ObfuscatedName("ac.i")
    public int field1080 = 0;

    @ObfuscatedName("ac.b")
    public int field1081 = -1;

    @ObfuscatedName("ac.a(Lbz;)V")
    public final synchronized void method968(class61 arg0) {
        this.field1078.method3257(arg0);
    }

    @ObfuscatedName("ac.v(Lbz;)V")
    public final synchronized void method969(class61 arg0) {
        arg0.method3343();
    }

    @ObfuscatedName("ac.i()V")
    public void method970() {
        if (this.field1080 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field1079.method3251(); var1 != null; var1 = (class56) this.field1079.method3261()) {
            var1.field1138 -= this.field1080;
        }
        this.field1081 -= this.field1080;
        this.field1080 = 0;
    }

    @ObfuscatedName("ac.b(Lgq;Lbs;)V")
    public void method967(class191 arg0, class56 arg1) {
        while (this.field1079.field2891 != arg0 && ((class56) arg0).field1138 <= arg1.field1138) {
            arg0 = arg0.field2909;
        }
        class182.method3248(arg1, arg0);
        this.field1081 = ((class56) this.field1079.field2891.field2909).field1138;
    }

    @ObfuscatedName("ac.l(Lbs;)V")
    public void method1003(class56 arg0) {
        arg0.method3343();
        arg0.method1081();
        class191 var2 = this.field1079.field2891.field2909;
        if (this.field1079.field2891 == var2) {
            this.field1081 = -1;
        } else {
            this.field1081 = ((class56) var2).field1138;
        }
    }

    @ObfuscatedName("ac.m()Lbz;")
    public class61 method978() {
        return (class61) this.field1078.method3251();
    }

    @ObfuscatedName("ac.w()Lbz;")
    public class61 method974() {
        return (class61) this.field1078.method3261();
    }

    @ObfuscatedName("ac.e()I")
    public int method987() {
        return 0;
    }

    @ObfuscatedName("ac.n([III)V")
    public final synchronized void method975(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1081 < 0) {
                this.method976(arg0, arg1, arg2);
                return;
            }
            if (this.field1080 + arg2 < this.field1081) {
                this.field1080 += arg2;
                this.method976(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1081 - this.field1080;
            this.method976(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1080 += var4;
            this.method970();
            class56 var5 = (class56) this.field1079.method3251();
            synchronized (var5) {
                int var7 = var5.method1082(this);
                if (var7 < 0) {
                    var5.field1138 = 0;
                    this.method1003(var5);
                } else {
                    var5.field1138 = var7;
                    this.method967(var5.field2909, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ac.s([III)V")
    public void method976(int[] arg0, int arg1, int arg2) {
        for (class61 var4 = (class61) this.field1078.method3251(); var4 != null; var4 = (class61) this.field1078.method3261()) {
            var4.method1240(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ac.k(I)V")
    public final synchronized void method977(int arg0) {
        do {
            if (this.field1081 < 0) {
                this.method992(arg0);
                return;
            }
            if (this.field1080 + arg0 < this.field1081) {
                this.field1080 += arg0;
                this.method992(arg0);
                return;
            }
            int var2 = this.field1081 - this.field1080;
            this.method992(var2);
            arg0 -= var2;
            this.field1080 += var2;
            this.method970();
            class56 var3 = (class56) this.field1079.method3251();
            synchronized (var3) {
                int var5 = var3.method1082(this);
                if (var5 < 0) {
                    var3.field1138 = 0;
                    this.method1003(var3);
                } else {
                    var3.field1138 = var5;
                    this.method967(var3.field2909, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ac.f(I)V")
    public void method992(int arg0) {
        for (class61 var2 = (class61) this.field1078.method3251(); var2 != null; var2 = (class61) this.field1078.method3261()) {
            var2.method977(arg0);
        }
    }
}
