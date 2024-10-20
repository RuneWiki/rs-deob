package deob;

@ObfuscatedName("an")
public class class49 extends class60 {

    @ObfuscatedName("an.b")
    public class177 field1073 = new class177();

    @ObfuscatedName("an.u")
    public class177 field1071 = new class177();

    @ObfuscatedName("an.x")
    public int field1070 = 0;

    @ObfuscatedName("an.j")
    public int field1072 = -1;

    @ObfuscatedName("an.b(Lbl;)V")
    public final synchronized void method978(class60 arg0) {
        this.field1073.method3181(arg0);
    }

    @ObfuscatedName("an.u(Lbl;)V")
    public final synchronized void method937(class60 arg0) {
        arg0.method3260();
    }

    @ObfuscatedName("an.x()V")
    public void method938() {
        if (this.field1070 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1071.method3185(); var1 != null; var1 = (class55) this.field1071.method3187()) {
            var1.field1124 -= this.field1070;
        }
        this.field1072 -= this.field1070;
        this.field1070 = 0;
    }

    @ObfuscatedName("an.j(Lge;Lbj;)V")
    public void method939(class184 arg0, class55 arg1) {
        while (this.field1071.field2849 != arg0 && ((class55) arg0).field1124 <= arg1.field1124) {
            arg0 = arg0.field2860;
        }
        class177.method3201(arg1, arg0);
        this.field1072 = ((class55) this.field1071.field2849.field2860).field1124;
    }

    @ObfuscatedName("an.o(Lbj;)V")
    public void method940(class55 arg0) {
        arg0.method3260();
        arg0.method1054();
        class184 var2 = this.field1071.field2849.field2860;
        if (this.field1071.field2849 == var2) {
            this.field1072 = -1;
        } else {
            this.field1072 = ((class55) var2).field1124;
        }
    }

    @ObfuscatedName("an.n()Lbl;")
    public class60 method952() {
        return (class60) this.field1073.method3185();
    }

    @ObfuscatedName("an.y()Lbl;")
    public class60 method942() {
        return (class60) this.field1073.method3187();
    }

    @ObfuscatedName("an.f()I")
    public int method943() {
        return 0;
    }

    @ObfuscatedName("an.p([III)V")
    public final synchronized void method944(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1072 < 0) {
                this.method945(arg0, arg1, arg2);
                return;
            }
            if (this.field1070 + arg2 < this.field1072) {
                this.field1070 += arg2;
                this.method945(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1072 - this.field1070;
            this.method945(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1070 += var4;
            this.method938();
            class55 var5 = (class55) this.field1071.method3185();
            synchronized (var5) {
                int var7 = var5.method1053(this);
                if (var7 < 0) {
                    var5.field1124 = 0;
                    this.method940(var5);
                } else {
                    var5.field1124 = var7;
                    this.method939(var5.field2860, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("an.l([III)V")
    public void method945(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1073.method3185(); var4 != null; var4 = (class60) this.field1073.method3187()) {
            var4.method1244(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("an.k(I)V")
    public final synchronized void method969(int arg0) {
        do {
            if (this.field1072 < 0) {
                this.method972(arg0);
                return;
            }
            if (this.field1070 + arg0 < this.field1072) {
                this.field1070 += arg0;
                this.method972(arg0);
                return;
            }
            int var2 = this.field1072 - this.field1070;
            this.method972(var2);
            arg0 -= var2;
            this.field1070 += var2;
            this.method938();
            class55 var3 = (class55) this.field1071.method3185();
            synchronized (var3) {
                int var5 = var3.method1053(this);
                if (var5 < 0) {
                    var3.field1124 = 0;
                    this.method940(var3);
                } else {
                    var3.field1124 = var5;
                    this.method939(var3.field2860, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("an.q(I)V")
    public void method972(int arg0) {
        for (class60 var2 = (class60) this.field1073.method3185(); var2 != null; var2 = (class60) this.field1073.method3187()) {
            var2.method969(arg0);
        }
    }
}
