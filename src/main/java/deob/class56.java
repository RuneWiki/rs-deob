package deob;

@ObfuscatedName("bg")
public class class56 extends class67 {

    @ObfuscatedName("bg.m")
    public class199 field1133 = new class199();

    @ObfuscatedName("bg.l")
    public class199 field1131 = new class199();

    @ObfuscatedName("bg.y")
    public int field1132 = 0;

    @ObfuscatedName("bg.u")
    public int field1130 = -1;

    @ObfuscatedName("bg.m(Lby;)V")
    public final synchronized void method1150(class67 arg0) {
        this.field1133.method3633(arg0);
    }

    @ObfuscatedName("bg.l(Lby;)V")
    public final synchronized void method1151(class67 arg0) {
        arg0.method3702();
    }

    @ObfuscatedName("bg.y()V")
    public void method1152() {
        if (this.field1132 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1131.method3611(); var1 != null; var1 = (class62) this.field1131.method3613()) {
            var1.field1186 -= this.field1132;
        }
        this.field1130 -= this.field1132;
        this.field1132 = 0;
    }

    @ObfuscatedName("bg.u(Lgs;Lba;)V")
    public void method1153(class208 arg0, class62 arg1) {
        while (this.field1131.field3078 != arg0 && ((class62) arg0).field1186 <= arg1.field1186) {
            arg0 = arg0.field3094;
        }
        class199.method3610(arg1, arg0);
        this.field1130 = ((class62) this.field1131.field3078.field3094).field1186;
    }

    @ObfuscatedName("bg.k(Lba;)V")
    public void method1154(class62 arg0) {
        arg0.method3702();
        arg0.method1284();
        class208 var2 = this.field1131.field3078.field3094;
        if (this.field1131.field3078 == var2) {
            this.field1130 = -1;
        } else {
            this.field1130 = ((class62) var2).field1186;
        }
    }

    @ObfuscatedName("bg.j()Lby;")
    public class67 method1155() {
        return (class67) this.field1133.method3611();
    }

    @ObfuscatedName("bg.i()Lby;")
    public class67 method1156() {
        return (class67) this.field1133.method3613();
    }

    @ObfuscatedName("bg.x()I")
    public int method1157() {
        return 0;
    }

    @ObfuscatedName("bg.g([III)V")
    public final synchronized void method1183(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1130 < 0) {
                this.method1159(arg0, arg1, arg2);
                return;
            }
            if (this.field1132 + arg2 < this.field1130) {
                this.field1132 += arg2;
                this.method1159(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1130 - this.field1132;
            this.method1159(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1132 += var4;
            this.method1152();
            class62 var5 = (class62) this.field1131.method3611();
            synchronized (var5) {
                int var7 = var5.method1279(this);
                if (var7 < 0) {
                    var5.field1186 = 0;
                    this.method1154(var5);
                } else {
                    var5.field1186 = var7;
                    this.method1153(var5.field3094, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bg.e([III)V")
    public void method1159(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1133.method3611(); var4 != null; var4 = (class67) this.field1133.method3613()) {
            var4.method1442(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bg.p(I)V")
    public final synchronized void method1160(int arg0) {
        do {
            if (this.field1130 < 0) {
                this.method1161(arg0);
                return;
            }
            if (this.field1132 + arg0 < this.field1130) {
                this.field1132 += arg0;
                this.method1161(arg0);
                return;
            }
            int var2 = this.field1130 - this.field1132;
            this.method1161(var2);
            arg0 -= var2;
            this.field1132 += var2;
            this.method1152();
            class62 var3 = (class62) this.field1131.method3611();
            synchronized (var3) {
                int var5 = var3.method1279(this);
                if (var5 < 0) {
                    var3.field1186 = 0;
                    this.method1154(var3);
                } else {
                    var3.field1186 = var5;
                    this.method1153(var3.field3094, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bg.a(I)V")
    public void method1161(int arg0) {
        for (class67 var2 = (class67) this.field1133.method3611(); var2 != null; var2 = (class67) this.field1133.method3613()) {
            var2.method1160(arg0);
        }
    }
}
