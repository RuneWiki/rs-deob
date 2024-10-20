package deob;

@ObfuscatedName("lu")
public class class317 extends class326 {

    @ObfuscatedName("lu.v")
    public final class367 field3821;

    public class317(class367 arg0) {
        super(400);
        this.field3821 = arg0;
    }

    @ObfuscatedName("lu.s(B)Llm;")
    public class324 method5114() {
        return new class327();
    }

    @ObfuscatedName("lu.t(II)[Llm;")
    public class324[] method5113(int arg0) {
        return new class327[arg0];
    }

    @ObfuscatedName("lu.v(Lnv;II)V")
    public void method5116(class385 arg0, int arg1) {
        while (true) {
            if (arg0.field4182 < arg1) {
                int var3 = arg0.method5958();
                boolean var4 = (var3 & 0x1) == 1;
                class406 var5 = new class406(arg0.method5967(), this.field3821);
                class406 var6 = new class406(arg0.method5967(), this.field3821);
                arg0.method5967();
                if (var5 != null && var5.method6522()) {
                    class327 var7 = (class327) this.method5225(var5);
                    if (var4) {
                        class327 var8 = (class327) this.method5225(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5228(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5233(var7, var5, var6);
                        continue;
                    }
                    if (this.method5235() < 400) {
                        int var9 = this.method5235();
                        class327 var10 = (class327) this.method5272(var5, var6);
                        var10.field3863 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
