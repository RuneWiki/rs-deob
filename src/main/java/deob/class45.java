package deob;

@ObfuscatedName("aa")
public class class45 extends class47 {

    @ObfuscatedName("aa.c")
    public class175 field1048 = new class175();

    @ObfuscatedName("aa.j")
    public class175 field1049 = new class175();

    @ObfuscatedName("aa.f")
    public int field1047 = 0;

    @ObfuscatedName("aa.y")
    public int field1050 = -1;

    @ObfuscatedName("aa.c(Lau;)V")
    public final synchronized void method1054(class47 arg0) {
        this.field1048.method3148(arg0);
    }

    @ObfuscatedName("aa.j(Lau;)V")
    public final synchronized void method1055(class47 arg0) {
        arg0.method3182();
    }

    @ObfuscatedName("aa.y()V")
    public void method1063() {
        if (this.field1047 <= 0) {
            return;
        }
        for (class60 var1 = (class60) this.field1049.method3145(); var1 != null; var1 = (class60) this.field1049.method3154()) {
            var1.field1201 -= this.field1047;
        }
        this.field1050 -= this.field1047;
        this.field1047 = 0;
    }

    @ObfuscatedName("aa.x(Lfk;Lbo;)V")
    public void method1061(class177 arg0, class60 arg1) {
        while (this.field1049.field2755 != arg0 && ((class60) arg0).field1201 <= arg1.field1201) {
            arg0 = arg0.field2760;
        }
        class175.method3160(arg1, arg0);
        this.field1050 = ((class60) this.field1049.field2755.field2760).field1201;
    }

    @ObfuscatedName("aa.e(Lbo;)V")
    public void method1058(class60 arg0) {
        arg0.method3182();
        arg0.method1261();
        class177 var2 = this.field1049.field2755.field2760;
        if (this.field1049.field2755 == var2) {
            this.field1050 = -1;
        } else {
            this.field1050 = ((class60) var2).field1201;
        }
    }

    @ObfuscatedName("aa.k()Lau;")
    public class47 method926() {
        return (class47) this.field1048.method3145();
    }

    @ObfuscatedName("aa.o()Lau;")
    public class47 method927() {
        return (class47) this.field1048.method3154();
    }

    @ObfuscatedName("aa.d()I")
    public int method928() {
        return 0;
    }

    @ObfuscatedName("aa.u([III)V")
    public final synchronized void method929(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1050 < 0) {
                this.method1059(arg0, arg1, arg2);
                return;
            }
            if (this.field1047 + arg2 < this.field1050) {
                this.field1047 += arg2;
                this.method1059(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1050 - this.field1047;
            this.method1059(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1047 += var4;
            this.method1063();
            class60 var5 = (class60) this.field1049.method3145();
            synchronized (var5) {
                int var7 = var5.method1262(this);
                if (var7 < 0) {
                    var5.field1201 = 0;
                    this.method1058(var5);
                } else {
                    var5.field1201 = var7;
                    this.method1061(var5.field2760, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aa.m([III)V")
    public void method1059(int[] arg0, int arg1, int arg2) {
        for (class47 var4 = (class47) this.field1048.method3145(); var4 != null; var4 = (class47) this.field1048.method3154()) {
            var4.method1077(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aa.ap(I)V")
    public final synchronized void method1014(int arg0) {
        do {
            if (this.field1050 < 0) {
                this.method1060(arg0);
                return;
            }
            if (this.field1047 + arg0 < this.field1050) {
                this.field1047 += arg0;
                this.method1060(arg0);
                return;
            }
            int var2 = this.field1050 - this.field1047;
            this.method1060(var2);
            arg0 -= var2;
            this.field1047 += var2;
            this.method1063();
            class60 var3 = (class60) this.field1049.method3145();
            synchronized (var3) {
                int var5 = var3.method1262(this);
                if (var5 < 0) {
                    var3.field1201 = 0;
                    this.method1058(var3);
                } else {
                    var3.field1201 = var5;
                    this.method1061(var3.field2760, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aa.s(I)V")
    public void method1060(int arg0) {
        for (class47 var2 = (class47) this.field1048.method3145(); var2 != null; var2 = (class47) this.field1048.method3154()) {
            var2.method1014(arg0);
        }
    }
}
