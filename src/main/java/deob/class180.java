package deob;

@ObfuscatedName("fh")
public class class180 extends class406 {

    @ObfuscatedName("fh.w")
    public static class256 field1955 = new class256(64);

    @ObfuscatedName("fh.v")
    public static class256 field1958 = new class256(30);

    @ObfuscatedName("fh.c")
    public int field1959;

    @ObfuscatedName("fh.q")
    public int field1969;

    @ObfuscatedName("fh.i")
    public int field1961 = -1;

    @ObfuscatedName("fh.k")
    public short[] field1962;

    @ObfuscatedName("fh.o")
    public short[] field1963;

    @ObfuscatedName("fh.n")
    public short[] field1964;

    @ObfuscatedName("fh.d")
    public short[] field1965;

    @ObfuscatedName("fh.a")
    public int field1967 = 128;

    @ObfuscatedName("fh.m")
    public int field1960 = 128;

    @ObfuscatedName("fh.u")
    public int field1968 = 0;

    @ObfuscatedName("fh.l")
    public int field1970 = 0;

    @ObfuscatedName("fh.z")
    public int field1957 = 0;

    @ObfuscatedName("nk.s(II)Lfh;")
    public static class180 method6177(int arg0) {
        class180 var1 = (class180) field1955.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1966.method5179(13, arg0);
        class180 var3 = new class180();
        var3.field1959 = arg0;
        if (var2 != null) {
            var3.method3107(new class444(var2));
        }
        field1955.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fh.h(Lqr;I)V")
    public void method3107(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method3120(arg0, var2);
        }
    }

    @ObfuscatedName("fh.w(Lqr;II)V")
    public void method3120(class444 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1969 = arg0.method7120();
        } else if (arg1 == 2) {
            this.field1961 = arg0.method7120();
        } else if (arg1 == 4) {
            this.field1967 = arg0.method7120();
        } else if (arg1 == 5) {
            this.field1960 = arg0.method7120();
        } else if (arg1 == 6) {
            this.field1968 = arg0.method7120();
        } else if (arg1 == 7) {
            this.field1970 = arg0.method6929();
        } else if (arg1 == 8) {
            this.field1957 = arg0.method6929();
        } else if (arg1 == 40) {
            int var3 = arg0.method6929();
            this.field1962 = new short[var3];
            this.field1963 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1962[var4] = (short) arg0.method7120();
                this.field1963[var4] = (short) arg0.method7120();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6929();
            this.field1964 = new short[var5];
            this.field1965 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1964[var6] = (short) arg0.method7120();
                this.field1965[var6] = (short) arg0.method7120();
            }
        }
    }

    @ObfuscatedName("fh.v(II)Lhp;")
    public final class211 method3109(int arg0) {
        class211 var2 = (class211) field1958.method4599((long) this.field1959);
        if (var2 == null) {
            class196 var3 = class196.method3512(Statics.field1956, this.field1969, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1962 != null) {
                for (int var4 = 0; var4 < this.field1962.length; var4++) {
                    var3.method3497(this.field1962[var4], this.field1963[var4]);
                }
            }
            if (this.field1964 != null) {
                for (int var5 = 0; var5 < this.field1964.length; var5++) {
                    var3.method3500(this.field1964[var5], this.field1965[var5]);
                }
            }
            var2 = var3.method3565(this.field1970 + 64, this.field1957 + 850, -30, -50, -30);
            field1958.method4600(var2, (long) this.field1959);
        }
        class211 var6;
        if (this.field1961 == -1 || arg0 == -1) {
            var6 = var2.method3927(true);
        } else {
            var6 = class190.method5853(this.field1961).method3384(var2, arg0);
        }
        if (this.field1967 != 128 || this.field1960 != 128) {
            var6.method3947(this.field1967, this.field1960, this.field1967);
        }
        if (this.field1968 != 0) {
            if (this.field1968 == 90) {
                var6.method3942();
            }
            if (this.field1968 == 180) {
                var6.method3942();
                var6.method3942();
            }
            if (this.field1968 == 270) {
                var6.method3942();
                var6.method3942();
                var6.method3942();
            }
        }
        return var6;
    }
}
