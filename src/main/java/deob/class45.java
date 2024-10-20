package deob;

@ObfuscatedName("ap")
public class class45 extends class47 {

    @ObfuscatedName("ap.v")
    public class176 field1043 = new class176();

    @ObfuscatedName("ap.f")
    public class176 field1044 = new class176();

    @ObfuscatedName("ap.n")
    public int field1045 = 0;

    @ObfuscatedName("ap.c")
    public int field1046 = -1;

    @ObfuscatedName("ap.v(Lag;)V")
    public final synchronized void method1120(class47 arg0) {
        this.field1043.method3291(arg0);
    }

    @ObfuscatedName("ap.f(Lag;)V")
    public final synchronized void method1142(class47 arg0) {
        arg0.method3320();
    }

    @ObfuscatedName("ap.c()V")
    public void method1122() {
        if (this.field1045 <= 0) {
            return;
        }
        for (class60 var1 = (class60) this.field1044.method3294(); var1 != null; var1 = (class60) this.field1044.method3296()) {
            var1.field1206 -= this.field1045;
        }
        this.field1046 -= this.field1045;
        this.field1045 = 0;
    }

    @ObfuscatedName("ap.r(Lfd;Lbo;)V")
    public void method1123(class178 arg0, class60 arg1) {
        while (this.field1044.field2809 != arg0 && ((class60) arg0).field1206 <= arg1.field1206) {
            arg0 = arg0.field2813;
        }
        class176.method3297(arg1, arg0);
        this.field1046 = ((class60) this.field1044.field2809.field2813).field1206;
    }

    @ObfuscatedName("ap.k(Lbo;)V")
    public void method1124(class60 arg0) {
        arg0.method3320();
        arg0.method1329();
        class178 var2 = this.field1044.field2809.field2813;
        if (this.field1044.field2809 == var2) {
            this.field1046 = -1;
        } else {
            this.field1046 = ((class60) var2).field1206;
        }
    }

    @ObfuscatedName("ap.x()Lag;")
    public class47 method962() {
        return (class47) this.field1043.method3294();
    }

    @ObfuscatedName("ap.b()Lag;")
    public class47 method983() {
        return (class47) this.field1043.method3296();
    }

    @ObfuscatedName("ap.w()I")
    public int method984() {
        return 0;
    }

    @ObfuscatedName("ap.y([III)V")
    public final synchronized void method969(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1046 < 0) {
                this.method1125(arg0, arg1, arg2);
                return;
            }
            if (this.field1045 + arg2 < this.field1046) {
                this.field1045 += arg2;
                this.method1125(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1046 - this.field1045;
            this.method1125(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1045 += var4;
            this.method1122();
            class60 var5 = (class60) this.field1044.method3294();
            synchronized (var5) {
                int var7 = var5.method1326(this);
                if (var7 < 0) {
                    var5.field1206 = 0;
                    this.method1124(var5);
                } else {
                    var5.field1206 = var7;
                    this.method1123(var5.field2813, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ap.e([III)V")
    public void method1125(int[] arg0, int arg1, int arg2) {
        for (class47 var4 = (class47) this.field1043.method3294(); var4 != null; var4 = (class47) this.field1043.method3296()) {
            var4.method1146(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ap.au(I)V")
    public final synchronized void method986(int arg0) {
        do {
            if (this.field1046 < 0) {
                this.method1126(arg0);
                return;
            }
            if (this.field1045 + arg0 < this.field1046) {
                this.field1045 += arg0;
                this.method1126(arg0);
                return;
            }
            int var2 = this.field1046 - this.field1045;
            this.method1126(var2);
            arg0 -= var2;
            this.field1045 += var2;
            this.method1122();
            class60 var3 = (class60) this.field1044.method3294();
            synchronized (var3) {
                int var5 = var3.method1326(this);
                if (var5 < 0) {
                    var3.field1206 = 0;
                    this.method1124(var3);
                } else {
                    var3.field1206 = var5;
                    this.method1123(var3.field2813, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ap.q(I)V")
    public void method1126(int arg0) {
        for (class47 var2 = (class47) this.field1043.method3294(); var2 != null; var2 = (class47) this.field1043.method3296()) {
            var2.method986(arg0);
        }
    }
}
