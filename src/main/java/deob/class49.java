package deob;

@ObfuscatedName("ab")
public class class49 extends class60 {

    @ObfuscatedName("ab.n")
    public class178 field1069 = new class178();

    @ObfuscatedName("ab.x")
    public class178 field1067 = new class178();

    @ObfuscatedName("ab.k")
    public int field1066 = 0;

    @ObfuscatedName("ab.i")
    public int field1068 = -1;

    @ObfuscatedName("ab.n(Lbn;)V")
    public final synchronized void method956(class60 arg0) {
        this.field1069.method3182(arg0);
    }

    @ObfuscatedName("ab.x(Lbn;)V")
    public final synchronized void method957(class60 arg0) {
        arg0.method3277();
    }

    @ObfuscatedName("ab.k()V")
    public void method985() {
        if (this.field1066 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1067.method3179(); var1 != null; var1 = (class55) this.field1067.method3199()) {
            var1.field1125 -= this.field1066;
        }
        this.field1068 -= this.field1066;
        this.field1066 = 0;
    }

    @ObfuscatedName("ab.i(Lga;Lbb;)V")
    public void method959(class187 arg0, class55 arg1) {
        while (this.field1067.field2871 != arg0 && ((class55) arg0).field1125 <= arg1.field1125) {
            arg0 = arg0.field2887;
        }
        class178.method3183(arg1, arg0);
        this.field1068 = ((class55) this.field1067.field2871.field2887).field1125;
    }

    @ObfuscatedName("ab.d(Lbb;)V")
    public void method960(class55 arg0) {
        arg0.method3277();
        arg0.method1089();
        class187 var2 = this.field1067.field2871.field2887;
        if (this.field1067.field2871 == var2) {
            this.field1068 = -1;
        } else {
            this.field1068 = ((class55) var2).field1125;
        }
    }

    @ObfuscatedName("ab.q()Lbn;")
    public class60 method961() {
        return (class60) this.field1069.method3179();
    }

    @ObfuscatedName("ab.m()Lbn;")
    public class60 method962() {
        return (class60) this.field1069.method3199();
    }

    @ObfuscatedName("ab.a()I")
    public int method967() {
        return 0;
    }

    @ObfuscatedName("ab.w([III)V")
    public final synchronized void method963(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1068 < 0) {
                this.method973(arg0, arg1, arg2);
                return;
            }
            if (this.field1066 + arg2 < this.field1068) {
                this.field1066 += arg2;
                this.method973(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1068 - this.field1066;
            this.method973(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1066 += var4;
            this.method985();
            class55 var5 = (class55) this.field1067.method3179();
            synchronized (var5) {
                int var7 = var5.method1087(this);
                if (var7 < 0) {
                    var5.field1125 = 0;
                    this.method960(var5);
                } else {
                    var5.field1125 = var7;
                    this.method959(var5.field2887, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ab.e([III)V")
    public void method973(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1069.method3179(); var4 != null; var4 = (class60) this.field1069.method3199()) {
            var4.method1245(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ab.o(I)V")
    public final synchronized void method966(int arg0) {
        do {
            if (this.field1068 < 0) {
                this.method979(arg0);
                return;
            }
            if (this.field1066 + arg0 < this.field1068) {
                this.field1066 += arg0;
                this.method979(arg0);
                return;
            }
            int var2 = this.field1068 - this.field1066;
            this.method979(var2);
            arg0 -= var2;
            this.field1066 += var2;
            this.method985();
            class55 var3 = (class55) this.field1067.method3179();
            synchronized (var3) {
                int var5 = var3.method1087(this);
                if (var5 < 0) {
                    var3.field1125 = 0;
                    this.method960(var3);
                } else {
                    var3.field1125 = var5;
                    this.method959(var3.field2887, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ab.v(I)V")
    public void method979(int arg0) {
        for (class60 var2 = (class60) this.field1069.method3179(); var2 != null; var2 = (class60) this.field1069.method3199()) {
            var2.method966(arg0);
        }
    }
}
