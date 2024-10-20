package deob;

@ObfuscatedName("ai")
public class class50 extends class61 {

    @ObfuscatedName("ai.p")
    public class182 field1062 = new class182();

    @ObfuscatedName("ai.y")
    public class182 field1060 = new class182();

    @ObfuscatedName("ai.d")
    public int field1061 = 0;

    @ObfuscatedName("ai.c")
    public int field1059 = -1;

    @ObfuscatedName("ai.p(Lbw;)V")
    public final synchronized void method978(class61 arg0) {
        this.field1062.method3273(arg0);
    }

    @ObfuscatedName("ai.y(Lbw;)V")
    public final synchronized void method1012(class61 arg0) {
        arg0.method3358();
    }

    @ObfuscatedName("ai.d()V")
    public void method980() {
        if (this.field1061 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field1060.method3270(); var1 != null; var1 = (class56) this.field1060.method3262()) {
            var1.field1124 -= this.field1061;
        }
        this.field1059 -= this.field1061;
        this.field1061 = 0;
    }

    @ObfuscatedName("ai.c(Lgu;Lbt;)V")
    public void method1000(class191 arg0, class56 arg1) {
        while (this.field1060.field2885 != arg0 && ((class56) arg0).field1124 <= arg1.field1124) {
            arg0 = arg0.field2902;
        }
        class182.method3258(arg1, arg0);
        this.field1059 = ((class56) this.field1060.field2885.field2902).field1124;
    }

    @ObfuscatedName("ai.r(Lbt;)V")
    public void method982(class56 arg0) {
        arg0.method3358();
        arg0.method1089();
        class191 var2 = this.field1060.field2885.field2902;
        if (this.field1060.field2885 == var2) {
            this.field1059 = -1;
        } else {
            this.field1059 = ((class56) var2).field1124;
        }
    }

    @ObfuscatedName("ai.f()Lbw;")
    public class61 method983() {
        return (class61) this.field1062.method3270();
    }

    @ObfuscatedName("ai.z()Lbw;")
    public class61 method984() {
        return (class61) this.field1062.method3262();
    }

    @ObfuscatedName("ai.o()I")
    public int method985() {
        return 0;
    }

    @ObfuscatedName("ai.k([III)V")
    public final synchronized void method986(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1059 < 0) {
                this.method988(arg0, arg1, arg2);
                return;
            }
            if (this.field1061 + arg2 < this.field1059) {
                this.field1061 += arg2;
                this.method988(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1059 - this.field1061;
            this.method988(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1061 += var4;
            this.method980();
            class56 var5 = (class56) this.field1060.method3270();
            synchronized (var5) {
                int var7 = var5.method1090(this);
                if (var7 < 0) {
                    var5.field1124 = 0;
                    this.method982(var5);
                } else {
                    var5.field1124 = var7;
                    this.method1000(var5.field2902, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ai.s([III)V")
    public void method988(int[] arg0, int arg1, int arg2) {
        for (class61 var4 = (class61) this.field1062.method3270(); var4 != null; var4 = (class61) this.field1062.method3262()) {
            var4.method1269(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ai.h(I)V")
    public final synchronized void method977(int arg0) {
        do {
            if (this.field1059 < 0) {
                this.method998(arg0);
                return;
            }
            if (this.field1061 + arg0 < this.field1059) {
                this.field1061 += arg0;
                this.method998(arg0);
                return;
            }
            int var2 = this.field1059 - this.field1061;
            this.method998(var2);
            arg0 -= var2;
            this.field1061 += var2;
            this.method980();
            class56 var3 = (class56) this.field1060.method3270();
            synchronized (var3) {
                int var5 = var3.method1090(this);
                if (var5 < 0) {
                    var3.field1124 = 0;
                    this.method982(var3);
                } else {
                    var3.field1124 = var5;
                    this.method1000(var3.field2902, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ai.m(I)V")
    public void method998(int arg0) {
        for (class61 var2 = (class61) this.field1062.method3270(); var2 != null; var2 = (class61) this.field1062.method3262()) {
            var2.method977(arg0);
        }
    }
}
