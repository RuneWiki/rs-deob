package deob;

@ObfuscatedName("br")
public class class56 extends class67 {

    @ObfuscatedName("br.v")
    public class199 field1169 = new class199();

    @ObfuscatedName("br.f")
    public class199 field1167 = new class199();

    @ObfuscatedName("br.i")
    public int field1168 = 0;

    @ObfuscatedName("br.d")
    public int field1166 = -1;

    @ObfuscatedName("br.v(Lbk;)V")
    public final synchronized void method1112(class67 arg0) {
        this.field1169.method3559(arg0);
    }

    @ObfuscatedName("br.f(Lbk;)V")
    public final synchronized void method1120(class67 arg0) {
        arg0.method3645();
    }

    @ObfuscatedName("br.i()V")
    public void method1114() {
        if (this.field1168 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1167.method3563(); var1 != null; var1 = (class62) this.field1167.method3565()) {
            var1.field1227 -= this.field1168;
        }
        this.field1166 -= this.field1168;
        this.field1168 = 0;
    }

    @ObfuscatedName("br.d(Lgq;Lbg;)V")
    public void method1115(class208 arg0, class62 arg1) {
        while (this.field1167.field3099 != arg0 && ((class62) arg0).field1227 <= arg1.field1227) {
            arg0 = arg0.field3116;
        }
        class199.method3560(arg1, arg0);
        this.field1166 = ((class62) this.field1167.field3099.field3116).field1227;
    }

    @ObfuscatedName("br.o(Lbg;)V")
    public void method1116(class62 arg0) {
        arg0.method3645();
        arg0.method1238();
        class208 var2 = this.field1167.field3099.field3116;
        if (this.field1167.field3099 == var2) {
            this.field1166 = -1;
        } else {
            this.field1166 = ((class62) var2).field1227;
        }
    }

    @ObfuscatedName("br.c()Lbk;")
    public class67 method1139() {
        return (class67) this.field1169.method3563();
    }

    @ObfuscatedName("br.p()Lbk;")
    public class67 method1118() {
        return (class67) this.field1169.method3565();
    }

    @ObfuscatedName("br.j()I")
    public int method1119() {
        return 0;
    }

    @ObfuscatedName("br.a([III)V")
    public final synchronized void method1149(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1166 < 0) {
                this.method1111(arg0, arg1, arg2);
                return;
            }
            if (this.field1168 + arg2 < this.field1166) {
                this.field1168 += arg2;
                this.method1111(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1166 - this.field1168;
            this.method1111(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1168 += var4;
            this.method1114();
            class62 var5 = (class62) this.field1167.method3563();
            synchronized (var5) {
                int var7 = var5.method1240(this);
                if (var7 < 0) {
                    var5.field1227 = 0;
                    this.method1116(var5);
                } else {
                    var5.field1227 = var7;
                    this.method1115(var5.field3116, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("br.y([III)V")
    public void method1111(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1169.method3563(); var4 != null; var4 = (class67) this.field1169.method3565()) {
            var4.method1407(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("br.h(I)V")
    public final synchronized void method1122(int arg0) {
        do {
            if (this.field1166 < 0) {
                this.method1123(arg0);
                return;
            }
            if (this.field1168 + arg0 < this.field1166) {
                this.field1168 += arg0;
                this.method1123(arg0);
                return;
            }
            int var2 = this.field1166 - this.field1168;
            this.method1123(var2);
            arg0 -= var2;
            this.field1168 += var2;
            this.method1114();
            class62 var3 = (class62) this.field1167.method3563();
            synchronized (var3) {
                int var5 = var3.method1240(this);
                if (var5 < 0) {
                    var3.field1227 = 0;
                    this.method1116(var3);
                } else {
                    var3.field1227 = var5;
                    this.method1115(var3.field3116, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("br.z(I)V")
    public void method1123(int arg0) {
        for (class67 var2 = (class67) this.field1169.method3563(); var2 != null; var2 = (class67) this.field1169.method3565()) {
            var2.method1122(arg0);
        }
    }
}
