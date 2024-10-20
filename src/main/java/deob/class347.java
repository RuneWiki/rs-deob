package deob;

@ObfuscatedName("mc")
public class class347 extends class352 {

    @ObfuscatedName("mc.b")
    public final class400 field4090;

    @ObfuscatedName("mc.p")
    public final class344 field4096;

    @ObfuscatedName("mc.m")
    public String field4092 = null;

    @ObfuscatedName("mc.t")
    public String field4093 = null;

    @ObfuscatedName("mc.s")
    public byte field4094;

    @ObfuscatedName("mc.j")
    public int field4095;

    @ObfuscatedName("mc.w")
    public int field4091 = 1;

    public class347(class400 arg0, class344 arg1) {
        super(100);
        this.field4090 = arg0;
        this.field4096 = arg1;
    }

    @ObfuscatedName("mc.c(B)Lmv;")
    public class350 method5691() {
        return new class349();
    }

    @ObfuscatedName("mc.b(II)[Lmv;")
    public class350[] method5692(int arg0) {
        return new class349[arg0];
    }

    @ObfuscatedName("mc.p(Ljava/lang/String;I)V")
    public final void method5726(String arg0) {
        this.field4092 = class333.method2240(arg0);
    }

    @ObfuscatedName("mc.w(Ljava/lang/String;I)V")
    public final void method5739(String arg0) {
        this.field4093 = class333.method2240(arg0);
    }

    @ObfuscatedName("mc.n(Lpi;I)V")
    public final void method5722(class419 arg0) {
        this.method5739(arg0.method6707());
        long var2 = arg0.method6676();
        this.method5726(class333.method5870(var2));
        this.field4094 = arg0.method6846();
        int var4 = arg0.method6781();
        if (var4 == 255) {
            return;
        }
        this.method5793();
        for (int var5 = 0; var5 < var4; var5++) {
            class349 var6 = (class349) this.method5802(new class440(arg0.method6707(), this.field4090));
            int var7 = arg0.method6672();
            var6.method5862(var7, ++this.field4091 - 1);
            var6.field4119 = arg0.method6846();
            arg0.method6707();
            this.method5724(var6);
        }
    }

    @ObfuscatedName("mc.r(Lpi;I)V")
    public final void method5723(class419 arg0) {
        class440 var2 = new class440(arg0.method6707(), this.field4090);
        int var3 = arg0.method6672();
        byte var4 = arg0.method6846();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5794() == 0) {
                return;
            }
            class349 var6 = (class349) this.method5798(var2);
            if (var6 != null && var6.method5861() == var3) {
                this.method5815(var6);
            }
            return;
        }
        arg0.method6707();
        class349 var7 = (class349) this.method5798(var2);
        if (var7 == null) {
            if (this.method5794() > this.field4116) {
                return;
            }
            var7 = (class349) this.method5802(var2);
        }
        var7.method5862(var3, ++this.field4091 - 1);
        var7.field4119 = var4;
        this.method5724(var7);
    }

    @ObfuscatedName("mc.o(I)V")
    public final void method5738() {
        for (int var1 = 0; var1 < this.method5794(); var1++) {
            ((class349) this.method5804(var1)).method5762();
        }
    }

    @ObfuscatedName("mc.v(I)V")
    public final void method5732() {
        for (int var1 = 0; var1 < this.method5794(); var1++) {
            ((class349) this.method5804(var1)).method5747();
        }
    }

    @ObfuscatedName("mc.d(Lmx;I)V")
    public final void method5724(class349 arg0) {
        if (arg0.method5770().equals(this.field4096.method1208())) {
            this.field4095 = arg0.field4119;
        }
    }
}
