package deob;

@ObfuscatedName("al")
public class class40 extends class50 {

    @ObfuscatedName("al.a")
    public class349 field274 = new class349();

    @ObfuscatedName("al.f")
    public class349 field273 = new class349();

    @ObfuscatedName("al.c")
    public int field275 = 0;

    @ObfuscatedName("al.x")
    public int field276 = -1;

    @ObfuscatedName("al.a(Lay;)V")
    public final synchronized void method713(class50 arg0) {
        this.field274.method6029(arg0);
    }

    @ObfuscatedName("al.f(Lay;)V")
    public final synchronized void method732(class50 arg0) {
        arg0.method7170();
    }

    @ObfuscatedName("al.c()V")
    public void method715() {
        if (this.field275 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field273.method6040(); var1 != null; var1 = (class56) this.field273.method6034()) {
            var1.field412 -= this.field275;
        }
        this.field276 -= this.field275;
        this.field275 = 0;
    }

    @ObfuscatedName("al.x(Lpk;Lbp;)V")
    public void method716(class430 arg0, class56 arg1) {
        while (this.field273.field4276 != arg0 && ((class56) arg0).field412 <= arg1.field412) {
            arg0 = arg0.field4636;
        }
        class349.method6037(arg1, arg0);
        this.field276 = ((class56) this.field273.field4276.field4636).field412;
    }

    @ObfuscatedName("al.h(Lbp;)V")
    public void method717(class56 arg0) {
        arg0.method7170();
        arg0.method1035();
        class430 var2 = this.field273.field4276.field4636;
        if (this.field273.field4276 == var2) {
            this.field276 = -1;
        } else {
            this.field276 = ((class56) var2).field412;
        }
    }

    @ObfuscatedName("al.j()Lay;")
    public class50 method718() {
        return (class50) this.field274.method6040();
    }

    @ObfuscatedName("al.y()Lay;")
    public class50 method719() {
        return (class50) this.field274.method6034();
    }

    @ObfuscatedName("al.d()I")
    public int method720() {
        return 0;
    }

    @ObfuscatedName("al.n([III)V")
    public final synchronized void method721(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field276 < 0) {
                this.method722(arg0, arg1, arg2);
                return;
            }
            if (this.field275 + arg2 < this.field276) {
                this.field275 += arg2;
                this.method722(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field276 - this.field275;
            this.method722(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field275 += var4;
            this.method715();
            class56 var5 = (class56) this.field273.method6040();
            synchronized (var5) {
                int var7 = var5.method1034(this);
                if (var7 < 0) {
                    var5.field412 = 0;
                    this.method717(var5);
                } else {
                    var5.field412 = var7;
                    this.method716(var5.field4636, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("al.r([III)V")
    public void method722(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field274.method6040(); var4 != null; var4 = (class50) this.field274.method6034()) {
            var4.method979(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("al.l(I)V")
    public final synchronized void method725(int arg0) {
        do {
            if (this.field276 < 0) {
                this.method724(arg0);
                return;
            }
            if (this.field275 + arg0 < this.field276) {
                this.field275 += arg0;
                this.method724(arg0);
                return;
            }
            int var2 = this.field276 - this.field275;
            this.method724(var2);
            arg0 -= var2;
            this.field275 += var2;
            this.method715();
            class56 var3 = (class56) this.field273.method6040();
            synchronized (var3) {
                int var5 = var3.method1034(this);
                if (var5 < 0) {
                    var3.field412 = 0;
                    this.method717(var3);
                } else {
                    var3.field412 = var5;
                    this.method716(var3.field4636, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("al.s(I)V")
    public void method724(int arg0) {
        for (class50 var2 = (class50) this.field274.method6040(); var2 != null; var2 = (class50) this.field274.method6034()) {
            var2.method725(arg0);
        }
    }
}
