package deob;

@ObfuscatedName("bm")
public class class56 extends class67 {

    @ObfuscatedName("bm.h")
    public class199 field1170 = new class199();

    @ObfuscatedName("bm.q")
    public class199 field1171 = new class199();

    @ObfuscatedName("bm.v")
    public int field1172 = 0;

    @ObfuscatedName("bm.n")
    public int field1173 = -1;

    @ObfuscatedName("bm.h(Lbo;)V")
    public final synchronized void method1119(class67 arg0) {
        this.field1170.method3621(arg0);
    }

    @ObfuscatedName("bm.q(Lbo;)V")
    public final synchronized void method1120(class67 arg0) {
        arg0.method3711();
    }

    @ObfuscatedName("bm.v()V")
    public void method1121() {
        if (this.field1172 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1171.method3611(); var1 != null; var1 = (class62) this.field1171.method3616()) {
            var1.field1235 -= this.field1172;
        }
        this.field1173 -= this.field1172;
        this.field1172 = 0;
    }

    @ObfuscatedName("bm.n(Lgm;Lbj;)V")
    public void method1144(class208 arg0, class62 arg1) {
        while (this.field1171.field3077 != arg0 && ((class62) arg0).field1235 <= arg1.field1235) {
            arg0 = arg0.field3094;
        }
        class199.method3618(arg1, arg0);
        this.field1173 = ((class62) this.field1171.field3077.field3094).field1235;
    }

    @ObfuscatedName("bm.f(Lbj;)V")
    public void method1123(class62 arg0) {
        arg0.method3711();
        arg0.method1256();
        class208 var2 = this.field1171.field3077.field3094;
        if (this.field1171.field3077 == var2) {
            this.field1173 = -1;
        } else {
            this.field1173 = ((class62) var2).field1235;
        }
    }

    @ObfuscatedName("bm.g()Lbo;")
    public class67 method1124() {
        return (class67) this.field1170.method3611();
    }

    @ObfuscatedName("bm.o()Lbo;")
    public class67 method1157() {
        return (class67) this.field1170.method3616();
    }

    @ObfuscatedName("bm.s()I")
    public int method1127() {
        return 0;
    }

    @ObfuscatedName("bm.k([III)V")
    public final synchronized void method1143(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1173 < 0) {
                this.method1126(arg0, arg1, arg2);
                return;
            }
            if (this.field1172 + arg2 < this.field1173) {
                this.field1172 += arg2;
                this.method1126(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1173 - this.field1172;
            this.method1126(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1172 += var4;
            this.method1121();
            class62 var5 = (class62) this.field1171.method3611();
            synchronized (var5) {
                int var7 = var5.method1257(this);
                if (var7 < 0) {
                    var5.field1235 = 0;
                    this.method1123(var5);
                } else {
                    var5.field1235 = var7;
                    this.method1144(var5.field3094, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bm.b([III)V")
    public void method1126(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1170.method3611(); var4 != null; var4 = (class67) this.field1170.method3616()) {
            var4.method1414(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bm.c(I)V")
    public final synchronized void method1129(int arg0) {
        do {
            if (this.field1173 < 0) {
                this.method1130(arg0);
                return;
            }
            if (this.field1172 + arg0 < this.field1173) {
                this.field1172 += arg0;
                this.method1130(arg0);
                return;
            }
            int var2 = this.field1173 - this.field1172;
            this.method1130(var2);
            arg0 -= var2;
            this.field1172 += var2;
            this.method1121();
            class62 var3 = (class62) this.field1171.method3611();
            synchronized (var3) {
                int var5 = var3.method1257(this);
                if (var5 < 0) {
                    var3.field1235 = 0;
                    this.method1123(var3);
                } else {
                    var3.field1235 = var5;
                    this.method1144(var3.field3094, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bm.l(I)V")
    public void method1130(int arg0) {
        for (class67 var2 = (class67) this.field1170.method3611(); var2 != null; var2 = (class67) this.field1170.method3616()) {
            var2.method1129(arg0);
        }
    }
}
