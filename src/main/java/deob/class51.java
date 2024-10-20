package deob;

@ObfuscatedName("az")
public class class51 extends class62 {

    @ObfuscatedName("az.n")
    public class190 field1120 = new class190();

    @ObfuscatedName("az.o")
    public class190 field1122 = new class190();

    @ObfuscatedName("az.a")
    public int field1121 = 0;

    @ObfuscatedName("az.m")
    public int field1119 = -1;

    @ObfuscatedName("az.n(Lby;)V")
    public final synchronized void method1031(class62 arg0) {
        this.field1120.method3442(arg0);
    }

    @ObfuscatedName("az.o(Lby;)V")
    public final synchronized void method1032(class62 arg0) {
        arg0.method3540();
    }

    @ObfuscatedName("az.a()V")
    public void method1033() {
        if (this.field1121 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field1122.method3451(); var1 != null; var1 = (class57) this.field1122.method3448()) {
            var1.field1179 -= this.field1121;
        }
        this.field1119 -= this.field1121;
        this.field1121 = 0;
    }

    @ObfuscatedName("az.w(Lga;Lbl;)V")
    public void method1057(class199 arg0, class57 arg1) {
        while (this.field1122.field3003 != arg0 && ((class57) arg0).field1179 <= arg1.field1179) {
            arg0 = arg0.field3019;
        }
        class190.method3464(arg1, arg0);
        this.field1119 = ((class57) this.field1122.field3003.field3019).field1179;
    }

    @ObfuscatedName("az.m(Lbl;)V")
    public void method1035(class57 arg0) {
        arg0.method3540();
        arg0.method1154();
        class199 var2 = this.field1122.field3003.field3019;
        if (this.field1122.field3003 == var2) {
            this.field1119 = -1;
        } else {
            this.field1119 = ((class57) var2).field1179;
        }
    }

    @ObfuscatedName("az.h()Lby;")
    public class62 method1045() {
        return (class62) this.field1120.method3451();
    }

    @ObfuscatedName("az.i()Lby;")
    public class62 method1037() {
        return (class62) this.field1120.method3448();
    }

    @ObfuscatedName("az.r()I")
    public int method1048() {
        return 0;
    }

    @ObfuscatedName("az.l([III)V")
    public final synchronized void method1030(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1119 < 0) {
                this.method1040(arg0, arg1, arg2);
                return;
            }
            if (this.field1121 + arg2 < this.field1119) {
                this.field1121 += arg2;
                this.method1040(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1119 - this.field1121;
            this.method1040(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1121 += var4;
            this.method1033();
            class57 var5 = (class57) this.field1122.method3451();
            synchronized (var5) {
                int var7 = var5.method1157(this);
                if (var7 < 0) {
                    var5.field1179 = 0;
                    this.method1035(var5);
                } else {
                    var5.field1179 = var7;
                    this.method1057(var5.field3019, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("az.f([III)V")
    public void method1040(int[] arg0, int arg1, int arg2) {
        for (class62 var4 = (class62) this.field1120.method3451(); var4 != null; var4 = (class62) this.field1120.method3448()) {
            var4.method1328(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("az.e(I)V")
    public final synchronized void method1041(int arg0) {
        do {
            if (this.field1119 < 0) {
                this.method1042(arg0);
                return;
            }
            if (this.field1121 + arg0 < this.field1119) {
                this.field1121 += arg0;
                this.method1042(arg0);
                return;
            }
            int var2 = this.field1119 - this.field1121;
            this.method1042(var2);
            arg0 -= var2;
            this.field1121 += var2;
            this.method1033();
            class57 var3 = (class57) this.field1122.method3451();
            synchronized (var3) {
                int var5 = var3.method1157(this);
                if (var5 < 0) {
                    var3.field1179 = 0;
                    this.method1035(var3);
                } else {
                    var3.field1179 = var5;
                    this.method1057(var3.field3019, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("az.z(I)V")
    public void method1042(int arg0) {
        for (class62 var2 = (class62) this.field1120.method3451(); var2 != null; var2 = (class62) this.field1120.method3448()) {
            var2.method1041(arg0);
        }
    }
}
