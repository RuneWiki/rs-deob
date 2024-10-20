package deob;

@ObfuscatedName("aq")
public class class52 extends class69 {

    @ObfuscatedName("aq.b")
    public class129 field964 = new class129();

    @ObfuscatedName("aq.l")
    public class129 field962 = new class129();

    @ObfuscatedName("aq.i")
    public int field963 = 0;

    @ObfuscatedName("aq.t")
    public int field961 = -1;

    @ObfuscatedName("aq.b(Lbq;)V")
    public final synchronized void method964(class69 arg0) {
        this.field964.method2322(arg0);
    }

    @ObfuscatedName("aq.l(Lbq;)V")
    public final synchronized void method965(class69 arg0) {
        arg0.method2313();
    }

    @ObfuscatedName("aq.i()V")
    public void method966() {
        if (this.field963 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field962.method2324(); var1 != null; var1 = (class62) this.field962.method2331()) {
            var1.field1072 -= this.field963;
        }
        this.field961 -= this.field963;
        this.field963 = 0;
    }

    @ObfuscatedName("aq.t(Ldz;Lbm;)V")
    public void method968(class128 arg0, class62 arg1) {
        while (this.field962.field1881 != arg0 && ((class62) arg0).field1072 <= arg1.field1072) {
            arg0 = arg0.field1877;
        }
        class129.method2321(arg1, arg0);
        this.field961 = ((class62) this.field962.field1881.field1877).field1072;
    }

    @ObfuscatedName("aq.k(Lbm;)V")
    public void method992(class62 arg0) {
        arg0.method2313();
        arg0.method1165();
        class128 var2 = this.field962.field1881.field1877;
        if (this.field962.field1881 == var2) {
            this.field961 = -1;
        } else {
            this.field961 = ((class62) var2).field1072;
        }
    }

    @ObfuscatedName("aq.x()Lbq;")
    public class69 method996() {
        return (class69) this.field964.method2324();
    }

    @ObfuscatedName("aq.z()Lbq;")
    public class69 method970() {
        return (class69) this.field964.method2331();
    }

    @ObfuscatedName("aq.p()I")
    public int method971() {
        return 0;
    }

    @ObfuscatedName("aq.s([III)V")
    public final synchronized void method985(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field961 < 0) {
                this.method973(arg0, arg1, arg2);
                return;
            }
            if (this.field963 + arg2 < this.field961) {
                this.field963 += arg2;
                this.method973(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field961 - this.field963;
            this.method973(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field963 += var4;
            this.method966();
            class62 var5 = (class62) this.field962.method2324();
            synchronized (var5) {
                int var7 = var5.method1167(this);
                if (var7 < 0) {
                    var5.field1072 = 0;
                    this.method992(var5);
                } else {
                    var5.field1072 = var7;
                    this.method968(var5.field1877, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aq.o([III)V")
    public void method973(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field964.method2324(); var4 != null; var4 = (class69) this.field964.method2331()) {
            var4.method1337(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aq.y(I)V")
    public final synchronized void method974(int arg0) {
        do {
            if (this.field961 < 0) {
                this.method997(arg0);
                return;
            }
            if (this.field963 + arg0 < this.field961) {
                this.field963 += arg0;
                this.method997(arg0);
                return;
            }
            int var2 = this.field961 - this.field963;
            this.method997(var2);
            arg0 -= var2;
            this.field963 += var2;
            this.method966();
            class62 var3 = (class62) this.field962.method2324();
            synchronized (var3) {
                int var5 = var3.method1167(this);
                if (var5 < 0) {
                    var3.field1072 = 0;
                    this.method992(var3);
                } else {
                    var3.field1072 = var5;
                    this.method968(var3.field1877, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aq.w(I)V")
    public void method997(int arg0) {
        for (class69 var2 = (class69) this.field964.method2324(); var2 != null; var2 = (class69) this.field964.method2331()) {
            var2.method974(arg0);
        }
    }
}
