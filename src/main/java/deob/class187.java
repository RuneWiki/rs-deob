package deob;

@ObfuscatedName("hv")
public class class187 extends class439 {

    @ObfuscatedName("hv.ab")
    public static class276 field1930 = new class276(64);

    @ObfuscatedName("hv.an")
    public int field1934 = -1;

    @ObfuscatedName("hv.ao")
    public int[] field1932;

    @ObfuscatedName("hv.av")
    public short[] field1928;

    @ObfuscatedName("hv.aq")
    public short[] field1929;

    @ObfuscatedName("hv.ap")
    public short[] field1936;

    @ObfuscatedName("hv.ar")
    public short[] field1940;

    @ObfuscatedName("hv.ak")
    public int[] field1937 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("hv.ax")
    public boolean field1938 = false;

    @ObfuscatedName("pn.aj(IB)Lhv;")
    public static class187 method6840(int arg0) {
        class187 var1 = (class187) field1930.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4235.method5860(3, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3285(new class478(var2));
        }
        field1930.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hv.al(Lsy;I)V")
    public void method3285(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3283(arg0, var2);
        }
    }

    @ObfuscatedName("hv.ac(Lsy;II)V")
    public void method3283(class478 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1934 = arg0.method7909();
        } else if (arg1 == 2) {
            int var3 = arg0.method7909();
            this.field1932 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1932[var4] = arg0.method7905();
            }
        } else if (arg1 == 3) {
            this.field1938 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method7909();
            this.field1928 = new short[var5];
            this.field1929 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1928[var6] = (short) arg0.method7905();
                this.field1929[var6] = (short) arg0.method7905();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7909();
            this.field1936 = new short[var7];
            this.field1940 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1936[var8] = (short) arg0.method7905();
                this.field1940[var8] = (short) arg0.method7905();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1937[arg1 - 60] = arg0.method7905();
        }
    }

    @ObfuscatedName("hv.ab(I)Z")
    public boolean method3282() {
        if (this.field1932 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1932.length; var2++) {
            if (!Statics.field1931.method5862(this.field1932[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hv.an(I)Liu;")
    public class215 method3284() {
        if (this.field1932 == null) {
            return null;
        }
        class215[] var1 = new class215[this.field1932.length];
        for (int var2 = 0; var2 < this.field1932.length; var2++) {
            var1[var2] = class215.method3812(Statics.field1931, this.field1932[var2], 0);
        }
        class215 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class215(var1, var1.length);
        }
        if (this.field1928 != null) {
            for (int var4 = 0; var4 < this.field1928.length; var4++) {
                var3.method3817(this.field1928[var4], this.field1929[var4]);
            }
        }
        if (this.field1936 != null) {
            for (int var5 = 0; var5 < this.field1936.length; var5++) {
                var3.method3826(this.field1936[var5], this.field1940[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("hv.ao(I)Z")
    public boolean method3294() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1937[var2] != -1 && !Statics.field1931.method5862(this.field1937[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hv.av(I)Liu;")
    public class215 method3312() {
        class215[] var1 = new class215[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1937[var3] != -1) {
                var1[var2++] = class215.method3812(Statics.field1931, this.field1937[var3], 0);
            }
        }
        class215 var4 = new class215(var1, var2);
        if (this.field1928 != null) {
            for (int var5 = 0; var5 < this.field1928.length; var5++) {
                var4.method3817(this.field1928[var5], this.field1929[var5]);
            }
        }
        if (this.field1936 != null) {
            for (int var6 = 0; var6 < this.field1936.length; var6++) {
                var4.method3826(this.field1936[var6], this.field1940[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bv.aq(I)V")
    public static void method413() {
        field1930.method4930();
    }
}
