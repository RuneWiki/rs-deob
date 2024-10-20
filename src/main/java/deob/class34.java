package deob;

@ObfuscatedName("as")
public class class34 extends class44 {

    @ObfuscatedName("as.i")
    public class309 field229 = new class309();

    @ObfuscatedName("as.s")
    public class309 field228 = new class309();

    @ObfuscatedName("as.a")
    public int field227 = 0;

    @ObfuscatedName("as.o")
    public int field230 = -1;

    @ObfuscatedName("as.i(Lav;)V")
    public final synchronized void method622(class44 arg0) {
        this.field229.method4983(arg0);
    }

    @ObfuscatedName("as.w(Lav;)V")
    public final synchronized void method621(class44 arg0) {
        arg0.method5752();
    }

    @ObfuscatedName("as.s()V")
    public void method655() {
        if (this.field227 <= 0) {
            return;
        }
        for (class49 var1 = (class49) this.field228.method4981(); var1 != null; var1 = (class49) this.field228.method4987()) {
            var1.field369 -= this.field227;
        }
        this.field230 -= this.field227;
        this.field227 = 0;
    }

    @ObfuscatedName("as.a(Lns;Law;)V")
    public void method643(class370 arg0, class49 arg1) {
        while (this.field228.field3812 != arg0 && ((class49) arg0).field369 <= arg1.field369) {
            arg0 = arg0.field4074;
        }
        class309.method4982(arg1, arg0);
        this.field230 = ((class49) this.field228.field3812.field4074).field369;
    }

    @ObfuscatedName("as.o(Law;)V")
    public void method625(class49 arg0) {
        arg0.method5752();
        arg0.method981();
        class370 var2 = this.field228.field3812.field4074;
        if (this.field228.field3812 == var2) {
            this.field230 = -1;
        } else {
            this.field230 = ((class49) var2).field369;
        }
    }

    @ObfuscatedName("as.g()Lav;")
    public class44 method626() {
        return (class44) this.field229.method4981();
    }

    @ObfuscatedName("as.e()Lav;")
    public class44 method627() {
        return (class44) this.field229.method4987();
    }

    @ObfuscatedName("as.p()I")
    public int method628() {
        return 0;
    }

    @ObfuscatedName("as.j([III)V")
    public final synchronized void method640(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field230 < 0) {
                this.method646(arg0, arg1, arg2);
                return;
            }
            if (this.field227 + arg2 < this.field230) {
                this.field227 += arg2;
                this.method646(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field230 - this.field227;
            this.method646(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field227 += var4;
            this.method655();
            class49 var5 = (class49) this.field228.method4981();
            synchronized (var5) {
                int var7 = var5.method979(this);
                if (var7 < 0) {
                    var5.field369 = 0;
                    this.method625(var5);
                } else {
                    var5.field369 = var7;
                    this.method643(var5.field4074, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("as.b([III)V")
    public void method646(int[] arg0, int arg1, int arg2) {
        for (class44 var4 = (class44) this.field229.method4981(); var4 != null; var4 = (class44) this.field229.method4987()) {
            var4.method927(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("as.x(I)V")
    public final synchronized void method631(int arg0) {
        do {
            if (this.field230 < 0) {
                this.method632(arg0);
                return;
            }
            if (this.field227 + arg0 < this.field230) {
                this.field227 += arg0;
                this.method632(arg0);
                return;
            }
            int var2 = this.field230 - this.field227;
            this.method632(var2);
            arg0 -= var2;
            this.field227 += var2;
            this.method655();
            class49 var3 = (class49) this.field228.method4981();
            synchronized (var3) {
                int var5 = var3.method979(this);
                if (var5 < 0) {
                    var3.field369 = 0;
                    this.method625(var3);
                } else {
                    var3.field369 = var5;
                    this.method643(var3.field4074, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("as.y(I)V")
    public void method632(int arg0) {
        for (class44 var2 = (class44) this.field229.method4981(); var2 != null; var2 = (class44) this.field229.method4987()) {
            var2.method631(arg0);
        }
    }
}
