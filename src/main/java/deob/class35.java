package deob;

@ObfuscatedName("ai")
public class class35 extends class174 {

    @ObfuscatedName("ai.s")
    public static class170 field907 = new class170(64);

    @ObfuscatedName("ai.o")
    public static class170 field908 = new class170(30);

    @ObfuscatedName("ai.p")
    public int field909;

    @ObfuscatedName("ai.x")
    public int field910;

    @ObfuscatedName("ai.k")
    public int field912 = -1;

    @ObfuscatedName("ai.r")
    public short[] field905;

    @ObfuscatedName("ai.z")
    public short[] field913;

    @ObfuscatedName("ai.n")
    public short[] field914;

    @ObfuscatedName("ai.j")
    public short[] field915;

    @ObfuscatedName("ai.b")
    public int field916 = 128;

    @ObfuscatedName("ai.t")
    public int field917 = 128;

    @ObfuscatedName("ai.q")
    public int field918 = 0;

    @ObfuscatedName("ai.e")
    public int field928 = 0;

    @ObfuscatedName("ai.l")
    public int field920 = 0;

    @ObfuscatedName("eb.g(IB)Lai;")
    public static class35 method3034(int arg0) {
        class35 var1 = (class35) field907.method3303((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field921.method3080(13, arg0);
        class35 var3 = new class35();
        var3.field909 = arg0;
        if (var2 != null) {
            var3.method746(new class127(var2));
        }
        field907.method3313(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.h(Ldw;I)V")
    public void method746(class127 arg0) {
        while (true) {
            int var2 = arg0.method2499();
            if (var2 == 0) {
                return;
            }
            this.method747(arg0, var2);
        }
    }

    @ObfuscatedName("ai.s(Ldw;II)V")
    public void method747(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field910 = arg0.method2501();
        } else if (arg1 == 2) {
            this.field912 = arg0.method2501();
        } else if (arg1 == 4) {
            this.field916 = arg0.method2501();
        } else if (arg1 == 5) {
            this.field917 = arg0.method2501();
        } else if (arg1 == 6) {
            this.field918 = arg0.method2501();
        } else if (arg1 == 7) {
            this.field928 = arg0.method2499();
        } else if (arg1 == 8) {
            this.field920 = arg0.method2499();
        } else if (arg1 == 40) {
            int var3 = arg0.method2499();
            this.field905 = new short[var3];
            this.field913 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field905[var4] = (short) arg0.method2501();
                this.field913[var4] = (short) arg0.method2501();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2499();
            this.field914 = new short[var5];
            this.field915 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field914[var6] = (short) arg0.method2501();
                this.field915[var6] = (short) arg0.method2501();
            }
        }
    }

    @ObfuscatedName("ai.o(II)Ldn;")
    public final class112 method750(int arg0) {
        class112 var2 = (class112) field908.method3303((long) this.field909);
        if (var2 == null) {
            class101 var3 = class101.method2085(Statics.field906, this.field910, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field905 != null) {
                for (int var4 = 0; var4 < this.field905.length; var4++) {
                    var3.method2097(this.field905[var4], this.field913[var4]);
                }
            }
            if (this.field914 != null) {
                for (int var5 = 0; var5 < this.field914.length; var5++) {
                    var3.method2167(this.field914[var5], this.field915[var5]);
                }
            }
            var2 = var3.method2104(this.field928 + 64, this.field920 + 850, -30, -50, -30);
            field908.method3313(var2, (long) this.field909);
        }
        class112 var6;
        if (this.field912 == -1 || arg0 == -1) {
            var6 = var2.method2298(true);
        } else {
            var6 = class34.method152(this.field912).method714(var2, arg0);
        }
        if (this.field916 != 128 || this.field917 != 128) {
            var6.method2287(this.field916, this.field917, this.field916);
        }
        if (this.field918 != 0) {
            if (this.field918 == 90) {
                var6.method2291();
            }
            if (this.field918 == 180) {
                var6.method2291();
                var6.method2291();
            }
            if (this.field918 == 270) {
                var6.method2291();
                var6.method2291();
                var6.method2291();
            }
        }
        return var6;
    }

    @ObfuscatedName("cu.p(I)V")
    public static void method2171() {
        field907.method3306();
        field908.method3306();
    }
}
