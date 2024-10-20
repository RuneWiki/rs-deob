package deob;

@ObfuscatedName("ew")
public class class150 extends class349 {

    @ObfuscatedName("ew.v")
    public static class223 field1660 = new class223(64);

    @ObfuscatedName("ew.j")
    public static class223 field1662 = new class223(30);

    @ObfuscatedName("ew.l")
    public int field1678;

    @ObfuscatedName("ew.n")
    public int field1663;

    @ObfuscatedName("ew.w")
    public int field1664 = -1;

    @ObfuscatedName("ew.f")
    public short[] field1672;

    @ObfuscatedName("ew.o")
    public short[] field1666;

    @ObfuscatedName("ew.x")
    public short[] field1667;

    @ObfuscatedName("ew.r")
    public short[] field1668;

    @ObfuscatedName("ew.p")
    public int field1665 = 128;

    @ObfuscatedName("ew.h")
    public int field1670 = 128;

    @ObfuscatedName("ew.k")
    public int field1671 = 0;

    @ObfuscatedName("ew.a")
    public int field1674 = 0;

    @ObfuscatedName("ew.q")
    public int field1673 = 0;

    @ObfuscatedName("cd.s(Ljy;Ljy;I)V")
    public static void method2029(class277 arg0, class277 arg1) {
        Statics.field1675 = arg0;
        Statics.field4313 = arg1;
    }

    @ObfuscatedName("y.t(II)Lew;")
    public static class150 method455(int arg0) {
        class150 var1 = (class150) field1660.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1675.method4459(13, arg0);
        class150 var3 = new class150();
        var3.field1678 = arg0;
        if (var2 != null) {
            var3.method2547(new class385(var2));
        }
        field1660.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ew.v(Lnv;I)V")
    public void method2547(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2554(arg0, var2);
        }
    }

    @ObfuscatedName("ew.j(Lnv;II)V")
    public void method2554(class385 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1663 = arg0.method6053();
        } else if (arg1 == 2) {
            this.field1664 = arg0.method6053();
        } else if (arg1 == 4) {
            this.field1665 = arg0.method6053();
        } else if (arg1 == 5) {
            this.field1670 = arg0.method6053();
        } else if (arg1 == 6) {
            this.field1671 = arg0.method6053();
        } else if (arg1 == 7) {
            this.field1674 = arg0.method5958();
        } else if (arg1 == 8) {
            this.field1673 = arg0.method5958();
        } else if (arg1 == 40) {
            int var3 = arg0.method5958();
            this.field1672 = new short[var3];
            this.field1666 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1672[var4] = (short) arg0.method6053();
                this.field1666[var4] = (short) arg0.method6053();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5958();
            this.field1667 = new short[var5];
            this.field1668 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1667[var6] = (short) arg0.method6053();
                this.field1668[var6] = (short) arg0.method6053();
            }
        }
    }

    @ObfuscatedName("ew.l(II)Lgl;")
    public final class207 method2541(int arg0) {
        class207 var2 = (class207) field1662.method3927((long) this.field1678);
        if (var2 == null) {
            class193 var3 = class193.method3357(Statics.field4313, this.field1663, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1672 != null) {
                for (int var4 = 0; var4 < this.field1672.length; var4++) {
                    var3.method3403(this.field1672[var4], this.field1666[var4]);
                }
            }
            if (this.field1667 != null) {
                for (int var5 = 0; var5 < this.field1667.length; var5++) {
                    var3.method3370(this.field1667[var5], this.field1668[var5]);
                }
            }
            var2 = var3.method3377(this.field1674 + 64, this.field1673 + 850, -30, -50, -30);
            field1662.method3929(var2, (long) this.field1678);
        }
        class207 var6;
        if (this.field1664 == -1 || arg0 == -1) {
            var6 = var2.method3769(true);
        } else {
            var6 = class159.method1334(this.field1664).method2821(var2, arg0);
        }
        if (this.field1665 != 128 || this.field1670 != 128) {
            var6.method3787(this.field1665, this.field1670, this.field1665);
        }
        if (this.field1671 != 0) {
            if (this.field1671 == 90) {
                var6.method3795();
            }
            if (this.field1671 == 180) {
                var6.method3795();
                var6.method3795();
            }
            if (this.field1671 == 270) {
                var6.method3795();
                var6.method3795();
                var6.method3795();
            }
        }
        return var6;
    }
}
