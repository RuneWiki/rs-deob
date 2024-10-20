package deob;

@ObfuscatedName("mq")
public class class343 extends class352 {

    @ObfuscatedName("mq.p")
    public final class400 field4077;

    public class343(class400 arg0) {
        super(400);
        this.field4077 = arg0;
    }

    @ObfuscatedName("mq.c(B)Lmv;")
    public class350 method5691() {
        return new class353();
    }

    @ObfuscatedName("mq.b(II)[Lmv;")
    public class350[] method5692(int arg0) {
        return new class353[arg0];
    }

    @ObfuscatedName("mq.p(Lpi;II)V")
    public void method5696(class419 arg0, int arg1) {
        while (true) {
            if (arg0.field4475 < arg1) {
                int var3 = arg0.method6781();
                boolean var4 = (var3 & 0x1) == 1;
                class440 var5 = new class440(arg0.method6707(), this.field4077);
                class440 var6 = new class440(arg0.method6707(), this.field4077);
                arg0.method6707();
                if (var5 != null && var5.method7189()) {
                    class353 var7 = (class353) this.method5798(var5);
                    if (var4) {
                        class353 var8 = (class353) this.method5798(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5815(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5806(var7, var5, var6);
                        continue;
                    }
                    if (this.method5794() < 400) {
                        int var9 = this.method5794();
                        class353 var10 = (class353) this.method5803(var5, var6);
                        var10.field4118 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
