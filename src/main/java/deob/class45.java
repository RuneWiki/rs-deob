package deob;

@ObfuscatedName("aa")
public class class45 extends class47 {

    @ObfuscatedName("aa.j")
    public class175 field1041 = new class175();

    @ObfuscatedName("aa.y")
    public class175 field1040 = new class175();

    @ObfuscatedName("aa.x")
    public int field1039 = 0;

    @ObfuscatedName("aa.z")
    public int field1042 = -1;

    @ObfuscatedName("aa.j(Lak;)V")
    public final synchronized void method1099(class47 arg0) {
        this.field1041.method3244(arg0);
    }

    @ObfuscatedName("aa.y(Lak;)V")
    public final synchronized void method1081(class47 arg0) {
        arg0.method3289();
    }

    @ObfuscatedName("aa.z()V")
    public void method1082() {
        if (this.field1039 <= 0) {
            return;
        }
        for (class60 var1 = (class60) this.field1040.method3279(); var1 != null; var1 = (class60) this.field1040.method3249()) {
            var1.field1201 -= this.field1039;
        }
        this.field1042 -= this.field1039;
        this.field1039 = 0;
    }

    @ObfuscatedName("aa.c(Lfa;Lbi;)V")
    public void method1080(class177 arg0, class60 arg1) {
        while (this.field1040.field2755 != arg0 && ((class60) arg0).field1201 <= arg1.field1201) {
            arg0 = arg0.field2759;
        }
        class175.method3250(arg1, arg0);
        this.field1042 = ((class60) this.field1040.field2755.field2759).field1201;
    }

    @ObfuscatedName("aa.e(Lbi;)V")
    public void method1083(class60 arg0) {
        arg0.method3289();
        arg0.method1282();
        class177 var2 = this.field1040.field2755.field2759;
        if (this.field1040.field2755 == var2) {
            this.field1042 = -1;
        } else {
            this.field1042 = ((class60) var2).field1201;
        }
    }

    @ObfuscatedName("aa.l()Lak;")
    public class47 method947() {
        return (class47) this.field1041.method3279();
    }

    @ObfuscatedName("aa.a()Lak;")
    public class47 method977() {
        return (class47) this.field1041.method3249();
    }

    @ObfuscatedName("aa.f()I")
    public int method981() {
        return 0;
    }

    @ObfuscatedName("aa.h([III)V")
    public final synchronized void method1077(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1042 < 0) {
                this.method1087(arg0, arg1, arg2);
                return;
            }
            if (this.field1039 + arg2 < this.field1042) {
                this.field1039 += arg2;
                this.method1087(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1042 - this.field1039;
            this.method1087(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1039 += var4;
            this.method1082();
            class60 var5 = (class60) this.field1040.method3279();
            synchronized (var5) {
                int var7 = var5.method1281(this);
                if (var7 < 0) {
                    var5.field1201 = 0;
                    this.method1083(var5);
                } else {
                    var5.field1201 = var7;
                    this.method1080(var5.field2759, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aa.s([III)V")
    public void method1087(int[] arg0, int arg1, int arg2) {
        for (class47 var4 = (class47) this.field1041.method3279(); var4 != null; var4 = (class47) this.field1041.method3249()) {
            var4.method1103(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aa.az(I)V")
    public final synchronized void method951(int arg0) {
        do {
            if (this.field1042 < 0) {
                this.method1084(arg0);
                return;
            }
            if (this.field1039 + arg0 < this.field1042) {
                this.field1039 += arg0;
                this.method1084(arg0);
                return;
            }
            int var2 = this.field1042 - this.field1039;
            this.method1084(var2);
            arg0 -= var2;
            this.field1039 += var2;
            this.method1082();
            class60 var3 = (class60) this.field1040.method3279();
            synchronized (var3) {
                int var5 = var3.method1281(this);
                if (var5 < 0) {
                    var3.field1201 = 0;
                    this.method1083(var3);
                } else {
                    var3.field1201 = var5;
                    this.method1080(var3.field2759, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aa.i(I)V")
    public void method1084(int arg0) {
        for (class47 var2 = (class47) this.field1041.method3279(); var2 != null; var2 = (class47) this.field1041.method3249()) {
            var2.method951(arg0);
        }
    }
}
