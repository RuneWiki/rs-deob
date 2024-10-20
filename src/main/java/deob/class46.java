package deob;

@ObfuscatedName("ac")
public class class46 extends class48 {

    @ObfuscatedName("ac.b")
    public class177 field1049 = new class177();

    @ObfuscatedName("ac.e")
    public class177 field1048 = new class177();

    @ObfuscatedName("ac.g")
    public int field1050 = 0;

    @ObfuscatedName("ac.o")
    public int field1051 = -1;

    @ObfuscatedName("ac.b(Lai;)V")
    public final synchronized void method1084(class48 arg0) {
        this.field1049.method3310(arg0);
    }

    @ObfuscatedName("ac.e(Lai;)V")
    public final synchronized void method1080(class48 arg0) {
        arg0.method3341();
    }

    @ObfuscatedName("ac.o()V")
    public void method1078() {
        if (this.field1050 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1048.method3314(); var1 != null; var1 = (class61) this.field1048.method3325()) {
            var1.field1212 -= this.field1050;
        }
        this.field1051 -= this.field1050;
        this.field1050 = 0;
    }

    @ObfuscatedName("ac.a(Lfc;Lbo;)V")
    public void method1081(class179 arg0, class61 arg1) {
        while (this.field1048.field2807 != arg0 && ((class61) arg0).field1212 <= arg1.field1212) {
            arg0 = arg0.field2811;
        }
        class177.method3311(arg1, arg0);
        this.field1051 = ((class61) this.field1048.field2807.field2811).field1212;
    }

    @ObfuscatedName("ac.h(Lbo;)V")
    public void method1097(class61 arg0) {
        arg0.method3341();
        arg0.method1285();
        class179 var2 = this.field1048.field2807.field2811;
        if (this.field1048.field2807 == var2) {
            this.field1051 = -1;
        } else {
            this.field1051 = ((class61) var2).field1212;
        }
    }

    @ObfuscatedName("ac.m()Lai;")
    public class48 method942() {
        return (class48) this.field1049.method3314();
    }

    @ObfuscatedName("ac.c()Lai;")
    public class48 method943() {
        return (class48) this.field1049.method3325();
    }

    @ObfuscatedName("ac.i()I")
    public int method957() {
        return 0;
    }

    @ObfuscatedName("ac.u([III)V")
    public final synchronized void method984(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1051 < 0) {
                this.method1086(arg0, arg1, arg2);
                return;
            }
            if (this.field1050 + arg2 < this.field1051) {
                this.field1050 += arg2;
                this.method1086(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1051 - this.field1050;
            this.method1086(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1050 += var4;
            this.method1078();
            class61 var5 = (class61) this.field1048.method3314();
            synchronized (var5) {
                int var7 = var5.method1286(this);
                if (var7 < 0) {
                    var5.field1212 = 0;
                    this.method1097(var5);
                } else {
                    var5.field1212 = var7;
                    this.method1081(var5.field2811, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ac.j([III)V")
    public void method1086(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1049.method3314(); var4 != null; var4 = (class48) this.field1049.method3325()) {
            var4.method1102(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ac.at(I)V")
    public final synchronized void method945(int arg0) {
        do {
            if (this.field1051 < 0) {
                this.method1088(arg0);
                return;
            }
            if (this.field1050 + arg0 < this.field1051) {
                this.field1050 += arg0;
                this.method1088(arg0);
                return;
            }
            int var2 = this.field1051 - this.field1050;
            this.method1088(var2);
            arg0 -= var2;
            this.field1050 += var2;
            this.method1078();
            class61 var3 = (class61) this.field1048.method3314();
            synchronized (var3) {
                int var5 = var3.method1286(this);
                if (var5 < 0) {
                    var3.field1212 = 0;
                    this.method1097(var3);
                } else {
                    var3.field1212 = var5;
                    this.method1081(var3.field2811, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ac.f(I)V")
    public void method1088(int arg0) {
        for (class48 var2 = (class48) this.field1049.method3314(); var2 != null; var2 = (class48) this.field1049.method3325()) {
            var2.method945(arg0);
        }
    }
}
