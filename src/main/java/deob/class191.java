package deob;

@ObfuscatedName("gx")
public class class191 extends class130 {

    @ObfuscatedName("gx.o")
    public static class125 field2787 = new class125(64);

    @ObfuscatedName("gx.r")
    public static class125 field2776 = new class125(30);

    @ObfuscatedName("gx.w")
    public int field2777;

    @ObfuscatedName("gx.j")
    public int field2773;

    @ObfuscatedName("gx.q")
    public int field2779 = -1;

    @ObfuscatedName("gx.d")
    public short[] field2780;

    @ObfuscatedName("gx.n")
    public short[] field2781;

    @ObfuscatedName("gx.c")
    public short[] field2786;

    @ObfuscatedName("gx.s")
    public short[] field2783;

    @ObfuscatedName("gx.g")
    public int field2784 = 128;

    @ObfuscatedName("gx.i")
    public int field2785 = 128;

    @ObfuscatedName("gx.v")
    public int field2775 = 0;

    @ObfuscatedName("gx.a")
    public int field2782 = 0;

    @ObfuscatedName("gx.h")
    public int field2788 = 0;

    @ObfuscatedName("i.k(II)Lgx;")
    public static class191 method188(int arg0) {
        class191 var1 = (class191) field2787.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2774.method3065(13, arg0);
        class191 var3 = new class191();
        var3.field2777 = arg0;
        if (var2 != null) {
            var3.method3240(new class161(var2));
        }
        field2787.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gx.y(Lfm;S)V")
    public void method3240(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3243(arg0, var2);
        }
    }

    @ObfuscatedName("gx.o(Lfm;IB)V")
    public void method3243(class161 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2773 = arg0.method2735();
        } else if (arg1 == 2) {
            this.field2779 = arg0.method2735();
        } else if (arg1 == 4) {
            this.field2784 = arg0.method2735();
        } else if (arg1 == 5) {
            this.field2785 = arg0.method2735();
        } else if (arg1 == 6) {
            this.field2775 = arg0.method2735();
        } else if (arg1 == 7) {
            this.field2782 = arg0.method2733();
        } else if (arg1 == 8) {
            this.field2788 = arg0.method2733();
        } else if (arg1 == 40) {
            int var3 = arg0.method2733();
            this.field2780 = new short[var3];
            this.field2781 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2780[var4] = (short) arg0.method2735();
                this.field2781[var4] = (short) arg0.method2735();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2733();
            this.field2786 = new short[var5];
            this.field2783 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2786[var6] = (short) arg0.method2735();
                this.field2783[var6] = (short) arg0.method2735();
            }
        }
    }

    @ObfuscatedName("gx.r(IB)Lcu;")
    public final class83 method3242(int arg0) {
        class83 var2 = (class83) field2776.method2159((long) this.field2777);
        if (var2 == null) {
            class77 var3 = class77.method1384(Statics.field2778, this.field2773, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2780 != null) {
                for (int var4 = 0; var4 < this.field2780.length; var4++) {
                    var3.method1388(this.field2780[var4], this.field2781[var4]);
                }
            }
            if (this.field2786 != null) {
                for (int var5 = 0; var5 < this.field2786.length; var5++) {
                    var3.method1398(this.field2786[var5], this.field2783[var5]);
                }
            }
            var2 = var3.method1405(this.field2782 + 64, this.field2788 + 850, -30, -50, -30);
            field2776.method2164(var2, (long) this.field2777);
        }
        class83 var6;
        if (this.field2779 == -1 || arg0 == -1) {
            var6 = var2.method1521(true);
        } else {
            var6 = class202.method1368(this.field2779).method3553(var2, arg0);
        }
        if (this.field2784 != 128 || this.field2785 != 128) {
            var6.method1535(this.field2784, this.field2785, this.field2784);
        }
        if (this.field2775 != 0) {
            if (this.field2775 == 90) {
                var6.method1488();
            }
            if (this.field2775 == 180) {
                var6.method1488();
                var6.method1488();
            }
            if (this.field2775 == 270) {
                var6.method1488();
                var6.method1488();
                var6.method1488();
            }
        }
        return var6;
    }

    @ObfuscatedName("el.w(I)V")
    public static void method2533() {
        field2787.method2161();
        field2776.method2161();
    }
}
