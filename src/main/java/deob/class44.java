package deob;

@ObfuscatedName("av")
public class class44 extends class205 {

    @ObfuscatedName("av.j")
    public static class194 field985 = new class194(64);

    @ObfuscatedName("av.d")
    public static class194 field994 = new class194(30);

    @ObfuscatedName("av.x")
    public int field989;

    @ObfuscatedName("av.y")
    public int field990;

    @ObfuscatedName("av.r")
    public int field991 = -1;

    @ObfuscatedName("av.c")
    public short[] field992;

    @ObfuscatedName("av.l")
    public short[] field995;

    @ObfuscatedName("av.u")
    public short[] field1001;

    @ObfuscatedName("av.p")
    public short[] field999;

    @ObfuscatedName("av.n")
    public int field1005 = 128;

    @ObfuscatedName("av.w")
    public int field997 = 128;

    @ObfuscatedName("av.z")
    public int field998 = 0;

    @ObfuscatedName("av.k")
    public int field993 = 0;

    @ObfuscatedName("av.o")
    public int field1000 = 0;

    @ObfuscatedName("af.b(IB)Lav;")
    public static class44 method701(int arg0) {
        class44 var1 = (class44) field985.method3495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1002.method3037(13, arg0);
        class44 var3 = new class44();
        var3.field989 = arg0;
        if (var2 != null) {
            var3.method892(new class120(var2));
        }
        field985.method3490(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.g(Lds;I)V")
    public void method892(class120 arg0) {
        while (true) {
            int var2 = arg0.method2344();
            if (var2 == 0) {
                return;
            }
            this.method888(arg0, var2);
        }
    }

    @ObfuscatedName("av.j(Lds;II)V")
    public void method888(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field990 = arg0.method2346();
        } else if (arg1 == 2) {
            this.field991 = arg0.method2346();
        } else if (arg1 == 4) {
            this.field1005 = arg0.method2346();
        } else if (arg1 == 5) {
            this.field997 = arg0.method2346();
        } else if (arg1 == 6) {
            this.field998 = arg0.method2346();
        } else if (arg1 == 7) {
            this.field993 = arg0.method2344();
        } else if (arg1 == 8) {
            this.field1000 = arg0.method2344();
        } else if (arg1 == 40) {
            int var3 = arg0.method2344();
            this.field992 = new short[var3];
            this.field995 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field992[var4] = (short) arg0.method2346();
                this.field995[var4] = (short) arg0.method2346();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2344();
            this.field1001 = new short[var5];
            this.field999 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1001[var6] = (short) arg0.method2346();
                this.field999[var6] = (short) arg0.method2346();
            }
        }
    }

    @ObfuscatedName("av.d(IB)Ldd;")
    public final class106 method889(int arg0) {
        class106 var2 = (class106) field994.method3495((long) this.field989);
        if (var2 == null) {
            class101 var3 = class101.method2051(Statics.field986, this.field990, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field992 != null) {
                for (int var4 = 0; var4 < this.field992.length; var4++) {
                    var3.method2064(this.field992[var4], this.field995[var4]);
                }
            }
            if (this.field1001 != null) {
                for (int var5 = 0; var5 < this.field1001.length; var5++) {
                    var3.method2065(this.field1001[var5], this.field999[var5]);
                }
            }
            var2 = var3.method2072(this.field993 + 64, this.field1000 + 850, -30, -50, -30);
            field994.method3490(var2, (long) this.field989);
        }
        class106 var6;
        if (this.field991 == -1 || arg0 == -1) {
            var6 = var2.method2140(true);
        } else {
            var6 = class43.method175(this.field991).method852(var2, arg0);
        }
        if (this.field1005 != 128 || this.field997 != 128) {
            var6.method2153(this.field1005, this.field997, this.field1005);
        }
        if (this.field998 != 0) {
            if (this.field998 == 90) {
                var6.method2148();
            }
            if (this.field998 == 180) {
                var6.method2148();
                var6.method2148();
            }
            if (this.field998 == 270) {
                var6.method2148();
                var6.method2148();
                var6.method2148();
            }
        }
        return var6;
    }
}
