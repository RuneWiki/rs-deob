package deob;

@ObfuscatedName("ak")
public class class50 extends class61 {

    @ObfuscatedName("ak.g")
    public class180 field1078 = new class180();

    @ObfuscatedName("ak.j")
    public class180 field1075 = new class180();

    @ObfuscatedName("ak.z")
    public int field1077 = 0;

    @ObfuscatedName("ak.b")
    public int field1076 = -1;

    @ObfuscatedName("ak.g(Lbr;)V")
    public final synchronized void method913(class61 arg0) {
        this.field1078.method3170(arg0);
    }

    @ObfuscatedName("ak.j(Lbr;)V")
    public final synchronized void method918(class61 arg0) {
        arg0.method3259();
    }

    @ObfuscatedName("ak.z()V")
    public void method915() {
        if (this.field1077 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field1075.method3174(); var1 != null; var1 = (class56) this.field1075.method3176()) {
            var1.field1136 -= this.field1077;
        }
        this.field1076 -= this.field1077;
        this.field1077 = 0;
    }

    @ObfuscatedName("ak.b(Lgn;Lbt;)V")
    public void method916(class189 arg0, class56 arg1) {
        while (this.field1075.field2870 != arg0 && ((class56) arg0).field1136 <= arg1.field1136) {
            arg0 = arg0.field2886;
        }
        class180.method3189(arg1, arg0);
        this.field1076 = ((class56) this.field1075.field2870.field2886).field1136;
    }

    @ObfuscatedName("ak.k(Lbt;)V")
    public void method917(class56 arg0) {
        arg0.method3259();
        arg0.method1037();
        class189 var2 = this.field1075.field2870.field2886;
        if (this.field1075.field2870 == var2) {
            this.field1076 = -1;
        } else {
            this.field1076 = ((class56) var2).field1136;
        }
    }

    @ObfuscatedName("ak.c()Lbr;")
    public class61 method936() {
        return (class61) this.field1078.method3174();
    }

    @ObfuscatedName("ak.w()Lbr;")
    public class61 method919() {
        return (class61) this.field1078.method3176();
    }

    @ObfuscatedName("ak.l()I")
    public int method914() {
        return 0;
    }

    @ObfuscatedName("ak.n([III)V")
    public final synchronized void method912(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1076 < 0) {
                this.method922(arg0, arg1, arg2);
                return;
            }
            if (this.field1077 + arg2 < this.field1076) {
                this.field1077 += arg2;
                this.method922(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1076 - this.field1077;
            this.method922(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1077 += var4;
            this.method915();
            class56 var5 = (class56) this.field1075.method3174();
            synchronized (var5) {
                int var7 = var5.method1038(this);
                if (var7 < 0) {
                    var5.field1136 = 0;
                    this.method917(var5);
                } else {
                    var5.field1136 = var7;
                    this.method916(var5.field2886, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ak.d([III)V")
    public void method922(int[] arg0, int arg1, int arg2) {
        for (class61 var4 = (class61) this.field1078.method3174(); var4 != null; var4 = (class61) this.field1078.method3176()) {
            var4.method1192(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ak.h(I)V")
    public final synchronized void method949(int arg0) {
        do {
            if (this.field1076 < 0) {
                this.method924(arg0);
                return;
            }
            if (this.field1077 + arg0 < this.field1076) {
                this.field1077 += arg0;
                this.method924(arg0);
                return;
            }
            int var2 = this.field1076 - this.field1077;
            this.method924(var2);
            arg0 -= var2;
            this.field1077 += var2;
            this.method915();
            class56 var3 = (class56) this.field1075.method3174();
            synchronized (var3) {
                int var5 = var3.method1038(this);
                if (var5 < 0) {
                    var3.field1136 = 0;
                    this.method917(var3);
                } else {
                    var3.field1136 = var5;
                    this.method916(var3.field2886, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ak.y(I)V")
    public void method924(int arg0) {
        for (class61 var2 = (class61) this.field1078.method3174(); var2 != null; var2 = (class61) this.field1078.method3176()) {
            var2.method949(arg0);
        }
    }
}
