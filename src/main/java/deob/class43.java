package deob;

@ObfuscatedName("ai")
public class class43 extends class195 {

    @ObfuscatedName("ai.b")
    public static class184 field983 = new class184(64);

    @ObfuscatedName("ai.p")
    public int field986 = 0;

    @ObfuscatedName("ai.e")
    public int field979 = -1;

    @ObfuscatedName("ai.i")
    public boolean field976 = true;

    @ObfuscatedName("ai.o")
    public int field981 = -1;

    @ObfuscatedName("ai.f")
    public int field977;

    @ObfuscatedName("ai.d")
    public int field978;

    @ObfuscatedName("ai.j")
    public int field984;

    @ObfuscatedName("ai.x")
    public int field985;

    @ObfuscatedName("ai.v")
    public int field982;

    @ObfuscatedName("ai.a")
    public int field987;

    @ObfuscatedName("ai.t(B)V")
    public void method877() {
        if (this.field981 != -1) {
            this.method880(this.field981);
            this.field985 = this.field977;
            this.field982 = this.field978;
            this.field987 = this.field984;
        }
        this.method880(this.field986);
    }

    @ObfuscatedName("ai.b(Ldc;II)V")
    public void method878(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2172();
            if (var3 == 0) {
                return;
            }
            this.method879(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.p(Ldc;III)V")
    public void method879(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field986 = arg0.method2307();
        } else if (arg1 == 2) {
            this.field979 = arg0.method2172();
        } else if (arg1 == 5) {
            this.field976 = false;
        } else if (arg1 == 7) {
            this.field981 = arg0.method2307();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ai.e(II)V")
    public void method880(int arg0) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        this.field977 = (int) (var18 * 256.0D);
        this.field978 = (int) (var14 * 256.0D);
        this.field984 = (int) (var16 * 256.0D);
        if (this.field978 < 0) {
            this.field978 = 0;
        } else if (this.field978 > 255) {
            this.field978 = 255;
        }
        if (this.field984 < 0) {
            this.field984 = 0;
        } else if (this.field984 > 255) {
            this.field984 = 255;
        }
    }

    @ObfuscatedName("t.i(B)V")
    public static void method3() {
        field983.method3342();
    }
}
