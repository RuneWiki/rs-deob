package deob;

@ObfuscatedName("bu")
public class class59 extends class70 {

    @ObfuscatedName("bu.l")
    public class203 field1242 = new class203();

    @ObfuscatedName("bu.g")
    public class203 field1241 = new class203();

    @ObfuscatedName("bu.r")
    public int field1240 = 0;

    @ObfuscatedName("bu.e")
    public int field1243 = -1;

    @ObfuscatedName("bu.l(Lbh;)V")
    public final synchronized void method1226(class70 arg0) {
        this.field1242.method3712(arg0);
    }

    @ObfuscatedName("bu.g(Lbh;)V")
    public final synchronized void method1260(class70 arg0) {
        arg0.method3815();
    }

    @ObfuscatedName("bu.r()V")
    public void method1228() {
        if (this.field1240 <= 0) {
            return;
        }
        for (class65 var1 = (class65) this.field1241.method3728(); var1 != null; var1 = (class65) this.field1241.method3718()) {
            var1.field1301 -= this.field1240;
        }
        this.field1243 -= this.field1240;
        this.field1240 = 0;
    }

    @ObfuscatedName("bu.e(Lhb;Lbv;)V")
    public void method1229(class212 arg0, class65 arg1) {
        while (this.field1241.field3158 != arg0 && ((class65) arg0).field1301 <= arg1.field1301) {
            arg0 = arg0.field3174;
        }
        class203.method3746(arg1, arg0);
        this.field1243 = ((class65) this.field1241.field3158.field3174).field1301;
    }

    @ObfuscatedName("bu.h(Lbv;)V")
    public void method1230(class65 arg0) {
        arg0.method3815();
        arg0.method1381();
        class212 var2 = this.field1241.field3158.field3174;
        if (this.field1241.field3158 == var2) {
            this.field1243 = -1;
        } else {
            this.field1243 = ((class65) var2).field1301;
        }
    }

    @ObfuscatedName("bu.s()Lbh;")
    public class70 method1231() {
        return (class70) this.field1242.method3728();
    }

    @ObfuscatedName("bu.k()Lbh;")
    public class70 method1232() {
        return (class70) this.field1242.method3718();
    }

    @ObfuscatedName("bu.u()I")
    public int method1255() {
        return 0;
    }

    @ObfuscatedName("bu.n([III)V")
    public final synchronized void method1234(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1243 < 0) {
                this.method1235(arg0, arg1, arg2);
                return;
            }
            if (this.field1240 + arg2 < this.field1243) {
                this.field1240 += arg2;
                this.method1235(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1243 - this.field1240;
            this.method1235(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1240 += var4;
            this.method1228();
            class65 var5 = (class65) this.field1241.method3728();
            synchronized (var5) {
                int var7 = var5.method1379(this);
                if (var7 < 0) {
                    var5.field1301 = 0;
                    this.method1230(var5);
                } else {
                    var5.field1301 = var7;
                    this.method1229(var5.field3174, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bu.b([III)V")
    public void method1235(int[] arg0, int arg1, int arg2) {
        for (class70 var4 = (class70) this.field1242.method3728(); var4 != null; var4 = (class70) this.field1242.method3718()) {
            var4.method1532(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bu.m(I)V")
    public final synchronized void method1236(int arg0) {
        do {
            if (this.field1243 < 0) {
                this.method1237(arg0);
                return;
            }
            if (this.field1240 + arg0 < this.field1243) {
                this.field1240 += arg0;
                this.method1237(arg0);
                return;
            }
            int var2 = this.field1243 - this.field1240;
            this.method1237(var2);
            arg0 -= var2;
            this.field1240 += var2;
            this.method1228();
            class65 var3 = (class65) this.field1241.method3728();
            synchronized (var3) {
                int var5 = var3.method1379(this);
                if (var5 < 0) {
                    var3.field1301 = 0;
                    this.method1230(var3);
                } else {
                    var3.field1301 = var5;
                    this.method1229(var3.field3174, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bu.q(I)V")
    public void method1237(int arg0) {
        for (class70 var2 = (class70) this.field1242.method3728(); var2 != null; var2 = (class70) this.field1242.method3718()) {
            var2.method1236(arg0);
        }
    }
}
