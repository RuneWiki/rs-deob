package deob;

import java.io.EOFException;

@ObfuscatedName("a")
public class class20 {

    @ObfuscatedName("a.f")
    public boolean[] field271 = new boolean[this.field266.length];

    @ObfuscatedName("a.c")
    public boolean[] field265;

    @ObfuscatedName("a.v")
    public int[] field266 = new int[Statics.field201.method3082(19)];

    @ObfuscatedName("a.j")
    public String[] field270 = new String[Statics.field201.method3082(15)];

    @ObfuscatedName("a.m")
    public boolean field268 = false;

    @ObfuscatedName("a.y")
    public long field272;

    public class20() {
        for (int var1 = 0; var1 < this.field266.length; var1++) {
            class48 var2 = (class48) class48.field1067.method3535((long) var1);
            class48 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1072.method3097(19, var1);
                class48 var5 = new class48();
                if (var4 != null) {
                    var5.method944(new class123(var4));
                }
                class48.field1067.method3537(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field271[var1] = var3.field1066;
        }
        this.field265 = new boolean[this.field270.length];
        for (int var7 = 0; var7 < this.field270.length; var7++) {
            class54 var8 = class54.method720(var7);
            this.field265[var7] = var8.field1155;
        }
        for (int var9 = 0; var9 < this.field266.length; var9++) {
            this.field266[var9] = -1;
        }
        this.method187();
    }

    @ObfuscatedName("a.k(III)V")
    public void method181(int arg0, int arg1) {
        this.field266[arg0] = arg1;
        if (this.field271[arg0]) {
            this.field268 = true;
        }
    }

    @ObfuscatedName("a.q(II)I")
    public int method190(int arg0) {
        return this.field266[arg0];
    }

    @ObfuscatedName("a.f(ILjava/lang/String;B)V")
    public void method183(int arg0, String arg1) {
        this.field270[arg0] = arg1;
        if (this.field265[arg0]) {
            this.field268 = true;
        }
    }

    @ObfuscatedName("a.c(II)Ljava/lang/String;")
    public String method184(int arg0) {
        return this.field270[arg0];
    }

    @ObfuscatedName("a.v(S)V")
    public void method196() {
        for (int var1 = 0; var1 < this.field266.length; var1++) {
            if (!this.field271[var1]) {
                this.field266[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field270.length; var2++) {
            if (!this.field265[var2]) {
                this.field270[var2] = null;
            }
        }
    }

    @ObfuscatedName("a.j(ZS)Lhf;")
    public class231 method182(boolean arg0) {
        return class153.method2363("2", Statics.field281.field2329, arg0);
    }

    @ObfuscatedName("a.m(B)V")
    public void method186() {
        class231 var1 = this.method182(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field266.length; var4++) {
                if (this.field271[var4] && this.field266[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field270.length; var6++) {
                if (this.field265[var6] && this.field270[var6] != null) {
                    var2 += 2 + class123.method667(this.field270[var6]);
                    var5++;
                }
            }
            class123 var7 = new class123(var2);
            var7.method2412(1);
            var7.method2494(var3);
            for (int var8 = 0; var8 < this.field266.length; var8++) {
                if (this.field271[var8] && this.field266[var8] != -1) {
                    var7.method2494(var8);
                    var7.method2415(this.field266[var8]);
                }
            }
            var7.method2494(var5);
            for (int var9 = 0; var9 < this.field270.length; var9++) {
                if (this.field265[var9] && this.field270[var9] != null) {
                    var7.method2494(var9);
                    var7.method2418(this.field270[var9]);
                }
            }
            var1.method3890(var7.field2054, 0, var7.field2060);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3891();
            } catch (Exception var20) {
            }
        }
        this.field268 = false;
        this.field272 = class119.method3068();
    }

    @ObfuscatedName("a.y(I)V")
    public void method187() {
        class231 var1 = this.method182(false);
        try {
            byte[] var2 = new byte[(int) var1.method3892()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method3888(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class123 var5 = new class123(var2);
            if (var5.field2054.length - var5.field2060 < 1) {
                return;
            }
            int var7 = var5.method2427();
            if (var7 < 0 || var7 > 1) {
                return;
            }
            int var9 = var5.method2547();
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method2547();
                int var12 = var5.method2432();
                if (this.field271[var11]) {
                    this.field266[var11] = var12;
                }
            }
            int var13 = var5.method2547();
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = var5.method2547();
                String var16 = var5.method2435();
                if (this.field265[var15]) {
                    this.field270[var15] = var16;
                }
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method3891();
            } catch (Exception var29) {
            }
        }
        this.field268 = false;
    }

    @ObfuscatedName("a.u(I)V")
    public void method202() {
        if (this.field268 && this.field272 < class119.method3068() - 60000L) {
            this.method186();
        }
    }

    @ObfuscatedName("a.h(B)Z")
    public boolean method189() {
        return this.field268;
    }
}
