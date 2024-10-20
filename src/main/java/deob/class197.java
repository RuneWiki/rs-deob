package deob;

@ObfuscatedName("hz")
public class class197 extends class484 {

    @ObfuscatedName("hz.ax")
    public static class302 field1971 = new class302(64);

    @ObfuscatedName("hz.ao")
    public int field1973 = -1;

    @ObfuscatedName("hz.ah")
    public int[] field1970;

    @ObfuscatedName("hz.ar")
    public short[] field1967;

    @ObfuscatedName("hz.ab")
    public short[] field1972;

    @ObfuscatedName("hz.am")
    public short[] field1969;

    @ObfuscatedName("hz.av")
    public short[] field1974;

    @ObfuscatedName("hz.ag")
    public int[] field1975 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("hz.aa")
    public boolean field1976 = false;

    @ObfuscatedName("fg.ac(Lom;Lom;I)V")
    public static void method2975(class374 arg0, class374 arg1) {
        Statics.field1966 = arg0;
        Statics.field1968 = arg1;
        Statics.field4490 = Statics.field1966.method6273(3);
    }

    @ObfuscatedName("cd.al(II)Lhz;")
    public static class197 method2016(int arg0) {
        class197 var1 = (class197) field1971.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1966.method6342(3, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3385(new class530(var2));
        }
        field1971.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hz.ak(Lul;B)V")
    public void method3385(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3379(arg0, var2);
        }
    }

    @ObfuscatedName("hz.ax(Lul;IB)V")
    public void method3379(class530 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1973 = arg0.method8365();
        } else if (arg1 == 2) {
            int var3 = arg0.method8365();
            this.field1970 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1970[var4] = arg0.method8598();
            }
        } else if (arg1 == 3) {
            this.field1976 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method8365();
            this.field1967 = new short[var5];
            this.field1972 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1967[var6] = (short) arg0.method8598();
                this.field1972[var6] = (short) arg0.method8598();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8365();
            this.field1969 = new short[var7];
            this.field1974 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1969[var8] = (short) arg0.method8598();
                this.field1974[var8] = (short) arg0.method8598();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1975[arg1 - 60] = arg0.method8598();
        }
    }

    @ObfuscatedName("hz.ao(I)Z")
    public boolean method3380() {
        if (this.field1970 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1970.length; var2++) {
            if (!Statics.field1968.method6265(this.field1970[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hz.ah(I)Ljw;")
    public class236 method3381() {
        if (this.field1970 == null) {
            return null;
        }
        class236[] var1 = new class236[this.field1970.length];
        for (int var2 = 0; var2 < this.field1970.length; var2++) {
            var1[var2] = class236.method4058(Statics.field1968, this.field1970[var2], 0);
        }
        class236 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class236(var1, var1.length);
        }
        if (this.field1967 != null) {
            for (int var4 = 0; var4 < this.field1967.length; var4++) {
                var3.method4132(this.field1967[var4], this.field1972[var4]);
            }
        }
        if (this.field1969 != null) {
            for (int var5 = 0; var5 < this.field1969.length; var5++) {
                var3.method4074(this.field1969[var5], this.field1974[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("hz.ar(B)Z")
    public boolean method3382() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1975[var2] != -1 && !Statics.field1968.method6265(this.field1975[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hz.ab(S)Ljw;")
    public class236 method3383() {
        class236[] var1 = new class236[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1975[var3] != -1) {
                var1[var2++] = class236.method4058(Statics.field1968, this.field1975[var3], 0);
            }
        }
        class236 var4 = new class236(var1, var2);
        if (this.field1967 != null) {
            for (int var5 = 0; var5 < this.field1967.length; var5++) {
                var4.method4132(this.field1967[var5], this.field1972[var5]);
            }
        }
        if (this.field1969 != null) {
            for (int var6 = 0; var6 < this.field1969.length; var6++) {
                var4.method4074(this.field1969[var6], this.field1974[var6]);
            }
        }
        return var4;
    }
}
