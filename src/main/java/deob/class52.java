package deob;

@ObfuscatedName("ag")
public class class52 extends class69 {

    @ObfuscatedName("ag.i")
    public class129 field977 = new class129();

    @ObfuscatedName("ag.e")
    public class129 field976 = new class129();

    @ObfuscatedName("ag.f")
    public int field978 = 0;

    @ObfuscatedName("ag.k")
    public int field975 = -1;

    @ObfuscatedName("ag.i(Lbg;)V")
    public final synchronized void method865(class69 arg0) {
        this.field977.method2205(arg0);
    }

    @ObfuscatedName("ag.e(Lbg;)V")
    public final synchronized void method894(class69 arg0) {
        arg0.method2200();
    }

    @ObfuscatedName("ag.f()V")
    public void method867() {
        if (this.field978 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field976.method2209(); var1 != null; var1 = (class62) this.field976.method2211()) {
            var1.field1088 -= this.field978;
        }
        this.field975 -= this.field978;
        this.field978 = 0;
    }

    @ObfuscatedName("ag.k(Ldg;Lbk;)V")
    public void method864(class128 arg0, class62 arg1) {
        while (this.field976.field1880 != arg0 && ((class62) arg0).field1088 <= arg1.field1088) {
            arg0 = arg0.field1877;
        }
        class129.method2206(arg1, arg0);
        this.field975 = ((class62) this.field976.field1880.field1877).field1088;
    }

    @ObfuscatedName("ag.a(Lbk;)V")
    public void method869(class62 arg0) {
        arg0.method2200();
        arg0.method1090();
        class128 var2 = this.field976.field1880.field1877;
        if (this.field976.field1880 == var2) {
            this.field975 = -1;
        } else {
            this.field975 = ((class62) var2).field1088;
        }
    }

    @ObfuscatedName("ag.q()Lbg;")
    public class69 method868() {
        return (class69) this.field977.method2209();
    }

    @ObfuscatedName("ag.w()Lbg;")
    public class69 method871() {
        return (class69) this.field977.method2211();
    }

    @ObfuscatedName("ag.v()I")
    public int method872() {
        return 0;
    }

    @ObfuscatedName("ag.h([III)V")
    public final synchronized void method873(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field975 < 0) {
                this.method874(arg0, arg1, arg2);
                return;
            }
            if (this.field978 + arg2 < this.field975) {
                this.field978 += arg2;
                this.method874(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field975 - this.field978;
            this.method874(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field978 += var4;
            this.method867();
            class62 var5 = (class62) this.field976.method2209();
            synchronized (var5) {
                int var7 = var5.method1088(this);
                if (var7 < 0) {
                    var5.field1088 = 0;
                    this.method869(var5);
                } else {
                    var5.field1088 = var7;
                    this.method864(var5.field1877, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ag.p([III)V")
    public void method874(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field977.method2209(); var4 != null; var4 = (class69) this.field977.method2211()) {
            var4.method1263(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ag.l(I)V")
    public final synchronized void method875(int arg0) {
        do {
            if (this.field975 < 0) {
                this.method876(arg0);
                return;
            }
            if (this.field978 + arg0 < this.field975) {
                this.field978 += arg0;
                this.method876(arg0);
                return;
            }
            int var2 = this.field975 - this.field978;
            this.method876(var2);
            arg0 -= var2;
            this.field978 += var2;
            this.method867();
            class62 var3 = (class62) this.field976.method2209();
            synchronized (var3) {
                int var5 = var3.method1088(this);
                if (var5 < 0) {
                    var3.field1088 = 0;
                    this.method869(var3);
                } else {
                    var3.field1088 = var5;
                    this.method864(var3.field1877, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ag.c(I)V")
    public void method876(int arg0) {
        for (class69 var2 = (class69) this.field977.method2209(); var2 != null; var2 = (class69) this.field977.method2211()) {
            var2.method875(arg0);
        }
    }
}
