package deob;

@ObfuscatedName("aj")
public class class51 extends class62 {

    @ObfuscatedName("aj.q")
    public class189 field1080 = new class189();

    @ObfuscatedName("aj.s")
    public class189 field1077 = new class189();

    @ObfuscatedName("aj.h")
    public int field1079 = 0;

    @ObfuscatedName("aj.e")
    public int field1078 = -1;

    @ObfuscatedName("aj.q(Lba;)V")
    public final synchronized void method990(class62 arg0) {
        this.field1080.method3305(arg0);
    }

    @ObfuscatedName("aj.s(Lba;)V")
    public final synchronized void method983(class62 arg0) {
        arg0.method3404();
    }

    @ObfuscatedName("aj.h()V")
    public void method967() {
        if (this.field1079 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field1077.method3309(); var1 != null; var1 = (class57) this.field1077.method3311()) {
            var1.field1130 -= this.field1079;
        }
        this.field1078 -= this.field1079;
        this.field1079 = 0;
    }

    @ObfuscatedName("aj.e(Lgw;Lbz;)V")
    public void method968(class198 arg0, class57 arg1) {
        while (this.field1077.field2942 != arg0 && ((class57) arg0).field1130 <= arg1.field1130) {
            arg0 = arg0.field2959;
        }
        class189.method3340(arg1, arg0);
        this.field1078 = ((class57) this.field1077.field2942.field2959).field1130;
    }

    @ObfuscatedName("aj.n(Lbz;)V")
    public void method969(class57 arg0) {
        arg0.method3404();
        arg0.method1074();
        class198 var2 = this.field1077.field2942.field2959;
        if (this.field1077.field2942 == var2) {
            this.field1078 = -1;
        } else {
            this.field1078 = ((class57) var2).field1130;
        }
    }

    @ObfuscatedName("aj.t()Lba;")
    public class62 method984() {
        return (class62) this.field1080.method3309();
    }

    @ObfuscatedName("aj.l()Lba;")
    public class62 method971() {
        return (class62) this.field1080.method3311();
    }

    @ObfuscatedName("aj.m()I")
    public int method997() {
        return 0;
    }

    @ObfuscatedName("aj.o([III)V")
    public final synchronized void method973(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1078 < 0) {
                this.method970(arg0, arg1, arg2);
                return;
            }
            if (this.field1079 + arg2 < this.field1078) {
                this.field1079 += arg2;
                this.method970(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1078 - this.field1079;
            this.method970(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1079 += var4;
            this.method967();
            class57 var5 = (class57) this.field1077.method3309();
            synchronized (var5) {
                int var7 = var5.method1076(this);
                if (var7 < 0) {
                    var5.field1130 = 0;
                    this.method969(var5);
                } else {
                    var5.field1130 = var7;
                    this.method968(var5.field2959, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aj.k([III)V")
    public void method970(int[] arg0, int arg1, int arg2) {
        for (class62 var4 = (class62) this.field1080.method3309(); var4 != null; var4 = (class62) this.field1080.method3311()) {
            var4.method1246(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aj.p(I)V")
    public final synchronized void method975(int arg0) {
        do {
            if (this.field1078 < 0) {
                this.method1000(arg0);
                return;
            }
            if (this.field1079 + arg0 < this.field1078) {
                this.field1079 += arg0;
                this.method1000(arg0);
                return;
            }
            int var2 = this.field1078 - this.field1079;
            this.method1000(var2);
            arg0 -= var2;
            this.field1079 += var2;
            this.method967();
            class57 var3 = (class57) this.field1077.method3309();
            synchronized (var3) {
                int var5 = var3.method1076(this);
                if (var5 < 0) {
                    var3.field1130 = 0;
                    this.method969(var3);
                } else {
                    var3.field1130 = var5;
                    this.method968(var3.field2959, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aj.u(I)V")
    public void method1000(int arg0) {
        for (class62 var2 = (class62) this.field1080.method3309(); var2 != null; var2 = (class62) this.field1080.method3311()) {
            var2.method975(arg0);
        }
    }
}
