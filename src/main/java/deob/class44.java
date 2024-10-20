package deob;

@ObfuscatedName("at")
public class class44 extends class205 {

    @ObfuscatedName("at.m")
    public static class194 field990 = new class194(64);

    @ObfuscatedName("at.z")
    public static class194 field991 = new class194(30);

    @ObfuscatedName("at.x")
    public int field1000;

    @ObfuscatedName("at.e")
    public int field1002;

    @ObfuscatedName("at.i")
    public int field994 = -1;

    @ObfuscatedName("at.c")
    public short[] field995;

    @ObfuscatedName("at.n")
    public short[] field996;

    @ObfuscatedName("at.l")
    public short[] field1003;

    @ObfuscatedName("at.u")
    public short[] field998;

    @ObfuscatedName("at.r")
    public int field999 = 128;

    @ObfuscatedName("at.a")
    public int field1007 = 128;

    @ObfuscatedName("at.d")
    public int field1001 = 0;

    @ObfuscatedName("at.p")
    public int field992 = 0;

    @ObfuscatedName("at.q")
    public int field997 = 0;

    @ObfuscatedName("w.j(II)Lat;")
    public static class44 method236(int arg0) {
        class44 var1 = (class44) field990.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3173.method3011(13, arg0);
        class44 var3 = new class44();
        var3.field1000 = arg0;
        if (var2 != null) {
            var3.method873(new class120(var2));
        }
        field990.method3462(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.h(Ldx;I)V")
    public void method873(class120 arg0) {
        while (true) {
            int var2 = arg0.method2361();
            if (var2 == 0) {
                return;
            }
            this.method874(arg0, var2);
        }
    }

    @ObfuscatedName("at.m(Ldx;II)V")
    public void method874(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1002 = arg0.method2363();
        } else if (arg1 == 2) {
            this.field994 = arg0.method2363();
        } else if (arg1 == 4) {
            this.field999 = arg0.method2363();
        } else if (arg1 == 5) {
            this.field1007 = arg0.method2363();
        } else if (arg1 == 6) {
            this.field1001 = arg0.method2363();
        } else if (arg1 == 7) {
            this.field992 = arg0.method2361();
        } else if (arg1 == 8) {
            this.field997 = arg0.method2361();
        } else if (arg1 == 40) {
            int var3 = arg0.method2361();
            this.field995 = new short[var3];
            this.field996 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field995[var4] = (short) arg0.method2363();
                this.field996[var4] = (short) arg0.method2363();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2361();
            this.field1003 = new short[var5];
            this.field998 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1003[var6] = (short) arg0.method2363();
                this.field998[var6] = (short) arg0.method2363();
            }
        }
    }

    @ObfuscatedName("at.z(II)Ldf;")
    public final class106 method875(int arg0) {
        class106 var2 = (class106) field991.method3460((long) this.field1000);
        if (var2 == null) {
            class101 var3 = class101.method2069(Statics.field1005, this.field1002, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field995 != null) {
                for (int var4 = 0; var4 < this.field995.length; var4++) {
                    var3.method2073(this.field995[var4], this.field996[var4]);
                }
            }
            if (this.field1003 != null) {
                for (int var5 = 0; var5 < this.field1003.length; var5++) {
                    var3.method2085(this.field1003[var5], this.field998[var5]);
                }
            }
            var2 = var3.method2089(this.field992 + 64, this.field997 + 850, -30, -50, -30);
            field991.method3462(var2, (long) this.field1000);
        }
        class106 var6;
        if (this.field994 == -1 || arg0 == -1) {
            var6 = var2.method2158(true);
        } else {
            var6 = class43.method2947(this.field994).method840(var2, arg0);
        }
        if (this.field999 != 128 || this.field1007 != 128) {
            var6.method2192(this.field999, this.field1007, this.field999);
        }
        if (this.field1001 != 0) {
            if (this.field1001 == 90) {
                var6.method2164();
            }
            if (this.field1001 == 180) {
                var6.method2164();
                var6.method2164();
            }
            if (this.field1001 == 270) {
                var6.method2164();
                var6.method2164();
                var6.method2164();
            }
        }
        return var6;
    }

    @ObfuscatedName("n.x(I)V")
    public static void method119() {
        field990.method3463();
        field991.method3463();
    }
}
