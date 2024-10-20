package deob;

@ObfuscatedName("an")
public class class51 extends class62 {

    @ObfuscatedName("an.t")
    public class190 field1084 = new class190();

    @ObfuscatedName("an.b")
    public class190 field1085 = new class190();

    @ObfuscatedName("an.p")
    public int field1086 = 0;

    @ObfuscatedName("an.e")
    public int field1087 = -1;

    @ObfuscatedName("an.t(Lbw;)V")
    public final synchronized void method1078(class62 arg0) {
        this.field1084.method3444(arg0);
    }

    @ObfuscatedName("an.b(Lbw;)V")
    public final synchronized void method1034(class62 arg0) {
        arg0.method3506();
    }

    @ObfuscatedName("an.p()V")
    public void method1073() {
        if (this.field1086 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field1085.method3415(); var1 != null; var1 = (class57) this.field1085.method3419()) {
            var1.field1140 -= this.field1086;
        }
        this.field1087 -= this.field1086;
        this.field1086 = 0;
    }

    @ObfuscatedName("an.e(Lgt;Lbu;)V")
    public void method1036(class199 arg0, class57 arg1) {
        while (this.field1085.field2998 != arg0 && ((class57) arg0).field1140 <= arg1.field1140) {
            arg0 = arg0.field3014;
        }
        class190.method3411(arg1, arg0);
        this.field1087 = ((class57) this.field1085.field2998.field3014).field1140;
    }

    @ObfuscatedName("an.i(Lbu;)V")
    public void method1037(class57 arg0) {
        arg0.method3506();
        arg0.method1156();
        class199 var2 = this.field1085.field2998.field3014;
        if (this.field1085.field2998 == var2) {
            this.field1087 = -1;
        } else {
            this.field1087 = ((class57) var2).field1140;
        }
    }

    @ObfuscatedName("an.o()Lbw;")
    public class62 method1038() {
        return (class62) this.field1084.method3415();
    }

    @ObfuscatedName("an.f()Lbw;")
    public class62 method1047() {
        return (class62) this.field1084.method3419();
    }

    @ObfuscatedName("an.d()I")
    public int method1040() {
        return 0;
    }

    @ObfuscatedName("an.j([III)V")
    public final synchronized void method1041(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1087 < 0) {
                this.method1035(arg0, arg1, arg2);
                return;
            }
            if (this.field1086 + arg2 < this.field1087) {
                this.field1086 += arg2;
                this.method1035(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1087 - this.field1086;
            this.method1035(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1086 += var4;
            this.method1073();
            class57 var5 = (class57) this.field1085.method3415();
            synchronized (var5) {
                int var7 = var5.method1157(this);
                if (var7 < 0) {
                    var5.field1140 = 0;
                    this.method1037(var5);
                } else {
                    var5.field1140 = var7;
                    this.method1036(var5.field3014, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("an.x([III)V")
    public void method1035(int[] arg0, int arg1, int arg2) {
        for (class62 var4 = (class62) this.field1084.method3415(); var4 != null; var4 = (class62) this.field1084.method3419()) {
            var4.method1322(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("an.v(I)V")
    public final synchronized void method1043(int arg0) {
        do {
            if (this.field1087 < 0) {
                this.method1044(arg0);
                return;
            }
            if (this.field1086 + arg0 < this.field1087) {
                this.field1086 += arg0;
                this.method1044(arg0);
                return;
            }
            int var2 = this.field1087 - this.field1086;
            this.method1044(var2);
            arg0 -= var2;
            this.field1086 += var2;
            this.method1073();
            class57 var3 = (class57) this.field1085.method3415();
            synchronized (var3) {
                int var5 = var3.method1157(this);
                if (var5 < 0) {
                    var3.field1140 = 0;
                    this.method1037(var3);
                } else {
                    var3.field1140 = var5;
                    this.method1036(var3.field3014, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("an.a(I)V")
    public void method1044(int arg0) {
        for (class62 var2 = (class62) this.field1084.method3415(); var2 != null; var2 = (class62) this.field1084.method3419()) {
            var2.method1043(arg0);
        }
    }
}
