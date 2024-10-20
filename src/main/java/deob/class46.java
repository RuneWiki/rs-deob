package deob;

@ObfuscatedName("ae")
public class class46 extends class48 {

    @ObfuscatedName("ae.a")
    public class177 field1049 = new class177();

    @ObfuscatedName("ae.r")
    public class177 field1052 = new class177();

    @ObfuscatedName("ae.u")
    public int field1051 = 0;

    @ObfuscatedName("ae.t")
    public int field1050 = -1;

    @ObfuscatedName("ae.a(Lam;)V")
    public final synchronized void method1030(class48 arg0) {
        this.field1049.method3272(arg0);
    }

    @ObfuscatedName("ae.r(Lam;)V")
    public final synchronized void method1031(class48 arg0) {
        arg0.method3311();
    }

    @ObfuscatedName("ae.t()V")
    public void method1036() {
        if (this.field1051 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1052.method3276(); var1 != null; var1 = (class61) this.field1052.method3278()) {
            var1.field1205 -= this.field1051;
        }
        this.field1050 -= this.field1051;
        this.field1051 = 0;
    }

    @ObfuscatedName("ae.k(Lfs;Lba;)V")
    public void method1032(class179 arg0, class61 arg1) {
        while (this.field1052.field2811 != arg0 && ((class61) arg0).field1205 <= arg1.field1205) {
            arg0 = arg0.field2816;
        }
        class177.method3273(arg1, arg0);
        this.field1050 = ((class61) this.field1052.field2811.field2816).field1205;
    }

    @ObfuscatedName("ae.x(Lba;)V")
    public void method1033(class61 arg0) {
        arg0.method3311();
        arg0.method1237();
        class179 var2 = this.field1052.field2811.field2816;
        if (this.field1052.field2811 == var2) {
            this.field1050 = -1;
        } else {
            this.field1050 = ((class61) var2).field1205;
        }
    }

    @ObfuscatedName("ae.w()Lam;")
    public class48 method908() {
        return (class48) this.field1049.method3276();
    }

    @ObfuscatedName("ae.l()Lam;")
    public class48 method1015() {
        return (class48) this.field1049.method3278();
    }

    @ObfuscatedName("ae.d()I")
    public int method945() {
        return 0;
    }

    @ObfuscatedName("ae.y([III)V")
    public final synchronized void method955(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1050 < 0) {
                this.method1040(arg0, arg1, arg2);
                return;
            }
            if (this.field1051 + arg2 < this.field1050) {
                this.field1051 += arg2;
                this.method1040(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1050 - this.field1051;
            this.method1040(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1051 += var4;
            this.method1036();
            class61 var5 = (class61) this.field1052.method3276();
            synchronized (var5) {
                int var7 = var5.method1239(this);
                if (var7 < 0) {
                    var5.field1205 = 0;
                    this.method1033(var5);
                } else {
                    var5.field1205 = var7;
                    this.method1032(var5.field2816, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ae.v([III)V")
    public void method1040(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1049.method3276(); var4 != null; var4 = (class48) this.field1049.method3278()) {
            var4.method1056(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ae.ah(I)V")
    public final synchronized void method912(int arg0) {
        do {
            if (this.field1050 < 0) {
                this.method1035(arg0);
                return;
            }
            if (this.field1051 + arg0 < this.field1050) {
                this.field1051 += arg0;
                this.method1035(arg0);
                return;
            }
            int var2 = this.field1050 - this.field1051;
            this.method1035(var2);
            arg0 -= var2;
            this.field1051 += var2;
            this.method1036();
            class61 var3 = (class61) this.field1052.method3276();
            synchronized (var3) {
                int var5 = var3.method1239(this);
                if (var5 < 0) {
                    var3.field1205 = 0;
                    this.method1033(var3);
                } else {
                    var3.field1205 = var5;
                    this.method1032(var3.field2816, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ae.g(I)V")
    public void method1035(int arg0) {
        for (class48 var2 = (class48) this.field1049.method3276(); var2 != null; var2 = (class48) this.field1049.method3278()) {
            var2.method912(arg0);
        }
    }
}
