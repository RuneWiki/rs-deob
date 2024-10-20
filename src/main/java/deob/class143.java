package deob;

@ObfuscatedName("ea")
public class class143 extends class349 {

    @ObfuscatedName("ea.j")
    public static class223 field1568 = new class223(64);

    @ObfuscatedName("ea.l")
    public int field1566 = -1;

    @ObfuscatedName("ea.n")
    public int[] field1567;

    @ObfuscatedName("ea.w")
    public short[] field1572;

    @ObfuscatedName("ea.f")
    public short[] field1569;

    @ObfuscatedName("ea.o")
    public short[] field1570;

    @ObfuscatedName("ea.x")
    public short[] field1571;

    @ObfuscatedName("ea.r")
    public int[] field1563 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ea.p")
    public boolean field1573 = false;

    @ObfuscatedName("bs.s(II)Lea;")
    public static class143 method1774(int arg0) {
        class143 var1 = (class143) field1568.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1565.method4459(3, arg0);
        class143 var3 = new class143();
        if (var2 != null) {
            var3.method2448(new class385(var2));
        }
        field1568.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ea.t(Lnv;I)V")
    public void method2448(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2450(arg0, var2);
        }
    }

    @ObfuscatedName("ea.v(Lnv;II)V")
    public void method2450(class385 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1566 = arg0.method5958();
        } else if (arg1 == 2) {
            int var3 = arg0.method5958();
            this.field1567 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1567[var4] = arg0.method6053();
            }
        } else if (arg1 == 3) {
            this.field1573 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5958();
            this.field1572 = new short[var5];
            this.field1569 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1572[var6] = (short) arg0.method6053();
                this.field1569[var6] = (short) arg0.method6053();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5958();
            this.field1570 = new short[var7];
            this.field1571 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1570[var8] = (short) arg0.method6053();
                this.field1571[var8] = (short) arg0.method6053();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1563[arg1 - 60] = arg0.method6053();
        }
    }

    @ObfuscatedName("ea.j(B)Z")
    public boolean method2447() {
        if (this.field1567 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1567.length; var2++) {
            if (!Statics.field1120.method4539(this.field1567[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ea.l(I)Lgz;")
    public class193 method2469() {
        if (this.field1567 == null) {
            return null;
        }
        class193[] var1 = new class193[this.field1567.length];
        for (int var2 = 0; var2 < this.field1567.length; var2++) {
            var1[var2] = class193.method3357(Statics.field1120, this.field1567[var2], 0);
        }
        class193 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class193(var1, var1.length);
        }
        if (this.field1572 != null) {
            for (int var4 = 0; var4 < this.field1572.length; var4++) {
                var3.method3403(this.field1572[var4], this.field1569[var4]);
            }
        }
        if (this.field1570 != null) {
            for (int var5 = 0; var5 < this.field1570.length; var5++) {
                var3.method3370(this.field1570[var5], this.field1571[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ea.n(I)Z")
    public boolean method2446() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1563[var2] != -1 && !Statics.field1120.method4539(this.field1563[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ea.w(I)Lgz;")
    public class193 method2452() {
        class193[] var1 = new class193[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1563[var3] != -1) {
                var1[var2++] = class193.method3357(Statics.field1120, this.field1563[var3], 0);
            }
        }
        class193 var4 = new class193(var1, var2);
        if (this.field1572 != null) {
            for (int var5 = 0; var5 < this.field1572.length; var5++) {
                var4.method3403(this.field1572[var5], this.field1569[var5]);
            }
        }
        if (this.field1570 != null) {
            for (int var6 = 0; var6 < this.field1570.length; var6++) {
                var4.method3370(this.field1570[var6], this.field1571[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bk.f(I)V")
    public static void method1566() {
        field1568.method3930();
    }
}
