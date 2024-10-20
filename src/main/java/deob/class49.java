package deob;

@ObfuscatedName("au")
public class class49 extends class60 {

    @ObfuscatedName("au.g")
    public class178 field1067 = new class178();

    @ObfuscatedName("au.s")
    public class178 field1065 = new class178();

    @ObfuscatedName("au.h")
    public int field1064 = 0;

    @ObfuscatedName("au.m")
    public int field1066 = -1;

    @ObfuscatedName("au.g(Lbw;)V")
    public final synchronized void method933(class60 arg0) {
        this.field1067.method3217(arg0);
    }

    @ObfuscatedName("au.s(Lbw;)V")
    public final synchronized void method954(class60 arg0) {
        arg0.method3280();
    }

    @ObfuscatedName("au.h()V")
    public void method935() {
        if (this.field1064 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1065.method3196(); var1 != null; var1 = (class55) this.field1065.method3206()) {
            var1.field1126 -= this.field1064;
        }
        this.field1066 -= this.field1064;
        this.field1064 = 0;
    }

    @ObfuscatedName("au.m(Lgg;Lbb;)V")
    public void method973(class187 arg0, class55 arg1) {
        while (this.field1065.field2857 != arg0 && ((class55) arg0).field1126 <= arg1.field1126) {
            arg0 = arg0.field2874;
        }
        class178.method3190(arg1, arg0);
        this.field1066 = ((class55) this.field1065.field2857.field2874).field1126;
    }

    @ObfuscatedName("au.u(Lbb;)V")
    public void method937(class55 arg0) {
        arg0.method3280();
        arg0.method1069();
        class187 var2 = this.field1065.field2857.field2874;
        if (this.field1065.field2857 == var2) {
            this.field1066 = -1;
        } else {
            this.field1066 = ((class55) var2).field1126;
        }
    }

    @ObfuscatedName("au.j()Lbw;")
    public class60 method938() {
        return (class60) this.field1067.method3196();
    }

    @ObfuscatedName("au.b()Lbw;")
    public class60 method939() {
        return (class60) this.field1067.method3206();
    }

    @ObfuscatedName("au.v()I")
    public int method940() {
        return 0;
    }

    @ObfuscatedName("au.y([III)V")
    public final synchronized void method936(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1066 < 0) {
                this.method942(arg0, arg1, arg2);
                return;
            }
            if (this.field1064 + arg2 < this.field1066) {
                this.field1064 += arg2;
                this.method942(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1066 - this.field1064;
            this.method942(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1064 += var4;
            this.method935();
            class55 var5 = (class55) this.field1065.method3196();
            synchronized (var5) {
                int var7 = var5.method1067(this);
                if (var7 < 0) {
                    var5.field1126 = 0;
                    this.method937(var5);
                } else {
                    var5.field1126 = var7;
                    this.method973(var5.field2874, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("au.w([III)V")
    public void method942(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1067.method3196(); var4 != null; var4 = (class60) this.field1067.method3206()) {
            var4.method1242(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("au.x(I)V")
    public final synchronized void method950(int arg0) {
        do {
            if (this.field1066 < 0) {
                this.method944(arg0);
                return;
            }
            if (this.field1064 + arg0 < this.field1066) {
                this.field1064 += arg0;
                this.method944(arg0);
                return;
            }
            int var2 = this.field1066 - this.field1064;
            this.method944(var2);
            arg0 -= var2;
            this.field1064 += var2;
            this.method935();
            class55 var3 = (class55) this.field1065.method3196();
            synchronized (var3) {
                int var5 = var3.method1067(this);
                if (var5 < 0) {
                    var3.field1126 = 0;
                    this.method937(var3);
                } else {
                    var3.field1126 = var5;
                    this.method973(var3.field2874, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("au.k(I)V")
    public void method944(int arg0) {
        for (class60 var2 = (class60) this.field1067.method3196(); var2 != null; var2 = (class60) this.field1067.method3206()) {
            var2.method950(arg0);
        }
    }
}
