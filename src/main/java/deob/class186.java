package deob;

@ObfuscatedName("hu")
public class class186 extends class511 {

    @ObfuscatedName("hu.aj")
    public static class316 field1937 = new class316(64);

    @ObfuscatedName("hu.ai")
    public int field1938 = -1;

    @ObfuscatedName("hu.ay")
    public int[] field1945;

    @ObfuscatedName("hu.as")
    public short[] field1948;

    @ObfuscatedName("hu.ae")
    public short[] field1941;

    @ObfuscatedName("hu.am")
    public short[] field1942;

    @ObfuscatedName("hu.at")
    public short[] field1947;

    @ObfuscatedName("hu.au")
    public int[] field1944 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("hu.an")
    public boolean field1940 = false;

    @ObfuscatedName("ly.ap(Lpe;Lpe;B)V")
    public static void method5809(class392 arg0, class392 arg1) {
        Statics.field4651 = arg0;
        Statics.field4646 = arg1;
        Statics.field1939 = Statics.field4651.method7004(3);
    }

    @ObfuscatedName("nt.aw(II)Lhu;")
    public static class186 method6217(int arg0) {
        class186 var1 = (class186) field1937.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        } else if (Statics.field4651 == null) {
            return null;
        } else {
            byte[] var2 = Statics.field4651.method7009(3, arg0);
            class186 var3 = new class186();
            if (var2 != null) {
                var3.method3651(new class558(var2));
            }
            field1937.method5931(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("hu.ak(Lvl;I)V")
    public void method3651(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3652(arg0, var2);
        }
    }

    @ObfuscatedName("hu.aj(Lvl;II)V")
    public void method3652(class558 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1938 = arg0.method9258();
        } else if (arg1 == 2) {
            int var3 = arg0.method9258();
            this.field1945 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1945[var4] = arg0.method9260();
            }
        } else if (arg1 == 3) {
            this.field1940 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method9258();
            this.field1948 = new short[var5];
            this.field1941 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1948[var6] = (short) arg0.method9260();
                this.field1941[var6] = (short) arg0.method9260();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method9258();
            this.field1942 = new short[var7];
            this.field1947 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1942[var8] = (short) arg0.method9260();
                this.field1947[var8] = (short) arg0.method9260();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1944[arg1 - 60] = arg0.method9260();
        }
    }

    @ObfuscatedName("hu.ai(III)Z")
    public boolean method3653(int arg0, int arg1) {
        if (arg1 == 1) {
            return this.field1938 == arg0 + 7;
        } else {
            return this.field1938 == arg0;
        }
    }

    @ObfuscatedName("hu.ay(I)Z")
    public boolean method3676() {
        if (this.field1945 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1945.length; var2++) {
            if (!Statics.field4646.method7023(this.field1945[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hu.as(I)Ljj;")
    public class235 method3668() {
        if (this.field1945 == null) {
            return null;
        }
        class235[] var1 = new class235[this.field1945.length];
        for (int var2 = 0; var2 < this.field1945.length; var2++) {
            var1[var2] = class235.method4408(Statics.field4646, this.field1945[var2], 0);
        }
        class235 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class235(var1, var1.length);
        }
        if (this.field1948 != null) {
            for (int var4 = 0; var4 < this.field1948.length; var4++) {
                var3.method4393(this.field1948[var4], this.field1941[var4]);
            }
        }
        if (this.field1942 != null) {
            for (int var5 = 0; var5 < this.field1942.length; var5++) {
                var3.method4394(this.field1942[var5], this.field1947[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("hu.ae(I)Z")
    public boolean method3655() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1944[var2] != -1 && !Statics.field4646.method7023(this.field1944[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hu.am(B)Ljj;")
    public class235 method3656() {
        class235[] var1 = new class235[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1944[var3] != -1) {
                var1[var2++] = class235.method4408(Statics.field4646, this.field1944[var3], 0);
            }
        }
        class235 var4 = new class235(var1, var2);
        if (this.field1948 != null) {
            for (int var5 = 0; var5 < this.field1948.length; var5++) {
                var4.method4393(this.field1948[var5], this.field1941[var5]);
            }
        }
        if (this.field1942 != null) {
            for (int var6 = 0; var6 < this.field1942.length; var6++) {
                var4.method4394(this.field1942[var6], this.field1947[var6]);
            }
        }
        return var4;
    }
}
