package deob;

@ObfuscatedName("ap")
public class class49 extends class60 {

    @ObfuscatedName("ap.g")
    public class178 field1069 = new class178();

    @ObfuscatedName("ap.s")
    public class178 field1067 = new class178();

    @ObfuscatedName("ap.v")
    public int field1068 = 0;

    @ObfuscatedName("ap.o")
    public int field1070 = -1;

    @ObfuscatedName("ap.g(Lbm;)V")
    public final synchronized void method960(class60 arg0) {
        this.field1069.method3185(arg0);
    }

    @ObfuscatedName("ap.s(Lbm;)V")
    public final synchronized void method930(class60 arg0) {
        arg0.method3285();
    }

    @ObfuscatedName("ap.v()V")
    public void method933() {
        if (this.field1068 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1067.method3189(); var1 != null; var1 = (class55) this.field1067.method3182()) {
            var1.field1126 -= this.field1068;
        }
        this.field1070 -= this.field1068;
        this.field1068 = 0;
    }

    @ObfuscatedName("ap.o(Lgz;Lbf;)V")
    public void method934(class187 arg0, class55 arg1) {
        while (this.field1067.field2866 != arg0 && ((class55) arg0).field1126 <= arg1.field1126) {
            arg0 = arg0.field2883;
        }
        class178.method3198(arg1, arg0);
        this.field1070 = ((class55) this.field1067.field2866.field2883).field1126;
    }

    @ObfuscatedName("ap.k(Lbf;)V")
    public void method935(class55 arg0) {
        arg0.method3285();
        arg0.method1056();
        class187 var2 = this.field1067.field2866.field2883;
        if (this.field1067.field2866 == var2) {
            this.field1070 = -1;
        } else {
            this.field1070 = ((class55) var2).field1126;
        }
    }

    @ObfuscatedName("ap.m()Lbm;")
    public class60 method932() {
        return (class60) this.field1069.method3189();
    }

    @ObfuscatedName("ap.i()Lbm;")
    public class60 method937() {
        return (class60) this.field1069.method3182();
    }

    @ObfuscatedName("ap.t()I")
    public int method938() {
        return 0;
    }

    @ObfuscatedName("ap.l([III)V")
    public final synchronized void method939(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1070 < 0) {
                this.method940(arg0, arg1, arg2);
                return;
            }
            if (this.field1068 + arg2 < this.field1070) {
                this.field1068 += arg2;
                this.method940(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1070 - this.field1068;
            this.method940(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1068 += var4;
            this.method933();
            class55 var5 = (class55) this.field1067.method3189();
            synchronized (var5) {
                int var7 = var5.method1061(this);
                if (var7 < 0) {
                    var5.field1126 = 0;
                    this.method935(var5);
                } else {
                    var5.field1126 = var7;
                    this.method934(var5.field2883, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ap.p([III)V")
    public void method940(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1069.method3189(); var4 != null; var4 = (class60) this.field1069.method3182()) {
            var4.method1211(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ap.r(I)V")
    public final synchronized void method941(int arg0) {
        do {
            if (this.field1070 < 0) {
                this.method970(arg0);
                return;
            }
            if (this.field1068 + arg0 < this.field1070) {
                this.field1068 += arg0;
                this.method970(arg0);
                return;
            }
            int var2 = this.field1070 - this.field1068;
            this.method970(var2);
            arg0 -= var2;
            this.field1068 += var2;
            this.method933();
            class55 var3 = (class55) this.field1067.method3189();
            synchronized (var3) {
                int var5 = var3.method1061(this);
                if (var5 < 0) {
                    var3.field1126 = 0;
                    this.method935(var3);
                } else {
                    var3.field1126 = var5;
                    this.method934(var3.field2883, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ap.j(I)V")
    public void method970(int arg0) {
        for (class60 var2 = (class60) this.field1069.method3189(); var2 != null; var2 = (class60) this.field1069.method3182()) {
            var2.method941(arg0);
        }
    }
}
