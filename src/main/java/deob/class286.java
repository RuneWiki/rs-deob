package deob;

@ObfuscatedName("jb")
public class class286 extends class287 {

    @ObfuscatedName("jb.k")
    public final class348 field3597;

    public class286(class348 arg0) {
        super(400);
        this.field3597 = arg0;
    }

    @ObfuscatedName("jb.x(I)Ljd;")
    public class284 method4730() {
        return new class288();
    }

    @ObfuscatedName("jb.m(II)[Ljd;")
    public class284[] method4731(int arg0) {
        return new class288[arg0];
    }

    @ObfuscatedName("jb.k(Lkb;II)V")
    public void method4740(class310 arg0, int arg1) {
        while (true) {
            if (arg0.field3711 < arg1) {
                int var3 = arg0.method5137();
                boolean var4 = (var3 & 0x1) == 1;
                class293 var5 = new class293(arg0.method5257(), this.field3597);
                class293 var6 = new class293(arg0.method5257(), this.field3597);
                arg0.method5257();
                if (var5 != null && var5.method4846()) {
                    class288 var7 = (class288) this.method4747(var5);
                    if (var4) {
                        class288 var8 = (class288) this.method4747(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4817(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4755(var7, var5, var6);
                        continue;
                    }
                    if (this.method4743() < 400) {
                        int var9 = this.method4743();
                        class288 var10 = (class288) this.method4806(var5, var6);
                        var10.field3609 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
