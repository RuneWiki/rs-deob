package deob;

@ObfuscatedName("bm")
public class class56 extends class67 {

    @ObfuscatedName("bm.j")
    public class199 field1159 = new class199();

    @ObfuscatedName("bm.m")
    public class199 field1158 = new class199();

    @ObfuscatedName("bm.f")
    public int field1160 = 0;

    @ObfuscatedName("bm.l")
    public int field1161 = -1;

    @ObfuscatedName("bm.j(Lbp;)V")
    public final synchronized void method1166(class67 arg0) {
        this.field1159.method3602(arg0);
    }

    @ObfuscatedName("bm.m(Lbp;)V")
    public final synchronized void method1143(class67 arg0) {
        arg0.method3700();
    }

    @ObfuscatedName("bm.f()V")
    public void method1144() {
        if (this.field1160 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1158.method3606(); var1 != null; var1 = (class62) this.field1158.method3608()) {
            var1.field1218 -= this.field1160;
        }
        this.field1161 -= this.field1160;
        this.field1160 = 0;
    }

    @ObfuscatedName("bm.l(Lgt;Lbk;)V")
    public void method1145(class208 arg0, class62 arg1) {
        while (this.field1158.field3087 != arg0 && ((class62) arg0).field1218 <= arg1.field1218) {
            arg0 = arg0.field3103;
        }
        class199.method3622(arg1, arg0);
        this.field1161 = ((class62) this.field1158.field3087.field3103).field1218;
    }

    @ObfuscatedName("bm.u(Lbk;)V")
    public void method1146(class62 arg0) {
        arg0.method3700();
        arg0.method1255();
        class208 var2 = this.field1158.field3087.field3103;
        if (this.field1158.field3087 == var2) {
            this.field1161 = -1;
        } else {
            this.field1161 = ((class62) var2).field1218;
        }
    }

    @ObfuscatedName("bm.a()Lbp;")
    public class67 method1147() {
        return (class67) this.field1159.method3606();
    }

    @ObfuscatedName("bm.h()Lbp;")
    public class67 method1148() {
        return (class67) this.field1159.method3608();
    }

    @ObfuscatedName("bm.i()I")
    public int method1149() {
        return 0;
    }

    @ObfuscatedName("bm.t([III)V")
    public final synchronized void method1150(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1161 < 0) {
                this.method1151(arg0, arg1, arg2);
                return;
            }
            if (this.field1160 + arg2 < this.field1161) {
                this.field1160 += arg2;
                this.method1151(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1161 - this.field1160;
            this.method1151(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1160 += var4;
            this.method1144();
            class62 var5 = (class62) this.field1158.method3606();
            synchronized (var5) {
                int var7 = var5.method1257(this);
                if (var7 < 0) {
                    var5.field1218 = 0;
                    this.method1146(var5);
                } else {
                    var5.field1218 = var7;
                    this.method1145(var5.field3103, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bm.k([III)V")
    public void method1151(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1159.method3606(); var4 != null; var4 = (class67) this.field1159.method3608()) {
            var4.method1417(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bm.s(I)V")
    public final synchronized void method1142(int arg0) {
        do {
            if (this.field1161 < 0) {
                this.method1153(arg0);
                return;
            }
            if (this.field1160 + arg0 < this.field1161) {
                this.field1160 += arg0;
                this.method1153(arg0);
                return;
            }
            int var2 = this.field1161 - this.field1160;
            this.method1153(var2);
            arg0 -= var2;
            this.field1160 += var2;
            this.method1144();
            class62 var3 = (class62) this.field1158.method3606();
            synchronized (var3) {
                int var5 = var3.method1257(this);
                if (var5 < 0) {
                    var3.field1218 = 0;
                    this.method1146(var3);
                } else {
                    var3.field1218 = var5;
                    this.method1145(var3.field3103, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bm.w(I)V")
    public void method1153(int arg0) {
        for (class67 var2 = (class67) this.field1159.method3606(); var2 != null; var2 = (class67) this.field1159.method3608()) {
            var2.method1142(arg0);
        }
    }
}
