package deob;

@ObfuscatedName("ac")
public class class49 extends class60 {

    @ObfuscatedName("ac.p")
    public class178 field1065 = new class178();

    @ObfuscatedName("ac.g")
    public class178 field1066 = new class178();

    @ObfuscatedName("ac.x")
    public int field1068 = 0;

    @ObfuscatedName("ac.c")
    public int field1067 = -1;

    @ObfuscatedName("ac.p(Lbn;)V")
    public final synchronized void method1001(class60 arg0) {
        this.field1065.method3294(arg0);
    }

    @ObfuscatedName("ac.g(Lbn;)V")
    public final synchronized void method1037(class60 arg0) {
        arg0.method3378();
    }

    @ObfuscatedName("ac.x()V")
    public void method1019() {
        if (this.field1068 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1066.method3303(); var1 != null; var1 = (class55) this.field1066.method3300()) {
            var1.field1120 -= this.field1068;
        }
        this.field1067 -= this.field1068;
        this.field1068 = 0;
    }

    @ObfuscatedName("ac.c(Lgq;Lby;)V")
    public void method1004(class187 arg0, class55 arg1) {
        while (this.field1066.field2863 != arg0 && ((class55) arg0).field1120 <= arg1.field1120) {
            arg0 = arg0.field2880;
        }
        class178.method3295(arg1, arg0);
        this.field1067 = ((class55) this.field1066.field2863.field2880).field1120;
    }

    @ObfuscatedName("ac.n(Lby;)V")
    public void method1000(class55 arg0) {
        arg0.method3378();
        arg0.method1122();
        class187 var2 = this.field1066.field2863.field2880;
        if (this.field1066.field2863 == var2) {
            this.field1067 = -1;
        } else {
            this.field1067 = ((class55) var2).field1120;
        }
    }

    @ObfuscatedName("ac.s()Lbn;")
    public class60 method1005() {
        return (class60) this.field1065.method3303();
    }

    @ObfuscatedName("ac.r()Lbn;")
    public class60 method1029() {
        return (class60) this.field1065.method3300();
    }

    @ObfuscatedName("ac.w()I")
    public int method1030() {
        return 0;
    }

    @ObfuscatedName("ac.u([III)V")
    public final synchronized void method1008(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1067 < 0) {
                this.method1009(arg0, arg1, arg2);
                return;
            }
            if (this.field1068 + arg2 < this.field1067) {
                this.field1068 += arg2;
                this.method1009(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1067 - this.field1068;
            this.method1009(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1068 += var4;
            this.method1019();
            class55 var5 = (class55) this.field1066.method3303();
            synchronized (var5) {
                int var7 = var5.method1120(this);
                if (var7 < 0) {
                    var5.field1120 = 0;
                    this.method1000(var5);
                } else {
                    var5.field1120 = var7;
                    this.method1004(var5.field2880, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ac.d([III)V")
    public void method1009(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1065.method3303(); var4 != null; var4 = (class60) this.field1065.method3300()) {
            var4.method1284(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ac.h(I)V")
    public final synchronized void method1010(int arg0) {
        do {
            if (this.field1067 < 0) {
                this.method1011(arg0);
                return;
            }
            if (this.field1068 + arg0 < this.field1067) {
                this.field1068 += arg0;
                this.method1011(arg0);
                return;
            }
            int var2 = this.field1067 - this.field1068;
            this.method1011(var2);
            arg0 -= var2;
            this.field1068 += var2;
            this.method1019();
            class55 var3 = (class55) this.field1066.method3303();
            synchronized (var3) {
                int var5 = var3.method1120(this);
                if (var5 < 0) {
                    var3.field1120 = 0;
                    this.method1000(var3);
                } else {
                    var3.field1120 = var5;
                    this.method1004(var3.field2880, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ac.a(I)V")
    public void method1011(int arg0) {
        for (class60 var2 = (class60) this.field1065.method3303(); var2 != null; var2 = (class60) this.field1065.method3300()) {
            var2.method1010(arg0);
        }
    }
}
