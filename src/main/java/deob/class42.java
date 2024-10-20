package deob;

@ObfuscatedName("aw")
public class class42 extends class198 {

    @ObfuscatedName("aw.z")
    public static class187 field987 = new class187(64);

    @ObfuscatedName("aw.l")
    public static class187 field990 = new class187(30);

    @ObfuscatedName("aw.w")
    public int field989;

    @ObfuscatedName("aw.d")
    public int field1002;

    @ObfuscatedName("aw.f")
    public int field991 = -1;

    @ObfuscatedName("aw.i")
    public short[] field992;

    @ObfuscatedName("aw.a")
    public short[] field993;

    @ObfuscatedName("aw.o")
    public short[] field986;

    @ObfuscatedName("aw.u")
    public short[] field995;

    @ObfuscatedName("aw.m")
    public int field988 = 128;

    @ObfuscatedName("aw.e")
    public int field997 = 128;

    @ObfuscatedName("aw.v")
    public int field998 = 0;

    @ObfuscatedName("aw.r")
    public int field996 = 0;

    @ObfuscatedName("aw.t")
    public int field1001 = 0;

    @ObfuscatedName("ad.j(Lfh;Lfh;I)V")
    public static void method691(class161 arg0, class161 arg1) {
        Statics.field662 = arg0;
        Statics.field999 = arg1;
    }

    @ObfuscatedName("o.y(IB)Law;")
    public static class42 method122(int arg0) {
        class42 var1 = (class42) field987.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field662.method2995(13, arg0);
        class42 var3 = new class42();
        var3.field989 = arg0;
        if (var2 != null) {
            var3.method886(new class114(var2));
        }
        field987.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.z(Lde;I)V")
    public void method886(class114 arg0) {
        while (true) {
            int var2 = arg0.method2322();
            if (var2 == 0) {
                return;
            }
            this.method887(arg0, var2);
        }
    }

    @ObfuscatedName("aw.l(Lde;IB)V")
    public void method887(class114 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1002 = arg0.method2324();
        } else if (arg1 == 2) {
            this.field991 = arg0.method2324();
        } else if (arg1 == 4) {
            this.field988 = arg0.method2324();
        } else if (arg1 == 5) {
            this.field997 = arg0.method2324();
        } else if (arg1 == 6) {
            this.field998 = arg0.method2324();
        } else if (arg1 == 7) {
            this.field996 = arg0.method2322();
        } else if (arg1 == 8) {
            this.field1001 = arg0.method2322();
        } else if (arg1 == 40) {
            int var3 = arg0.method2322();
            this.field992 = new short[var3];
            this.field993 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field992[var4] = (short) arg0.method2324();
                this.field993[var4] = (short) arg0.method2324();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2322();
            this.field986 = new short[var5];
            this.field995 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field986[var6] = (short) arg0.method2324();
                this.field995[var6] = (short) arg0.method2324();
            }
        }
    }

    @ObfuscatedName("aw.w(II)Lcw;")
    public final class103 method888(int arg0) {
        class103 var2 = (class103) field990.method3432((long) this.field989);
        if (var2 == null) {
            class98 var3 = class98.method2092(Statics.field999, this.field1002, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field992 != null) {
                for (int var4 = 0; var4 < this.field992.length; var4++) {
                    var3.method2140(this.field992[var4], this.field993[var4]);
                }
            }
            if (this.field986 != null) {
                for (int var5 = 0; var5 < this.field986.length; var5++) {
                    var3.method2087(this.field986[var5], this.field995[var5]);
                }
            }
            var2 = var3.method2094(this.field996 + 64, this.field1001 + 850, -30, -50, -30);
            field990.method3434(var2, (long) this.field989);
        }
        class103 var6;
        if (this.field991 == -1 || arg0 == -1) {
            var6 = var2.method2210(true);
        } else {
            var6 = class41.method1016(this.field991).method867(var2, arg0);
        }
        if (this.field988 != 128 || this.field997 != 128) {
            var6.method2201(this.field988, this.field997, this.field988);
        }
        if (this.field998 != 0) {
            if (this.field998 == 90) {
                var6.method2176();
            }
            if (this.field998 == 180) {
                var6.method2176();
                var6.method2176();
            }
            if (this.field998 == 270) {
                var6.method2176();
                var6.method2176();
                var6.method2176();
            }
        }
        return var6;
    }
}
