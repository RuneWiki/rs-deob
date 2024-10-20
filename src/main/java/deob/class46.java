package deob;

@ObfuscatedName("ax")
public class class46 extends class48 {

    @ObfuscatedName("ax.b")
    public class177 field1068 = new class177();

    @ObfuscatedName("ax.c")
    public class177 field1066 = new class177();

    @ObfuscatedName("ax.j")
    public int field1065 = 0;

    @ObfuscatedName("ax.i")
    public int field1067 = -1;

    @ObfuscatedName("ax.b(Lao;)V")
    public final synchronized void method1087(class48 arg0) {
        this.field1068.method3242(arg0);
    }

    @ObfuscatedName("ax.c(Lao;)V")
    public final synchronized void method1088(class48 arg0) {
        arg0.method3282();
    }

    @ObfuscatedName("ax.i()V")
    public void method1096() {
        if (this.field1065 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1066.method3246(); var1 != null; var1 = (class61) this.field1066.method3248()) {
            var1.field1235 -= this.field1065;
        }
        this.field1067 -= this.field1065;
        this.field1065 = 0;
    }

    @ObfuscatedName("ax.k(Lfo;Lbz;)V")
    public void method1095(class179 arg0, class61 arg1) {
        while (this.field1066.field2821 != arg0 && ((class61) arg0).field1235 <= arg1.field1235) {
            arg0 = arg0.field2827;
        }
        class177.method3256(arg1, arg0);
        this.field1067 = ((class61) this.field1066.field2821.field2827).field1235;
    }

    @ObfuscatedName("ax.q(Lbz;)V")
    public void method1099(class61 arg0) {
        arg0.method3282();
        arg0.method1285();
        class179 var2 = this.field1066.field2821.field2827;
        if (this.field1066.field2821 == var2) {
            this.field1067 = -1;
        } else {
            this.field1067 = ((class61) var2).field1235;
        }
    }

    @ObfuscatedName("ax.h()Lao;")
    public class48 method959() {
        return (class48) this.field1068.method3246();
    }

    @ObfuscatedName("ax.p()Lao;")
    public class48 method960() {
        return (class48) this.field1068.method3248();
    }

    @ObfuscatedName("ax.e()I")
    public int method961() {
        return 0;
    }

    @ObfuscatedName("ax.r([III)V")
    public final synchronized void method962(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1067 < 0) {
                this.method1111(arg0, arg1, arg2);
                return;
            }
            if (this.field1065 + arg2 < this.field1067) {
                this.field1065 += arg2;
                this.method1111(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1067 - this.field1065;
            this.method1111(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1065 += var4;
            this.method1096();
            class61 var5 = (class61) this.field1066.method3246();
            synchronized (var5) {
                int var7 = var5.method1286(this);
                if (var7 < 0) {
                    var5.field1235 = 0;
                    this.method1099(var5);
                } else {
                    var5.field1235 = var7;
                    this.method1095(var5.field2827, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ax.t([III)V")
    public void method1111(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1068.method3246(); var4 != null; var4 = (class48) this.field1068.method3248()) {
            var4.method1114(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ax.av(I)V")
    public final synchronized void method963(int arg0) {
        do {
            if (this.field1067 < 0) {
                this.method1094(arg0);
                return;
            }
            if (this.field1065 + arg0 < this.field1067) {
                this.field1065 += arg0;
                this.method1094(arg0);
                return;
            }
            int var2 = this.field1067 - this.field1065;
            this.method1094(var2);
            arg0 -= var2;
            this.field1065 += var2;
            this.method1096();
            class61 var3 = (class61) this.field1066.method3246();
            synchronized (var3) {
                int var5 = var3.method1286(this);
                if (var5 < 0) {
                    var3.field1235 = 0;
                    this.method1099(var3);
                } else {
                    var3.field1235 = var5;
                    this.method1095(var3.field2827, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ax.v(I)V")
    public void method1094(int arg0) {
        for (class48 var2 = (class48) this.field1068.method3246(); var2 != null; var2 = (class48) this.field1068.method3248()) {
            var2.method963(arg0);
        }
    }
}
