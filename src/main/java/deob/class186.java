package deob;

@ObfuscatedName("hr")
public class class186 extends class504 {

    @ObfuscatedName("hr.am")
    public static class317 field1929 = new class317(64);

    @ObfuscatedName("hr.ax")
    public int field1930 = -1;

    @ObfuscatedName("hr.aq")
    public int[] field1931;

    @ObfuscatedName("hr.af")
    public short[] field1935;

    @ObfuscatedName("hr.at")
    public short[] field1928;

    @ObfuscatedName("hr.au")
    public short[] field1934;

    @ObfuscatedName("hr.ar")
    public short[] field1932;

    @ObfuscatedName("hr.al")
    public int[] field1936 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("hr.ad")
    public boolean field1937 = false;

    @ObfuscatedName("hr.ae(Lvf;I)V")
    public void method3504(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3503(arg0, var2);
        }
    }

    @ObfuscatedName("hr.ag(Lvf;IB)V")
    public void method3503(class551 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1930 = arg0.method8955();
        } else if (arg1 == 2) {
            int var3 = arg0.method8955();
            this.field1931 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1931[var4] = arg0.method9119();
            }
        } else if (arg1 == 3) {
            this.field1937 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method8955();
            this.field1935 = new short[var5];
            this.field1928 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1935[var6] = (short) arg0.method9119();
                this.field1928[var6] = (short) arg0.method9119();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8955();
            this.field1934 = new short[var7];
            this.field1932 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1934[var8] = (short) arg0.method9119();
                this.field1932[var8] = (short) arg0.method9119();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1936[arg1 - 60] = arg0.method9119();
        }
    }

    @ObfuscatedName("hr.am(III)Z")
    public boolean method3505(int arg0, int arg1) {
        if (arg1 == 1) {
            return this.field1930 == arg0 + 7;
        } else {
            return this.field1930 == arg0;
        }
    }

    @ObfuscatedName("hr.ax(I)Z")
    public boolean method3506() {
        if (this.field1931 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1931.length; var2++) {
            if (!Statics.field1927.method6784(this.field1931[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hr.aq(B)Ljv;")
    public class235 method3507() {
        if (this.field1931 == null) {
            return null;
        }
        class235[] var1 = new class235[this.field1931.length];
        for (int var2 = 0; var2 < this.field1931.length; var2++) {
            var1[var2] = class235.method4302(Statics.field1927, this.field1931[var2], 0);
        }
        class235 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class235(var1, var1.length);
        }
        if (this.field1935 != null) {
            for (int var4 = 0; var4 < this.field1935.length; var4++) {
                var3.method4254(this.field1935[var4], this.field1928[var4]);
            }
        }
        if (this.field1934 != null) {
            for (int var5 = 0; var5 < this.field1934.length; var5++) {
                var3.method4259(this.field1934[var5], this.field1932[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("hr.af(I)Z")
    public boolean method3508() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1936[var2] != -1 && !Statics.field1927.method6784(this.field1936[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hr.at(I)Ljv;")
    public class235 method3520() {
        class235[] var1 = new class235[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1936[var3] != -1) {
                var1[var2++] = class235.method4302(Statics.field1927, this.field1936[var3], 0);
            }
        }
        class235 var4 = new class235(var1, var2);
        if (this.field1935 != null) {
            for (int var5 = 0; var5 < this.field1935.length; var5++) {
                var4.method4254(this.field1935[var5], this.field1928[var5]);
            }
        }
        if (this.field1934 != null) {
            for (int var6 = 0; var6 < this.field1934.length; var6++) {
                var4.method4259(this.field1934[var6], this.field1932[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bj.au(I)V")
    public static void method692() {
        Statics.field1938 = null;
        Statics.field1927 = null;
        Statics.field1940 = 0;
    }
}
