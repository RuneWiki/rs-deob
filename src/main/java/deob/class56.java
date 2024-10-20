package deob;

@ObfuscatedName("ba")
public class class56 extends class67 {

    @ObfuscatedName("ba.h")
    public class199 field1180 = new class199();

    @ObfuscatedName("ba.m")
    public class199 field1181 = new class199();

    @ObfuscatedName("ba.i")
    public int field1183 = 0;

    @ObfuscatedName("ba.q")
    public int field1182 = -1;

    @ObfuscatedName("ba.h(Lbc;)V")
    public final synchronized void method1122(class67 arg0) {
        this.field1180.method3542(arg0);
    }

    @ObfuscatedName("ba.m(Lbc;)V")
    public final synchronized void method1114(class67 arg0) {
        arg0.method3625();
    }

    @ObfuscatedName("ba.i()V")
    public void method1093() {
        if (this.field1183 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1181.method3546(); var1 != null; var1 = (class62) this.field1181.method3548()) {
            var1.field1240 -= this.field1183;
        }
        this.field1182 -= this.field1183;
        this.field1183 = 0;
    }

    @ObfuscatedName("ba.q(Lgr;Lbr;)V")
    public void method1092(class208 arg0, class62 arg1) {
        while (this.field1181.field3085 != arg0 && ((class62) arg0).field1240 <= arg1.field1240) {
            arg0 = arg0.field3101;
        }
        class199.method3558(arg1, arg0);
        this.field1182 = ((class62) this.field1181.field3085.field3101).field1240;
    }

    @ObfuscatedName("ba.p(Lbr;)V")
    public void method1095(class62 arg0) {
        arg0.method3625();
        arg0.method1228();
        class208 var2 = this.field1181.field3085.field3101;
        if (this.field1181.field3085 == var2) {
            this.field1182 = -1;
        } else {
            this.field1182 = ((class62) var2).field1240;
        }
    }

    @ObfuscatedName("ba.c()Lbc;")
    public class67 method1108() {
        return (class67) this.field1180.method3546();
    }

    @ObfuscatedName("ba.f()Lbc;")
    public class67 method1097() {
        return (class67) this.field1180.method3548();
    }

    @ObfuscatedName("ba.y()I")
    public int method1098() {
        return 0;
    }

    @ObfuscatedName("ba.w([III)V")
    public final synchronized void method1109(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1182 < 0) {
                this.method1100(arg0, arg1, arg2);
                return;
            }
            if (this.field1183 + arg2 < this.field1182) {
                this.field1183 += arg2;
                this.method1100(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1182 - this.field1183;
            this.method1100(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1183 += var4;
            this.method1093();
            class62 var5 = (class62) this.field1181.method3546();
            synchronized (var5) {
                int var7 = var5.method1229(this);
                if (var7 < 0) {
                    var5.field1240 = 0;
                    this.method1095(var5);
                } else {
                    var5.field1240 = var7;
                    this.method1092(var5.field3101, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ba.l([III)V")
    public void method1100(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1180.method3546(); var4 != null; var4 = (class67) this.field1180.method3548()) {
            var4.method1383(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ba.v(I)V")
    public final synchronized void method1101(int arg0) {
        do {
            if (this.field1182 < 0) {
                this.method1102(arg0);
                return;
            }
            if (this.field1183 + arg0 < this.field1182) {
                this.field1183 += arg0;
                this.method1102(arg0);
                return;
            }
            int var2 = this.field1182 - this.field1183;
            this.method1102(var2);
            arg0 -= var2;
            this.field1183 += var2;
            this.method1093();
            class62 var3 = (class62) this.field1181.method3546();
            synchronized (var3) {
                int var5 = var3.method1229(this);
                if (var5 < 0) {
                    var3.field1240 = 0;
                    this.method1095(var3);
                } else {
                    var3.field1240 = var5;
                    this.method1092(var3.field3101, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ba.k(I)V")
    public void method1102(int arg0) {
        for (class67 var2 = (class67) this.field1180.method3546(); var2 != null; var2 = (class67) this.field1180.method3548()) {
            var2.method1101(arg0);
        }
    }
}
