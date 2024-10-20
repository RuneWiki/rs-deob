package deob;

@ObfuscatedName("im")
public final class class236 {

    @ObfuscatedName("im.n")
    public class364 field2634 = new class364();

    @ObfuscatedName("im.c")
    public int field2635;

    @ObfuscatedName("im.m")
    public int field2636;

    @ObfuscatedName("im.k")
    public class378 field2637;

    @ObfuscatedName("im.o")
    public class314 field2638 = new class314();

    public class236(int arg0) {
        this.field2635 = arg0;
        this.field2636 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2637 = new class378(var2);
    }

    @ObfuscatedName("im.n(J)Lmc;")
    public class364 method4167(long arg0) {
        class364 var3 = (class364) this.field2637.method5996(arg0);
        if (var3 != null) {
            this.field2638.method5103(var3);
        }
        return var3;
    }

    @ObfuscatedName("im.c(J)V")
    public void method4172(long arg0) {
        class364 var3 = (class364) this.field2637.method5996(arg0);
        if (var3 != null) {
            var3.method5732();
            var3.method5728();
            this.field2636++;
        }
    }

    @ObfuscatedName("im.m(Lmc;J)V")
    public void method4169(class364 arg0, long arg1) {
        if (this.field2636 == 0) {
            class364 var4 = this.field2638.method5091();
            var4.method5732();
            var4.method5728();
            if (this.field2634 == var4) {
                class364 var5 = this.field2638.method5091();
                var5.method5732();
                var5.method5728();
            }
        } else {
            this.field2636--;
        }
        this.field2637.method5997(arg0, arg1);
        this.field2638.method5103(arg0);
    }

    @ObfuscatedName("im.k()V")
    public void method4168() {
        this.field2638.method5088();
        this.field2637.method6000();
        this.field2634 = new class364();
        this.field2636 = this.field2635;
    }
}
