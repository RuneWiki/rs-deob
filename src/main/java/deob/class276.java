package deob;

@ObfuscatedName("jw")
public class class276 extends class277 {

    @ObfuscatedName("jw.v")
    public final class338 field3582;

    public class276(class338 arg0) {
        super(400);
        this.field3582 = arg0;
    }

    @ObfuscatedName("jw.z(B)Ljh;")
    public class274 method4599() {
        return new class278();
    }

    @ObfuscatedName("jw.n(II)[Ljh;")
    public class274[] method4598(int arg0) {
        return new class278[arg0];
    }

    @ObfuscatedName("jw.v(Lkl;IB)V")
    public void method4601(class300 arg0, int arg1) {
        while (true) {
            if (arg0.field3702 < arg1) {
                int var3 = arg0.method4990();
                boolean var4 = (var3 & 0x1) == 1;
                class283 var5 = new class283(arg0.method4999(), this.field3582);
                class283 var6 = new class283(arg0.method4999(), this.field3582);
                arg0.method4999();
                if (var5 != null && var5.method4699()) {
                    class278 var7 = (class278) this.method4652(var5);
                    if (var4) {
                        class278 var8 = (class278) this.method4652(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4678(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4622(var7, var5, var6);
                        continue;
                    }
                    if (this.method4637() < 400) {
                        int var9 = this.method4637();
                        class278 var10 = (class278) this.method4619(var5, var6);
                        var10.field3595 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
