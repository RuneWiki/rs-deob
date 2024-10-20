package deob;

@ObfuscatedName("ab")
public class class52 extends class69 {

    @ObfuscatedName("ab.s")
    public class129 field975 = new class129();

    @ObfuscatedName("ab.c")
    public class129 field973 = new class129();

    @ObfuscatedName("ab.f")
    public int field974 = 0;

    @ObfuscatedName("ab.h")
    public int field972 = -1;

    @ObfuscatedName("ab.s(Lby;)V")
    public final synchronized void method848(class69 arg0) {
        this.field975.method2183(arg0);
    }

    @ObfuscatedName("ab.c(Lby;)V")
    public final synchronized void method849(class69 arg0) {
        arg0.method2179();
    }

    @ObfuscatedName("ab.f()V")
    public void method850() {
        if (this.field974 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field973.method2187(); var1 != null; var1 = (class62) this.field973.method2203()) {
            var1.field1088 -= this.field974;
        }
        this.field972 -= this.field974;
        this.field974 = 0;
    }

    @ObfuscatedName("ab.g(Ldx;Lbo;)V")
    public void method851(class128 arg0, class62 arg1) {
        while (this.field973.field1891 != arg0 && ((class62) arg0).field1088 <= arg1.field1088) {
            arg0 = arg0.field1888;
        }
        class129.method2184(arg1, arg0);
        this.field972 = ((class62) this.field973.field1891.field1888).field1088;
    }

    @ObfuscatedName("ab.k(Lbo;)V")
    public void method866(class62 arg0) {
        arg0.method2179();
        arg0.method1056();
        class128 var2 = this.field973.field1891.field1888;
        if (this.field973.field1891 == var2) {
            this.field972 = -1;
        } else {
            this.field972 = ((class62) var2).field1088;
        }
    }

    @ObfuscatedName("ab.u()Lby;")
    public class69 method852() {
        return (class69) this.field975.method2187();
    }

    @ObfuscatedName("ab.b()Lby;")
    public class69 method854() {
        return (class69) this.field975.method2203();
    }

    @ObfuscatedName("ab.x()I")
    public int method855() {
        return 0;
    }

    @ObfuscatedName("ab.r([III)V")
    public final synchronized void method869(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field972 < 0) {
                this.method859(arg0, arg1, arg2);
                return;
            }
            if (this.field974 + arg2 < this.field972) {
                this.field974 += arg2;
                this.method859(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field972 - this.field974;
            this.method859(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field974 += var4;
            this.method850();
            class62 var5 = (class62) this.field973.method2187();
            synchronized (var5) {
                int var7 = var5.method1057(this);
                if (var7 < 0) {
                    var5.field1088 = 0;
                    this.method866(var5);
                } else {
                    var5.field1088 = var7;
                    this.method851(var5.field1888, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ab.n([III)V")
    public void method859(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field975.method2187(); var4 != null; var4 = (class69) this.field975.method2203()) {
            var4.method1255(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ab.m(I)V")
    public final synchronized void method857(int arg0) {
        do {
            if (this.field972 < 0) {
                this.method853(arg0);
                return;
            }
            if (this.field974 + arg0 < this.field972) {
                this.field974 += arg0;
                this.method853(arg0);
                return;
            }
            int var2 = this.field972 - this.field974;
            this.method853(var2);
            arg0 -= var2;
            this.field974 += var2;
            this.method850();
            class62 var3 = (class62) this.field973.method2187();
            synchronized (var3) {
                int var5 = var3.method1057(this);
                if (var5 < 0) {
                    var3.field1088 = 0;
                    this.method866(var3);
                } else {
                    var3.field1088 = var5;
                    this.method851(var3.field1888, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ab.j(I)V")
    public void method853(int arg0) {
        for (class69 var2 = (class69) this.field975.method2187(); var2 != null; var2 = (class69) this.field975.method2203()) {
            var2.method857(arg0);
        }
    }
}
