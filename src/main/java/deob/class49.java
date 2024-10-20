package deob;

@ObfuscatedName("ay")
public class class49 extends class59 {

    @ObfuscatedName("ay.v")
    public class294 field394 = new class294();

    @ObfuscatedName("ay.n")
    public class294 field392 = new class294();

    @ObfuscatedName("ay.f")
    public int field393 = 0;

    @ObfuscatedName("ay.y")
    public int field391 = -1;

    @ObfuscatedName("ay.v(Lbm;)V")
    public final synchronized void method550(class59 arg0) {
        this.field394.method4739(arg0);
    }

    @ObfuscatedName("ay.n(Lbm;)V")
    public final synchronized void method551(class59 arg0) {
        arg0.method5496();
    }

    @ObfuscatedName("ay.f()V")
    public void method566() {
        if (this.field393 <= 0) {
            return;
        }
        for (class64 var1 = (class64) this.field392.method4714(); var1 != null; var1 = (class64) this.field392.method4741()) {
            var1.field542 -= this.field393;
        }
        this.field391 -= this.field393;
        this.field393 = 0;
    }

    @ObfuscatedName("ay.y(Lmw;Lbf;)V")
    public void method555(class352 arg0, class64 arg1) {
        while (this.field392.field3706 != arg0 && ((class64) arg0).field542 <= arg1.field542) {
            arg0 = arg0.field3939;
        }
        class294.method4711(arg1, arg0);
        this.field391 = ((class64) this.field392.field3706.field3939).field542;
    }

    @ObfuscatedName("ay.p(Lbf;)V")
    public void method554(class64 arg0) {
        arg0.method5496();
        arg0.method897();
        class352 var2 = this.field392.field3706.field3939;
        if (this.field392.field3706 == var2) {
            this.field391 = -1;
        } else {
            this.field391 = ((class64) var2).field542;
        }
    }

    @ObfuscatedName("ay.j()Lbm;")
    public class59 method553() {
        return (class59) this.field394.method4714();
    }

    @ObfuscatedName("ay.r()Lbm;")
    public class59 method556() {
        return (class59) this.field394.method4741();
    }

    @ObfuscatedName("ay.b()I")
    public int method557() {
        return 0;
    }

    @ObfuscatedName("ay.d([III)V")
    public final synchronized void method586(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field391 < 0) {
                this.method571(arg0, arg1, arg2);
                return;
            }
            if (this.field393 + arg2 < this.field391) {
                this.field393 += arg2;
                this.method571(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field391 - this.field393;
            this.method571(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field393 += var4;
            this.method566();
            class64 var5 = (class64) this.field392.method4714();
            synchronized (var5) {
                int var7 = var5.method898(this);
                if (var7 < 0) {
                    var5.field542 = 0;
                    this.method554(var5);
                } else {
                    var5.field542 = var7;
                    this.method555(var5.field3939, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ay.s([III)V")
    public void method571(int[] arg0, int arg1, int arg2) {
        for (class59 var4 = (class59) this.field394.method4714(); var4 != null; var4 = (class59) this.field394.method4741()) {
            var4.method847(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ay.u(I)V")
    public final synchronized void method558(int arg0) {
        do {
            if (this.field391 < 0) {
                this.method561(arg0);
                return;
            }
            if (this.field393 + arg0 < this.field391) {
                this.field393 += arg0;
                this.method561(arg0);
                return;
            }
            int var2 = this.field391 - this.field393;
            this.method561(var2);
            arg0 -= var2;
            this.field393 += var2;
            this.method566();
            class64 var3 = (class64) this.field392.method4714();
            synchronized (var3) {
                int var5 = var3.method898(this);
                if (var5 < 0) {
                    var3.field542 = 0;
                    this.method554(var3);
                } else {
                    var3.field542 = var5;
                    this.method555(var3.field3939, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ay.l(I)V")
    public void method561(int arg0) {
        for (class59 var2 = (class59) this.field394.method4714(); var2 != null; var2 = (class59) this.field394.method4741()) {
            var2.method558(arg0);
        }
    }
}
