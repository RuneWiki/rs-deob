package deob;

@ObfuscatedName("aa")
public class class50 extends class61 {

    @ObfuscatedName("aa.v")
    public class182 field1069 = new class182();

    @ObfuscatedName("aa.t")
    public class182 field1070 = new class182();

    @ObfuscatedName("aa.f")
    public int field1071 = 0;

    @ObfuscatedName("aa.j")
    public int field1072 = -1;

    @ObfuscatedName("aa.v(Lbc;)V")
    public final synchronized void method950(class61 arg0) {
        this.field1069.method3300(arg0);
    }

    @ObfuscatedName("aa.t(Lbc;)V")
    public final synchronized void method976(class61 arg0) {
        arg0.method3392();
    }

    @ObfuscatedName("aa.f()V")
    public void method992() {
        if (this.field1071 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field1070.method3303(); var1 != null; var1 = (class56) this.field1070.method3305()) {
            var1.field1128 -= this.field1071;
        }
        this.field1072 -= this.field1071;
        this.field1071 = 0;
    }

    @ObfuscatedName("aa.j(Lgu;Lbi;)V")
    public void method971(class191 arg0, class56 arg1) {
        while (this.field1070.field2895 != arg0 && ((class56) arg0).field1128 <= arg1.field1128) {
            arg0 = arg0.field2912;
        }
        class182.method3301(arg1, arg0);
        this.field1072 = ((class56) this.field1070.field2895.field2912).field1128;
    }

    @ObfuscatedName("aa.l(Lbi;)V")
    public void method969(class56 arg0) {
        arg0.method3392();
        arg0.method1082();
        class191 var2 = this.field1070.field2895.field2912;
        if (this.field1070.field2895 == var2) {
            this.field1072 = -1;
        } else {
            this.field1072 = ((class56) var2).field1128;
        }
    }

    @ObfuscatedName("aa.g()Lbc;")
    public class61 method958() {
        return (class61) this.field1069.method3303();
    }

    @ObfuscatedName("aa.k()Lbc;")
    public class61 method956() {
        return (class61) this.field1069.method3305();
    }

    @ObfuscatedName("aa.p()I")
    public int method957() {
        return 0;
    }

    @ObfuscatedName("aa.y([III)V")
    public final synchronized void method949(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1072 < 0) {
                this.method959(arg0, arg1, arg2);
                return;
            }
            if (this.field1071 + arg2 < this.field1072) {
                this.field1071 += arg2;
                this.method959(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1072 - this.field1071;
            this.method959(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1071 += var4;
            this.method992();
            class56 var5 = (class56) this.field1070.method3303();
            synchronized (var5) {
                int var7 = var5.method1083(this);
                if (var7 < 0) {
                    var5.field1128 = 0;
                    this.method969(var5);
                } else {
                    var5.field1128 = var7;
                    this.method971(var5.field2912, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aa.m([III)V")
    public void method959(int[] arg0, int arg1, int arg2) {
        for (class61 var4 = (class61) this.field1069.method3303(); var4 != null; var4 = (class61) this.field1069.method3305()) {
            var4.method1247(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aa.o(I)V")
    public final synchronized void method960(int arg0) {
        do {
            if (this.field1072 < 0) {
                this.method961(arg0);
                return;
            }
            if (this.field1071 + arg0 < this.field1072) {
                this.field1071 += arg0;
                this.method961(arg0);
                return;
            }
            int var2 = this.field1072 - this.field1071;
            this.method961(var2);
            arg0 -= var2;
            this.field1071 += var2;
            this.method992();
            class56 var3 = (class56) this.field1070.method3303();
            synchronized (var3) {
                int var5 = var3.method1083(this);
                if (var5 < 0) {
                    var3.field1128 = 0;
                    this.method969(var3);
                } else {
                    var3.field1128 = var5;
                    this.method971(var3.field2912, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aa.c(I)V")
    public void method961(int arg0) {
        for (class61 var2 = (class61) this.field1069.method3303(); var2 != null; var2 = (class61) this.field1069.method3305()) {
            var2.method960(arg0);
        }
    }
}
