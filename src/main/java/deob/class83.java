package deob;

import java.io.EOFException;

@ObfuscatedName("cw")
public class class83 {

    @ObfuscatedName("cw.q")
    public boolean[] field1199 = new boolean[this.field1194.length];

    @ObfuscatedName("cw.b")
    public boolean[] field1195;

    @ObfuscatedName("cw.f")
    public int[] field1194 = new int[Statics.field63.method4262(19)];

    @ObfuscatedName("cw.n")
    public String[] field1198 = new String[Statics.field63.method4262(15)];

    @ObfuscatedName("cw.h")
    public boolean field1196 = false;

    @ObfuscatedName("cw.x")
    public long field1200;

    public class83() {
        for (int var1 = 0; var1 < this.field1194.length; var1++) {
            class257 var2 = class257.method4775(var1);
            this.field1199[var1] = var2.field3281;
        }
        this.field1195 = new boolean[this.field1198.length];
        for (int var3 = 0; var3 < this.field1198.length; var3++) {
            class258 var4 = (class258) class258.field3286.method3707((long) var3);
            class258 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field3284.method4250(15, var3);
                class258 var7 = new class258();
                if (var6 != null) {
                    var7.method4469(new class183(var6));
                }
                class258.field3286.method3712(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field1195[var3] = var5.field3285;
        }
        for (int var9 = 0; var9 < this.field1194.length; var9++) {
            this.field1194[var9] = -1;
        }
        this.method1815();
    }

    @ObfuscatedName("cw.w(III)V")
    public void method1812(int arg0, int arg1) {
        this.field1194[arg0] = arg1;
        if (this.field1199[arg0]) {
            this.field1196 = true;
        }
    }

    @ObfuscatedName("cw.m(II)I")
    public int method1784(int arg0) {
        return this.field1194[arg0];
    }

    @ObfuscatedName("cw.q(ILjava/lang/String;B)V")
    public void method1786(int arg0, String arg1) {
        this.field1198[arg0] = arg1;
        if (this.field1195[arg0]) {
            this.field1196 = true;
        }
    }

    @ObfuscatedName("cw.x(II)Ljava/lang/String;")
    public String method1787(int arg0) {
        return this.field1198[arg0];
    }

    @ObfuscatedName("cw.j(B)V")
    public void method1822() {
        for (int var1 = 0; var1 < this.field1194.length; var1++) {
            if (!this.field1199[var1]) {
                this.field1194[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1198.length; var2++) {
            if (!this.field1195[var2]) {
                this.field1198[var2] = null;
            }
        }
    }

    @ObfuscatedName("cw.a(ZI)Ldw;")
    public class111 method1789(boolean arg0) {
        return class156.method4229("2", Statics.field2266.field3161, arg0);
    }

    @ObfuscatedName("cw.l(I)V")
    public void method1790() {
        class111 var1 = this.method1789(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1194.length; var4++) {
                if (this.field1199[var4] && this.field1194[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1198.length; var6++) {
                if (this.field1195[var6] && this.field1198[var6] != null) {
                    var2 += 2 + class183.method124(this.field1198[var6]);
                    var5++;
                }
            }
            class183 var7 = new class183(var2);
            var7.method3246(1);
            var7.method3296(var3);
            for (int var8 = 0; var8 < this.field1194.length; var8++) {
                if (this.field1199[var8] && this.field1194[var8] != -1) {
                    var7.method3296(var8);
                    var7.method3249(this.field1194[var8]);
                }
            }
            var7.method3296(var5);
            for (int var9 = 0; var9 < this.field1198.length; var9++) {
                if (this.field1195[var9] && this.field1198[var9] != null) {
                    var7.method3296(var9);
                    var7.method3243(this.field1198[var9]);
                }
            }
            var1.method2343(var7.field2366, 0, var7.field2360);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2351();
            } catch (Exception var20) {
            }
        }
        this.field1196 = false;
        this.field1200 = class185.method3151();
    }

    @ObfuscatedName("cw.d(I)V")
    public void method1815() {
        class111 var1 = this.method1789(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method2361()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2347(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class183 var5 = new class183(var2);
                if (var5.field2366.length - var5.field2360 < 1) {
                    return;
                }
                int var7 = var5.method3436();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method3268();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3268();
                        int var12 = var5.method3267();
                        if (this.field1199[var11]) {
                            this.field1194[var11] = var12;
                        }
                    }
                    int var13 = var5.method3268();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method3268();
                        String var16 = var5.method3271();
                        if (this.field1195[var15]) {
                            this.field1198[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method2351();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1196 = false;
    }

    @ObfuscatedName("cw.s(I)V")
    public void method1792() {
        if (this.field1196 && this.field1200 < class185.method3151() - 60000L) {
            this.method1790();
        }
    }

    @ObfuscatedName("cw.p(B)Z")
    public boolean method1785() {
        return this.field1196;
    }
}
