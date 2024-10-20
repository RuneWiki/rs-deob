package deob;

@ObfuscatedName("ax")
public class class49 extends class60 {

    @ObfuscatedName("ax.e")
    public class177 field1081 = new class177();

    @ObfuscatedName("ax.o")
    public class177 field1080 = new class177();

    @ObfuscatedName("ax.y")
    public int field1082 = 0;

    @ObfuscatedName("ax.b")
    public int field1079 = -1;

    @ObfuscatedName("ax.e(Lbc;)V")
    public final synchronized void method923(class60 arg0) {
        this.field1081.method3129(arg0);
    }

    @ObfuscatedName("ax.o(Lbc;)V")
    public final synchronized void method924(class60 arg0) {
        arg0.method3204();
    }

    @ObfuscatedName("ax.y()V")
    public void method925() {
        if (this.field1082 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1080.method3122(); var1 != null; var1 = (class55) this.field1080.method3124()) {
            var1.field1134 -= this.field1082;
        }
        this.field1079 -= this.field1082;
        this.field1082 = 0;
    }

    @ObfuscatedName("ax.b(Lgm;Lbl;)V")
    public void method922(class186 arg0, class55 arg1) {
        while (this.field1080.field2857 != arg0 && ((class55) arg0).field1134 <= arg1.field1134) {
            arg0 = arg0.field2873;
        }
        class177.method3119(arg1, arg0);
        this.field1079 = ((class55) this.field1080.field2857.field2873).field1134;
    }

    @ObfuscatedName("ax.w(Lbl;)V")
    public void method963(class55 arg0) {
        arg0.method3204();
        arg0.method1051();
        class186 var2 = this.field1080.field2857.field2873;
        if (this.field1080.field2857 == var2) {
            this.field1079 = -1;
        } else {
            this.field1079 = ((class55) var2).field1134;
        }
    }

    @ObfuscatedName("ax.r()Lbc;")
    public class60 method942() {
        return (class60) this.field1081.method3122();
    }

    @ObfuscatedName("ax.l()Lbc;")
    public class60 method933() {
        return (class60) this.field1081.method3124();
    }

    @ObfuscatedName("ax.s()I")
    public int method930() {
        return 0;
    }

    @ObfuscatedName("ax.f([III)V")
    public final synchronized void method931(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1079 < 0) {
                this.method932(arg0, arg1, arg2);
                return;
            }
            if (this.field1082 + arg2 < this.field1079) {
                this.field1082 += arg2;
                this.method932(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1079 - this.field1082;
            this.method932(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1082 += var4;
            this.method925();
            class55 var5 = (class55) this.field1080.method3122();
            synchronized (var5) {
                int var7 = var5.method1052(this);
                if (var7 < 0) {
                    var5.field1134 = 0;
                    this.method963(var5);
                } else {
                    var5.field1134 = var7;
                    this.method922(var5.field2873, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ax.x([III)V")
    public void method932(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1081.method3122(); var4 != null; var4 = (class60) this.field1081.method3124()) {
            var4.method1219(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ax.h(I)V")
    public final synchronized void method959(int arg0) {
        do {
            if (this.field1079 < 0) {
                this.method934(arg0);
                return;
            }
            if (this.field1082 + arg0 < this.field1079) {
                this.field1082 += arg0;
                this.method934(arg0);
                return;
            }
            int var2 = this.field1079 - this.field1082;
            this.method934(var2);
            arg0 -= var2;
            this.field1082 += var2;
            this.method925();
            class55 var3 = (class55) this.field1080.method3122();
            synchronized (var3) {
                int var5 = var3.method1052(this);
                if (var5 < 0) {
                    var3.field1134 = 0;
                    this.method963(var3);
                } else {
                    var3.field1134 = var5;
                    this.method922(var3.field2873, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ax.a(I)V")
    public void method934(int arg0) {
        for (class60 var2 = (class60) this.field1081.method3122(); var2 != null; var2 = (class60) this.field1081.method3124()) {
            var2.method959(arg0);
        }
    }
}
