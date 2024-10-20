package deob;

@ObfuscatedName("af")
public class class52 extends class69 {

    @ObfuscatedName("af.f")
    public class129 field999 = new class129();

    @ObfuscatedName("af.i")
    public class129 field998 = new class129();

    @ObfuscatedName("af.u")
    public int field997 = 0;

    @ObfuscatedName("af.h")
    public int field1000 = -1;

    @ObfuscatedName("af.f(Lbm;)V")
    public final synchronized void method920(class69 arg0) {
        this.field999.method2297(arg0);
    }

    @ObfuscatedName("af.i(Lbm;)V")
    public final synchronized void method921(class69 arg0) {
        arg0.method2289();
    }

    @ObfuscatedName("af.u()V")
    public void method953() {
        if (this.field997 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field998.method2301(); var1 != null; var1 = (class62) this.field998.method2309()) {
            var1.field1112 -= this.field997;
        }
        this.field1000 -= this.field997;
        this.field997 = 0;
    }

    @ObfuscatedName("af.r(Ldt;Lbb;)V")
    public void method923(class128 arg0, class62 arg1) {
        while (this.field998.field1908 != arg0 && ((class62) arg0).field1112 <= arg1.field1112) {
            arg0 = arg0.field1906;
        }
        class129.method2294(arg1, arg0);
        this.field1000 = ((class62) this.field998.field1908.field1906).field1112;
    }

    @ObfuscatedName("af.o(Lbb;)V")
    public void method924(class62 arg0) {
        arg0.method2289();
        arg0.method1138();
        class128 var2 = this.field998.field1908.field1906;
        if (this.field998.field1908 == var2) {
            this.field1000 = -1;
        } else {
            this.field1000 = ((class62) var2).field1112;
        }
    }

    @ObfuscatedName("af.l()Lbm;")
    public class69 method936() {
        return (class69) this.field999.method2301();
    }

    @ObfuscatedName("af.n()Lbm;")
    public class69 method928() {
        return (class69) this.field999.method2309();
    }

    @ObfuscatedName("af.m()I")
    public int method960() {
        return 0;
    }

    @ObfuscatedName("af.w([III)V")
    public final synchronized void method930(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1000 < 0) {
                this.method927(arg0, arg1, arg2);
                return;
            }
            if (this.field997 + arg2 < this.field1000) {
                this.field997 += arg2;
                this.method927(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1000 - this.field997;
            this.method927(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field997 += var4;
            this.method953();
            class62 var5 = (class62) this.field998.method2301();
            synchronized (var5) {
                int var7 = var5.method1137(this);
                if (var7 < 0) {
                    var5.field1112 = 0;
                    this.method924(var5);
                } else {
                    var5.field1112 = var7;
                    this.method923(var5.field1906, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("af.j([III)V")
    public void method927(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field999.method2301(); var4 != null; var4 = (class69) this.field999.method2309()) {
            var4.method1310(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("af.s(I)V")
    public final synchronized void method929(int arg0) {
        do {
            if (this.field1000 < 0) {
                this.method959(arg0);
                return;
            }
            if (this.field997 + arg0 < this.field1000) {
                this.field997 += arg0;
                this.method959(arg0);
                return;
            }
            int var2 = this.field1000 - this.field997;
            this.method959(var2);
            arg0 -= var2;
            this.field997 += var2;
            this.method953();
            class62 var3 = (class62) this.field998.method2301();
            synchronized (var3) {
                int var5 = var3.method1137(this);
                if (var5 < 0) {
                    var3.field1112 = 0;
                    this.method924(var3);
                } else {
                    var3.field1112 = var5;
                    this.method923(var3.field1906, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("af.q(I)V")
    public void method959(int arg0) {
        for (class69 var2 = (class69) this.field999.method2301(); var2 != null; var2 = (class69) this.field999.method2309()) {
            var2.method929(arg0);
        }
    }
}
