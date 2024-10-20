package deob;

@ObfuscatedName("ar")
public class class46 extends class48 {

    @ObfuscatedName("ar.j")
    public class177 field1067 = new class177();

    @ObfuscatedName("ar.f")
    public class177 field1068 = new class177();

    @ObfuscatedName("ar.o")
    public int field1069 = 0;

    @ObfuscatedName("ar.h")
    public int field1070 = -1;

    @ObfuscatedName("ar.j(Lav;)V")
    public final synchronized void method1107(class48 arg0) {
        this.field1067.method3313(arg0);
    }

    @ObfuscatedName("ar.f(Lav;)V")
    public final synchronized void method1108(class48 arg0) {
        arg0.method3349();
    }

    @ObfuscatedName("ar.h()V")
    public void method1109() {
        if (this.field1069 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1068.method3338(); var1 != null; var1 = (class61) this.field1068.method3323()) {
            var1.field1225 -= this.field1069;
        }
        this.field1070 -= this.field1069;
        this.field1069 = 0;
    }

    @ObfuscatedName("ar.u(Lfz;Lbh;)V")
    public void method1130(class179 arg0, class61 arg1) {
        while (this.field1068.field2807 != arg0 && ((class61) arg0).field1225 <= arg1.field1225) {
            arg0 = arg0.field2812;
        }
        class177.method3321(arg1, arg0);
        this.field1070 = ((class61) this.field1068.field2807.field2812).field1225;
    }

    @ObfuscatedName("ar.a(Lbh;)V")
    public void method1121(class61 arg0) {
        arg0.method3349();
        arg0.method1314();
        class179 var2 = this.field1068.field2807.field2812;
        if (this.field1068.field2807 == var2) {
            this.field1070 = -1;
        } else {
            this.field1070 = ((class61) var2).field1225;
        }
    }

    @ObfuscatedName("ar.v()Lav;")
    public class48 method1009() {
        return (class48) this.field1067.method3338();
    }

    @ObfuscatedName("ar.d()Lav;")
    public class48 method966() {
        return (class48) this.field1067.method3323();
    }

    @ObfuscatedName("ar.e()I")
    public int method967() {
        return 0;
    }

    @ObfuscatedName("ar.y([III)V")
    public final synchronized void method1029(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1070 < 0) {
                this.method1115(arg0, arg1, arg2);
                return;
            }
            if (this.field1069 + arg2 < this.field1070) {
                this.field1069 += arg2;
                this.method1115(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1070 - this.field1069;
            this.method1115(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1069 += var4;
            this.method1109();
            class61 var5 = (class61) this.field1068.method3338();
            synchronized (var5) {
                int var7 = var5.method1308(this);
                if (var7 < 0) {
                    var5.field1225 = 0;
                    this.method1121(var5);
                } else {
                    var5.field1225 = var7;
                    this.method1130(var5.field2812, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ar.q([III)V")
    public void method1115(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1067.method3338(); var4 != null; var4 = (class48) this.field1067.method3323()) {
            var4.method1132(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ar.aw(I)V")
    public final synchronized void method969(int arg0) {
        do {
            if (this.field1070 < 0) {
                this.method1111(arg0);
                return;
            }
            if (this.field1069 + arg0 < this.field1070) {
                this.field1069 += arg0;
                this.method1111(arg0);
                return;
            }
            int var2 = this.field1070 - this.field1069;
            this.method1111(var2);
            arg0 -= var2;
            this.field1069 += var2;
            this.method1109();
            class61 var3 = (class61) this.field1068.method3338();
            synchronized (var3) {
                int var5 = var3.method1308(this);
                if (var5 < 0) {
                    var3.field1225 = 0;
                    this.method1121(var3);
                } else {
                    var3.field1225 = var5;
                    this.method1130(var3.field2812, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ar.t(I)V")
    public void method1111(int arg0) {
        for (class48 var2 = (class48) this.field1067.method3338(); var2 != null; var2 = (class48) this.field1067.method3323()) {
            var2.method969(arg0);
        }
    }
}
