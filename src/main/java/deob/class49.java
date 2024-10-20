package deob;

@ObfuscatedName("at")
public class class49 extends class60 {

    @ObfuscatedName("at.z")
    public class177 field1039 = new class177();

    @ObfuscatedName("at.j")
    public class177 field1037 = new class177();

    @ObfuscatedName("at.a")
    public int field1040 = 0;

    @ObfuscatedName("at.y")
    public int field1038 = -1;

    @ObfuscatedName("at.z(Lbq;)V")
    public final synchronized void method936(class60 arg0) {
        this.field1039.method3228(arg0);
    }

    @ObfuscatedName("at.j(Lbq;)V")
    public final synchronized void method950(class60 arg0) {
        arg0.method3311();
    }

    @ObfuscatedName("at.a()V")
    public void method935() {
        if (this.field1040 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1037.method3232(); var1 != null; var1 = (class55) this.field1037.method3251()) {
            var1.field1098 -= this.field1040;
        }
        this.field1038 -= this.field1040;
        this.field1040 = 0;
    }

    @ObfuscatedName("at.y(Lgj;Lby;)V")
    public void method938(class184 arg0, class55 arg1) {
        while (this.field1037.field2844 != arg0 && ((class55) arg0).field1098 <= arg1.field1098) {
            arg0 = arg0.field2856;
        }
        class177.method3225(arg1, arg0);
        this.field1038 = ((class55) this.field1037.field2844.field2856).field1098;
    }

    @ObfuscatedName("at.i(Lby;)V")
    public void method940(class55 arg0) {
        arg0.method3311();
        arg0.method1045();
        class184 var2 = this.field1037.field2844.field2856;
        if (this.field1037.field2844 == var2) {
            this.field1038 = -1;
        } else {
            this.field1038 = ((class55) var2).field1098;
        }
    }

    @ObfuscatedName("at.b()Lbq;")
    public class60 method943() {
        return (class60) this.field1039.method3232();
    }

    @ObfuscatedName("at.s()Lbq;")
    public class60 method941() {
        return (class60) this.field1039.method3251();
    }

    @ObfuscatedName("at.q()I")
    public int method942() {
        return 0;
    }

    @ObfuscatedName("at.p([III)V")
    public final synchronized void method946(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1038 < 0) {
                this.method944(arg0, arg1, arg2);
                return;
            }
            if (this.field1040 + arg2 < this.field1038) {
                this.field1040 += arg2;
                this.method944(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1038 - this.field1040;
            this.method944(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1040 += var4;
            this.method935();
            class55 var5 = (class55) this.field1037.method3232();
            synchronized (var5) {
                int var7 = var5.method1037(this);
                if (var7 < 0) {
                    var5.field1098 = 0;
                    this.method940(var5);
                } else {
                    var5.field1098 = var7;
                    this.method938(var5.field2856, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("at.h([III)V")
    public void method944(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1039.method3232(); var4 != null; var4 = (class60) this.field1039.method3251()) {
            var4.method1211(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("at.r(I)V")
    public final synchronized void method945(int arg0) {
        do {
            if (this.field1038 < 0) {
                this.method961(arg0);
                return;
            }
            if (this.field1040 + arg0 < this.field1038) {
                this.field1040 += arg0;
                this.method961(arg0);
                return;
            }
            int var2 = this.field1038 - this.field1040;
            this.method961(var2);
            arg0 -= var2;
            this.field1040 += var2;
            this.method935();
            class55 var3 = (class55) this.field1037.method3232();
            synchronized (var3) {
                int var5 = var3.method1037(this);
                if (var5 < 0) {
                    var3.field1098 = 0;
                    this.method940(var3);
                } else {
                    var3.field1098 = var5;
                    this.method938(var3.field2856, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("at.o(I)V")
    public void method961(int arg0) {
        for (class60 var2 = (class60) this.field1039.method3232(); var2 != null; var2 = (class60) this.field1039.method3251()) {
            var2.method945(arg0);
        }
    }
}
