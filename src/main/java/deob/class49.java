package deob;

@ObfuscatedName("ak")
public class class49 extends class59 {

    @ObfuscatedName("ak.f")
    public class272 field362 = new class272();

    @ObfuscatedName("ak.o")
    public class272 field364 = new class272();

    @ObfuscatedName("ak.u")
    public int field363 = 0;

    @ObfuscatedName("ak.p")
    public int field365 = -1;

    @ObfuscatedName("ak.f(Lbt;)V")
    public final synchronized void method583(class59 arg0) {
        this.field362.method4156(arg0);
    }

    @ObfuscatedName("ak.o(Lbt;)V")
    public final synchronized void method553(class59 arg0) {
        arg0.method5354();
    }

    @ObfuscatedName("ak.u()V")
    public void method581() {
        if (this.field363 <= 0) {
            return;
        }
        for (class64 var1 = (class64) this.field364.method4160(); var1 != null; var1 = (class64) this.field364.method4182()) {
            var1.field502 -= this.field363;
        }
        this.field365 -= this.field363;
        this.field363 = 0;
    }

    @ObfuscatedName("ak.p(Lmh;Lbj;)V")
    public void method555(class351 arg0, class64 arg1) {
        while (this.field364.field3382 != arg0 && ((class64) arg0).field502 <= arg1.field502) {
            arg0 = arg0.field3942;
        }
        class272.method4157(arg1, arg0);
        this.field365 = ((class64) this.field364.field3382.field3942).field502;
    }

    @ObfuscatedName("ak.b(Lbj;)V")
    public void method586(class64 arg0) {
        arg0.method5354();
        arg0.method874();
        class351 var2 = this.field364.field3382.field3942;
        if (this.field364.field3382 == var2) {
            this.field365 = -1;
        } else {
            this.field365 = ((class64) var2).field502;
        }
    }

    @ObfuscatedName("ak.e()Lbt;")
    public class59 method557() {
        return (class59) this.field362.method4160();
    }

    @ObfuscatedName("ak.k()Lbt;")
    public class59 method558() {
        return (class59) this.field362.method4182();
    }

    @ObfuscatedName("ak.g()I")
    public int method575() {
        return 0;
    }

    @ObfuscatedName("ak.h([III)V")
    public final synchronized void method585(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field365 < 0) {
                this.method561(arg0, arg1, arg2);
                return;
            }
            if (this.field363 + arg2 < this.field365) {
                this.field363 += arg2;
                this.method561(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field365 - this.field363;
            this.method561(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field363 += var4;
            this.method581();
            class64 var5 = (class64) this.field364.method4160();
            synchronized (var5) {
                int var7 = var5.method871(this);
                if (var7 < 0) {
                    var5.field502 = 0;
                    this.method586(var5);
                } else {
                    var5.field502 = var7;
                    this.method555(var5.field3942, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ak.n([III)V")
    public void method561(int[] arg0, int arg1, int arg2) {
        for (class59 var4 = (class59) this.field362.method4160(); var4 != null; var4 = (class59) this.field362.method4182()) {
            var4.method825(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ak.l(I)V")
    public final synchronized void method560(int arg0) {
        do {
            if (this.field365 < 0) {
                this.method563(arg0);
                return;
            }
            if (this.field363 + arg0 < this.field365) {
                this.field363 += arg0;
                this.method563(arg0);
                return;
            }
            int var2 = this.field365 - this.field363;
            this.method563(var2);
            arg0 -= var2;
            this.field363 += var2;
            this.method581();
            class64 var3 = (class64) this.field364.method4160();
            synchronized (var3) {
                int var5 = var3.method871(this);
                if (var5 < 0) {
                    var3.field502 = 0;
                    this.method586(var3);
                } else {
                    var3.field502 = var5;
                    this.method555(var3.field3942, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ak.m(I)V")
    public void method563(int arg0) {
        for (class59 var2 = (class59) this.field362.method4160(); var2 != null; var2 = (class59) this.field362.method4182()) {
            var2.method560(arg0);
        }
    }
}
