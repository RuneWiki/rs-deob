package deob;

@ObfuscatedName("aa")
public class class47 extends class49 {

    @ObfuscatedName("aa.i")
    public class179 field1074 = new class179();

    @ObfuscatedName("aa.b")
    public class179 field1073 = new class179();

    @ObfuscatedName("aa.r")
    public int field1072 = 0;

    @ObfuscatedName("aa.l")
    public int field1075 = -1;

    @ObfuscatedName("aa.i(Laz;)V")
    public final synchronized void method1120(class49 arg0) {
        this.field1074.method3335(arg0);
    }

    @ObfuscatedName("aa.b(Laz;)V")
    public final synchronized void method1109(class49 arg0) {
        arg0.method3363();
    }

    @ObfuscatedName("aa.l()V")
    public void method1110() {
        if (this.field1072 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1073.method3339(); var1 != null; var1 = (class62) this.field1073.method3353()) {
            var1.field1229 -= this.field1072;
        }
        this.field1075 -= this.field1072;
        this.field1072 = 0;
    }

    @ObfuscatedName("aa.s(Lfx;Lbz;)V")
    public void method1116(class181 arg0, class62 arg1) {
        while (this.field1073.field2834 != arg0 && ((class62) arg0).field1229 <= arg1.field1229) {
            arg0 = arg0.field2838;
        }
        class179.method3343(arg1, arg0);
        this.field1075 = ((class62) this.field1073.field2834.field2838).field1229;
    }

    @ObfuscatedName("aa.d(Lbz;)V")
    public void method1112(class62 arg0) {
        arg0.method3363();
        arg0.method1296();
        class181 var2 = this.field1073.field2834.field2838;
        if (this.field1073.field2834 == var2) {
            this.field1075 = -1;
        } else {
            this.field1075 = ((class62) var2).field1229;
        }
    }

    @ObfuscatedName("aa.y()Laz;")
    public class49 method969() {
        return (class49) this.field1074.method3339();
    }

    @ObfuscatedName("aa.g()Laz;")
    public class49 method1008() {
        return (class49) this.field1074.method3353();
    }

    @ObfuscatedName("aa.f()I")
    public int method1068() {
        return 0;
    }

    @ObfuscatedName("aa.j([III)V")
    public final synchronized void method978(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1075 < 0) {
                this.method1114(arg0, arg1, arg2);
                return;
            }
            if (this.field1072 + arg2 < this.field1075) {
                this.field1072 += arg2;
                this.method1114(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1075 - this.field1072;
            this.method1114(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1072 += var4;
            this.method1110();
            class62 var5 = (class62) this.field1073.method3339();
            synchronized (var5) {
                int var7 = var5.method1297(this);
                if (var7 < 0) {
                    var5.field1229 = 0;
                    this.method1112(var5);
                } else {
                    var5.field1229 = var7;
                    this.method1116(var5.field2838, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aa.e([III)V")
    public void method1114(int[] arg0, int arg1, int arg2) {
        for (class49 var4 = (class49) this.field1074.method3339(); var4 != null; var4 = (class49) this.field1074.method3353()) {
            var4.method1131(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aa.af(I)V")
    public final synchronized void method974(int arg0) {
        do {
            if (this.field1075 < 0) {
                this.method1115(arg0);
                return;
            }
            if (this.field1072 + arg0 < this.field1075) {
                this.field1072 += arg0;
                this.method1115(arg0);
                return;
            }
            int var2 = this.field1075 - this.field1072;
            this.method1115(var2);
            arg0 -= var2;
            this.field1072 += var2;
            this.method1110();
            class62 var3 = (class62) this.field1073.method3339();
            synchronized (var3) {
                int var5 = var3.method1297(this);
                if (var5 < 0) {
                    var3.field1229 = 0;
                    this.method1112(var3);
                } else {
                    var3.field1229 = var5;
                    this.method1116(var3.field2838, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aa.u(I)V")
    public void method1115(int arg0) {
        for (class49 var2 = (class49) this.field1074.method3339(); var2 != null; var2 = (class49) this.field1074.method3353()) {
            var2.method974(arg0);
        }
    }
}
