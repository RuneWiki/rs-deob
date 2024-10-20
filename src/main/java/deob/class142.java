package deob;

@ObfuscatedName("er")
public class class142 extends class348 {

    @ObfuscatedName("er.y")
    public static class222 field1591 = new class222(64);

    @ObfuscatedName("er.j")
    public int field1590 = -1;

    @ObfuscatedName("er.o")
    public int[] field1589;

    @ObfuscatedName("er.m")
    public short[] field1592;

    @ObfuscatedName("er.r")
    public short[] field1593;

    @ObfuscatedName("er.h")
    public short[] field1594;

    @ObfuscatedName("er.d")
    public short[] field1595;

    @ObfuscatedName("er.z")
    public int[] field1596 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("er.b")
    public boolean field1597 = false;

    @ObfuscatedName("l.f(II)Ler;")
    public static class142 method192(int arg0) {
        class142 var1 = (class142) field1591.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1470.method4504(3, arg0);
        class142 var3 = new class142();
        if (var2 != null) {
            var3.method2447(new class384(var2));
        }
        field1591.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("er.e(Lnt;B)V")
    public void method2447(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2459(arg0, var2);
        }
    }

    @ObfuscatedName("er.v(Lnt;II)V")
    public void method2459(class384 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1590 = arg0.method5902();
        } else if (arg1 == 2) {
            int var3 = arg0.method5902();
            this.field1589 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1589[var4] = arg0.method5899();
            }
        } else if (arg1 == 3) {
            this.field1597 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5902();
            this.field1592 = new short[var5];
            this.field1593 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1592[var6] = (short) arg0.method5899();
                this.field1593[var6] = (short) arg0.method5899();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5902();
            this.field1594 = new short[var7];
            this.field1595 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1594[var8] = (short) arg0.method5899();
                this.field1595[var8] = (short) arg0.method5899();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1596[arg1 - 60] = arg0.method5899();
        }
    }

    @ObfuscatedName("er.y(S)Z")
    public boolean method2449() {
        if (this.field1589 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1589.length; var2++) {
            if (!Statics.field1598.method4506(this.field1589[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("er.j(B)Lga;")
    public class192 method2450() {
        if (this.field1589 == null) {
            return null;
        }
        class192[] var1 = new class192[this.field1589.length];
        for (int var2 = 0; var2 < this.field1589.length; var2++) {
            var1[var2] = class192.method3422(Statics.field1598, this.field1589[var2], 0);
        }
        class192 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class192(var1, var1.length);
        }
        if (this.field1592 != null) {
            for (int var4 = 0; var4 < this.field1592.length; var4++) {
                var3.method3420(this.field1592[var4], this.field1593[var4]);
            }
        }
        if (this.field1594 != null) {
            for (int var5 = 0; var5 < this.field1594.length; var5++) {
                var3.method3474(this.field1594[var5], this.field1595[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("er.o(B)Z")
    public boolean method2451() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1596[var2] != -1 && !Statics.field1598.method4506(this.field1596[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("er.m(S)Lga;")
    public class192 method2452() {
        class192[] var1 = new class192[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1596[var3] != -1) {
                var1[var2++] = class192.method3422(Statics.field1598, this.field1596[var3], 0);
            }
        }
        class192 var4 = new class192(var1, var2);
        if (this.field1592 != null) {
            for (int var5 = 0; var5 < this.field1592.length; var5++) {
                var4.method3420(this.field1592[var5], this.field1593[var5]);
            }
        }
        if (this.field1594 != null) {
            for (int var6 = 0; var6 < this.field1594.length; var6++) {
                var4.method3474(this.field1594[var6], this.field1595[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bq.r(I)V")
    public static void method709() {
        field1591.method3989();
    }
}
