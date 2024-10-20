package deob;

import java.io.EOFException;

@ObfuscatedName("cp")
public class class98 {

    @ObfuscatedName("cp.f")
    public boolean[] field1505 = new boolean[this.field1511.length];

    @ObfuscatedName("cp.m")
    public boolean[] field1506;

    @ObfuscatedName("cp.h")
    public int[] field1511 = new int[Statics.field1527.method3858(19)];

    @ObfuscatedName("cp.t")
    public String[] field1508 = new String[Statics.field1527.method3858(15)];

    @ObfuscatedName("cp.p")
    public boolean field1509 = false;

    @ObfuscatedName("cp.d")
    public long field1510;

    public class98() {
        for (int var1 = 0; var1 < this.field1511.length; var1++) {
            class247 var2 = (class247) class247.field3326.method3319((long) var1);
            class247 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3331.method3840(19, var1);
                class247 var5 = new class247();
                if (var4 != null) {
                    var5.method4030(new class177(var4));
                }
                class247.field3326.method3315(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1505[var1] = var3.field3328;
        }
        this.field1506 = new boolean[this.field1508.length];
        for (int var7 = 0; var7 < this.field1508.length; var7++) {
            class248 var8 = class248.method162(var7);
            this.field1506[var7] = var8.field3334;
        }
        for (int var9 = 0; var9 < this.field1511.length; var9++) {
            this.field1511[var9] = -1;
        }
        this.method1681();
    }

    @ObfuscatedName("cp.s(IIB)V")
    public void method1711(int arg0, int arg1) {
        this.field1511[arg0] = arg1;
        if (this.field1505[arg0]) {
            this.field1509 = true;
        }
    }

    @ObfuscatedName("cp.c(II)I")
    public int method1675(int arg0) {
        return this.field1511[arg0];
    }

    @ObfuscatedName("cp.f(ILjava/lang/String;I)V")
    public void method1707(int arg0, String arg1) {
        this.field1508[arg0] = arg1;
        if (this.field1506[arg0]) {
            this.field1509 = true;
        }
    }

    @ObfuscatedName("cp.m(II)Ljava/lang/String;")
    public String method1687(int arg0) {
        return this.field1508[arg0];
    }

    @ObfuscatedName("cp.h(I)V")
    public void method1690() {
        for (int var1 = 0; var1 < this.field1511.length; var1++) {
            if (!this.field1505[var1]) {
                this.field1511[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1508.length; var2++) {
            if (!this.field1506[var2]) {
                this.field1508[var2] = null;
            }
        }
    }

    @ObfuscatedName("cp.t(ZI)Ldv;")
    public class125 method1679(boolean arg0) {
        return class157.method46("2", Statics.field3687.field3216, arg0);
    }

    @ObfuscatedName("cp.p(I)V")
    public void method1680() {
        class125 var1 = this.method1679(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1511.length; var4++) {
                if (this.field1505[var4] && this.field1511[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1508.length; var6++) {
                if (this.field1506[var6] && this.field1508[var6] != null) {
                    var2 += 2 + class177.method2707(this.field1508[var6]);
                    var5++;
                }
            }
            class177 var7 = new class177(var2);
            var7.method3129(1);
            var7.method2951(var3);
            for (int var8 = 0; var8 < this.field1511.length; var8++) {
                if (this.field1505[var8] && this.field1511[var8] != -1) {
                    var7.method2951(var8);
                    var7.method2953(this.field1511[var8]);
                }
            }
            var7.method2951(var5);
            for (int var9 = 0; var9 < this.field1508.length; var9++) {
                if (this.field1506[var9] && this.field1508[var9] != null) {
                    var7.method2951(var9);
                    var7.method2956(this.field1508[var9]);
                }
            }
            var1.method2208(var7.field2403, 0, var7.field2402);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2184();
            } catch (Exception var20) {
            }
        }
        this.field1509 = false;
        this.field1510 = class179.method3585();
    }

    @ObfuscatedName("cp.d(I)V")
    public void method1681() {
        class125 var1 = this.method1679(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method2188()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2198(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class177 var5 = new class177(var2);
                if (var5.field2403.length - var5.field2402 < 1) {
                    return;
                }
                int var7 = var5.method2965();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2967();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2967();
                        int var12 = var5.method2970();
                        if (this.field1505[var11]) {
                            this.field1511[var11] = var12;
                        }
                    }
                    int var13 = var5.method2967();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2967();
                        String var16 = var5.method2973();
                        if (this.field1506[var15]) {
                            this.field1508[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method2184();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1509 = false;
    }

    @ObfuscatedName("cp.n(B)V")
    public void method1708() {
        if (this.field1509 && this.field1510 < class179.method3585() - 60000L) {
            this.method1680();
        }
    }

    @ObfuscatedName("cp.z(B)Z")
    public boolean method1678() {
        return this.field1509;
    }
}
