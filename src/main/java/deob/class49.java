package deob;

@ObfuscatedName("as")
public class class49 extends class60 {

    @ObfuscatedName("as.t")
    public class177 field1058 = new class177();

    @ObfuscatedName("as.s")
    public class177 field1057 = new class177();

    @ObfuscatedName("as.f")
    public int field1056 = 0;

    @ObfuscatedName("as.e")
    public int field1059 = -1;

    @ObfuscatedName("as.t(Lbe;)V")
    public final synchronized void method924(class60 arg0) {
        this.field1058.method3240(arg0);
    }

    @ObfuscatedName("as.s(Lbe;)V")
    public final synchronized void method958(class60 arg0) {
        arg0.method3316();
    }

    @ObfuscatedName("as.f()V")
    public void method926() {
        if (this.field1056 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1057.method3239(); var1 != null; var1 = (class55) this.field1057.method3248()) {
            var1.field1117 -= this.field1056;
        }
        this.field1059 -= this.field1056;
        this.field1056 = 0;
    }

    @ObfuscatedName("as.e(Lgm;Lbi;)V")
    public void method927(class186 arg0, class55 arg1) {
        while (this.field1057.field2847 != arg0 && ((class55) arg0).field1117 <= arg1.field1117) {
            arg0 = arg0.field2863;
        }
        class177.method3236(arg1, arg0);
        this.field1059 = ((class55) this.field1057.field2847.field2863).field1117;
    }

    @ObfuscatedName("as.d(Lbi;)V")
    public void method946(class55 arg0) {
        arg0.method3316();
        arg0.method1041();
        class186 var2 = this.field1057.field2847.field2863;
        if (this.field1057.field2847 == var2) {
            this.field1059 = -1;
        } else {
            this.field1059 = ((class55) var2).field1117;
        }
    }

    @ObfuscatedName("as.n()Lbe;")
    public class60 method929() {
        return (class60) this.field1058.method3239();
    }

    @ObfuscatedName("as.v()Lbe;")
    public class60 method928() {
        return (class60) this.field1058.method3248();
    }

    @ObfuscatedName("as.z()I")
    public int method931() {
        return 0;
    }

    @ObfuscatedName("as.j([III)V")
    public final synchronized void method932(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1059 < 0) {
                this.method933(arg0, arg1, arg2);
                return;
            }
            if (this.field1056 + arg2 < this.field1059) {
                this.field1056 += arg2;
                this.method933(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1059 - this.field1056;
            this.method933(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1056 += var4;
            this.method926();
            class55 var5 = (class55) this.field1057.method3239();
            synchronized (var5) {
                int var7 = var5.method1042(this);
                if (var7 < 0) {
                    var5.field1117 = 0;
                    this.method946(var5);
                } else {
                    var5.field1117 = var7;
                    this.method927(var5.field2863, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("as.u([III)V")
    public void method933(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1058.method3239(); var4 != null; var4 = (class60) this.field1058.method3248()) {
            var4.method1220(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("as.g(I)V")
    public final synchronized void method934(int arg0) {
        do {
            if (this.field1059 < 0) {
                this.method935(arg0);
                return;
            }
            if (this.field1056 + arg0 < this.field1059) {
                this.field1056 += arg0;
                this.method935(arg0);
                return;
            }
            int var2 = this.field1059 - this.field1056;
            this.method935(var2);
            arg0 -= var2;
            this.field1056 += var2;
            this.method926();
            class55 var3 = (class55) this.field1057.method3239();
            synchronized (var3) {
                int var5 = var3.method1042(this);
                if (var5 < 0) {
                    var3.field1117 = 0;
                    this.method946(var3);
                } else {
                    var3.field1117 = var5;
                    this.method927(var3.field2863, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("as.a(I)V")
    public void method935(int arg0) {
        for (class60 var2 = (class60) this.field1058.method3239(); var2 != null; var2 = (class60) this.field1058.method3248()) {
            var2.method934(arg0);
        }
    }
}
