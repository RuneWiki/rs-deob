package deob;

@ObfuscatedName("bq")
public class class59 extends class70 {

    @ObfuscatedName("bq.x")
    public class203 field1220 = new class203();

    @ObfuscatedName("bq.r")
    public class203 field1221 = new class203();

    @ObfuscatedName("bq.j")
    public int field1219 = 0;

    @ObfuscatedName("bq.z")
    public int field1222 = -1;

    @ObfuscatedName("bq.x(Lbd;)V")
    public final synchronized void method1148(class70 arg0) {
        this.field1220.method3596(arg0);
    }

    @ObfuscatedName("bq.r(Lbd;)V")
    public final synchronized void method1149(class70 arg0) {
        arg0.method3695();
    }

    @ObfuscatedName("bq.j()V")
    public void method1150() {
        if (this.field1219 <= 0) {
            return;
        }
        for (class65 var1 = (class65) this.field1221.method3600(); var1 != null; var1 = (class65) this.field1221.method3602()) {
            var1.field1274 -= this.field1219;
        }
        this.field1222 -= this.field1219;
        this.field1219 = 0;
    }

    @ObfuscatedName("bq.z(Lhn;Lbp;)V")
    public void method1156(class212 arg0, class65 arg1) {
        while (this.field1221.field3157 != arg0 && ((class65) arg0).field1274 <= arg1.field1274) {
            arg0 = arg0.field3175;
        }
        class203.method3597(arg1, arg0);
        this.field1222 = ((class65) this.field1221.field3157.field3175).field1274;
    }

    @ObfuscatedName("bq.i(Lbp;)V")
    public void method1173(class65 arg0) {
        arg0.method3695();
        arg0.method1287();
        class212 var2 = this.field1221.field3157.field3175;
        if (this.field1221.field3157 == var2) {
            this.field1222 = -1;
        } else {
            this.field1222 = ((class65) var2).field1274;
        }
    }

    @ObfuscatedName("bq.b()Lbd;")
    public class70 method1153() {
        return (class70) this.field1220.method3600();
    }

    @ObfuscatedName("bq.l()Lbd;")
    public class70 method1155() {
        return (class70) this.field1220.method3602();
    }

    @ObfuscatedName("bq.m()I")
    public int method1147() {
        return 0;
    }

    @ObfuscatedName("bq.p([III)V")
    public final synchronized void method1179(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1222 < 0) {
                this.method1157(arg0, arg1, arg2);
                return;
            }
            if (this.field1219 + arg2 < this.field1222) {
                this.field1219 += arg2;
                this.method1157(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1222 - this.field1219;
            this.method1157(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1219 += var4;
            this.method1150();
            class65 var5 = (class65) this.field1221.method3600();
            synchronized (var5) {
                int var7 = var5.method1286(this);
                if (var7 < 0) {
                    var5.field1274 = 0;
                    this.method1173(var5);
                } else {
                    var5.field1274 = var7;
                    this.method1156(var5.field3175, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bq.f([III)V")
    public void method1157(int[] arg0, int arg1, int arg2) {
        for (class70 var4 = (class70) this.field1220.method3600(); var4 != null; var4 = (class70) this.field1220.method3602()) {
            var4.method1441(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bq.d(I)V")
    public final synchronized void method1158(int arg0) {
        do {
            if (this.field1222 < 0) {
                this.method1159(arg0);
                return;
            }
            if (this.field1219 + arg0 < this.field1222) {
                this.field1219 += arg0;
                this.method1159(arg0);
                return;
            }
            int var2 = this.field1222 - this.field1219;
            this.method1159(var2);
            arg0 -= var2;
            this.field1219 += var2;
            this.method1150();
            class65 var3 = (class65) this.field1221.method3600();
            synchronized (var3) {
                int var5 = var3.method1286(this);
                if (var5 < 0) {
                    var3.field1274 = 0;
                    this.method1173(var3);
                } else {
                    var3.field1274 = var5;
                    this.method1156(var3.field3175, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bq.v(I)V")
    public void method1159(int arg0) {
        for (class70 var2 = (class70) this.field1220.method3600(); var2 != null; var2 = (class70) this.field1220.method3602()) {
            var2.method1158(arg0);
        }
    }
}
