package deob;

@ObfuscatedName("jf")
public class class277 extends class278 {

    @ObfuscatedName("jf.o")
    public final class339 field3588;

    public class277(class339 arg0) {
        super(400);
        this.field3588 = arg0;
    }

    @ObfuscatedName("jf.c(S)Ljk;")
    public class275 method4721() {
        return new class279();
    }

    @ObfuscatedName("jf.t(IB)[Ljk;")
    public class275[] method4722(int arg0) {
        return new class279[arg0];
    }

    @ObfuscatedName("jf.o(Lkp;II)V")
    public void method4726(class301 arg0, int arg1) {
        while (true) {
            if (arg0.field3707 < arg1) {
                int var3 = arg0.method5129();
                boolean var4 = (var3 & 0x1) == 1;
                class284 var5 = new class284(arg0.method5138(), this.field3588);
                class284 var6 = new class284(arg0.method5138(), this.field3588);
                arg0.method5138();
                if (var5 != null && var5.method4830()) {
                    class279 var7 = (class279) this.method4737(var5);
                    if (var4) {
                        class279 var8 = (class279) this.method4737(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4740(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4738(var7, var5, var6);
                        continue;
                    }
                    if (this.method4787() < 400) {
                        int var9 = this.method4787();
                        class279 var10 = (class279) this.method4742(var5, var6);
                        var10.field3598 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
