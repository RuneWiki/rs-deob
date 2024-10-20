package deob;

@ObfuscatedName("aq")
public class class49 extends class60 {

    @ObfuscatedName("aq.t")
    public class177 field1069 = new class177();

    @ObfuscatedName("aq.o")
    public class177 field1068 = new class177();

    @ObfuscatedName("aq.i")
    public int field1070 = 0;

    @ObfuscatedName("aq.p")
    public int field1071 = -1;

    @ObfuscatedName("aq.t(Lbq;)V")
    public final synchronized void method935(class60 arg0) {
        this.field1069.method3167(arg0);
    }

    @ObfuscatedName("aq.o(Lbq;)V")
    public final synchronized void method936(class60 arg0) {
        arg0.method3261();
    }

    @ObfuscatedName("aq.i()V")
    public void method937() {
        if (this.field1070 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1068.method3170(); var1 != null; var1 = (class55) this.field1068.method3172()) {
            var1.field1132 -= this.field1070;
        }
        this.field1071 -= this.field1070;
        this.field1070 = 0;
    }

    @ObfuscatedName("aq.p(Lgh;Lbi;)V")
    public void method938(class186 arg0, class55 arg1) {
        while (this.field1068.field2848 != arg0 && ((class55) arg0).field1132 <= arg1.field1132) {
            arg0 = arg0.field2864;
        }
        class177.method3168(arg1, arg0);
        this.field1071 = ((class55) this.field1068.field2848.field2864).field1132;
    }

    @ObfuscatedName("aq.c(Lbi;)V")
    public void method939(class55 arg0) {
        arg0.method3261();
        arg0.method1049();
        class186 var2 = this.field1068.field2848.field2864;
        if (this.field1068.field2848 == var2) {
            this.field1071 = -1;
        } else {
            this.field1071 = ((class55) var2).field1132;
        }
    }

    @ObfuscatedName("aq.y()Lbq;")
    public class60 method940() {
        return (class60) this.field1069.method3170();
    }

    @ObfuscatedName("aq.g()Lbq;")
    public class60 method944() {
        return (class60) this.field1069.method3172();
    }

    @ObfuscatedName("aq.l()I")
    public int method942() {
        return 0;
    }

    @ObfuscatedName("aq.h([III)V")
    public final synchronized void method943(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1071 < 0) {
                this.method962(arg0, arg1, arg2);
                return;
            }
            if (this.field1070 + arg2 < this.field1071) {
                this.field1070 += arg2;
                this.method962(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1071 - this.field1070;
            this.method962(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1070 += var4;
            this.method937();
            class55 var5 = (class55) this.field1068.method3170();
            synchronized (var5) {
                int var7 = var5.method1051(this);
                if (var7 < 0) {
                    var5.field1132 = 0;
                    this.method939(var5);
                } else {
                    var5.field1132 = var7;
                    this.method938(var5.field2864, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aq.n([III)V")
    public void method962(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1069.method3170(); var4 != null; var4 = (class60) this.field1069.method3172()) {
            var4.method1222(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aq.w(I)V")
    public final synchronized void method945(int arg0) {
        do {
            if (this.field1071 < 0) {
                this.method963(arg0);
                return;
            }
            if (this.field1070 + arg0 < this.field1071) {
                this.field1070 += arg0;
                this.method963(arg0);
                return;
            }
            int var2 = this.field1071 - this.field1070;
            this.method963(var2);
            arg0 -= var2;
            this.field1070 += var2;
            this.method937();
            class55 var3 = (class55) this.field1068.method3170();
            synchronized (var3) {
                int var5 = var3.method1051(this);
                if (var5 < 0) {
                    var3.field1132 = 0;
                    this.method939(var3);
                } else {
                    var3.field1132 = var5;
                    this.method938(var3.field2864, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aq.m(I)V")
    public void method963(int arg0) {
        for (class60 var2 = (class60) this.field1069.method3170(); var2 != null; var2 = (class60) this.field1069.method3172()) {
            var2.method945(arg0);
        }
    }
}
