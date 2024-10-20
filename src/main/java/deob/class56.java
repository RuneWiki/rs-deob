package deob;

@ObfuscatedName("bv")
public class class56 extends class67 {

    @ObfuscatedName("bv.l")
    public class199 field1155 = new class199();

    @ObfuscatedName("bv.e")
    public class199 field1156 = new class199();

    @ObfuscatedName("bv.q")
    public int field1157 = 0;

    @ObfuscatedName("bv.o")
    public int field1158 = -1;

    @ObfuscatedName("bv.l(Lbt;)V")
    public final synchronized void method1137(class67 arg0) {
        this.field1155.method3540(arg0);
    }

    @ObfuscatedName("bv.e(Lbt;)V")
    public final synchronized void method1138(class67 arg0) {
        arg0.method3620();
    }

    @ObfuscatedName("bv.q()V")
    public void method1139() {
        if (this.field1157 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1156.method3544(); var1 != null; var1 = (class62) this.field1156.method3538()) {
            var1.field1215 -= this.field1157;
        }
        this.field1158 -= this.field1157;
        this.field1157 = 0;
    }

    @ObfuscatedName("bv.o(Lgj;Lbn;)V")
    public void method1140(class208 arg0, class62 arg1) {
        while (this.field1156.field3090 != arg0 && ((class62) arg0).field1215 <= arg1.field1215) {
            arg0 = arg0.field3106;
        }
        class199.method3541(arg1, arg0);
        this.field1158 = ((class62) this.field1156.field3090.field3106).field1215;
    }

    @ObfuscatedName("bv.g(Lbn;)V")
    public void method1141(class62 arg0) {
        arg0.method3620();
        arg0.method1264();
        class208 var2 = this.field1156.field3090.field3106;
        if (this.field1156.field3090 == var2) {
            this.field1158 = -1;
        } else {
            this.field1158 = ((class62) var2).field1215;
        }
    }

    @ObfuscatedName("bv.m()Lbt;")
    public class67 method1142() {
        return (class67) this.field1155.method3544();
    }

    @ObfuscatedName("bv.b()Lbt;")
    public class67 method1143() {
        return (class67) this.field1155.method3538();
    }

    @ObfuscatedName("bv.p()I")
    public int method1144() {
        return 0;
    }

    @ObfuscatedName("bv.t([III)V")
    public final synchronized void method1165(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1158 < 0) {
                this.method1146(arg0, arg1, arg2);
                return;
            }
            if (this.field1157 + arg2 < this.field1158) {
                this.field1157 += arg2;
                this.method1146(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1158 - this.field1157;
            this.method1146(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1157 += var4;
            this.method1139();
            class62 var5 = (class62) this.field1156.method3544();
            synchronized (var5) {
                int var7 = var5.method1266(this);
                if (var7 < 0) {
                    var5.field1215 = 0;
                    this.method1141(var5);
                } else {
                    var5.field1215 = var7;
                    this.method1140(var5.field3106, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bv.w([III)V")
    public void method1146(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1155.method3544(); var4 != null; var4 = (class67) this.field1155.method3538()) {
            var4.method1431(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bv.x(I)V")
    public final synchronized void method1147(int arg0) {
        do {
            if (this.field1158 < 0) {
                this.method1149(arg0);
                return;
            }
            if (this.field1157 + arg0 < this.field1158) {
                this.field1157 += arg0;
                this.method1149(arg0);
                return;
            }
            int var2 = this.field1158 - this.field1157;
            this.method1149(var2);
            arg0 -= var2;
            this.field1157 += var2;
            this.method1139();
            class62 var3 = (class62) this.field1156.method3544();
            synchronized (var3) {
                int var5 = var3.method1266(this);
                if (var5 < 0) {
                    var3.field1215 = 0;
                    this.method1141(var3);
                } else {
                    var3.field1215 = var5;
                    this.method1140(var3.field3106, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bv.k(I)V")
    public void method1149(int arg0) {
        for (class67 var2 = (class67) this.field1155.method3544(); var2 != null; var2 = (class67) this.field1155.method3538()) {
            var2.method1147(arg0);
        }
    }
}
