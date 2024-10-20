package deob;

@ObfuscatedName("li")
public class class316 extends class325 {

    @ObfuscatedName("li.v")
    public final class366 field3808;

    public class316(class366 arg0) {
        super(400);
        this.field3808 = arg0;
    }

    @ObfuscatedName("li.f(I)Llf;")
    public class323 method5102() {
        return new class326();
    }

    @ObfuscatedName("li.e(II)[Llf;")
    public class323[] method5108(int arg0) {
        return new class326[arg0];
    }

    @ObfuscatedName("li.v(Lnt;IB)V")
    public void method5101(class384 arg0, int arg1) {
        while (true) {
            if (arg0.field4161 < arg1) {
                int var3 = arg0.method5902();
                boolean var4 = (var3 & 0x1) == 1;
                class329 var5 = new class329(arg0.method5906(), this.field3808);
                class329 var6 = new class329(arg0.method5906(), this.field3808);
                arg0.method5906();
                if (var5 != null && var5.method5265()) {
                    class326 var7 = (class326) this.method5202(var5);
                    if (var4) {
                        class326 var8 = (class326) this.method5202(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5205(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5209(var7, var5, var6);
                        continue;
                    }
                    if (this.method5199() < 400) {
                        int var9 = this.method5199();
                        class326 var10 = (class326) this.method5239(var5, var6);
                        var10.field3845 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
