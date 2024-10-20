package deob;

@ObfuscatedName("av")
public class class49 extends class60 {

    @ObfuscatedName("av.g")
    public class178 field1074 = new class178();

    @ObfuscatedName("av.i")
    public class178 field1073 = new class178();

    @ObfuscatedName("av.k")
    public int field1072 = 0;

    @ObfuscatedName("av.e")
    public int field1075 = -1;

    @ObfuscatedName("av.g(Lbz;)V")
    public final synchronized void method940(class60 arg0) {
        this.field1074.method3203(arg0);
    }

    @ObfuscatedName("av.i(Lbz;)V")
    public final synchronized void method941(class60 arg0) {
        arg0.method3304();
    }

    @ObfuscatedName("av.k()V")
    public void method942() {
        if (this.field1072 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1073.method3200(); var1 != null; var1 = (class55) this.field1073.method3209()) {
            var1.field1129 -= this.field1072;
        }
        this.field1075 -= this.field1072;
        this.field1072 = 0;
    }

    @ObfuscatedName("av.e(Lgf;Lbu;)V")
    public void method964(class187 arg0, class55 arg1) {
        while (this.field1073.field2870 != arg0 && ((class55) arg0).field1129 <= arg1.field1129) {
            arg0 = arg0.field2886;
        }
        class178.method3204(arg1, arg0);
        this.field1075 = ((class55) this.field1073.field2870.field2886).field1129;
    }

    @ObfuscatedName("av.w(Lbu;)V")
    public void method944(class55 arg0) {
        arg0.method3304();
        arg0.method1049();
        class187 var2 = this.field1073.field2870.field2886;
        if (this.field1073.field2870 == var2) {
            this.field1075 = -1;
        } else {
            this.field1075 = ((class55) var2).field1129;
        }
    }

    @ObfuscatedName("av.m()Lbz;")
    public class60 method945() {
        return (class60) this.field1074.method3200();
    }

    @ObfuscatedName("av.u()Lbz;")
    public class60 method946() {
        return (class60) this.field1074.method3209();
    }

    @ObfuscatedName("av.j()I")
    public int method947() {
        return 0;
    }

    @ObfuscatedName("av.o([III)V")
    public final synchronized void method954(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1075 < 0) {
                this.method977(arg0, arg1, arg2);
                return;
            }
            if (this.field1072 + arg2 < this.field1075) {
                this.field1072 += arg2;
                this.method977(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1075 - this.field1072;
            this.method977(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1072 += var4;
            this.method942();
            class55 var5 = (class55) this.field1073.method3200();
            synchronized (var5) {
                int var7 = var5.method1050(this);
                if (var7 < 0) {
                    var5.field1129 = 0;
                    this.method944(var5);
                } else {
                    var5.field1129 = var7;
                    this.method964(var5.field2886, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("av.h([III)V")
    public void method977(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1074.method3200(); var4 != null; var4 = (class60) this.field1074.method3209()) {
            var4.method1212(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("av.b(I)V")
    public final synchronized void method949(int arg0) {
        do {
            if (this.field1075 < 0) {
                this.method950(arg0);
                return;
            }
            if (this.field1072 + arg0 < this.field1075) {
                this.field1072 += arg0;
                this.method950(arg0);
                return;
            }
            int var2 = this.field1075 - this.field1072;
            this.method950(var2);
            arg0 -= var2;
            this.field1072 += var2;
            this.method942();
            class55 var3 = (class55) this.field1073.method3200();
            synchronized (var3) {
                int var5 = var3.method1050(this);
                if (var5 < 0) {
                    var3.field1129 = 0;
                    this.method944(var3);
                } else {
                    var3.field1129 = var5;
                    this.method964(var3.field2886, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("av.r(I)V")
    public void method950(int arg0) {
        for (class60 var2 = (class60) this.field1074.method3200(); var2 != null; var2 = (class60) this.field1074.method3209()) {
            var2.method949(arg0);
        }
    }
}
