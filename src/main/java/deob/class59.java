package deob;

@ObfuscatedName("bx")
public class class59 extends class70 {

    @ObfuscatedName("bx.i")
    public class203 field1229 = new class203();

    @ObfuscatedName("bx.h")
    public class203 field1228 = new class203();

    @ObfuscatedName("bx.e")
    public int field1227 = 0;

    @ObfuscatedName("bx.g")
    public int field1230 = -1;

    @ObfuscatedName("bx.i(Lbf;)V")
    public final synchronized void method1143(class70 arg0) {
        this.field1229.method3593(arg0);
    }

    @ObfuscatedName("bx.h(Lbf;)V")
    public final synchronized void method1144(class70 arg0) {
        arg0.method3706();
    }

    @ObfuscatedName("bx.e()V")
    public void method1145() {
        if (this.field1227 <= 0) {
            return;
        }
        for (class65 var1 = (class65) this.field1228.method3597(); var1 != null; var1 = (class65) this.field1228.method3599()) {
            var1.field1284 -= this.field1227;
        }
        this.field1230 -= this.field1227;
        this.field1227 = 0;
    }

    @ObfuscatedName("bx.g(Lhk;Lbp;)V")
    public void method1146(class212 arg0, class65 arg1) {
        while (this.field1228.field3157 != arg0 && ((class65) arg0).field1284 <= arg1.field1284) {
            arg0 = arg0.field3174;
        }
        class203.method3594(arg1, arg0);
        this.field1230 = ((class65) this.field1228.field3157.field3174).field1284;
    }

    @ObfuscatedName("bx.n(Lbp;)V")
    public void method1147(class65 arg0) {
        arg0.method3706();
        arg0.method1287();
        class212 var2 = this.field1228.field3157.field3174;
        if (this.field1228.field3157 == var2) {
            this.field1230 = -1;
        } else {
            this.field1230 = ((class65) var2).field1284;
        }
    }

    @ObfuscatedName("bx.u()Lbf;")
    public class70 method1148() {
        return (class70) this.field1229.method3597();
    }

    @ObfuscatedName("bx.d()Lbf;")
    public class70 method1149() {
        return (class70) this.field1229.method3599();
    }

    @ObfuscatedName("bx.l()I")
    public int method1150() {
        return 0;
    }

    @ObfuscatedName("bx.m([III)V")
    public final synchronized void method1151(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1230 < 0) {
                this.method1160(arg0, arg1, arg2);
                return;
            }
            if (this.field1227 + arg2 < this.field1230) {
                this.field1227 += arg2;
                this.method1160(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1230 - this.field1227;
            this.method1160(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1227 += var4;
            this.method1145();
            class65 var5 = (class65) this.field1228.method3597();
            synchronized (var5) {
                int var7 = var5.method1283(this);
                if (var7 < 0) {
                    var5.field1284 = 0;
                    this.method1147(var5);
                } else {
                    var5.field1284 = var7;
                    this.method1146(var5.field3174, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bx.j([III)V")
    public void method1160(int[] arg0, int arg1, int arg2) {
        for (class70 var4 = (class70) this.field1229.method3597(); var4 != null; var4 = (class70) this.field1229.method3599()) {
            var4.method1450(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bx.y(I)V")
    public final synchronized void method1169(int arg0) {
        do {
            if (this.field1230 < 0) {
                this.method1154(arg0);
                return;
            }
            if (this.field1227 + arg0 < this.field1230) {
                this.field1227 += arg0;
                this.method1154(arg0);
                return;
            }
            int var2 = this.field1230 - this.field1227;
            this.method1154(var2);
            arg0 -= var2;
            this.field1227 += var2;
            this.method1145();
            class65 var3 = (class65) this.field1228.method3597();
            synchronized (var3) {
                int var5 = var3.method1283(this);
                if (var5 < 0) {
                    var3.field1284 = 0;
                    this.method1147(var3);
                } else {
                    var3.field1284 = var5;
                    this.method1146(var3.field3174, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bx.s(I)V")
    public void method1154(int arg0) {
        for (class70 var2 = (class70) this.field1229.method3597(); var2 != null; var2 = (class70) this.field1229.method3599()) {
            var2.method1169(arg0);
        }
    }
}
