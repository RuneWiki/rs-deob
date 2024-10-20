package deob;

@ObfuscatedName("m")
public class class21 extends class31 {

    @ObfuscatedName("m.s")
    public class296 field159 = new class296();

    @ObfuscatedName("m.t")
    public class296 field157 = new class296();

    @ObfuscatedName("m.v")
    public int field156 = 0;

    @ObfuscatedName("m.j")
    public int field158 = -1;

    @ObfuscatedName("m.s(Laq;)V")
    public final synchronized void method368(class31 arg0) {
        this.field159.method4707(arg0);
    }

    @ObfuscatedName("m.t(Laq;)V")
    public final synchronized void method380(class31 arg0) {
        arg0.method5447();
    }

    @ObfuscatedName("m.v()V")
    public void method370() {
        if (this.field156 <= 0) {
            return;
        }
        for (class36 var1 = (class36) this.field157.method4721(); var1 != null; var1 = (class36) this.field157.method4712()) {
            var1.field299 -= this.field156;
        }
        this.field158 -= this.field156;
        this.field156 = 0;
    }

    @ObfuscatedName("m.j(Lml;Lav;)V")
    public void method369(class354 arg0, class36 arg1) {
        while (this.field157.field3718 != arg0 && ((class36) arg0).field299 <= arg1.field299) {
            arg0 = arg0.field3965;
        }
        class296.method4708(arg1, arg0);
        this.field158 = ((class36) this.field157.field3718.field3965).field299;
    }

    @ObfuscatedName("m.l(Lav;)V")
    public void method372(class36 arg0) {
        arg0.method5447();
        arg0.method726();
        class354 var2 = this.field157.field3718.field3965;
        if (this.field157.field3718 == var2) {
            this.field158 = -1;
        } else {
            this.field158 = ((class36) var2).field299;
        }
    }

    @ObfuscatedName("m.n()Laq;")
    public class31 method373() {
        return (class31) this.field159.method4721();
    }

    @ObfuscatedName("m.w()Laq;")
    public class31 method396() {
        return (class31) this.field159.method4712();
    }

    @ObfuscatedName("m.f()I")
    public int method375() {
        return 0;
    }

    @ObfuscatedName("m.o([III)V")
    public final synchronized void method376(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field158 < 0) {
                this.method377(arg0, arg1, arg2);
                return;
            }
            if (this.field156 + arg2 < this.field158) {
                this.field156 += arg2;
                this.method377(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field158 - this.field156;
            this.method377(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field156 += var4;
            this.method370();
            class36 var5 = (class36) this.field157.method4721();
            synchronized (var5) {
                int var7 = var5.method727(this);
                if (var7 < 0) {
                    var5.field299 = 0;
                    this.method372(var5);
                } else {
                    var5.field299 = var7;
                    this.method369(var5.field3965, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("m.x([III)V")
    public void method377(int[] arg0, int arg1, int arg2) {
        for (class31 var4 = (class31) this.field159.method4721(); var4 != null; var4 = (class31) this.field159.method4712()) {
            var4.method668(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("m.r(I)V")
    public final synchronized void method378(int arg0) {
        do {
            if (this.field158 < 0) {
                this.method367(arg0);
                return;
            }
            if (this.field156 + arg0 < this.field158) {
                this.field156 += arg0;
                this.method367(arg0);
                return;
            }
            int var2 = this.field158 - this.field156;
            this.method367(var2);
            arg0 -= var2;
            this.field156 += var2;
            this.method370();
            class36 var3 = (class36) this.field157.method4721();
            synchronized (var3) {
                int var5 = var3.method727(this);
                if (var5 < 0) {
                    var3.field299 = 0;
                    this.method372(var3);
                } else {
                    var3.field299 = var5;
                    this.method369(var3.field3965, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("m.p(I)V")
    public void method367(int arg0) {
        for (class31 var2 = (class31) this.field159.method4721(); var2 != null; var2 = (class31) this.field159.method4712()) {
            var2.method378(arg0);
        }
    }
}
