package deob;

@ObfuscatedName("ap")
public class class45 extends class204 {

    @ObfuscatedName("ap.t")
    public static class193 field1026 = new class193(64);

    @ObfuscatedName("ap.g")
    public int field1027 = -1;

    @ObfuscatedName("ap.o")
    public int[] field1023;

    @ObfuscatedName("ap.i")
    public short[] field1032;

    @ObfuscatedName("ap.w")
    public short[] field1030;

    @ObfuscatedName("ap.m")
    public short[] field1025;

    @ObfuscatedName("ap.r")
    public short[] field1024;

    @ObfuscatedName("ap.y")
    public int[] field1034 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ap.q")
    public boolean field1028 = false;

    @ObfuscatedName("o.c(IB)Lap;")
    public static class45 method91(int arg0) {
        class45 var1 = (class45) field1026.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1029.method2994(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method900(new class119(var2));
        }
        field1026.method3487(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.h(Ldf;I)V")
    public void method900(class119 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method883(arg0, var2);
        }
    }

    @ObfuscatedName("ap.k(Ldf;II)V")
    public void method883(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1027 = arg0.method2291();
        } else if (arg1 == 2) {
            int var3 = arg0.method2291();
            this.field1023 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1023[var4] = arg0.method2293();
            }
        } else if (arg1 == 3) {
            this.field1028 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2291();
            this.field1032 = new short[var5];
            this.field1030 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1032[var6] = (short) arg0.method2293();
                this.field1030[var6] = (short) arg0.method2293();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2291();
            this.field1025 = new short[var7];
            this.field1024 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1025[var8] = (short) arg0.method2293();
                this.field1024[var8] = (short) arg0.method2293();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1034[arg1 - 60] = arg0.method2293();
        }
    }

    @ObfuscatedName("ap.t(I)Z")
    public boolean method886() {
        if (this.field1023 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1023.length; var2++) {
            if (!Statics.field1031.method2996(this.field1023[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ap.g(B)Lch;")
    public class100 method887() {
        if (this.field1023 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1023.length];
        for (int var2 = 0; var2 < this.field1023.length; var2++) {
            var1[var2] = class100.method2063(Statics.field1031, this.field1023[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1032 != null) {
            for (int var4 = 0; var4 < this.field1032.length; var4++) {
                var3.method2019(this.field1032[var4], this.field1030[var4]);
            }
        }
        if (this.field1025 != null) {
            for (int var5 = 0; var5 < this.field1025.length; var5++) {
                var3.method2020(this.field1025[var5], this.field1024[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ap.o(I)Z")
    public boolean method888() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1034[var2] != -1 && !Statics.field1031.method2996(this.field1034[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ap.i(I)Lch;")
    public class100 method889() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1034[var3] != -1) {
                var1[var2++] = class100.method2063(Statics.field1031, this.field1034[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1032 != null) {
            for (int var5 = 0; var5 < this.field1032.length; var5++) {
                var4.method2019(this.field1032[var5], this.field1030[var5]);
            }
        }
        if (this.field1025 != null) {
            for (int var6 = 0; var6 < this.field1025.length; var6++) {
                var4.method2020(this.field1025[var6], this.field1024[var6]);
            }
        }
        return var4;
    }
}
