package deob;

@ObfuscatedName("ad")
public class class52 extends class69 {

    @ObfuscatedName("ad.o")
    public class129 field976 = new class129();

    @ObfuscatedName("ad.m")
    public class129 field975 = new class129();

    @ObfuscatedName("ad.b")
    public int field977 = 0;

    @ObfuscatedName("ad.g")
    public int field974 = -1;

    @ObfuscatedName("ad.o(Lbi;)V")
    public final synchronized void method880(class69 arg0) {
        this.field976.method2197(arg0);
    }

    @ObfuscatedName("ad.m(Lbi;)V")
    public final synchronized void method905(class69 arg0) {
        arg0.method2189();
    }

    @ObfuscatedName("ad.b()V")
    public void method908() {
        if (this.field977 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field975.method2201(); var1 != null; var1 = (class62) this.field975.method2203()) {
            var1.field1087 -= this.field977;
        }
        this.field974 -= this.field977;
        this.field977 = 0;
    }

    @ObfuscatedName("ad.g(Ldr;Lbo;)V")
    public void method903(class128 arg0, class62 arg1) {
        while (this.field975.field1898 != arg0 && ((class62) arg0).field1087 <= arg1.field1087) {
            arg0 = arg0.field1895;
        }
        class129.method2198(arg1, arg0);
        this.field974 = ((class62) this.field975.field1898.field1895).field1087;
    }

    @ObfuscatedName("ad.l(Lbo;)V")
    public void method909(class62 arg0) {
        arg0.method2189();
        arg0.method1090();
        class128 var2 = this.field975.field1898.field1895;
        if (this.field975.field1898 == var2) {
            this.field974 = -1;
        } else {
            this.field974 = ((class62) var2).field1087;
        }
    }

    @ObfuscatedName("ad.c()Lbi;")
    public class69 method882() {
        return (class69) this.field976.method2201();
    }

    @ObfuscatedName("ad.u()Lbi;")
    public class69 method885() {
        return (class69) this.field976.method2203();
    }

    @ObfuscatedName("ad.k()I")
    public int method886() {
        return 0;
    }

    @ObfuscatedName("ad.z([III)V")
    public final synchronized void method887(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field974 < 0) {
                this.method888(arg0, arg1, arg2);
                return;
            }
            if (this.field977 + arg2 < this.field974) {
                this.field977 += arg2;
                this.method888(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field974 - this.field977;
            this.method888(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field977 += var4;
            this.method908();
            class62 var5 = (class62) this.field975.method2201();
            synchronized (var5) {
                int var7 = var5.method1093(this);
                if (var7 < 0) {
                    var5.field1087 = 0;
                    this.method909(var5);
                } else {
                    var5.field1087 = var7;
                    this.method903(var5.field1895, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ad.y([III)V")
    public void method888(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field976.method2201(); var4 != null; var4 = (class69) this.field976.method2203()) {
            var4.method1265(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ad.j(I)V")
    public final synchronized void method889(int arg0) {
        do {
            if (this.field974 < 0) {
                this.method881(arg0);
                return;
            }
            if (this.field977 + arg0 < this.field974) {
                this.field977 += arg0;
                this.method881(arg0);
                return;
            }
            int var2 = this.field974 - this.field977;
            this.method881(var2);
            arg0 -= var2;
            this.field977 += var2;
            this.method908();
            class62 var3 = (class62) this.field975.method2201();
            synchronized (var3) {
                int var5 = var3.method1093(this);
                if (var5 < 0) {
                    var3.field1087 = 0;
                    this.method909(var3);
                } else {
                    var3.field1087 = var5;
                    this.method903(var3.field1895, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ad.f(I)V")
    public void method881(int arg0) {
        for (class69 var2 = (class69) this.field976.method2201(); var2 != null; var2 = (class69) this.field976.method2203()) {
            var2.method889(arg0);
        }
    }
}
