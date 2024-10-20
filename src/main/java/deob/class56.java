package deob;

@ObfuscatedName("bl")
public class class56 extends class67 {

    @ObfuscatedName("bl.i")
    public class199 field1177 = new class199();

    @ObfuscatedName("bl.v")
    public class199 field1178 = new class199();

    @ObfuscatedName("bl.r")
    public int field1179 = 0;

    @ObfuscatedName("bl.n")
    public int field1180 = -1;

    @ObfuscatedName("bl.i(Lbj;)V")
    public final synchronized void method1158(class67 arg0) {
        this.field1177.method3530(arg0);
    }

    @ObfuscatedName("bl.v(Lbj;)V")
    public final synchronized void method1134(class67 arg0) {
        arg0.method3626();
    }

    @ObfuscatedName("bl.r()V")
    public void method1135() {
        if (this.field1179 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1178.method3534(); var1 != null; var1 = (class62) this.field1178.method3536()) {
            var1.field1235 -= this.field1179;
        }
        this.field1180 -= this.field1179;
        this.field1179 = 0;
    }

    @ObfuscatedName("bl.n(Lgo;Lbi;)V")
    public void method1132(class208 arg0, class62 arg1) {
        while (this.field1178.field3083 != arg0 && ((class62) arg0).field1235 <= arg1.field1235) {
            arg0 = arg0.field3099;
        }
        class199.method3546(arg1, arg0);
        this.field1180 = ((class62) this.field1178.field3083.field3099).field1235;
    }

    @ObfuscatedName("bl.x(Lbi;)V")
    public void method1137(class62 arg0) {
        arg0.method3626();
        arg0.method1273();
        class208 var2 = this.field1178.field3083.field3099;
        if (this.field1178.field3083 == var2) {
            this.field1180 = -1;
        } else {
            this.field1180 = ((class62) var2).field1235;
        }
    }

    @ObfuscatedName("bl.q()Lbj;")
    public class67 method1138() {
        return (class67) this.field1177.method3534();
    }

    @ObfuscatedName("bl.h()Lbj;")
    public class67 method1139() {
        return (class67) this.field1177.method3536();
    }

    @ObfuscatedName("bl.d()I")
    public int method1171() {
        return 0;
    }

    @ObfuscatedName("bl.c([III)V")
    public final synchronized void method1166(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1180 < 0) {
                this.method1142(arg0, arg1, arg2);
                return;
            }
            if (this.field1179 + arg2 < this.field1180) {
                this.field1179 += arg2;
                this.method1142(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1180 - this.field1179;
            this.method1142(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1179 += var4;
            this.method1135();
            class62 var5 = (class62) this.field1178.method3534();
            synchronized (var5) {
                int var7 = var5.method1274(this);
                if (var7 < 0) {
                    var5.field1235 = 0;
                    this.method1137(var5);
                } else {
                    var5.field1235 = var7;
                    this.method1132(var5.field3099, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bl.y([III)V")
    public void method1142(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1177.method3534(); var4 != null; var4 = (class67) this.field1177.method3536()) {
            var4.method1438(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bl.m(I)V")
    public final synchronized void method1154(int arg0) {
        do {
            if (this.field1180 < 0) {
                this.method1144(arg0);
                return;
            }
            if (this.field1179 + arg0 < this.field1180) {
                this.field1179 += arg0;
                this.method1144(arg0);
                return;
            }
            int var2 = this.field1180 - this.field1179;
            this.method1144(var2);
            arg0 -= var2;
            this.field1179 += var2;
            this.method1135();
            class62 var3 = (class62) this.field1178.method3534();
            synchronized (var3) {
                int var5 = var3.method1274(this);
                if (var5 < 0) {
                    var3.field1235 = 0;
                    this.method1137(var3);
                } else {
                    var3.field1235 = var5;
                    this.method1132(var3.field3099, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bl.e(I)V")
    public void method1144(int arg0) {
        for (class67 var2 = (class67) this.field1177.method3534(); var2 != null; var2 = (class67) this.field1177.method3536()) {
            var2.method1154(arg0);
        }
    }
}
