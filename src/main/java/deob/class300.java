package deob;

@ObfuscatedName("ky")
public class class300 extends class292 {

    @ObfuscatedName("ky.s")
    public final class335 field3735;

    @ObfuscatedName("ky.g")
    public final class295 field3736;

    @ObfuscatedName("ky.b")
    public String field3737 = null;

    @ObfuscatedName("ky.n")
    public String field3738 = null;

    @ObfuscatedName("ky.e")
    public byte field3739;

    @ObfuscatedName("ky.r")
    public int field3740;

    @ObfuscatedName("ky.t")
    public int field3741 = 1;

    public class300(class335 arg0, class295 arg1) {
        super(100);
        this.field3735 = arg0;
        this.field3736 = arg1;
    }

    @ObfuscatedName("ky.a(I)Lkn;")
    public class289 method5128() {
        return new class288();
    }

    @ObfuscatedName("ky.s(IB)[Lkn;")
    public class289[] method5130(int arg0) {
        return new class288[arg0];
    }

    @ObfuscatedName("ky.g(Ljava/lang/String;B)V")
    public final void method5261(String arg0) {
        this.field3737 = class310.method4730(arg0);
    }

    @ObfuscatedName("ky.n(Ljava/lang/String;I)V")
    public final void method5273(String arg0) {
        this.field3738 = class310.method4730(arg0);
    }

    @ObfuscatedName("ky.cr(Lgx;I)V")
    public final void method5286(class190 arg0) {
        this.method5273(arg0.method3647());
        long var2 = arg0.method3668();
        this.method5261(class310.method5299(var2));
        this.field3739 = arg0.method3599();
        int var4 = arg0.method3443();
        if (var4 == 255) {
            return;
        }
        this.method5200();
        for (int var5 = 0; var5 < var4; var5++) {
            class288 var6 = (class288) this.method5148(new class298(arg0.method3647(), this.field3735));
            int var7 = arg0.method3610();
            var6.method5217(var7, ++this.field3741 - 1);
            var6.field3711 = arg0.method3599();
            arg0.method3647();
            this.method5267(var6);
        }
    }

    @ObfuscatedName("ky.ck(Lgx;B)V")
    public final void method5264(class190 arg0) {
        class298 var2 = new class298(arg0.method3647(), this.field3735);
        int var3 = arg0.method3610();
        byte var4 = arg0.method3599();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5140() == 0) {
                return;
            }
            class288 var6 = (class288) this.method5174(var2);
            if (var6 != null && var6.method5216() == var3) {
                this.method5147(var6);
            }
            return;
        }
        arg0.method3647();
        class288 var7 = (class288) this.method5174(var2);
        if (var7 == null) {
            if (this.method5140() > this.field3703) {
                return;
            }
            var7 = (class288) this.method5148(var2);
        }
        var7.method5217(var3, ++this.field3741 - 1);
        var7.field3711 = var4;
        this.method5267(var7);
    }

    @ObfuscatedName("ky.cn(I)V")
    public final void method5275() {
        for (int var1 = 0; var1 < this.method5140(); var1++) {
            ((class288) this.method5207(var1)).method5076();
        }
    }

    @ObfuscatedName("ky.cw(I)V")
    public final void method5266() {
        for (int var1 = 0; var1 < this.method5140(); var1++) {
            ((class288) this.method5207(var1)).method5081();
        }
    }

    @ObfuscatedName("ky.cv(Lkm;I)V")
    public final void method5267(class288 arg0) {
        if (arg0.method5090().equals(this.field3736.method1194())) {
            this.field3740 = arg0.field3711;
        }
    }
}
