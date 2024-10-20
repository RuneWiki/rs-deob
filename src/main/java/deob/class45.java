package deob;

@ObfuscatedName("ah")
public class class45 extends class47 {

    @ObfuscatedName("ah.z")
    public class175 field1065 = new class175();

    @ObfuscatedName("ah.h")
    public class175 field1063 = new class175();

    @ObfuscatedName("ah.c")
    public int field1062 = 0;

    @ObfuscatedName("ah.p")
    public int field1064 = -1;

    @ObfuscatedName("ah.z(Laa;)V")
    public final synchronized void method1094(class47 arg0) {
        this.field1065.method3304(arg0);
    }

    @ObfuscatedName("ah.h(Laa;)V")
    public final synchronized void method1113(class47 arg0) {
        arg0.method3346();
    }

    @ObfuscatedName("ah.p()V")
    public void method1102() {
        if (this.field1062 <= 0) {
            return;
        }
        for (class60 var1 = (class60) this.field1063.method3317(); var1 != null; var1 = (class60) this.field1063.method3310()) {
            var1.field1220 -= this.field1062;
        }
        this.field1064 -= this.field1062;
        this.field1062 = 0;
    }

    @ObfuscatedName("ah.i(Lfk;Lbj;)V")
    public void method1100(class177 arg0, class60 arg1) {
        while (this.field1063.field2751 != arg0 && ((class60) arg0).field1220 <= arg1.field1220) {
            arg0 = arg0.field2754;
        }
        class175.method3305(arg1, arg0);
        this.field1064 = ((class60) this.field1063.field2751.field2754).field1220;
    }

    @ObfuscatedName("ah.v(Lbj;)V")
    public void method1097(class60 arg0) {
        arg0.method3346();
        arg0.method1288();
        class177 var2 = this.field1063.field2751.field2754;
        if (this.field1063.field2751 == var2) {
            this.field1064 = -1;
        } else {
            this.field1064 = ((class60) var2).field1220;
        }
    }

    @ObfuscatedName("ah.x()Laa;")
    public class47 method987() {
        return (class47) this.field1065.method3317();
    }

    @ObfuscatedName("ah.w()Laa;")
    public class47 method962() {
        return (class47) this.field1065.method3310();
    }

    @ObfuscatedName("ah.j()I")
    public int method963() {
        return 0;
    }

    @ObfuscatedName("ah.s([III)V")
    public final synchronized void method976(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1064 < 0) {
                this.method1098(arg0, arg1, arg2);
                return;
            }
            if (this.field1062 + arg2 < this.field1064) {
                this.field1062 += arg2;
                this.method1098(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1064 - this.field1062;
            this.method1098(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1062 += var4;
            this.method1102();
            class60 var5 = (class60) this.field1063.method3317();
            synchronized (var5) {
                int var7 = var5.method1287(this);
                if (var7 < 0) {
                    var5.field1220 = 0;
                    this.method1097(var5);
                } else {
                    var5.field1220 = var7;
                    this.method1100(var5.field2754, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ah.l([III)V")
    public void method1098(int[] arg0, int arg1, int arg2) {
        for (class47 var4 = (class47) this.field1065.method3317(); var4 != null; var4 = (class47) this.field1065.method3310()) {
            var4.method1119(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ah.au(I)V")
    public final synchronized void method965(int arg0) {
        do {
            if (this.field1064 < 0) {
                this.method1095(arg0);
                return;
            }
            if (this.field1062 + arg0 < this.field1064) {
                this.field1062 += arg0;
                this.method1095(arg0);
                return;
            }
            int var2 = this.field1064 - this.field1062;
            this.method1095(var2);
            arg0 -= var2;
            this.field1062 += var2;
            this.method1102();
            class60 var3 = (class60) this.field1063.method3317();
            synchronized (var3) {
                int var5 = var3.method1287(this);
                if (var5 < 0) {
                    var3.field1220 = 0;
                    this.method1097(var3);
                } else {
                    var3.field1220 = var5;
                    this.method1100(var3.field2754, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ah.m(I)V")
    public void method1095(int arg0) {
        for (class47 var2 = (class47) this.field1065.method3317(); var2 != null; var2 = (class47) this.field1065.method3310()) {
            var2.method965(arg0);
        }
    }
}
