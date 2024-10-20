package deob;

@ObfuscatedName("ky")
public class class296 extends class291 {

    @ObfuscatedName("ky.l")
    public final class334 field3707;

    @ObfuscatedName("ky.d")
    public int field3710 = 1;

    @ObfuscatedName("ky.t")
    public class216 field3709 = new class216();

    public class296(class334 arg0) {
        super(400);
        this.field3707 = arg0;
    }

    @ObfuscatedName("ky.n(I)Lke;")
    public class288 method5155() {
        return new class298();
    }

    @ObfuscatedName("ky.h(IB)[Lke;")
    public class288[] method5156(int arg0) {
        return new class298[arg0];
    }

    @ObfuscatedName("ky.l(Lku;ZI)Z")
    public boolean method5250(class297 arg0, boolean arg1) {
        class298 var3 = (class298) this.method5217(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3701 != 0;
        }
    }

    @ObfuscatedName("ky.z(Lgc;II)V")
    public void method5249(class190 arg0, int arg1) {
        while (true) {
            if (arg0.field2423 < arg1) {
                boolean var3 = arg0.method3511() == 1;
                class297 var4 = new class297(arg0.method3520(), this.field3707);
                class297 var5 = new class297(arg0.method3520(), this.field3707);
                int var6 = arg0.method3513();
                int var7 = arg0.method3511();
                int var8 = arg0.method3511();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3520();
                    arg0.method3511();
                    arg0.method3562();
                }
                arg0.method3520();
                if (var4 != null && var4.method5264()) {
                    class298 var11 = (class298) this.method5211(var4);
                    if (var3) {
                        class298 var12 = (class298) this.method5211(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5167(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5164() >= 400) {
                            continue;
                        }
                        var11 = (class298) this.method5188(var4, var5);
                    } else {
                        this.method5183(var11, var4, var5);
                        if (var11.field3701 != var6) {
                            boolean var13 = true;
                            for (class300 var14 = (class300) this.field3709.method4034(); var14 != null; var14 = (class300) this.field3709.method4028()) {
                                if (var14.field3727.equals(var4)) {
                                    if (var6 != 0 && var14.field3729 == 0) {
                                        var14.method4036();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3729 != 0) {
                                        var14.method4036();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3709.method4035(new class300(var4, var6));
                            }
                        }
                    }
                    if (var11.field3701 != var6) {
                        var11.field3702 = ++this.field3710 - 1;
                        if (var11.field3701 == -1 && var6 == 0) {
                            var11.field3702 = -(var11.field3702 * -1475260303) * 1795190929;
                        }
                        var11.field3701 = var6;
                    }
                    var11.field3703 = var7;
                    var11.field3716 = var9;
                    var11.field3717 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5191();
            return;
        }
    }
}
