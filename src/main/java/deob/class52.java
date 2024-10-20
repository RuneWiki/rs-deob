package deob;

@ObfuscatedName("as")
public class class52 extends class69 {

    @ObfuscatedName("as.p")
    public class129 field977 = new class129();

    @ObfuscatedName("as.g")
    public class129 field979 = new class129();

    @ObfuscatedName("as.x")
    public int field978 = 0;

    @ObfuscatedName("as.q")
    public int field976 = -1;

    @ObfuscatedName("as.p(Lbs;)V")
    public final synchronized void method870(class69 arg0) {
        this.field977.method2233(arg0);
    }

    @ObfuscatedName("as.g(Lbs;)V")
    public final synchronized void method871(class69 arg0) {
        arg0.method2225();
    }

    @ObfuscatedName("as.x()V")
    public void method872() {
        if (this.field978 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field979.method2237(); var1 != null; var1 = (class62) this.field979.method2251()) {
            var1.field1091 -= this.field978;
        }
        this.field976 -= this.field978;
        this.field978 = 0;
    }

    @ObfuscatedName("as.q(Ldb;Lbp;)V")
    public void method873(class128 arg0, class62 arg1) {
        while (this.field979.field1886 != arg0 && ((class62) arg0).field1091 <= arg1.field1091) {
            arg0 = arg0.field1883;
        }
        class129.method2234(arg1, arg0);
        this.field976 = ((class62) this.field979.field1886.field1883).field1091;
    }

    @ObfuscatedName("as.d(Lbp;)V")
    public void method874(class62 arg0) {
        arg0.method2225();
        arg0.method1076();
        class128 var2 = this.field979.field1886.field1883;
        if (this.field979.field1886 == var2) {
            this.field976 = -1;
        } else {
            this.field976 = ((class62) var2).field1091;
        }
    }

    @ObfuscatedName("as.k()Lbs;")
    public class69 method875() {
        return (class69) this.field977.method2237();
    }

    @ObfuscatedName("as.j()Lbs;")
    public class69 method876() {
        return (class69) this.field977.method2251();
    }

    @ObfuscatedName("as.s()I")
    public int method877() {
        return 0;
    }

    @ObfuscatedName("as.o([III)V")
    public final synchronized void method878(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field976 < 0) {
                this.method879(arg0, arg1, arg2);
                return;
            }
            if (this.field978 + arg2 < this.field976) {
                this.field978 += arg2;
                this.method879(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field976 - this.field978;
            this.method879(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field978 += var4;
            this.method872();
            class62 var5 = (class62) this.field979.method2237();
            synchronized (var5) {
                int var7 = var5.method1077(this);
                if (var7 < 0) {
                    var5.field1091 = 0;
                    this.method874(var5);
                } else {
                    var5.field1091 = var7;
                    this.method873(var5.field1883, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("as.a([III)V")
    public void method879(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field977.method2237(); var4 != null; var4 = (class69) this.field977.method2251()) {
            var4.method1259(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("as.c(I)V")
    public final synchronized void method888(int arg0) {
        do {
            if (this.field976 < 0) {
                this.method881(arg0);
                return;
            }
            if (this.field978 + arg0 < this.field976) {
                this.field978 += arg0;
                this.method881(arg0);
                return;
            }
            int var2 = this.field976 - this.field978;
            this.method881(var2);
            arg0 -= var2;
            this.field978 += var2;
            this.method872();
            class62 var3 = (class62) this.field979.method2237();
            synchronized (var3) {
                int var5 = var3.method1077(this);
                if (var5 < 0) {
                    var3.field1091 = 0;
                    this.method874(var3);
                } else {
                    var3.field1091 = var5;
                    this.method873(var3.field1883, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("as.u(I)V")
    public void method881(int arg0) {
        for (class69 var2 = (class69) this.field977.method2237(); var2 != null; var2 = (class69) this.field977.method2251()) {
            var2.method888(arg0);
        }
    }
}
