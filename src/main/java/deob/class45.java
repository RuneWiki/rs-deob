package deob;

@ObfuscatedName("aj")
public class class45 extends class47 {

    @ObfuscatedName("aj.g")
    public class175 field1058 = new class175();

    @ObfuscatedName("aj.e")
    public class175 field1056 = new class175();

    @ObfuscatedName("aj.n")
    public int field1057 = 0;

    @ObfuscatedName("aj.j")
    public int field1055 = -1;

    @ObfuscatedName("aj.g(Laz;)V")
    public final synchronized void method1107(class47 arg0) {
        this.field1058.method3384(arg0);
    }

    @ObfuscatedName("aj.e(Laz;)V")
    public final synchronized void method1100(class47 arg0) {
        arg0.method3415();
    }

    @ObfuscatedName("aj.j()V")
    public void method1114() {
        if (this.field1057 <= 0) {
            return;
        }
        for (class60 var1 = (class60) this.field1056.method3382(); var1 != null; var1 = (class60) this.field1056.method3388()) {
            var1.field1208 -= this.field1057;
        }
        this.field1055 -= this.field1057;
        this.field1057 = 0;
    }

    @ObfuscatedName("aj.i(Lff;Lbk;)V")
    public void method1102(class177 arg0, class60 arg1) {
        while (this.field1056.field2757 != arg0 && ((class60) arg0).field1208 <= arg1.field1208) {
            arg0 = arg0.field2761;
        }
        class175.method3398(arg1, arg0);
        this.field1055 = ((class60) this.field1056.field2757.field2761).field1208;
    }

    @ObfuscatedName("aj.o(Lbk;)V")
    public void method1111(class60 arg0) {
        arg0.method3415();
        arg0.method1290();
        class177 var2 = this.field1056.field2757.field2761;
        if (this.field1056.field2757 == var2) {
            this.field1055 = -1;
        } else {
            this.field1055 = ((class60) var2).field1208;
        }
    }

    @ObfuscatedName("aj.v()Laz;")
    public class47 method1030() {
        return (class47) this.field1058.method3382();
    }

    @ObfuscatedName("aj.u()Laz;")
    public class47 method971() {
        return (class47) this.field1058.method3388();
    }

    @ObfuscatedName("aj.k()I")
    public int method972() {
        return 0;
    }

    @ObfuscatedName("aj.c([III)V")
    public final synchronized void method973(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1055 < 0) {
                this.method1105(arg0, arg1, arg2);
                return;
            }
            if (this.field1057 + arg2 < this.field1055) {
                this.field1057 += arg2;
                this.method1105(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1055 - this.field1057;
            this.method1105(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1057 += var4;
            this.method1114();
            class60 var5 = (class60) this.field1056.method3382();
            synchronized (var5) {
                int var7 = var5.method1287(this);
                if (var7 < 0) {
                    var5.field1208 = 0;
                    this.method1111(var5);
                } else {
                    var5.field1208 = var7;
                    this.method1102(var5.field2761, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aj.l([III)V")
    public void method1105(int[] arg0, int arg1, int arg2) {
        for (class47 var4 = (class47) this.field1058.method3382(); var4 != null; var4 = (class47) this.field1058.method3388()) {
            var4.method1123(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aj.al(I)V")
    public final synchronized void method974(int arg0) {
        do {
            if (this.field1055 < 0) {
                this.method1106(arg0);
                return;
            }
            if (this.field1057 + arg0 < this.field1055) {
                this.field1057 += arg0;
                this.method1106(arg0);
                return;
            }
            int var2 = this.field1055 - this.field1057;
            this.method1106(var2);
            arg0 -= var2;
            this.field1057 += var2;
            this.method1114();
            class60 var3 = (class60) this.field1056.method3382();
            synchronized (var3) {
                int var5 = var3.method1287(this);
                if (var5 < 0) {
                    var3.field1208 = 0;
                    this.method1111(var3);
                } else {
                    var3.field1208 = var5;
                    this.method1102(var3.field2761, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aj.p(I)V")
    public void method1106(int arg0) {
        for (class47 var2 = (class47) this.field1058.method3382(); var2 != null; var2 = (class47) this.field1058.method3388()) {
            var2.method974(arg0);
        }
    }
}
