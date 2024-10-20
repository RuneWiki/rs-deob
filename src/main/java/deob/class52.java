package deob;

@ObfuscatedName("an")
public class class52 extends class69 {

    @ObfuscatedName("an.k")
    public class129 field979 = new class129();

    @ObfuscatedName("an.y")
    public class129 field977 = new class129();

    @ObfuscatedName("an.o")
    public int field978 = 0;

    @ObfuscatedName("an.r")
    public int field976 = -1;

    @ObfuscatedName("an.k(Lbs;)V")
    public final synchronized void method891(class69 arg0) {
        this.field979.method2221(arg0);
    }

    @ObfuscatedName("an.y(Lbs;)V")
    public final synchronized void method892(class69 arg0) {
        arg0.method2214();
    }

    @ObfuscatedName("an.o()V")
    public void method899() {
        if (this.field978 <= 0) {
            return;
        }
        for (class63 var1 = (class63) this.field977.method2243(); var1 != null; var1 = (class63) this.field977.method2238()) {
            var1.field1089 -= this.field978;
        }
        this.field976 -= this.field978;
        this.field978 = 0;
    }

    @ObfuscatedName("an.r(Ldb;Lbd;)V")
    public void method894(class128 arg0, class63 arg1) {
        while (this.field977.field1877 != arg0 && ((class63) arg0).field1089 <= arg1.field1089) {
            arg0 = arg0.field1875;
        }
        class129.method2222(arg1, arg0);
        this.field976 = ((class63) this.field977.field1877.field1875).field1089;
    }

    @ObfuscatedName("an.w(Lbd;)V")
    public void method895(class63 arg0) {
        arg0.method2214();
        arg0.method1112();
        class128 var2 = this.field977.field1877.field1875;
        if (this.field977.field1877 == var2) {
            this.field976 = -1;
        } else {
            this.field976 = ((class63) var2).field1089;
        }
    }

    @ObfuscatedName("an.j()Lbs;")
    public class69 method896() {
        return (class69) this.field979.method2243();
    }

    @ObfuscatedName("an.c()Lbs;")
    public class69 method897() {
        return (class69) this.field979.method2238();
    }

    @ObfuscatedName("an.g()I")
    public int method898() {
        return 0;
    }

    @ObfuscatedName("an.i([III)V")
    public final synchronized void method907(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field976 < 0) {
                this.method929(arg0, arg1, arg2);
                return;
            }
            if (this.field978 + arg2 < this.field976) {
                this.field978 += arg2;
                this.method929(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field976 - this.field978;
            this.method929(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field978 += var4;
            this.method899();
            class63 var5 = (class63) this.field977.method2243();
            synchronized (var5) {
                int var7 = var5.method1113(this);
                if (var7 < 0) {
                    var5.field1089 = 0;
                    this.method895(var5);
                } else {
                    var5.field1089 = var7;
                    this.method894(var5.field1875, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("an.v([III)V")
    public void method929(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field979.method2243(); var4 != null; var4 = (class69) this.field979.method2238()) {
            var4.method1287(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("an.a(I)V")
    public final synchronized void method919(int arg0) {
        do {
            if (this.field976 < 0) {
                this.method902(arg0);
                return;
            }
            if (this.field978 + arg0 < this.field976) {
                this.field978 += arg0;
                this.method902(arg0);
                return;
            }
            int var2 = this.field976 - this.field978;
            this.method902(var2);
            arg0 -= var2;
            this.field978 += var2;
            this.method899();
            class63 var3 = (class63) this.field977.method2243();
            synchronized (var3) {
                int var5 = var3.method1113(this);
                if (var5 < 0) {
                    var3.field1089 = 0;
                    this.method895(var3);
                } else {
                    var3.field1089 = var5;
                    this.method894(var3.field1875, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("an.h(I)V")
    public void method902(int arg0) {
        for (class69 var2 = (class69) this.field979.method2243(); var2 != null; var2 = (class69) this.field979.method2238()) {
            var2.method919(arg0);
        }
    }
}
