package deob;

@ObfuscatedName("bm")
public class class59 extends class70 {

    @ObfuscatedName("bm.k")
    public class203 field1230 = new class203();

    @ObfuscatedName("bm.q")
    public class203 field1231 = new class203();

    @ObfuscatedName("bm.f")
    public int field1232 = 0;

    @ObfuscatedName("bm.c")
    public int field1233 = -1;

    @ObfuscatedName("bm.k(Lbf;)V")
    public final synchronized void method1142(class70 arg0) {
        this.field1230.method3597(arg0);
    }

    @ObfuscatedName("bm.q(Lbf;)V")
    public final synchronized void method1143(class70 arg0) {
        arg0.method3703();
    }

    @ObfuscatedName("bm.f()V")
    public void method1144() {
        if (this.field1232 <= 0) {
            return;
        }
        for (class65 var1 = (class65) this.field1231.method3616(); var1 != null; var1 = (class65) this.field1231.method3603()) {
            var1.field1289 -= this.field1232;
        }
        this.field1233 -= this.field1232;
        this.field1232 = 0;
    }

    @ObfuscatedName("bm.c(Lhk;Lbr;)V")
    public void method1145(class212 arg0, class65 arg1) {
        while (this.field1231.field3150 != arg0 && ((class65) arg0).field1289 <= arg1.field1289) {
            arg0 = arg0.field3167;
        }
        class203.method3606(arg1, arg0);
        this.field1233 = ((class65) this.field1231.field3150.field3167).field1289;
    }

    @ObfuscatedName("bm.v(Lbr;)V")
    public void method1146(class65 arg0) {
        arg0.method3703();
        arg0.method1282();
        class212 var2 = this.field1231.field3150.field3167;
        if (this.field1231.field3150 == var2) {
            this.field1233 = -1;
        } else {
            this.field1233 = ((class65) var2).field1289;
        }
    }

    @ObfuscatedName("bm.j()Lbf;")
    public class70 method1151() {
        return (class70) this.field1230.method3616();
    }

    @ObfuscatedName("bm.m()Lbf;")
    public class70 method1148() {
        return (class70) this.field1230.method3603();
    }

    @ObfuscatedName("bm.y()I")
    public int method1149() {
        return 0;
    }

    @ObfuscatedName("bm.u([III)V")
    public final synchronized void method1150(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1233 < 0) {
                this.method1141(arg0, arg1, arg2);
                return;
            }
            if (this.field1232 + arg2 < this.field1233) {
                this.field1232 += arg2;
                this.method1141(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1233 - this.field1232;
            this.method1141(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1232 += var4;
            this.method1144();
            class65 var5 = (class65) this.field1231.method3616();
            synchronized (var5) {
                int var7 = var5.method1283(this);
                if (var7 < 0) {
                    var5.field1289 = 0;
                    this.method1146(var5);
                } else {
                    var5.field1289 = var7;
                    this.method1145(var5.field3167, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bm.h([III)V")
    public void method1141(int[] arg0, int arg1, int arg2) {
        for (class70 var4 = (class70) this.field1230.method3616(); var4 != null; var4 = (class70) this.field1230.method3603()) {
            var4.method1460(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bm.l(I)V")
    public final synchronized void method1152(int arg0) {
        do {
            if (this.field1233 < 0) {
                this.method1171(arg0);
                return;
            }
            if (this.field1232 + arg0 < this.field1233) {
                this.field1232 += arg0;
                this.method1171(arg0);
                return;
            }
            int var2 = this.field1233 - this.field1232;
            this.method1171(var2);
            arg0 -= var2;
            this.field1232 += var2;
            this.method1144();
            class65 var3 = (class65) this.field1231.method3616();
            synchronized (var3) {
                int var5 = var3.method1283(this);
                if (var5 < 0) {
                    var3.field1289 = 0;
                    this.method1146(var3);
                } else {
                    var3.field1289 = var5;
                    this.method1145(var3.field3167, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bm.b(I)V")
    public void method1171(int arg0) {
        for (class70 var2 = (class70) this.field1230.method3616(); var2 != null; var2 = (class70) this.field1230.method3603()) {
            var2.method1152(arg0);
        }
    }
}
