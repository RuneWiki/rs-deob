package deob;

@ObfuscatedName("nc")
public class class390 extends class396 {

    @ObfuscatedName("nc.e")
    public final class447 field4509;

    @ObfuscatedName("nc.v")
    public final class388 field4510;

    @ObfuscatedName("nc.x")
    public String field4512 = null;

    @ObfuscatedName("nc.m")
    public String field4518 = null;

    @ObfuscatedName("nc.q")
    public byte field4514;

    @ObfuscatedName("nc.f")
    public int field4513;

    @ObfuscatedName("nc.r")
    public int field4516 = 1;

    public class390(class447 arg0, class388 arg1) {
        super(500);
        this.field4509 = arg0;
        this.field4510 = arg1;
    }

    @ObfuscatedName("nc.h(B)Lov;")
    public class394 method6769() {
        return new class393();
    }

    @ObfuscatedName("nc.e(II)[Lov;")
    public class394[] method6765(int arg0) {
        return new class393[arg0];
    }

    @ObfuscatedName("nc.v(Ljava/lang/String;I)V")
    public final void method6781(String arg0) {
        String var2 = class363.method6065(Statics.method452(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4512 = var2;
    }

    @ObfuscatedName("nc.g(Ljava/lang/String;B)V")
    public final void method6782(String arg0) {
        String var2 = class363.method6065(Statics.method452(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4518 = var2;
    }

    @ObfuscatedName("nc.i(Lqy;II)V")
    public final void method6786(class467 arg0, int arg1) {
        this.method6782(arg0.method7801());
        long var3 = arg0.method7958();
        long var5 = var3;
        String var7;
        if (var3 <= 0L || var3 >= 6582952005840035281L) {
            var7 = null;
        } else if (var3 % 37L == 0L) {
            var7 = null;
        } else {
            int var8 = 0;
            for (long var9 = var3; var9 != 0L; var9 /= 37L) {
                var8++;
            }
            StringBuilder var11 = new StringBuilder(var8);
            while (var5 != 0L) {
                long var12 = var5;
                var5 /= 37L;
                var11.append(class363.field4357[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method6781(var7);
        this.field4514 = arg0.method7793();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method7792();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method8023();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method6864();
        for (int var17 = 0; var17 < var16; var17++) {
            class393 var18 = (class393) this.method6873(new class490(arg0.method7801(), this.field4509));
            int var19 = arg0.method7794();
            var18.method6933(var19, ++this.field4516 - 1);
            var18.field4544 = arg0.method7793();
            arg0.method7801();
            this.method6785(var18);
        }
    }

    @ObfuscatedName("nc.o(Lqy;B)V")
    public final void method6783(class467 arg0) {
        class490 var2 = new class490(arg0.method7801(), this.field4509);
        int var3 = arg0.method7794();
        byte var4 = arg0.method7793();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method6865() == 0) {
                return;
            }
            class393 var6 = (class393) this.method6883(var2);
            if (var6 != null && var6.method6939() == var3) {
                this.method6872(var6);
            }
            return;
        }
        arg0.method7801();
        class393 var7 = (class393) this.method6883(var2);
        if (var7 == null) {
            if (this.method6865() > this.field4538) {
                return;
            }
            var7 = (class393) this.method6873(var2);
        }
        var7.method6933(var3, ++this.field4516 - 1);
        var7.field4544 = var4;
        this.method6785(var7);
    }

    @ObfuscatedName("nc.n(I)V")
    public final void method6784() {
        for (int var1 = 0; var1 < this.method6865(); var1++) {
            ((class393) this.method6875(var1)).method6837();
        }
    }

    @ObfuscatedName("nc.k(B)V")
    public final void method6793() {
        for (int var1 = 0; var1 < this.method6865(); var1++) {
            ((class393) this.method6875(var1)).method6818();
        }
    }

    @ObfuscatedName("nc.a(Log;I)V")
    public final void method6785(class393 arg0) {
        if (arg0.method6844().equals(this.field4510.method1171())) {
            this.field4513 = arg0.field4544;
        }
    }
}
