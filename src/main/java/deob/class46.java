package deob;

@ObfuscatedName("at")
public class class46 extends class208 {

    @ObfuscatedName("at.t")
    public static class197 field989 = new class197(64);

    @ObfuscatedName("at.y")
    public static class197 field1004 = new class197(30);

    @ObfuscatedName("at.p")
    public int field1001;

    @ObfuscatedName("at.g")
    public int field991;

    @ObfuscatedName("at.m")
    public int field992 = -1;

    @ObfuscatedName("at.f")
    public short[] field988;

    @ObfuscatedName("at.k")
    public short[] field987;

    @ObfuscatedName("at.h")
    public short[] field995;

    @ObfuscatedName("at.r")
    public short[] field996;

    @ObfuscatedName("at.w")
    public int field997 = 128;

    @ObfuscatedName("at.u")
    public int field998 = 128;

    @ObfuscatedName("at.n")
    public int field999 = 0;

    @ObfuscatedName("at.d")
    public int field1000 = 0;

    @ObfuscatedName("at.a")
    public int field993 = 0;

    @ObfuscatedName("dt.z(IB)Lat;")
    public static class46 method2163(int arg0) {
        class46 var1 = (class46) field989.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field990.method3091(13, arg0);
        class46 var3 = new class46();
        var3.field1001 = arg0;
        if (var2 != null) {
            var3.method899(new class123(var2));
        }
        field989.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.t(Ldy;I)V")
    public void method899(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method897(arg0, var2);
        }
    }

    @ObfuscatedName("at.y(Ldy;IS)V")
    public void method897(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field991 = arg0.method2550();
        } else if (arg1 == 2) {
            this.field992 = arg0.method2550();
        } else if (arg1 == 4) {
            this.field997 = arg0.method2550();
        } else if (arg1 == 5) {
            this.field998 = arg0.method2550();
        } else if (arg1 == 6) {
            this.field999 = arg0.method2550();
        } else if (arg1 == 7) {
            this.field1000 = arg0.method2363();
        } else if (arg1 == 8) {
            this.field993 = arg0.method2363();
        } else if (arg1 == 40) {
            int var3 = arg0.method2363();
            this.field988 = new short[var3];
            this.field987 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field988[var4] = (short) arg0.method2550();
                this.field987[var4] = (short) arg0.method2550();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2363();
            this.field995 = new short[var5];
            this.field996 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field995[var6] = (short) arg0.method2550();
                this.field996[var6] = (short) arg0.method2550();
            }
        }
    }

    @ObfuscatedName("at.p(II)Lde;")
    public final class109 method900(int arg0) {
        class109 var2 = (class109) field1004.method3523((long) this.field1001);
        if (var2 == null) {
            class104 var3 = class104.method2078(Statics.field2956, this.field991, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field988 != null) {
                for (int var4 = 0; var4 < this.field988.length; var4++) {
                    var3.method2091(this.field988[var4], this.field987[var4]);
                }
            }
            if (this.field995 != null) {
                for (int var5 = 0; var5 < this.field995.length; var5++) {
                    var3.method2128(this.field995[var5], this.field996[var5]);
                }
            }
            var2 = var3.method2097(this.field1000 + 64, this.field993 + 850, -30, -50, -30);
            field1004.method3521(var2, (long) this.field1001);
        }
        class109 var6;
        if (this.field992 == -1 || arg0 == -1) {
            var6 = var2.method2187(true);
        } else {
            var6 = class45.method44(this.field992).method868(var2, arg0);
        }
        if (this.field997 != 128 || this.field998 != 128) {
            var6.method2223(this.field997, this.field998, this.field997);
        }
        if (this.field999 != 0) {
            if (this.field999 == 90) {
                var6.method2217();
            }
            if (this.field999 == 180) {
                var6.method2217();
                var6.method2217();
            }
            if (this.field999 == 270) {
                var6.method2217();
                var6.method2217();
                var6.method2217();
            }
        }
        return var6;
    }
}
