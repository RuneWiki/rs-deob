package deob;

@ObfuscatedName("bw")
public class class54 extends class65 {

    @ObfuscatedName("bw.j")
    public class193 field1140 = new class193();

    @ObfuscatedName("bw.y")
    public class193 field1141 = new class193();

    @ObfuscatedName("bw.z")
    public int field1142 = 0;

    @ObfuscatedName("bw.l")
    public int field1143 = -1;

    @ObfuscatedName("bw.j(Lbx;)V")
    public final synchronized void method1184(class65 arg0) {
        this.field1140.method3486(arg0);
    }

    @ObfuscatedName("bw.y(Lbx;)V")
    public final synchronized void method1151(class65 arg0) {
        arg0.method3563();
    }

    @ObfuscatedName("bw.z()V")
    public void method1152() {
        if (this.field1142 <= 0) {
            return;
        }
        for (class60 var1 = (class60) this.field1141.method3490(); var1 != null; var1 = (class60) this.field1141.method3492()) {
            var1.field1198 -= this.field1142;
        }
        this.field1143 -= this.field1142;
        this.field1142 = 0;
    }

    @ObfuscatedName("bw.l(Lgz;Lbi;)V")
    public void method1153(class202 arg0, class60 arg1) {
        while (this.field1141.field3028 != arg0 && ((class60) arg0).field1198 <= arg1.field1198) {
            arg0 = arg0.field3044;
        }
        class193.method3484(arg1, arg0);
        this.field1143 = ((class60) this.field1141.field3028.field3044).field1198;
    }

    @ObfuscatedName("bw.w(Lbi;)V")
    public void method1154(class60 arg0) {
        arg0.method3563();
        arg0.method1281();
        class202 var2 = this.field1141.field3028.field3044;
        if (this.field1141.field3028 == var2) {
            this.field1143 = -1;
        } else {
            this.field1143 = ((class60) var2).field1198;
        }
    }

    @ObfuscatedName("bw.d()Lbx;")
    public class65 method1155() {
        return (class65) this.field1140.method3490();
    }

    @ObfuscatedName("bw.f()Lbx;")
    public class65 method1156() {
        return (class65) this.field1140.method3492();
    }

    @ObfuscatedName("bw.i()I")
    public int method1157() {
        return 0;
    }

    @ObfuscatedName("bw.a([III)V")
    public final synchronized void method1158(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1143 < 0) {
                this.method1162(arg0, arg1, arg2);
                return;
            }
            if (this.field1142 + arg2 < this.field1143) {
                this.field1142 += arg2;
                this.method1162(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1143 - this.field1142;
            this.method1162(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1142 += var4;
            this.method1152();
            class60 var5 = (class60) this.field1141.method3490();
            synchronized (var5) {
                int var7 = var5.method1276(this);
                if (var7 < 0) {
                    var5.field1198 = 0;
                    this.method1154(var5);
                } else {
                    var5.field1198 = var7;
                    this.method1153(var5.field3044, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bw.o([III)V")
    public void method1162(int[] arg0, int arg1, int arg2) {
        for (class65 var4 = (class65) this.field1140.method3490(); var4 != null; var4 = (class65) this.field1140.method3492()) {
            var4.method1449(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bw.u(I)V")
    public final synchronized void method1160(int arg0) {
        do {
            if (this.field1143 < 0) {
                this.method1161(arg0);
                return;
            }
            if (this.field1142 + arg0 < this.field1143) {
                this.field1142 += arg0;
                this.method1161(arg0);
                return;
            }
            int var2 = this.field1143 - this.field1142;
            this.method1161(var2);
            arg0 -= var2;
            this.field1142 += var2;
            this.method1152();
            class60 var3 = (class60) this.field1141.method3490();
            synchronized (var3) {
                int var5 = var3.method1276(this);
                if (var5 < 0) {
                    var3.field1198 = 0;
                    this.method1154(var3);
                } else {
                    var3.field1198 = var5;
                    this.method1153(var3.field3044, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bw.m(I)V")
    public void method1161(int arg0) {
        for (class65 var2 = (class65) this.field1140.method3490(); var2 != null; var2 = (class65) this.field1140.method3492()) {
            var2.method1160(arg0);
        }
    }
}
