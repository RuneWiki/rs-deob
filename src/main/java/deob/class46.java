package deob;

@ObfuscatedName("aj")
public class class46 extends class48 {

    @ObfuscatedName("aj.i")
    public class177 field1067 = new class177();

    @ObfuscatedName("aj.p")
    public class177 field1070 = new class177();

    @ObfuscatedName("aj.a")
    public int field1069 = 0;

    @ObfuscatedName("aj.l")
    public int field1068 = -1;

    @ObfuscatedName("aj.i(Lay;)V")
    public final synchronized void method1057(class48 arg0) {
        this.field1067.method3294(arg0);
    }

    @ObfuscatedName("aj.p(Lay;)V")
    public final synchronized void method1058(class48 arg0) {
        arg0.method3319();
    }

    @ObfuscatedName("aj.l()V")
    public void method1059() {
        if (this.field1069 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1070.method3313(); var1 != null; var1 = (class61) this.field1070.method3292()) {
            var1.field1225 -= this.field1069;
        }
        this.field1068 -= this.field1069;
        this.field1069 = 0;
    }

    @ObfuscatedName("aj.q(Lfk;Lbk;)V")
    public void method1060(class179 arg0, class61 arg1) {
        while (this.field1070.field2813 != arg0 && ((class61) arg0).field1225 <= arg1.field1225) {
            arg0 = arg0.field2817;
        }
        class177.method3287(arg1, arg0);
        this.field1068 = ((class61) this.field1070.field2813.field2817).field1225;
    }

    @ObfuscatedName("aj.b(Lbk;)V")
    public void method1079(class61 arg0) {
        arg0.method3319();
        arg0.method1258();
        class179 var2 = this.field1070.field2813.field2817;
        if (this.field1070.field2813 == var2) {
            this.field1068 = -1;
        } else {
            this.field1068 = ((class61) var2).field1225;
        }
    }

    @ObfuscatedName("aj.w()Lay;")
    public class48 method940() {
        return (class48) this.field1067.method3313();
    }

    @ObfuscatedName("aj.x()Lay;")
    public class48 method941() {
        return (class48) this.field1067.method3292();
    }

    @ObfuscatedName("aj.n()I")
    public int method1019() {
        return 0;
    }

    @ObfuscatedName("aj.c([III)V")
    public final synchronized void method943(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1068 < 0) {
                this.method1061(arg0, arg1, arg2);
                return;
            }
            if (this.field1069 + arg2 < this.field1068) {
                this.field1069 += arg2;
                this.method1061(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1068 - this.field1069;
            this.method1061(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1069 += var4;
            this.method1059();
            class61 var5 = (class61) this.field1070.method3313();
            synchronized (var5) {
                int var7 = var5.method1254(this);
                if (var7 < 0) {
                    var5.field1225 = 0;
                    this.method1079(var5);
                } else {
                    var5.field1225 = var7;
                    this.method1060(var5.field2817, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aj.u([III)V")
    public void method1061(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1067.method3313(); var4 != null; var4 = (class48) this.field1067.method3292()) {
            var4.method1084(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aj.az(I)V")
    public final synchronized void method1018(int arg0) {
        do {
            if (this.field1068 < 0) {
                this.method1063(arg0);
                return;
            }
            if (this.field1069 + arg0 < this.field1068) {
                this.field1069 += arg0;
                this.method1063(arg0);
                return;
            }
            int var2 = this.field1068 - this.field1069;
            this.method1063(var2);
            arg0 -= var2;
            this.field1069 += var2;
            this.method1059();
            class61 var3 = (class61) this.field1070.method3313();
            synchronized (var3) {
                int var5 = var3.method1254(this);
                if (var5 < 0) {
                    var3.field1225 = 0;
                    this.method1079(var3);
                } else {
                    var3.field1225 = var5;
                    this.method1060(var3.field2817, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aj.d(I)V")
    public void method1063(int arg0) {
        for (class48 var2 = (class48) this.field1067.method3313(); var2 != null; var2 = (class48) this.field1067.method3292()) {
            var2.method1018(arg0);
        }
    }
}
