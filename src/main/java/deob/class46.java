package deob;

@ObfuscatedName("al")
public class class46 extends class48 {

    @ObfuscatedName("al.p")
    public class177 field1065 = new class177();

    @ObfuscatedName("al.i")
    public class177 field1066 = new class177();

    @ObfuscatedName("al.o")
    public int field1067 = 0;

    @ObfuscatedName("al.n")
    public int field1068 = -1;

    @ObfuscatedName("al.p(Law;)V")
    public final synchronized void method1134(class48 arg0) {
        this.field1065.method3332(arg0);
    }

    @ObfuscatedName("al.i(Law;)V")
    public final synchronized void method1135(class48 arg0) {
        arg0.method3360();
    }

    @ObfuscatedName("al.n()V")
    public void method1136() {
        if (this.field1067 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1066.method3334(); var1 != null; var1 = (class61) this.field1066.method3355()) {
            var1.field1230 -= this.field1067;
        }
        this.field1068 -= this.field1067;
        this.field1067 = 0;
    }

    @ObfuscatedName("al.l(Lfi;Lbv;)V")
    public void method1137(class179 arg0, class61 arg1) {
        while (this.field1066.field2816 != arg0 && ((class61) arg0).field1230 <= arg1.field1230) {
            arg0 = arg0.field2821;
        }
        class177.method3330(arg1, arg0);
        this.field1068 = ((class61) this.field1066.field2816.field2821).field1230;
    }

    @ObfuscatedName("al.v(Lbv;)V")
    public void method1157(class61 arg0) {
        arg0.method3360();
        arg0.method1332();
        class179 var2 = this.field1066.field2816.field2821;
        if (this.field1066.field2816 == var2) {
            this.field1068 = -1;
        } else {
            this.field1068 = ((class61) var2).field1230;
        }
    }

    @ObfuscatedName("al.y()Law;")
    public class48 method990() {
        return (class48) this.field1065.method3334();
    }

    @ObfuscatedName("al.t()Law;")
    public class48 method989() {
        return (class48) this.field1065.method3355();
    }

    @ObfuscatedName("al.k()I")
    public int method1046() {
        return 0;
    }

    @ObfuscatedName("al.z([III)V")
    public final synchronized void method1044(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1068 < 0) {
                this.method1142(arg0, arg1, arg2);
                return;
            }
            if (this.field1067 + arg2 < this.field1068) {
                this.field1067 += arg2;
                this.method1142(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1068 - this.field1067;
            this.method1142(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1067 += var4;
            this.method1136();
            class61 var5 = (class61) this.field1066.method3334();
            synchronized (var5) {
                int var7 = var5.method1330(this);
                if (var7 < 0) {
                    var5.field1230 = 0;
                    this.method1157(var5);
                } else {
                    var5.field1230 = var7;
                    this.method1137(var5.field2821, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("al.g([III)V")
    public void method1142(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1065.method3334(); var4 != null; var4 = (class48) this.field1065.method3355()) {
            var4.method1162(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("al.at(I)V")
    public final synchronized void method988(int arg0) {
        do {
            if (this.field1068 < 0) {
                this.method1143(arg0);
                return;
            }
            if (this.field1067 + arg0 < this.field1068) {
                this.field1067 += arg0;
                this.method1143(arg0);
                return;
            }
            int var2 = this.field1068 - this.field1067;
            this.method1143(var2);
            arg0 -= var2;
            this.field1067 += var2;
            this.method1136();
            class61 var3 = (class61) this.field1066.method3334();
            synchronized (var3) {
                int var5 = var3.method1330(this);
                if (var5 < 0) {
                    var3.field1230 = 0;
                    this.method1157(var3);
                } else {
                    var3.field1230 = var5;
                    this.method1137(var3.field2821, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("al.x(I)V")
    public void method1143(int arg0) {
        for (class48 var2 = (class48) this.field1065.method3334(); var2 != null; var2 = (class48) this.field1065.method3355()) {
            var2.method988(arg0);
        }
    }
}
