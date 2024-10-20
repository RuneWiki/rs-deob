package deob;

@ObfuscatedName("al")
public class class45 extends class204 {

    @ObfuscatedName("al.u")
    public static class193 field1002 = new class193(64);

    @ObfuscatedName("al.k")
    public int field993 = -1;

    @ObfuscatedName("al.j")
    public int[] field992;

    @ObfuscatedName("al.i")
    public short[] field995;

    @ObfuscatedName("al.x")
    public short[] field994;

    @ObfuscatedName("al.g")
    public short[] field998;

    @ObfuscatedName("al.e")
    public short[] field990;

    @ObfuscatedName("al.p")
    public int[] field999 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("al.a")
    public boolean field1000 = false;

    @ObfuscatedName("as.m(II)Lal;")
    public static class45 method1032(int arg0) {
        class45 var1 = (class45) field1002.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field996.method3080(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method941(new class119(var2));
        }
        field1002.method3539(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.l(Ldx;I)V")
    public void method941(class119 arg0) {
        while (true) {
            int var2 = arg0.method2562();
            if (var2 == 0) {
                return;
            }
            this.method930(arg0, var2);
        }
    }

    @ObfuscatedName("al.y(Ldx;II)V")
    public void method930(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field993 = arg0.method2562();
        } else if (arg1 == 2) {
            int var3 = arg0.method2562();
            this.field992 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field992[var4] = arg0.method2541();
            }
        } else if (arg1 == 3) {
            this.field1000 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2562();
            this.field995 = new short[var5];
            this.field994 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field995[var6] = (short) arg0.method2541();
                this.field994[var6] = (short) arg0.method2541();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2562();
            this.field998 = new short[var7];
            this.field990 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field998[var8] = (short) arg0.method2541();
                this.field990[var8] = (short) arg0.method2541();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field999[arg1 - 60] = arg0.method2541();
        }
    }

    @ObfuscatedName("al.u(I)Z")
    public boolean method931() {
        if (this.field992 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field992.length; var2++) {
            if (!Statics.field991.method3095(this.field992[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("al.k(I)Lcy;")
    public class100 method932() {
        if (this.field992 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field992.length];
        for (int var2 = 0; var2 < this.field992.length; var2++) {
            var1[var2] = class100.method2097(Statics.field991, this.field992[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field995 != null) {
            for (int var4 = 0; var4 < this.field995.length; var4++) {
                var3.method2106(this.field995[var4], this.field994[var4]);
            }
        }
        if (this.field998 != null) {
            for (int var5 = 0; var5 < this.field998.length; var5++) {
                var3.method2107(this.field998[var5], this.field990[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("al.j(I)Z")
    public boolean method933() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field999[var2] != -1 && !Statics.field991.method3095(this.field999[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("al.i(I)Lcy;")
    public class100 method934() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field999[var3] != -1) {
                var1[var2++] = class100.method2097(Statics.field991, this.field999[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field995 != null) {
            for (int var5 = 0; var5 < this.field995.length; var5++) {
                var4.method2106(this.field995[var5], this.field994[var5]);
            }
        }
        if (this.field998 != null) {
            for (int var6 = 0; var6 < this.field998.length; var6++) {
                var4.method2107(this.field998[var6], this.field990[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("a.x(I)V")
    public static void method155() {
        field1002.method3540();
    }
}
