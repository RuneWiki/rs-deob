package deob;

@ObfuscatedName("au")
public class class50 extends class61 {

    @ObfuscatedName("au.b")
    public class182 field1075 = new class182();

    @ObfuscatedName("au.e")
    public class182 field1072 = new class182();

    @ObfuscatedName("au.i")
    public int field1074 = 0;

    @ObfuscatedName("au.k")
    public int field1073 = -1;

    @ObfuscatedName("au.b(Lbe;)V")
    public final synchronized void method955(class61 arg0) {
        this.field1075.method3289(arg0);
    }

    @ObfuscatedName("au.e(Lbe;)V")
    public final synchronized void method939(class61 arg0) {
        arg0.method3392();
    }

    @ObfuscatedName("au.i()V")
    public void method940() {
        if (this.field1074 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field1072.method3293(); var1 != null; var1 = (class56) this.field1072.method3288()) {
            var1.field1132 -= this.field1074;
        }
        this.field1073 -= this.field1074;
        this.field1074 = 0;
    }

    @ObfuscatedName("au.k(Lgx;Lbm;)V")
    public void method941(class191 arg0, class56 arg1) {
        while (this.field1072.field2889 != arg0 && ((class56) arg0).field1132 <= arg1.field1132) {
            arg0 = arg0.field2904;
        }
        class182.method3290(arg1, arg0);
        this.field1073 = ((class56) this.field1072.field2889.field2904).field1132;
    }

    @ObfuscatedName("au.h(Lbm;)V")
    public void method958(class56 arg0) {
        arg0.method3392();
        arg0.method1057();
        class191 var2 = this.field1072.field2889.field2904;
        if (this.field1072.field2889 == var2) {
            this.field1073 = -1;
        } else {
            this.field1073 = ((class56) var2).field1132;
        }
    }

    @ObfuscatedName("au.p()Lbe;")
    public class61 method943() {
        return (class61) this.field1075.method3293();
    }

    @ObfuscatedName("au.n()Lbe;")
    public class61 method944() {
        return (class61) this.field1075.method3288();
    }

    @ObfuscatedName("au.o()I")
    public int method959() {
        return 0;
    }

    @ObfuscatedName("au.g([III)V")
    public final synchronized void method946(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1073 < 0) {
                this.method947(arg0, arg1, arg2);
                return;
            }
            if (this.field1074 + arg2 < this.field1073) {
                this.field1074 += arg2;
                this.method947(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1073 - this.field1074;
            this.method947(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1074 += var4;
            this.method940();
            class56 var5 = (class56) this.field1072.method3293();
            synchronized (var5) {
                int var7 = var5.method1056(this);
                if (var7 < 0) {
                    var5.field1132 = 0;
                    this.method958(var5);
                } else {
                    var5.field1132 = var7;
                    this.method941(var5.field2904, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("au.z([III)V")
    public void method947(int[] arg0, int arg1, int arg2) {
        for (class61 var4 = (class61) this.field1075.method3293(); var4 != null; var4 = (class61) this.field1075.method3288()) {
            var4.method1228(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("au.t(I)V")
    public final synchronized void method948(int arg0) {
        do {
            if (this.field1073 < 0) {
                this.method949(arg0);
                return;
            }
            if (this.field1074 + arg0 < this.field1073) {
                this.field1074 += arg0;
                this.method949(arg0);
                return;
            }
            int var2 = this.field1073 - this.field1074;
            this.method949(var2);
            arg0 -= var2;
            this.field1074 += var2;
            this.method940();
            class56 var3 = (class56) this.field1072.method3293();
            synchronized (var3) {
                int var5 = var3.method1056(this);
                if (var5 < 0) {
                    var3.field1132 = 0;
                    this.method958(var3);
                } else {
                    var3.field1132 = var5;
                    this.method941(var3.field2904, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("au.y(I)V")
    public void method949(int arg0) {
        for (class61 var2 = (class61) this.field1075.method3293(); var2 != null; var2 = (class61) this.field1075.method3288()) {
            var2.method948(arg0);
        }
    }
}
