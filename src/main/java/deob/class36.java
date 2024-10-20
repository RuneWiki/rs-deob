package deob;

@ObfuscatedName("am")
public class class36 extends class46 {

    @ObfuscatedName("am.c")
    public class334 field251 = new class334();

    @ObfuscatedName("am.v")
    public class334 field250 = new class334();

    @ObfuscatedName("am.q")
    public int field252 = 0;

    @ObfuscatedName("am.f")
    public int field253 = -1;

    @ObfuscatedName("am.c(Laz;)V")
    public final synchronized void method592(class46 arg0) {
        this.field251.method5531(arg0);
    }

    @ObfuscatedName("am.v(Laz;)V")
    public final synchronized void method577(class46 arg0) {
        arg0.method6497();
    }

    @ObfuscatedName("am.q()V")
    public void method578() {
        if (this.field252 <= 0) {
            return;
        }
        for (class52 var1 = (class52) this.field250.method5535(); var1 != null; var1 = (class52) this.field250.method5537()) {
            var1.field396 -= this.field252;
        }
        this.field253 -= this.field252;
        this.field252 = 0;
    }

    @ObfuscatedName("am.f(Loh;Las;)V")
    public void method579(class410 arg0, class52 arg1) {
        while (this.field250.field4123 != arg0 && ((class52) arg0).field396 <= arg1.field396) {
            arg0 = arg0.field4463;
        }
        class334.method5557(arg1, arg0);
        this.field253 = ((class52) this.field250.field4123.field4463).field396;
    }

    @ObfuscatedName("am.j(Las;)V")
    public void method575(class52 arg0) {
        arg0.method6497();
        arg0.method925();
        class410 var2 = this.field250.field4123.field4463;
        if (this.field250.field4123 == var2) {
            this.field253 = -1;
        } else {
            this.field253 = ((class52) var2).field396;
        }
    }

    @ObfuscatedName("am.e()Laz;")
    public class46 method581() {
        return (class46) this.field251.method5535();
    }

    @ObfuscatedName("am.g()Laz;")
    public class46 method606() {
        return (class46) this.field251.method5537();
    }

    @ObfuscatedName("am.w()I")
    public int method583() {
        return 0;
    }

    @ObfuscatedName("am.y([III)V")
    public final synchronized void method584(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field253 < 0) {
                this.method585(arg0, arg1, arg2);
                return;
            }
            if (this.field252 + arg2 < this.field253) {
                this.field252 += arg2;
                this.method585(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field253 - this.field252;
            this.method585(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field252 += var4;
            this.method578();
            class52 var5 = (class52) this.field250.method5535();
            synchronized (var5) {
                int var7 = var5.method924(this);
                if (var7 < 0) {
                    var5.field396 = 0;
                    this.method575(var5);
                } else {
                    var5.field396 = var7;
                    this.method579(var5.field4463, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("am.i([III)V")
    public void method585(int[] arg0, int arg1, int arg2) {
        for (class46 var4 = (class46) this.field251.method5535(); var4 != null; var4 = (class46) this.field251.method5537()) {
            var4.method879(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("am.s(I)V")
    public final synchronized void method586(int arg0) {
        do {
            if (this.field253 < 0) {
                this.method587(arg0);
                return;
            }
            if (this.field252 + arg0 < this.field253) {
                this.field252 += arg0;
                this.method587(arg0);
                return;
            }
            int var2 = this.field253 - this.field252;
            this.method587(var2);
            arg0 -= var2;
            this.field252 += var2;
            this.method578();
            class52 var3 = (class52) this.field250.method5535();
            synchronized (var3) {
                int var5 = var3.method924(this);
                if (var5 < 0) {
                    var3.field396 = 0;
                    this.method575(var3);
                } else {
                    var3.field396 = var5;
                    this.method579(var3.field4463, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("am.t(I)V")
    public void method587(int arg0) {
        for (class46 var2 = (class46) this.field251.method5535(); var2 != null; var2 = (class46) this.field251.method5537()) {
            var2.method586(arg0);
        }
    }
}
