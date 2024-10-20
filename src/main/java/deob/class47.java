package deob;

@ObfuscatedName("as")
public class class47 extends class49 {

    @ObfuscatedName("as.e")
    public class179 field1080 = new class179();

    @ObfuscatedName("as.i")
    public class179 field1082 = new class179();

    @ObfuscatedName("as.k")
    public int field1081 = 0;

    @ObfuscatedName("as.q")
    public int field1083 = -1;

    @ObfuscatedName("as.e(Lac;)V")
    public final synchronized void method1148(class49 arg0) {
        this.field1080.method3352(arg0);
    }

    @ObfuscatedName("as.i(Lac;)V")
    public final synchronized void method1149(class49 arg0) {
        arg0.method3366();
    }

    @ObfuscatedName("as.q()V")
    public void method1150() {
        if (this.field1081 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1082.method3331(); var1 != null; var1 = (class62) this.field1082.method3333()) {
            var1.field1242 -= this.field1081;
        }
        this.field1083 -= this.field1081;
        this.field1081 = 0;
    }

    @ObfuscatedName("as.j(Lfz;Lbt;)V")
    public void method1151(class181 arg0, class62 arg1) {
        while (this.field1082.field2835 != arg0 && ((class62) arg0).field1242 <= arg1.field1242) {
            arg0 = arg0.field2840;
        }
        class179.method3344(arg1, arg0);
        this.field1083 = ((class62) this.field1082.field2835.field2840).field1242;
    }

    @ObfuscatedName("as.z(Lbt;)V")
    public void method1152(class62 arg0) {
        arg0.method3366();
        arg0.method1356();
        class181 var2 = this.field1082.field2835.field2840;
        if (this.field1082.field2835 == var2) {
            this.field1083 = -1;
        } else {
            this.field1083 = ((class62) var2).field1242;
        }
    }

    @ObfuscatedName("as.l()Lac;")
    public class49 method1100() {
        return (class49) this.field1080.method3331();
    }

    @ObfuscatedName("as.n()Lac;")
    public class49 method1012() {
        return (class49) this.field1080.method3333();
    }

    @ObfuscatedName("as.h()I")
    public int method1006() {
        return 0;
    }

    @ObfuscatedName("as.v([III)V")
    public final synchronized void method1014(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1083 < 0) {
                this.method1155(arg0, arg1, arg2);
                return;
            }
            if (this.field1081 + arg2 < this.field1083) {
                this.field1081 += arg2;
                this.method1155(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1083 - this.field1081;
            this.method1155(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1081 += var4;
            this.method1150();
            class62 var5 = (class62) this.field1082.method3331();
            synchronized (var5) {
                int var7 = var5.method1359(this);
                if (var7 < 0) {
                    var5.field1242 = 0;
                    this.method1152(var5);
                } else {
                    var5.field1242 = var7;
                    this.method1151(var5.field2840, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("as.m([III)V")
    public void method1155(int[] arg0, int arg1, int arg2) {
        for (class49 var4 = (class49) this.field1080.method3331(); var4 != null; var4 = (class49) this.field1080.method3333()) {
            var4.method1171(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("as.ax(I)V")
    public final synchronized void method1055(int arg0) {
        do {
            if (this.field1083 < 0) {
                this.method1158(arg0);
                return;
            }
            if (this.field1081 + arg0 < this.field1083) {
                this.field1081 += arg0;
                this.method1158(arg0);
                return;
            }
            int var2 = this.field1083 - this.field1081;
            this.method1158(var2);
            arg0 -= var2;
            this.field1081 += var2;
            this.method1150();
            class62 var3 = (class62) this.field1082.method3331();
            synchronized (var3) {
                int var5 = var3.method1359(this);
                if (var5 < 0) {
                    var3.field1242 = 0;
                    this.method1152(var3);
                } else {
                    var3.field1242 = var5;
                    this.method1151(var3.field2840, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("as.w(I)V")
    public void method1158(int arg0) {
        for (class49 var2 = (class49) this.field1080.method3331(); var2 != null; var2 = (class49) this.field1080.method3333()) {
            var2.method1055(arg0);
        }
    }
}
