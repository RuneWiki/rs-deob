package deob;

@ObfuscatedName("at")
public class class50 extends class61 {

    @ObfuscatedName("at.l")
    public class180 field1068 = new class180();

    @ObfuscatedName("at.y")
    public class180 field1066 = new class180();

    @ObfuscatedName("at.g")
    public int field1067 = 0;

    @ObfuscatedName("at.j")
    public int field1065 = -1;

    @ObfuscatedName("at.l(Lbc;)V")
    public final synchronized void method957(class61 arg0) {
        this.field1068.method3290(arg0);
    }

    @ObfuscatedName("at.y(Lbc;)V")
    public final synchronized void method949(class61 arg0) {
        arg0.method3375();
    }

    @ObfuscatedName("at.g()V")
    public void method950() {
        if (this.field1067 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field1066.method3304(); var1 != null; var1 = (class56) this.field1066.method3297()) {
            var1.field1125 -= this.field1067;
        }
        this.field1065 -= this.field1067;
        this.field1067 = 0;
    }

    @ObfuscatedName("at.j(Lgv;Lbv;)V")
    public void method951(class189 arg0, class56 arg1) {
        while (this.field1066.field2870 != arg0 && ((class56) arg0).field1125 <= arg1.field1125) {
            arg0 = arg0.field2885;
        }
        class180.method3279(arg1, arg0);
        this.field1065 = ((class56) this.field1066.field2870.field2885).field1125;
    }

    @ObfuscatedName("at.w(Lbv;)V")
    public void method952(class56 arg0) {
        arg0.method3375();
        arg0.method1066();
        class189 var2 = this.field1066.field2870.field2885;
        if (this.field1066.field2870 == var2) {
            this.field1065 = -1;
        } else {
            this.field1065 = ((class56) var2).field1125;
        }
    }

    @ObfuscatedName("at.c()Lbc;")
    public class61 method953() {
        return (class61) this.field1068.method3304();
    }

    @ObfuscatedName("at.x()Lbc;")
    public class61 method954() {
        return (class61) this.field1068.method3297();
    }

    @ObfuscatedName("at.f()I")
    public int method955() {
        return 0;
    }

    @ObfuscatedName("at.t([III)V")
    public final synchronized void method978(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1065 < 0) {
                this.method967(arg0, arg1, arg2);
                return;
            }
            if (this.field1067 + arg2 < this.field1065) {
                this.field1067 += arg2;
                this.method967(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1065 - this.field1067;
            this.method967(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1067 += var4;
            this.method950();
            class56 var5 = (class56) this.field1066.method3304();
            synchronized (var5) {
                int var7 = var5.method1064(this);
                if (var7 < 0) {
                    var5.field1125 = 0;
                    this.method952(var5);
                } else {
                    var5.field1125 = var7;
                    this.method951(var5.field2885, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("at.n([III)V")
    public void method967(int[] arg0, int arg1, int arg2) {
        for (class61 var4 = (class61) this.field1068.method3304(); var4 != null; var4 = (class61) this.field1068.method3297()) {
            var4.method1242(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("at.p(I)V")
    public final synchronized void method958(int arg0) {
        do {
            if (this.field1065 < 0) {
                this.method970(arg0);
                return;
            }
            if (this.field1067 + arg0 < this.field1065) {
                this.field1067 += arg0;
                this.method970(arg0);
                return;
            }
            int var2 = this.field1065 - this.field1067;
            this.method970(var2);
            arg0 -= var2;
            this.field1067 += var2;
            this.method950();
            class56 var3 = (class56) this.field1066.method3304();
            synchronized (var3) {
                int var5 = var3.method1064(this);
                if (var5 < 0) {
                    var3.field1125 = 0;
                    this.method952(var3);
                } else {
                    var3.field1125 = var5;
                    this.method951(var3.field2885, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("at.a(I)V")
    public void method970(int arg0) {
        for (class61 var2 = (class61) this.field1068.method3304(); var2 != null; var2 = (class61) this.field1068.method3297()) {
            var2.method958(arg0);
        }
    }
}
