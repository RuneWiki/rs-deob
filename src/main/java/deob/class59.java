package deob;

@ObfuscatedName("bq")
public class class59 extends class70 {

    @ObfuscatedName("bq.a")
    public class203 field1246 = new class203();

    @ObfuscatedName("bq.d")
    public class203 field1243 = new class203();

    @ObfuscatedName("bq.v")
    public int field1244 = 0;

    @ObfuscatedName("bq.r")
    public int field1245 = -1;

    @ObfuscatedName("bq.a(Lbu;)V")
    public final synchronized void method1165(class70 arg0) {
        this.field1246.method3640(arg0);
    }

    @ObfuscatedName("bq.d(Lbu;)V")
    public final synchronized void method1166(class70 arg0) {
        arg0.method3729();
    }

    @ObfuscatedName("bq.v()V")
    public void method1205() {
        if (this.field1244 <= 0) {
            return;
        }
        for (class65 var1 = (class65) this.field1243.method3617(); var1 != null; var1 = (class65) this.field1243.method3632()) {
            var1.field1302 -= this.field1244;
        }
        this.field1245 -= this.field1244;
        this.field1244 = 0;
    }

    @ObfuscatedName("bq.r(Lhr;Lbt;)V")
    public void method1168(class212 arg0, class65 arg1) {
        while (this.field1243.field3154 != arg0 && ((class65) arg0).field1302 <= arg1.field1302) {
            arg0 = arg0.field3170;
        }
        class203.method3614(arg1, arg0);
        this.field1245 = ((class65) this.field1243.field3154.field3170).field1302;
    }

    @ObfuscatedName("bq.z(Lbt;)V")
    public void method1186(class65 arg0) {
        arg0.method3729();
        arg0.method1304();
        class212 var2 = this.field1243.field3154.field3170;
        if (this.field1243.field3154 == var2) {
            this.field1245 = -1;
        } else {
            this.field1245 = ((class65) var2).field1302;
        }
    }

    @ObfuscatedName("bq.t()Lbu;")
    public class70 method1208() {
        return (class70) this.field1246.method3617();
    }

    @ObfuscatedName("bq.n()Lbu;")
    public class70 method1171() {
        return (class70) this.field1246.method3632();
    }

    @ObfuscatedName("bq.i()I")
    public int method1172() {
        return 0;
    }

    @ObfuscatedName("bq.g([III)V")
    public final synchronized void method1173(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1245 < 0) {
                this.method1203(arg0, arg1, arg2);
                return;
            }
            if (this.field1244 + arg2 < this.field1245) {
                this.field1244 += arg2;
                this.method1203(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1245 - this.field1244;
            this.method1203(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1244 += var4;
            this.method1205();
            class65 var5 = (class65) this.field1243.method3617();
            synchronized (var5) {
                int var7 = var5.method1305(this);
                if (var7 < 0) {
                    var5.field1302 = 0;
                    this.method1186(var5);
                } else {
                    var5.field1302 = var7;
                    this.method1168(var5.field3170, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bq.m([III)V")
    public void method1203(int[] arg0, int arg1, int arg2) {
        for (class70 var4 = (class70) this.field1246.method3617(); var4 != null; var4 = (class70) this.field1246.method3632()) {
            var4.method1470(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bq.k(I)V")
    public final synchronized void method1175(int arg0) {
        do {
            if (this.field1245 < 0) {
                this.method1176(arg0);
                return;
            }
            if (this.field1244 + arg0 < this.field1245) {
                this.field1244 += arg0;
                this.method1176(arg0);
                return;
            }
            int var2 = this.field1245 - this.field1244;
            this.method1176(var2);
            arg0 -= var2;
            this.field1244 += var2;
            this.method1205();
            class65 var3 = (class65) this.field1243.method3617();
            synchronized (var3) {
                int var5 = var3.method1305(this);
                if (var5 < 0) {
                    var3.field1302 = 0;
                    this.method1186(var3);
                } else {
                    var3.field1302 = var5;
                    this.method1168(var3.field3170, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bq.x(I)V")
    public void method1176(int arg0) {
        for (class70 var2 = (class70) this.field1246.method3617(); var2 != null; var2 = (class70) this.field1246.method3632()) {
            var2.method1175(arg0);
        }
    }
}
