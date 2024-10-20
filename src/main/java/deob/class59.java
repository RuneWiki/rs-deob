package deob;

@ObfuscatedName("by")
public class class59 extends class70 {

    @ObfuscatedName("by.e")
    public class203 field1239 = new class203();

    @ObfuscatedName("by.l")
    public class203 field1238 = new class203();

    @ObfuscatedName("by.c")
    public int field1240 = 0;

    @ObfuscatedName("by.h")
    public int field1241 = -1;

    @ObfuscatedName("by.e(Lbj;)V")
    public final synchronized void method1209(class70 arg0) {
        this.field1239.method3651(arg0);
    }

    @ObfuscatedName("by.l(Lbj;)V")
    public final synchronized void method1222(class70 arg0) {
        arg0.method3755();
    }

    @ObfuscatedName("by.c()V")
    public void method1208() {
        if (this.field1240 <= 0) {
            return;
        }
        for (class65 var1 = (class65) this.field1238.method3654(); var1 != null; var1 = (class65) this.field1238.method3673()) {
            var1.field1300 -= this.field1240;
        }
        this.field1241 -= this.field1240;
        this.field1240 = 0;
    }

    @ObfuscatedName("by.h(Lhs;Lbo;)V")
    public void method1226(class212 arg0, class65 arg1) {
        while (this.field1238.field3146 != arg0 && ((class65) arg0).field1300 <= arg1.field1300) {
            arg0 = arg0.field3163;
        }
        class203.method3657(arg1, arg0);
        this.field1241 = ((class65) this.field1238.field3146.field3163).field1300;
    }

    @ObfuscatedName("by.r(Lbo;)V")
    public void method1210(class65 arg0) {
        arg0.method3755();
        arg0.method1346();
        class212 var2 = this.field1238.field3146.field3163;
        if (this.field1238.field3146 == var2) {
            this.field1241 = -1;
        } else {
            this.field1241 = ((class65) var2).field1300;
        }
    }

    @ObfuscatedName("by.a()Lbj;")
    public class70 method1211() {
        return (class70) this.field1239.method3654();
    }

    @ObfuscatedName("by.b()Lbj;")
    public class70 method1225() {
        return (class70) this.field1239.method3673();
    }

    @ObfuscatedName("by.u()I")
    public int method1213() {
        return 0;
    }

    @ObfuscatedName("by.o([III)V")
    public final synchronized void method1214(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1241 < 0) {
                this.method1215(arg0, arg1, arg2);
                return;
            }
            if (this.field1240 + arg2 < this.field1241) {
                this.field1240 += arg2;
                this.method1215(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1241 - this.field1240;
            this.method1215(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1240 += var4;
            this.method1208();
            class65 var5 = (class65) this.field1238.method3654();
            synchronized (var5) {
                int var7 = var5.method1343(this);
                if (var7 < 0) {
                    var5.field1300 = 0;
                    this.method1210(var5);
                } else {
                    var5.field1300 = var7;
                    this.method1226(var5.field3163, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("by.p([III)V")
    public void method1215(int[] arg0, int arg1, int arg2) {
        for (class70 var4 = (class70) this.field1239.method3654(); var4 != null; var4 = (class70) this.field1239.method3673()) {
            var4.method1505(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("by.i(I)V")
    public final synchronized void method1217(int arg0) {
        do {
            if (this.field1241 < 0) {
                this.method1234(arg0);
                return;
            }
            if (this.field1240 + arg0 < this.field1241) {
                this.field1240 += arg0;
                this.method1234(arg0);
                return;
            }
            int var2 = this.field1241 - this.field1240;
            this.method1234(var2);
            arg0 -= var2;
            this.field1240 += var2;
            this.method1208();
            class65 var3 = (class65) this.field1238.method3654();
            synchronized (var3) {
                int var5 = var3.method1343(this);
                if (var5 < 0) {
                    var3.field1300 = 0;
                    this.method1210(var3);
                } else {
                    var3.field1300 = var5;
                    this.method1226(var3.field3163, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("by.q(I)V")
    public void method1234(int arg0) {
        for (class70 var2 = (class70) this.field1239.method3654(); var2 != null; var2 = (class70) this.field1239.method3673()) {
            var2.method1217(arg0);
        }
    }
}
