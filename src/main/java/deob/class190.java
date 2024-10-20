package deob;

@ObfuscatedName("hz")
public class class190 extends class469 {

    @ObfuscatedName("hz.at")
    public static class288 field1988 = new class288(64);

    @ObfuscatedName("hz.ac")
    public int field1982 = -1;

    @ObfuscatedName("hz.ai")
    public int[] field1983;

    @ObfuscatedName("hz.az")
    public short[] field1984;

    @ObfuscatedName("hz.ap")
    public short[] field1985;

    @ObfuscatedName("hz.aa")
    public short[] field1986;

    @ObfuscatedName("hz.af")
    public short[] field1980;

    @ObfuscatedName("hz.ad")
    public int[] field1991 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("hz.aq")
    public boolean field1989 = false;

    @ObfuscatedName("go.au(II)Lhz;")
    public static class190 method3095(int arg0) {
        class190 var1 = (class190) field1988.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1978.method6128(3, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3334(new class515(var2));
        }
        field1988.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hz.ae(Ltm;B)V")
    public void method3334(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3333(arg0, var2);
        }
    }

    @ObfuscatedName("hz.ao(Ltm;II)V")
    public void method3333(class515 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1982 = arg0.method8300();
        } else if (arg1 == 2) {
            int var3 = arg0.method8300();
            this.field1983 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1983[var4] = arg0.method8448();
            }
        } else if (arg1 == 3) {
            this.field1989 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method8300();
            this.field1984 = new short[var5];
            this.field1985 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1984[var6] = (short) arg0.method8448();
                this.field1985[var6] = (short) arg0.method8448();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8300();
            this.field1986 = new short[var7];
            this.field1980 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1986[var8] = (short) arg0.method8448();
                this.field1980[var8] = (short) arg0.method8448();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1991[arg1 - 60] = arg0.method8448();
        }
    }

    @ObfuscatedName("hz.at(I)Z")
    public boolean method3331() {
        if (this.field1983 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1983.length; var2++) {
            if (!Statics.field1979.method6130(this.field1983[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hz.ac(B)Lic;")
    public class222 method3332() {
        if (this.field1983 == null) {
            return null;
        }
        class222[] var1 = new class222[this.field1983.length];
        for (int var2 = 0; var2 < this.field1983.length; var2++) {
            var1[var2] = class222.method4002(Statics.field1979, this.field1983[var2], 0);
        }
        class222 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class222(var1, var1.length);
        }
        if (this.field1984 != null) {
            for (int var4 = 0; var4 < this.field1984.length; var4++) {
                var3.method3996(this.field1984[var4], this.field1985[var4]);
            }
        }
        if (this.field1986 != null) {
            for (int var5 = 0; var5 < this.field1986.length; var5++) {
                var3.method3958(this.field1986[var5], this.field1980[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("hz.ai(I)Z")
    public boolean method3356() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1991[var2] != -1 && !Statics.field1979.method6130(this.field1991[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hz.az(I)Lic;")
    public class222 method3337() {
        class222[] var1 = new class222[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1991[var3] != -1) {
                var1[var2++] = class222.method4002(Statics.field1979, this.field1991[var3], 0);
            }
        }
        class222 var4 = new class222(var1, var2);
        if (this.field1984 != null) {
            for (int var5 = 0; var5 < this.field1984.length; var5++) {
                var4.method3996(this.field1984[var5], this.field1985[var5]);
            }
        }
        if (this.field1986 != null) {
            for (int var6 = 0; var6 < this.field1986.length; var6++) {
                var4.method3958(this.field1986[var6], this.field1980[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fw.ap(B)V")
    public static void method2986() {
        field1988.method5175();
    }
}
