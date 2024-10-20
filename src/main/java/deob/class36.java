package deob;

@ObfuscatedName("as")
public class class36 extends class46 {

    @ObfuscatedName("as.s")
    public class335 field255 = new class335();

    @ObfuscatedName("as.h")
    public class335 field253 = new class335();

    @ObfuscatedName("as.v")
    public int field254 = 0;

    @ObfuscatedName("as.c")
    public int field256 = -1;

    @ObfuscatedName("as.s(Lah;)V")
    public final synchronized void method590(class46 arg0) {
        this.field255.method5427(arg0);
    }

    @ObfuscatedName("as.h(Lah;)V")
    public final synchronized void method578(class46 arg0) {
        arg0.method6409();
    }

    @ObfuscatedName("as.w()V")
    public void method579() {
        if (this.field254 <= 0) {
            return;
        }
        for (class52 var1 = (class52) this.field253.method5442(); var1 != null; var1 = (class52) this.field253.method5426()) {
            var1.field398 -= this.field254;
        }
        this.field256 -= this.field254;
        this.field254 = 0;
    }

    @ObfuscatedName("as.v(Lon;Lac;)V")
    public void method583(class411 arg0, class52 arg1) {
        while (this.field253.field4126 != arg0 && ((class52) arg0).field398 <= arg1.field398) {
            arg0 = arg0.field4469;
        }
        class335.method5428(arg1, arg0);
        this.field256 = ((class52) this.field253.field4126.field4469).field398;
    }

    @ObfuscatedName("as.c(Lac;)V")
    public void method592(class52 arg0) {
        arg0.method6409();
        arg0.method913();
        class411 var2 = this.field253.field4126.field4469;
        if (this.field253.field4126 == var2) {
            this.field256 = -1;
        } else {
            this.field256 = ((class52) var2).field398;
        }
    }

    @ObfuscatedName("as.q()Lah;")
    public class46 method582() {
        return (class46) this.field255.method5442();
    }

    @ObfuscatedName("as.i()Lah;")
    public class46 method595() {
        return (class46) this.field255.method5426();
    }

    @ObfuscatedName("as.k()I")
    public int method584() {
        return 0;
    }

    @ObfuscatedName("as.o([III)V")
    public final synchronized void method577(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field256 < 0) {
                this.method586(arg0, arg1, arg2);
                return;
            }
            if (this.field254 + arg2 < this.field256) {
                this.field254 += arg2;
                this.method586(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field256 - this.field254;
            this.method586(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field254 += var4;
            this.method579();
            class52 var5 = (class52) this.field253.method5442();
            synchronized (var5) {
                int var7 = var5.method917(this);
                if (var7 < 0) {
                    var5.field398 = 0;
                    this.method592(var5);
                } else {
                    var5.field398 = var7;
                    this.method583(var5.field4469, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("as.n([III)V")
    public void method586(int[] arg0, int arg1, int arg2) {
        for (class46 var4 = (class46) this.field255.method5442(); var4 != null; var4 = (class46) this.field255.method5426()) {
            var4.method872(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("as.d(I)V")
    public final synchronized void method587(int arg0) {
        do {
            if (this.field256 < 0) {
                this.method588(arg0);
                return;
            }
            if (this.field254 + arg0 < this.field256) {
                this.field254 += arg0;
                this.method588(arg0);
                return;
            }
            int var2 = this.field256 - this.field254;
            this.method588(var2);
            arg0 -= var2;
            this.field254 += var2;
            this.method579();
            class52 var3 = (class52) this.field253.method5442();
            synchronized (var3) {
                int var5 = var3.method917(this);
                if (var5 < 0) {
                    var3.field398 = 0;
                    this.method592(var3);
                } else {
                    var3.field398 = var5;
                    this.method583(var3.field4469, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("as.a(I)V")
    public void method588(int arg0) {
        for (class46 var2 = (class46) this.field255.method5442(); var2 != null; var2 = (class46) this.field255.method5426()) {
            var2.method587(arg0);
        }
    }
}
