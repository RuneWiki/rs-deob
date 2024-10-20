package deob;

@ObfuscatedName("nr")
public class class366 extends class373 {

    @ObfuscatedName("nr.i")
    public final class422 field4233;

    @ObfuscatedName("nr.f")
    public int field4236 = 1;

    @ObfuscatedName("nr.b")
    public class338 field4235 = new class338();

    public class366(class422 arg0) {
        super(400);
        this.field4233 = arg0;
    }

    @ObfuscatedName("nr.v(I)Lnn;")
    public class371 method6030() {
        return new class367();
    }

    @ObfuscatedName("nr.c(II)[Lnn;")
    public class371[] method6037(int arg0) {
        return new class367[arg0];
    }

    @ObfuscatedName("nr.i(Lqb;ZB)Z")
    public boolean method6040(class459 arg0, boolean arg1) {
        class367 var3 = (class367) this.method6132(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4269 != 0;
        }
    }

    @ObfuscatedName("nr.n(Lpi;II)V")
    public void method6041(class438 arg0, int arg1) {
        while (true) {
            if (arg0.field4621 < arg1) {
                boolean var3 = arg0.method6971() == 1;
                class459 var4 = new class459(arg0.method6981(), this.field4233);
                class459 var5 = new class459(arg0.method6981(), this.field4233);
                int var6 = arg0.method7148();
                int var7 = arg0.method6971();
                int var8 = arg0.method6971();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method6981();
                    arg0.method6971();
                    arg0.method6976();
                }
                arg0.method6981();
                if (var4 != null && var4.method7524()) {
                    class367 var11 = (class367) this.method6174(var4);
                    if (var3) {
                        class367 var12 = (class367) this.method6174(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method6136(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method6129() >= 400) {
                            continue;
                        }
                        var11 = (class367) this.method6138(var4, var5);
                    } else {
                        this.method6127(var11, var4, var5);
                        if (var11.field4269 != var6) {
                            boolean var13 = true;
                            for (class369 var14 = (class369) this.field4235.method5644(); var14 != null; var14 = (class369) this.field4235.method5647()) {
                                if (var14.field4248.equals(var4)) {
                                    if (var6 != 0 && var14.field4249 == 0) {
                                        var14.method6495();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4249 != 0) {
                                        var14.method6495();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4235.method5643(new class369(var4, var6));
                            }
                        }
                    }
                    if (var11.field4269 != var6) {
                        var11.field4268 = ++this.field4236 - 1;
                        if (var11.field4269 == -1 && var6 == 0) {
                            var11.field4268 = -(var11.field4268 * 859703757) * -1261040891;
                        }
                        var11.field4269 = var6;
                    }
                    var11.field4267 = var7;
                    var11.field4238 = var9;
                    var11.field4237 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method6161();
            return;
        }
    }
}
