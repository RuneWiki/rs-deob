package deob;

@ObfuscatedName("az")
public class class40 extends class50 {

    @ObfuscatedName("az.h")
    public class352 field290 = new class352();

    @ObfuscatedName("az.e")
    public class352 field289 = new class352();

    @ObfuscatedName("az.v")
    public int field288 = 0;

    @ObfuscatedName("az.x")
    public int field291 = -1;

    @ObfuscatedName("az.h(Laa;)V")
    public final synchronized void method707(class50 arg0) {
        this.field290.method6082(arg0);
    }

    @ObfuscatedName("az.e(Laa;)V")
    public final synchronized void method708(class50 arg0) {
        arg0.method7230();
    }

    @ObfuscatedName("az.v()V")
    public void method718() {
        if (this.field288 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field289.method6086(); var1 != null; var1 = (class56) this.field289.method6088()) {
            var1.field430 -= this.field288;
        }
        this.field291 -= this.field288;
        this.field288 = 0;
    }

    @ObfuscatedName("az.x(Lpl;Lbo;)V")
    public void method710(class433 arg0, class56 arg1) {
        while (this.field289.field4331 != arg0 && ((class56) arg0).field430 <= arg1.field430) {
            arg0 = arg0.field4684;
        }
        class352.method6083(arg1, arg0);
        this.field291 = ((class56) this.field289.field4331.field4684).field430;
    }

    @ObfuscatedName("az.m(Lbo;)V")
    public void method711(class56 arg0) {
        arg0.method7230();
        arg0.method1047();
        class433 var2 = this.field289.field4331.field4684;
        if (this.field289.field4331 == var2) {
            this.field291 = -1;
        } else {
            this.field291 = ((class56) var2).field430;
        }
    }

    @ObfuscatedName("az.q()Laa;")
    public class50 method737() {
        return (class50) this.field290.method6086();
    }

    @ObfuscatedName("az.f()Laa;")
    public class50 method713() {
        return (class50) this.field290.method6088();
    }

    @ObfuscatedName("az.r()I")
    public int method709() {
        return 0;
    }

    @ObfuscatedName("az.u([III)V")
    public final synchronized void method715(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field291 < 0) {
                this.method716(arg0, arg1, arg2);
                return;
            }
            if (this.field288 + arg2 < this.field291) {
                this.field288 += arg2;
                this.method716(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field291 - this.field288;
            this.method716(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field288 += var4;
            this.method718();
            class56 var5 = (class56) this.field289.method6086();
            synchronized (var5) {
                int var7 = var5.method1049(this);
                if (var7 < 0) {
                    var5.field430 = 0;
                    this.method711(var5);
                } else {
                    var5.field430 = var7;
                    this.method710(var5.field4684, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("az.b([III)V")
    public void method716(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field290.method6086(); var4 != null; var4 = (class50) this.field290.method6088()) {
            var4.method995(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("az.j(I)V")
    public final synchronized void method717(int arg0) {
        do {
            if (this.field291 < 0) {
                this.method722(arg0);
                return;
            }
            if (this.field288 + arg0 < this.field291) {
                this.field288 += arg0;
                this.method722(arg0);
                return;
            }
            int var2 = this.field291 - this.field288;
            this.method722(var2);
            arg0 -= var2;
            this.field288 += var2;
            this.method718();
            class56 var3 = (class56) this.field289.method6086();
            synchronized (var3) {
                int var5 = var3.method1049(this);
                if (var5 < 0) {
                    var3.field430 = 0;
                    this.method711(var3);
                } else {
                    var3.field430 = var5;
                    this.method710(var3.field4684, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("az.g(I)V")
    public void method722(int arg0) {
        for (class50 var2 = (class50) this.field290.method6086(); var2 != null; var2 = (class50) this.field290.method6088()) {
            var2.method717(arg0);
        }
    }
}
