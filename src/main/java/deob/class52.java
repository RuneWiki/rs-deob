package deob;

@ObfuscatedName("ax")
public class class52 extends class69 {

    @ObfuscatedName("ax.q")
    public class129 field996 = new class129();

    @ObfuscatedName("ax.d")
    public class129 field997 = new class129();

    @ObfuscatedName("ax.h")
    public int field998 = 0;

    @ObfuscatedName("ax.p")
    public int field999 = -1;

    @ObfuscatedName("ax.q(Lbs;)V")
    public final synchronized void method968(class69 arg0) {
        this.field996.method2315(arg0);
    }

    @ObfuscatedName("ax.d(Lbs;)V")
    public final synchronized void method973(class69 arg0) {
        arg0.method2310();
    }

    @ObfuscatedName("ax.h()V")
    public void method970() {
        if (this.field998 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field997.method2319(); var1 != null; var1 = (class62) this.field997.method2333()) {
            var1.field1104 -= this.field998;
        }
        this.field999 -= this.field998;
        this.field998 = 0;
    }

    @ObfuscatedName("ax.p(Ldg;Lbm;)V")
    public void method981(class128 arg0, class62 arg1) {
        while (this.field997.field1884 != arg0 && ((class62) arg0).field1104 <= arg1.field1104) {
            arg0 = arg0.field1881;
        }
        class129.method2316(arg1, arg0);
        this.field999 = ((class62) this.field997.field1884.field1881).field1104;
    }

    @ObfuscatedName("ax.j(Lbm;)V")
    public void method972(class62 arg0) {
        arg0.method2310();
        arg0.method1171();
        class128 var2 = this.field997.field1884.field1881;
        if (this.field997.field1884 == var2) {
            this.field999 = -1;
        } else {
            this.field999 = ((class62) var2).field1104;
        }
    }

    @ObfuscatedName("ax.n()Lbs;")
    public class69 method984() {
        return (class69) this.field996.method2319();
    }

    @ObfuscatedName("ax.c()Lbs;")
    public class69 method974() {
        return (class69) this.field996.method2333();
    }

    @ObfuscatedName("ax.o()I")
    public int method990() {
        return 0;
    }

    @ObfuscatedName("ax.s([III)V")
    public final synchronized void method976(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field999 < 0) {
                this.method977(arg0, arg1, arg2);
                return;
            }
            if (this.field998 + arg2 < this.field999) {
                this.field998 += arg2;
                this.method977(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field999 - this.field998;
            this.method977(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field998 += var4;
            this.method970();
            class62 var5 = (class62) this.field997.method2319();
            synchronized (var5) {
                int var7 = var5.method1172(this);
                if (var7 < 0) {
                    var5.field1104 = 0;
                    this.method972(var5);
                } else {
                    var5.field1104 = var7;
                    this.method981(var5.field1881, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ax.u([III)V")
    public void method977(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field996.method2319(); var4 != null; var4 = (class69) this.field996.method2333()) {
            var4.method1352(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ax.b(I)V")
    public final synchronized void method978(int arg0) {
        do {
            if (this.field999 < 0) {
                this.method979(arg0);
                return;
            }
            if (this.field998 + arg0 < this.field999) {
                this.field998 += arg0;
                this.method979(arg0);
                return;
            }
            int var2 = this.field999 - this.field998;
            this.method979(var2);
            arg0 -= var2;
            this.field998 += var2;
            this.method970();
            class62 var3 = (class62) this.field997.method2319();
            synchronized (var3) {
                int var5 = var3.method1172(this);
                if (var5 < 0) {
                    var3.field1104 = 0;
                    this.method972(var3);
                } else {
                    var3.field1104 = var5;
                    this.method981(var3.field1881, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ax.v(I)V")
    public void method979(int arg0) {
        for (class69 var2 = (class69) this.field996.method2319(); var2 != null; var2 = (class69) this.field996.method2333()) {
            var2.method978(arg0);
        }
    }
}
