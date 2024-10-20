package deob;

@ObfuscatedName("ao")
public class class52 extends class69 {

    @ObfuscatedName("ao.n")
    public class129 field969 = new class129();

    @ObfuscatedName("ao.d")
    public class129 field967 = new class129();

    @ObfuscatedName("ao.m")
    public int field968 = 0;

    @ObfuscatedName("ao.h")
    public int field966 = -1;

    @ObfuscatedName("ao.n(Lbb;)V")
    public final synchronized void method882(class69 arg0) {
        this.field969.method2279(arg0);
    }

    @ObfuscatedName("ao.d(Lbb;)V")
    public final synchronized void method883(class69 arg0) {
        arg0.method2273();
    }

    @ObfuscatedName("ao.m()V")
    public void method884() {
        if (this.field968 <= 0) {
            return;
        }
        for (class63 var1 = (class63) this.field967.method2290(); var1 != null; var1 = (class63) this.field967.method2285()) {
            var1.field1079 -= this.field968;
        }
        this.field966 -= this.field968;
        this.field968 = 0;
    }

    @ObfuscatedName("ao.h(Ldq;Lbe;)V")
    public void method885(class128 arg0, class63 arg1) {
        while (this.field967.field1882 != arg0 && ((class63) arg0).field1079 <= arg1.field1079) {
            arg0 = arg0.field1878;
        }
        class129.method2280(arg1, arg0);
        this.field966 = ((class63) this.field967.field1882.field1878).field1079;
    }

    @ObfuscatedName("ao.w(Lbe;)V")
    public void method891(class63 arg0) {
        arg0.method2273();
        arg0.method1091();
        class128 var2 = this.field967.field1882.field1878;
        if (this.field967.field1882 == var2) {
            this.field966 = -1;
        } else {
            this.field966 = ((class63) var2).field1079;
        }
    }

    @ObfuscatedName("ao.r()Lbb;")
    public class69 method887() {
        return (class69) this.field969.method2290();
    }

    @ObfuscatedName("ao.c()Lbb;")
    public class69 method914() {
        return (class69) this.field969.method2285();
    }

    @ObfuscatedName("ao.z()I")
    public int method888() {
        return 0;
    }

    @ObfuscatedName("ao.q([III)V")
    public final synchronized void method905(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field966 < 0) {
                this.method890(arg0, arg1, arg2);
                return;
            }
            if (this.field968 + arg2 < this.field966) {
                this.field968 += arg2;
                this.method890(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field966 - this.field968;
            this.method890(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field968 += var4;
            this.method884();
            class63 var5 = (class63) this.field967.method2290();
            synchronized (var5) {
                int var7 = var5.method1092(this);
                if (var7 < 0) {
                    var5.field1079 = 0;
                    this.method891(var5);
                } else {
                    var5.field1079 = var7;
                    this.method885(var5.field1878, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ao.l([III)V")
    public void method890(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field969.method2290(); var4 != null; var4 = (class69) this.field969.method2285()) {
            var4.method1300(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ao.y(I)V")
    public final synchronized void method897(int arg0) {
        do {
            if (this.field966 < 0) {
                this.method892(arg0);
                return;
            }
            if (this.field968 + arg0 < this.field966) {
                this.field968 += arg0;
                this.method892(arg0);
                return;
            }
            int var2 = this.field966 - this.field968;
            this.method892(var2);
            arg0 -= var2;
            this.field968 += var2;
            this.method884();
            class63 var3 = (class63) this.field967.method2290();
            synchronized (var3) {
                int var5 = var3.method1092(this);
                if (var5 < 0) {
                    var3.field1079 = 0;
                    this.method891(var3);
                } else {
                    var3.field1079 = var5;
                    this.method885(var3.field1878, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ao.e(I)V")
    public void method892(int arg0) {
        for (class69 var2 = (class69) this.field969.method2290(); var2 != null; var2 = (class69) this.field969.method2285()) {
            var2.method897(arg0);
        }
    }
}
