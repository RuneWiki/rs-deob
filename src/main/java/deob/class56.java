package deob;

@ObfuscatedName("bj")
public class class56 extends class67 {

    @ObfuscatedName("bj.o")
    public class199 field1168 = new class199();

    @ObfuscatedName("bj.f")
    public class199 field1167 = new class199();

    @ObfuscatedName("bj.i")
    public int field1166 = 0;

    @ObfuscatedName("bj.h")
    public int field1169 = -1;

    @ObfuscatedName("bj.o(Lby;)V")
    public final synchronized void method1068(class67 arg0) {
        this.field1168.method3516(arg0);
    }

    @ObfuscatedName("bj.f(Lby;)V")
    public final synchronized void method1103(class67 arg0) {
        arg0.method3605();
    }

    @ObfuscatedName("bj.i()V")
    public void method1070() {
        if (this.field1166 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1167.method3520(); var1 != null; var1 = (class62) this.field1167.method3522()) {
            var1.field1223 -= this.field1166;
        }
        this.field1169 -= this.field1166;
        this.field1166 = 0;
    }

    @ObfuscatedName("bj.h(Lgu;Lbn;)V")
    public void method1067(class208 arg0, class62 arg1) {
        while (this.field1167.field3081 != arg0 && ((class62) arg0).field1223 <= arg1.field1223) {
            arg0 = arg0.field3098;
        }
        class199.method3517(arg1, arg0);
        this.field1169 = ((class62) this.field1167.field3081.field3098).field1223;
    }

    @ObfuscatedName("bj.q(Lbn;)V")
    public void method1072(class62 arg0) {
        arg0.method3605();
        arg0.method1198();
        class208 var2 = this.field1167.field3081.field3098;
        if (this.field1167.field3081 == var2) {
            this.field1169 = -1;
        } else {
            this.field1169 = ((class62) var2).field1223;
        }
    }

    @ObfuscatedName("bj.u()Lby;")
    public class67 method1073() {
        return (class67) this.field1168.method3520();
    }

    @ObfuscatedName("bj.m()Lby;")
    public class67 method1098() {
        return (class67) this.field1168.method3522();
    }

    @ObfuscatedName("bj.y()I")
    public int method1075() {
        return 0;
    }

    @ObfuscatedName("bj.p([III)V")
    public final synchronized void method1095(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1169 < 0) {
                this.method1077(arg0, arg1, arg2);
                return;
            }
            if (this.field1166 + arg2 < this.field1169) {
                this.field1166 += arg2;
                this.method1077(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1169 - this.field1166;
            this.method1077(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1166 += var4;
            this.method1070();
            class62 var5 = (class62) this.field1167.method3520();
            synchronized (var5) {
                int var7 = var5.method1197(this);
                if (var7 < 0) {
                    var5.field1223 = 0;
                    this.method1072(var5);
                } else {
                    var5.field1223 = var7;
                    this.method1067(var5.field3098, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bj.t([III)V")
    public void method1077(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1168.method3520(); var4 != null; var4 = (class67) this.field1168.method3522()) {
            var4.method1356(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bj.g(I)V")
    public final synchronized void method1089(int arg0) {
        do {
            if (this.field1169 < 0) {
                this.method1079(arg0);
                return;
            }
            if (this.field1166 + arg0 < this.field1169) {
                this.field1166 += arg0;
                this.method1079(arg0);
                return;
            }
            int var2 = this.field1169 - this.field1166;
            this.method1079(var2);
            arg0 -= var2;
            this.field1166 += var2;
            this.method1070();
            class62 var3 = (class62) this.field1167.method3520();
            synchronized (var3) {
                int var5 = var3.method1197(this);
                if (var5 < 0) {
                    var3.field1223 = 0;
                    this.method1072(var3);
                } else {
                    var3.field1223 = var5;
                    this.method1067(var3.field3098, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bj.v(I)V")
    public void method1079(int arg0) {
        for (class67 var2 = (class67) this.field1168.method3520(); var2 != null; var2 = (class67) this.field1168.method3522()) {
            var2.method1089(arg0);
        }
    }
}
