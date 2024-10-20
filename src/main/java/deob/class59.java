package deob;

@ObfuscatedName("bj")
public class class59 extends class70 {

    @ObfuscatedName("bj.s")
    public class203 field1212 = new class203();

    @ObfuscatedName("bj.z")
    public class203 field1211 = new class203();

    @ObfuscatedName("bj.t")
    public int field1213 = 0;

    @ObfuscatedName("bj.y")
    public int field1210 = -1;

    @ObfuscatedName("bj.s(Lbi;)V")
    public final synchronized void method1128(class70 arg0) {
        this.field1212.method3591(arg0);
    }

    @ObfuscatedName("bj.z(Lbi;)V")
    public final synchronized void method1129(class70 arg0) {
        arg0.method3699();
    }

    @ObfuscatedName("bj.t()V")
    public void method1130() {
        if (this.field1213 <= 0) {
            return;
        }
        for (class65 var1 = (class65) this.field1211.method3588(); var1 != null; var1 = (class65) this.field1211.method3590()) {
            var1.field1272 -= this.field1213;
        }
        this.field1210 -= this.field1213;
        this.field1213 = 0;
    }

    @ObfuscatedName("bj.y(Lhg;Lbv;)V")
    public void method1156(class212 arg0, class65 arg1) {
        while (this.field1211.field3150 != arg0 && ((class65) arg0).field1272 <= arg1.field1272) {
            arg0 = arg0.field3166;
        }
        class203.method3594(arg1, arg0);
        this.field1210 = ((class65) this.field1211.field3150.field3166).field1272;
    }

    @ObfuscatedName("bj.p(Lbv;)V")
    public void method1132(class65 arg0) {
        arg0.method3699();
        arg0.method1267();
        class212 var2 = this.field1211.field3150.field3166;
        if (this.field1211.field3150 == var2) {
            this.field1210 = -1;
        } else {
            this.field1210 = ((class65) var2).field1272;
        }
    }

    @ObfuscatedName("bj.g()Lbi;")
    public class70 method1133() {
        return (class70) this.field1212.method3588();
    }

    @ObfuscatedName("bj.m()Lbi;")
    public class70 method1134() {
        return (class70) this.field1212.method3590();
    }

    @ObfuscatedName("bj.f()I")
    public int method1151() {
        return 0;
    }

    @ObfuscatedName("bj.k([III)V")
    public final synchronized void method1135(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1210 < 0) {
                this.method1139(arg0, arg1, arg2);
                return;
            }
            if (this.field1213 + arg2 < this.field1210) {
                this.field1213 += arg2;
                this.method1139(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1210 - this.field1213;
            this.method1139(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1213 += var4;
            this.method1130();
            class65 var5 = (class65) this.field1211.method3588();
            synchronized (var5) {
                int var7 = var5.method1268(this);
                if (var7 < 0) {
                    var5.field1272 = 0;
                    this.method1132(var5);
                } else {
                    var5.field1272 = var7;
                    this.method1156(var5.field3166, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bj.h([III)V")
    public void method1139(int[] arg0, int arg1, int arg2) {
        for (class70 var4 = (class70) this.field1212.method3588(); var4 != null; var4 = (class70) this.field1212.method3590()) {
            var4.method1444(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bj.r(I)V")
    public final synchronized void method1137(int arg0) {
        do {
            if (this.field1210 < 0) {
                this.method1138(arg0);
                return;
            }
            if (this.field1213 + arg0 < this.field1210) {
                this.field1213 += arg0;
                this.method1138(arg0);
                return;
            }
            int var2 = this.field1210 - this.field1213;
            this.method1138(var2);
            arg0 -= var2;
            this.field1213 += var2;
            this.method1130();
            class65 var3 = (class65) this.field1211.method3588();
            synchronized (var3) {
                int var5 = var3.method1268(this);
                if (var5 < 0) {
                    var3.field1272 = 0;
                    this.method1132(var3);
                } else {
                    var3.field1272 = var5;
                    this.method1156(var3.field3166, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bj.w(I)V")
    public void method1138(int arg0) {
        for (class70 var2 = (class70) this.field1212.method3588(); var2 != null; var2 = (class70) this.field1212.method3590()) {
            var2.method1137(arg0);
        }
    }
}
