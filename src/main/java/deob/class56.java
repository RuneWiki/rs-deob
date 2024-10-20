package deob;

@ObfuscatedName("bx")
public class class56 extends class67 {

    @ObfuscatedName("bx.j")
    public class200 field1158 = new class200();

    @ObfuscatedName("bx.h")
    public class200 field1156 = new class200();

    @ObfuscatedName("bx.m")
    public int field1157 = 0;

    @ObfuscatedName("bx.z")
    public int field1159 = -1;

    @ObfuscatedName("bx.j(Lbi;)V")
    public final synchronized void method1133(class67 arg0) {
        this.field1158.method3536(arg0);
    }

    @ObfuscatedName("bx.h(Lbi;)V")
    public final synchronized void method1120(class67 arg0) {
        arg0.method3639();
    }

    @ObfuscatedName("bx.m()V")
    public void method1121() {
        if (this.field1157 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1156.method3540(); var1 != null; var1 = (class62) this.field1156.method3533()) {
            var1.field1213 -= this.field1157;
        }
        this.field1159 -= this.field1157;
        this.field1157 = 0;
    }

    @ObfuscatedName("bx.z(Lhc;Lbq;)V")
    public void method1146(class209 arg0, class62 arg1) {
        while (this.field1156.field3108 != arg0 && ((class62) arg0).field1213 <= arg1.field1213) {
            arg0 = arg0.field3124;
        }
        class200.method3537(arg1, arg0);
        this.field1159 = ((class62) this.field1156.field3108.field3124).field1213;
    }

    @ObfuscatedName("bx.x(Lbq;)V")
    public void method1123(class62 arg0) {
        arg0.method3639();
        arg0.method1233();
        class209 var2 = this.field1156.field3108.field3124;
        if (this.field1156.field3108 == var2) {
            this.field1159 = -1;
        } else {
            this.field1159 = ((class62) var2).field1213;
        }
    }

    @ObfuscatedName("bx.e()Lbi;")
    public class67 method1124() {
        return (class67) this.field1158.method3540();
    }

    @ObfuscatedName("bx.i()Lbi;")
    public class67 method1125() {
        return (class67) this.field1158.method3533();
    }

    @ObfuscatedName("bx.c()I")
    public int method1122() {
        return 0;
    }

    @ObfuscatedName("bx.n([III)V")
    public final synchronized void method1148(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1159 < 0) {
                this.method1128(arg0, arg1, arg2);
                return;
            }
            if (this.field1157 + arg2 < this.field1159) {
                this.field1157 += arg2;
                this.method1128(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1159 - this.field1157;
            this.method1128(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1157 += var4;
            this.method1121();
            class62 var5 = (class62) this.field1156.method3540();
            synchronized (var5) {
                int var7 = var5.method1234(this);
                if (var7 < 0) {
                    var5.field1213 = 0;
                    this.method1123(var5);
                } else {
                    var5.field1213 = var7;
                    this.method1146(var5.field3124, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bx.l([III)V")
    public void method1128(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1158.method3540(); var4 != null; var4 = (class67) this.field1158.method3533()) {
            var4.method1408(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bx.u(I)V")
    public final synchronized void method1145(int arg0) {
        do {
            if (this.field1159 < 0) {
                this.method1130(arg0);
                return;
            }
            if (this.field1157 + arg0 < this.field1159) {
                this.field1157 += arg0;
                this.method1130(arg0);
                return;
            }
            int var2 = this.field1159 - this.field1157;
            this.method1130(var2);
            arg0 -= var2;
            this.field1157 += var2;
            this.method1121();
            class62 var3 = (class62) this.field1156.method3540();
            synchronized (var3) {
                int var5 = var3.method1234(this);
                if (var5 < 0) {
                    var3.field1213 = 0;
                    this.method1123(var3);
                } else {
                    var3.field1213 = var5;
                    this.method1146(var3.field3124, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bx.r(I)V")
    public void method1130(int arg0) {
        for (class67 var2 = (class67) this.field1158.method3540(); var2 != null; var2 = (class67) this.field1158.method3533()) {
            var2.method1145(arg0);
        }
    }
}
