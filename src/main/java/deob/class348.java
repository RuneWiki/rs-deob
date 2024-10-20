package deob;

@ObfuscatedName("mn")
public class class348 extends class357 {

    @ObfuscatedName("mn.s")
    public final class405 field4125;

    public class348(class405 arg0) {
        super(400);
        this.field4125 = arg0;
    }

    @ObfuscatedName("mn.c(I)Lmy;")
    public class355 method5678() {
        return new class358();
    }

    @ObfuscatedName("mn.l(IB)[Lmy;")
    public class355[] method5679(int arg0) {
        return new class358[arg0];
    }

    @ObfuscatedName("mn.s(Lpi;II)V")
    public void method5682(class421 arg0, int arg1) {
        while (true) {
            if (arg0.field4512 < arg1) {
                int var3 = arg0.method6686();
                boolean var4 = (var3 & 0x1) == 1;
                class442 var5 = new class442(arg0.method6674(), this.field4125);
                class442 var6 = new class442(arg0.method6674(), this.field4125);
                arg0.method6674();
                if (var5 != null && var5.method7230()) {
                    class358 var7 = (class358) this.method5789(var5);
                    if (var4) {
                        class358 var8 = (class358) this.method5789(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5824(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5797(var7, var5, var6);
                        continue;
                    }
                    if (this.method5790() < 400) {
                        int var9 = this.method5790();
                        class358 var10 = (class358) this.method5810(var5, var6);
                        var10.field4170 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
