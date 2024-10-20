package deob;

@ObfuscatedName("be")
public class class59 extends class70 {

    @ObfuscatedName("be.m")
    public class203 field1245 = new class203();

    @ObfuscatedName("be.e")
    public class203 field1244 = new class203();

    @ObfuscatedName("be.o")
    public int field1243 = 0;

    @ObfuscatedName("be.g")
    public int field1246 = -1;

    @ObfuscatedName("be.m(Lbp;)V")
    public final synchronized void method1170(class70 arg0) {
        this.field1245.method3617(arg0);
    }

    @ObfuscatedName("be.w(Lbp;)V")
    public final synchronized void method1194(class70 arg0) {
        arg0.method3729();
    }

    @ObfuscatedName("be.e()V")
    public void method1172() {
        if (this.field1243 <= 0) {
            return;
        }
        for (class65 var1 = (class65) this.field1244.method3621(); var1 != null; var1 = (class65) this.field1244.method3630()) {
            var1.field1304 -= this.field1243;
        }
        this.field1246 -= this.field1243;
        this.field1243 = 0;
    }

    @ObfuscatedName("be.o(Lhf;Lbc;)V")
    public void method1173(class212 arg0, class65 arg1) {
        while (this.field1244.field3151 != arg0 && ((class65) arg0).field1304 <= arg1.field1304) {
            arg0 = arg0.field3169;
        }
        class203.method3618(arg1, arg0);
        this.field1246 = ((class65) this.field1244.field3151.field3169).field1304;
    }

    @ObfuscatedName("be.g(Lbc;)V")
    public void method1206(class65 arg0) {
        arg0.method3729();
        arg0.method1321();
        class212 var2 = this.field1244.field3151.field3169;
        if (this.field1244.field3151 == var2) {
            this.field1246 = -1;
        } else {
            this.field1246 = ((class65) var2).field1304;
        }
    }

    @ObfuscatedName("be.l()Lbp;")
    public class70 method1175() {
        return (class70) this.field1245.method3621();
    }

    @ObfuscatedName("be.j()Lbp;")
    public class70 method1176() {
        return (class70) this.field1245.method3630();
    }

    @ObfuscatedName("be.r()I")
    public int method1177() {
        return 0;
    }

    @ObfuscatedName("be.x([III)V")
    public final synchronized void method1169(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1246 < 0) {
                this.method1179(arg0, arg1, arg2);
                return;
            }
            if (this.field1243 + arg2 < this.field1246) {
                this.field1243 += arg2;
                this.method1179(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1246 - this.field1243;
            this.method1179(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1243 += var4;
            this.method1172();
            class65 var5 = (class65) this.field1244.method3621();
            synchronized (var5) {
                int var7 = var5.method1322(this);
                if (var7 < 0) {
                    var5.field1304 = 0;
                    this.method1206(var5);
                } else {
                    var5.field1304 = var7;
                    this.method1173(var5.field3169, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("be.k([III)V")
    public void method1179(int[] arg0, int arg1, int arg2) {
        for (class70 var4 = (class70) this.field1245.method3621(); var4 != null; var4 = (class70) this.field1245.method3630()) {
            var4.method1493(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("be.v(I)V")
    public final synchronized void method1180(int arg0) {
        do {
            if (this.field1246 < 0) {
                this.method1202(arg0);
                return;
            }
            if (this.field1243 + arg0 < this.field1246) {
                this.field1243 += arg0;
                this.method1202(arg0);
                return;
            }
            int var2 = this.field1246 - this.field1243;
            this.method1202(var2);
            arg0 -= var2;
            this.field1243 += var2;
            this.method1172();
            class65 var3 = (class65) this.field1244.method3621();
            synchronized (var3) {
                int var5 = var3.method1322(this);
                if (var5 < 0) {
                    var3.field1304 = 0;
                    this.method1206(var3);
                } else {
                    var3.field1304 = var5;
                    this.method1173(var3.field3169, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("be.h(I)V")
    public void method1202(int arg0) {
        for (class70 var2 = (class70) this.field1245.method3621(); var2 != null; var2 = (class70) this.field1245.method3630()) {
            var2.method1180(arg0);
        }
    }
}
