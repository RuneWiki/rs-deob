package deob;

@ObfuscatedName("fc")
public class class158 extends class143 {

    @ObfuscatedName("fc.k")
    public static class101 field2394 = new class101(64);

    @ObfuscatedName("fc.u")
    public int field2395 = -1;

    @ObfuscatedName("fc.v")
    public int[] field2396;

    @ObfuscatedName("fc.f")
    public short[] field2397;

    @ObfuscatedName("fc.s")
    public short[] field2401;

    @ObfuscatedName("fc.j")
    public short[] field2399;

    @ObfuscatedName("fc.e")
    public short[] field2391;

    @ObfuscatedName("fc.t")
    public int[] field2402 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("fc.y")
    public boolean field2398 = false;

    @ObfuscatedName("bc.k(II)Lfc;")
    public static class158 method767(int arg0) {
        class158 var1 = (class158) field2394.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2400.method1024(3, arg0);
        class158 var3 = new class158();
        if (var2 != null) {
            var3.method2469(new class136(var2));
        }
        field2394.method1238(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fc.u(Let;B)V")
    public void method2469(class136 arg0) {
        while (true) {
            int var2 = arg0.method1602();
            if (var2 == 0) {
                return;
            }
            this.method2470(arg0, var2);
        }
    }

    @ObfuscatedName("fc.v(Let;II)V")
    public void method2470(class136 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2395 = arg0.method1602();
        } else if (arg1 == 2) {
            int var3 = arg0.method1602();
            this.field2396 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2396[var4] = arg0.method1712();
            }
        } else if (arg1 == 3) {
            this.field2398 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method1602();
            this.field2397 = new short[var5];
            this.field2401 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2397[var6] = (short) arg0.method1712();
                this.field2401[var6] = (short) arg0.method1712();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method1602();
            this.field2399 = new short[var7];
            this.field2391 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2399[var8] = (short) arg0.method1712();
                this.field2391[var8] = (short) arg0.method1712();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2402[arg1 - 60] = arg0.method1712();
        }
    }

    @ObfuscatedName("fc.f(B)Z")
    public boolean method2489() {
        if (this.field2396 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2396.length; var2++) {
            if (!Statics.field2392.method1020(this.field2396[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fc.s(I)Lfy;")
    public class180 method2472() {
        if (this.field2396 == null) {
            return null;
        }
        class180[] var1 = new class180[this.field2396.length];
        for (int var2 = 0; var2 < this.field2396.length; var2++) {
            var1[var2] = class180.method2918(Statics.field2392, this.field2396[var2], 0);
        }
        class180 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class180(var1, var1.length);
        }
        if (this.field2397 != null) {
            for (int var4 = 0; var4 < this.field2397.length; var4++) {
                var3.method2930(this.field2397[var4], this.field2401[var4]);
            }
        }
        if (this.field2399 != null) {
            for (int var5 = 0; var5 < this.field2399.length; var5++) {
                var3.method2991(this.field2399[var5], this.field2391[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("fc.j(B)Z")
    public boolean method2473() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2402[var2] != -1 && !Statics.field2392.method1020(this.field2402[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fc.e(I)Lfy;")
    public class180 method2493() {
        class180[] var1 = new class180[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2402[var3] != -1) {
                var1[var2++] = class180.method2918(Statics.field2392, this.field2402[var3], 0);
            }
        }
        class180 var4 = new class180(var1, var2);
        if (this.field2397 != null) {
            for (int var5 = 0; var5 < this.field2397.length; var5++) {
                var4.method2930(this.field2397[var5], this.field2401[var5]);
            }
        }
        if (this.field2399 != null) {
            for (int var6 = 0; var6 < this.field2399.length; var6++) {
                var4.method2991(this.field2399[var6], this.field2391[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("a.t(I)V")
    public static void method39() {
        field2394.method1239();
    }
}
