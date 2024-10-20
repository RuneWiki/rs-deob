package deob;

@ObfuscatedName("ae")
public class class35 extends class175 {

    @ObfuscatedName("ae.o")
    public static class171 field906 = new class171(64);

    @ObfuscatedName("ae.w")
    public static class171 field895 = new class171(30);

    @ObfuscatedName("ae.r")
    public int field896;

    @ObfuscatedName("ae.k")
    public int field897;

    @ObfuscatedName("ae.z")
    public int field898 = -1;

    @ObfuscatedName("ae.g")
    public short[] field892;

    @ObfuscatedName("ae.n")
    public short[] field900;

    @ObfuscatedName("ae.j")
    public short[] field901;

    @ObfuscatedName("ae.c")
    public short[] field902;

    @ObfuscatedName("ae.m")
    public int field903 = 128;

    @ObfuscatedName("ae.a")
    public int field904 = 128;

    @ObfuscatedName("ae.e")
    public int field894 = 0;

    @ObfuscatedName("ae.q")
    public int field899 = 0;

    @ObfuscatedName("ae.y")
    public int field907 = 0;

    @ObfuscatedName("ci.l(II)Lae;")
    public static class35 method2114(int arg0) {
        class35 var1 = (class35) field906.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field905.method3029(13, arg0);
        class35 var3 = new class35();
        var3.field896 = arg0;
        if (var2 != null) {
            var3.method740(new class127(var2));
        }
        field906.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.b(Ldm;I)V")
    public void method740(class127 arg0) {
        while (true) {
            int var2 = arg0.method2440();
            if (var2 == 0) {
                return;
            }
            this.method750(arg0, var2);
        }
    }

    @ObfuscatedName("ae.o(Ldm;II)V")
    public void method750(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field897 = arg0.method2442();
        } else if (arg1 == 2) {
            this.field898 = arg0.method2442();
        } else if (arg1 == 4) {
            this.field903 = arg0.method2442();
        } else if (arg1 == 5) {
            this.field904 = arg0.method2442();
        } else if (arg1 == 6) {
            this.field894 = arg0.method2442();
        } else if (arg1 == 7) {
            this.field899 = arg0.method2440();
        } else if (arg1 == 8) {
            this.field907 = arg0.method2440();
        } else if (arg1 == 40) {
            int var3 = arg0.method2440();
            this.field892 = new short[var3];
            this.field900 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field892[var4] = (short) arg0.method2442();
                this.field900[var4] = (short) arg0.method2442();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2440();
            this.field901 = new short[var5];
            this.field902 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field901[var6] = (short) arg0.method2442();
                this.field902[var6] = (short) arg0.method2442();
            }
        }
    }

    @ObfuscatedName("ae.w(II)Ldt;")
    public final class112 method742(int arg0) {
        class112 var2 = (class112) field895.method3255((long) this.field896);
        if (var2 == null) {
            class101 var3 = class101.method2087(Statics.field893, this.field897, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field892 != null) {
                for (int var4 = 0; var4 < this.field892.length; var4++) {
                    var3.method2071(this.field892[var4], this.field900[var4]);
                }
            }
            if (this.field901 != null) {
                for (int var5 = 0; var5 < this.field901.length; var5++) {
                    var3.method2038(this.field901[var5], this.field902[var5]);
                }
            }
            var2 = var3.method2105(this.field899 + 64, this.field907 + 850, -30, -50, -30);
            field895.method3253(var2, (long) this.field896);
        }
        class112 var6;
        if (this.field898 == -1 || arg0 == -1) {
            var6 = var2.method2251(true);
        } else {
            var6 = class34.method2198(this.field898).method707(var2, arg0);
        }
        if (this.field903 != 128 || this.field904 != 128) {
            var6.method2240(this.field903, this.field904, this.field903);
        }
        if (this.field894 != 0) {
            if (this.field894 == 90) {
                var6.method2236();
            }
            if (this.field894 == 180) {
                var6.method2236();
                var6.method2236();
            }
            if (this.field894 == 270) {
                var6.method2236();
                var6.method2236();
                var6.method2236();
            }
        }
        return var6;
    }

    @ObfuscatedName("a.r(I)V")
    public static void method139() {
        field906.method3254();
        field895.method3254();
    }
}
