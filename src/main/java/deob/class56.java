package deob;

@ObfuscatedName("bh")
public class class56 extends class67 {

    @ObfuscatedName("bh.n")
    public class199 field1166 = new class199();

    @ObfuscatedName("bh.q")
    public class199 field1167 = new class199();

    @ObfuscatedName("bh.c")
    public int field1168 = 0;

    @ObfuscatedName("bh.l")
    public int field1169 = -1;

    @ObfuscatedName("bh.n(Lbu;)V")
    public final synchronized void method1132(class67 arg0) {
        this.field1166.method3554(arg0);
    }

    @ObfuscatedName("bh.q(Lbu;)V")
    public final synchronized void method1133(class67 arg0) {
        arg0.method3651();
    }

    @ObfuscatedName("bh.c()V")
    public void method1173() {
        if (this.field1168 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1167.method3549(); var1 != null; var1 = (class62) this.field1167.method3550()) {
            var1.field1222 -= this.field1168;
        }
        this.field1169 -= this.field1168;
        this.field1168 = 0;
    }

    @ObfuscatedName("bh.l(Lga;Lbl;)V")
    public void method1135(class208 arg0, class62 arg1) {
        while (this.field1167.field3095 != arg0 && ((class62) arg0).field1222 <= arg1.field1222) {
            arg0 = arg0.field3110;
        }
        class199.method3553(arg1, arg0);
        this.field1169 = ((class62) this.field1167.field3095.field3110).field1222;
    }

    @ObfuscatedName("bh.r(Lbl;)V")
    public void method1136(class62 arg0) {
        arg0.method3651();
        arg0.method1262();
        class208 var2 = this.field1167.field3095.field3110;
        if (this.field1167.field3095 == var2) {
            this.field1169 = -1;
        } else {
            this.field1169 = ((class62) var2).field1222;
        }
    }

    @ObfuscatedName("bh.u()Lbu;")
    public class67 method1146() {
        return (class67) this.field1166.method3549();
    }

    @ObfuscatedName("bh.j()Lbu;")
    public class67 method1138() {
        return (class67) this.field1166.method3550();
    }

    @ObfuscatedName("bh.w()I")
    public int method1139() {
        return 0;
    }

    @ObfuscatedName("bh.y([III)V")
    public final synchronized void method1140(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1169 < 0) {
                this.method1143(arg0, arg1, arg2);
                return;
            }
            if (this.field1168 + arg2 < this.field1169) {
                this.field1168 += arg2;
                this.method1143(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1169 - this.field1168;
            this.method1143(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1168 += var4;
            this.method1173();
            class62 var5 = (class62) this.field1167.method3549();
            synchronized (var5) {
                int var7 = var5.method1261(this);
                if (var7 < 0) {
                    var5.field1222 = 0;
                    this.method1136(var5);
                } else {
                    var5.field1222 = var7;
                    this.method1135(var5.field3110, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bh.o([III)V")
    public void method1143(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1166.method3549(); var4 != null; var4 = (class67) this.field1166.method3550()) {
            var4.method1418(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bh.h(I)V")
    public final synchronized void method1142(int arg0) {
        do {
            if (this.field1169 < 0) {
                this.method1148(arg0);
                return;
            }
            if (this.field1168 + arg0 < this.field1169) {
                this.field1168 += arg0;
                this.method1148(arg0);
                return;
            }
            int var2 = this.field1169 - this.field1168;
            this.method1148(var2);
            arg0 -= var2;
            this.field1168 += var2;
            this.method1173();
            class62 var3 = (class62) this.field1167.method3549();
            synchronized (var3) {
                int var5 = var3.method1261(this);
                if (var5 < 0) {
                    var3.field1222 = 0;
                    this.method1136(var3);
                } else {
                    var3.field1222 = var5;
                    this.method1135(var3.field3110, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bh.e(I)V")
    public void method1148(int arg0) {
        for (class67 var2 = (class67) this.field1166.method3549(); var2 != null; var2 = (class67) this.field1166.method3550()) {
            var2.method1142(arg0);
        }
    }
}
