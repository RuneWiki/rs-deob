package deob;

@ObfuscatedName("as")
public class class36 extends class46 {

    @ObfuscatedName("as.o")
    public class335 field257 = new class335();

    @ObfuscatedName("as.q")
    public class335 field255 = new class335();

    @ObfuscatedName("as.l")
    public int field256 = 0;

    @ObfuscatedName("as.k")
    public int field258 = -1;

    @ObfuscatedName("as.o(Lao;)V")
    public final synchronized void method628(class46 arg0) {
        this.field257.method5414(arg0);
    }

    @ObfuscatedName("as.q(Lao;)V")
    public final synchronized void method597(class46 arg0) {
        arg0.method6399();
    }

    @ObfuscatedName("as.l()V")
    public void method598() {
        if (this.field256 <= 0) {
            return;
        }
        for (class52 var1 = (class52) this.field255.method5431(); var1 != null; var1 = (class52) this.field255.method5419()) {
            var1.field397 -= this.field256;
        }
        this.field258 -= this.field256;
        this.field256 = 0;
    }

    @ObfuscatedName("as.k(Los;Lat;)V")
    public void method622(class411 arg0, class52 arg1) {
        while (this.field255.field4142 != arg0 && ((class52) arg0).field397 <= arg1.field397) {
            arg0 = arg0.field4467;
        }
        class335.method5415(arg1, arg0);
        this.field258 = ((class52) this.field255.field4142.field4467).field397;
    }

    @ObfuscatedName("as.a(Lat;)V")
    public void method600(class52 arg0) {
        arg0.method6399();
        arg0.method962();
        class411 var2 = this.field255.field4142.field4467;
        if (this.field255.field4142 == var2) {
            this.field258 = -1;
        } else {
            this.field258 = ((class52) var2).field397;
        }
    }

    @ObfuscatedName("as.m()Lao;")
    public class46 method601() {
        return (class46) this.field257.method5431();
    }

    @ObfuscatedName("as.p()Lao;")
    public class46 method602() {
        return (class46) this.field257.method5419();
    }

    @ObfuscatedName("as.s()I")
    public int method599() {
        return 0;
    }

    @ObfuscatedName("as.r([III)V")
    public final synchronized void method604(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field258 < 0) {
                this.method605(arg0, arg1, arg2);
                return;
            }
            if (this.field256 + arg2 < this.field258) {
                this.field256 += arg2;
                this.method605(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field258 - this.field256;
            this.method605(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field256 += var4;
            this.method598();
            class52 var5 = (class52) this.field255.method5431();
            synchronized (var5) {
                int var7 = var5.method958(this);
                if (var7 < 0) {
                    var5.field397 = 0;
                    this.method600(var5);
                } else {
                    var5.field397 = var7;
                    this.method622(var5.field4467, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("as.v([III)V")
    public void method605(int[] arg0, int arg1, int arg2) {
        for (class46 var4 = (class46) this.field257.method5431(); var4 != null; var4 = (class46) this.field257.method5419()) {
            var4.method909(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("as.y(I)V")
    public final synchronized void method614(int arg0) {
        do {
            if (this.field258 < 0) {
                this.method610(arg0);
                return;
            }
            if (this.field256 + arg0 < this.field258) {
                this.field256 += arg0;
                this.method610(arg0);
                return;
            }
            int var2 = this.field258 - this.field256;
            this.method610(var2);
            arg0 -= var2;
            this.field256 += var2;
            this.method598();
            class52 var3 = (class52) this.field255.method5431();
            synchronized (var3) {
                int var5 = var3.method958(this);
                if (var5 < 0) {
                    var3.field397 = 0;
                    this.method600(var3);
                } else {
                    var3.field397 = var5;
                    this.method622(var3.field4467, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("as.c(I)V")
    public void method610(int arg0) {
        for (class46 var2 = (class46) this.field257.method5431(); var2 != null; var2 = (class46) this.field257.method5419()) {
            var2.method614(arg0);
        }
    }
}
