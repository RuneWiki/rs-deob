package deob;

@ObfuscatedName("bl")
public class class56 extends class67 {

    @ObfuscatedName("bl.o")
    public class199 field1164 = new class199();

    @ObfuscatedName("bl.e")
    public class199 field1162 = new class199();

    @ObfuscatedName("bl.u")
    public int field1161 = 0;

    @ObfuscatedName("bl.b")
    public int field1163 = -1;

    @ObfuscatedName("bl.o(Lby;)V")
    public final synchronized void method1090(class67 arg0) {
        this.field1164.method3590(arg0);
    }

    @ObfuscatedName("bl.e(Lby;)V")
    public final synchronized void method1124(class67 arg0) {
        arg0.method3670();
    }

    @ObfuscatedName("bl.u()V")
    public void method1092() {
        if (this.field1161 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1162.method3581(); var1 != null; var1 = (class62) this.field1162.method3583()) {
            var1.field1224 -= this.field1161;
        }
        this.field1163 -= this.field1161;
        this.field1161 = 0;
    }

    @ObfuscatedName("bl.b(Lgn;Lbx;)V")
    public void method1093(class208 arg0, class62 arg1) {
        while (this.field1162.field3095 != arg0 && ((class62) arg0).field1224 <= arg1.field1224) {
            arg0 = arg0.field3112;
        }
        class199.method3574(arg1, arg0);
        this.field1163 = ((class62) this.field1162.field3095.field3112).field1224;
    }

    @ObfuscatedName("bl.p(Lbx;)V")
    public void method1094(class62 arg0) {
        arg0.method3670();
        arg0.method1209();
        class208 var2 = this.field1162.field3095.field3112;
        if (this.field1162.field3095 == var2) {
            this.field1163 = -1;
        } else {
            this.field1163 = ((class62) var2).field1224;
        }
    }

    @ObfuscatedName("bl.s()Lby;")
    public class67 method1126() {
        return (class67) this.field1164.method3581();
    }

    @ObfuscatedName("bl.y()Lby;")
    public class67 method1096() {
        return (class67) this.field1164.method3583();
    }

    @ObfuscatedName("bl.t()I")
    public int method1091() {
        return 0;
    }

    @ObfuscatedName("bl.w([III)V")
    public final synchronized void method1105(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1163 < 0) {
                this.method1099(arg0, arg1, arg2);
                return;
            }
            if (this.field1161 + arg2 < this.field1163) {
                this.field1161 += arg2;
                this.method1099(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1163 - this.field1161;
            this.method1099(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1161 += var4;
            this.method1092();
            class62 var5 = (class62) this.field1162.method3581();
            synchronized (var5) {
                int var7 = var5.method1211(this);
                if (var7 < 0) {
                    var5.field1224 = 0;
                    this.method1094(var5);
                } else {
                    var5.field1224 = var7;
                    this.method1093(var5.field3112, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bl.h([III)V")
    public void method1099(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1164.method3581(); var4 != null; var4 = (class67) this.field1164.method3583()) {
            var4.method1376(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bl.d(I)V")
    public final synchronized void method1098(int arg0) {
        do {
            if (this.field1163 < 0) {
                this.method1117(arg0);
                return;
            }
            if (this.field1161 + arg0 < this.field1163) {
                this.field1161 += arg0;
                this.method1117(arg0);
                return;
            }
            int var2 = this.field1163 - this.field1161;
            this.method1117(var2);
            arg0 -= var2;
            this.field1161 += var2;
            this.method1092();
            class62 var3 = (class62) this.field1162.method3581();
            synchronized (var3) {
                int var5 = var3.method1211(this);
                if (var5 < 0) {
                    var3.field1224 = 0;
                    this.method1094(var3);
                } else {
                    var3.field1224 = var5;
                    this.method1093(var3.field3112, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bl.l(I)V")
    public void method1117(int arg0) {
        for (class67 var2 = (class67) this.field1164.method3581(); var2 != null; var2 = (class67) this.field1164.method3583()) {
            var2.method1098(arg0);
        }
    }
}
