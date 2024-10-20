package deob;

@ObfuscatedName("iw")
public class class259 extends class206 {

    @ObfuscatedName("iw.h")
    public static class201 field3433 = new class201(64);

    @ObfuscatedName("iw.i")
    public int field3430 = -1;

    @ObfuscatedName("iw.w")
    public int[] field3435;

    @ObfuscatedName("iw.t")
    public short[] field3436;

    @ObfuscatedName("iw.d")
    public short[] field3437;

    @ObfuscatedName("iw.z")
    public short[] field3438;

    @ObfuscatedName("iw.k")
    public short[] field3439;

    @ObfuscatedName("iw.c")
    public int[] field3440 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("iw.o")
    public boolean field3441 = false;

    @ObfuscatedName("jg.s(Lir;Lir;I)V")
    public static void method4551(class247 arg0, class247 arg1) {
        Statics.field3431 = arg0;
        Statics.field3442 = arg1;
        Statics.field3432 = Statics.field3431.method4209(3);
    }

    @ObfuscatedName("if.g(II)Liw;")
    public static class259 method4328(int arg0) {
        class259 var1 = (class259) field3433.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3431.method4231(3, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4433(new class185(var2));
        }
        field3433.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.m(Lgy;B)V")
    public void method4433(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4439(arg0, var2);
        }
    }

    @ObfuscatedName("iw.h(Lgy;II)V")
    public void method4439(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3430 = arg0.method3239();
        } else if (arg1 == 2) {
            int var3 = arg0.method3239();
            this.field3435 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3435[var4] = arg0.method3241();
            }
        } else if (arg1 == 3) {
            this.field3441 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3239();
            this.field3436 = new short[var5];
            this.field3437 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3436[var6] = (short) arg0.method3241();
                this.field3437[var6] = (short) arg0.method3241();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3239();
            this.field3438 = new short[var7];
            this.field3439 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3438[var8] = (short) arg0.method3241();
                this.field3439[var8] = (short) arg0.method3241();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3440[arg1 - 60] = arg0.method3241();
        }
    }

    @ObfuscatedName("iw.i(I)Z")
    public boolean method4435() {
        if (this.field3435 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3435.length; var2++) {
            if (!Statics.field3442.method4186(this.field3435[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iw.w(I)Ldw;")
    public class125 method4436() {
        if (this.field3435 == null) {
            return null;
        }
        class125[] var1 = new class125[this.field3435.length];
        for (int var2 = 0; var2 < this.field3435.length; var2++) {
            var1[var2] = class125.method2428(Statics.field3442, this.field3435[var2], 0);
        }
        class125 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class125(var1, var1.length);
        }
        if (this.field3436 != null) {
            for (int var4 = 0; var4 < this.field3436.length; var4++) {
                var3.method2442(this.field3436[var4], this.field3437[var4]);
            }
        }
        if (this.field3438 != null) {
            for (int var5 = 0; var5 < this.field3438.length; var5++) {
                var3.method2443(this.field3438[var5], this.field3439[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("iw.t(S)Z")
    public boolean method4461() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3440[var2] != -1 && !Statics.field3442.method4186(this.field3440[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iw.d(S)Ldw;")
    public class125 method4460() {
        class125[] var1 = new class125[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3440[var3] != -1) {
                var1[var2++] = class125.method2428(Statics.field3442, this.field3440[var3], 0);
            }
        }
        class125 var4 = new class125(var1, var2);
        if (this.field3436 != null) {
            for (int var5 = 0; var5 < this.field3436.length; var5++) {
                var4.method2442(this.field3436[var5], this.field3437[var5]);
            }
        }
        if (this.field3438 != null) {
            for (int var6 = 0; var6 < this.field3438.length; var6++) {
                var4.method2443(this.field3438[var6], this.field3439[var6]);
            }
        }
        return var4;
    }
}
