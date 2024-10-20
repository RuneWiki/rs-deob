package deob;

@ObfuscatedName("an")
public class class41 extends class185 {

    @ObfuscatedName("an.e")
    public static class174 field958 = new class174(64);

    @ObfuscatedName("an.r")
    public int field959 = -1;

    @ObfuscatedName("an.a")
    public int[] field973;

    @ObfuscatedName("an.n")
    public short[] field961;

    @ObfuscatedName("an.x")
    public short[] field967;

    @ObfuscatedName("an.g")
    public short[] field963;

    @ObfuscatedName("an.o")
    public short[] field972;

    @ObfuscatedName("an.p")
    public int[] field965 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("an.v")
    public boolean field966 = false;

    @ObfuscatedName("av.f(Lev;Lev;I)V")
    public static void method647(class149 arg0, class149 arg1) {
        Statics.field956 = arg0;
        Statics.field964 = arg1;
        Statics.field957 = Statics.field956.method2773(3);
    }

    @ObfuscatedName("ez.k(II)Lan;")
    public static class41 method2874(int arg0) {
        class41 var1 = (class41) field958.method3207((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field956.method2763(3, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method800(new class108(var2));
        }
        field958.method3209(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.y(Ldu;B)V")
    public void method800(class108 arg0) {
        while (true) {
            int var2 = arg0.method2158();
            if (var2 == 0) {
                return;
            }
            this.method801(arg0, var2);
        }
    }

    @ObfuscatedName("an.e(Ldu;II)V")
    public void method801(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field959 = arg0.method2158();
        } else if (arg1 == 2) {
            int var3 = arg0.method2158();
            this.field973 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field973[var4] = arg0.method2160();
            }
        } else if (arg1 == 3) {
            this.field966 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2158();
            this.field961 = new short[var5];
            this.field967 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field961[var6] = (short) arg0.method2160();
                this.field967[var6] = (short) arg0.method2160();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2158();
            this.field963 = new short[var7];
            this.field972 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field963[var8] = (short) arg0.method2160();
                this.field972[var8] = (short) arg0.method2160();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field965[arg1 - 60] = arg0.method2160();
        }
    }

    @ObfuscatedName("an.r(I)Z")
    public boolean method802() {
        if (this.field973 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field973.length; var2++) {
            if (!Statics.field964.method2807(this.field973[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.a(I)Lcy;")
    public class94 method809() {
        if (this.field973 == null) {
            return null;
        }
        class94[] var1 = new class94[this.field973.length];
        for (int var2 = 0; var2 < this.field973.length; var2++) {
            var1[var2] = class94.method1925(Statics.field964, this.field973[var2], 0);
        }
        class94 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class94(var1, var1.length);
        }
        if (this.field961 != null) {
            for (int var4 = 0; var4 < this.field961.length; var4++) {
                var3.method1939(this.field961[var4], this.field967[var4]);
            }
        }
        if (this.field963 != null) {
            for (int var5 = 0; var5 < this.field963.length; var5++) {
                var3.method1944(this.field963[var5], this.field972[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("an.n(I)Z")
    public boolean method817() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field965[var2] != -1 && !Statics.field964.method2807(this.field965[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.x(I)Lcy;")
    public class94 method805() {
        class94[] var1 = new class94[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field965[var3] != -1) {
                var1[var2++] = class94.method1925(Statics.field964, this.field965[var3], 0);
            }
        }
        class94 var4 = new class94(var1, var2);
        if (this.field961 != null) {
            for (int var5 = 0; var5 < this.field961.length; var5++) {
                var4.method1939(this.field961[var5], this.field967[var5]);
            }
        }
        if (this.field963 != null) {
            for (int var6 = 0; var6 < this.field963.length; var6++) {
                var4.method1944(this.field963[var6], this.field972[var6]);
            }
        }
        return var4;
    }
}
