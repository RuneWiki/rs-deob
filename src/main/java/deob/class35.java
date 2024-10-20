package deob;

@ObfuscatedName("ac")
public class class35 extends class172 {

    @ObfuscatedName("ac.z")
    public static class168 field906 = new class168(64);

    @ObfuscatedName("ac.c")
    public int field907 = -1;

    @ObfuscatedName("ac.e")
    public int[] field908;

    @ObfuscatedName("ac.s")
    public short[] field917;

    @ObfuscatedName("ac.i")
    public short[] field915;

    @ObfuscatedName("ac.g")
    public short[] field911;

    @ObfuscatedName("ac.q")
    public short[] field903;

    @ObfuscatedName("ac.w")
    public int[] field913 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ac.k")
    public boolean field914 = false;

    @ObfuscatedName("cf.j(II)Lac;")
    public static class35 method2078(int arg0) {
        class35 var1 = (class35) field906.method3191((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field909.method2903(3, arg0);
        class35 var3 = new class35();
        if (var2 != null) {
            var3.method734(new class126(var2));
        }
        field906.method3181(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.y(Ldr;I)V")
    public void method734(class126 arg0) {
        while (true) {
            int var2 = arg0.method2399();
            if (var2 == 0) {
                return;
            }
            this.method735(arg0, var2);
        }
    }

    @ObfuscatedName("ac.x(Ldr;IB)V")
    public void method735(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field907 = arg0.method2399();
        } else if (arg1 == 2) {
            int var3 = arg0.method2399();
            this.field908 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field908[var4] = arg0.method2405();
            }
        } else if (arg1 == 3) {
            this.field914 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2399();
            this.field917 = new short[var5];
            this.field915 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field917[var6] = (short) arg0.method2405();
                this.field915[var6] = (short) arg0.method2405();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2399();
            this.field911 = new short[var7];
            this.field903 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field911[var8] = (short) arg0.method2405();
                this.field903[var8] = (short) arg0.method2405();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field913[arg1 - 60] = arg0.method2405();
        }
    }

    @ObfuscatedName("ac.z(B)Z")
    public boolean method736() {
        if (this.field908 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field908.length; var2++) {
            if (!Statics.field904.method2965(this.field908[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ac.c(I)Lck;")
    public class100 method737() {
        if (this.field908 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field908.length];
        for (int var2 = 0; var2 < this.field908.length; var2++) {
            var1[var2] = class100.method2001(Statics.field904, this.field908[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field917 != null) {
            for (int var4 = 0; var4 < this.field917.length; var4++) {
                var3.method2013(this.field917[var4], this.field915[var4]);
            }
        }
        if (this.field911 != null) {
            for (int var5 = 0; var5 < this.field911.length; var5++) {
                var3.method2000(this.field911[var5], this.field903[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ac.e(I)Z")
    public boolean method738() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field913[var2] != -1 && !Statics.field904.method2965(this.field913[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ac.s(I)Lck;")
    public class100 method739() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field913[var3] != -1) {
                var1[var2++] = class100.method2001(Statics.field904, this.field913[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field917 != null) {
            for (int var5 = 0; var5 < this.field917.length; var5++) {
                var4.method2013(this.field917[var5], this.field915[var5]);
            }
        }
        if (this.field911 != null) {
            for (int var6 = 0; var6 < this.field911.length; var6++) {
                var4.method2000(this.field911[var6], this.field903[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("by.i(B)V")
    public static void method1244() {
        field906.method3185();
    }
}
