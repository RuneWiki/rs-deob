package deob;

@ObfuscatedName("jf")
public class class277 extends class278 {

    @ObfuscatedName("jf.e")
    public final class339 field3619;

    public class277(class339 arg0) {
        super(400);
        this.field3619 = arg0;
    }

    @ObfuscatedName("jf.q(I)Ljd;")
    public class275 method4683() {
        return new class279();
    }

    @ObfuscatedName("jf.w(II)[Ljd;")
    public class275[] method4685(int arg0) {
        return new class279[arg0];
    }

    @ObfuscatedName("jf.e(Lkf;II)V")
    public void method4690(class301 arg0, int arg1) {
        while (true) {
            if (arg0.field3733 < arg1) {
                int var3 = arg0.method5077();
                boolean var4 = (var3 & 0x1) == 1;
                class284 var5 = new class284(arg0.method5076(), this.field3619);
                class284 var6 = new class284(arg0.method5076(), this.field3619);
                arg0.method5076();
                if (var5 != null && var5.method4798()) {
                    class279 var7 = (class279) this.method4746(var5);
                    if (var4) {
                        class279 var8 = (class279) this.method4746(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4700(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4697(var7, var5, var6);
                        continue;
                    }
                    if (this.method4694() < 400) {
                        int var9 = this.method4694();
                        class279 var10 = (class279) this.method4702(var5, var6);
                        var10.field3631 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
