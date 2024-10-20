package deob;

@ObfuscatedName("as")
public class class51 extends class62 {

    @ObfuscatedName("as.p")
    public class190 field1117 = new class190();

    @ObfuscatedName("as.k")
    public class190 field1115 = new class190();

    @ObfuscatedName("as.e")
    public int field1116 = 0;

    @ObfuscatedName("as.f")
    public int field1114 = -1;

    @ObfuscatedName("as.p(Lbv;)V")
    public final synchronized void method1006(class62 arg0) {
        this.field1117.method3438(arg0);
    }

    @ObfuscatedName("as.k(Lbv;)V")
    public final synchronized void method985(class62 arg0) {
        arg0.method3533();
    }

    @ObfuscatedName("as.e()V")
    public void method987() {
        if (this.field1116 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field1115.method3442(); var1 != null; var1 = (class57) this.field1115.method3444()) {
            var1.field1169 -= this.field1116;
        }
        this.field1114 -= this.field1116;
        this.field1116 = 0;
    }

    @ObfuscatedName("as.f(Lgl;Lbb;)V")
    public void method1019(class199 arg0, class57 arg1) {
        while (this.field1115.field2998 != arg0 && ((class57) arg0).field1169 <= arg1.field1169) {
            arg0 = arg0.field3014;
        }
        class190.method3439(arg1, arg0);
        this.field1114 = ((class57) this.field1115.field2998.field3014).field1169;
    }

    @ObfuscatedName("as.w(Lbb;)V")
    public void method990(class57 arg0) {
        arg0.method3533();
        arg0.method1105();
        class199 var2 = this.field1115.field2998.field3014;
        if (this.field1115.field2998 == var2) {
            this.field1114 = -1;
        } else {
            this.field1114 = ((class57) var2).field1169;
        }
    }

    @ObfuscatedName("as.t()Lbv;")
    public class62 method1001() {
        return (class62) this.field1117.method3442();
    }

    @ObfuscatedName("as.s()Lbv;")
    public class62 method991() {
        return (class62) this.field1117.method3444();
    }

    @ObfuscatedName("as.c()I")
    public int method992() {
        return 0;
    }

    @ObfuscatedName("as.d([III)V")
    public final synchronized void method986(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1114 < 0) {
                this.method994(arg0, arg1, arg2);
                return;
            }
            if (this.field1116 + arg2 < this.field1114) {
                this.field1116 += arg2;
                this.method994(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1114 - this.field1116;
            this.method994(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1116 += var4;
            this.method987();
            class57 var5 = (class57) this.field1115.method3442();
            synchronized (var5) {
                int var7 = var5.method1108(this);
                if (var7 < 0) {
                    var5.field1169 = 0;
                    this.method990(var5);
                } else {
                    var5.field1169 = var7;
                    this.method1019(var5.field3014, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("as.v([III)V")
    public void method994(int[] arg0, int arg1, int arg2) {
        for (class62 var4 = (class62) this.field1117.method3442(); var4 != null; var4 = (class62) this.field1117.method3444()) {
            var4.method1272(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("as.m(I)V")
    public final synchronized void method995(int arg0) {
        do {
            if (this.field1114 < 0) {
                this.method998(arg0);
                return;
            }
            if (this.field1116 + arg0 < this.field1114) {
                this.field1116 += arg0;
                this.method998(arg0);
                return;
            }
            int var2 = this.field1114 - this.field1116;
            this.method998(var2);
            arg0 -= var2;
            this.field1116 += var2;
            this.method987();
            class57 var3 = (class57) this.field1115.method3442();
            synchronized (var3) {
                int var5 = var3.method1108(this);
                if (var5 < 0) {
                    var3.field1169 = 0;
                    this.method990(var3);
                } else {
                    var3.field1169 = var5;
                    this.method1019(var3.field3014, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("as.h(I)V")
    public void method998(int arg0) {
        for (class62 var2 = (class62) this.field1117.method3442(); var2 != null; var2 = (class62) this.field1117.method3444()) {
            var2.method995(arg0);
        }
    }
}
