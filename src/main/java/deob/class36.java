package deob;

@ObfuscatedName("ap")
public class class36 extends class174 {

    @ObfuscatedName("ap.a")
    public static class170 field896 = new class170(64);

    @ObfuscatedName("ap.q")
    public int field897 = -1;

    @ObfuscatedName("ap.j")
    public int[] field898;

    @ObfuscatedName("ap.v")
    public short[] field893;

    @ObfuscatedName("ap.w")
    public short[] field900;

    @ObfuscatedName("ap.l")
    public short[] field901;

    @ObfuscatedName("ap.s")
    public short[] field908;

    @ObfuscatedName("ap.n")
    public int[] field903 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ap.c")
    public boolean field895 = false;

    @ObfuscatedName("l.x(Lej;Lej;I)V")
    public static void method89(class152 arg0, class152 arg1) {
        Statics.field907 = arg0;
        Statics.field894 = arg1;
        Statics.field909 = Statics.field907.method2929(3);
    }

    @ObfuscatedName("ai.p(II)Lap;")
    public static class36 method248(int arg0) {
        class36 var1 = (class36) field896.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field907.method2920(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method746(new class127(var2));
        }
        field896.method3197(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.k(Ldg;I)V")
    public void method746(class127 arg0) {
        while (true) {
            int var2 = arg0.method2484();
            if (var2 == 0) {
                return;
            }
            this.method735(arg0, var2);
        }
    }

    @ObfuscatedName("ap.a(Ldg;IB)V")
    public void method735(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field897 = arg0.method2484();
        } else if (arg1 == 2) {
            int var3 = arg0.method2484();
            this.field898 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field898[var4] = arg0.method2539();
            }
        } else if (arg1 == 3) {
            this.field895 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2484();
            this.field893 = new short[var5];
            this.field900 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field893[var6] = (short) arg0.method2539();
                this.field900[var6] = (short) arg0.method2539();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2484();
            this.field901 = new short[var7];
            this.field908 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field901[var8] = (short) arg0.method2539();
                this.field908[var8] = (short) arg0.method2539();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field903[arg1 - 60] = arg0.method2539();
        }
    }

    @ObfuscatedName("ap.q(B)Z")
    public boolean method736() {
        if (this.field898 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field898.length; var2++) {
            if (!Statics.field894.method2983(this.field898[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ap.j(I)Lcy;")
    public class101 method760() {
        if (this.field898 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field898.length];
        for (int var2 = 0; var2 < this.field898.length; var2++) {
            var1[var2] = class101.method2034(Statics.field894, this.field898[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field893 != null) {
            for (int var4 = 0; var4 < this.field893.length; var4++) {
                var3.method2016(this.field893[var4], this.field900[var4]);
            }
        }
        if (this.field901 != null) {
            for (int var5 = 0; var5 < this.field901.length; var5++) {
                var3.method2017(this.field901[var5], this.field908[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ap.v(I)Z")
    public boolean method738() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field903[var2] != -1 && !Statics.field894.method2983(this.field903[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ap.w(I)Lcy;")
    public class101 method739() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field903[var3] != -1) {
                var1[var2++] = class101.method2034(Statics.field894, this.field903[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field893 != null) {
            for (int var5 = 0; var5 < this.field893.length; var5++) {
                var4.method2016(this.field893[var5], this.field900[var5]);
            }
        }
        if (this.field901 != null) {
            for (int var6 = 0; var6 < this.field901.length; var6++) {
                var4.method2017(this.field901[var6], this.field908[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("s.l(I)V")
    public static void method100() {
        field896.method3198();
    }
}
