package deob;

@ObfuscatedName("ag")
public class class46 extends class48 {

    @ObfuscatedName("ag.t")
    public class177 field1094 = new class177();

    @ObfuscatedName("ag.l")
    public class177 field1095 = new class177();

    @ObfuscatedName("ag.c")
    public int field1096 = 0;

    @ObfuscatedName("ag.d")
    public int field1097 = -1;

    @ObfuscatedName("ag.t(Lai;)V")
    public final synchronized void method1123(class48 arg0) {
        this.field1094.method3318(arg0);
    }

    @ObfuscatedName("ag.l(Lai;)V")
    public final synchronized void method1137(class48 arg0) {
        arg0.method3361();
    }

    @ObfuscatedName("ag.d()V")
    public void method1124() {
        if (this.field1096 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1095.method3345(); var1 != null; var1 = (class61) this.field1095.method3324()) {
            var1.field1260 -= this.field1096;
        }
        this.field1097 -= this.field1096;
        this.field1096 = 0;
    }

    @ObfuscatedName("ag.b(Lfu;Lbm;)V")
    public void method1142(class179 arg0, class61 arg1) {
        while (this.field1095.field2815 != arg0 && ((class61) arg0).field1260 <= arg1.field1260) {
            arg0 = arg0.field2819;
        }
        class177.method3319(arg1, arg0);
        this.field1097 = ((class61) this.field1095.field2815.field2819).field1260;
    }

    @ObfuscatedName("ag.i(Lbm;)V")
    public void method1125(class61 arg0) {
        arg0.method3361();
        arg0.method1315();
        class179 var2 = this.field1095.field2815.field2819;
        if (this.field1095.field2815 == var2) {
            this.field1097 = -1;
        } else {
            this.field1097 = ((class61) var2).field1260;
        }
    }

    @ObfuscatedName("ag.a()Lai;")
    public class48 method1033() {
        return (class48) this.field1094.method3345();
    }

    @ObfuscatedName("ag.n()Lai;")
    public class48 method1005() {
        return (class48) this.field1094.method3324();
    }

    @ObfuscatedName("ag.v()I")
    public int method999() {
        return 0;
    }

    @ObfuscatedName("ag.e([III)V")
    public final synchronized void method1000(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1097 < 0) {
                this.method1128(arg0, arg1, arg2);
                return;
            }
            if (this.field1096 + arg2 < this.field1097) {
                this.field1096 += arg2;
                this.method1128(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1097 - this.field1096;
            this.method1128(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1096 += var4;
            this.method1124();
            class61 var5 = (class61) this.field1095.method3345();
            synchronized (var5) {
                int var7 = var5.method1318(this);
                if (var7 < 0) {
                    var5.field1260 = 0;
                    this.method1125(var5);
                } else {
                    var5.field1260 = var7;
                    this.method1142(var5.field2819, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ag.p([III)V")
    public void method1128(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1094.method3345(); var4 != null; var4 = (class48) this.field1094.method3324()) {
            var4.method1143(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ag.ar(I)V")
    public final synchronized void method1031(int arg0) {
        do {
            if (this.field1097 < 0) {
                this.method1132(arg0);
                return;
            }
            if (this.field1096 + arg0 < this.field1097) {
                this.field1096 += arg0;
                this.method1132(arg0);
                return;
            }
            int var2 = this.field1097 - this.field1096;
            this.method1132(var2);
            arg0 -= var2;
            this.field1096 += var2;
            this.method1124();
            class61 var3 = (class61) this.field1095.method3345();
            synchronized (var3) {
                int var5 = var3.method1318(this);
                if (var5 < 0) {
                    var3.field1260 = 0;
                    this.method1125(var3);
                } else {
                    var3.field1260 = var5;
                    this.method1142(var3.field2819, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ag.y(I)V")
    public void method1132(int arg0) {
        for (class48 var2 = (class48) this.field1094.method3345(); var2 != null; var2 = (class48) this.field1094.method3324()) {
            var2.method1031(arg0);
        }
    }
}
