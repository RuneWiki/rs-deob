package deob;

@ObfuscatedName("es")
public class class156 extends class365 {

    @ObfuscatedName("es.a")
    public static class236 field1656 = new class236(64);

    @ObfuscatedName("es.o")
    public int field1651 = -1;

    @ObfuscatedName("es.g")
    public int[] field1652;

    @ObfuscatedName("es.e")
    public short[] field1653;

    @ObfuscatedName("es.p")
    public short[] field1654;

    @ObfuscatedName("es.j")
    public short[] field1658;

    @ObfuscatedName("es.b")
    public short[] field1657;

    @ObfuscatedName("es.x")
    public int[] field1648 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("es.y")
    public boolean field1650 = false;

    @ObfuscatedName("bd.i(IB)Les;")
    public static class156 method1041(int arg0) {
        class156 var1 = (class156) field1656.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1655.method4743(3, arg0);
        class156 var3 = new class156();
        if (var2 != null) {
            var3.method2724(new class401(var2));
        }
        field1656.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("es.w(Lop;B)V")
    public void method2724(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2725(arg0, var2);
        }
    }

    @ObfuscatedName("es.s(Lop;II)V")
    public void method2725(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1651 = arg0.method6240();
        } else if (arg1 == 2) {
            int var3 = arg0.method6240();
            this.field1652 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1652[var4] = arg0.method6242();
            }
        } else if (arg1 == 3) {
            this.field1650 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method6240();
            this.field1653 = new short[var5];
            this.field1654 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1653[var6] = (short) arg0.method6242();
                this.field1654[var6] = (short) arg0.method6242();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6240();
            this.field1658 = new short[var7];
            this.field1657 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1658[var8] = (short) arg0.method6242();
                this.field1657[var8] = (short) arg0.method6242();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1648[arg1 - 60] = arg0.method6242();
        }
    }

    @ObfuscatedName("es.a(B)Z")
    public boolean method2736() {
        if (this.field1652 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1652.length; var2++) {
            if (!Statics.field1649.method4745(this.field1652[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("es.o(B)Lgk;")
    public class206 method2727() {
        if (this.field1652 == null) {
            return null;
        }
        class206[] var1 = new class206[this.field1652.length];
        for (int var2 = 0; var2 < this.field1652.length; var2++) {
            var1[var2] = class206.method3658(Statics.field1649, this.field1652[var2], 0);
        }
        class206 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class206(var1, var1.length);
        }
        if (this.field1653 != null) {
            for (int var4 = 0; var4 < this.field1653.length; var4++) {
                var3.method3687(this.field1653[var4], this.field1654[var4]);
            }
        }
        if (this.field1658 != null) {
            for (int var5 = 0; var5 < this.field1658.length; var5++) {
                var3.method3672(this.field1658[var5], this.field1657[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("es.g(I)Z")
    public boolean method2743() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1648[var2] != -1 && !Statics.field1649.method4745(this.field1648[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("es.e(B)Lgk;")
    public class206 method2729() {
        class206[] var1 = new class206[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1648[var3] != -1) {
                var1[var2++] = class206.method3658(Statics.field1649, this.field1648[var3], 0);
            }
        }
        class206 var4 = new class206(var1, var2);
        if (this.field1653 != null) {
            for (int var5 = 0; var5 < this.field1653.length; var5++) {
                var4.method3687(this.field1653[var5], this.field1654[var5]);
            }
        }
        if (this.field1658 != null) {
            for (int var6 = 0; var6 < this.field1658.length; var6++) {
                var4.method3672(this.field1658[var6], this.field1657[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cl.p(B)V")
    public static void method2107() {
        field1656.method4207();
    }
}
