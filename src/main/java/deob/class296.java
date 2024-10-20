package deob;

@ObfuscatedName("ko")
public class class296 extends class288 {

    @ObfuscatedName("ko.r")
    public final class331 field3728;

    @ObfuscatedName("ko.e")
    public final class291 field3729;

    @ObfuscatedName("ko.i")
    public String field3727 = null;

    @ObfuscatedName("ko.p")
    public String field3731 = null;

    @ObfuscatedName("ko.m")
    public byte field3732;

    @ObfuscatedName("ko.d")
    public int field3733;

    @ObfuscatedName("ko.j")
    public int field3730 = 1;

    public class296(class331 arg0, class291 arg1) {
        super(100);
        this.field3728 = arg0;
        this.field3729 = arg1;
    }

    @ObfuscatedName("ko.g(I)Ljr;")
    public class285 method5158() {
        return new class284();
    }

    @ObfuscatedName("ko.r(II)[Ljr;")
    public class285[] method5159(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("ko.e(Ljava/lang/String;I)V")
    public final void method5296(String arg0) {
        this.field3727 = class306.method5144(arg0);
    }

    @ObfuscatedName("ko.d(Ljava/lang/String;I)V")
    public final void method5314(String arg0) {
        this.field3731 = class306.method5144(arg0);
    }

    @ObfuscatedName("ko.j(Lgl;I)V")
    public final void method5298(class185 arg0) {
        this.method5314(arg0.method3474());
        long var2 = arg0.method3471();
        this.method5296(Statics.method3310(var2));
        this.field3732 = arg0.method3627();
        int var4 = arg0.method3679();
        if (var4 == 255) {
            return;
        }
        this.method5171();
        for (int var5 = 0; var5 < var4; var5++) {
            class284 var6 = (class284) this.method5242(new class294(arg0.method3474(), this.field3728));
            int var7 = arg0.method3467();
            var6.method5251(var7, ++this.field3730 - 1);
            var6.field3711 = arg0.method3627();
            arg0.method3474();
            this.method5301(var6);
        }
    }

    @ObfuscatedName("ko.x(Lgl;B)V")
    public final void method5299(class185 arg0) {
        class294 var2 = new class294(arg0.method3474(), this.field3728);
        int var3 = arg0.method3467();
        byte var4 = arg0.method3627();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5172() == 0) {
                return;
            }
            class284 var6 = (class284) this.method5176(var2);
            if (var6 != null && var6.method5250() == var3) {
                this.method5220(var6);
            }
            return;
        }
        arg0.method3474();
        class284 var7 = (class284) this.method5176(var2);
        if (var7 == null) {
            if (this.method5172() > this.field3705) {
                return;
            }
            var7 = (class284) this.method5242(var2);
        }
        var7.method5251(var3, ++this.field3730 - 1);
        var7.field3711 = var4;
        this.method5301(var7);
    }

    @ObfuscatedName("ko.v(I)V")
    public final void method5294() {
        for (int var1 = 0; var1 < this.method5172(); var1++) {
            ((class284) this.method5181(var1)).method5107();
        }
    }

    @ObfuscatedName("ko.co(I)V")
    public final void method5300() {
        for (int var1 = 0; var1 < this.method5172(); var1++) {
            ((class284) this.method5181(var1)).method5110();
        }
    }

    @ObfuscatedName("ko.ck(Ljm;B)V")
    public final void method5301(class284 arg0) {
        if (arg0.method5128().equals(this.field3729.method1172())) {
            this.field3733 = arg0.field3711;
        }
    }
}
