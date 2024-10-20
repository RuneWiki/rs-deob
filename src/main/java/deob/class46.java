package deob;

@ObfuscatedName("az")
public class class46 extends class48 {

    @ObfuscatedName("az.l")
    public class178 field1054 = new class178();

    @ObfuscatedName("az.b")
    public class178 field1055 = new class178();

    @ObfuscatedName("az.o")
    public int field1056 = 0;

    @ObfuscatedName("az.r")
    public int field1057 = -1;

    @ObfuscatedName("az.l(Las;)V")
    public final synchronized void method1101(class48 arg0) {
        this.field1054.method3322(arg0);
    }

    @ObfuscatedName("az.b(Las;)V")
    public final synchronized void method1102(class48 arg0) {
        arg0.method3360();
    }

    @ObfuscatedName("az.w()V")
    public void method1115() {
        if (this.field1056 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1055.method3343(); var1 != null; var1 = (class61) this.field1055.method3328()) {
            var1.field1216 -= this.field1056;
        }
        this.field1057 -= this.field1056;
        this.field1056 = 0;
    }

    @ObfuscatedName("az.r(Lfm;Lbj;)V")
    public void method1124(class180 arg0, class61 arg1) {
        while (this.field1055.field2832 != arg0 && ((class61) arg0).field1216 <= arg1.field1216) {
            arg0 = arg0.field2836;
        }
        class178.method3323(arg1, arg0);
        this.field1057 = ((class61) this.field1055.field2832.field2836).field1216;
    }

    @ObfuscatedName("az.k(Lbj;)V")
    public void method1103(class61 arg0) {
        arg0.method3360();
        arg0.method1313();
        class180 var2 = this.field1055.field2832.field2836;
        if (this.field1055.field2832 == var2) {
            this.field1057 = -1;
        } else {
            this.field1057 = ((class61) var2).field1216;
        }
    }

    @ObfuscatedName("az.h()Las;")
    public class48 method963() {
        return (class48) this.field1054.method3343();
    }

    @ObfuscatedName("az.f()Las;")
    public class48 method1090() {
        return (class48) this.field1054.method3328();
    }

    @ObfuscatedName("az.t()I")
    public int method965() {
        return 0;
    }

    @ObfuscatedName("az.x([III)V")
    public final synchronized void method1095(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1057 < 0) {
                this.method1106(arg0, arg1, arg2);
                return;
            }
            if (this.field1056 + arg2 < this.field1057) {
                this.field1056 += arg2;
                this.method1106(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1057 - this.field1056;
            this.method1106(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1056 += var4;
            this.method1115();
            class61 var5 = (class61) this.field1055.method3343();
            synchronized (var5) {
                int var7 = var5.method1314(this);
                if (var7 < 0) {
                    var5.field1216 = 0;
                    this.method1103(var5);
                } else {
                    var5.field1216 = var7;
                    this.method1124(var5.field2836, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("az.z([III)V")
    public void method1106(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1054.method3343(); var4 != null; var4 = (class48) this.field1054.method3328()) {
            var4.method1127(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("az.ar(I)V")
    public final synchronized void method967(int arg0) {
        do {
            if (this.field1057 < 0) {
                this.method1118(arg0);
                return;
            }
            if (this.field1056 + arg0 < this.field1057) {
                this.field1056 += arg0;
                this.method1118(arg0);
                return;
            }
            int var2 = this.field1057 - this.field1056;
            this.method1118(var2);
            arg0 -= var2;
            this.field1056 += var2;
            this.method1115();
            class61 var3 = (class61) this.field1055.method3343();
            synchronized (var3) {
                int var5 = var3.method1314(this);
                if (var5 < 0) {
                    var3.field1216 = 0;
                    this.method1103(var3);
                } else {
                    var3.field1216 = var5;
                    this.method1124(var3.field2836, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("az.g(I)V")
    public void method1118(int arg0) {
        for (class48 var2 = (class48) this.field1054.method3343(); var2 != null; var2 = (class48) this.field1054.method3328()) {
            var2.method967(arg0);
        }
    }
}
