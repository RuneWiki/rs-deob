package deob;

@ObfuscatedName("br")
public class class56 extends class67 {

    @ObfuscatedName("br.f")
    public class199 field1175 = new class199();

    @ObfuscatedName("br.s")
    public class199 field1176 = new class199();

    @ObfuscatedName("br.q")
    public int field1177 = 0;

    @ObfuscatedName("br.g")
    public int field1178 = -1;

    @ObfuscatedName("br.f(Lbm;)V")
    public final synchronized void method1119(class67 arg0) {
        this.field1175.method3561(arg0);
    }

    @ObfuscatedName("br.s(Lbm;)V")
    public final synchronized void method1135(class67 arg0) {
        arg0.method3665();
    }

    @ObfuscatedName("br.q()V")
    public void method1121() {
        if (this.field1177 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1176.method3566(); var1 != null; var1 = (class62) this.field1176.method3567()) {
            var1.field1235 -= this.field1177;
        }
        this.field1178 -= this.field1177;
        this.field1177 = 0;
    }

    @ObfuscatedName("br.g(Lgm;Lbq;)V")
    public void method1120(class208 arg0, class62 arg1) {
        while (this.field1176.field3090 != arg0 && ((class62) arg0).field1235 <= arg1.field1235) {
            arg0 = arg0.field3106;
        }
        class199.method3568(arg1, arg0);
        this.field1178 = ((class62) this.field1176.field3090.field3106).field1235;
    }

    @ObfuscatedName("br.m(Lbq;)V")
    public void method1123(class62 arg0) {
        arg0.method3665();
        arg0.method1247();
        class208 var2 = this.field1176.field3090.field3106;
        if (this.field1176.field3090 == var2) {
            this.field1178 = -1;
        } else {
            this.field1178 = ((class62) var2).field1235;
        }
    }

    @ObfuscatedName("br.t()Lbm;")
    public class67 method1155() {
        return (class67) this.field1175.method3566();
    }

    @ObfuscatedName("br.j()Lbm;")
    public class67 method1125() {
        return (class67) this.field1175.method3567();
    }

    @ObfuscatedName("br.n()I")
    public int method1132() {
        return 0;
    }

    @ObfuscatedName("br.l([III)V")
    public final synchronized void method1124(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1178 < 0) {
                this.method1152(arg0, arg1, arg2);
                return;
            }
            if (this.field1177 + arg2 < this.field1178) {
                this.field1177 += arg2;
                this.method1152(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1178 - this.field1177;
            this.method1152(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1177 += var4;
            this.method1121();
            class62 var5 = (class62) this.field1176.method3566();
            synchronized (var5) {
                int var7 = var5.method1245(this);
                if (var7 < 0) {
                    var5.field1235 = 0;
                    this.method1123(var5);
                } else {
                    var5.field1235 = var7;
                    this.method1120(var5.field3106, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("br.i([III)V")
    public void method1152(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1175.method3566(); var4 != null; var4 = (class67) this.field1175.method3567()) {
            var4.method1419(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("br.w(I)V")
    public final synchronized void method1118(int arg0) {
        do {
            if (this.field1178 < 0) {
                this.method1129(arg0);
                return;
            }
            if (this.field1177 + arg0 < this.field1178) {
                this.field1177 += arg0;
                this.method1129(arg0);
                return;
            }
            int var2 = this.field1178 - this.field1177;
            this.method1129(var2);
            arg0 -= var2;
            this.field1177 += var2;
            this.method1121();
            class62 var3 = (class62) this.field1176.method3566();
            synchronized (var3) {
                int var5 = var3.method1245(this);
                if (var5 < 0) {
                    var3.field1235 = 0;
                    this.method1123(var3);
                } else {
                    var3.field1235 = var5;
                    this.method1120(var3.field3106, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("br.v(I)V")
    public void method1129(int arg0) {
        for (class67 var2 = (class67) this.field1175.method3566(); var2 != null; var2 = (class67) this.field1175.method3567()) {
            var2.method1118(arg0);
        }
    }
}
