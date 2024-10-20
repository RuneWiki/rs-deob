package deob;

@ObfuscatedName("bp")
public class class56 extends class67 {

    @ObfuscatedName("bp.k")
    public class199 field1152 = new class199();

    @ObfuscatedName("bp.h")
    public class199 field1149 = new class199();

    @ObfuscatedName("bp.o")
    public int field1150 = 0;

    @ObfuscatedName("bp.z")
    public int field1151 = -1;

    @ObfuscatedName("bp.k(Lbk;)V")
    public final synchronized void method1084(class67 arg0) {
        this.field1152.method3577(arg0);
    }

    @ObfuscatedName("bp.h(Lbk;)V")
    public final synchronized void method1085(class67 arg0) {
        arg0.method3679();
    }

    @ObfuscatedName("bp.o()V")
    public void method1087() {
        if (this.field1150 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1149.method3581(); var1 != null; var1 = (class62) this.field1149.method3583()) {
            var1.field1207 -= this.field1150;
        }
        this.field1151 -= this.field1150;
        this.field1150 = 0;
    }

    @ObfuscatedName("bp.z(Lgp;Lbn;)V")
    public void method1122(class208 arg0, class62 arg1) {
        while (this.field1149.field3093 != arg0 && ((class62) arg0).field1207 <= arg1.field1207) {
            arg0 = arg0.field3110;
        }
        class199.method3598(arg1, arg0);
        this.field1151 = ((class62) this.field1149.field3093.field3110).field1207;
    }

    @ObfuscatedName("bp.c(Lbn;)V")
    public void method1088(class62 arg0) {
        arg0.method3679();
        arg0.method1212();
        class208 var2 = this.field1149.field3093.field3110;
        if (this.field1149.field3093 == var2) {
            this.field1151 = -1;
        } else {
            this.field1151 = ((class62) var2).field1207;
        }
    }

    @ObfuscatedName("bp.d()Lbk;")
    public class67 method1089() {
        return (class67) this.field1152.method3581();
    }

    @ObfuscatedName("bp.l()Lbk;")
    public class67 method1090() {
        return (class67) this.field1152.method3583();
    }

    @ObfuscatedName("bp.b()I")
    public int method1108() {
        return 0;
    }

    @ObfuscatedName("bp.j([III)V")
    public final synchronized void method1086(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1151 < 0) {
                this.method1109(arg0, arg1, arg2);
                return;
            }
            if (this.field1150 + arg2 < this.field1151) {
                this.field1150 += arg2;
                this.method1109(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1151 - this.field1150;
            this.method1109(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1150 += var4;
            this.method1087();
            class62 var5 = (class62) this.field1149.method3581();
            synchronized (var5) {
                int var7 = var5.method1214(this);
                if (var7 < 0) {
                    var5.field1207 = 0;
                    this.method1088(var5);
                } else {
                    var5.field1207 = var7;
                    this.method1122(var5.field3110, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bp.f([III)V")
    public void method1109(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1152.method3581(); var4 != null; var4 = (class67) this.field1152.method3583()) {
            var4.method1381(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bp.i(I)V")
    public final synchronized void method1094(int arg0) {
        do {
            if (this.field1151 < 0) {
                this.method1092(arg0);
                return;
            }
            if (this.field1150 + arg0 < this.field1151) {
                this.field1150 += arg0;
                this.method1092(arg0);
                return;
            }
            int var2 = this.field1151 - this.field1150;
            this.method1092(var2);
            arg0 -= var2;
            this.field1150 += var2;
            this.method1087();
            class62 var3 = (class62) this.field1149.method3581();
            synchronized (var3) {
                int var5 = var3.method1214(this);
                if (var5 < 0) {
                    var3.field1207 = 0;
                    this.method1088(var3);
                } else {
                    var3.field1207 = var5;
                    this.method1122(var3.field3110, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bp.g(I)V")
    public void method1092(int arg0) {
        for (class67 var2 = (class67) this.field1152.method3581(); var2 != null; var2 = (class67) this.field1152.method3583()) {
            var2.method1094(arg0);
        }
    }
}
