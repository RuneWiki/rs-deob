package deob;

@ObfuscatedName("at")
public class class46 extends class48 {

    @ObfuscatedName("at.p")
    public class177 field1055 = new class177();

    @ObfuscatedName("at.e")
    public class177 field1053 = new class177();

    @ObfuscatedName("at.a")
    public int field1054 = 0;

    @ObfuscatedName("at.h")
    public int field1056 = -1;

    @ObfuscatedName("at.p(Las;)V")
    public final synchronized void method1121(class48 arg0) {
        this.field1055.method3334(arg0);
    }

    @ObfuscatedName("at.e(Las;)V")
    public final synchronized void method1122(class48 arg0) {
        arg0.method3360();
    }

    @ObfuscatedName("at.h()V")
    public void method1123() {
        if (this.field1054 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1053.method3325(); var1 != null; var1 = (class61) this.field1053.method3333()) {
            var1.field1218 -= this.field1054;
        }
        this.field1056 -= this.field1054;
        this.field1054 = 0;
    }

    @ObfuscatedName("at.y(Lfw;Lbw;)V")
    public void method1129(class179 arg0, class61 arg1) {
        while (this.field1053.field2808 != arg0 && ((class61) arg0).field1218 <= arg1.field1218) {
            arg0 = arg0.field2812;
        }
        class177.method3326(arg1, arg0);
        this.field1056 = ((class61) this.field1053.field2808.field2812).field1218;
    }

    @ObfuscatedName("at.j(Lbw;)V")
    public void method1124(class61 arg0) {
        arg0.method3360();
        arg0.method1322();
        class179 var2 = this.field1053.field2808.field2812;
        if (this.field1053.field2808 == var2) {
            this.field1056 = -1;
        } else {
            this.field1056 = ((class61) var2).field1218;
        }
    }

    @ObfuscatedName("at.d()Las;")
    public class48 method985() {
        return (class48) this.field1055.method3325();
    }

    @ObfuscatedName("at.t()Las;")
    public class48 method986() {
        return (class48) this.field1055.method3333();
    }

    @ObfuscatedName("at.b()I")
    public int method1041() {
        return 0;
    }

    @ObfuscatedName("at.c([III)V")
    public final synchronized void method994(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1056 < 0) {
                this.method1126(arg0, arg1, arg2);
                return;
            }
            if (this.field1054 + arg2 < this.field1056) {
                this.field1054 += arg2;
                this.method1126(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1056 - this.field1054;
            this.method1126(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1054 += var4;
            this.method1123();
            class61 var5 = (class61) this.field1053.method3325();
            synchronized (var5) {
                int var7 = var5.method1326(this);
                if (var7 < 0) {
                    var5.field1218 = 0;
                    this.method1124(var5);
                } else {
                    var5.field1218 = var7;
                    this.method1129(var5.field2812, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("at.l([III)V")
    public void method1126(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1055.method3325(); var4 != null; var4 = (class48) this.field1055.method3333()) {
            var4.method1145(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("at.aw(I)V")
    public final synchronized void method1061(int arg0) {
        do {
            if (this.field1056 < 0) {
                this.method1127(arg0);
                return;
            }
            if (this.field1054 + arg0 < this.field1056) {
                this.field1054 += arg0;
                this.method1127(arg0);
                return;
            }
            int var2 = this.field1056 - this.field1054;
            this.method1127(var2);
            arg0 -= var2;
            this.field1054 += var2;
            this.method1123();
            class61 var3 = (class61) this.field1053.method3325();
            synchronized (var3) {
                int var5 = var3.method1326(this);
                if (var5 < 0) {
                    var3.field1218 = 0;
                    this.method1124(var3);
                } else {
                    var3.field1218 = var5;
                    this.method1129(var3.field2812, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("at.f(I)V")
    public void method1127(int arg0) {
        for (class48 var2 = (class48) this.field1055.method3325(); var2 != null; var2 = (class48) this.field1055.method3333()) {
            var2.method1061(arg0);
        }
    }
}
