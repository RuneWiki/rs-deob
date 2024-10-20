package deob;

@ObfuscatedName("ay")
public class class39 extends class49 {

    @ObfuscatedName("ay.f")
    public class356 field283 = new class356();

    @ObfuscatedName("ay.v")
    public class356 field282 = new class356();

    @ObfuscatedName("ay.s")
    public int field281 = 0;

    @ObfuscatedName("ay.z")
    public int field284 = -1;

    @ObfuscatedName("ay.f(Lan;)V")
    public final synchronized void method693(class49 arg0) {
        this.field283.method6237(arg0);
    }

    @ObfuscatedName("ay.w(Lan;)V")
    public final synchronized void method706(class49 arg0) {
        arg0.method7431();
    }

    @ObfuscatedName("ay.v()V")
    public void method695() {
        if (this.field281 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field282.method6241(); var1 != null; var1 = (class55) this.field282.method6248()) {
            var1.field418 -= this.field281;
        }
        this.field284 -= this.field281;
        this.field281 = 0;
    }

    @ObfuscatedName("ay.s(Lpr;Lbz;)V")
    public void method696(class440 arg0, class55 arg1) {
        while (this.field282.field4344 != arg0 && ((class55) arg0).field418 <= arg1.field418) {
            arg0 = arg0.field4710;
        }
        class356.method6262(arg1, arg0);
        this.field284 = ((class55) this.field282.field4344.field4710).field418;
    }

    @ObfuscatedName("ay.z(Lbz;)V")
    public void method697(class55 arg0) {
        arg0.method7431();
        arg0.method1038();
        class440 var2 = this.field282.field4344.field4710;
        if (this.field282.field4344 == var2) {
            this.field284 = -1;
        } else {
            this.field284 = ((class55) var2).field418;
        }
    }

    @ObfuscatedName("ay.j()Lan;")
    public class49 method714() {
        return (class49) this.field283.method6241();
    }

    @ObfuscatedName("ay.i()Lan;")
    public class49 method699() {
        return (class49) this.field283.method6248();
    }

    @ObfuscatedName("ay.n()I")
    public int method702() {
        return 0;
    }

    @ObfuscatedName("ay.l([III)V")
    public final synchronized void method710(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field284 < 0) {
                this.method705(arg0, arg1, arg2);
                return;
            }
            if (this.field281 + arg2 < this.field284) {
                this.field281 += arg2;
                this.method705(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field284 - this.field281;
            this.method705(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field281 += var4;
            this.method695();
            class55 var5 = (class55) this.field282.method6241();
            synchronized (var5) {
                int var7 = var5.method1040(this);
                if (var7 < 0) {
                    var5.field418 = 0;
                    this.method697(var5);
                } else {
                    var5.field418 = var7;
                    this.method696(var5.field4710, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ay.k([III)V")
    public void method705(int[] arg0, int arg1, int arg2) {
        for (class49 var4 = (class49) this.field283.method6241(); var4 != null; var4 = (class49) this.field283.method6248()) {
            var4.method985(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ay.c(I)V")
    public final synchronized void method703(int arg0) {
        do {
            if (this.field284 < 0) {
                this.method698(arg0);
                return;
            }
            if (this.field281 + arg0 < this.field284) {
                this.field281 += arg0;
                this.method698(arg0);
                return;
            }
            int var2 = this.field284 - this.field281;
            this.method698(var2);
            arg0 -= var2;
            this.field281 += var2;
            this.method695();
            class55 var3 = (class55) this.field282.method6241();
            synchronized (var3) {
                int var5 = var3.method1040(this);
                if (var5 < 0) {
                    var3.field418 = 0;
                    this.method697(var3);
                } else {
                    var3.field418 = var5;
                    this.method696(var3.field4710, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ay.r(I)V")
    public void method698(int arg0) {
        for (class49 var2 = (class49) this.field283.method6241(); var2 != null; var2 = (class49) this.field283.method6248()) {
            var2.method703(arg0);
        }
    }
}
