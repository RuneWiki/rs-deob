package deob;

@ObfuscatedName("au")
public class class52 extends class69 {

    @ObfuscatedName("au.x")
    public class129 field986 = new class129();

    @ObfuscatedName("au.j")
    public class129 field987 = new class129();

    @ObfuscatedName("au.c")
    public int field988 = 0;

    @ObfuscatedName("au.d")
    public int field989 = -1;

    @ObfuscatedName("au.x(Lbo;)V")
    public final synchronized void method973(class69 arg0) {
        this.field986.method2286(arg0);
    }

    @ObfuscatedName("au.j(Lbo;)V")
    public final synchronized void method965(class69 arg0) {
        arg0.method2278();
    }

    @ObfuscatedName("au.c()V")
    public void method1002() {
        if (this.field988 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field987.method2290(); var1 != null; var1 = (class62) this.field987.method2287()) {
            var1.field1095 -= this.field988;
        }
        this.field989 -= this.field988;
        this.field988 = 0;
    }

    @ObfuscatedName("au.d(Ldp;Lbk;)V")
    public void method967(class128 arg0, class62 arg1) {
        while (this.field987.field1887 != arg0 && ((class62) arg0).field1095 <= arg1.field1095) {
            arg0 = arg0.field1884;
        }
        class129.method2283(arg1, arg0);
        this.field989 = ((class62) this.field987.field1887.field1884).field1095;
    }

    @ObfuscatedName("au.w(Lbk;)V")
    public void method988(class62 arg0) {
        arg0.method2278();
        arg0.method1182();
        class128 var2 = this.field987.field1887.field1884;
        if (this.field987.field1887 == var2) {
            this.field989 = -1;
        } else {
            this.field989 = ((class62) var2).field1095;
        }
    }

    @ObfuscatedName("au.u()Lbo;")
    public class69 method969() {
        return (class69) this.field986.method2290();
    }

    @ObfuscatedName("au.y()Lbo;")
    public class69 method970() {
        return (class69) this.field986.method2287();
    }

    @ObfuscatedName("au.e()I")
    public int method971() {
        return 0;
    }

    @ObfuscatedName("au.q([III)V")
    public final synchronized void method972(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field989 < 0) {
                this.method978(arg0, arg1, arg2);
                return;
            }
            if (this.field988 + arg2 < this.field989) {
                this.field988 += arg2;
                this.method978(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field989 - this.field988;
            this.method978(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field988 += var4;
            this.method1002();
            class62 var5 = (class62) this.field987.method2290();
            synchronized (var5) {
                int var7 = var5.method1181(this);
                if (var7 < 0) {
                    var5.field1095 = 0;
                    this.method988(var5);
                } else {
                    var5.field1095 = var7;
                    this.method967(var5.field1884, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("au.v([III)V")
    public void method978(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field986.method2290(); var4 != null; var4 = (class69) this.field986.method2287()) {
            var4.method1346(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("au.l(I)V")
    public final synchronized void method974(int arg0) {
        do {
            if (this.field989 < 0) {
                this.method975(arg0);
                return;
            }
            if (this.field988 + arg0 < this.field989) {
                this.field988 += arg0;
                this.method975(arg0);
                return;
            }
            int var2 = this.field989 - this.field988;
            this.method975(var2);
            arg0 -= var2;
            this.field988 += var2;
            this.method1002();
            class62 var3 = (class62) this.field987.method2290();
            synchronized (var3) {
                int var5 = var3.method1181(this);
                if (var5 < 0) {
                    var3.field1095 = 0;
                    this.method988(var3);
                } else {
                    var3.field1095 = var5;
                    this.method967(var3.field1884, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("au.s(I)V")
    public void method975(int arg0) {
        for (class69 var2 = (class69) this.field986.method2290(); var2 != null; var2 = (class69) this.field986.method2287()) {
            var2.method974(arg0);
        }
    }
}
