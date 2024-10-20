package deob;

@ObfuscatedName("aw")
public class class44 extends class204 {

    @ObfuscatedName("aw.y")
    public static class193 field987 = new class193(64);

    @ObfuscatedName("aw.u")
    public static class193 field974 = new class193(30);

    @ObfuscatedName("aw.k")
    public int field975;

    @ObfuscatedName("aw.j")
    public int field976;

    @ObfuscatedName("aw.i")
    public int field977 = -1;

    @ObfuscatedName("aw.x")
    public short[] field978;

    @ObfuscatedName("aw.g")
    public short[] field980;

    @ObfuscatedName("aw.e")
    public short[] field986;

    @ObfuscatedName("aw.p")
    public short[] field981;

    @ObfuscatedName("aw.a")
    public int field983 = 128;

    @ObfuscatedName("aw.v")
    public int field979 = 128;

    @ObfuscatedName("aw.c")
    public int field982 = 0;

    @ObfuscatedName("aw.s")
    public int field985 = 0;

    @ObfuscatedName("aw.r")
    public int field988 = 0;

    @ObfuscatedName("ai.m(II)Law;")
    public static class44 method875(int arg0) {
        class44 var1 = (class44) field987.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field984.method3080(13, arg0);
        class44 var3 = new class44();
        var3.field975 = arg0;
        if (var2 != null) {
            var3.method914(new class119(var2));
        }
        field987.method3539(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.l(Ldx;I)V")
    public void method914(class119 arg0) {
        while (true) {
            int var2 = arg0.method2562();
            if (var2 == 0) {
                return;
            }
            this.method926(arg0, var2);
        }
    }

    @ObfuscatedName("aw.y(Ldx;II)V")
    public void method926(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field976 = arg0.method2541();
        } else if (arg1 == 2) {
            this.field977 = arg0.method2541();
        } else if (arg1 == 4) {
            this.field983 = arg0.method2541();
        } else if (arg1 == 5) {
            this.field979 = arg0.method2541();
        } else if (arg1 == 6) {
            this.field982 = arg0.method2541();
        } else if (arg1 == 7) {
            this.field985 = arg0.method2562();
        } else if (arg1 == 8) {
            this.field988 = arg0.method2562();
        } else if (arg1 == 40) {
            int var3 = arg0.method2562();
            this.field978 = new short[var3];
            this.field980 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field978[var4] = (short) arg0.method2541();
                this.field980[var4] = (short) arg0.method2541();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2562();
            this.field986 = new short[var5];
            this.field981 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field986[var6] = (short) arg0.method2541();
                this.field981[var6] = (short) arg0.method2541();
            }
        }
    }

    @ObfuscatedName("aw.u(II)Ldb;")
    public final class105 method922(int arg0) {
        class105 var2 = (class105) field974.method3537((long) this.field975);
        if (var2 == null) {
            class100 var3 = class100.method2097(Statics.field971, this.field976, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field978 != null) {
                for (int var4 = 0; var4 < this.field978.length; var4++) {
                    var3.method2106(this.field978[var4], this.field980[var4]);
                }
            }
            if (this.field986 != null) {
                for (int var5 = 0; var5 < this.field986.length; var5++) {
                    var3.method2107(this.field986[var5], this.field981[var5]);
                }
            }
            var2 = var3.method2114(this.field985 + 64, this.field988 + 850, -30, -50, -30);
            field974.method3539(var2, (long) this.field975);
        }
        class105 var6;
        if (this.field977 == -1 || arg0 == -1) {
            var6 = var2.method2187(true);
        } else {
            var6 = class43.method2262(this.field977).method884(var2, arg0);
        }
        if (this.field983 != 128 || this.field979 != 128) {
            var6.method2224(this.field983, this.field979, this.field983);
        }
        if (this.field982 != 0) {
            if (this.field982 == 90) {
                var6.method2184();
            }
            if (this.field982 == 180) {
                var6.method2184();
                var6.method2184();
            }
            if (this.field982 == 270) {
                var6.method2184();
                var6.method2184();
                var6.method2184();
            }
        }
        return var6;
    }
}
