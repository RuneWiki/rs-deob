package deob;

@ObfuscatedName("jw")
public class class286 extends class287 {

    @ObfuscatedName("jw.q")
    public final class348 field3629;

    public class286(class348 arg0) {
        super(400);
        this.field3629 = arg0;
    }

    @ObfuscatedName("jw.m(I)Ljf;")
    public class284 method4806() {
        return new class288();
    }

    @ObfuscatedName("jw.o(II)[Ljf;")
    public class284[] method4805(int arg0) {
        return new class288[arg0];
    }

    @ObfuscatedName("jw.q(Lkn;IB)V")
    public void method4807(class310 arg0, int arg1) {
        while (true) {
            if (arg0.field3734 < arg1) {
                int var3 = arg0.method5227();
                boolean var4 = (var3 & 0x1) == 1;
                class293 var5 = new class293(arg0.method5236(), this.field3629);
                class293 var6 = new class293(arg0.method5236(), this.field3629);
                arg0.method5236();
                if (var5 != null && var5.method4926()) {
                    class288 var7 = (class288) this.method4886(var5);
                    if (var4) {
                        class288 var8 = (class288) this.method4886(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4819(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4829(var7, var5, var6);
                        continue;
                    }
                    if (this.method4860() < 400) {
                        int var9 = this.method4860();
                        class288 var10 = (class288) this.method4861(var5, var6);
                        var10.field3640 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
