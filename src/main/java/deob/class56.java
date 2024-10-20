package deob;

@ObfuscatedName("bj")
public class class56 extends class67 {

    @ObfuscatedName("bj.s")
    public class200 field1179 = new class200();

    @ObfuscatedName("bj.j")
    public class200 field1177 = new class200();

    @ObfuscatedName("bj.p")
    public int field1178 = 0;

    @ObfuscatedName("bj.x")
    public int field1176 = -1;

    @ObfuscatedName("bj.s(Lbe;)V")
    public final synchronized void method1107(class67 arg0) {
        this.field1179.method3549(arg0);
    }

    @ObfuscatedName("bj.j(Lbe;)V")
    public final synchronized void method1097(class67 arg0) {
        arg0.method3639();
    }

    @ObfuscatedName("bj.p()V")
    public void method1098() {
        if (this.field1178 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1177.method3553(); var1 != null; var1 = (class62) this.field1177.method3558()) {
            var1.field1236 -= this.field1178;
        }
        this.field1176 -= this.field1178;
        this.field1178 = 0;
    }

    @ObfuscatedName("bj.x(Lhd;Lbx;)V")
    public void method1096(class209 arg0, class62 arg1) {
        while (this.field1177.field3110 != arg0 && ((class62) arg0).field1236 <= arg1.field1236) {
            arg0 = arg0.field3125;
        }
        class200.method3550(arg1, arg0);
        this.field1176 = ((class62) this.field1177.field3110.field3125).field1236;
    }

    @ObfuscatedName("bj.d(Lbx;)V")
    public void method1099(class62 arg0) {
        arg0.method3639();
        arg0.method1213();
        class209 var2 = this.field1177.field3110.field3125;
        if (this.field1177.field3110 == var2) {
            this.field1176 = -1;
        } else {
            this.field1176 = ((class62) var2).field1236;
        }
    }

    @ObfuscatedName("bj.u()Lbe;")
    public class67 method1100() {
        return (class67) this.field1179.method3553();
    }

    @ObfuscatedName("bj.o()Lbe;")
    public class67 method1113() {
        return (class67) this.field1179.method3558();
    }

    @ObfuscatedName("bj.b()I")
    public int method1102() {
        return 0;
    }

    @ObfuscatedName("bj.k([III)V")
    public final synchronized void method1103(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1176 < 0) {
                this.method1104(arg0, arg1, arg2);
                return;
            }
            if (this.field1178 + arg2 < this.field1176) {
                this.field1178 += arg2;
                this.method1104(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1176 - this.field1178;
            this.method1104(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1178 += var4;
            this.method1098();
            class62 var5 = (class62) this.field1177.method3553();
            synchronized (var5) {
                int var7 = var5.method1208(this);
                if (var7 < 0) {
                    var5.field1236 = 0;
                    this.method1099(var5);
                } else {
                    var5.field1236 = var7;
                    this.method1096(var5.field3125, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bj.c([III)V")
    public void method1104(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1179.method3553(); var4 != null; var4 = (class67) this.field1179.method3558()) {
            var4.method1386(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bj.l(I)V")
    public final synchronized void method1105(int arg0) {
        do {
            if (this.field1176 < 0) {
                this.method1095(arg0);
                return;
            }
            if (this.field1178 + arg0 < this.field1176) {
                this.field1178 += arg0;
                this.method1095(arg0);
                return;
            }
            int var2 = this.field1176 - this.field1178;
            this.method1095(var2);
            arg0 -= var2;
            this.field1178 += var2;
            this.method1098();
            class62 var3 = (class62) this.field1177.method3553();
            synchronized (var3) {
                int var5 = var3.method1208(this);
                if (var5 < 0) {
                    var3.field1236 = 0;
                    this.method1099(var3);
                } else {
                    var3.field1236 = var5;
                    this.method1096(var3.field3125, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bj.t(I)V")
    public void method1095(int arg0) {
        for (class67 var2 = (class67) this.field1179.method3553(); var2 != null; var2 = (class67) this.field1179.method3558()) {
            var2.method1105(arg0);
        }
    }
}
