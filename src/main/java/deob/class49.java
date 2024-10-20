package deob;

@ObfuscatedName("ag")
public class class49 extends class60 {

    @ObfuscatedName("ag.e")
    public class176 field1064 = new class176();

    @ObfuscatedName("ag.p")
    public class176 field1061 = new class176();

    @ObfuscatedName("ag.a")
    public int field1063 = 0;

    @ObfuscatedName("ag.g")
    public int field1062 = -1;

    @ObfuscatedName("ag.e(Lbc;)V")
    public final synchronized void method974(class60 arg0) {
        this.field1064.method3221(arg0);
    }

    @ObfuscatedName("ag.p(Lbc;)V")
    public final synchronized void method975(class60 arg0) {
        arg0.method3307();
    }

    @ObfuscatedName("ag.a()V")
    public void method998() {
        if (this.field1063 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1061.method3225(); var1 != null; var1 = (class55) this.field1061.method3227()) {
            var1.field1122 -= this.field1063;
        }
        this.field1062 -= this.field1063;
        this.field1063 = 0;
    }

    @ObfuscatedName("ag.g(Lgl;Lbe;)V")
    public void method977(class183 arg0, class55 arg1) {
        while (this.field1061.field2832 != arg0 && ((class55) arg0).field1122 <= arg1.field1122) {
            arg0 = arg0.field2844;
        }
        class176.method3234(arg1, arg0);
        this.field1062 = ((class55) this.field1061.field2832.field2844).field1122;
    }

    @ObfuscatedName("ag.u(Lbe;)V")
    public void method978(class55 arg0) {
        arg0.method3307();
        arg0.method1100();
        class183 var2 = this.field1061.field2832.field2844;
        if (this.field1061.field2832 == var2) {
            this.field1062 = -1;
        } else {
            this.field1062 = ((class55) var2).field1122;
        }
    }

    @ObfuscatedName("ag.k()Lbc;")
    public class60 method1002() {
        return (class60) this.field1064.method3225();
    }

    @ObfuscatedName("ag.m()Lbc;")
    public class60 method980() {
        return (class60) this.field1064.method3227();
    }

    @ObfuscatedName("ag.t()I")
    public int method1017() {
        return 0;
    }

    @ObfuscatedName("ag.l([III)V")
    public final synchronized void method982(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1062 < 0) {
                this.method1000(arg0, arg1, arg2);
                return;
            }
            if (this.field1063 + arg2 < this.field1062) {
                this.field1063 += arg2;
                this.method1000(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1062 - this.field1063;
            this.method1000(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1063 += var4;
            this.method998();
            class55 var5 = (class55) this.field1061.method3225();
            synchronized (var5) {
                int var7 = var5.method1097(this);
                if (var7 < 0) {
                    var5.field1122 = 0;
                    this.method978(var5);
                } else {
                    var5.field1122 = var7;
                    this.method977(var5.field2844, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ag.f([III)V")
    public void method1000(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1064.method3225(); var4 != null; var4 = (class60) this.field1064.method3227()) {
            var4.method1254(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ag.c(I)V")
    public final synchronized void method984(int arg0) {
        do {
            if (this.field1062 < 0) {
                this.method999(arg0);
                return;
            }
            if (this.field1063 + arg0 < this.field1062) {
                this.field1063 += arg0;
                this.method999(arg0);
                return;
            }
            int var2 = this.field1062 - this.field1063;
            this.method999(var2);
            arg0 -= var2;
            this.field1063 += var2;
            this.method998();
            class55 var3 = (class55) this.field1061.method3225();
            synchronized (var3) {
                int var5 = var3.method1097(this);
                if (var5 < 0) {
                    var3.field1122 = 0;
                    this.method978(var3);
                } else {
                    var3.field1122 = var5;
                    this.method977(var3.field2844, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ag.i(I)V")
    public void method999(int arg0) {
        for (class60 var2 = (class60) this.field1064.method3225(); var2 != null; var2 = (class60) this.field1064.method3227()) {
            var2.method984(arg0);
        }
    }
}
